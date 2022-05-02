package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.GroundOverlay;
import java.util.ArrayList;
import java.util.HashMap;

public class KmlContainer {
    private String mContainerId;
    private final ArrayList<KmlContainer> mContainers;
    private final HashMap<KmlGroundOverlay, GroundOverlay> mGroundOverlays;
    private final HashMap<KmlPlacemark, Object> mPlacemarks;
    private final HashMap<String, String> mProperties;
    private final HashMap<String, String> mStyleMap;
    private HashMap<String, KmlStyle> mStyles;

    KmlContainer(HashMap<String, String> hashMap, HashMap<String, KmlStyle> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, HashMap<String, String> hashMap4, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> hashMap5, String str) {
        this.mProperties = hashMap;
        this.mPlacemarks = hashMap3;
        this.mStyles = hashMap2;
        this.mStyleMap = hashMap4;
        this.mContainers = arrayList;
        this.mGroundOverlays = hashMap5;
        this.mContainerId = str;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, KmlStyle> getStyles() {
        return this.mStyles;
    }

    /* access modifiers changed from: package-private */
    public void setPlacemark(KmlPlacemark kmlPlacemark, Object obj) {
        this.mPlacemarks.put(kmlPlacemark, obj);
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> getStyleMap() {
        return this.mStyleMap;
    }

    /* access modifiers changed from: package-private */
    public HashMap<KmlGroundOverlay, GroundOverlay> getGroundOverlayHashMap() {
        return this.mGroundOverlays;
    }

    public String getContainerId() {
        return this.mContainerId;
    }

    public KmlStyle getStyle(String str) {
        return this.mStyles.get(str);
    }

    public String getStyleIdFromMap(String str) {
        return this.mStyleMap.get(str);
    }

    /* access modifiers changed from: package-private */
    public HashMap<KmlPlacemark, Object> getPlacemarksHashMap() {
        return this.mPlacemarks;
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperties() {
        return this.mProperties.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.mProperties.containsKey(str);
    }

    public boolean hasContainers() {
        return this.mContainers.size() > 0;
    }

    public Iterable<KmlContainer> getContainers() {
        return this.mContainers;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return this.mPlacemarks.keySet();
    }

    public boolean hasPlacemarks() {
        return this.mPlacemarks.size() > 0;
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return this.mGroundOverlays.keySet();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Container{");
        sb.append("\n properties=");
        sb.append(this.mProperties);
        sb.append(",\n placemarks=");
        sb.append(this.mPlacemarks);
        sb.append(",\n containers=");
        sb.append(this.mContainers);
        sb.append(",\n ground overlays=");
        sb.append(this.mGroundOverlays);
        sb.append(",\n style maps=");
        sb.append(this.mStyleMap);
        sb.append(",\n styles=");
        sb.append(this.mStyles);
        sb.append("\n}\n");
        return sb.toString();
    }
}
