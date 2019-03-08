package com.wcf.gupao.learn.product;

/**
 * 电视
 *
 * @author wangchunfeng
 * @create 2019-03-08 10:41
 */
public class Television implements IAppliance {
    @Override
    public void start() {
        System.out.println("打开电视机");
    }
}
