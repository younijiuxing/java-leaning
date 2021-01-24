package com.yongle.annotation_02;

import org.springframework.context.annotation.Bean;

/**
 * @author leyangjie
 * @date 2020/12/11 13:47
 * @describe
 */
public class MainConfig {


    @Bean
    public Person person() {
        return new Person();
    }
}
