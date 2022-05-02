package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.data.LineString;
import java.util.ArrayList;

public class KmlLineString extends LineString {
    private final ArrayList<Double> mAltitudes;

    public KmlLineString(ArrayList<LatLng> arrayList) {
        this(arrayList, (ArrayList<Double>) null);
    }

    public KmlLineString(ArrayList<LatLng> arrayList, ArrayList<Double> arrayList2) {
        super(arrayList);
        this.mAltitudes = arrayList2;
    }

    public ArrayList<Double> getAltitudes() {
        return this.mAltitudes;
    }

    public ArrayList<LatLng> getGeometryObject() {
        return new ArrayList<>(super.getGeometryObject());
    }
}
