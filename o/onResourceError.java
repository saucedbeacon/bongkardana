package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.danah5.bioutility.BioUtilityBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lid/dana/data/twilio/repository/source/network/request/VerifySecurityProductRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "securityId", "", "verificationMethod", "validateData", "sendOtpStrategy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSecurityId", "()Ljava/lang/String;", "getSendOtpStrategy", "getValidateData", "getVerificationMethod", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onResourceError extends BaseRpcRequest {
    @NotNull
    private final String securityId;
    @NotNull
    private final String sendOtpStrategy;
    @NotNull
    private final String validateData;
    @NotNull
    private final String verificationMethod;

    public onResourceError() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ onResourceError copy$default(onResourceError onresourceerror, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onresourceerror.securityId;
        }
        if ((i & 2) != 0) {
            str2 = onresourceerror.verificationMethod;
        }
        if ((i & 4) != 0) {
            str3 = onresourceerror.validateData;
        }
        if ((i & 8) != 0) {
            str4 = onresourceerror.sendOtpStrategy;
        }
        return onresourceerror.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.securityId;
    }

    @NotNull
    public final String component2() {
        return this.verificationMethod;
    }

    @NotNull
    public final String component3() {
        return this.validateData;
    }

    @NotNull
    public final String component4() {
        return this.sendOtpStrategy;
    }

    @NotNull
    public final onResourceError copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, "validateData");
        Intrinsics.checkNotNullParameter(str4, "sendOtpStrategy");
        return new onResourceError(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onResourceError)) {
            return false;
        }
        onResourceError onresourceerror = (onResourceError) obj;
        return Intrinsics.areEqual((Object) this.securityId, (Object) onresourceerror.securityId) && Intrinsics.areEqual((Object) this.verificationMethod, (Object) onresourceerror.verificationMethod) && Intrinsics.areEqual((Object) this.validateData, (Object) onresourceerror.validateData) && Intrinsics.areEqual((Object) this.sendOtpStrategy, (Object) onresourceerror.sendOtpStrategy);
    }

    public final int hashCode() {
        String str = this.securityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.verificationMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.validateData;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sendOtpStrategy;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifySecurityProductRequest(securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethod=");
        sb.append(this.verificationMethod);
        sb.append(", validateData=");
        sb.append(this.validateData);
        sb.append(", sendOtpStrategy=");
        sb.append(this.sendOtpStrategy);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSecurityId() {
        return this.securityId;
    }

    @NotNull
    public final String getVerificationMethod() {
        return this.verificationMethod;
    }

    @NotNull
    public final String getValidateData() {
        return this.validateData;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ onResourceError(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    @NotNull
    public final String getSendOtpStrategy() {
        return this.sendOtpStrategy;
    }

    public onResourceError(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, "validateData");
        Intrinsics.checkNotNullParameter(str4, "sendOtpStrategy");
        this.securityId = str;
        this.verificationMethod = str2;
        this.validateData = str3;
        this.sendOtpStrategy = str4;
    }
}
