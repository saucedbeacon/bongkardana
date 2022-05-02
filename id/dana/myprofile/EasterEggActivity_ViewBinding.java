package id.dana.myprofile;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class EasterEggActivity_ViewBinding extends BaseActivity_ViewBinding {
    private EasterEggActivity getMax;
    private View getMin;
    private View length;
    private View setMin;

    @UiThread
    public EasterEggActivity_ViewBinding(final EasterEggActivity easterEggActivity, View view) {
        super(easterEggActivity, view);
        this.getMax = easterEggActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f34412131361875, "field 'contentDisplay' and method 'onTextLongClick'");
        easterEggActivity.contentDisplay = (TextView) drawDividersHorizontal.getMin(max, R.id.f34412131361875, "field 'contentDisplay'", TextView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                easterEggActivity.onTextLongClick();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f34382131361872, "method 'onConfirmButtonClick'");
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                easterEggActivity.onConfirmButtonClick();
            }
        });
        View max3 = drawDividersHorizontal.getMax(view, R.id.f34392131361873, "method 'onCopyButtonClick'");
        this.setMin = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                easterEggActivity.onCopyButtonClick();
            }
        });
    }

    public final void setMax() {
        EasterEggActivity easterEggActivity = this.getMax;
        if (easterEggActivity != null) {
            this.getMax = null;
            easterEggActivity.contentDisplay = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
