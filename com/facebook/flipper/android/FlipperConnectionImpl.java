package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperReceiver;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import o.dispatchKeyShortcutEvent;
import o.getViewVerticalDragRange;

@DoNotStrip
class FlipperConnectionImpl implements dispatchKeyShortcutEvent {
    private final HybridData mHybridData;

    public native void receive(String str, FlipperReceiver flipperReceiver);

    public native void reportError(Throwable th);

    public native void sendArray(String str, FlipperArray flipperArray);

    public native void sendObject(String str, FlipperObject flipperObject);

    static {
        getViewVerticalDragRange.setMin("flipper");
    }

    private FlipperConnectionImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void setMax(String str, FlipperObject flipperObject) {
        sendObject(str, flipperObject);
    }
}
