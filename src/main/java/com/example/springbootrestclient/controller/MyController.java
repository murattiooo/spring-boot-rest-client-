package com.example.springbootrestclient.controller;


import com.example.springbootrestclient.dialect.MyDialect;
import com.example.springbootrestclient.service.LogService;
import com.example.springbootrestclient.model.CalcRequest;
import com.example.springbootrestclient.model.LogDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/calculator")
public class MyController {


    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM HH:mm:ss");

    @Autowired
    LogService logService;

    @Autowired
    MyDialect myDialect;
    @Autowired
    LogDto logDto;
    private Logger logger = LoggerFactory.getLogger(MyController.class);

    @PostMapping(value = "/do-add",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendAdd(@RequestBody CalcRequest request){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Request to JSON");
        logDto.setValue(date+" Call 1. Request to JSON");
        logService.addLog(logDto);
        String  addResult=  myDialect.getStringAdd(request.getValue1(),request.getValue2());
        return   addResult;
    }

    @PostMapping(value = "/do-divide",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendDivide(@RequestBody CalcRequest request){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Request to JSON");
        logDto.setValue(date+" Call 1. Request to JSON");
        logService.addLog(logDto);
        String  addResult=  myDialect.getStringDivide(request.getValue1(),request.getValue2());
        return   addResult;
    }

    @PostMapping(value = "/do-multiple",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendMultiple(@RequestBody CalcRequest request){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Request to JSON");
        logDto.setValue(date+" Call 1. Request to JSON");
        logService.addLog(logDto);
        String  addResult=  myDialect.getStringMultiple(request.getValue1(),request.getValue2());
        return   addResult;
    }


    @PostMapping(value = "/do-subtract",produces = MediaType.APPLICATION_JSON_VALUE)
    public String  sendSubtract(@RequestBody CalcRequest request){
        String date = simpleDateFormat.format(new Date());
        logger.info(date+" Call 1. Request to JSON");
        logDto.setValue(date+" Call 1. Request to JSON");
        logService.addLog(logDto);
        String  addResult=  myDialect.getStringSubtract(request.getValue1(),request.getValue2());
        return   addResult;
    }

}
