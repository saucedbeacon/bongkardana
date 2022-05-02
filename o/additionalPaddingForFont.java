package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lid/dana/data/auth/face/repository/source/request/FaceAuthenticationEntityRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "faceAuthNew", "", "securityId", "", "verificationMethod", "validateData", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFaceAuthNew", "()Z", "setFaceAuthNew", "(Z)V", "getSecurityId", "()Ljava/lang/String;", "setSecurityId", "(Ljava/lang/String;)V", "getValidateData", "setValidateData", "getVerificationMethod", "setVerificationMethod", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class additionalPaddingForFont extends BaseRpcRequest {
    private boolean faceAuthNew;
    @Nullable
    private String securityId;
    @Nullable
    private String validateData;
    @Nullable
    private String verificationMethod;

    public additionalPaddingForFont() {
        this(false, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ additionalPaddingForFont copy$default(additionalPaddingForFont additionalpaddingforfont, boolean z, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = additionalpaddingforfont.faceAuthNew;
        }
        if ((i & 2) != 0) {
            str = additionalpaddingforfont.securityId;
        }
        if ((i & 4) != 0) {
            str2 = additionalpaddingforfont.verificationMethod;
        }
        if ((i & 8) != 0) {
            str3 = additionalpaddingforfont.validateData;
        }
        return additionalpaddingforfont.copy(z, str, str2, str3);
    }

    public final boolean component1() {
        return this.faceAuthNew;
    }

    @Nullable
    public final String component2() {
        return this.securityId;
    }

    @Nullable
    public final String component3() {
        return this.verificationMethod;
    }

    @Nullable
    public final String component4() {
        return this.validateData;
    }

    @NotNull
    public final additionalPaddingForFont copy(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new additionalPaddingForFont(z, str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof additionalPaddingForFont)) {
            return false;
        }
        additionalPaddingForFont additionalpaddingforfont = (additionalPaddingForFont) obj;
        return this.faceAuthNew == additionalpaddingforfont.faceAuthNew && Intrinsics.areEqual((Object) this.securityId, (Object) additionalpaddingforfont.securityId) && Intrinsics.areEqual((Object) this.verificationMethod, (Object) additionalpaddingforfont.verificationMethod) && Intrinsics.areEqual((Object) this.validateData, (Object) additionalpaddingforfont.validateData);
    }

    public final int hashCode() {
        boolean z = this.faceAuthNew;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.securityId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.verificationMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.validateData;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FaceAuthenticationEntityRequest(faceAuthNew=");
        sb.append(this.faceAuthNew);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethod=");
        sb.append(this.verificationMethod);
        sb.append(", validateData=");
        sb.append(this.validateData);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getFaceAuthNew() {
        return this.faceAuthNew;
    }

    public final void setFaceAuthNew(boolean z) {
        this.faceAuthNew = z;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    @Nullable
    public final String getVerificationMethod() {
        return this.verificationMethod;
    }

    public final void setVerificationMethod(@Nullable String str) {
        this.verificationMethod = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ additionalPaddingForFont(boolean z, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    @Nullable
    public final String getValidateData() {
        return this.validateData;
    }

    public final void setValidateData(@Nullable String str) {
        this.validateData = str;
    }

    public additionalPaddingForFont(boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.faceAuthNew = z;
        this.securityId = str;
        this.verificationMethod = str2;
        this.validateData = str3;
    }
}
