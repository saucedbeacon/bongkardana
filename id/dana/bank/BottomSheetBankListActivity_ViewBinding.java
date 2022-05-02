package id.dana.bank;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class BottomSheetBankListActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BottomSheetBankListActivity getMin;
    private View length;

    @UiThread
    public BottomSheetBankListActivity_ViewBinding(final BottomSheetBankListActivity bottomSheetBankListActivity, View view) {
        super(bottomSheetBankListActivity, view);
        this.getMin = bottomSheetBankListActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f48372131363391, "method 'onCloseButtonClicked'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                bottomSheetBankListActivity.onCloseButtonClicked();
            }
        });
    }

    public final void setMax() {
        if (this.getMin != null) {
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
