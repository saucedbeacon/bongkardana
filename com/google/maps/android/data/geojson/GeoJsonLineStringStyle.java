package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class GeoJsonLineStringStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"LineString", "MultiLineString", "GeometryCollection"};

    public GeoJsonLineStringStyle() {
        this.mPolylineOptions = new PolylineOptions();
        this.mPolylineOptions.clickable(true);
    }

    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getColor() {
        return this.mPolylineOptions.getColor();
    }

    public void setColor(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-292296720, oncanceled);
            onCancelLoad.getMin(-292296720, oncanceled);
        }
        this.mPolylineOptions.color(i);
        styleChanged();
    }

    public boolean isClickable() {
        return this.mPolylineOptions.isClickable();
    }

    public void setClickable(boolean z) {
        this.mPolylineOptions.clickable(z);
        styleChanged();
    }

    public boolean isGeodesic() {
        return this.mPolylineOptions.isGeodesic();
    }

    public void setGeodesic(boolean z) {
        this.mPolylineOptions.geodesic(z);
        styleChanged();
    }

    public float getWidth() {
        return this.mPolylineOptions.getWidth();
    }

    public void setWidth(float f) {
        setLineStringWidth(f);
        styleChanged();
    }

    public float getZIndex() {
        return this.mPolylineOptions.getZIndex();
    }

    public void setZIndex(float f) {
        this.mPolylineOptions.zIndex(f);
        styleChanged();
    }

    public boolean isVisible() {
        return this.mPolylineOptions.isVisible();
    }

    public void setVisible(boolean z) {
        this.mPolylineOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public PolylineOptions toPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.mPolylineOptions.getColor());
        polylineOptions.clickable(this.mPolylineOptions.isClickable());
        polylineOptions.geodesic(this.mPolylineOptions.isGeodesic());
        polylineOptions.visible(this.mPolylineOptions.isVisible());
        polylineOptions.width(this.mPolylineOptions.getWidth());
        polylineOptions.zIndex(this.mPolylineOptions.getZIndex());
        polylineOptions.pattern(getPattern());
        return polylineOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineStringStyle{");
        sb.append("\n geometry type=");
        sb.append(Arrays.toString(GEOMETRY_TYPE));
        sb.append(",\n color=");
        sb.append(getColor());
        sb.append(",\n clickable=");
        sb.append(isClickable());
        sb.append(",\n geodesic=");
        sb.append(isGeodesic());
        sb.append(",\n visible=");
        sb.append(isVisible());
        sb.append(",\n width=");
        sb.append(getWidth());
        sb.append(",\n z index=");
        sb.append(getZIndex());
        sb.append(",\n pattern=");
        sb.append(getPattern());
        sb.append("\n}\n");
        return sb.toString();
    }

    public List<PatternItem> getPattern() {
        return this.mPolylineOptions.getPattern();
    }

    public void setPattern(List<PatternItem> list) {
        this.mPolylineOptions.pattern(list);
        styleChanged();
    }
}
