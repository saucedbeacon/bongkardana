package com.facebook.flipper.android;

import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import o.getExtraData;
import o.getViewVerticalDragRange;

@DoNotStrip
class FlipperResponderImpl implements getExtraData {
    private final HybridData mHybridData;

    public native void error(FlipperObject flipperObject);

    public native void successArray(FlipperArray flipperArray);

    public native void successObject(FlipperObject flipperObject);

    static {
        getViewVerticalDragRange.setMin("flipper");
    }

    private FlipperResponderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final void setMax(FlipperObject flipperObject) {
        successObject(flipperObject);
    }
}
