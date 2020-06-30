package com.mezonworks.solid.srp.modem_srp_violation;

public class PhoneClient {
    public static void main(String [] args){
        IPhone phone = new Phone();

        phone.dial("01057495164");
        phone.send("Message text");
        phone.receive();
        phone.disconnect();
    }
}
