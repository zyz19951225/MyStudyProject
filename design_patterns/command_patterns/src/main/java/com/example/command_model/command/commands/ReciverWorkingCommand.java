package com.example.command_model.command.commands;

import com.example.command_model.Receiver.Receiver;
import com.example.command_model.command.Command;

public class ReciverWorkingCommand implements Command {
    private Receiver receiver;

    public ReciverWorkingCommand(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("working execute ...");
        receiver.working();
    }
}
