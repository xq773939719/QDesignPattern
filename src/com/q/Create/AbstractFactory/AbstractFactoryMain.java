package com.q.Create.AbstractFactory;


import com.q.Delegate;

public class AbstractFactoryMain implements Delegate {
    public void invoke() {
        System.out.println("3.抽象工厂模式 开始");
        AFactory aFactory = new AFactory();
        AProduct aaProduct = aFactory.createAProduct();
        aaProduct.show();
        BProduct abProduct = aFactory.createBProduct();
        abProduct.show();

        BFactory bFactory = new BFactory();
        AProduct baProduct = bFactory.createAProduct();
        baProduct.show();
        BProduct bbProduct = aFactory.createBProduct();
        bbProduct.show();

        System.out.println("3.抽象工厂模式 结束");
    }
}
