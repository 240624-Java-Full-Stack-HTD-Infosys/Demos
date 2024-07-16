package com.revature.springbeans.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service
public class MyService implements InitializingBean, DisposableBean {
    private FakeRepository fakeRepository;

    @Autowired
    public MyService(FakeRepository fakeRepository) {
        System.out.println("Service Constructor...");
        this.fakeRepository = fakeRepository;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Service bean destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service bean init()");
    }
}
