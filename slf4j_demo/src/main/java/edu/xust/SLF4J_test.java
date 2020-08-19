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
        LOGGER.info("info");          //默认级别
        LOGGER.debug("debug");
        LOGGER.trace("trace");


        //2、使用占位符输出日志信息
        String name = "xust";
        Integer age = 62;
        LOGGER.info("用户:{},{}",name,age);


        //3、将系统的异常信息输出  ctrl+alt+t

        try {
            int i = 1 / 0;
        } catch (Exception e) {
            //e.printStackTrace();
            LOGGER.error("出现异常:",e);
        }


    }

}
