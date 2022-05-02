package com.google.maps.android.data.geojson;

interface GeoJsonStyle {
    String[] getGeometryType();

    boolean isVisible();

    void setVisible(boolean z);
}
