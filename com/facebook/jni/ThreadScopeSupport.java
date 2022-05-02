package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import o.getViewVerticalDragRange;

@DoNotStrip
public class ThreadScopeSupport {
    private static native void runStdFunctionImpl(long j);

    static {
        getViewVerticalDragRange.setMin("flipperfb");
    }

    @DoNotStrip
    private static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
