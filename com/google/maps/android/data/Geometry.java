package com.google.maps.android.data;

public interface Geometry<T> {
    T getGeometryObject();

    String getGeometryType();
}
