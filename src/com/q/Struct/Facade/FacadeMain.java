package com.q.Struct.Facade;

import com.q.Delegate;

public class FacadeMain implements Delegate {

    @Override
    public void invoke() {
        System.out.println("12.外观模式 开始");
        Facade facade = new Facade();
        facade.abc();
        System.out.println("12.外观模式 结束");
    }
}
