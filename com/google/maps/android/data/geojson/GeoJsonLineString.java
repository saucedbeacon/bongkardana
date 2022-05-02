package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.LineString;
import java.util.List;

public class GeoJsonLineString extends LineString {
    private final List<Double> mAltitudes;

    public GeoJsonLineString(List<LatLng> list) {
        this(list, (List<Double>) null);
    }

    public GeoJsonLineString(List<LatLng> list, List<Double> list2) {
        super(list);
        this.mAltitudes = list2;
    }

    public String getType() {
        return getGeometryType();
    }

    public List<LatLng> getCoordinates() {
        return getGeometryObject();
    }

    public List<Double> getAltitudes() {
        return this.mAltitudes;
    }
}
