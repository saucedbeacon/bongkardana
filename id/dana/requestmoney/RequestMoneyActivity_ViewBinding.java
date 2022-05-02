package id.dana.requestmoney;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class RequestMoneyActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RequestMoneyActivity getMax;
    private View getMin;
    private View length;

    @UiThread
    public RequestMoneyActivity_ViewBinding(final RequestMoneyActivity requestMoneyActivity, View view) {
        super(requestMoneyActivity, view);
        this.getMax = requestMoneyActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f43502131362870, "method 'onSlideLeftClick'");
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                requestMoneyActivity.onSlideLeftClick();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f43512131362871, "method 'onSlideRightClick'");
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                requestMoneyActivity.onSlideRightClick();
            }
        });
    }

    public final void setMax() {
        if (this.getMax != null) {
            this.getMax = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
