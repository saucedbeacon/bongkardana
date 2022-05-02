package id.dana.domain.qrbarcode.interactor;

import dagger.Module;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.APWebChromeClient;
import o.GriverAppXInterceptor;
import o.GriverPrepareInterceptor;
import o.TitleBarRightButtonView;
import o.getScanJobIntervalMillis;
import o.hasCornerMarking;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Module
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\fB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016J\f\u0010\n\u001a\u00020\u000b*\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/domain/qrbarcode/interactor/GetBankTransferQr;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/qrbarcode/QrUserBankResult;", "Lid/dana/domain/qrbarcode/interactor/GetBankTransferQr$Params;", "repository", "Lid/dana/domain/qrbarcode/QrBarcodeRepository;", "(Lid/dana/domain/qrbarcode/QrBarcodeRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "toTransferBankGenerateQr", "Lid/dana/domain/splitbill/model/TransferBankGenerateQr;", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GetBankTransferQr extends APWebChromeClient<GriverAppXInterceptor, getMax> {
    private final GriverPrepareInterceptor repository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public GetBankTransferQr(@NotNull GriverPrepareInterceptor griverPrepareInterceptor) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(griverPrepareInterceptor, "repository");
        this.repository = griverPrepareInterceptor;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> buildUseCase(@NotNull getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "params");
        TitleBarRightButtonView.AnonymousClass1<GriverAppXInterceptor> transferBankQr = this.repository.getTransferBankQr(toTransferBankGenerateQr(getmax));
        Intrinsics.checkNotNullExpressionValue(transferBankQr, "repository.getTransferBa…TransferBankGenerateQr())");
        return transferBankQr;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003Jc\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006'"}, d2 = {"Lid/dana/domain/qrbarcode/interactor/GetBankTransferQr$Params;", "", "amount", "", "remarks", "bankAccountIndexNo", "bankAccountHolderName", "bankAccountFormattedMaskedNo", "withdrawInstId", "withdrawPayMethod", "withdrawPayOption", "withdrawInstLocalName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getBankAccountFormattedMaskedNo", "getBankAccountHolderName", "getBankAccountIndexNo", "getRemarks", "getWithdrawInstId", "getWithdrawInstLocalName", "getWithdrawPayMethod", "getWithdrawPayOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
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

        public static /* synthetic */ getMax copy$default(getMax getmax, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
            getMax getmax2 = getmax;
            int i2 = i;
            return getmax.copy((i2 & 1) != 0 ? getmax2.amount : str, (i2 & 2) != 0 ? getmax2.remarks : str2, (i2 & 4) != 0 ? getmax2.bankAccountIndexNo : str3, (i2 & 8) != 0 ? getmax2.bankAccountHolderName : str4, (i2 & 16) != 0 ? getmax2.bankAccountFormattedMaskedNo : str5, (i2 & 32) != 0 ? getmax2.withdrawInstId : str6, (i2 & 64) != 0 ? getmax2.withdrawPayMethod : str7, (i2 & 128) != 0 ? getmax2.withdrawPayOption : str8, (i2 & 256) != 0 ? getmax2.withdrawInstLocalName : str9);
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
        public final getMax copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
            return new getMax(str, str2, str3, str4, str10, str11, str12, str13, str14);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMax)) {
                return false;
            }
            getMax getmax = (getMax) obj;
            return Intrinsics.areEqual((Object) this.amount, (Object) getmax.amount) && Intrinsics.areEqual((Object) this.remarks, (Object) getmax.remarks) && Intrinsics.areEqual((Object) this.bankAccountIndexNo, (Object) getmax.bankAccountIndexNo) && Intrinsics.areEqual((Object) this.bankAccountHolderName, (Object) getmax.bankAccountHolderName) && Intrinsics.areEqual((Object) this.bankAccountFormattedMaskedNo, (Object) getmax.bankAccountFormattedMaskedNo) && Intrinsics.areEqual((Object) this.withdrawInstId, (Object) getmax.withdrawInstId) && Intrinsics.areEqual((Object) this.withdrawPayMethod, (Object) getmax.withdrawPayMethod) && Intrinsics.areEqual((Object) this.withdrawPayOption, (Object) getmax.withdrawPayOption) && Intrinsics.areEqual((Object) this.withdrawInstLocalName, (Object) getmax.withdrawInstLocalName);
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
            StringBuilder sb = new StringBuilder("Params(amount=");
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

        public getMax(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9) {
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
    }

    private final getScanJobIntervalMillis toTransferBankGenerateQr(getMax getmax) {
        return new getScanJobIntervalMillis(getmax.getAmount(), getmax.getRemarks(), getmax.getBankAccountIndexNo(), getmax.getBankAccountHolderName(), getmax.getBankAccountFormattedMaskedNo(), getmax.getWithdrawInstId(), getmax.getWithdrawPayMethod(), getmax.getWithdrawPayOption(), getmax.getWithdrawInstLocalName());
    }
}
