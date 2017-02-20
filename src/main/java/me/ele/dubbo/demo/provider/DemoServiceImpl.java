package me.ele.dubbo.demo.provider;

import me.ele.dubbo.demo.DemoService;

/**
 * Created by onaple on 2017/2/20.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String message){
        return "dubbo: Hello " + message;
    }
}
