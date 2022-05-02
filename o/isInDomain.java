package o;

import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lid/dana/data/sendmoney/model/DigitalMoneyEntity;", "", "instId", "", "eWalletPrefix", "bankName", "eWalletName", "identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getEWalletName", "getEWalletPrefix", "getIdentifier", "getInstId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isInDomain {
    @NotNull
    private final String bankName;
    @NotNull
    private final String eWalletName;
    @NotNull
    private final String eWalletPrefix;
    @NotNull
    private final String identifier;
    @NotNull
    private final String instId;

    public static /* synthetic */ isInDomain copy$default(isInDomain isindomain, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = isindomain.instId;
        }
        if ((i & 2) != 0) {
            str2 = isindomain.eWalletPrefix;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = isindomain.bankName;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = isindomain.eWalletName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = isindomain.identifier;
        }
        return isindomain.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.instId;
    }

    @NotNull
    public final String component2() {
        return this.eWalletPrefix;
    }

    @NotNull
    public final String component3() {
        return this.bankName;
    }

    @NotNull
    public final String component4() {
        return this.eWalletName;
    }

    @NotNull
    public final String component5() {
        return this.identifier;
    }

    @NotNull
    public final isInDomain copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "eWalletPrefix");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        Intrinsics.checkNotNullParameter(str4, "eWalletName");
        Intrinsics.checkNotNullParameter(str5, "identifier");
        return new isInDomain(str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isInDomain)) {
            return false;
        }
        isInDomain isindomain = (isInDomain) obj;
        return Intrinsics.areEqual((Object) this.instId, (Object) isindomain.instId) && Intrinsics.areEqual((Object) this.eWalletPrefix, (Object) isindomain.eWalletPrefix) && Intrinsics.areEqual((Object) this.bankName, (Object) isindomain.bankName) && Intrinsics.areEqual((Object) this.eWalletName, (Object) isindomain.eWalletName) && Intrinsics.areEqual((Object) this.identifier, (Object) isindomain.identifier);
    }

    public final int hashCode() {
        String str = this.instId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.eWalletPrefix;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bankName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.eWalletName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.identifier;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalMoneyEntity(instId=");
        sb.append(this.instId);
        sb.append(", eWalletPrefix=");
        sb.append(this.eWalletPrefix);
        sb.append(", bankName=");
        sb.append(this.bankName);
        sb.append(", eWalletName=");
        sb.append(this.eWalletName);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(")");
        return sb.toString();
    }

    public isInDomain(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "eWalletPrefix");
        Intrinsics.checkNotNullParameter(str3, "bankName");
        Intrinsics.checkNotNullParameter(str4, "eWalletName");
        Intrinsics.checkNotNullParameter(str5, "identifier");
        this.instId = str;
        this.eWalletPrefix = str2;
        this.bankName = str3;
        this.eWalletName = str4;
        this.identifier = str5;
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
    }

    @NotNull
    public final String getEWalletPrefix() {
        return this.eWalletPrefix;
    }

    @NotNull
    public final String getBankName() {
        return this.bankName;
    }

    @NotNull
    public final String getEWalletName() {
        return this.eWalletName;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
