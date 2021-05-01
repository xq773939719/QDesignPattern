package com.q.Create.Singleton;

import com.q.Delegate;

public class SingletonMain implements Delegate {

    @Override
    public void invoke() {
        System.out.println("6.单例模式 开始");
        Singleton singleton = Singleton.getInstance();
        singleton.show();
        System.out.println("6.单例模式 结束");
    }
}
