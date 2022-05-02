package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B=\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006&"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "userBankGenerateQrEntity", "Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity;", "(Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity;)V", "bankAccountIndexNo", "", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountFormattedMaskedNo", "()Ljava/lang/String;", "getBankAccountHolderName", "getBankAccountIndexNo", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class priority extends BaseRpcRequest implements Serializable {
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

    public static /* synthetic */ priority copy$default(priority priority, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priority.bankAccountIndexNo;
        }
        if ((i & 2) != 0) {
            str2 = priority.bankAccountHolderName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = priority.bankAccountFormattedMaskedNo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = priority.withdrawInstId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = priority.withdrawPayMethod;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = priority.withdrawPayOption;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = priority.withdrawInstLocalName;
        }
        return priority.copy(str, str8, str9, str10, str11, str12, str7);
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
    public final priority copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str2, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str3, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str4, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str5, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str6, "withdrawPayOption");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "withdrawInstLocalName");
        return new priority(str, str2, str3, str4, str5, str6, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof priority)) {
            return false;
        }
        priority priority = (priority) obj;
        return Intrinsics.areEqual((Object) this.bankAccountIndexNo, (Object) priority.bankAccountIndexNo) && Intrinsics.areEqual((Object) this.bankAccountHolderName, (Object) priority.bankAccountHolderName) && Intrinsics.areEqual((Object) this.bankAccountFormattedMaskedNo, (Object) priority.bankAccountFormattedMaskedNo) && Intrinsics.areEqual((Object) this.withdrawInstId, (Object) priority.withdrawInstId) && Intrinsics.areEqual((Object) this.withdrawPayMethod, (Object) priority.withdrawPayMethod) && Intrinsics.areEqual((Object) this.withdrawPayOption, (Object) priority.withdrawPayOption) && Intrinsics.areEqual((Object) this.withdrawInstLocalName, (Object) priority.withdrawInstLocalName);
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
        StringBuilder sb = new StringBuilder("UserBankGenerateQrRequest(bankAccountIndexNo=");
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

    public priority(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public priority(@NotNull SimpleSortable simpleSortable) {
        this(simpleSortable.getBankAccountIndexNo(), simpleSortable.getBankAccountHolderName(), simpleSortable.getBankAccountFormattedMaskedNo(), simpleSortable.getWithdrawInstId(), simpleSortable.getWithdrawPayMethod(), simpleSortable.getWithdrawPayOption(), simpleSortable.getWithdrawInstLocalName());
        Intrinsics.checkNotNullParameter(simpleSortable, "userBankGenerateQrEntity");
    }
}
