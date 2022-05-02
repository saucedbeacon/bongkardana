package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lid/dana/domain/splitbill/model/UserBankGenerateQr;", "", "bankAccountIndexNo", "", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountFormattedMaskedNo", "()Ljava/lang/String;", "getBankAccountHolderName", "getBankAccountIndexNo", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getLastScanStartTimeMillis {
    @NotNull
    private final String bankAccountFormattedMaskedNo;
    @NotNull
    private final String bankAccountHolderName;
    @NotNull
    private final String bankAccountIndexNo;
    @NotNull
    private final String withdrawInstId;
    @NotNull
    private final String withdrawInstLocalName;
    @NotNull
    private final String withdrawPayMethod;
    @NotNull
    private final String withdrawPayOption;

    public static /* synthetic */ getLastScanStartTimeMillis copy$default(getLastScanStartTimeMillis getlastscanstarttimemillis, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getlastscanstarttimemillis.bankAccountIndexNo;
        }
        if ((i & 2) != 0) {
            str2 = getlastscanstarttimemillis.bankAccountHolderName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = getlastscanstarttimemillis.bankAccountFormattedMaskedNo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = getlastscanstarttimemillis.withdrawInstId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = getlastscanstarttimemillis.withdrawPayMethod;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = getlastscanstarttimemillis.withdrawPayOption;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = getlastscanstarttimemillis.withdrawInstLocalName;
        }
        return getlastscanstarttimemillis.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.bankAccountIndexNo;
    }

    @NotNull
    public final String component2() {
        return this.bankAccountHolderName;
    }

    @NotNull
    public final String component3() {
        return this.bankAccountFormattedMaskedNo;
    }

    @NotNull
    public final String component4() {
        return this.withdrawInstId;
    }

    @NotNull
    public final String component5() {
        return this.withdrawPayMethod;
    }

    @NotNull
    public final String component6() {
        return this.withdrawPayOption;
    }

    @NotNull
    public final String component7() {
        return this.withdrawInstLocalName;
    }

    @NotNull
    public final getLastScanStartTimeMillis copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str2, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str3, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str4, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str5, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str6, "withdrawPayOption");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "withdrawInstLocalName");
        return new getLastScanStartTimeMillis(str, str2, str3, str4, str5, str6, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLastScanStartTimeMillis)) {
            return false;
        }
        getLastScanStartTimeMillis getlastscanstarttimemillis = (getLastScanStartTimeMillis) obj;
        return Intrinsics.areEqual((Object) this.bankAccountIndexNo, (Object) getlastscanstarttimemillis.bankAccountIndexNo) && Intrinsics.areEqual((Object) this.bankAccountHolderName, (Object) getlastscanstarttimemillis.bankAccountHolderName) && Intrinsics.areEqual((Object) this.bankAccountFormattedMaskedNo, (Object) getlastscanstarttimemillis.bankAccountFormattedMaskedNo) && Intrinsics.areEqual((Object) this.withdrawInstId, (Object) getlastscanstarttimemillis.withdrawInstId) && Intrinsics.areEqual((Object) this.withdrawPayMethod, (Object) getlastscanstarttimemillis.withdrawPayMethod) && Intrinsics.areEqual((Object) this.withdrawPayOption, (Object) getlastscanstarttimemillis.withdrawPayOption) && Intrinsics.areEqual((Object) this.withdrawInstLocalName, (Object) getlastscanstarttimemillis.withdrawInstLocalName);
    }

    public final int hashCode() {
        String str = this.bankAccountIndexNo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bankAccountHolderName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bankAccountFormattedMaskedNo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.withdrawInstId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.withdrawPayMethod;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.withdrawPayOption;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.withdrawInstLocalName;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserBankGenerateQr(bankAccountIndexNo=");
        sb.append(this.bankAccountIndexNo);
        sb.append(", bankAccountHolderName=");
        sb.append(this.bankAccountHolderName);
        sb.append(", bankAccountFormattedMaskedNo=");
        sb.append(this.bankAccountFormattedMaskedNo);
        sb.append(", withdrawInstId=");
        sb.append(this.withdrawInstId);
        sb.append(", withdrawPayMethod=");
        sb.append(this.withdrawPayMethod);
        sb.append(", withdrawPayOption=");
        sb.append(this.withdrawPayOption);
        sb.append(", withdrawInstLocalName=");
        sb.append(this.withdrawInstLocalName);
        sb.append(")");
        return sb.toString();
    }

    public getLastScanStartTimeMillis(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str2, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str3, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str4, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str5, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str6, "withdrawPayOption");
        Intrinsics.checkNotNullParameter(str7, "withdrawInstLocalName");
        this.bankAccountIndexNo = str;
        this.bankAccountHolderName = str2;
        this.bankAccountFormattedMaskedNo = str3;
        this.withdrawInstId = str4;
        this.withdrawPayMethod = str5;
        this.withdrawPayOption = str6;
        this.withdrawInstLocalName = str7;
    }

    @NotNull
    public final String getBankAccountIndexNo() {
        return this.bankAccountIndexNo;
    }

    @NotNull
    public final String getBankAccountHolderName() {
        return this.bankAccountHolderName;
    }

    @NotNull
    public final String getBankAccountFormattedMaskedNo() {
        return this.bankAccountFormattedMaskedNo;
    }

    @NotNull
    public final String getWithdrawInstId() {
        return this.withdrawInstId;
    }

    @NotNull
    public final String getWithdrawPayMethod() {
        return this.withdrawPayMethod;
    }

    @NotNull
    public final String getWithdrawPayOption() {
        return this.withdrawPayOption;
    }

    @NotNull
    public final String getWithdrawInstLocalName() {
        return this.withdrawInstLocalName;
    }
}
