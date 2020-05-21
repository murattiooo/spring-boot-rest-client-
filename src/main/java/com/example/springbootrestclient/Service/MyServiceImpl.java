package com.example.springbootrestclient.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tempuri.Calculator;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class MyServiceImpl implements MyService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM HH:mm:ss");
    Calculator  calculator =new Calculator();

    @Override
    public String getStringAdd(int value1,int value2){

        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Response to SOAP");
        String result=String.valueOf(calculator.getCalculatorSoap().add(value1,value2));
        logger.info(date+" Call 1. Response from SOAP");
        return   result;
    }


    @Override
    public String getStringDivide(int value1,int value2){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Response to SOAP");
        String result=String.valueOf(calculator.getCalculatorSoap().divide(value1,value2));
        logger.info(date+" Call 1. Response from SOAP");
        return   result;
    }


    @Override
    public String getStringMultiple(int value1,int value2){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Response to SOAP");
        String result=String.valueOf(calculator.getCalculatorSoap().multiply(value1,value2));
        logger.info(date+" Call 1. Response from SOAP");
        return   result;
    }

    @Override
    public String getStringSubtract(int value1,int value2){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Response to SOAP");
        String result=String.valueOf(calculator.getCalculatorSoap().subtract(value1,value2));
        logger.info(date+" Call 1. Response from SOAP");
        return   result;

    }
}
