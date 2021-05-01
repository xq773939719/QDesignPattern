package com.q.Struct.Bridge;

public class Remote {

    private Device device;

    Remote(Device device) {
        this.device = device;
    }

    public void open() {
        device.turnOn();
    }

    public void close() {
        device.turnOff();
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    public void volumeDown() {
        device.setChannel(device.getVolume() - 10);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }


}
