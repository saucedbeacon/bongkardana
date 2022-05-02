package o;

import id.dana.R;
import id.dana.splitbill.view.SplitBillActivity;
import kotlin.jvm.functions.Function1;

public final class setupTextViewCS implements Function1 {
    private final SplitBillActivity setMax;

    public setupTextViewCS(SplitBillActivity splitBillActivity) {
        this.setMax = splitBillActivity;
    }

    public final Object invoke(Object obj) {
        return this.setMax.deepLinkPresenter.setMin(this.setMax.setMax(), this.setMax.getString(R.string.deeplink_title_split_bill), this.setMax.getString(R.string.deeplink_description_split_bill));
    }
}
