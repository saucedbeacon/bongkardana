package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.voucher.VoucherDetailActivity;

public final class fadeInFadeOut implements getBindingAdapter<VoucherDetailActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.voucher.VoucherDetailActivity.dynamicUrlWrapper")
    public static void getMax(VoucherDetailActivity voucherDetailActivity, getShortName getshortname) {
        voucherDetailActivity.dynamicUrlWrapper = getshortname;
    }
}
