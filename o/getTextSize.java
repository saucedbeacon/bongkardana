package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lid/dana/domain/electronicmoney/model/request/BrizziReversalInfo;", "", "reversalData", "", "reffNumber", "cardNumber", "lastTrxDate", "balance", "errorCode", "listBrizziHistoryInfo", "", "Lid/dana/domain/electronicmoney/model/request/BrizziHistoryInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getBalance", "()Ljava/lang/String;", "getCardNumber", "getErrorCode", "getLastTrxDate", "getListBrizziHistoryInfo", "()Ljava/util/List;", "getReffNumber", "getReversalData", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getTextSize {
    @NotNull
    private final String balance;
    @NotNull
    private final String cardNumber;
    @NotNull
    private final String errorCode;
    @NotNull
    private final String lastTrxDate;
    @NotNull
    private final List<setTextZoom> listBrizziHistoryInfo;
    @NotNull
    private final String reffNumber;
    @NotNull
    private final String reversalData;

    public static /* synthetic */ getTextSize copy$default(getTextSize gettextsize, String str, String str2, String str3, String str4, String str5, String str6, List<setTextZoom> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gettextsize.reversalData;
        }
        if ((i & 2) != 0) {
            str2 = gettextsize.reffNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = gettextsize.cardNumber;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = gettextsize.lastTrxDate;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = gettextsize.balance;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = gettextsize.errorCode;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = gettextsize.listBrizziHistoryInfo;
        }
        return gettextsize.copy(str, str7, str8, str9, str10, str11, list);
    }

    @NotNull
    public final String component1() {
        return this.reversalData;
    }

    @NotNull
    public final String component2() {
        return this.reffNumber;
    }

    @NotNull
    public final String component3() {
        return this.cardNumber;
    }

    @NotNull
    public final String component4() {
        return this.lastTrxDate;
    }

    @NotNull
    public final String component5() {
        return this.balance;
    }

    @NotNull
    public final String component6() {
        return this.errorCode;
    }

    @NotNull
    public final List<setTextZoom> component7() {
        return this.listBrizziHistoryInfo;
    }

    @NotNull
    public final getTextSize copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<setTextZoom> list) {
        Intrinsics.checkNotNullParameter(str, "reversalData");
        Intrinsics.checkNotNullParameter(str2, "reffNumber");
        Intrinsics.checkNotNullParameter(str3, "cardNumber");
        Intrinsics.checkNotNullParameter(str4, "lastTrxDate");
        Intrinsics.checkNotNullParameter(str5, "balance");
        Intrinsics.checkNotNullParameter(str6, "errorCode");
        List<setTextZoom> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "listBrizziHistoryInfo");
        return new getTextSize(str, str2, str3, str4, str5, str6, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTextSize)) {
            return false;
        }
        getTextSize gettextsize = (getTextSize) obj;
        return Intrinsics.areEqual((Object) this.reversalData, (Object) gettextsize.reversalData) && Intrinsics.areEqual((Object) this.reffNumber, (Object) gettextsize.reffNumber) && Intrinsics.areEqual((Object) this.cardNumber, (Object) gettextsize.cardNumber) && Intrinsics.areEqual((Object) this.lastTrxDate, (Object) gettextsize.lastTrxDate) && Intrinsics.areEqual((Object) this.balance, (Object) gettextsize.balance) && Intrinsics.areEqual((Object) this.errorCode, (Object) gettextsize.errorCode) && Intrinsics.areEqual((Object) this.listBrizziHistoryInfo, (Object) gettextsize.listBrizziHistoryInfo);
    }

    public final int hashCode() {
        String str = this.reversalData;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.reffNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cardNumber;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.lastTrxDate;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.balance;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.errorCode;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<setTextZoom> list = this.listBrizziHistoryInfo;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BrizziReversalInfo(reversalData=");
        sb.append(this.reversalData);
        sb.append(", reffNumber=");
        sb.append(this.reffNumber);
        sb.append(", cardNumber=");
        sb.append(this.cardNumber);
        sb.append(", lastTrxDate=");
        sb.append(this.lastTrxDate);
        sb.append(", balance=");
        sb.append(this.balance);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append(", listBrizziHistoryInfo=");
        sb.append(this.listBrizziHistoryInfo);
        sb.append(")");
        return sb.toString();
    }

    public getTextSize(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<setTextZoom> list) {
        Intrinsics.checkNotNullParameter(str, "reversalData");
        Intrinsics.checkNotNullParameter(str2, "reffNumber");
        Intrinsics.checkNotNullParameter(str3, "cardNumber");
        Intrinsics.checkNotNullParameter(str4, "lastTrxDate");
        Intrinsics.checkNotNullParameter(str5, "balance");
        Intrinsics.checkNotNullParameter(str6, "errorCode");
        Intrinsics.checkNotNullParameter(list, "listBrizziHistoryInfo");
        this.reversalData = str;
        this.reffNumber = str2;
        this.cardNumber = str3;
        this.lastTrxDate = str4;
        this.balance = str5;
        this.errorCode = str6;
        this.listBrizziHistoryInfo = list;
    }

    @NotNull
    public final String getReversalData() {
        return this.reversalData;
    }

    @NotNull
    public final String getReffNumber() {
        return this.reffNumber;
    }

    @NotNull
    public final String getCardNumber() {
        return this.cardNumber;
    }

    @NotNull
    public final String getLastTrxDate() {
        return this.lastTrxDate;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getTextSize(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<setTextZoom> getListBrizziHistoryInfo() {
        return this.listBrizziHistoryInfo;
    }
}
