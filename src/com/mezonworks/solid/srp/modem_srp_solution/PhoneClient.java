package com.mezonworks.solid.srp.modem_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        phone.dial("01057495164");
        phone.send("Message text");
        phone.receive();
        phone.disconnect();
    }
}
