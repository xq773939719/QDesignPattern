package com.q.Behavior.ResponsibilityChain;

public abstract class AbstractHandler {

    private AbstractHandler handler;
    private boolean canFocus;

    public void setNext(AbstractHandler abstractHandler) {
        handler = abstractHandler;
    }

    public AbstractHandler getNext() {
        return handler;
    }

    public void setCanFocus(boolean canFocus) {
        this.canFocus = canFocus;
    }

    public boolean isCanFocus() {
        return canFocus;
    }

    public boolean canFocus() {
        return canFocus;
    }

    public abstract void handleRequest();
}
