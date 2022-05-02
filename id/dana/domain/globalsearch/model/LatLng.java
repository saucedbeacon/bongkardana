package id.dana.domain.globalsearch.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lid/dana/domain/globalsearch/model/LatLng;", "Landroid/os/Parcelable;", "latitude", "", "longitude", "(Ljava/lang/String;Ljava/lang/String;)V", "", "(DD)V", "isUndefined", "", "()Z", "getLatitude", "()D", "setLatitude", "(D)V", "getLongitude", "setLongitude", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toGoogleLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new length();
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private double latitude;
    private double longitude;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class length implements Parcelable.Creator<LatLng> {
        @NotNull
        public final LatLng createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            return new LatLng(parcel.readDouble(), parcel.readDouble());
        }

        @NotNull
        public final LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    }

    public LatLng() {
        this(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ LatLng copy$default(LatLng latLng, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = latLng.latitude;
        }
        if ((i & 2) != 0) {
            d2 = latLng.longitude;
        }
        return latLng.copy(d, d2);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    @NotNull
    public final LatLng copy(double d, double d2) {
        return new LatLng(d, d2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.compare(this.latitude, latLng.latitude) == 0 && Double.compare(this.longitude, latLng.longitude) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LatLng(latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
    }

    public LatLng(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LatLng(double d, double d2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2);
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = kotlin.text.StringsKt.toDoubleOrNull(r5);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LatLng(@org.jetbrains.annotations.Nullable java.lang.String r5, @org.jetbrains.annotations.Nullable java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x000f
            java.lang.Double r5 = kotlin.text.StringsKt.toDoubleOrNull(r5)
            if (r5 == 0) goto L_0x000f
            double r2 = r5.doubleValue()
            goto L_0x0010
        L_0x000f:
            r2 = r0
        L_0x0010:
            if (r6 == 0) goto L_0x001c
            java.lang.Double r5 = kotlin.text.StringsKt.toDoubleOrNull(r6)
            if (r5 == 0) goto L_0x001c
            double r0 = r5.doubleValue()
        L_0x001c:
            r4.<init>((double) r2, (double) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.domain.globalsearch.model.LatLng.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean isUndefined() {
        return this.latitude == 0.0d && this.longitude == 0.0d;
    }

    @NotNull
    public final com.google.android.gms.maps.model.LatLng toGoogleLatLng() {
        return new com.google.android.gms.maps.model.LatLng(this.latitude, this.longitude);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lid/dana/domain/globalsearch/model/LatLng$Companion;", "", "()V", "monas", "Lid/dana/domain/globalsearch/model/LatLng;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LatLng monas() {
            return new LatLng(-6.17476d, 106.827072d);
        }
    }

    public final int hashCode() {
        return (Double.valueOf(this.latitude).hashCode() * 31) + Double.valueOf(this.longitude).hashCode();
    }
}
