package com.mezonworks.solid.isp.isp_violation;

import java.util.Date;
import java.util.List;

public class I {
    private Customer customer;
    private List<Product> products;

    public I(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    public String getName() {
        return customer.getName();
    }

    public Date getDate() {
        return new Date();
    }
}
