package org.geunskoo;

public class Avante extends Car {

    private final String AVANTE = "Avante";
    private final Double DISTANCE_PER_LITER = 15.0;
    private final double distance;

    public Avante(double distance) {
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
        return AVANTE;
    }
}
