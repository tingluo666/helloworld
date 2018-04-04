package com.tingluo.dubbo.provider;

import com.tingluo.dubbo.DemoService;

/**
 * Created by wanbo on 2018/4/4.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello" + name;
    }
}
