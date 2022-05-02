package o;

import android.view.View;
import id.dana.sendmoney.summary.SummaryRichView;

public final class getThumb implements View.OnClickListener {
    private final SummaryRichView getMax;

    public getThumb(SummaryRichView summaryRichView) {
        this.getMax = summaryRichView;
    }

    public final void onClick(View view) {
        this.getMax.presenter.getMax(this.getMax.getMin, this.getMax.setMax, true);
    }
}
