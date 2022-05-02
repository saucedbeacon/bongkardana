package o;

import id.dana.di.modules.MerchantLatestReviewModule;
import o.H5PromptDialog;
import o.b;
import o.getMsg;

public final class castToString implements getAdapterPosition<getMsg.length> {
    private final b.C0007b<H5PromptDialog.AnonymousClass1> getMin;
    private final MerchantLatestReviewModule setMin;

    private castToString(MerchantLatestReviewModule merchantLatestReviewModule, b.C0007b<H5PromptDialog.AnonymousClass1> bVar) {
        this.setMin = merchantLatestReviewModule;
        this.getMin = bVar;
    }

    public static castToString getMin(MerchantLatestReviewModule merchantLatestReviewModule, b.C0007b<H5PromptDialog.AnonymousClass1> bVar) {
        return new castToString(merchantLatestReviewModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getMsg.length max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
