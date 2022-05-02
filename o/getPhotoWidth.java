package o;

import id.dana.sendmoney.summary.SummaryRichView;
import id.dana.sendmoney.voucher.ChangeVoucherView;

public final class getPhotoWidth implements ChangeVoucherView.getMin {
    private final SummaryRichView setMax;

    public getPhotoWidth(SummaryRichView summaryRichView) {
        this.setMax = summaryRichView;
    }

    public final void getMin(String str) {
        this.setMax.changePayMethodView.setSelectedPayMethodByPayMethod(str);
    }
}
