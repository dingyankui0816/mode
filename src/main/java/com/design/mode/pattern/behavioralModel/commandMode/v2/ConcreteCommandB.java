package com.design.mode.pattern.behavioralModel.commandMode.v2;

public class ConcreteCommandB implements ICommand {
    private IReceiver iReceiver;

    public ConcreteCommandB(IReceiver iReceiver) {
        this.iReceiver = iReceiver;
    }

    @Override
    public void execute() {
        iReceiver.doB();
    }
}
