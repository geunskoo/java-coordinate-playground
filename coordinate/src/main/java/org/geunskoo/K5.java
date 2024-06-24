package org.geunskoo;

public class K5 extends Car {

    private final String K5 = "K5";
    private final Double DISTANCE_PER_LITER = 13.0;
    private final double distance;

    public K5(double distance) {
        this.distance = distance;
    }


    @Override
    public double getDistancePerLiter() {
        return this.DISTANCE_PER_LITER;
    }

    @Override
    public double getTripDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return K5;
    }
}
