package id.dana.statement;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class StatementActivity_ViewBinding extends BaseActivity_ViewBinding {
    private StatementActivity getMin;
    private View length;

    @UiThread
    public StatementActivity_ViewBinding(final StatementActivity statementActivity, View view) {
        super(statementActivity, view);
        this.getMin = statementActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36262131362076, "method 'onClickDownloadStatement'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                statementActivity.onClickDownloadStatement();
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
