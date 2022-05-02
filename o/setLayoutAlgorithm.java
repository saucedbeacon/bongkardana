package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lid/dana/domain/electronicmoney/model/response/EmoneyReversal;", "", "success", "", "errorCode", "", "approvalCode", "message", "data", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getApprovalCode", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getErrorCode", "getMessage", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setLayoutAlgorithm {
    @NotNull
    private final String approvalCode;
    @NotNull
    private final Map<String, String> data;
    @NotNull
    private final String errorCode;
    @NotNull
    private final String message;
    private final boolean success;

    public static /* synthetic */ setLayoutAlgorithm copy$default(setLayoutAlgorithm setlayoutalgorithm, boolean z, String str, String str2, String str3, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setlayoutalgorithm.success;
        }
        if ((i & 2) != 0) {
            str = setlayoutalgorithm.errorCode;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = setlayoutalgorithm.approvalCode;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = setlayoutalgorithm.message;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            map = setlayoutalgorithm.data;
        }
        return setlayoutalgorithm.copy(z, str4, str5, str6, map);
    }

    public final boolean component1() {
        return this.success;
    }

    @NotNull
    public final String component2() {
        return this.errorCode;
    }

    @NotNull
    public final String component3() {
        return this.approvalCode;
    }

    @NotNull
    public final String component4() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.data;
    }

    @NotNull
    public final setLayoutAlgorithm copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        Intrinsics.checkNotNullParameter(str2, "approvalCode");
        Intrinsics.checkNotNullParameter(str3, "message");
        Intrinsics.checkNotNullParameter(map, "data");
        return new setLayoutAlgorithm(z, str, str2, str3, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLayoutAlgorithm)) {
            return false;
        }
        setLayoutAlgorithm setlayoutalgorithm = (setLayoutAlgorithm) obj;
        return this.success == setlayoutalgorithm.success && Intrinsics.areEqual((Object) this.errorCode, (Object) setlayoutalgorithm.errorCode) && Intrinsics.areEqual((Object) this.approvalCode, (Object) setlayoutalgorithm.approvalCode) && Intrinsics.areEqual((Object) this.message, (Object) setlayoutalgorithm.message) && Intrinsics.areEqual((Object) this.data, (Object) setlayoutalgorithm.data);
    }

    public final int hashCode() {
        boolean z = this.success;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.errorCode;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.approvalCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.message;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode3 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyReversal(success=");
        sb.append(this.success);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", approvalCode=");
        sb.append(this.approvalCode);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public setLayoutAlgorithm(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "errorCode");
        Intrinsics.checkNotNullParameter(str2, "approvalCode");
        Intrinsics.checkNotNullParameter(str3, "message");
        Intrinsics.checkNotNullParameter(map, "data");
        this.success = z;
        this.errorCode = str;
        this.approvalCode = str2;
        this.message = str3;
        this.data = map;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    @NotNull
    public final String getApprovalCode() {
        return this.approvalCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }
}
