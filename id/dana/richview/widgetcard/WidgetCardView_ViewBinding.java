package id.dana.richview.widgetcard;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public final class WidgetCardView_ViewBinding implements Unbinder {
    private View length;
    private WidgetCardView setMin;

    @UiThread
    public WidgetCardView_ViewBinding(final WidgetCardView widgetCardView, View view) {
        this.setMin = widgetCardView;
        View max = drawDividersHorizontal.getMax(view, R.id.f37112131362163, "method 'onViewAllClicked'");
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                widgetCardView.onViewAllClicked(view);
            }
        });
    }

    public final void setMax() {
        if (this.setMin != null) {
            this.setMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
