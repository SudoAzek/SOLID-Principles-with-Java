package com.mezonworks.solid.srp.modem_srp_violation;

public class Phone implements IPhone{
    @Override
    public void dial(String phoneNumber) {
        System.out.println("Connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected");
    }

    @Override
    public void send(String message) {
        System.out.println("Data sent successfully");
    }

    @Override
    public int receive() {
        System.out.println("Data received successfully");
        return 0;
    }
}
