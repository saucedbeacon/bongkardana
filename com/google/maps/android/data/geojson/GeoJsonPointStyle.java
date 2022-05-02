package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;

public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new MarkerOptions();
    }

    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public float getAlpha() {
        return this.mMarkerOptions.getAlpha();
    }

    public void setAlpha(float f) {
        this.mMarkerOptions.alpha(f);
        styleChanged();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.getAnchorU();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.getAnchorV();
    }

    public void setAnchor(float f, float f2) {
        setMarkerHotSpot(f, f2, "fraction", "fraction");
        styleChanged();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.isDraggable();
    }

    public void setDraggable(boolean z) {
        this.mMarkerOptions.draggable(z);
        styleChanged();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.isFlat();
    }

    public void setFlat(boolean z) {
        this.mMarkerOptions.flat(z);
        styleChanged();
    }

    public BitmapDescriptor getIcon() {
        return this.mMarkerOptions.getIcon();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        this.mMarkerOptions.icon(bitmapDescriptor);
        styleChanged();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.getInfoWindowAnchorV();
    }

    public void setInfoWindowAnchor(float f, float f2) {
        this.mMarkerOptions.infoWindowAnchor(f, f2);
        styleChanged();
    }

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setRotation(float f) {
        setMarkerRotation(f);
        styleChanged();
    }

    public String getSnippet() {
        return this.mMarkerOptions.getSnippet();
    }

    public void setSnippet(String str) {
        this.mMarkerOptions.snippet(str);
        styleChanged();
    }

    public String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public void setTitle(String str) {
        this.mMarkerOptions.title(str);
        styleChanged();
    }

    public boolean isVisible() {
        return this.mMarkerOptions.isVisible();
    }

    public void setVisible(boolean z) {
        this.mMarkerOptions.visible(z);
        styleChanged();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.alpha(this.mMarkerOptions.getAlpha());
        markerOptions.anchor(this.mMarkerOptions.getAnchorU(), this.mMarkerOptions.getAnchorV());
        markerOptions.draggable(this.mMarkerOptions.isDraggable());
        markerOptions.flat(this.mMarkerOptions.isFlat());
        markerOptions.icon(this.mMarkerOptions.getIcon());
        markerOptions.infoWindowAnchor(this.mMarkerOptions.getInfoWindowAnchorU(), this.mMarkerOptions.getInfoWindowAnchorV());
        markerOptions.rotation(this.mMarkerOptions.getRotation());
        markerOptions.snippet(this.mMarkerOptions.getSnippet());
        markerOptions.title(this.mMarkerOptions.getTitle());
        markerOptions.visible(this.mMarkerOptions.isVisible());
        markerOptions.zIndex(this.mMarkerOptions.getZIndex());
        return markerOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PointStyle{");
        sb.append("\n geometry type=");
        sb.append(Arrays.toString(GEOMETRY_TYPE));
        sb.append(",\n alpha=");
        sb.append(getAlpha());
        sb.append(",\n anchor U=");
        sb.append(getAnchorU());
        sb.append(",\n anchor V=");
        sb.append(getAnchorV());
        sb.append(",\n draggable=");
        sb.append(isDraggable());
        sb.append(",\n flat=");
        sb.append(isFlat());
        sb.append(",\n info window anchor U=");
        sb.append(getInfoWindowAnchorU());
        sb.append(",\n info window anchor V=");
        sb.append(getInfoWindowAnchorV());
        sb.append(",\n rotation=");
        sb.append(getRotation());
        sb.append(",\n snippet=");
        sb.append(getSnippet());
        sb.append(",\n title=");
        sb.append(getTitle());
        sb.append(",\n visible=");
        sb.append(isVisible());
        sb.append(",\n z index=");
        sb.append(getZIndex());
        sb.append("\n}\n");
        return sb.toString();
    }

    public float getZIndex() {
        return this.mMarkerOptions.getZIndex();
    }

    public void setZIndex(float f) {
        this.mMarkerOptions.zIndex(f);
        styleChanged();
    }
}
