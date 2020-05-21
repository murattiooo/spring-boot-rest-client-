package com.example.springbootrestclient.Service;

import com.example.springbootrestclient.entity.LogEntity;
import com.example.springbootrestclient.model.LogDto;
import org.springframework.stereotype.Service;


@Service
public interface LogService  {

    LogEntity addLog (LogDto logDto);
}
