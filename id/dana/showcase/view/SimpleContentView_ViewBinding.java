package id.dana.showcase.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SimpleContentView_ViewBinding implements Unbinder {
    private View getMax;
    private SimpleContentView getMin;

    @UiThread
    public SimpleContentView_ViewBinding(final SimpleContentView simpleContentView, View view) {
        this.getMin = simpleContentView;
        View max = drawDividersHorizontal.getMax(view, R.id.f37162131362168, "field 'button' and method 'onButtonClick'");
        simpleContentView.button = (Button) drawDividersHorizontal.getMin(max, R.id.f37162131362168, "field 'button'", Button.class);
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                simpleContentView.onButtonClick();
            }
        });
        simpleContentView.title = (TextView) drawDividersHorizontal.setMin(view, R.id.f62242131364837, "field 'title'", TextView.class);
        simpleContentView.description = (TextView) drawDividersHorizontal.setMin(view, R.id.f42152131362709, "field 'description'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SimpleContentView simpleContentView = this.getMin;
        if (simpleContentView != null) {
            this.getMin = null;
            simpleContentView.button = null;
            simpleContentView.title = null;
            simpleContentView.description = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
