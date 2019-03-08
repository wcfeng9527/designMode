package com.wcf.gupao.learn.product;

/**
 * 卡车
 *
 * @author wangchunfeng
 * @create 2019-03-08 9:44
 */
public class Truck implements ICar {
    @Override
    public void run() {
        System.out.println("卡车启动！");
    }
}
