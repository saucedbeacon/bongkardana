package o;

import com.alibaba.fastjson.annotation.JSONField;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/data/sendmoney/model/DigitalMoneyResult;", "", "instId", "", "bankName", "eWalletName", "identifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBankName", "()Ljava/lang/String;", "getEWalletName", "getIdentifier", "getInstId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class calculateSize {
    @NotNull
    String bankName;
    @NotNull
    String eWalletName;
    @NotNull
    String identifier;
    @NotNull
    String instId;

    public /* synthetic */ calculateSize() {
    }

    public static /* synthetic */ calculateSize copy$default(calculateSize calculatesize, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = calculatesize.instId;
        }
        if ((i & 2) != 0) {
            str2 = calculatesize.bankName;
        }
        if ((i & 4) != 0) {
            str3 = calculatesize.eWalletName;
        }
        if ((i & 8) != 0) {
            str4 = calculatesize.identifier;
        }
        return calculatesize.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.instId;
    }

    @NotNull
    public final String component2() {
        return this.bankName;
    }

    @NotNull
    public final String component3() {
        return this.eWalletName;
    }

    @NotNull
    public final String component4() {
        return this.identifier;
    }

    @NotNull
    public final calculateSize copy(@NotNull String str, @JSONField(name = "bank_name") @NotNull String str2, @JSONField(name = "ewallet_name") @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "bankName");
        Intrinsics.checkNotNullParameter(str3, "eWalletName");
        Intrinsics.checkNotNullParameter(str4, "identifier");
        return new calculateSize(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof calculateSize)) {
            return false;
        }
        calculateSize calculatesize = (calculateSize) obj;
        return Intrinsics.areEqual((Object) this.instId, (Object) calculatesize.instId) && Intrinsics.areEqual((Object) this.bankName, (Object) calculatesize.bankName) && Intrinsics.areEqual((Object) this.eWalletName, (Object) calculatesize.eWalletName) && Intrinsics.areEqual((Object) this.identifier, (Object) calculatesize.identifier);
    }

    public final int hashCode() {
        String str = this.instId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bankName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.eWalletName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.identifier;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DigitalMoneyResult(instId=");
        sb.append(this.instId);
        sb.append(", bankName=");
        sb.append(this.bankName);
        sb.append(", eWalletName=");
        sb.append(this.eWalletName);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(")");
        return sb.toString();
    }

    public calculateSize(@NotNull String str, @JSONField(name = "bank_name") @NotNull String str2, @JSONField(name = "ewallet_name") @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str2, "bankName");
        Intrinsics.checkNotNullParameter(str3, "eWalletName");
        Intrinsics.checkNotNullParameter(str4, "identifier");
        this.instId = str;
        this.bankName = str2;
        this.eWalletName = str3;
        this.identifier = str4;
    }

    @NotNull
    public final String getInstId() {
        return this.instId;
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
