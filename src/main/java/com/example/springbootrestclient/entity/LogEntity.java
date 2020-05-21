package com.example.springbootrestclient.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_logging")
public class LogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insert_date")
    private LocalDate insertDate;


    @Column(name = "value")
    private String value;

    @PrePersist
    protected void onCreate() {

        insertDate = LocalDate.now();

    }

    public LogEntity() {
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
}
