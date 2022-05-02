package com.google.maps.android.data;

import com.google.android.gms.maps.model.LatLng;

public class Point implements Geometry {
    private static final String GEOMETRY_TYPE = "Point";
    private final LatLng mCoordinates;

    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public Point(LatLng latLng) {
        if (latLng != null) {
            this.mCoordinates = latLng;
            return;
        }
        throw new IllegalArgumentException("Coordinates cannot be null");
    }

    public LatLng getGeometryObject() {
        return this.mCoordinates;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Point{");
        sb.append("\n coordinates=");
        sb.append(this.mCoordinates);
        sb.append("\n}\n");
        return sb.toString();
    }
}
