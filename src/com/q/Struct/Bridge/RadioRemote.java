package com.q.Struct.Bridge;

public class RadioRemote extends Remote{
    RadioRemote(Device device) {
        super(device);
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }

    @Override
    public void volumeUp() {
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        super.volumeDown();
    }

    @Override
    public void channelUp() {
        super.channelUp();
    }

    @Override
    public void channelDown() {
        super.channelDown();
    }
}
