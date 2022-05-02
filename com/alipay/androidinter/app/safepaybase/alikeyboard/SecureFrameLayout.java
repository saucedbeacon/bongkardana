package com.alipay.androidinter.app.safepaybase.alikeyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

public class SecureFrameLayout extends FrameLayout {
    private SendAccessiBilityEventListener mSabEventListener = null;

    interface SendAccessiBilityEventListener {
        boolean handleAccessiBilityEvent(SecureFrameLayout secureFrameLayout, int i);
    }

    public SecureFrameLayout(Context context) {
        super(context);
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SecureFrameLayout(Context context, AttributeSet attributeSet, int i) {
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
}
