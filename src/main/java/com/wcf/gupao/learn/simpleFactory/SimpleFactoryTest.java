package com.wcf.gupao.learn.simpleFactory;

import com.wcf.gupao.learn.product.ICar;
import com.wcf.gupao.learn.product.SedanCar;
import com.wcf.gupao.learn.product.Truck;

/**
 * @author wangchunfeng
 * @create 2019-03-08 9:50
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        ICar car = factory.createCar("truck");
        car.run();
        car = factory.createCar("sedanCar");
        car.run();

        car =  factory.createCar(SedanCar.class);
        car.run();
        car =  factory.createCar(Truck.class);
        car.run();
    }
}
