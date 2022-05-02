package com.google.maps.android.data;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.R;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Layer;
import com.google.maps.android.data.geojson.BiMultiMap;
import com.google.maps.android.data.geojson.GeoJsonFeature;
import com.google.maps.android.data.geojson.GeoJsonLineString;
import com.google.maps.android.data.geojson.GeoJsonLineStringStyle;
import com.google.maps.android.data.geojson.GeoJsonMultiLineString;
import com.google.maps.android.data.geojson.GeoJsonMultiPoint;
import com.google.maps.android.data.geojson.GeoJsonMultiPolygon;
import com.google.maps.android.data.geojson.GeoJsonPoint;
import com.google.maps.android.data.geojson.GeoJsonPointStyle;
import com.google.maps.android.data.geojson.GeoJsonPolygon;
import com.google.maps.android.data.geojson.GeoJsonPolygonStyle;
import com.google.maps.android.data.kml.KmlContainer;
import com.google.maps.android.data.kml.KmlGroundOverlay;
import com.google.maps.android.data.kml.KmlMultiGeometry;
import com.google.maps.android.data.kml.KmlPlacemark;
import com.google.maps.android.data.kml.KmlStyle;
import com.google.maps.android.data.kml.KmlUtil;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Renderer {
    private static final Object FEATURE_NOT_ON_MAP = null;
    private static final int MARKER_ICON_SIZE = 32;
    private static final DecimalFormat sScaleFormat = new DecimalFormat("#.####");
    private final BiMultiMap<Feature> mContainerFeatures;
    private ArrayList<KmlContainer> mContainers;
    /* access modifiers changed from: private */
    public Context mContext;
    private final GeoJsonLineStringStyle mDefaultLineStringStyle;
    private final GeoJsonPointStyle mDefaultPointStyle;
    private final GeoJsonPolygonStyle mDefaultPolygonStyle;
    private final BiMultiMap<Feature> mFeatures;
    private HashMap<KmlGroundOverlay, GroundOverlay> mGroundOverlayMap;
    private final GroundOverlayManager.Collection mGroundOverlays;
    private ImagesCache mImagesCache;
    private boolean mLayerOnMap;
    private GoogleMap mMap;
    private final Set<String> mMarkerIconUrls;
    private final MarkerManager.Collection mMarkers;
    private int mNumActiveDownloads;
    private final PolygonManager.Collection mPolygons;
    private final PolylineManager.Collection mPolylines;
    private HashMap<String, String> mStyleMaps;
    private HashMap<String, KmlStyle> mStyles;
    private HashMap<String, KmlStyle> mStylesRenderer;

    public static final class ImagesCache {
        final Map<String, Bitmap> bitmapCache = new HashMap();
        final Map<String, BitmapDescriptor> groundOverlayImagesCache = new HashMap();
        final Map<String, Map<String, BitmapDescriptor>> markerImagesCache = new HashMap();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Renderer(GoogleMap googleMap, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager, @Nullable ImagesCache imagesCache) {
        this(googleMap, new HashSet(), (GeoJsonPointStyle) null, (GeoJsonLineStringStyle) null, (GeoJsonPolygonStyle) null, new BiMultiMap(), markerManager, polygonManager, polylineManager, groundOverlayManager);
        this.mContext = context;
        this.mStylesRenderer = new HashMap<>();
        this.mImagesCache = imagesCache == null ? new ImagesCache() : imagesCache;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Renderer(GoogleMap googleMap, HashMap<? extends Feature, Object> hashMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(googleMap, (Set<String>) null, new GeoJsonPointStyle(), new GeoJsonLineStringStyle(), new GeoJsonPolygonStyle(), (BiMultiMap<Feature>) null, markerManager, polygonManager, polylineManager, groundOverlayManager);
        HashMap<? extends Feature, Object> hashMap2 = hashMap;
        this.mFeatures.putAll(hashMap);
        this.mImagesCache = null;
    }

    private Renderer(GoogleMap googleMap, Set<String> set, GeoJsonPointStyle geoJsonPointStyle, GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonPolygonStyle geoJsonPolygonStyle, BiMultiMap<Feature> biMultiMap, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this.mFeatures = new BiMultiMap<>();
        this.mNumActiveDownloads = 0;
        this.mMap = googleMap;
        this.mLayerOnMap = false;
        this.mMarkerIconUrls = set;
        this.mDefaultPointStyle = geoJsonPointStyle;
        this.mDefaultLineStringStyle = geoJsonLineStringStyle;
        this.mDefaultPolygonStyle = geoJsonPolygonStyle;
        this.mContainerFeatures = biMultiMap;
        if (googleMap != null) {
            this.mMarkers = (markerManager == null ? new MarkerManager(googleMap) : markerManager).newCollection();
            this.mPolygons = (polygonManager == null ? new PolygonManager(googleMap) : polygonManager).newCollection();
            this.mPolylines = (polylineManager == null ? new PolylineManager(googleMap) : polylineManager).newCollection();
            this.mGroundOverlays = (groundOverlayManager == null ? new GroundOverlayManager(googleMap) : groundOverlayManager).newCollection();
            return;
        }
        this.mMarkers = null;
        this.mPolygons = null;
        this.mPolylines = null;
        this.mGroundOverlays = null;
    }

    public boolean isLayerOnMap() {
        return this.mLayerOnMap;
    }

    /* access modifiers changed from: protected */
    public void setLayerVisibility(boolean z) {
        this.mLayerOnMap = z;
    }

    public GoogleMap getMap() {
        return this.mMap;
    }

    public void setMap(GoogleMap googleMap) {
        this.mMap = googleMap;
    }

    /* access modifiers changed from: protected */
    public void putContainerFeature(Object obj, Feature feature) {
        this.mContainerFeatures.put(feature, obj);
    }

    public Set<Feature> getFeatures() {
        return this.mFeatures.keySet();
    }

    /* access modifiers changed from: package-private */
    public Feature getFeature(Object obj) {
        return this.mFeatures.getKey(obj);
    }

    /* access modifiers changed from: package-private */
    public Feature getContainerFeature(Object obj) {
        BiMultiMap<Feature> biMultiMap = this.mContainerFeatures;
        if (biMultiMap != null) {
            return biMultiMap.getKey(obj);
        }
        return null;
    }

    public Collection<Object> getValues() {
        return this.mFeatures.values();
    }

    public HashMap<? extends Feature, Object> getAllFeatures() {
        return this.mFeatures;
    }

    /* access modifiers changed from: protected */
    public Set<String> getMarkerIconUrls() {
        return this.mMarkerIconUrls;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, KmlStyle> getStylesRenderer() {
        return this.mStylesRenderer;
    }

    /* access modifiers changed from: protected */
    public HashMap<String, String> getStyleMaps() {
        return this.mStyleMaps;
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getCachedMarkerImage(String str, double d) {
        Bitmap bitmap;
        String format = sScaleFormat.format(d);
        Map map = this.mImagesCache.markerImagesCache.get(str);
        BitmapDescriptor bitmapDescriptor = map != null ? (BitmapDescriptor) map.get(format) : null;
        if (bitmapDescriptor != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor scaleIcon = scaleIcon(bitmap, d);
        putMarkerImagesCache(str, format, scaleIcon);
        return scaleIcon;
    }

    private BitmapDescriptor scaleIcon(Bitmap bitmap, double d) {
        int i;
        double d2 = (double) (this.mContext.getResources().getDisplayMetrics().density * 32.0f);
        Double.isNaN(d2);
        int i2 = (int) (d2 * d);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i = (int) (((float) (height * i2)) / ((float) width));
        } else if (width > height) {
            int i3 = (int) (((float) (width * i2)) / ((float) height));
            i = i2;
            i2 = i3;
        } else {
            i = i2;
        }
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, i2, i, false));
    }

    /* access modifiers changed from: protected */
    public BitmapDescriptor getCachedGroundOverlayImage(String str) {
        Bitmap bitmap;
        BitmapDescriptor bitmapDescriptor = this.mImagesCache.groundOverlayImagesCache.get(str);
        if (bitmapDescriptor != null || (bitmap = this.mImagesCache.bitmapCache.get(str)) == null) {
            return bitmapDescriptor;
        }
        BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(bitmap);
        this.mImagesCache.groundOverlayImagesCache.put(str, fromBitmap);
        return fromBitmap;
    }

    public HashMap<KmlGroundOverlay, GroundOverlay> getGroundOverlayMap() {
        return this.mGroundOverlayMap;
    }

    /* access modifiers changed from: protected */
    public ArrayList<KmlContainer> getContainerList() {
        return this.mContainers;
    }

    /* access modifiers changed from: protected */
    public KmlStyle getPlacemarkStyle(String str) {
        return this.mStylesRenderer.get(str) != null ? this.mStylesRenderer.get(str) : this.mStylesRenderer.get((Object) null);
    }

    /* access modifiers changed from: package-private */
    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.mDefaultPointStyle;
    }

    /* access modifiers changed from: package-private */
    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.mDefaultLineStringStyle;
    }

    /* access modifiers changed from: package-private */
    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.mDefaultPolygonStyle;
    }

    /* access modifiers changed from: protected */
    public void putFeatures(Feature feature, Object obj) {
        this.mFeatures.put(feature, obj);
    }

    /* access modifiers changed from: protected */
    public void putStyles() {
        this.mStylesRenderer.putAll(this.mStyles);
    }

    /* access modifiers changed from: protected */
    public void putStyles(HashMap<String, KmlStyle> hashMap) {
        this.mStylesRenderer.putAll(hashMap);
    }

    private void putMarkerImagesCache(String str, String str2, BitmapDescriptor bitmapDescriptor) {
        Map map = this.mImagesCache.markerImagesCache.get(str);
        if (map == null) {
            map = new HashMap();
            this.mImagesCache.markerImagesCache.put(str, map);
        }
        map.put(str2, bitmapDescriptor);
    }

    public void cacheBitmap(String str, Bitmap bitmap) {
        this.mImagesCache.bitmapCache.put(str, bitmap);
    }

    public void downloadStarted() {
        this.mNumActiveDownloads++;
    }

    public void downloadFinished() {
        this.mNumActiveDownloads--;
        checkClearBitmapCache();
    }

    /* access modifiers changed from: protected */
    public void checkClearBitmapCache() {
        ImagesCache imagesCache;
        if (this.mNumActiveDownloads == 0 && (imagesCache = this.mImagesCache) != null && !imagesCache.bitmapCache.isEmpty()) {
            this.mImagesCache.bitmapCache.clear();
        }
    }

    /* access modifiers changed from: protected */
    public boolean hasFeatures() {
        return this.mFeatures.size() > 0;
    }

    /* access modifiers changed from: protected */
    public void removeFeatures(HashMap<? extends Feature, Object> hashMap) {
        removeFeatures((Collection) hashMap.values());
    }

    private void removeFeatures(Collection collection) {
        for (Object next : collection) {
            if (next instanceof Collection) {
                removeFeatures((Collection) next);
            } else if (next instanceof Marker) {
                this.mMarkers.remove((Marker) next);
            } else if (next instanceof Polyline) {
                this.mPolylines.remove((Polyline) next);
            } else if (next instanceof Polygon) {
                this.mPolygons.remove((Polygon) next);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void removeGroundOverlays(HashMap<KmlGroundOverlay, GroundOverlay> hashMap) {
        for (GroundOverlay next : hashMap.values()) {
            if (next != null) {
                this.mGroundOverlays.remove(next);
            }
        }
    }

    public void removeFeature(Feature feature) {
        if (this.mFeatures.containsKey(feature)) {
            removeFromMap(this.mFeatures.remove(feature));
        }
    }

    private void setFeatureDefaultStyles(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.mDefaultPointStyle);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.mDefaultLineStringStyle);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.mDefaultPolygonStyle);
        }
    }

    /* access modifiers changed from: protected */
    public void clearStylesRenderer() {
        this.mStylesRenderer.clear();
    }

    /* access modifiers changed from: protected */
    public void storeData(HashMap<String, KmlStyle> hashMap, HashMap<String, String> hashMap2, HashMap<KmlPlacemark, Object> hashMap3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> hashMap4) {
        this.mStyles = hashMap;
        this.mStyleMaps = hashMap2;
        this.mFeatures.putAll(hashMap3);
        this.mContainers = arrayList;
        this.mGroundOverlayMap = hashMap4;
    }

    public void addFeature(Feature feature) {
        Object obj = FEATURE_NOT_ON_MAP;
        if (feature instanceof GeoJsonFeature) {
            setFeatureDefaultStyles((GeoJsonFeature) feature);
        }
        if (this.mLayerOnMap) {
            if (this.mFeatures.containsKey(feature)) {
                removeFromMap(this.mFeatures.get(feature));
            }
            if (feature.hasGeometry()) {
                if (feature instanceof KmlPlacemark) {
                    KmlPlacemark kmlPlacemark = (KmlPlacemark) feature;
                    obj = addKmlPlacemarkToMap(kmlPlacemark, feature.getGeometry(), getPlacemarkStyle(feature.getId()), kmlPlacemark.getInlineStyle(), getPlacemarkVisibility(feature));
                } else {
                    obj = addGeoJsonFeatureToMap(feature, feature.getGeometry());
                }
            }
        }
        this.mFeatures.put(feature, obj);
    }

    /* access modifiers changed from: protected */
    public void removeFromMap(Object obj) {
        if (obj instanceof Marker) {
            this.mMarkers.remove((Marker) obj);
        } else if (obj instanceof Polyline) {
            this.mPolylines.remove((Polyline) obj);
        } else if (obj instanceof Polygon) {
            this.mPolygons.remove((Polygon) obj);
        } else if (obj instanceof GroundOverlay) {
            this.mGroundOverlays.remove((GroundOverlay) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                removeFromMap(it.next());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.gms.maps.model.MarkerOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.google.android.gms.maps.model.PolylineOptions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.google.android.gms.maps.model.PolygonOptions} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r1v22 */
    /* JADX WARNING: type inference failed for: r1v23 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object addGeoJsonFeatureToMap(com.google.maps.android.data.Feature r3, com.google.maps.android.data.Geometry r4) {
        /*
            r2 = this;
            java.lang.String r0 = r4.getGeometryType()
            int r1 = r0.hashCode()
            switch(r1) {
                case -2116761119: goto L_0x0048;
                case -1065891849: goto L_0x003e;
                case -627102946: goto L_0x0034;
                case 77292912: goto L_0x002a;
                case 1267133722: goto L_0x0020;
                case 1806700869: goto L_0x0016;
                case 1950410960: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0052
        L_0x000c:
            java.lang.String r1 = "GeometryCollection"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 6
            goto L_0x0053
        L_0x0016:
            java.lang.String r1 = "LineString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 1
            goto L_0x0053
        L_0x0020:
            java.lang.String r1 = "Polygon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 2
            goto L_0x0053
        L_0x002a:
            java.lang.String r1 = "Point"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 0
            goto L_0x0053
        L_0x0034:
            java.lang.String r1 = "MultiLineString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 4
            goto L_0x0053
        L_0x003e:
            java.lang.String r1 = "MultiPoint"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 3
            goto L_0x0053
        L_0x0048:
            java.lang.String r1 = "MultiPolygon"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0052
            r0 = 5
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            r1 = 0
            switch(r0) {
                case 0: goto L_0x00c4;
                case 1: goto L_0x00a8;
                case 2: goto L_0x008c;
                case 3: goto L_0x007f;
                case 4: goto L_0x0072;
                case 5: goto L_0x0065;
                case 6: goto L_0x0058;
                default: goto L_0x0057;
            }
        L_0x0057:
            return r1
        L_0x0058:
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.maps.android.data.geojson.GeoJsonGeometryCollection r4 = (com.google.maps.android.data.geojson.GeoJsonGeometryCollection) r4
            java.util.List r4 = r4.getGeometries()
            java.util.ArrayList r3 = r2.addGeometryCollectionToMap(r3, r4)
            return r3
        L_0x0065:
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.maps.android.data.geojson.GeoJsonPolygonStyle r3 = r3.getPolygonStyle()
            com.google.maps.android.data.geojson.GeoJsonMultiPolygon r4 = (com.google.maps.android.data.geojson.GeoJsonMultiPolygon) r4
            java.util.ArrayList r3 = r2.addMultiPolygonToMap(r3, r4)
            return r3
        L_0x0072:
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.maps.android.data.geojson.GeoJsonLineStringStyle r3 = r3.getLineStringStyle()
            com.google.maps.android.data.geojson.GeoJsonMultiLineString r4 = (com.google.maps.android.data.geojson.GeoJsonMultiLineString) r4
            java.util.ArrayList r3 = r2.addMultiLineStringToMap(r3, r4)
            return r3
        L_0x007f:
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.maps.android.data.geojson.GeoJsonPointStyle r3 = r3.getPointStyle()
            com.google.maps.android.data.geojson.GeoJsonMultiPoint r4 = (com.google.maps.android.data.geojson.GeoJsonMultiPoint) r4
            java.util.ArrayList r3 = r2.addMultiPointToMap(r3, r4)
            return r3
        L_0x008c:
            boolean r0 = r3 instanceof com.google.maps.android.data.geojson.GeoJsonFeature
            if (r0 == 0) goto L_0x0097
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.android.gms.maps.model.PolygonOptions r1 = r3.getPolygonOptions()
            goto L_0x00a1
        L_0x0097:
            boolean r0 = r3 instanceof com.google.maps.android.data.kml.KmlPlacemark
            if (r0 == 0) goto L_0x00a1
            com.google.maps.android.data.kml.KmlPlacemark r3 = (com.google.maps.android.data.kml.KmlPlacemark) r3
            com.google.android.gms.maps.model.PolygonOptions r1 = r3.getPolygonOptions()
        L_0x00a1:
            com.google.maps.android.data.DataPolygon r4 = (com.google.maps.android.data.DataPolygon) r4
            com.google.android.gms.maps.model.Polygon r3 = r2.addPolygonToMap(r1, r4)
            return r3
        L_0x00a8:
            boolean r0 = r3 instanceof com.google.maps.android.data.geojson.GeoJsonFeature
            if (r0 == 0) goto L_0x00b3
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.android.gms.maps.model.PolylineOptions r1 = r3.getPolylineOptions()
            goto L_0x00bd
        L_0x00b3:
            boolean r0 = r3 instanceof com.google.maps.android.data.kml.KmlPlacemark
            if (r0 == 0) goto L_0x00bd
            com.google.maps.android.data.kml.KmlPlacemark r3 = (com.google.maps.android.data.kml.KmlPlacemark) r3
            com.google.android.gms.maps.model.PolylineOptions r1 = r3.getPolylineOptions()
        L_0x00bd:
            com.google.maps.android.data.geojson.GeoJsonLineString r4 = (com.google.maps.android.data.geojson.GeoJsonLineString) r4
            com.google.android.gms.maps.model.Polyline r3 = r2.addLineStringToMap(r1, r4)
            return r3
        L_0x00c4:
            boolean r0 = r3 instanceof com.google.maps.android.data.geojson.GeoJsonFeature
            if (r0 == 0) goto L_0x00cf
            com.google.maps.android.data.geojson.GeoJsonFeature r3 = (com.google.maps.android.data.geojson.GeoJsonFeature) r3
            com.google.android.gms.maps.model.MarkerOptions r1 = r3.getMarkerOptions()
            goto L_0x00d9
        L_0x00cf:
            boolean r0 = r3 instanceof com.google.maps.android.data.kml.KmlPlacemark
            if (r0 == 0) goto L_0x00d9
            com.google.maps.android.data.kml.KmlPlacemark r3 = (com.google.maps.android.data.kml.KmlPlacemark) r3
            com.google.android.gms.maps.model.MarkerOptions r1 = r3.getMarkerOptions()
        L_0x00d9:
            com.google.maps.android.data.geojson.GeoJsonPoint r4 = (com.google.maps.android.data.geojson.GeoJsonPoint) r4
            com.google.android.gms.maps.model.Marker r3 = r2.addPointToMap(r1, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.Renderer.addGeoJsonFeatureToMap(com.google.maps.android.data.Feature, com.google.maps.android.data.Geometry):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r0.equals("Point") != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object addKmlPlacemarkToMap(com.google.maps.android.data.kml.KmlPlacemark r10, com.google.maps.android.data.Geometry r11, com.google.maps.android.data.kml.KmlStyle r12, com.google.maps.android.data.kml.KmlStyle r13, boolean r14) {
        /*
            r9 = this;
            java.lang.String r0 = r11.getGeometryType()
            java.lang.String r1 = "drawOrder"
            boolean r2 = r10.hasProperty(r1)
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x0018
            java.lang.String r1 = r10.getProperty(r1)     // Catch:{ NumberFormatException -> 0x0017 }
            float r4 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0017 }
            goto L_0x0018
        L_0x0017:
            r2 = 0
        L_0x0018:
            r1 = -1
            int r5 = r0.hashCode()
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r5) {
                case 77292912: goto L_0x0042;
                case 89139371: goto L_0x0038;
                case 1267133722: goto L_0x002e;
                case 1806700869: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x004b
        L_0x0024:
            java.lang.String r3 = "LineString"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x002e:
            java.lang.String r3 = "Polygon"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004b
            r3 = 2
            goto L_0x004c
        L_0x0038:
            java.lang.String r3 = "MultiGeometry"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x004b
            r3 = 3
            goto L_0x004c
        L_0x0042:
            java.lang.String r5 = "Point"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r3 = -1
        L_0x004c:
            if (r3 == 0) goto L_0x00b7
            if (r3 == r8) goto L_0x008d
            if (r3 == r7) goto L_0x0063
            if (r3 == r6) goto L_0x0056
            r10 = 0
            return r10
        L_0x0056:
            r2 = r11
            com.google.maps.android.data.kml.KmlMultiGeometry r2 = (com.google.maps.android.data.kml.KmlMultiGeometry) r2
            r0 = r9
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            java.util.ArrayList r10 = r0.addMultiGeometryToMap(r1, r2, r3, r4, r5)
            return r10
        L_0x0063:
            com.google.android.gms.maps.model.PolygonOptions r10 = r12.getPolygonOptions()
            if (r13 == 0) goto L_0x006d
            r9.setInlinePolygonStyle(r10, r13)
            goto L_0x007e
        L_0x006d:
            boolean r12 = r12.isPolyRandomColorMode()
            if (r12 == 0) goto L_0x007e
            int r12 = r10.getFillColor()
            int r12 = com.google.maps.android.data.kml.KmlStyle.computeRandomColor(r12)
            r10.fillColor(r12)
        L_0x007e:
            com.google.maps.android.data.DataPolygon r11 = (com.google.maps.android.data.DataPolygon) r11
            com.google.android.gms.maps.model.Polygon r10 = r9.addPolygonToMap(r10, r11)
            r10.setVisible(r14)
            if (r2 == 0) goto L_0x008c
            r10.setZIndex(r4)
        L_0x008c:
            return r10
        L_0x008d:
            com.google.android.gms.maps.model.PolylineOptions r10 = r12.getPolylineOptions()
            if (r13 == 0) goto L_0x0097
            r9.setInlineLineStringStyle(r10, r13)
            goto L_0x00a8
        L_0x0097:
            boolean r12 = r12.isLineRandomColorMode()
            if (r12 == 0) goto L_0x00a8
            int r12 = r10.getColor()
            int r12 = com.google.maps.android.data.kml.KmlStyle.computeRandomColor(r12)
            r10.color(r12)
        L_0x00a8:
            com.google.maps.android.data.LineString r11 = (com.google.maps.android.data.LineString) r11
            com.google.android.gms.maps.model.Polyline r10 = r9.addLineStringToMap(r10, r11)
            r10.setVisible(r14)
            if (r2 == 0) goto L_0x00b6
            r10.setZIndex(r4)
        L_0x00b6:
            return r10
        L_0x00b7:
            com.google.android.gms.maps.model.MarkerOptions r0 = r12.getMarkerOptions()
            if (r13 == 0) goto L_0x00c1
            r9.setInlinePointStyle(r0, r13, r12)
            goto L_0x00d2
        L_0x00c1:
            java.lang.String r13 = r12.getIconUrl()
            if (r13 == 0) goto L_0x00d2
            java.lang.String r13 = r12.getIconUrl()
            double r5 = r12.getIconScale()
            r9.addMarkerIcons(r13, r5, r0)
        L_0x00d2:
            com.google.maps.android.data.kml.KmlPoint r11 = (com.google.maps.android.data.kml.KmlPoint) r11
            com.google.android.gms.maps.model.Marker r11 = r9.addPointToMap(r0, r11)
            r11.setVisible(r14)
            r9.setMarkerInfoWindow(r12, r11, r10)
            if (r2 == 0) goto L_0x00e3
            r11.setZIndex(r4)
        L_0x00e3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.data.Renderer.addKmlPlacemarkToMap(com.google.maps.android.data.kml.KmlPlacemark, com.google.maps.android.data.Geometry, com.google.maps.android.data.kml.KmlStyle, com.google.maps.android.data.kml.KmlStyle, boolean):java.lang.Object");
    }

    private Marker addPointToMap(MarkerOptions markerOptions, Point point) {
        markerOptions.position(point.getGeometryObject());
        return this.mMarkers.addMarker(markerOptions);
    }

    private void setInlinePointStyle(MarkerOptions markerOptions, KmlStyle kmlStyle, KmlStyle kmlStyle2) {
        double d;
        MarkerOptions markerOptions2 = kmlStyle.getMarkerOptions();
        if (kmlStyle.isStyleSet("heading")) {
            markerOptions.rotation(markerOptions2.getRotation());
        }
        if (kmlStyle.isStyleSet("hotSpot")) {
            markerOptions.anchor(markerOptions2.getAnchorU(), markerOptions2.getAnchorV());
        }
        if (kmlStyle.isStyleSet("markerColor")) {
            markerOptions.icon(markerOptions2.getIcon());
        }
        if (kmlStyle.isStyleSet("iconScale")) {
            d = kmlStyle.getIconScale();
        } else {
            d = kmlStyle2.isStyleSet("iconScale") ? kmlStyle2.getIconScale() : 1.0d;
        }
        if (kmlStyle.isStyleSet("iconUrl")) {
            addMarkerIcons(kmlStyle.getIconUrl(), d, markerOptions);
        } else if (kmlStyle2.getIconUrl() != null) {
            addMarkerIcons(kmlStyle2.getIconUrl(), d, markerOptions);
        }
    }

    private Polyline addLineStringToMap(PolylineOptions polylineOptions, LineString lineString) {
        polylineOptions.addAll(lineString.getGeometryObject());
        Polyline addPolyline = this.mPolylines.addPolyline(polylineOptions);
        addPolyline.setClickable(polylineOptions.isClickable());
        return addPolyline;
    }

    private void setInlineLineStringStyle(PolylineOptions polylineOptions, KmlStyle kmlStyle) {
        PolylineOptions polylineOptions2 = kmlStyle.getPolylineOptions();
        if (kmlStyle.isStyleSet("outlineColor")) {
            polylineOptions.color(polylineOptions2.getColor());
        }
        if (kmlStyle.isStyleSet("width")) {
            polylineOptions.width(polylineOptions2.getWidth());
        }
        if (kmlStyle.isLineRandomColorMode()) {
            polylineOptions.color(KmlStyle.computeRandomColor(polylineOptions2.getColor()));
        }
    }

    private Polygon addPolygonToMap(PolygonOptions polygonOptions, DataPolygon dataPolygon) {
        polygonOptions.addAll(dataPolygon.getOuterBoundaryCoordinates());
        for (List<LatLng> addHole : dataPolygon.getInnerBoundaryCoordinates()) {
            polygonOptions.addHole(addHole);
        }
        Polygon addPolygon = this.mPolygons.addPolygon(polygonOptions);
        addPolygon.setClickable(polygonOptions.isClickable());
        return addPolygon;
    }

    private void setInlinePolygonStyle(PolygonOptions polygonOptions, KmlStyle kmlStyle) {
        PolygonOptions polygonOptions2 = kmlStyle.getPolygonOptions();
        if (kmlStyle.hasFill() && kmlStyle.isStyleSet("fillColor")) {
            polygonOptions.fillColor(polygonOptions2.getFillColor());
        }
        if (kmlStyle.hasOutline()) {
            if (kmlStyle.isStyleSet("outlineColor")) {
                polygonOptions.strokeColor(polygonOptions2.getStrokeColor());
            }
            if (kmlStyle.isStyleSet("width")) {
                polygonOptions.strokeWidth(polygonOptions2.getStrokeWidth());
            }
        }
        if (kmlStyle.isPolyRandomColorMode()) {
            polygonOptions.fillColor(KmlStyle.computeRandomColor(polygonOptions2.getFillColor()));
        }
    }

    private ArrayList<Object> addGeometryCollectionToMap(GeoJsonFeature geoJsonFeature, List<Geometry> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        for (Geometry addGeoJsonFeatureToMap : list) {
            arrayList.add(addGeoJsonFeatureToMap(geoJsonFeature, addGeoJsonFeatureToMap));
        }
        return arrayList;
    }

    protected static boolean getPlacemarkVisibility(Feature feature) {
        return !feature.hasProperty("visibility") || Integer.parseInt(feature.getProperty("visibility")) != 0;
    }

    public void assignStyleMap(HashMap<String, String> hashMap, HashMap<String, KmlStyle> hashMap2) {
        for (String next : hashMap.keySet()) {
            String str = hashMap.get(next);
            if (hashMap2.containsKey(str)) {
                hashMap2.put(next, hashMap2.get(str));
            }
        }
    }

    private ArrayList<Object> addMultiGeometryToMap(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, KmlStyle kmlStyle, KmlStyle kmlStyle2, boolean z) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator it = kmlMultiGeometry.getGeometryObject().iterator();
        while (it.hasNext()) {
            arrayList.add(addKmlPlacemarkToMap(kmlPlacemark, (Geometry) it.next(), kmlStyle, kmlStyle2, z));
        }
        return arrayList;
    }

    private ArrayList<Marker> addMultiPointToMap(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList<Marker> arrayList = new ArrayList<>();
        for (GeoJsonPoint addPointToMap : geoJsonMultiPoint.getPoints()) {
            arrayList.add(addPointToMap(geoJsonPointStyle.toMarkerOptions(), addPointToMap));
        }
        return arrayList;
    }

    private ArrayList<Polyline> addMultiLineStringToMap(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList<Polyline> arrayList = new ArrayList<>();
        for (GeoJsonLineString addLineStringToMap : geoJsonMultiLineString.getLineStrings()) {
            arrayList.add(addLineStringToMap(geoJsonLineStringStyle.toPolylineOptions(), addLineStringToMap));
        }
        return arrayList;
    }

    private ArrayList<Polygon> addMultiPolygonToMap(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList<Polygon> arrayList = new ArrayList<>();
        for (GeoJsonPolygon addPolygonToMap : geoJsonMultiPolygon.getPolygons()) {
            arrayList.add(addPolygonToMap(geoJsonPolygonStyle.toPolygonOptions(), addPolygonToMap));
        }
        return arrayList;
    }

    private void addMarkerIcons(String str, double d, MarkerOptions markerOptions) {
        BitmapDescriptor cachedMarkerImage = getCachedMarkerImage(str, d);
        if (cachedMarkerImage != null) {
            markerOptions.icon(cachedMarkerImage);
        } else {
            this.mMarkerIconUrls.add(str);
        }
    }

    /* access modifiers changed from: protected */
    public GroundOverlay attachGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
        return this.mGroundOverlays.addGroundOverlay(groundOverlayOptions);
    }

    private void setMarkerInfoWindow(KmlStyle kmlStyle, Marker marker, KmlPlacemark kmlPlacemark) {
        boolean hasProperty = kmlPlacemark.hasProperty("name");
        boolean hasProperty2 = kmlPlacemark.hasProperty("description");
        boolean hasBalloonStyle = kmlStyle.hasBalloonStyle();
        boolean containsKey = kmlStyle.getBalloonOptions().containsKey("text");
        if (hasBalloonStyle && containsKey) {
            marker.setTitle(KmlUtil.substituteProperties(kmlStyle.getBalloonOptions().get("text"), kmlPlacemark));
            createInfoWindow();
        } else if (hasBalloonStyle && hasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            createInfoWindow();
        } else if (hasProperty && hasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            marker.setSnippet(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (hasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("description"));
            createInfoWindow();
        } else if (hasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            createInfoWindow();
        }
    }

    private void createInfoWindow() {
        this.mMarkers.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {
            public View getInfoWindow(Marker marker) {
                return null;
            }

            public View getInfoContents(Marker marker) {
                View inflate = LayoutInflater.from(Renderer.this.mContext).inflate(R.layout.amu_info_window, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.window);
                if (marker.getSnippet() != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(marker.getTitle());
                    sb.append("<br>");
                    sb.append(marker.getSnippet());
                    textView.setText(Html.fromHtml(sb.toString()));
                } else {
                    textView.setText(Html.fromHtml(marker.getTitle()));
                }
                return inflate;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void setOnFeatureClickListener(final Layer.OnFeatureClickListener onFeatureClickListener) {
        this.mPolygons.setOnPolygonClickListener(new GoogleMap.OnPolygonClickListener() {
            public void onPolygonClick(Polygon polygon) {
                if (Renderer.this.getFeature(polygon) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getFeature(polygon));
                } else if (Renderer.this.getContainerFeature(polygon) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getContainerFeature(polygon));
                } else {
                    Layer.OnFeatureClickListener onFeatureClickListener = onFeatureClickListener;
                    Renderer renderer = Renderer.this;
                    onFeatureClickListener.onFeatureClick(renderer.getFeature(renderer.multiObjectHandler(polygon)));
                }
            }
        });
        this.mMarkers.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            public boolean onMarkerClick(Marker marker) {
                if (Renderer.this.getFeature(marker) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getFeature(marker));
                    return false;
                } else if (Renderer.this.getContainerFeature(marker) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getContainerFeature(marker));
                    return false;
                } else {
                    Layer.OnFeatureClickListener onFeatureClickListener = onFeatureClickListener;
                    Renderer renderer = Renderer.this;
                    onFeatureClickListener.onFeatureClick(renderer.getFeature(renderer.multiObjectHandler(marker)));
                    return false;
                }
            }
        });
        this.mPolylines.setOnPolylineClickListener(new GoogleMap.OnPolylineClickListener() {
            public void onPolylineClick(Polyline polyline) {
                if (Renderer.this.getFeature(polyline) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getFeature(polyline));
                } else if (Renderer.this.getContainerFeature(polyline) != null) {
                    onFeatureClickListener.onFeatureClick(Renderer.this.getContainerFeature(polyline));
                } else {
                    Layer.OnFeatureClickListener onFeatureClickListener = onFeatureClickListener;
                    Renderer renderer = Renderer.this;
                    onFeatureClickListener.onFeatureClick(renderer.getFeature(renderer.multiObjectHandler(polyline)));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public ArrayList<?> multiObjectHandler(Object obj) {
        for (Object next : getValues()) {
            if (next.getClass().getSimpleName().equals("ArrayList")) {
                ArrayList<?> arrayList = (ArrayList) next;
                if (arrayList.contains(obj)) {
                    return arrayList;
                }
            }
        }
        return null;
    }
}
