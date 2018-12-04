package com.xrq.test.logindemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class UserOrder {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Integer money;




}
