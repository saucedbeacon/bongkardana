package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/domain/nearbyme/model/PromoLimitInfo;", "", "limitType", "", "limitCount", "limitRangeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLimitCount", "()Ljava/lang/String;", "setLimitCount", "(Ljava/lang/String;)V", "getLimitRangeType", "setLimitRangeType", "getLimitType", "setLimitType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverBundleUtils {
    @Nullable
    private String limitCount;
    @Nullable
    private String limitRangeType;
    @Nullable
    private String limitType;

    public GriverBundleUtils() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverBundleUtils copy$default(GriverBundleUtils griverBundleUtils, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverBundleUtils.limitType;
        }
        if ((i & 2) != 0) {
            str2 = griverBundleUtils.limitCount;
        }
        if ((i & 4) != 0) {
            str3 = griverBundleUtils.limitRangeType;
        }
        return griverBundleUtils.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.limitType;
    }

    @Nullable
    public final String component2() {
        return this.limitCount;
    }

    @Nullable
    public final String component3() {
        return this.limitRangeType;
    }

    @NotNull
    public final GriverBundleUtils copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new GriverBundleUtils(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverBundleUtils)) {
            return false;
        }
        GriverBundleUtils griverBundleUtils = (GriverBundleUtils) obj;
        return Intrinsics.areEqual((Object) this.limitType, (Object) griverBundleUtils.limitType) && Intrinsics.areEqual((Object) this.limitCount, (Object) griverBundleUtils.limitCount) && Intrinsics.areEqual((Object) this.limitRangeType, (Object) griverBundleUtils.limitRangeType);
    }

    public final int hashCode() {
        String str = this.limitType;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.limitCount;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.limitRangeType;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoLimitInfo(limitType=");
        sb.append(this.limitType);
        sb.append(", limitCount=");
        sb.append(this.limitCount);
        sb.append(", limitRangeType=");
        sb.append(this.limitRangeType);
        sb.append(")");
        return sb.toString();
    }

    public GriverBundleUtils(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.limitType = str;
        this.limitCount = str2;
        this.limitRangeType = str3;
    }

    @Nullable
    public final String getLimitType() {
        return this.limitType;
    }

    public final void setLimitType(@Nullable String str) {
        this.limitType = str;
    }

    @Nullable
    public final String getLimitCount() {
        return this.limitCount;
    }

    public final void setLimitCount(@Nullable String str) {
        this.limitCount = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverBundleUtils(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    @Nullable
    public final String getLimitRangeType() {
        return this.limitRangeType;
    }

    public final void setLimitRangeType(@Nullable String str) {
        this.limitRangeType = str;
    }
}
