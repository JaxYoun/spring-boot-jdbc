package com.yang.springbootjdbc.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;
}
