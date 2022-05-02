package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.SphericalUtil;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import java.util.HashMap;
import javax.inject.Inject;
import o.DeviceManifest;
import o.WheelView;
import org.jetbrains.annotations.NotNull;

public class GriverDefaultLoadingView {
    public MarkerOptions IsOverlapping;
    public boolean equals;
    public HashMap<String, MarkerOptions> getMax = new HashMap<>();
    public HashMap<String, MarkerOptions> getMin = new HashMap<>();
    public Context isInside;
    public HashMap<String, MarkerOptions> length = new HashMap<>();
    public GoogleMap setMax;
    public BitmapDescriptor setMin;
    private final HashMap<String, BitmapDescriptor> toFloatRange = new HashMap<>();
    public LatLngBounds.Builder toIntRange;

    @Inject
    public GriverDefaultLoadingView(Context context) {
        this.isInside = context;
    }

    public final boolean length(Location location) {
        GoogleMap googleMap = this.setMax;
        if (googleMap != null && !googleMap.getProjection().getVisibleRegion().latLngBounds.contains(WheelView.ScrollerTask.setMin(location))) {
            return true;
        }
        return false;
    }

    public static CameraUpdate setMax(LatLng latLng, float f) {
        return CameraUpdateFactory.newLatLngZoom(latLng, f);
    }

    public final MarkerOptions setMin(Location location, Drawable drawable) {
        LatLng min = WheelView.ScrollerTask.setMin(location);
        if (this.IsOverlapping == null) {
            if (!this.equals) {
                this.IsOverlapping = new MarkerOptions().icon(BitmapDescriptorFactory.fromBitmap(BitmapFactory.decodeResource(this.isInside.getResources(), R.drawable.ic_user_indicator))).zIndex(1.0f);
            } else {
                this.IsOverlapping = new MarkerOptions().icon(DeviceManifest.AnonymousClass1.setMax(this.isInside, drawable)).zIndex(0.1f);
            }
        }
        this.IsOverlapping.position(min);
        return this.IsOverlapping;
    }

