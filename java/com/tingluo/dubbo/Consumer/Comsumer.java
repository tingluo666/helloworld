package com.tingluo.dubbo.Consumer;

import com.tingluo.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wanbo on 2018/4/4.
 */
public class Comsumer {
    public static void main(String[] args) throws  Exception{
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("tingluo");
        System.out.println(hello);
    }
}
