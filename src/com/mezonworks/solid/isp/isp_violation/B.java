package com.mezonworks.solid.isp.isp_violation;

public class B {
    private I i;

    public B(I i) {
        this.i = i;
    }

    public void callGetDate() {
        i.getDate();
    }
}
