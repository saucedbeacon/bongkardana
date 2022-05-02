package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lid/dana/domain/autoroute/model/Risk;", "", "result", "", "verificationMethod", "securityId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "getSecurityId", "setSecurityId", "getVerificationMethod", "setVerificationMethod", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverBackHomeButtonStyleExtension {
    @Nullable
    private String result;
    @Nullable
    private String securityId;
    @Nullable
    private String verificationMethod;

    public GriverBackHomeButtonStyleExtension() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GriverBackHomeButtonStyleExtension copy$default(GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = griverBackHomeButtonStyleExtension.result;
        }
        if ((i & 2) != 0) {
            str2 = griverBackHomeButtonStyleExtension.verificationMethod;
        }
        if ((i & 4) != 0) {
            str3 = griverBackHomeButtonStyleExtension.securityId;
        }
        return griverBackHomeButtonStyleExtension.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.result;
    }

    @Nullable
    public final String component2() {
        return this.verificationMethod;
    }

    @Nullable
    public final String component3() {
        return this.securityId;
    }

    @NotNull
    public final GriverBackHomeButtonStyleExtension copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new GriverBackHomeButtonStyleExtension(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverBackHomeButtonStyleExtension)) {
            return false;
        }
        GriverBackHomeButtonStyleExtension griverBackHomeButtonStyleExtension = (GriverBackHomeButtonStyleExtension) obj;
        return Intrinsics.areEqual((Object) this.result, (Object) griverBackHomeButtonStyleExtension.result) && Intrinsics.areEqual((Object) this.verificationMethod, (Object) griverBackHomeButtonStyleExtension.verificationMethod) && Intrinsics.areEqual((Object) this.securityId, (Object) griverBackHomeButtonStyleExtension.securityId);
    }

    public final int hashCode() {
        String str = this.result;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.verificationMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.securityId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Risk(result=");
        sb.append(this.result);
        sb.append(", verificationMethod=");
        sb.append(this.verificationMethod);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(")");
        return sb.toString();
    }

    public GriverBackHomeButtonStyleExtension(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.result = str;
        this.verificationMethod = str2;
        this.securityId = str3;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    @Nullable
    public final String getVerificationMethod() {
        return this.verificationMethod;
    }

    public final void setVerificationMethod(@Nullable String str) {
        this.verificationMethod = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GriverBackHomeButtonStyleExtension(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }
}
