package com.wcf.gupao.learn.simpleFactory;

import com.wcf.gupao.learn.product.ICar;
import com.wcf.gupao.learn.product.SedanCar;
import com.wcf.gupao.learn.product.Truck;

/**
 * 汽车工厂
 *
 * @author wangchunfeng
 * @create 2019-03-08 9:46
 */
public class CarFactory {

    private final static String sedanCar = "sedanCar";
    private final static String truck = "truck";

    public ICar createCar(String carName) {
        if (sedanCar.equals(carName)) {
            return new SedanCar();
        } else if (truck.equals(carName)) {
            return new Truck();
        }
        return null;
    }

    public ICar createCar(Class clazz) {
        if (null != clazz) {
            try {
                return (ICar) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
