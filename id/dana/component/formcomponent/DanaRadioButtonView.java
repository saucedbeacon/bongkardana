package id.dana.component.formcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import o.OptIn;
import o.setBackgroundColorRes;

public class DanaRadioButtonView extends AppCompatRadioButton {
    public DanaRadioButtonView(Context context) {
        super(context);
        getMin();
    }

    public DanaRadioButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMin();
    }

    private void getMin() {
        setTypeface(OptIn.length(getContext(), setBackgroundColorRes.setMax.getMin));
        setTextColor(getResources().getColor(setBackgroundColorRes.getMax.getMin));
        setTextSize(16.0f);
        setButtonDrawable(setBackgroundColorRes.getMin.selector_button_radio);
        setGravity(48);
        setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 8.0f), 0, 0, (int) (Resources.getSystem().getDisplayMetrics().density * 0.0f));
    }
}
