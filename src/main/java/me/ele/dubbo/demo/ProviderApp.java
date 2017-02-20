package me.ele.dubbo.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by onaple on 2017/2/20.
 */
public class ProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo_provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}

