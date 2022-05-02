package com.facebook.flipper.android;

import com.facebook.jni.HybridClassBase;
import com.facebook.proguard.annotations.DoNotStrip;
import o.getViewVerticalDragRange;

@DoNotStrip
public class EventBase extends HybridClassBase {
    @DoNotStrip
    private native void initHybrid();

    @DoNotStrip
    public native void loopForever();

    static {
        getViewVerticalDragRange.setMin("flipper");
    }

    public EventBase() {
        initHybrid();
    }
}
