package edu.xust;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * 需求是最开始使用log4j日志记录，随着业务的复杂，不想再使用log4j了，想使用新的日志技术
 * 需要把log4j的依赖注释掉，使用logback和slf4j依赖。log4j的代码就会报错，又不想改代码，使用桥接器
 *
 */

public class Log4jTest {
    //定义log4j的日志记录器   org.apache.log4j.Logger;
    public static final Logger LOGGER = Logger.getLogger(Log4jTest.class);


    //测试桥接器
    @Test
    public void test()throws Exception{
        //日志消息的输出
        LOGGER.info("Hello Log4j");
        LOGGER.fatal("fatal logger1");     //严重的错误，造成系统奔溃，并终止程序
        LOGGER.error("error logger1");     //错误信息，不会影响系统运行
        LOGGER.warn("warn logger1");       //警告信息，可能会发生问题
        LOGGER.info("info logger1");       //运行信息，数据库的连接，网络的连接等等
        LOGGER.debug("debug logger1");     //调试信息，一般在开发中使用，记录程序变量参数传递信息等等  【默认日志】
        LOGGER.trace("trace logger1");     //追踪信息，记录程序所有的流程信息


    }

}