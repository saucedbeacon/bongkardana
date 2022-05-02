package com.google.maps.android.data;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public interface DataPolygon<T> extends Geometry {
    List<List<LatLng>> getInnerBoundaryCoordinates();

    List<LatLng> getOuterBoundaryCoordinates();
}
