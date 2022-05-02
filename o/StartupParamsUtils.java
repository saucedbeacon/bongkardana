package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\""}, d2 = {"Lid/dana/domain/ott/OttVerifyResult;", "Lid/dana/domain/model/rpc/response/BaseRpcResponse;", "userId", "", "merchantId", "needLogout", "", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getMerchantId", "()Ljava/lang/String;", "setMerchantId", "(Ljava/lang/String;)V", "getNeedLogout", "()Ljava/lang/Boolean;", "setNeedLogout", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPhoneNumber", "setPhoneNumber", "getUserId", "setUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lid/dana/domain/ott/OttVerifyResult;", "equals", "other", "", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class StartupParamsUtils extends initWithSecurityGuard {
    @Nullable
    private String merchantId;
    @Nullable
    private Boolean needLogout;
    @Nullable
    private String phoneNumber;
    @Nullable
    private String userId;

    public StartupParamsUtils() {
        this((String) null, (String) null, (Boolean) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StartupParamsUtils copy$default(StartupParamsUtils startupParamsUtils, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startupParamsUtils.userId;
        }
        if ((i & 2) != 0) {
            str2 = startupParamsUtils.merchantId;
        }
        if ((i & 4) != 0) {
            bool = startupParamsUtils.needLogout;
        }
        if ((i & 8) != 0) {
            str3 = startupParamsUtils.phoneNumber;
        }
        return startupParamsUtils.copy(str, str2, bool, str3);
    }

    @Nullable
    public final String component1() {
        return this.userId;
    }

    @Nullable
    public final String component2() {
        return this.merchantId;
    }

    @Nullable
    public final Boolean component3() {
        return this.needLogout;
    }

    @Nullable
    public final String component4() {
        return this.phoneNumber;
    }

    @NotNull
    public final StartupParamsUtils copy(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        return new StartupParamsUtils(str, str2, bool, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartupParamsUtils)) {
            return false;
        }
        StartupParamsUtils startupParamsUtils = (StartupParamsUtils) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) startupParamsUtils.userId) && Intrinsics.areEqual((Object) this.merchantId, (Object) startupParamsUtils.merchantId) && Intrinsics.areEqual((Object) this.needLogout, (Object) startupParamsUtils.needLogout) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) startupParamsUtils.phoneNumber);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.needLogout;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.phoneNumber;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OttVerifyResult(userId=");
        sb.append(this.userId);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", needLogout=");
        sb.append(this.needLogout);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @Nullable
    public final String getMerchantId() {
        return this.merchantId;
    }

    public final void setMerchantId(@Nullable String str) {
        this.merchantId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StartupParamsUtils(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? "" : str3);
    }

    @Nullable
    public final Boolean getNeedLogout() {
        return this.needLogout;
    }

    public final void setNeedLogout(@Nullable Boolean bool) {
        this.needLogout = bool;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public StartupParamsUtils(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3) {
        this.userId = str;
        this.merchantId = str2;
        this.needLogout = bool;
        this.phoneNumber = str3;
    }
}
