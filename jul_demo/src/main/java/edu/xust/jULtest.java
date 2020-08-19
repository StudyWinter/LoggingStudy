package edu.xust;
import org.junit.Test;

import java.io.InputStream;
import java.util.logging.*;

public class jULtest {

    //快速入门测试
    @Test
    public void test01 ()throws  Exception{
        //1、获取日志记录器对象
        Logger logger = Logger.getLogger("edu.xust.jULtest");   //类的全限定名称

        //2、日志记录的输出过程
        logger.info("Hello JUL");

        //通用方法进行日志记录
        logger.log(Level.INFO,"info msg");

        //通过占位符的方式，输出变量的值
        String name= "zhangsan";
        Integer age = 23;
        logger.log(Level.INFO,"用户信息:{0},{1}",new Object[]{name,age});
    }

    //日志级别
    @Test
    public void test02()throws Exception{
        //1、获取日志记录器对象
        Logger logger = Logger.getLogger("edu.xust.jULtest");

        //2、日志记录的输出
        logger.severe("severe");       //最高级别
        logger.warning("warning");
        logger.info("info");           //jul默认日志级别，比info高的输出，比info低的过滤掉
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

    //自定义日志级别
    @Test
    public void test03()throws Exception{
        //1、获取日志记录器对象
        Logger logger = Logger.getLogger("edu.xust.jULtest");

        //5、关闭系统默认配置
        logger.setUseParentHandlers(false);

        //2、自定义配置日志级别
        //创建ConsoleHandler对象  【控制台输出】
        ConsoleHandler consoleHandler = new ConsoleHandler();

        //3、创建简单格式转换对象
        SimpleFormatter formatter = new SimpleFormatter();

        //4、进行关联
        consoleHandler.setFormatter(formatter);
        logger.addHandler(consoleHandler);


        //6、配置日志的具体级别
        logger.setLevel(Level.ALL);            //输出所有

        //7、控制具体处理器的日志级别
        consoleHandler.setLevel(Level.ALL);

        //8、创建FileHandler,文件输出
        FileHandler handler = new FileHandler("E:/code/maven/jul_demo/logs/jul.log");   //需要自己新建目录


        //9、进行关联
        //格式转换输出
        handler.setFormatter(formatter);
        logger.addHandler(handler);


        //日志记录的输出
        logger.severe("severe");       //最高级别
        logger.warning("warning");
        logger.info("info");           //jul默认日志级别，比info高的输出，比info低的过滤掉
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }



    //Logger对象的父子关系
    @Test
    public void test04()throws Exception{

        //获取日志记录器对象
        Logger logger1 = Logger.getLogger("edu.xust");
        Logger logger2 = Logger.getLogger("edu");       //logger1是logger2的子对象

        //测试
        System.out.println(logger1.getParent() == logger2);   //true

        //测试logger2 的父类   //LogManager$RootLogger是所有日志记录器的顶级父元素，名称是空字符串
        System.out.println("logger2 Parent: "+logger2.getParent() +" name:"+logger2.getParent().getName());


        /**
         * 以下是设置logger2的日志级别，logger1继承logger2
         */
        //关闭默认配置
        logger2.setUseParentHandlers(false);
        //2、自定义配置日志级别
        //创建ConsoleHandler对象  【控制台输出】
        ConsoleHandler consoleHandler = new ConsoleHandler();
        //3、创建简单格式转换对象
        SimpleFormatter formatter = new SimpleFormatter();
        //4、进行关联
        consoleHandler.setFormatter(formatter);
        logger2.addHandler(consoleHandler);
        //6、配置日志的具体级别
        logger2.setLevel(Level.ALL);            //输出所有
        //7、控制具体处理器的日志级别
        consoleHandler.setLevel(Level.ALL);


        //日志记录的输出   alt+鼠标左键拖动
        logger1.severe("severe");       //最高级别
        logger1.warning("warning");
        logger1.info("info");           //jul默认日志级别，比info高的输出，比info低的过滤掉
        logger1.config("config");
        logger1.fine("fine");
        logger1.finer("finer");
        logger1.finest("finest");

    }

    //加载自定义配置文件
    @Test
    public void test05() throws Exception{

        //1、读取配置文件，通过类加载器
        InputStream ins = jULtest.class.getClassLoader().getResourceAsStream("logging.properties");

        //2、创建logManager对象
        LogManager logManager = LogManager.getLogManager();

        //3、通过logManager加载配置文件
        logManager.readConfiguration(ins);


        //4、创建日志记录器
        Logger logger = Logger.getLogger("edu.xust.jULtest");

        //日志记录的输出   alt+鼠标左键拖动
        logger.severe("severe");       //最高级别
        logger.warning("warning");
        logger.info("info");           //jul默认日志级别，比info高的输出，比info低的过滤掉
        logger.config("config");
        logger.fine("fine");
        logger.finer("finer");
        logger.finest("finest");
    }

}

