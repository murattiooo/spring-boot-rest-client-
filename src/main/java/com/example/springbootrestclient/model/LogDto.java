package com.example.springbootrestclient.model;

import com.example.springbootrestclient.entity.LogEntity;

public class LogDto {

    private Long id;

    private String  value;

    public LogDto() {
    }

    public LogDto(LogEntity entity) {
        this.id=entity.getId();
        this.value=entity.getValue();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LogEntity toEntity(){
        LogEntity entity=new LogEntity();
        entity.setId(getId());
        entity.setValue(getValue());
        return entity;
    }
}
