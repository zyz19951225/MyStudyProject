package com.example.activemq_project.producer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class QueueProducer {
    public static void main(String[] args) {
        try {
            // 创建连接工厂
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");

            // 创建连接
            Connection connection = connectionFactory.createConnection();
            connection.start();

            // 创建会话(设置关闭事务，自动应答模式)
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // 创建目的地 (主题 or 队列)
            Destination destination = session.createQueue("myQueue");

            // 创建消息生产者
            MessageProducer producer = session.createProducer(destination);

            // 不持久化消息(当MQ关闭后，消息将丢失)
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            // 创建要发送的消息
            String text = "Hello world!";
            TextMessage message = session.createTextMessage(text);

            // 发送消息
            System.out.println("客户端发送消息...");
            producer.send(message);

            // 关闭连接
            session.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
