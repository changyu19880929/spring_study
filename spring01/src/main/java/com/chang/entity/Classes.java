package com.chang.entity;

import java.util.List;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.entity
 * @date 2019-09-09 17:42
 * @Copyright 北京木联能软件股份有限公司
 */
public class Classes {


    private int id;
    private String name;
    private List<Student> list;

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

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
