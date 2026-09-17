package com.sds.cleancode.restaurant;

public class TestableSmsSender extends SmsSender {
    private boolean sendMethodCalled = false;

    @Override
    public void send(Schedule schedule) {
        sendMethodCalled = true;
    }

    public boolean isSendMethodCalled() {
        return sendMethodCalled;
    }
}
