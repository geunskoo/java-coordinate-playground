package org.geunskoo.coordinate;

public class Line {

    private final double lineLength;
    private final Point startPoint;
    private final Point endPoint;

    public Line(Point p1, Point p2) {
        this.startPoint = p1;
        this.endPoint = p2;
        this.lineLength = calculateEuclideanDistance();
    }

    public double calculateEuclideanDistance(){
        return Math.sqrt(Math.pow(startPoint.xGap(endPoint), 2) + Math.pow(startPoint.yGap(endPoint), 2));
    }

    public double getLength() {
        return lineLength;
    }
}
