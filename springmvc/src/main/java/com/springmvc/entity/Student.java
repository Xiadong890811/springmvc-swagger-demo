package com.springmvc.entity;

import java.io.Serializable;

/**
 * Created by XD on 2015/12/17.
 */
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private char score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public char getScore() {
        return score;
    }

    public void setScore(char score) {
        this.score = score;
    }
}
