package com.example.springbootrestclient.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public interface MyService {

       String  getStringAdd(int value1,int value2);

       String  getStringDivide(int value1,int value2);

       String  getStringMultiple(int value1,int value2);

       String  getStringSubtract(int value1,int value2);
}
