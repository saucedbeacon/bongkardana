package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.Point;

public class GeoJsonPoint extends Point {
    private final Double mAltitude;

    public GeoJsonPoint(LatLng latLng) {
        this(latLng, (Double) null);
    }

    public GeoJsonPoint(LatLng latLng, Double d) {
        super(latLng);
        this.mAltitude = d;
    }

    public String getType() {
        return getGeometryType();
    }

    public LatLng getCoordinates() {
        return getGeometryObject();
    }

    public Double getAltitude() {
        return this.mAltitude;
    }
}
