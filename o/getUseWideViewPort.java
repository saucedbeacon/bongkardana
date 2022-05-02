package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J}\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\rHÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lid/dana/domain/electronicmoney/model/response/EmoneyCardInfo;", "", "success", "", "errorCode", "", "apiVersion", "approvalCode", "message", "status", "pendingTopup", "session", "data", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getApiVersion", "()Ljava/lang/String;", "getApprovalCode", "getData", "()Ljava/util/Map;", "getErrorCode", "getMessage", "getPendingTopup", "getSession", "getStatus", "getSuccess", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getUseWideViewPort {
    @Nullable
    private final String apiVersion;
    @Nullable
    private final String approvalCode;
    @NotNull
    private final Map<String, String> data;
    @Nullable
    private final String errorCode;
    @Nullable
    private final String message;
    @Nullable
    private final String pendingTopup;
    @Nullable
    private final String session;
    @Nullable
    private final String status;
    private final boolean success;

    public static /* synthetic */ getUseWideViewPort copy$default(getUseWideViewPort getusewideviewport, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map, int i, Object obj) {
        getUseWideViewPort getusewideviewport2 = getusewideviewport;
        int i2 = i;
        return getusewideviewport.copy((i2 & 1) != 0 ? getusewideviewport2.success : z, (i2 & 2) != 0 ? getusewideviewport2.errorCode : str, (i2 & 4) != 0 ? getusewideviewport2.apiVersion : str2, (i2 & 8) != 0 ? getusewideviewport2.approvalCode : str3, (i2 & 16) != 0 ? getusewideviewport2.message : str4, (i2 & 32) != 0 ? getusewideviewport2.status : str5, (i2 & 64) != 0 ? getusewideviewport2.pendingTopup : str6, (i2 & 128) != 0 ? getusewideviewport2.session : str7, (i2 & 256) != 0 ? getusewideviewport2.data : map);
    }

    public final boolean component1() {
        return this.success;
    }

    @Nullable
    public final String component2() {
        return this.errorCode;
    }

    @Nullable
    public final String component3() {
        return this.apiVersion;
    }

    @Nullable
    public final String component4() {
        return this.approvalCode;
    }

    @Nullable
    public final String component5() {
        return this.message;
    }

    @Nullable
    public final String component6() {
        return this.status;
    }

    @Nullable
    public final String component7() {
        return this.pendingTopup;
    }

    @Nullable
    public final String component8() {
        return this.session;
    }

    @NotNull
    public final Map<String, String> component9() {
        return this.data;
    }

    @NotNull
    public final getUseWideViewPort copy(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull Map<String, String> map) {
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "data");
        return new getUseWideViewPort(z, str, str2, str3, str4, str5, str6, str7, map2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUseWideViewPort)) {
            return false;
        }
        getUseWideViewPort getusewideviewport = (getUseWideViewPort) obj;
        return this.success == getusewideviewport.success && Intrinsics.areEqual((Object) this.errorCode, (Object) getusewideviewport.errorCode) && Intrinsics.areEqual((Object) this.apiVersion, (Object) getusewideviewport.apiVersion) && Intrinsics.areEqual((Object) this.approvalCode, (Object) getusewideviewport.approvalCode) && Intrinsics.areEqual((Object) this.message, (Object) getusewideviewport.message) && Intrinsics.areEqual((Object) this.status, (Object) getusewideviewport.status) && Intrinsics.areEqual((Object) this.pendingTopup, (Object) getusewideviewport.pendingTopup) && Intrinsics.areEqual((Object) this.session, (Object) getusewideviewport.session) && Intrinsics.areEqual((Object) this.data, (Object) getusewideviewport.data);
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
        String str2 = this.apiVersion;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.approvalCode;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.message;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.status;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.pendingTopup;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.session;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, String> map = this.data;
        if (map != null) {
            i2 = map.hashCode();
        }
        return hashCode7 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyCardInfo(success=");
        sb.append(this.success);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", apiVersion=");
        sb.append(this.apiVersion);
        sb.append(", approvalCode=");
        sb.append(this.approvalCode);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", pendingTopup=");
        sb.append(this.pendingTopup);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public getUseWideViewPort(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "data");
        this.success = z;
        this.errorCode = str;
        this.apiVersion = str2;
        this.approvalCode = str3;
        this.message = str4;
        this.status = str5;
        this.pendingTopup = str6;
        this.session = str7;
        this.data = map;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    @Nullable
    public final String getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @Nullable
    public final String getApprovalCode() {
        return this.approvalCode;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getPendingTopup() {
        return this.pendingTopup;
    }

    @Nullable
    public final String getSession() {
        return this.session;
    }

    @NotNull
    public final Map<String, String> getData() {
        return this.data;
    }
}
