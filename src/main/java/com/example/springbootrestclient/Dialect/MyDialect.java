package com.example.springbootrestclient.Dialect;

import com.example.springbootrestclient.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyDialect {
    @Autowired
    MyService myService;

    public String getStringAdd(int value1,int value2){
        return myService.getStringAdd(value1,value2);
    }
    public String getStringDivide(int value1,int value2){
        return myService.getStringDivide(value1,value2);
    }
    public String getStringMultiple(int value1,int value2){
        return myService.getStringMultiple(value1,value2);
    }

    public String getStringSubtract(int value1,int value2){
        return myService.getStringSubtract(value1,value2);
    }
}
