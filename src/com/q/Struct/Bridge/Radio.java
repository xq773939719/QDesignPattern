package com.q.Struct.Bridge;

public class Radio implements Device{
    private boolean enable = false;
    private int volume = 0;
    private int channel = 0;

    @Override
    public void turnOn() {
        System.out.println("Radio.turnOn");
        this.enable = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio.turnOff");
        this.enable = false;
    }

    @Override
    public int getVolume() {
        System.out.println("Radio.getVolume:" + this.volume);
        return this.volume;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Radio.setVolume:" + volume);
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        System.out.println("Radio.getChannel:" + this.channel);
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Radio.setChannel:" + channel);
        this.channel = channel;
    }
}
