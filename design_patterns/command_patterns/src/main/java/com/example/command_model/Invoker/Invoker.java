package com.example.command_model.Invoker;

import com.example.command_model.command.Command;

public class Invoker {

    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void controller(){
        command.execute();
    }
}
