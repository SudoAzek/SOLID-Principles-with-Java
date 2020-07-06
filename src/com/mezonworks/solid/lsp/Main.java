package com.mezonworks.solid.lsp;

public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.doSomething();

        Child ch = new Child();
        ch.doSomething();
    }
}
