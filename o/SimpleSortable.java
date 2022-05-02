package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 !2\u00020\u0001:\u0001!B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity;", "", "bankAccountIndexNo", "", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankAccountFormattedMaskedNo", "()Ljava/lang/String;", "getBankAccountHolderName", "getBankAccountIndexNo", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SimpleSortable {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
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

    public static /* synthetic */ SimpleSortable copy$default(SimpleSortable simpleSortable, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleSortable.bankAccountIndexNo;
        }
        if ((i & 2) != 0) {
            str2 = simpleSortable.bankAccountHolderName;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = simpleSortable.bankAccountFormattedMaskedNo;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = simpleSortable.withdrawInstId;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = simpleSortable.withdrawPayMethod;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = simpleSortable.withdrawPayOption;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = simpleSortable.withdrawInstLocalName;
        }
        return simpleSortable.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @JvmStatic
    @NotNull
    public static final SimpleSortable fromUserBankGenerateQr(@NotNull getLastScanStartTimeMillis getlastscanstarttimemillis) {
        return Companion.fromUserBankGenerateQr(getlastscanstarttimemillis);
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
    public final SimpleSortable copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "bankAccountIndexNo");
        Intrinsics.checkNotNullParameter(str2, "bankAccountHolderName");
        Intrinsics.checkNotNullParameter(str3, "bankAccountFormattedMaskedNo");
        Intrinsics.checkNotNullParameter(str4, "withdrawInstId");
        Intrinsics.checkNotNullParameter(str5, "withdrawPayMethod");
        Intrinsics.checkNotNullParameter(str6, "withdrawPayOption");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "withdrawInstLocalName");
        return new SimpleSortable(str, str2, str3, str4, str5, str6, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleSortable)) {
            return false;
        }
        SimpleSortable simpleSortable = (SimpleSortable) obj;
        return Intrinsics.areEqual((Object) this.bankAccountIndexNo, (Object) simpleSortable.bankAccountIndexNo) && Intrinsics.areEqual((Object) this.bankAccountHolderName, (Object) simpleSortable.bankAccountHolderName) && Intrinsics.areEqual((Object) this.bankAccountFormattedMaskedNo, (Object) simpleSortable.bankAccountFormattedMaskedNo) && Intrinsics.areEqual((Object) this.withdrawInstId, (Object) simpleSortable.withdrawInstId) && Intrinsics.areEqual((Object) this.withdrawPayMethod, (Object) simpleSortable.withdrawPayMethod) && Intrinsics.areEqual((Object) this.withdrawPayOption, (Object) simpleSortable.withdrawPayOption) && Intrinsics.areEqual((Object) this.withdrawInstLocalName, (Object) simpleSortable.withdrawInstLocalName);
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
        StringBuilder sb = new StringBuilder("UserBankGenerateQrEntity(bankAccountIndexNo=");
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

    public SimpleSortable(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005BM\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006,"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/TransferBankGenerateQrRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "Ljava/io/Serializable;", "transferBankGenerateQrEntity", "Lid/dana/data/qrbarcode/repository/source/network/request/TransferBankGenerateQrEntity;", "(Lid/dana/data/qrbarcode/repository/source/network/request/TransferBankGenerateQrEntity;)V", "amount", "", "remarks", "bankAccountIndexNo", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBankAccountFormattedMaskedNo", "getBankAccountHolderName", "getBankAccountIndexNo", "getRemarks", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class Priority extends BaseRpcRequest implements Serializable {
        @NotNull
        private final String amount;
        @NotNull
        private final String bankAccountFormattedMaskedNo;
        @NotNull
        private final String bankAccountHolderName;
        @NotNull
        private final String bankAccountIndexNo;
        @NotNull
        private final String remarks;
        @NotNull
        private final String withdrawInstId;
        @NotNull
        private final String withdrawInstLocalName;
        @NotNull
        private final String withdrawPayMethod;
        @NotNull
        private final String withdrawPayOption;

        public static /* synthetic */ Priority copy$default(Priority priority, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            Priority priority2 = priority;
            int i2 = i;
            return priority.copy((i2 & 1) != 0 ? priority2.amount : str, (i2 & 2) != 0 ? priority2.remarks : str2, (i2 & 4) != 0 ? priority2.bankAccountIndexNo : str3, (i2 & 8) != 0 ? priority2.bankAccountHolderName : str4, (i2 & 16) != 0 ? priority2.bankAccountFormattedMaskedNo : str5, (i2 & 32) != 0 ? priority2.withdrawInstId : str6, (i2 & 64) != 0 ? priority2.withdrawPayMethod : str7, (i2 & 128) != 0 ? priority2.withdrawPayOption : str8, (i2 & 256) != 0 ? priority2.withdrawInstLocalName : str9);
        }

        @NotNull
        public final String component1() {
            return this.amount;
        }

        @NotNull
        public final String component2() {
            return this.remarks;
        }

        @NotNull
        public final String component3() {
            return this.bankAccountIndexNo;
        }

        @NotNull
        public final String component4() {
            return this.bankAccountHolderName;
        }

        @NotNull
        public final String component5() {
            return this.bankAccountFormattedMaskedNo;
        }

        @NotNull
        public final String component6() {
            return this.withdrawInstId;
        }

        @NotNull
        public final String component7() {
            return this.withdrawPayMethod;
        }

        @NotNull
        public final String component8() {
            return this.withdrawPayOption;
        }

        @NotNull
        public final String component9() {
            return this.withdrawInstLocalName;
        }

        @NotNull
        public final Priority copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, "remarks");
            Intrinsics.checkNotNullParameter(str3, "bankAccountIndexNo");
            Intrinsics.checkNotNullParameter(str4, "bankAccountHolderName");
            String str10 = str5;
            Intrinsics.checkNotNullParameter(str10, "bankAccountFormattedMaskedNo");
            String str11 = str6;
            Intrinsics.checkNotNullParameter(str11, "withdrawInstId");
            String str12 = str7;
            Intrinsics.checkNotNullParameter(str12, "withdrawPayMethod");
            String str13 = str8;
            Intrinsics.checkNotNullParameter(str13, "withdrawPayOption");
            String str14 = str9;
            Intrinsics.checkNotNullParameter(str14, "withdrawInstLocalName");
            return new Priority(str, str2, str3, str4, str10, str11, str12, str13, str14);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Priority)) {
                return false;
            }
            Priority priority = (Priority) obj;
            return Intrinsics.areEqual((Object) this.amount, (Object) priority.amount) && Intrinsics.areEqual((Object) this.remarks, (Object) priority.remarks) && Intrinsics.areEqual((Object) this.bankAccountIndexNo, (Object) priority.bankAccountIndexNo) && Intrinsics.areEqual((Object) this.bankAccountHolderName, (Object) priority.bankAccountHolderName) && Intrinsics.areEqual((Object) this.bankAccountFormattedMaskedNo, (Object) priority.bankAccountFormattedMaskedNo) && Intrinsics.areEqual((Object) this.withdrawInstId, (Object) priority.withdrawInstId) && Intrinsics.areEqual((Object) this.withdrawPayMethod, (Object) priority.withdrawPayMethod) && Intrinsics.areEqual((Object) this.withdrawPayOption, (Object) priority.withdrawPayOption) && Intrinsics.areEqual((Object) this.withdrawInstLocalName, (Object) priority.withdrawInstLocalName);
        }

        public final int hashCode() {
            String str = this.amount;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.remarks;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.bankAccountIndexNo;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.bankAccountHolderName;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.bankAccountFormattedMaskedNo;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.withdrawInstId;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            String str7 = this.withdrawPayMethod;
            int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
            String str8 = this.withdrawPayOption;
            int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
            String str9 = this.withdrawInstLocalName;
            if (str9 != null) {
                i = str9.hashCode();
            }
            return hashCode8 + i;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("TransferBankGenerateQrRequest(amount=");
            sb.append(this.amount);
            sb.append(", remarks=");
            sb.append(this.remarks);
            sb.append(", bankAccountIndexNo=");
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
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getRemarks() {
            return this.remarks;
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

        public Priority(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, "remarks");
            Intrinsics.checkNotNullParameter(str3, "bankAccountIndexNo");
            Intrinsics.checkNotNullParameter(str4, "bankAccountHolderName");
            Intrinsics.checkNotNullParameter(str5, "bankAccountFormattedMaskedNo");
            Intrinsics.checkNotNullParameter(str6, "withdrawInstId");
            Intrinsics.checkNotNullParameter(str7, "withdrawPayMethod");
            Intrinsics.checkNotNullParameter(str8, "withdrawPayOption");
            Intrinsics.checkNotNullParameter(str9, "withdrawInstLocalName");
            this.amount = str;
            this.remarks = str2;
            this.bankAccountIndexNo = str3;
            this.bankAccountHolderName = str4;
            this.bankAccountFormattedMaskedNo = str5;
            this.withdrawInstId = str6;
            this.withdrawPayMethod = str7;
            this.withdrawPayOption = str8;
            this.withdrawInstLocalName = str9;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Priority(@NotNull ExtensionType extensionType) {
            this(extensionType.getAmount(), extensionType.getRemarks(), extensionType.getBankAccountIndexNo(), extensionType.getBankAccountHolderName(), extensionType.getBankAccountFormattedMaskedNo(), extensionType.getWithdrawInstId(), extensionType.getWithdrawPayMethod(), extensionType.getWithdrawPayOption(), extensionType.getWithdrawInstLocalName());
            Intrinsics.checkNotNullParameter(extensionType, "transferBankGenerateQrEntity");
        }
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity$Companion;", "", "()V", "fromUserBankGenerateQr", "Lid/dana/data/qrbarcode/repository/source/network/request/UserBankGenerateQrEntity;", "userBankGenerateQr", "Lid/dana/domain/splitbill/model/UserBankGenerateQr;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final SimpleSortable fromUserBankGenerateQr(@NotNull getLastScanStartTimeMillis getlastscanstarttimemillis) {
            Intrinsics.checkNotNullParameter(getlastscanstarttimemillis, "userBankGenerateQr");
            return new SimpleSortable(getlastscanstarttimemillis.getBankAccountIndexNo(), getlastscanstarttimemillis.getBankAccountHolderName(), getlastscanstarttimemillis.getBankAccountFormattedMaskedNo(), getlastscanstarttimemillis.getWithdrawInstId(), getlastscanstarttimemillis.getWithdrawPayMethod(), getlastscanstarttimemillis.getWithdrawPayOption(), getlastscanstarttimemillis.getWithdrawInstLocalName());
        }
    }
}
