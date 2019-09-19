package com.chang.entity;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.entity
 * @date 2019-09-10 16:05
 * @Copyright 北京木联能软件股份有限公司
 */
public class Car {
    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }
}
