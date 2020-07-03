package com.mezonworks.solid.srp.shape_ocp_solution;

public class Main {
    public static void main(String [] args) {
        var rectl1 = new Rectangle(8, 5);
        var rectl2 = new Rectangle(4, 37.4);
        var crcl1 = new Circle(11.2);

        var ac = new AreaCalculator();

        System.out.println(ac.areaCalc(rectl1, rectl2, crcl1));
    }
}
