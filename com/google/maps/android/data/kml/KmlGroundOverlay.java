package com.google.maps.android.data.kml;

import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class KmlGroundOverlay {
    private final GroundOverlayOptions mGroundOverlayOptions;
    private String mImageUrl;
    private LatLngBounds mLatLngBox;
    private final Map<String, String> mProperties;

    KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f, int i, HashMap<String, String> hashMap, float f2) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.mGroundOverlayOptions = groundOverlayOptions;
        this.mImageUrl = str;
        this.mProperties = hashMap;
        if (latLngBounds != null) {
            this.mLatLngBox = latLngBounds;
            groundOverlayOptions.positionFromBounds(latLngBounds);
            this.mGroundOverlayOptions.bearing(f2);
            this.mGroundOverlayOptions.zIndex(f);
            this.mGroundOverlayOptions.visible(i != 0);
            return;
        }
        throw new IllegalArgumentException("No LatLonBox given");
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public LatLngBounds getLatLngBox() {
        return this.mLatLngBox;
    }

    public Iterable<String> getProperties() {
        return this.mProperties.keySet();
    }

    public String getProperty(String str) {
        return this.mProperties.get(str);
    }

    public boolean hasProperty(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(954458982, oncanceled);
            onCancelLoad.getMin(954458982, oncanceled);
        }
        return this.mProperties.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public GroundOverlayOptions getGroundOverlayOptions() {
        return this.mGroundOverlayOptions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroundOverlay{");
        sb.append("\n properties=");
        sb.append(this.mProperties);
        sb.append(",\n image url=");
        sb.append(this.mImageUrl);
        sb.append(",\n LatLngBox=");
        sb.append(this.mLatLngBox);
        sb.append("\n}\n");
        return sb.toString();
    }
}
