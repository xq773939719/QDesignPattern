package com.q;

import com.q.Behavior.Command.CommandMain;
import com.q.Behavior.Interpreter.InterpreterMain;
import com.q.Behavior.Iterator.IteratorMain;
import com.q.Behavior.Mediator.MediatorMain;
import com.q.Behavior.Memento.MementoMain;
import com.q.Behavior.Observer.ObserverMain;
import com.q.Behavior.ResponsibilityChain.ResponsibilityChainMain;
import com.q.Behavior.State.StateMain;
import com.q.Behavior.Strategy.StrategyMain;
import com.q.Behavior.TemplateMethod.TemplateMethodMain;
import com.q.Behavior.Visitor.VisitorMain;
import com.q.Create.AbstractFactory.AbstractFactoryMain;
import com.q.Create.Builder.BuilderMain;
import com.q.Create.FactoryMethod.FactoryMethodMain;
import com.q.Create.Prototype.PrototypeMain;
import com.q.Create.SimpleFactory.SimpleFactoryMain;
import com.q.Create.Singleton.SingletonMain;
import com.q.Struct.Adapter.AdapterMain;
import com.q.Struct.Bridge.BridgeMain;
import com.q.Struct.Composite.CompositeMain;
import com.q.Struct.Decorator.DecoratorMain;
import com.q.Struct.Facade.FacadeMain;
import com.q.Struct.Flyweight.FlyweightMain;
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
        arrayList.add(new BridgeMain());
        arrayList.add(new CompositeMain());
        arrayList.add(new DecoratorMain());
        arrayList.add(new FacadeMain());
        arrayList.add(new FlyweightMain());

        arrayList.add(new TemplateMethodMain());
        arrayList.add(new StrategyMain());
        arrayList.add(new CommandMain());
        arrayList.add(new ResponsibilityChainMain());
        arrayList.add(new StateMain());
        arrayList.add(new ObserverMain());
        arrayList.add(new MediatorMain());
        arrayList.add(new IteratorMain());
        arrayList.add(new VisitorMain());
        arrayList.add(new MementoMain());
        arrayList.add(new InterpreterMain());
    }

    public static void main(String[] args) {
        System.out.println("Design Pattern start.");
        initData();
        for (Delegate item : arrayList) {
            item.invoke();
        }
        System.out.println("Design Pattern end.");

        System.out.println("Design Pattern's sum is :" + arrayList.size());
    }


}
