package com.q.Struct.Adapter;

import com.q.Delegate;

public class AdapterMain implements Delegate {
    @Override
    public void DO() {
        System.out.println("6.适配器模式 开始");
        Adapter adapter = new Adapter();
        adapter.method();
        System.out.println("6.适配器模式 结束");
    }
}
