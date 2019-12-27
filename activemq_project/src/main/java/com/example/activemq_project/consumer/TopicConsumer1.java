package com.example.activemq_project.consumer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class TopicConsumer1 {
    public static void main(String[] args) {
        try {

            // 创建连接工厂
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");

            // 创建连接
            Connection connection = connectionFactory.createConnection();
            connection.start();

            // 创建会话
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // 创建目的地 (主题 or 队列)
            Destination destination = session.createTopic("myQueue");

            // 创建消息消费者
            MessageConsumer consumer = session.createConsumer(destination);

            System.out.println("服务端开始监听消息。。。");

            while(true){
                // 等待消息到来(1000，即1秒，为消息接收的超时时间，设为0则不超时)
                Message message = consumer.receive(1000);

                if (message instanceof TextMessage) {
                    TextMessage textMessage = (TextMessage) message;
                    String text = textMessage.getText();
                    System.out.println("接收到的text消息为: " + text);
                }else {
                    System.out.println("接收到的message消息为: " + message);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
