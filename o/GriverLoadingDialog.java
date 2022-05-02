package o;

import android.graphics.drawable.Drawable;
import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0003\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JS\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0003\u0010\r\u001a\u00020\u0007HÆ\u0001J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\u0006\u0010+\u001a\u00020,J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006."}, d2 = {"Lid/dana/utils/MarkerPayload;", "", "shopId", "", "location", "Landroid/location/Location;", "inflatedLayout", "", "resource", "Landroid/graphics/drawable/Drawable;", "loadedLayout", "zIndex", "", "background", "(Ljava/lang/String;Landroid/location/Location;ILandroid/graphics/drawable/Drawable;IFI)V", "getBackground", "()I", "getInflatedLayout", "getLoadedLayout", "getLocation", "()Landroid/location/Location;", "getResource", "()Landroid/graphics/drawable/Drawable;", "getShopId", "()Ljava/lang/String;", "getZIndex", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "createCustomBitmapWithLottie", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "equals", "", "other", "hashCode", "locationToLatLon", "Lcom/google/android/gms/maps/model/LatLng;", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverLoadingDialog {
    @Nullable
    private final Location IsOverlapping;
    public final float getMax;
    @NotNull
    public final String getMin;
    public final int isInside;
    @Nullable
    public final Drawable length;
    public final int setMax = R.layout.view_promo_marker;
    public final int setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverLoadingDialog)) {
            return false;
        }
        GriverLoadingDialog griverLoadingDialog = (GriverLoadingDialog) obj;
        return Intrinsics.areEqual((Object) this.getMin, (Object) griverLoadingDialog.getMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) griverLoadingDialog.IsOverlapping) && this.setMax == griverLoadingDialog.setMax && Intrinsics.areEqual((Object) this.length, (Object) griverLoadingDialog.length) && this.setMin == griverLoadingDialog.setMin && Float.compare(this.getMax, griverLoadingDialog.getMax) == 0 && this.isInside == griverLoadingDialog.isInside;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerPayload(shopId=");
        sb.append(this.getMin);
        sb.append(", location=");
        sb.append(this.IsOverlapping);
        sb.append(", inflatedLayout=");
        sb.append(this.setMax);
        sb.append(", resource=");
        sb.append(this.length);
        sb.append(", loadedLayout=");
        sb.append(this.setMin);
        sb.append(", zIndex=");
        sb.append(this.getMax);
        sb.append(", background=");
        sb.append(this.isInside);
        sb.append(")");
        return sb.toString();
    }

    public GriverLoadingDialog(@NotNull String str, @Nullable Location location, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.SHOP_ID);
        this.getMin = str;
        this.IsOverlapping = location;
        this.length = drawable;
        this.setMin = R.id.f50332131363588;
        this.getMax = 0.1f;
        this.isInside = R.drawable.ic_img_merchant_promo;
    }

    @NotNull
    public final LatLng length() {
        if (this.IsOverlapping != null) {
            return new LatLng(this.IsOverlapping.getLatitude(), this.IsOverlapping.getLongitude());
        }
        LatLng latLng = new LatLng(-6.17476d, 106.827072d);
        Intrinsics.checkNotNullExpressionValue(latLng, "getDefaultLatLon()");
        return latLng;
    }

    public final int hashCode() {
        String str = this.getMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Location location = this.IsOverlapping;
        int hashCode2 = (((hashCode + (location != null ? location.hashCode() : 0)) * 31) + Integer.valueOf(this.setMax).hashCode()) * 31;
        Drawable drawable = this.length;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31) + Float.valueOf(this.getMax).hashCode()) * 31) + Integer.valueOf(this.isInside).hashCode();
    }
}
