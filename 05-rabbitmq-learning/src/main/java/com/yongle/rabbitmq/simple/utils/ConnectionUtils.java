package com.yongle.rabbitmq.simple.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * @author leyangjie
 * @date 2021/1/15 17:11
 * @describe
 */
public class ConnectionUtils {
    public static final String QUEUE_NAME = "queue_test";

    public static Connection getConnection() throws Exception {
        // 定义连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("test");
        connectionFactory.setPassword("test");
        connectionFactory.setVirtualHost("vh_test");
        return connectionFactory.newConnection();
    }
}
