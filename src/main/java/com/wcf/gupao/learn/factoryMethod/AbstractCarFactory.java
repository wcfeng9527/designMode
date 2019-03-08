package com.wcf.gupao.learn.factoryMethod;

import com.wcf.gupao.learn.product.ICar;

/**
 * @author wangchunfeng
 * @create 2019-03-08 10:16
 */
public abstract class AbstractCarFactory {

    public ICar createCar(){
        System.out.println("前置处理");
        ICar car = doCreate();
        System.out.println("后置处理");
        return car;
    }

    public abstract ICar doCreate();

}
