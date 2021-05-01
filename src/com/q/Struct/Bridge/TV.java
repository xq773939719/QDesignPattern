package com.q.Struct.Bridge;

public class TV implements Device{

    private boolean enable = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public void turnOn() {
        System.out.println("TY.turnOn");
        this.enable = true;
    }

    @Override
    public void turnOff() {
        System.out.println("TY.turnOff");
        this.enable = false;
    }

    @Override
    public int getVolume() {
        System.out.println("TY.getVolume:" + this.volume);
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TY.setVolume:" + volume);
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        System.out.println("TY.getChannel:" + this.channel);
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TY.setChannel:" + channel);
        this.channel = channel;
    }
}
