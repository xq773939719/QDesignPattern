package com.q.Behavior.Command;

public class Client {

    private Command command;

    Client(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("Client.call");
        command.execute();
    }
}
