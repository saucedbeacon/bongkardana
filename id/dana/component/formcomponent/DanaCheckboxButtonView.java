package id.dana.component.formcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import o.OptIn;
import o.setBackgroundColorRes;

public class DanaCheckboxButtonView extends AppCompatCheckBox {
    public DanaCheckboxButtonView(Context context) {
        super(context);
        setMin();
    }

    public DanaCheckboxButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setMin();
    }

    public DanaCheckboxButtonView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setMin();
    }

    private void setMin() {
        setTypeface(OptIn.length(getContext(), setBackgroundColorRes.setMax.getMin));
        setTextColor(getResources().getColor(setBackgroundColorRes.getMax.getMin));
        setButtonDrawable(setBackgroundColorRes.getMin.selector_button_check);
        setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f), 0, 0, (int) (Resources.getSystem().getDisplayMetrics().density * 0.0f));
    }
}
