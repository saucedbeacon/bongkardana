package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\f¨\u0006\""}, d2 = {"Lid/dana/data/autoroute/model/UserAutoRouteConfigStoreRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "autoroute", "", "authenticationType", "", "securityId", "validateData", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthenticationType", "()Ljava/lang/String;", "setAuthenticationType", "(Ljava/lang/String;)V", "getAutoroute", "()Ljava/lang/Boolean;", "setAutoroute", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getSecurityId", "setSecurityId", "getValidateData", "setValidateData", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lid/dana/data/autoroute/model/UserAutoRouteConfigStoreRequest;", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isNotVisible extends BaseRpcRequest {
    @Nullable
    private String authenticationType;
    @Nullable
    private Boolean autoroute;
    @Nullable
    private String securityId;
    @Nullable
    private String validateData;

    public isNotVisible() {
        this((Boolean) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ isNotVisible copy$default(isNotVisible isnotvisible, Boolean bool, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = isnotvisible.autoroute;
        }
        if ((i & 2) != 0) {
            str = isnotvisible.authenticationType;
        }
        if ((i & 4) != 0) {
            str2 = isnotvisible.securityId;
        }
        if ((i & 8) != 0) {
            str3 = isnotvisible.validateData;
        }
        return isnotvisible.copy(bool, str, str2, str3);
    }

    @Nullable
    public final Boolean component1() {
        return this.autoroute;
    }

    @Nullable
    public final String component2() {
        return this.authenticationType;
    }

    @Nullable
    public final String component3() {
        return this.securityId;
    }

    @Nullable
    public final String component4() {
        return this.validateData;
    }

    @NotNull
    public final isNotVisible copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new isNotVisible(bool, str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isNotVisible)) {
            return false;
        }
        isNotVisible isnotvisible = (isNotVisible) obj;
        return Intrinsics.areEqual((Object) this.autoroute, (Object) isnotvisible.autoroute) && Intrinsics.areEqual((Object) this.authenticationType, (Object) isnotvisible.authenticationType) && Intrinsics.areEqual((Object) this.securityId, (Object) isnotvisible.securityId) && Intrinsics.areEqual((Object) this.validateData, (Object) isnotvisible.validateData);
    }

    public final int hashCode() {
        Boolean bool = this.autoroute;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.authenticationType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.securityId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.validateData;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAutoRouteConfigStoreRequest(autoroute=");
        sb.append(this.autoroute);
        sb.append(", authenticationType=");
        sb.append(this.authenticationType);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(", validateData=");
        sb.append(this.validateData);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ isNotVisible(Boolean bool, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    @Nullable
    public final Boolean getAutoroute() {
        return this.autoroute;
    }

    public final void setAutoroute(@Nullable Boolean bool) {
        this.autoroute = bool;
    }

    @Nullable
    public final String getAuthenticationType() {
        return this.authenticationType;
    }

    public final void setAuthenticationType(@Nullable String str) {
        this.authenticationType = str;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-678963065, oncanceled);
            onCancelLoad.getMin(-678963065, oncanceled);
        }
        this.securityId = str;
    }

    @Nullable
    public final String getValidateData() {
        return this.validateData;
    }

    public final void setValidateData(@Nullable String str) {
        this.validateData = str;
    }

    public isNotVisible(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.autoroute = bool;
        this.authenticationType = str;
        this.securityId = str2;
        this.validateData = str3;
    }
}
