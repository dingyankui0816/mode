package com.design.mode.pattern.behavioralModel.commandMode.v2;

public class ConcreteCommandA implements ICommand {
    private IReceiver iReceiver;

    public ConcreteCommandA(IReceiver iReceiver) {
        this.iReceiver = iReceiver;
    }

    @Override
    public void execute() {
        iReceiver.doA();
    }
}
