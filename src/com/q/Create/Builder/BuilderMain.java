package com.q.Create.Builder;

import com.q.Delegate;

public class BuilderMain implements Delegate {
    public void invoke() {
        System.out.println("4.建造者模式 开始");
        Builder builder = new Builder();
        Director director = new Director(builder);
        Product product = director.createProduct();
        product.show();
        System.out.println("4.建造者模式 开始");
    }
}
