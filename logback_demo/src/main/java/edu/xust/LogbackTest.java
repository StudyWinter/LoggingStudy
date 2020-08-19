package edu.xust;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {

    //1、定义日志记录器对象
    public static final Logger LOGGER = LoggerFactory.getLogger(LogbackTest.class);

    //快速入门
    @Test
    public void test01()throws Exception{

        for (int i = 0; i < 100000; i++) {
            //2、日志输出
            LOGGER.error("error");
            LOGGER.warn("warn");
            LOGGER.info("info");
            LOGGER.debug("debug");     //默认级别
            LOGGER.trace("trace");
        }


    }
}
