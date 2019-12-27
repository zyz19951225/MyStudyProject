package com.example.activemq_project.consumer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class QueueConsumer {
    public static void main(String[] args) {
        try {

            // 创建连接工厂
            ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://127.0.0.1:61616");

            // 创建连接
            Connection connection = connectionFactory.createConnection();
            //开启连接
            connection.start();

            // 创建会话(第一个参数：关闭事务；第二个参数：使用消息自动应答模式)
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // 创建目的地 (主题 or 队列)
            Destination destination = session.createQueue("myQueue");

            // 创建消息消费者
            MessageConsumer consumer = session.createConsumer(destination);

            System.out.println("服务端开始监听消息。。。");

          //   同步接收消息(1000，即1秒，为消息接收的超时时间，设为0则不超时)
            Message message = consumer.receive(1000);

            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                System.out.println("接收到的text消息为: " + text);
            }else {
                System.out.println("接收到的message消息为: " + message);
            }
            //关闭连接(如果使用异步方式，则不需要关闭连接，因为要一直监听)
             consumer.close();
              session.close();
            connection.close();

         //   异步接收消息消息(需要服务端一直开启)
//            while(true){
//                consumer.setMessageListener(message -> {
//                if (message instanceof TextMessage) {
//                    TextMessage textMessage = (TextMessage) message;
//                    String text = null;
//                    try {
//                        text = textMessage.getText();
//                    } catch (JMSException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("接收到的消息为: " + text);
//                } else {
//                    System.out.println("消息为空");
//                }
//            });
//            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
