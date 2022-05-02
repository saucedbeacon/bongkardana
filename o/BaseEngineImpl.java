package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.danah5.bioutility.BioUtilityBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lid/dana/data/merchantmanagement/repository/source/network/request/UnbindMerchantRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "clientId", "", "merchantId", "divisionId", "validateData", "securityId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getDivisionId", "getMerchantId", "getSecurityId", "getValidateData", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BaseEngineImpl extends BaseRpcRequest {
    @NotNull
    private final String clientId;
    @Nullable
    private final String divisionId;
    @NotNull
    private final String merchantId;
    @NotNull
    private final String securityId;
    @NotNull
    private final String validateData;

    public static /* synthetic */ BaseEngineImpl copy$default(BaseEngineImpl baseEngineImpl, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = baseEngineImpl.clientId;
        }
        if ((i & 2) != 0) {
            str2 = baseEngineImpl.merchantId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = baseEngineImpl.divisionId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = baseEngineImpl.validateData;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = baseEngineImpl.securityId;
        }
        return baseEngineImpl.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.clientId;
    }

    @NotNull
    public final String component2() {
        return this.merchantId;
    }

    @Nullable
    public final String component3() {
        return this.divisionId;
    }

    @NotNull
    public final String component4() {
        return this.validateData;
    }

    @NotNull
    public final String component5() {
        return this.securityId;
    }

    @NotNull
    public final BaseEngineImpl copy(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(str4, "validateData");
        Intrinsics.checkNotNullParameter(str5, BioUtilityBridge.SECURITY_ID);
        return new BaseEngineImpl(str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseEngineImpl)) {
            return false;
        }
        BaseEngineImpl baseEngineImpl = (BaseEngineImpl) obj;
        return Intrinsics.areEqual((Object) this.clientId, (Object) baseEngineImpl.clientId) && Intrinsics.areEqual((Object) this.merchantId, (Object) baseEngineImpl.merchantId) && Intrinsics.areEqual((Object) this.divisionId, (Object) baseEngineImpl.divisionId) && Intrinsics.areEqual((Object) this.validateData, (Object) baseEngineImpl.validateData) && Intrinsics.areEqual((Object) this.securityId, (Object) baseEngineImpl.securityId);
    }

    public final int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.merchantId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.divisionId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.validateData;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.securityId;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UnbindMerchantRequest(clientId=");
        sb.append(this.clientId);
        sb.append(", merchantId=");
        sb.append(this.merchantId);
        sb.append(", divisionId=");
        sb.append(this.divisionId);
        sb.append(", validateData=");
        sb.append(this.validateData);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getMerchantId() {
        return this.merchantId;
    }

    @Nullable
    public final String getDivisionId() {
        return this.divisionId;
    }

    @NotNull
    public final String getValidateData() {
        return this.validateData;
    }

    @NotNull
    public final String getSecurityId() {
        return this.securityId;
    }

    public BaseEngineImpl(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "merchantId");
        Intrinsics.checkNotNullParameter(str4, "validateData");
        Intrinsics.checkNotNullParameter(str5, BioUtilityBridge.SECURITY_ID);
        this.clientId = str;
        this.merchantId = str2;
        this.divisionId = str3;
        this.validateData = str4;
        this.securityId = str5;
    }
}
