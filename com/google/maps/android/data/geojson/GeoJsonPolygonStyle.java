package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public GeoJsonPolygonStyle() {
        this.mPolygonOptions = new PolygonOptions();
        this.mPolygonOptions.clickable(true);
    }

    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getFillColor() {
        return this.mPolygonOptions.getFillColor();
    }

    public void setFillColor(int i) {
        setPolygonFillColor(i);
        styleChanged();
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.isGeodesic();
    }

    public void setGeodesic(boolean z) {
        this.mPolygonOptions.geodesic(z);
        styleChanged();
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.getStrokeColor();
    }

    public void setStrokeColor(int i) {
        this.mPolygonOptions.strokeColor(i);
        styleChanged();
    }

    public int getStrokeJointType() {
        return this.mPolygonOptions.getStrokeJointType();
    }

    public void setStrokeJointType(int i) {
        this.mPolygonOptions.strokeJointType(i);
        styleChanged();
    }

    public List<PatternItem> getStrokePattern() {
        return this.mPolygonOptions.getStrokePattern();
    }

    public void setStrokePattern(List<PatternItem> list) {
        this.mPolygonOptions.strokePattern(list);
        styleChanged();
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        setPolygonStrokeWidth(f);
        styleChanged();
    }

    public float getZIndex() {
        return this.mPolygonOptions.getZIndex();
    }

    public void setZIndex(float f) {
        this.mPolygonOptions.zIndex(f);
        styleChanged();
    }

    public boolean isVisible() {
        return this.mPolygonOptions.isVisible();
    }

    public void setVisible(boolean z) {
        this.mPolygonOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public PolygonOptions toPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.fillColor(this.mPolygonOptions.getFillColor());
        polygonOptions.geodesic(this.mPolygonOptions.isGeodesic());
        polygonOptions.strokeColor(this.mPolygonOptions.getStrokeColor());
        polygonOptions.strokeJointType(this.mPolygonOptions.getStrokeJointType());
        polygonOptions.strokePattern(this.mPolygonOptions.getStrokePattern());
        polygonOptions.strokeWidth(this.mPolygonOptions.getStrokeWidth());
        polygonOptions.visible(this.mPolygonOptions.isVisible());
        polygonOptions.zIndex(this.mPolygonOptions.getZIndex());
        polygonOptions.clickable(this.mPolygonOptions.isClickable());
        return polygonOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PolygonStyle{");
        sb.append("\n geometry type=");
        sb.append(Arrays.toString(GEOMETRY_TYPE));
        sb.append(",\n fill color=");
        sb.append(getFillColor());
        sb.append(",\n geodesic=");
        sb.append(isGeodesic());
        sb.append(",\n stroke color=");
        sb.append(getStrokeColor());
        sb.append(",\n stroke joint type=");
        sb.append(getStrokeJointType());
        sb.append(",\n stroke pattern=");
        sb.append(getStrokePattern());
        sb.append(",\n stroke width=");
        sb.append(getStrokeWidth());
        sb.append(",\n visible=");
        sb.append(isVisible());
        sb.append(",\n z index=");
        sb.append(getZIndex());
        sb.append(",\n clickable=");
        sb.append(isClickable());
        sb.append("\n}\n");
        return sb.toString();
    }

    public void setClickable(boolean z) {
        this.mPolygonOptions.clickable(z);
        styleChanged();
    }

    public boolean isClickable() {
        return this.mPolygonOptions.isClickable();
    }
}
