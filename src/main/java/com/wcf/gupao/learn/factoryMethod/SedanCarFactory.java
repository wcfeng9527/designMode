package com.wcf.gupao.learn.factoryMethod;

import com.wcf.gupao.learn.product.ICar;
import com.wcf.gupao.learn.product.SedanCar;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:07
 */
public class SedanCarFactory extends AbstractCarFactory {

    @Override
    public ICar doCreate() {
        return new SedanCar();
    }
}
