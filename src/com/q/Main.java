package com.q;

import com.q.Create.AbstractFactory.AbstractFactoryMain;
import com.q.Create.Builder.BuilderMain;
import com.q.Create.FactoryMethod.FactoryMethodMain;
import com.q.Create.Prototype.PrototypeMain;
import com.q.Create.SimpleFactory.SimpleFactoryMain;
import com.q.Create.Singleton.SingletonMain;
import com.q.Struct.Adapter.AdapterMain;
import com.q.Struct.Proxy.ProxyMain;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Delegate> arrayList = new ArrayList<>(23);

    private static void initData() {
        arrayList.add(new SimpleFactoryMain());
        arrayList.add(new FactoryMethodMain());
        arrayList.add(new AbstractFactoryMain());
        arrayList.add(new BuilderMain());
        arrayList.add(new PrototypeMain());
        arrayList.add(new SingletonMain());
        arrayList.add(new AdapterMain());
        arrayList.add(new ProxyMain());
    }

    public static void main(String[] args) {
        initData();
        for (Delegate item : arrayList) {
            item.DO();
        }
    }


}
