package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, d2 = {"Lid/dana/domain/sendmoney/model/EWalletInnovConfig;", "", "clientId", "", "redirectUrlDev", "redirectUrlProd", "scopes", "agreed", "", "flavorType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAgreed", "()Z", "getClientId", "()Ljava/lang/String;", "getFlavorType", "getRedirectUrlDev", "getRedirectUrlProd", "getScopes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setMatchingBeaconTypeCode {
    private final boolean agreed;
    @NotNull
    private final String clientId;
    @NotNull
    private final String flavorType;
    @NotNull
    private final String redirectUrlDev;
    @NotNull
    private final String redirectUrlProd;
    @NotNull
    private final String scopes;

    public static /* synthetic */ setMatchingBeaconTypeCode copy$default(setMatchingBeaconTypeCode setmatchingbeacontypecode, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setmatchingbeacontypecode.clientId;
        }
        if ((i & 2) != 0) {
            str2 = setmatchingbeacontypecode.redirectUrlDev;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = setmatchingbeacontypecode.redirectUrlProd;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = setmatchingbeacontypecode.scopes;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            z = setmatchingbeacontypecode.agreed;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = setmatchingbeacontypecode.flavorType;
        }
        return setmatchingbeacontypecode.copy(str, str6, str7, str8, z2, str5);
    }

    @NotNull
    public final String component1() {
        return this.clientId;
    }

    @NotNull
    public final String component2() {
        return this.redirectUrlDev;
    }

    @NotNull
    public final String component3() {
        return this.redirectUrlProd;
    }

    @NotNull
    public final String component4() {
        return this.scopes;
    }

    public final boolean component5() {
        return this.agreed;
    }

    @NotNull
    public final String component6() {
        return this.flavorType;
    }

    @NotNull
    public final setMatchingBeaconTypeCode copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "redirectUrlDev");
        Intrinsics.checkNotNullParameter(str3, "redirectUrlProd");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(str5, "flavorType");
        return new setMatchingBeaconTypeCode(str, str2, str3, str4, z, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMatchingBeaconTypeCode)) {
            return false;
        }
        setMatchingBeaconTypeCode setmatchingbeacontypecode = (setMatchingBeaconTypeCode) obj;
        return Intrinsics.areEqual((Object) this.clientId, (Object) setmatchingbeacontypecode.clientId) && Intrinsics.areEqual((Object) this.redirectUrlDev, (Object) setmatchingbeacontypecode.redirectUrlDev) && Intrinsics.areEqual((Object) this.redirectUrlProd, (Object) setmatchingbeacontypecode.redirectUrlProd) && Intrinsics.areEqual((Object) this.scopes, (Object) setmatchingbeacontypecode.scopes) && this.agreed == setmatchingbeacontypecode.agreed && Intrinsics.areEqual((Object) this.flavorType, (Object) setmatchingbeacontypecode.flavorType);
    }

    public final int hashCode() {
        String str = this.clientId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.redirectUrlDev;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.redirectUrlProd;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.scopes;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.agreed;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str5 = this.flavorType;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EWalletInnovConfig(clientId=");
        sb.append(this.clientId);
        sb.append(", redirectUrlDev=");
        sb.append(this.redirectUrlDev);
        sb.append(", redirectUrlProd=");
        sb.append(this.redirectUrlProd);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", agreed=");
        sb.append(this.agreed);
        sb.append(", flavorType=");
        sb.append(this.flavorType);
        sb.append(")");
        return sb.toString();
    }

    public setMatchingBeaconTypeCode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "redirectUrlDev");
        Intrinsics.checkNotNullParameter(str3, "redirectUrlProd");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(str5, "flavorType");
        this.clientId = str;
        this.redirectUrlDev = str2;
        this.redirectUrlProd = str3;
        this.scopes = str4;
        this.agreed = z;
        this.flavorType = str5;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    @NotNull
    public final String getRedirectUrlDev() {
        return this.redirectUrlDev;
    }

    @NotNull
    public final String getRedirectUrlProd() {
        return this.redirectUrlProd;
    }

    @NotNull
    public final String getScopes() {
        return this.scopes;
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    @NotNull
    public final String getFlavorType() {
        return this.flavorType;
    }
}
