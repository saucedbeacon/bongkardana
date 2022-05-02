package com.google.maps.android.data.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.Marker;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Geometry;
import com.google.maps.android.data.MultiGeometry;
import com.google.maps.android.data.Renderer;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KmlRenderer extends Renderer {
    private static final String LOG_TAG = "KmlRenderer";
    /* access modifiers changed from: private */
    public ArrayList<KmlContainer> mContainers;
    private boolean mGroundOverlayImagesDownloaded = false;
    private final Set<String> mGroundOverlayUrls = new HashSet();
    private boolean mMarkerIconsDownloaded = false;

    KmlRenderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, @Nullable Renderer.ImagesCache imagesCache) {
        super(googleMap, context, markerManager, polygonManager, polylineManager, groundOverlayManager, imagesCache);
    }

    private void removePlacemarks(HashMap<? extends Feature, Object> hashMap) {
        removeFeatures(hashMap);
    }

    static boolean getContainerVisibility(KmlContainer kmlContainer, boolean z) {
        return z && (!kmlContainer.hasProperty("visibility") || Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    private void removeContainers(Iterable<KmlContainer> iterable) {
        for (KmlContainer next : iterable) {
            removePlacemarks(next.getPlacemarksHashMap());
            removeGroundOverlays(next.getGroundOverlayHashMap());
            removeContainers(next.getContainers());
        }
    }

    public void addLayerToMap() {
        setLayerVisibility(true);
        this.mContainers = getContainerList();
        putStyles();
        assignStyleMap(getStyleMaps(), getStylesRenderer());
        addGroundOverlays(getGroundOverlayMap(), this.mContainers);
        addContainerGroupToMap(this.mContainers, true);
        addPlacemarksToMap(getAllFeatures());
        if (!this.mGroundOverlayImagesDownloaded) {
            downloadGroundOverlays();
        }
        if (!this.mMarkerIconsDownloaded) {
            downloadMarkerIcons();
        }
        checkClearBitmapCache();
    }

    /* access modifiers changed from: package-private */
    public void storeKmlData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> hashMap4) {
        storeData(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
    }

    /* access modifiers changed from: package-private */
    public void storeKmzData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> hashMap4, HashMap<String, Bitmap> hashMap5) {
        storeData(hashMap, hashMap2, hashMap3, arrayList, hashMap4);
        for (Map.Entry next : hashMap5.entrySet()) {
            cacheBitmap((String) next.getKey(), (Bitmap) next.getValue());
        }
    }

    public void setMap(GoogleMap googleMap) {
        removeLayerFromMap();
        super.setMap(googleMap);
        addLayerToMap();
    }

    /* access modifiers changed from: package-private */
    public boolean hasKmlPlacemarks() {
        return hasFeatures();
    }

    /* access modifiers changed from: package-private */
    public Iterable<? extends Feature> getKmlPlacemarks() {
        return getFeatures();
    }

    public boolean hasNestedContainers() {
        return this.mContainers.size() > 0;
    }

    public Iterable<KmlContainer> getNestedContainers() {
        return this.mContainers;
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return getGroundOverlayMap().keySet();
    }

    public void removeLayerFromMap() {
        removePlacemarks(getAllFeatures());
        removeGroundOverlays(getGroundOverlayMap());
        if (hasNestedContainers()) {
            removeContainers(getNestedContainers());
        }
        setLayerVisibility(false);
        clearStylesRenderer();
    }

    private void addPlacemarksToMap(HashMap<? extends Feature, Object> hashMap) {
        for (Feature addFeature : hashMap.keySet()) {
            addFeature(addFeature);
        }
    }

    private void addContainerGroupToMap(Iterable<KmlContainer> iterable, boolean z) {
        for (KmlContainer next : iterable) {
            boolean containerVisibility = getContainerVisibility(next, z);
            if (next.getStyles() != null) {
                putStyles(next.getStyles());
            }
            if (next.getStyleMap() != null) {
                super.assignStyleMap(next.getStyleMap(), getStylesRenderer());
            }
            addContainerObjectToMap(next, containerVisibility);
            if (next.hasContainers()) {
                addContainerGroupToMap(next.getContainers(), containerVisibility);
            }
        }
    }

    private void addContainerObjectToMap(KmlContainer kmlContainer, boolean z) {
        for (Feature next : kmlContainer.getPlacemarks()) {
            boolean z2 = z && getPlacemarkVisibility(next);
            if (next.getGeometry() != null) {
                String id2 = next.getId();
                Geometry geometry = next.getGeometry();
                KmlStyle placemarkStyle = getPlacemarkStyle(id2);
                KmlPlacemark kmlPlacemark = (KmlPlacemark) next;
                Object addKmlPlacemarkToMap = addKmlPlacemarkToMap(kmlPlacemark, geometry, placemarkStyle, kmlPlacemark.getInlineStyle(), z2);
                kmlContainer.setPlacemark(kmlPlacemark, addKmlPlacemarkToMap);
                putContainerFeature(addKmlPlacemarkToMap, next);
            }
        }
    }

    private void downloadMarkerIcons() {
        this.mMarkerIconsDownloaded = true;
        Iterator<String> it = getMarkerIconUrls().iterator();
        while (it.hasNext()) {
            new MarkerIconImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* access modifiers changed from: private */
    public void addIconToMarkers(String str, HashMap<KmlPlacemark, Object> hashMap) {
        for (Feature next : hashMap.keySet()) {
            addIconToGeometry(str, getStylesRenderer().get(next.getId()), ((KmlPlacemark) next).getInlineStyle(), next.getGeometry(), hashMap.get(next));
        }
    }

    private void addIconToGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Geometry geometry, Object obj) {
        if (geometry != null) {
            if ("Point".equals(geometry.getGeometryType())) {
                addIconToMarker(str, kmlStyle, kmlStyle2, (Marker) obj);
            } else if ("MultiGeometry".equals(geometry.getGeometryType())) {
                addIconToMultiGeometry(str, kmlStyle, kmlStyle2, (MultiGeometry) geometry, (List) obj);
            }
        }
    }

    private void addIconToMultiGeometry(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, MultiGeometry multiGeometry, List<Object> list) {
        Iterator it = multiGeometry.getGeometryObject().iterator();
        Iterator<Object> it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            addIconToGeometry(str, kmlStyle, kmlStyle2, (Geometry) it.next(), it2.next());
        }
    }

    private void addIconToMarker(String str, KmlStyle kmlStyle, KmlStyle kmlStyle2, Marker marker) {
        boolean z = true;
        boolean z2 = kmlStyle2 != null && str.equals(kmlStyle2.getIconUrl());
        if (kmlStyle == null || !str.equals(kmlStyle.getIconUrl())) {
            z = false;
        }
        if (z2) {
            scaleBitmap(kmlStyle2, marker);
        } else if (z) {
            scaleBitmap(kmlStyle, marker);
        }
    }

    private void scaleBitmap(KmlStyle kmlStyle, Marker marker) {
        marker.setIcon(getCachedMarkerImage(kmlStyle.getIconUrl(), kmlStyle.getIconScale()));
    }

    /* access modifiers changed from: private */
    public void addContainerGroupIconsToMarkers(String str, Iterable<KmlContainer> iterable) {
        for (KmlContainer next : iterable) {
            addIconToMarkers(str, next.getPlacemarksHashMap());
            if (next.hasContainers()) {
                addContainerGroupIconsToMarkers(str, next.getContainers());
            }
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> hashMap, Iterable<KmlContainer> iterable) {
        addGroundOverlays(hashMap);
        for (KmlContainer next : iterable) {
            addGroundOverlays(next.getGroundOverlayHashMap(), next.getContainers());
        }
    }

    private void addGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> hashMap) {
        for (KmlGroundOverlay next : hashMap.keySet()) {
            String imageUrl = next.getImageUrl();
            if (!(imageUrl == null || next.getLatLngBox() == null)) {
                if (getCachedGroundOverlayImage(imageUrl) != null) {
                    addGroundOverlayToMap(imageUrl, getGroundOverlayMap(), true);
                } else {
                    this.mGroundOverlayUrls.add(imageUrl);
                }
            }
        }
    }

    private void downloadGroundOverlays() {
        this.mGroundOverlayImagesDownloaded = true;
        Iterator<String> it = this.mGroundOverlayUrls.iterator();
        while (it.hasNext()) {
            new GroundOverlayImageDownload(it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* access modifiers changed from: private */
    public void addGroundOverlayToMap(String str, HashMap<KmlGroundOverlay, GroundOverlay> hashMap, boolean z) {
        BitmapDescriptor cachedGroundOverlayImage = getCachedGroundOverlayImage(str);
        for (KmlGroundOverlay next : hashMap.keySet()) {
            if (next.getImageUrl().equals(str)) {
                GroundOverlay attachGroundOverlay = attachGroundOverlay(next.getGroundOverlayOptions().image(cachedGroundOverlayImage));
                if (!z) {
                    attachGroundOverlay.setVisible(false);
                }
                hashMap.put(next, attachGroundOverlay);
            }
        }
    }

    /* access modifiers changed from: private */
    public void addGroundOverlayInContainerGroups(String str, Iterable<KmlContainer> iterable, boolean z) {
        for (KmlContainer next : iterable) {
            boolean containerVisibility = getContainerVisibility(next, z);
            addGroundOverlayToMap(str, next.getGroundOverlayHashMap(), containerVisibility);
            if (next.hasContainers()) {
                addGroundOverlayInContainerGroups(str, next.getContainers(), containerVisibility);
            }
        }
    }

    class MarkerIconImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mIconUrl;

        public MarkerIconImageDownload(String str) {
            this.mIconUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* access modifiers changed from: protected */
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mIconUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mIconUrl);
            } catch (IOException unused2) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                KmlRenderer.this.cacheBitmap(this.mIconUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addIconToMarkers(this.mIconUrl, kmlRenderer.getAllFeatures());
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addContainerGroupIconsToMarkers(this.mIconUrl, kmlRenderer2.mContainers);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    class GroundOverlayImageDownload extends AsyncTask<String, Void, Bitmap> {
        private final String mGroundOverlayUrl;

        public GroundOverlayImageDownload(String str) {
            this.mGroundOverlayUrl = str;
            KmlRenderer.this.downloadStarted();
        }

        /* access modifiers changed from: protected */
        public Bitmap doInBackground(String... strArr) {
            try {
                return KmlRenderer.this.getBitmapFromUrl(this.mGroundOverlayUrl);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.mGroundOverlayUrl);
            } catch (IOException unused2) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                KmlRenderer.this.cacheBitmap(this.mGroundOverlayUrl, bitmap);
                if (KmlRenderer.this.isLayerOnMap()) {
                    KmlRenderer kmlRenderer = KmlRenderer.this;
                    kmlRenderer.addGroundOverlayToMap(this.mGroundOverlayUrl, kmlRenderer.getGroundOverlayMap(), true);
                    KmlRenderer kmlRenderer2 = KmlRenderer.this;
                    kmlRenderer2.addGroundOverlayInContainerGroups(this.mGroundOverlayUrl, kmlRenderer2.mContainers, true);
                }
            }
            KmlRenderer.this.downloadFinished();
        }
    }

    /* access modifiers changed from: private */
    public Bitmap getBitmapFromUrl(String str) throws IOException {
        return BitmapFactory.decodeStream(openConnectionCheckRedirects((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r2 = (java.net.HttpURLConnection) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.InputStream openConnectionCheckRedirects(java.net.URLConnection r7) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            boolean r2 = r7 instanceof java.net.HttpURLConnection
            if (r2 == 0) goto L_0x000c
            r3 = r7
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r3.setInstanceFollowRedirects(r0)
        L_0x000c:
            java.io.InputStream r3 = r7.getInputStream()
            if (r2 == 0) goto L_0x0071
            r2 = r7
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            int r4 = r2.getResponseCode()
            r5 = 300(0x12c, float:4.2E-43)
            if (r4 < r5) goto L_0x0071
            r5 = 307(0x133, float:4.3E-43)
            if (r4 > r5) goto L_0x0071
            r5 = 306(0x132, float:4.29E-43)
            if (r4 == r5) goto L_0x0071
            r5 = 304(0x130, float:4.26E-43)
            if (r4 == r5) goto L_0x0071
            java.net.URL r7 = r2.getURL()
            java.lang.String r4 = "Location"
            java.lang.String r4 = r2.getHeaderField(r4)
            r5 = 0
            if (r4 == 0) goto L_0x003b
            java.net.URL r5 = new java.net.URL
            r5.<init>(r7, r4)
        L_0x003b:
            r2.disconnect()
            if (r5 == 0) goto L_0x0069
            java.lang.String r7 = r5.getProtocol()
            java.lang.String r2 = "http"
            boolean r7 = r7.equals(r2)
            if (r7 != 0) goto L_0x0058
            java.lang.String r7 = r5.getProtocol()
            java.lang.String r2 = "https"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x0069
        L_0x0058:
            r7 = 5
            if (r1 >= r7) goto L_0x0069
            java.net.URLConnection r7 = r5.openConnection()
            java.lang.Object r7 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r7)
            java.net.URLConnection r7 = (java.net.URLConnection) r7
            int r1 = r1 + 1
            r2 = 1
            goto L_0x0072
        L_0x0069:
            java.lang.SecurityException r7 = new java.lang.SecurityException
            java.lang.String r0 = "illegal URL redirect"
            r7.<init>(r0)
            throw r7
        L_0x0071:
            r2 = 0
        L_0x0072:
            if (r2 != 0) goto L_0x0002
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.kml.KmlRenderer.openConnectionCheckRedirects(java.net.URLConnection):java.io.InputStream");
    }
}
