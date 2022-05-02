package id.dana.splitbill.view;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SplitBillSectionView_ViewBinding implements Unbinder {
    private View length;
    private SplitBillSectionView setMin;

    @UiThread
    public SplitBillSectionView_ViewBinding(final SplitBillSectionView splitBillSectionView, View view) {
        this.setMin = splitBillSectionView;
        splitBillSectionView.sbhvBillHistories = (SplitBillHistoryView) drawDividersHorizontal.setMin(view, R.id.f60172131364602, "field 'sbhvBillHistories'", SplitBillHistoryView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36372131362087, "method 'onSplitBillButtonClick'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                splitBillSectionView.onSplitBillButtonClick();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        SplitBillSectionView splitBillSectionView = this.setMin;
        if (splitBillSectionView != null) {
            this.setMin = null;
            splitBillSectionView.sbhvBillHistories = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
