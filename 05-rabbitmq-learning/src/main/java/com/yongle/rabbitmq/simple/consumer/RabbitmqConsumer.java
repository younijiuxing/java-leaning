package com.yongle.rabbitmq.simple.consumer;

import com.rabbitmq.client.*;
import com.yongle.rabbitmq.simple.utils.ConnectionUtils;

import java.io.IOException;

/**
 * @author leyangjie
 * @date 2021/1/15 17:25
 * @describe 消费者
 */
public class RabbitmqConsumer {
    public static void main(String[] args) throws Exception {
        // 获取连接
        Connection connection = ConnectionUtils.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        channel.basicConsume(ConnectionUtils.QUEUE_NAME, true, new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                //交换机
                String exchange = envelope.getExchange();
                //消息id，mq在channel中用来标识消息的id，可用于确认消息已接收
                long deliveryTag = envelope.getDeliveryTag();
                // body 即消息体
                String msg = new String(body, "utf-8");
                System.out.println(" [x] received : " + msg + "!");
            }
        });
    }
}
