package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;

public class SecureEditText extends EditText {
    public void sendAccessibilityEvent(int i) {
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
    }

    public SecureEditText(Context context) {
        super(context);
    }

    public SecureEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
