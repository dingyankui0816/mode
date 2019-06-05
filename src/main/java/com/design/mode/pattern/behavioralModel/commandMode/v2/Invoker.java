package com.design.mode.pattern.behavioralModel.commandMode.v2;

public class Invoker {
    private ICommand iCommand;

    public void setiCommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

    public void runCommand(){
        iCommand.execute();
    }
}
