package com.wcf.gupao.learn.abstracFactory;

import com.wcf.gupao.learn.product.IAppliance;
import com.wcf.gupao.learn.product.ICar;

/**
 * created by wangchunfeng on 2019/3/8
 */
public interface IFactory {

    ICar createCar();

    IAppliance createAppliance();

}
