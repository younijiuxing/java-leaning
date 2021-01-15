package com.yongle.rabbitmq.simple.send;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.yongle.rabbitmq.simple.utils.ConnectionUtils;

/**
 * @author leyangjie
 * @date 2021/1/15 17:16
 * @describe 生产者
 */
public class RabbitProduct {
    public static void main(String[] args) throws Exception {
        // 获取连接
        Connection connection = ConnectionUtils.getConnection();
        // 创建信道
        Channel channel = connection.createChannel();

        /**
         * 参数明细
         * 1、queue 队列名称
         * 2、durable 是否持久化，如果持久化，mq重启后队列还在
         * 3、exclusive 是否独占连接，队列只允许在该连接中访问，如果connection连接关闭队列则自动删除,如果将此参数设置true可用于临时队列的创建
         * 4、autoDelete 自动删除，队列不再使用时是否自动删除此队列，如果将此参数和exclusive参数设置为true就可以实现临时队列（队列不用了就自动删除）
         * 5、arguments 参数，可以设置一个队列的扩展参数，比如：可设置存活时间
         */
        channel.queueDeclare(ConnectionUtils.QUEUE_NAME, true, false, false, null);
        // 声明消息
        String message = "hello rabbitmq";
        while (true) {
            channel.basicPublish("", ConnectionUtils.QUEUE_NAME, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }


        //关闭通道和连接(资源关闭最好用try-catch-finally语句处理)
//        channel.close();
//        connection.close();
    }
}
