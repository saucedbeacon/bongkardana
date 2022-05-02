package o;

import android.view.View;
import id.dana.sendmoney.model.ShareQRSplitBillModel;
import id.dana.splitbill.view.SplitBillShareQrActivity;
import id.dana.splitbill.view.SplitBillSummaryActivity;

public final class isSingleLine implements View.OnClickListener {
    private final ShareQRSplitBillModel getMin;
    private final SplitBillSummaryActivity setMax;

    public isSingleLine(SplitBillSummaryActivity splitBillSummaryActivity, ShareQRSplitBillModel shareQRSplitBillModel) {
        this.setMax = splitBillSummaryActivity;
        this.getMin = shareQRSplitBillModel;
    }

    public final void onClick(View view) {
        this.setMax.startActivity(SplitBillShareQrActivity.createIntent(this.setMax, this.getMin));
    }
}
