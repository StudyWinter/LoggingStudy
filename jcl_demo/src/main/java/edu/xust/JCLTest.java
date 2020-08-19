package edu.xust;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JCLTest {


    //入门代码
    @Test
    public  void test01() throws Exception{
        //1、获取log日志记录器对象  org.apache.commons.logging.Log;
        Log log = LogFactory.getLog(JCLTest.class);

        //2、日志记录的输出
        log.info("Hello JCL");           //默认调用JDK14,加入log4j依赖和配置文件后，就调用log4j
        // 日志记录输出        
        log.fatal("fatal");
        log.error("error");
        log.warn("warn");
        log.info("info");      //默认级别
        log.debug("debug");

    }

}
