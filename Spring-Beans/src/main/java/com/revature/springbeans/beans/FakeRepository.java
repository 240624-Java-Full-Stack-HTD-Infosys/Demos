package com.revature.springbeans.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")//prototypes are "lazy"
@Component //we are pretending to use the @Repository annotation, but we aren't actually because we don't have a database to connect to.
public class FakeRepository {
    public FakeRepository() {
        System.out.println("FakeRepository Constructor...");
    }
}
