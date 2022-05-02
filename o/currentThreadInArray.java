package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, d2 = {"Lid/dana/data/sendmoney/model/EWalletInnovConfigResult;", "", "clientId", "", "redirectUrlDev", "redirectUrlProd", "scopes", "agreed", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAgreed", "()Z", "getClientId", "()Ljava/lang/String;", "getRedirectUrlDev", "getRedirectUrlProd", "getScopes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class currentThreadInArray {
    private final boolean agreed;
    @NotNull
    private final String clientId;
    @NotNull
    private final String redirectUrlDev;
    @NotNull
    private final String redirectUrlProd;
    @NotNull
    private final String scopes;

    public static /* synthetic */ currentThreadInArray copy$default(currentThreadInArray currentthreadinarray, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentthreadinarray.clientId;
        }
        if ((i & 2) != 0) {
            str2 = currentthreadinarray.redirectUrlDev;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = currentthreadinarray.redirectUrlProd;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = currentthreadinarray.scopes;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = currentthreadinarray.agreed;
        }
        return currentthreadinarray.copy(str, str5, str6, str7, z);
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
    public final currentThreadInArray copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "redirectUrlDev");
        Intrinsics.checkNotNullParameter(str3, "redirectUrlProd");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.SCOPES);
        return new currentThreadInArray(str, str2, str3, str4, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof currentThreadInArray)) {
            return false;
        }
        currentThreadInArray currentthreadinarray = (currentThreadInArray) obj;
        return Intrinsics.areEqual((Object) this.clientId, (Object) currentthreadinarray.clientId) && Intrinsics.areEqual((Object) this.redirectUrlDev, (Object) currentthreadinarray.redirectUrlDev) && Intrinsics.areEqual((Object) this.redirectUrlProd, (Object) currentthreadinarray.redirectUrlProd) && Intrinsics.areEqual((Object) this.scopes, (Object) currentthreadinarray.scopes) && this.agreed == currentthreadinarray.agreed;
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
        if (str4 != null) {
            i = str4.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.agreed;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EWalletInnovConfigResult(clientId=");
        sb.append(this.clientId);
        sb.append(", redirectUrlDev=");
        sb.append(this.redirectUrlDev);
        sb.append(", redirectUrlProd=");
        sb.append(this.redirectUrlProd);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", agreed=");
        sb.append(this.agreed);
        sb.append(")");
        return sb.toString();
    }

    public currentThreadInArray(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "clientId");
        Intrinsics.checkNotNullParameter(str2, "redirectUrlDev");
        Intrinsics.checkNotNullParameter(str3, "redirectUrlProd");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.SCOPES);
        this.clientId = str;
        this.redirectUrlDev = str2;
        this.redirectUrlProd = str3;
        this.scopes = str4;
        this.agreed = z;
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
}
