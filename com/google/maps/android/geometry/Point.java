package com.google.maps.android.geometry;

public class Point {
    public final double x;
    public final double y;

    public Point(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Point{x=");
        sb.append(this.x);
        sb.append(", y=");
        sb.append(this.y);
        sb.append('}');
        return sb.toString();
    }
}
