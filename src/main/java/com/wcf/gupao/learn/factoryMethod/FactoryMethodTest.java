package com.wcf.gupao.learn.factoryMethod;

import com.wcf.gupao.learn.product.ICar;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:08
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        AbstractCarFactory carFactory = new TruckFactory();

        ICar car = carFactory.createCar();
        car.run();

        carFactory = new SedanCarFactory();

        car = carFactory.createCar();
        car.run();
    }
}
