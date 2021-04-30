package com.q.Create.SimpleFactory;

import com.q.Delegate;

public class SimpleFactoryMain implements Delegate {
    public void DO() {
        System.out.println("1.简单工厂模式 开始");
        SimpleFactory simpleFactory = new SimpleFactory();
        AProduct aProduct = (AProduct) simpleFactory.createProduct(SimpleFactory.PRODUCT_TYPE.A);
        BProduct bProduct = (BProduct) simpleFactory.createProduct(SimpleFactory.PRODUCT_TYPE.B);
        aProduct.show();
        bProduct.show();
        System.out.println("1.简单工厂模式 结束");
    }
}
