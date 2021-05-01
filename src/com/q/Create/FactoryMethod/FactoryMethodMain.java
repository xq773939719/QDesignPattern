package com.q.Create.FactoryMethod;

import com.q.Delegate;

public class FactoryMethodMain implements Delegate {
    public void invoke(){
        System.out.println("2.工厂方法模式 开始");
        AFactory aFactory = new AFactory();
        AProduct aProduct = (AProduct) aFactory.createProduct();
        aProduct.show();

        BFactory bFactory = new BFactory();
        BProduct bProduct = (BProduct) bFactory.createProduct();
        bProduct.show();
        System.out.println("2.工厂方法模式 结束");
    }
}
