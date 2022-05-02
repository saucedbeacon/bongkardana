package o;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00058FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lid/dana/geofence/model/PoiModel;", "", "poiId", "", "lat", "", "long", "radius", "", "(Ljava/lang/String;DDI)V", "latitude", "getLatitude", "()D", "latitude$delegate", "Lkotlin/Lazy;", "longitude", "getLongitude", "longitude$delegate", "getPoiId", "()Ljava/lang/String;", "getRadius", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IBLETraceMonitor {
    /* access modifiers changed from: private */
    public final double IsOverlapping;
    public final int getMax;
    @NotNull
    public final Lazy getMin;
    @NotNull
    public final Lazy length;
    /* access modifiers changed from: private */
    public final double setMax;
    @NotNull
    public final String setMin;

    public IBLETraceMonitor() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBLETraceMonitor)) {
            return false;
        }
        IBLETraceMonitor iBLETraceMonitor = (IBLETraceMonitor) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) iBLETraceMonitor.setMin) && Double.compare(this.setMax, iBLETraceMonitor.setMax) == 0 && Double.compare(this.IsOverlapping, iBLETraceMonitor.IsOverlapping) == 0 && this.getMax == iBLETraceMonitor.getMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiModel(poiId=");
        sb.append(this.setMin);
        sb.append(", lat=");
        sb.append(this.setMax);
        sb.append(", long=");
        sb.append(this.IsOverlapping);
        sb.append(", radius=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public IBLETraceMonitor(@NotNull String str, double d, double d2, int i) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        this.setMin = str;
        this.setMax = d;
        this.IsOverlapping = d2;
        this.getMax = i;
        this.getMin = LazyKt.lazy(new getMax(this));
        this.length = LazyKt.lazy(new setMax(this));
    }

    private /* synthetic */ IBLETraceMonitor(byte b) {
        this("", 0.0d, 0.0d, 100);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Double> {
        final /* synthetic */ IBLETraceMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(IBLETraceMonitor iBLETraceMonitor) {
            super(0);
            this.this$0 = iBLETraceMonitor;
        }

        public final double invoke() {
            if (this.this$0.setMax < -90.0d || 90.0d < this.this$0.setMax) {
                return this.this$0.setMax < 0.0d ? -89.0d : 89.0d;
            }
            return this.this$0.setMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Double> {
        final /* synthetic */ IBLETraceMonitor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(IBLETraceMonitor iBLETraceMonitor) {
            super(0);
            this.this$0 = iBLETraceMonitor;
        }

        public final double invoke() {
            if (this.this$0.IsOverlapping < -180.0d || 180.0d < this.this$0.IsOverlapping) {
                return this.this$0.IsOverlapping < 0.0d ? -179.0d : 179.0d;
            }
            return this.this$0.IsOverlapping;
        }
    }

    public final int hashCode() {
        String str = this.setMin;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Double.valueOf(this.setMax).hashCode()) * 31) + Double.valueOf(this.IsOverlapping).hashCode()) * 31) + Integer.valueOf(this.getMax).hashCode();
    }
}
