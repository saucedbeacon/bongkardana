package o;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lid/dana/domain/ocr/model/ReceiptInfoModel;", "", "merchantName", "", "billNumber", "timestamp", "amount", "rawText", "isFulFilled", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "getBillNumber", "()Z", "getMerchantName", "getRawText", "getTimestamp", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class NavigationBarCompat {
    @NotNull
    private final String amount;
    @NotNull
    private final String billNumber;
    private final boolean isFulFilled;
    @NotNull
    private final String merchantName;
    @NotNull
    private final String rawText;
    @NotNull
    private final String timestamp;

    public static /* synthetic */ NavigationBarCompat copy$default(NavigationBarCompat navigationBarCompat, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navigationBarCompat.merchantName;
        }
        if ((i & 2) != 0) {
            str2 = navigationBarCompat.billNumber;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = navigationBarCompat.timestamp;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = navigationBarCompat.amount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = navigationBarCompat.rawText;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = navigationBarCompat.isFulFilled;
        }
        return navigationBarCompat.copy(str, str6, str7, str8, str9, z);
    }

    @NotNull
    public final String component1() {
        return this.merchantName;
    }

    @NotNull
    public final String component2() {
        return this.billNumber;
    }

    @NotNull
    public final String component3() {
        return this.timestamp;
    }

    @NotNull
    public final String component4() {
        return this.amount;
    }

    @NotNull
    public final String component5() {
        return this.rawText;
    }

    public final boolean component6() {
        return this.isFulFilled;
    }

    @NotNull
    public final NavigationBarCompat copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str2, "billNumber");
        Intrinsics.checkNotNullParameter(str3, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str4, "amount");
        Intrinsics.checkNotNullParameter(str5, "rawText");
        return new NavigationBarCompat(str, str2, str3, str4, str5, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationBarCompat)) {
            return false;
        }
        NavigationBarCompat navigationBarCompat = (NavigationBarCompat) obj;
        return Intrinsics.areEqual((Object) this.merchantName, (Object) navigationBarCompat.merchantName) && Intrinsics.areEqual((Object) this.billNumber, (Object) navigationBarCompat.billNumber) && Intrinsics.areEqual((Object) this.timestamp, (Object) navigationBarCompat.timestamp) && Intrinsics.areEqual((Object) this.amount, (Object) navigationBarCompat.amount) && Intrinsics.areEqual((Object) this.rawText, (Object) navigationBarCompat.rawText) && this.isFulFilled == navigationBarCompat.isFulFilled;
    }

    public final int hashCode() {
        String str = this.merchantName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.billNumber;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.timestamp;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.amount;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.rawText;
        if (str5 != null) {
            i = str5.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.isFulFilled;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReceiptInfoModel(merchantName=");
        sb.append(this.merchantName);
        sb.append(", billNumber=");
        sb.append(this.billNumber);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", rawText=");
        sb.append(this.rawText);
        sb.append(", isFulFilled=");
        sb.append(this.isFulFilled);
        sb.append(")");
        return sb.toString();
    }

    public NavigationBarCompat(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str2, "billNumber");
        Intrinsics.checkNotNullParameter(str3, TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str4, "amount");
        Intrinsics.checkNotNullParameter(str5, "rawText");
        this.merchantName = str;
        this.billNumber = str2;
        this.timestamp = str3;
        this.amount = str4;
        this.rawText = str5;
        this.isFulFilled = z;
    }

    @NotNull
    public final String getMerchantName() {
        return this.merchantName;
    }

    @NotNull
    public final String getBillNumber() {
        return this.billNumber;
    }

    @NotNull
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getRawText() {
        return this.rawText;
    }

    public final boolean isFulFilled() {
        return this.isFulFilled;
    }
}
