package o;

import id.dana.splitbill.model.SplitBillPayerModel;
import id.dana.splitbill.view.SplitBillPayersView;

public final class getImageView implements Runnable {
    private final SplitBillPayersView getMin;
    private final SplitBillPayerModel setMax;

    public getImageView(SplitBillPayersView splitBillPayersView, SplitBillPayerModel splitBillPayerModel) {
        this.getMin = splitBillPayersView;
        this.setMax = splitBillPayerModel;
    }

    public final void run() {
        this.getMin.setMax.notifyItemChanged(this.getMin.getPayerModels().indexOf(this.setMax));
    }
}
