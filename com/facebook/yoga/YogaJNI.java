package com.facebook.yoga;

import o.getViewVerticalDragRange;

public class YogaJNI {
    public static boolean getMax = false;
    public static int getMin = 4;

    private static native void jni_bindNativeMethods(boolean z);

    static boolean length() {
        if (!getViewVerticalDragRange.setMin("yoga")) {
            return false;
        }
        jni_bindNativeMethods(getMax);
        return true;
    }
}
