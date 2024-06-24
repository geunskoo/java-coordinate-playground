package org.geunskoo.coordinate;

public class Calculator {

    public Line drawLine(Point p1, Point p2) {
        return new Line(p1, p2);

    }

    public Line drawLine(String cmd) {
        String[] points = commandParser(cmd);

        Point point1 = new Point(points[0]);
        Point point2 = new Point(points[1]);

        return drawLine(point1, point2);
    }

    private static String[] commandParser(String cmd) {
        cmd = cmd.replace("(", "").replace(")","");
        return cmd.split("-");
    }
}
