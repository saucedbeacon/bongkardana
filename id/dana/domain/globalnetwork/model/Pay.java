package id.dana.domain.globalnetwork.model;

import androidx.annotation.Keep;
import com.alipay.iap.android.wallet.acl.payment.PaymentType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lid/dana/domain/globalnetwork/model/Pay;", "", "amount", "", "currency", "extendInfo", "", "paymentType", "Lcom/alipay/iap/android/wallet/acl/payment/PaymentType;", "paymentString", "isFromMiniProgram", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/alipay/iap/android/wallet/acl/payment/PaymentType;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "getCurrency", "getExtendInfo", "()Ljava/util/Map;", "()Z", "getPaymentString", "getPaymentType", "()Lcom/alipay/iap/android/wallet/acl/payment/PaymentType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
@Keep
public final class Pay {
    @NotNull
    private final String amount;
    @NotNull
    private final String currency;
    @NotNull
    private final Map<String, String> extendInfo;
    private final boolean isFromMiniProgram;
    @NotNull
    private final String paymentString;
    @NotNull
    private final PaymentType paymentType;

    public static /* synthetic */ Pay copy$default(Pay pay, String str, String str2, Map<String, String> map, PaymentType paymentType2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pay.amount;
        }
        if ((i & 2) != 0) {
            str2 = pay.currency;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            map = pay.extendInfo;
        }
        Map<String, String> map2 = map;
        if ((i & 8) != 0) {
            paymentType2 = pay.paymentType;
        }
        PaymentType paymentType3 = paymentType2;
        if ((i & 16) != 0) {
            str3 = pay.paymentString;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z = pay.isFromMiniProgram;
        }
        return pay.copy(str, str4, map2, paymentType3, str5, z);
    }

    @NotNull
    public final String component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.currency;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.extendInfo;
    }

    @NotNull
    public final PaymentType component4() {
        return this.paymentType;
    }

    @NotNull
    public final String component5() {
        return this.paymentString;
    }

    public final boolean component6() {
        return this.isFromMiniProgram;
    }

    @NotNull
    public final Pay copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull PaymentType paymentType2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(paymentType2, "paymentType");
        Intrinsics.checkNotNullParameter(str3, "paymentString");
        return new Pay(str, str2, map, paymentType2, str3, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pay)) {
            return false;
        }
        Pay pay = (Pay) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) pay.amount) && Intrinsics.areEqual((Object) this.currency, (Object) pay.currency) && Intrinsics.areEqual((Object) this.extendInfo, (Object) pay.extendInfo) && Intrinsics.areEqual((Object) this.paymentType, (Object) pay.paymentType) && Intrinsics.areEqual((Object) this.paymentString, (Object) pay.paymentString) && this.isFromMiniProgram == pay.isFromMiniProgram;
    }

    public final int hashCode() {
        String str = this.amount;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.currency;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        PaymentType paymentType2 = this.paymentType;
        int hashCode4 = (hashCode3 + (paymentType2 != null ? paymentType2.hashCode() : 0)) * 31;
        String str3 = this.paymentString;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z = this.isFromMiniProgram;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Pay(amount=");
        sb.append(this.amount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", paymentType=");
        sb.append(this.paymentType);
        sb.append(", paymentString=");
        sb.append(this.paymentString);
        sb.append(", isFromMiniProgram=");
        sb.append(this.isFromMiniProgram);
        sb.append(")");
        return sb.toString();
    }

    public Pay(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map, @NotNull PaymentType paymentType2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(paymentType2, "paymentType");
        Intrinsics.checkNotNullParameter(str3, "paymentString");
        this.amount = str;
        this.currency = str2;
        this.extendInfo = map;
        this.paymentType = paymentType2;
        this.paymentString = str3;
        this.isFromMiniProgram = z;
    }

    @NotNull
    public final String getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    @NotNull
    public final PaymentType getPaymentType() {
        return this.paymentType;
    }

    @NotNull
    public final String getPaymentString() {
        return this.paymentString;
    }

    public final boolean isFromMiniProgram() {
        return this.isFromMiniProgram;
    }
}
