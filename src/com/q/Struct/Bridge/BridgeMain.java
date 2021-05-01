package com.q.Struct.Bridge;

import com.q.Delegate;

public class BridgeMain implements Delegate {
    @Override
    public void invoke() {
        System.out.println("9.适配器模式 开始");
        TV tv = new TV();
        TVRemote tvRemote = new TVRemote(tv);
        tvRemote.open();
        tvRemote.volumeUp();
        tvRemote.volumeDown();
        tvRemote.channelUp();
        tvRemote.channelDown();
        tvRemote.close();

        Radio radio = new Radio();
        RadioRemote radioRemote = new RadioRemote(radio);
        radioRemote.open();
        radioRemote.volumeUp();
        radioRemote.volumeDown();
        radioRemote.channelUp();
        radioRemote.channelDown();
        radioRemote.close();
        System.out.println("9.适配器模式 结束");
    }
}
