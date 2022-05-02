package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

public class GeoJsonFeature extends Feature implements Observer {
    private final LatLngBounds mBoundingBox;
    private GeoJsonLineStringStyle mLineStringStyle;
    private GeoJsonPointStyle mPointStyle;
    private GeoJsonPolygonStyle mPolygonStyle;

    public GeoJsonFeature(Geometry geometry, String str, HashMap<String, String> hashMap, LatLngBounds latLngBounds) {
        super(geometry, str, hashMap);
        this.mId = str;
        this.mBoundingBox = latLngBounds;
    }

    public String setProperty(String str, String str2) {
        return super.setProperty(str, str2);
    }

    public String removeProperty(String str) {
        return super.removeProperty(str);
    }

    public GeoJsonPointStyle getPointStyle() {
        return this.mPointStyle;
    }

    public void setPointStyle(GeoJsonPointStyle geoJsonPointStyle) {
        if (geoJsonPointStyle != null) {
            GeoJsonPointStyle geoJsonPointStyle2 = this.mPointStyle;
            if (geoJsonPointStyle2 != null) {
                geoJsonPointStyle2.deleteObserver(this);
            }
            this.mPointStyle = geoJsonPointStyle;
            geoJsonPointStyle.addObserver(this);
            checkRedrawFeature(this.mPointStyle);
            return;
        }
        throw new IllegalArgumentException("Point style cannot be null");
    }

    public GeoJsonLineStringStyle getLineStringStyle() {
        return this.mLineStringStyle;
    }

    public void setLineStringStyle(GeoJsonLineStringStyle geoJsonLineStringStyle) {
        if (geoJsonLineStringStyle != null) {
            GeoJsonLineStringStyle geoJsonLineStringStyle2 = this.mLineStringStyle;
            if (geoJsonLineStringStyle2 != null) {
                geoJsonLineStringStyle2.deleteObserver(this);
            }
            this.mLineStringStyle = geoJsonLineStringStyle;
            geoJsonLineStringStyle.addObserver(this);
            checkRedrawFeature(this.mLineStringStyle);
            return;
        }
        throw new IllegalArgumentException("Line string style cannot be null");
    }

    public GeoJsonPolygonStyle getPolygonStyle() {
        return this.mPolygonStyle;
    }

    public void setPolygonStyle(GeoJsonPolygonStyle geoJsonPolygonStyle) {
        if (geoJsonPolygonStyle != null) {
            GeoJsonPolygonStyle geoJsonPolygonStyle2 = this.mPolygonStyle;
            if (geoJsonPolygonStyle2 != null) {
                geoJsonPolygonStyle2.deleteObserver(this);
            }
            this.mPolygonStyle = geoJsonPolygonStyle;
            geoJsonPolygonStyle.addObserver(this);
            checkRedrawFeature(this.mPolygonStyle);
            return;
        }
        throw new IllegalArgumentException("Polygon style cannot be null");
    }

    public PolygonOptions getPolygonOptions() {
        return this.mPolygonStyle.toPolygonOptions();
    }

    public MarkerOptions getMarkerOptions() {
        return this.mPointStyle.toMarkerOptions();
    }

    public PolylineOptions getPolylineOptions() {
        return this.mLineStringStyle.toPolylineOptions();
    }

    private void checkRedrawFeature(GeoJsonStyle geoJsonStyle) {
        if (hasGeometry() && Arrays.asList(geoJsonStyle.getGeometryType()).contains(getGeometry().getGeometryType())) {
            setChanged();
            notifyObservers();
        }
    }

    public void setGeometry(Geometry geometry) {
        super.setGeometry(geometry);
        setChanged();
        notifyObservers();
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Feature{");
        sb.append("\n bounding box=");
        sb.append(this.mBoundingBox);
        sb.append(",\n geometry=");
        sb.append(getGeometry());
        sb.append(",\n point style=");
        sb.append(this.mPointStyle);
        sb.append(",\n line string style=");
        sb.append(this.mLineStringStyle);
        sb.append(",\n polygon style=");
        sb.append(this.mPolygonStyle);
        sb.append(",\n id=");
        sb.append(this.mId);
        sb.append(",\n properties=");
        sb.append(getProperties());
        sb.append("\n}\n");
        return sb.toString();
    }

    public void update(Observable observable, Object obj) {
        if (observable instanceof GeoJsonStyle) {
            checkRedrawFeature((GeoJsonStyle) observable);
        }
    }
}
