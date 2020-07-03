package com.mezonworks.solid.srp.shape_ocp_violation;

public class Main {
    public static void main(String [] args) {
        var rectl1 = new Rectangle(10, 5);
        var rectl2 = new Rectangle(20, 37.4);
        var crcl1 = new Circle(13.3);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalc(rectl1, rectl2, crcl1));
    }
}
