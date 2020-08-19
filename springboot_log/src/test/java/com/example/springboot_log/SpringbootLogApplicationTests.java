package com.example.springboot_log;

import org.apache.logging.log4j.LogManager;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogApplicationTests {

    //声明日志记录器     org.slf4j.Logger;
    public static final Logger LOGGER = LoggerFactory.getLogger(SpringbootLogApplicationTests.class);

    @Test
    void contextLoads() {

        //输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");      //默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");

        //log4j2日志实现   使用桥接器切换为slf4j的门面和logback的日志实现
        org.apache.logging.log4j.Logger logger = LogManager.getLogger(SpringbootLogApplicationTests.class);
        logger.info("log4j2的info");      //输出日志消息格式和上面一样，说明桥接成功



    }

}
