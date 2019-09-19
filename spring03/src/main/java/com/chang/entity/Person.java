package com.chang.entity;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.entity
 * @date 2019-09-12 14:23
 * @Copyright 北京木联能软件股份有限公司
 */
public class Person {
    private int id;
    private String name;
    private Car car1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar1() {
        return car1;
    }

    public void setCar1(Car car1) {
        this.car1 = car1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", car1=" + car1 +
                '}';
    }
}
