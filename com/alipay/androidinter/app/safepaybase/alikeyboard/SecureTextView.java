package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;

public class SecureTextView extends TextView {
    private SendAccessiBilityEventListener mSabEventListener = null;

    interface SendAccessiBilityEventListener {
        boolean handleAccessiBilityEvent(SecureTextView secureTextView, int i);
    }

    public SecureTextView(Context context) {
        super(context);
    }

    public SecureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setSendAccessiBilityEventListener(SendAccessiBilityEventListener sendAccessiBilityEventListener) {
        this.mSabEventListener = sendAccessiBilityEventListener;
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 65536 || eventType == 32768) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void sendAccessibilityEvent(int i) {
        SendAccessiBilityEventListener sendAccessiBilityEventListener = this.mSabEventListener;
        if (!(sendAccessiBilityEventListener != null ? sendAccessiBilityEventListener.handleAccessiBilityEvent(this, i) : false)) {
            super.sendAccessibilityEvent(i);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
}
