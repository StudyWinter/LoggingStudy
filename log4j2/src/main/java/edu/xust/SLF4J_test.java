package edu.xust;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J_test {

    //定义成静态常量【日志记录器】
    public static final Logger LOGGER = LoggerFactory.getLogger(SLF4J_test.class);

    //快速入门
    @Test
    public void test01()throws Exception{
        //1、日志的输出
        LOGGER.error("error");
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");


    }

}
