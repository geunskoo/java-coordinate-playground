package org.geunskoo.coordinate;

public class Calculator {

    public Line drawLine(Point p1, Point p2) {
        return new Line(p1, p2);

    }

    public Line calcDistance(String cmd) {
        cmd = cmd.replace("(", "").replace(")","");
        String[] points = cmd.split("-");

        Point point1 = new Point( Integer.parseInt(points[0].split(",")[0]), Integer.parseInt(points[0].split(",")[1]));
        Point point2 = new Point( Integer.parseInt(points[1].split(",")[0]), Integer.parseInt(points[1].split(",")[1]));

        return drawLine(point1, point2);
    }
}
