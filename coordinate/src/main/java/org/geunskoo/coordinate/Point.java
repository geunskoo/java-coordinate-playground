package org.geunskoo.coordinate;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(String point) {
        int sX = Integer.parseInt(point.split(",")[0]);
        int sY = Integer.parseInt(point.split(",")[1]);
        this.x = sX;
        this.y = sY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
