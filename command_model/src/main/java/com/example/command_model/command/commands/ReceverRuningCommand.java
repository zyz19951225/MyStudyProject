package com.example.command_model.command.commands;

import com.example.command_model.Receiver.Receiver;
import com.example.command_model.command.Command;

public class ReceverRuningCommand implements Command {
    private Receiver receiver;
    public ReceverRuningCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        System.out.println("running execute ...");
        receiver.running();
    }

}
