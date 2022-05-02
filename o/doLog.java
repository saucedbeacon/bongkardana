package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f¨\u0006\u001e"}, d2 = {"Lid/dana/model/OttVerifyModel;", "", "userId", "", "merchantId", "isNeedLogout", "", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "()Z", "setNeedLogout", "(Z)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getPhoneNumber", "setPhoneNumber", "getUserId", "setUserId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class doLog {
    @NotNull
    private String getMax;
    @NotNull
    public String length;
    private boolean setMax;
    @NotNull
    private String setMin;

    public doLog() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doLog)) {
            return false;
        }
        doLog dolog = (doLog) obj;
        return Intrinsics.areEqual((Object) this.getMax, (Object) dolog.getMax) && Intrinsics.areEqual((Object) this.setMin, (Object) dolog.setMin) && this.setMax == dolog.setMax && Intrinsics.areEqual((Object) this.length, (Object) dolog.length);
    }

    public final int hashCode() {
        String str = this.getMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.setMax;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.length;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OttVerifyModel(userId=");
        sb.append(this.getMax);
        sb.append(", merchantId=");
        sb.append(this.setMin);
        sb.append(", isNeedLogout=");
        sb.append(this.setMax);
        sb.append(", phoneNumber=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    public doLog(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(str3, "phoneNumber");
        this.getMax = str;
        this.setMin = str2;
        this.setMax = z;
        this.length = str3;
    }

    public final boolean getMin() {
        return this.setMax;
    }

    private /* synthetic */ doLog(byte b) {
        this("", "", false, "");
    }
}
