package com.mezonworks.solid.srp.modem_srp_solution;

public class DataManagerImplementation implements IDataManager {
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
