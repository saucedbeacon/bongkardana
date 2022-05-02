package o;

import android.view.ViewTreeObserver;
import id.dana.sendmoney.summary.SummaryRichView;

public final class setFail implements ViewTreeObserver.OnGlobalLayoutListener {
    private final SummaryRichView getMin;

    public setFail(SummaryRichView summaryRichView) {
        this.getMin = summaryRichView;
    }

    public final void onGlobalLayout() {
        this.getMin.setMarginBottomBasedOnFloatingView(this.getMin.bottomActionView.getHeight());
    }
}
