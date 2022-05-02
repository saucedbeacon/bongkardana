package com.alibaba.griver.base.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.alibaba.griver.base.R;

public class GriverCheckBox extends AppCompatCheckBox {
    public GriverCheckBox(Context context) {
        super(context);
        a();
    }

    public GriverCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public GriverCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setButtonDrawable(R.drawable.griver_check_box);
    }
}
