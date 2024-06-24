package org.geunskoo;

public class Sonata extends Car {

    private final String SONATA = "Sonata";
    private final Double DISTANCE_PER_LITER = 10.0;
    private final double distance;

    public Sonata(double distance) {
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
        return SONATA;
    }
}
