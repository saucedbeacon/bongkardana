package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class YogaConfig {
    public static int setMax = 1;
    private YogaNodeCloneFunction getMax;
    public long length;

    private native void jni_YGConfigFree(long j);

    private native long jni_YGConfigNew();

    private native void jni_YGConfigSetExperimentalFeatureEnabled(long j, int i, boolean z);

    private native void jni_YGConfigSetHasCloneNodeFunc(long j, boolean z);

    private native void jni_YGConfigSetLogger(long j, Object obj);

    private native void jni_YGConfigSetPointScaleFactor(long j, float f);

    private native void jni_YGConfigSetPrintTreeFlag(long j, boolean z);

    private native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviour(long j, boolean z);

    private native void jni_YGConfigSetUseLegacyStretchBehaviour(long j, boolean z);

    public native void jni_YGConfigSetUseWebDefaults(long j, boolean z);

    static {
        YogaJNI.length();
    }

    public YogaConfig() {
        long jni_YGConfigNew = jni_YGConfigNew();
        this.length = jni_YGConfigNew;
        if (jni_YGConfigNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            jni_YGConfigFree(this.length);
        } finally {
            super.finalize();
        }
    }

    @DoNotStrip
    private final YogaNode cloneNode(YogaNode yogaNode, YogaNode yogaNode2, int i) {
        return this.getMax.cloneNode(yogaNode, yogaNode2, i);
    }
}
