package com.mezonworks.solid.lsp;

public class Child extends Parent {
    @Override
    public void doSomething() {
        throw new RuntimeException();
    }
}
