package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.initializer.FirebaseCrashlyticsInitializer;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b¨\u0006\u001e"}, d2 = {"Lid/dana/investment/model/InvestmentUnitModel;", "", "type", "", "unit", "", "unitValue", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUnit", "()Ljava/lang/Long;", "setUnit", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getUnitValue", "setUnitValue", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lid/dana/investment/model/InvestmentUnitModel;", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverEmbedViewBridgeExtension {
    @Nullable
    private String getMax;
    @Nullable
    private Long setMax;
    @Nullable
    private String setMin;

    public GriverEmbedViewBridgeExtension() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverEmbedViewBridgeExtension)) {
            return false;
        }
        GriverEmbedViewBridgeExtension griverEmbedViewBridgeExtension = (GriverEmbedViewBridgeExtension) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) griverEmbedViewBridgeExtension.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) griverEmbedViewBridgeExtension.setMax) && Intrinsics.areEqual((Object) this.getMax, (Object) griverEmbedViewBridgeExtension.getMax);
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.setMax;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.getMax;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InvestmentUnitModel(type=");
        sb.append(this.setMin);
        sb.append(", unit=");
        sb.append(this.setMax);
        sb.append(", unitValue=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public GriverEmbedViewBridgeExtension(@Nullable String str, @Nullable Long l, @Nullable String str2) {
        this.setMin = str;
        this.setMax = l;
        this.getMax = str2;
    }

    private /* synthetic */ GriverEmbedViewBridgeExtension(byte b) {
        this("", (Long) null, "");
    }

    /* renamed from: o.GriverEmbedViewBridgeExtension$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<FirebaseCrashlyticsInitializer> {
        @InjectedFieldSignature("id.dana.initializer.FirebaseCrashlyticsInitializer.loginLogoutObserver")
        public static void setMin(FirebaseCrashlyticsInitializer firebaseCrashlyticsInitializer, LoginLogoutObserver loginLogoutObserver) {
            firebaseCrashlyticsInitializer.loginLogoutObserver = loginLogoutObserver;
        }
    }
}