    public static BitmapDescriptor getMax(Bitmap bitmap) {
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    public static String getMin(String str, LatLng latLng, Drawable drawable, String str2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(latLng.toString());
        sb.append(drawable.toString());
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public final MarkerOptions getMax(ShopModel shopModel) {
        LatLng min = WheelView.ScrollerTask.setMin(shopModel.invokeSuspend());
        String min2 = setMin(shopModel.invokeSuspend(), shopModel.b, shopModel.getInterfaceDescriptor, false, true);
        BitmapDescriptor bitmapDescriptor = this.toFloatRange.get(min2);
        if (bitmapDescriptor == null) {
            bitmapDescriptor = DeviceManifest.AnonymousClass1.setMin(this.isInside, shopModel, true);
            this.toFloatRange.put(min2, bitmapDescriptor);
        }
        MarkerOptions markerOptions = this.getMin.get(min2);
        if (markerOptions == null) {
            markerOptions = new MarkerOptions().position(min).icon(bitmapDescriptor).zIndex((float) shopModel.setDefaultImpl).anchor(0.5f, 1.0f);
            this.getMin.put(min2, markerOptions);
        }
        return markerOptions.zIndex((float) shopModel.setDefaultImpl);
    }

    private static String setMin(Location location, String str, int i, boolean z, boolean z2) {
        int i2 = z ? R.layout.view_new_shop_highlight_marker : R.layout.view_new_shop_marker;
        String str2 = z2 ? "" : "nolabel";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(WheelView.ScrollerTask.setMin(location).toString());
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public final MarkerOptions getMin(ShopModel shopModel) {
        LatLng min = WheelView.ScrollerTask.setMin(shopModel.invokeSuspend());
        String min2 = setMin(shopModel.invokeSuspend(), shopModel.b, shopModel.getInterfaceDescriptor, true, true);
        MarkerOptions markerOptions = this.getMin.get(min2);
        if (markerOptions != null) {
            return markerOptions;
        }
        MarkerOptions anchor = new MarkerOptions().position(min).icon(DeviceManifest.AnonymousClass1.getMax(this.isInside, shopModel, true)).zIndex(Float.MAX_VALUE).anchor(0.5f, 1.0f);
        this.getMin.put(min2, anchor);
        return anchor;
    }

    public final void setMax(GoogleMap googleMap, GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.setMax = googleMap;
        if (googleMap != null) {
            googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this.isInside, R.raw.f75452131820555));
        }
        length();
        googleMap.getUiSettings().setMapToolbarEnabled(false);
        googleMap.getUiSettings().setCompassEnabled(false);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.setOnMarkerClickListener(onMarkerClickListener);
    }

    private void length() {
        GoogleMap googleMap = this.setMax;
        if (googleMap != null) {
            googleMap.setMinZoomPreference(this.equals ? 0.0f : 13.0f);
            this.setMax.setMaxZoomPreference(this.equals ? 21.0f : 20.0f);
        }
    }

    public static LatLngBounds.Builder setMin(@NotNull LatLngBounds.Builder builder, @NotNull LatLng latLng, double d) {
        for (double d2 = 0.0d; d2 <= 270.0d; d2 += 90.0d) {
            builder.include(SphericalUtil.computeOffset(latLng, 1000.0d * d, d2));
        }
        return builder;
    }

    public final boolean getMin(Marker marker, Marker marker2, ShopModel shopModel) {
        if (this.setMax == null) {
            return false;
        }
        ShopModel shopModel2 = (ShopModel) marker.getTag();
        ShopModel shopModel3 = (ShopModel) marker2.getTag();
        if (shopModel2 == null || shopModel3 == null) {
            return false;
        }
        return length(this.setMax.getProjection().toScreenLocation(marker.getPosition()), this.setMax.getProjection().toScreenLocation(marker2.getPosition()), shopModel2, shopModel3, shopModel);
    }

    private Rect length(Point point, ShopModel shopModel, boolean z) {
        int i;
        int max = DeviceManifest.AnonymousClass1.setMax(this.isInside, shopModel.Grayscale$Algorithm(), z);
        if (!z) {
            i = DeviceManifest.AnonymousClass1.length();
        } else {
            i = DeviceManifest.AnonymousClass1.setMin();
        }
        int i2 = point.x - (max / 2);
        return new Rect(i2, point.y - i, max + i2, point.y);
    }

    public final BitmapDescriptor length(ShopModel shopModel, boolean z, boolean z2) {
        BitmapDescriptor bitmapDescriptor;
        String min = setMin(shopModel.invokeSuspend(), shopModel.b, shopModel.getInterfaceDescriptor, z, z2);
        BitmapDescriptor bitmapDescriptor2 = this.toFloatRange.get(min);
        if (bitmapDescriptor2 != null) {
            return bitmapDescriptor2;
        }
        if (z) {
            bitmapDescriptor = DeviceManifest.AnonymousClass1.getMax(this.isInside, shopModel, z2);
        } else {
            bitmapDescriptor = DeviceManifest.AnonymousClass1.setMin(this.isInside, shopModel, z2);
        }
        BitmapDescriptor bitmapDescriptor3 = bitmapDescriptor;
        this.toFloatRange.put(min, bitmapDescriptor3);
        return bitmapDescriptor3;
    }

    private boolean length(Point point, Point point2, ShopModel shopModel, ShopModel shopModel2, ShopModel shopModel3) {
        boolean z = true;
        Rect length2 = length(point, shopModel, shopModel3 != null && shopModel.setMin(shopModel3.b));
        if (shopModel3 == null || !shopModel2.setMin(shopModel3.b)) {
            z = false;
        }
        return Rect.intersects(length2, length(point2, shopModel2, z));
    }
}
