package id.dana.richview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class TransactionBubbleView_ViewBinding implements Unbinder {
    private TransactionBubbleView getMin;
    private View length;

    @UiThread
    public TransactionBubbleView_ViewBinding(final TransactionBubbleView transactionBubbleView, View view) {
        this.getMin = transactionBubbleView;
        View max = drawDividersHorizontal.getMax(view, R.id.f37292131362181, "field 'buttonMore' and method 'onMoreButtonClicked'");
        transactionBubbleView.buttonMore = (TextView) drawDividersHorizontal.getMin(max, R.id.f37292131362181, "field 'buttonMore'", TextView.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                transactionBubbleView.onMoreButtonClicked();
            }
        });
        transactionBubbleView.tvAmount = (TextView) drawDividersHorizontal.setMin(view, R.id.f64772131365102, "field 'tvAmount'", TextView.class);
        transactionBubbleView.ivIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49242131363479, "field 'ivIcon'", ImageView.class);
        transactionBubbleView.tvMessage = (TextView) drawDividersHorizontal.setMin(view, R.id.f67292131365356, "field 'tvMessage'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        TransactionBubbleView transactionBubbleView = this.getMin;
        if (transactionBubbleView != null) {
            this.getMin = null;
            transactionBubbleView.buttonMore = null;
            transactionBubbleView.tvAmount = null;
            transactionBubbleView.ivIcon = null;
            transactionBubbleView.tvMessage = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
