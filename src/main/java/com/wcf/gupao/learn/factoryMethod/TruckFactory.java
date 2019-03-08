package com.wcf.gupao.learn.factoryMethod;

import com.wcf.gupao.learn.product.ICar;
import com.wcf.gupao.learn.product.Truck;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:07
 */
public class TruckFactory extends AbstractCarFactory{

    @Override
    public ICar doCreate() {
        return new Truck();
    }
}
