package com.example.command_model.test;


import com.example.command_model.Invoker.Invoker;
import com.example.command_model.Receiver.Receiver;
import com.example.command_model.command.commands.ReceverRuningCommand;
import com.example.command_model.command.commands.ReciverWorkingCommand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainTest {

    @Test
    public void test(){
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new ReceverRuningCommand(receiver));
        invoker.controller();

        System.out.println("--*--");

        invoker = new Invoker(new ReciverWorkingCommand(receiver));
        invoker.controller();
    }
}
