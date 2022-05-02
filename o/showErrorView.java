package o;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.payment.PaymentRequest;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/data/globalnetwork/model/PayRequest;", "", "isFromMiniProgram", "", "paymentRequest", "Lcom/alipay/iap/android/wallet/acl/payment/PaymentRequest;", "callback", "Lcom/alipay/iap/android/wallet/acl/base/Callback;", "Lcom/alipay/iap/android/wallet/acl/payment/PaymentResult;", "(ZLcom/alipay/iap/android/wallet/acl/payment/PaymentRequest;Lcom/alipay/iap/android/wallet/acl/base/Callback;)V", "getCallback", "()Lcom/alipay/iap/android/wallet/acl/base/Callback;", "()Z", "getPaymentRequest", "()Lcom/alipay/iap/android/wallet/acl/payment/PaymentRequest;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class showErrorView {
    @NotNull
    private final Callback<PaymentResult> callback;
    private final boolean isFromMiniProgram;
    @NotNull
    private final PaymentRequest paymentRequest;

    public static /* synthetic */ showErrorView copy$default(showErrorView showerrorview, boolean z, PaymentRequest paymentRequest2, Callback<PaymentResult> callback2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = showerrorview.isFromMiniProgram;
        }
        if ((i & 2) != 0) {
            paymentRequest2 = showerrorview.paymentRequest;
        }
        if ((i & 4) != 0) {
            callback2 = showerrorview.callback;
        }
        return showerrorview.copy(z, paymentRequest2, callback2);
    }

    public final boolean component1() {
        return this.isFromMiniProgram;
    }

    @NotNull
    public final PaymentRequest component2() {
        return this.paymentRequest;
    }

    @NotNull
    public final Callback<PaymentResult> component3() {
        return this.callback;
    }

    @NotNull
    public final showErrorView copy(boolean z, @NotNull PaymentRequest paymentRequest2, @NotNull Callback<PaymentResult> callback2) {
        Intrinsics.checkNotNullParameter(paymentRequest2, "paymentRequest");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        return new showErrorView(z, paymentRequest2, callback2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showErrorView)) {
            return false;
        }
        showErrorView showerrorview = (showErrorView) obj;
        return this.isFromMiniProgram == showerrorview.isFromMiniProgram && Intrinsics.areEqual((Object) this.paymentRequest, (Object) showerrorview.paymentRequest) && Intrinsics.areEqual((Object) this.callback, (Object) showerrorview.callback);
    }

    public final int hashCode() {
        boolean z = this.isFromMiniProgram;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        PaymentRequest paymentRequest2 = this.paymentRequest;
        int i2 = 0;
        int hashCode = (i + (paymentRequest2 != null ? paymentRequest2.hashCode() : 0)) * 31;
        Callback<PaymentResult> callback2 = this.callback;
        if (callback2 != null) {
            i2 = callback2.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PayRequest(isFromMiniProgram=");
        sb.append(this.isFromMiniProgram);
        sb.append(", paymentRequest=");
        sb.append(this.paymentRequest);
        sb.append(", callback=");
        sb.append(this.callback);
        sb.append(")");
        return sb.toString();
    }

    public showErrorView(boolean z, @NotNull PaymentRequest paymentRequest2, @NotNull Callback<PaymentResult> callback2) {
        Intrinsics.checkNotNullParameter(paymentRequest2, "paymentRequest");
        Intrinsics.checkNotNullParameter(callback2, "callback");
        this.isFromMiniProgram = z;
        this.paymentRequest = paymentRequest2;
        this.callback = callback2;
    }

    public final boolean isFromMiniProgram() {
        return this.isFromMiniProgram;
    }

    @NotNull
    public final PaymentRequest getPaymentRequest() {
        return this.paymentRequest;
    }

    @NotNull
    public final Callback<PaymentResult> getCallback() {
        return this.callback;
    }
}
