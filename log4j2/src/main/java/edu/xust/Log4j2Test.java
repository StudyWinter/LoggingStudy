package edu.xust;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class Log4j2Test {
    //1、定义日志记录器对象
    public static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);

    //快速入门
    @Test
    public void test()throws Exception{
        //2、日志消息的输出
        LOGGER.fatal("fatal");
        LOGGER.error("error");      //默认级别
        LOGGER.warn("warn");
        LOGGER.info("info");
        LOGGER.debug("debug");
        LOGGER.trace("trace");
    }
}
