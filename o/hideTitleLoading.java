package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fHÆ\u0003Jq\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\fHÆ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006,"}, d2 = {"Lid/dana/lib/electronicmoney/mandiri/model/EmoneyApiResult;", "Lid/dana/lib/electronicmoney/mandiri/model/BaseApiResult;", "success", "", "errorCode", "", "transactionId", "approvalCode", "type", "pendingTopup", "session", "data", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getApprovalCode", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getErrorCode", "setErrorCode", "(Ljava/lang/String;)V", "getPendingTopup", "getSession", "getSuccess", "()Z", "setSuccess", "(Z)V", "getTransactionId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "", "toString", "electronicmoney_release"}, k = 1, mv = {1, 4, 0})
public final class hideTitleLoading extends onTransact {
    @Nullable
    public final String IsOverlapping;
    @Nullable
    public final String equals;
    public boolean getMax;
    @Nullable
    public final String isInside;
    @Nullable
    public String length;
    @Nullable
    public final String setMin;
    @Nullable
    public final String toFloatRange;
    @NotNull
    public final Map<String, String> toIntRange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hideTitleLoading(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @NotNull Map<String, String> map) {
        super(z, str);
        Intrinsics.checkNotNullParameter(map, "data");
        this.getMax = z;
        this.length = str;
        this.setMin = str2;
        this.toFloatRange = str3;
        this.IsOverlapping = str4;
        this.equals = str5;
        this.isInside = str6;
        this.toIntRange = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hideTitleLoading(boolean z, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(z, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, map);
    }

    public final boolean setMin() {
        return this.getMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyApiResult(success=");
        sb.append(setMin());
        sb.append(", errorCode=");
        sb.append(this.length);
        sb.append(", transactionId=");
        sb.append(this.setMin);
        sb.append(", approvalCode=");
        sb.append(this.toFloatRange);
        sb.append(", type=");
        sb.append(this.IsOverlapping);
        sb.append(", pendingTopup=");
        sb.append(this.equals);
        sb.append(", session=");
        sb.append(this.isInside);
        sb.append(", data=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        boolean min = setMin();
        if (min) {
            min = true;
        }
        int i = (min ? 1 : 0) * true;
        String str = this.length;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.setMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.toFloatRange;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.IsOverlapping;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.equals;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.isInside;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Map<String, String> map = this.toIntRange;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode6 + i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hideTitleLoading)) {
            return false;
        }
        hideTitleLoading hidetitleloading = (hideTitleLoading) obj;
        return setMin() == hidetitleloading.setMin() && Intrinsics.areEqual((Object) this.length, (Object) hidetitleloading.length) && Intrinsics.areEqual((Object) this.setMin, (Object) hidetitleloading.setMin) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) hidetitleloading.toFloatRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) hidetitleloading.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) hidetitleloading.equals) && Intrinsics.areEqual((Object) this.isInside, (Object) hidetitleloading.isInside) && Intrinsics.areEqual((Object) this.toIntRange, (Object) hidetitleloading.toIntRange);
    }
}
