package com.wcf.gupao.learn.product;

/**
 * 冰箱
 *
 * @author wangchunfeng
 * @create 2019-03-08 10:42
 */
public class Refrigerator implements IAppliance {
    @Override
    public void start() {
        System.out.println("打开冰箱开始制冷");
    }
}
