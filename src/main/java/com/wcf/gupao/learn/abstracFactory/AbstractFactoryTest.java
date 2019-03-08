package com.wcf.gupao.learn.abstracFactory;

import com.wcf.gupao.learn.product.IAppliance;
import com.wcf.gupao.learn.product.ICar;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:49
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory factory = new AppleFactory();

        ICar car = factory.createCar();
        car.run();
        IAppliance appliance = factory.createAppliance();
        appliance.start();

        factory = new HaierFactory();
        car = factory.createCar();
        car.run();
        appliance = factory.createAppliance();
        appliance.start();
    }
}
