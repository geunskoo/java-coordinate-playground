package org.geunskoo.coordinate;

public class Point {

    private final CoordinateNum x;
    private final CoordinateNum y;

    public Point(int x, int y) {
        this.x = new CoordinateNum(x);
        this.y = new CoordinateNum(y);
    }

    public Point(String point) {
        int sX = Integer.parseInt(point.split(",")[0]);
        int sY = Integer.parseInt(point.split(",")[1]);
        this.x = new CoordinateNum(sX);
        this.y = new CoordinateNum(sY);
    }

    public double xGap(Point endPoint) {
        return x.gap(endPoint.getX());
    }

    public double yGap(Point endPoint) {
        return y.gap(endPoint.getY());

    }

    public CoordinateNum getX() {
        return x;
    }

    public CoordinateNum getY() {
        return y;
    }


}
