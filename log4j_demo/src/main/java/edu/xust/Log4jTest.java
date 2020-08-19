package edu.xust;


import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.helpers.LogLog;
import org.junit.Test;

public class Log4jTest {


    //快速入门
    @Test
    public void test01()throws Exception{
        //5、开启log4j内置日志记录
       // LogLog.setInternalDebugging(true);


        //3、初始化配置信息，在入门案例中暂不使用配置文件
        //BasicConfigurator.configure();


        //1、获取日志记录器对象   import org.apache.log4j.Logger;
        Logger logger = Logger.getLogger(Log4jTest.class);

        //for (int i = 0; i < 1000; i++) {
            //2、日志记录输出
            logger.info("Hello Log4j");

            //4、日志级别
            logger.fatal("fatal");     //严重的错误，造成系统奔溃，并终止程序

            logger.error("error");     //错误信息，不会影响系统运行
            logger.warn("warn");       //警告信息，可能会发生问题
            logger.info("info");       //运行信息，数据库的连接，网络的连接等等
            logger.debug("debug");     //调试信息，一般在开发中使用，记录程序变量参数传递信息等等  【默认日志】

            logger.trace("trace");     //追踪信息，记录程序所有的流程信息
       //}


        //再创建日志记录器
        Logger logger1 = Logger.getLogger(Logger.class);     //用的包是org.apache，而logger类是apache的
        logger1.fatal("fatal logger1");     //严重的错误，造成系统奔溃，并终止程序
        logger1.error("error logger1");     //错误信息，不会影响系统运行
        logger1.warn("warn logger1");       //警告信息，可能会发生问题
        logger1.info("info logger1");       //运行信息，数据库的连接，网络的连接等等
        logger1.debug("debug logger1");     //调试信息，一般在开发中使用，记录程序变量参数传递信息等等  【默认日志】
        logger1.trace("trace logger1");     //追踪信息，记录程序所有的流程信息

    }

}
