package com.chang.factory;

import com.chang.entity.Car;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.factory
 * @date 2019-09-12 14:14
 * @Copyright 北京木联能软件股份有限公司
 */
public class InstanceCarFactory {
    private Map<Integer, Car> cars;
    public InstanceCarFactory(){
        cars = new HashMap<Integer, Car>();
        cars.put(1,new Car(1,"BMW"));
        cars.put(2,new Car(2,"Audi"));
    }

    public Car getCar(int num){
        return cars.get(num);
    }
}
