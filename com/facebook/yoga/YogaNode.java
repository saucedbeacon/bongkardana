package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@DoNotStrip
public class YogaNode implements Cloneable {
    public YogaBaselineFunction getMax;
    public long getMin;
    public YogaMeasureFunction length;
    @DoNotStrip
    public float mBorderBottom = 0.0f;
    @DoNotStrip
    public float mBorderLeft = 0.0f;
    @DoNotStrip
    public float mBorderRight = 0.0f;
    @DoNotStrip
    public float mBorderTop = 0.0f;
    @DoNotStrip
    public boolean mDoesLegacyStretchFlagAffectsLayout = false;
    @DoNotStrip
    public int mEdgeSetFlag = 0;
    @DoNotStrip
    public boolean mHasNewLayout = true;
    @DoNotStrip
    public float mHeight = 1.0E21f;
    @DoNotStrip
    public int mLayoutDirection = 0;
    @DoNotStrip
    public float mLeft = 1.0E21f;
    @DoNotStrip
    public float mMarginBottom = 0.0f;
    @DoNotStrip
    public float mMarginLeft = 0.0f;
    @DoNotStrip
    public float mMarginRight = 0.0f;
    @DoNotStrip
    public float mMarginTop = 0.0f;
    @DoNotStrip
    public float mPaddingBottom = 0.0f;
    @DoNotStrip
    public float mPaddingLeft = 0.0f;
    @DoNotStrip
    public float mPaddingRight = 0.0f;
    @DoNotStrip
    public float mPaddingTop = 0.0f;
    @DoNotStrip
    public float mTop = 1.0E21f;
    @DoNotStrip
    public float mWidth = 1.0E21f;
    @Nullable
    public List<YogaNode> setMax;
    public YogaNode setMin;
    public Object toFloatRange;
    public boolean toIntRange = false;

    public static native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private static native void jni_YGNodeClearChildren(long j);

    private native long jni_YGNodeClone(long j, Object obj);

    private static native void jni_YGNodeCopyStyle(long j, long j2);

    private static native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    private static native void jni_YGNodeInsertChild(long j, long j2, int i);

    private static native void jni_YGNodeInsertSharedChild(long j, long j2, int i);

    private static native boolean jni_YGNodeIsDirty(long j);

    private static native void jni_YGNodeMarkDirty(long j);

    private static native void jni_YGNodeMarkDirtyAndPropogateToDescendants(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private static native void jni_YGNodePrint(long j);

    public static native void jni_YGNodeRemoveChild(long j, long j2);

    public static native void jni_YGNodeReset(long j);

    public static native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    public static native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private static native void jni_YGNodeSetOwner(long j, long j2);

    private static native int jni_YGNodeStyleGetAlignContent(long j);

    private static native int jni_YGNodeStyleGetAlignItems(long j);

    private static native int jni_YGNodeStyleGetAlignSelf(long j);

    private static native float jni_YGNodeStyleGetAspectRatio(long j);

    private static native float jni_YGNodeStyleGetBorder(long j, int i);

    public static native int jni_YGNodeStyleGetDirection(long j);

    private static native int jni_YGNodeStyleGetDisplay(long j);

    private static native Object jni_YGNodeStyleGetFlexBasis(long j);

    private static native int jni_YGNodeStyleGetFlexDirection(long j);

    private static native float jni_YGNodeStyleGetFlexGrow(long j);

    private static native float jni_YGNodeStyleGetFlexShrink(long j);

    public static native Object jni_YGNodeStyleGetHeight(long j);

    private static native int jni_YGNodeStyleGetJustifyContent(long j);

    private static native Object jni_YGNodeStyleGetMargin(long j, int i);

    private static native Object jni_YGNodeStyleGetMaxHeight(long j);

    private static native Object jni_YGNodeStyleGetMaxWidth(long j);

    private static native Object jni_YGNodeStyleGetMinHeight(long j);

    private static native Object jni_YGNodeStyleGetMinWidth(long j);

    private static native int jni_YGNodeStyleGetOverflow(long j);

    private static native Object jni_YGNodeStyleGetPadding(long j, int i);

    private static native Object jni_YGNodeStyleGetPosition(long j, int i);

    private static native int jni_YGNodeStyleGetPositionType(long j);

    public static native Object jni_YGNodeStyleGetWidth(long j);

    public static native void jni_YGNodeStyleSetAlignContent(long j, int i);

    public static native void jni_YGNodeStyleSetAlignItems(long j, int i);

    public static native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    public static native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    public static native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    public static native void jni_YGNodeStyleSetDirection(long j, int i);

    private static native void jni_YGNodeStyleSetDisplay(long j, int i);

    public static native void jni_YGNodeStyleSetFlex(long j, float f);

    public static native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private static native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    public static native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    public static native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    public static native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    public static native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    public static native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    public static native void jni_YGNodeStyleSetHeight(long j, float f);

    private static native void jni_YGNodeStyleSetHeightAuto(long j);

    public static native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    public static native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    public static native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeight(long j, float f);

    public static native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidth(long j, float f);

    public static native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private static native void jni_YGNodeStyleSetOverflow(long j, int i);

    public static native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    public static native void jni_YGNodeStyleSetPositionType(long j, int i);

    public static native void jni_YGNodeStyleSetWidth(long j, float f);

    private static native void jni_YGNodeStyleSetWidthAuto(long j);

    public static native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    static {
        YogaJNI.length();
    }

    public YogaNode() {
        long jni_YGNodeNew = jni_YGNodeNew();
        this.getMin = jni_YGNodeNew;
        if (jni_YGNodeNew == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        long jni_YGNodeNewWithConfig = jni_YGNodeNewWithConfig(yogaConfig.length);
        this.getMin = jni_YGNodeNewWithConfig;
        if (jni_YGNodeNewWithConfig == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public final YogaNode setMin(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1220136089, oncanceled);
            onCancelLoad.getMin(-1220136089, oncanceled);
        }
        List<YogaNode> list = this.setMax;
        if (list != null) {
            return list.get(i);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }

    public final void length(YogaNode yogaNode, int i) {
        if (yogaNode.setMin == null) {
            if (this.setMax == null) {
                this.setMax = new ArrayList(4);
            }
            this.setMax.add(i, yogaNode);
            yogaNode.setMin = this;
            jni_YGNodeInsertChild(this.getMin, yogaNode.getMin, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    /* access modifiers changed from: private */
    /* renamed from: length */
    public YogaNode clone() {
        try {
            YogaNode yogaNode = (YogaNode) super.clone();
            long jni_YGNodeClone = jni_YGNodeClone(this.getMin, yogaNode);
            if (this.setMax != null) {
                for (YogaNode next : this.setMax) {
                    jni_YGNodeSetOwner(next.getMin, 0);
                    next.setMin = null;
                }
            }
            yogaNode.getMin = jni_YGNodeClone;
            yogaNode.setMin = null;
            List<YogaNode> list = this.setMax != null ? (List) ((ArrayList) this.setMax).clone() : null;
            yogaNode.setMax = list;
            if (list != null) {
                for (YogaNode yogaNode2 : list) {
                    yogaNode2.setMin = null;
                }
            }
            return yogaNode;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean getMax() {
        return this.mHasNewLayout;
    }

    /* renamed from: com.facebook.yoga.YogaNode$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.yoga.YogaEdge[] r0 = com.facebook.yoga.YogaEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.TOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.yoga.YogaEdge r1 = com.facebook.yoga.YogaEdge.END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaNode.AnonymousClass2.<clinit>():void");
        }
    }

    public final float getMax(YogaEdge yogaEdge) {
        switch (AnonymousClass2.setMin[yogaEdge.ordinal()]) {
            case 1:
                return this.mPaddingLeft;
            case 2:
                return this.mPaddingTop;
            case 3:
                return this.mPaddingRight;
            case 4:
                return this.mPaddingBottom;
            case 5:
                return YogaDirection.fromInt(this.mLayoutDirection) == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case 6:
                return YogaDirection.fromInt(this.mLayoutDirection) == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public final float getMin(YogaEdge yogaEdge) {
        switch (AnonymousClass2.setMin[yogaEdge.ordinal()]) {
            case 1:
                return this.mBorderLeft;
            case 2:
                return this.mBorderTop;
            case 3:
                return this.mBorderRight;
            case 4:
                return this.mBorderBottom;
            case 5:
                return YogaDirection.fromInt(this.mLayoutDirection) == YogaDirection.RTL ? this.mBorderRight : this.mBorderLeft;
            case 6:
                return YogaDirection.fromInt(this.mLayoutDirection) == YogaDirection.RTL ? this.mBorderLeft : this.mBorderRight;
            default:
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @DoNotStrip
    public final long measure(float f, int i, float f2, int i2) {
        if (setMax()) {
            return this.length.measure(this, f, YogaMeasureMode.fromInt(i), f2, YogaMeasureMode.fromInt(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @DoNotStrip
    public final float baseline(float f, float f2) {
        return this.getMax.baseline(this, f, f2);
    }

    private boolean setMax() {
        return this.length != null;
    }

    @DoNotStrip
    private final long replaceChild(YogaNode yogaNode, int i) {
        List<YogaNode> list = this.setMax;
        if (list != null) {
            list.remove(i);
            this.setMax.add(i, yogaNode);
            yogaNode.setMin = this;
            return yogaNode.getMin;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            if (this.getMin > 0) {
                long j = this.getMin;
                this.getMin = 0;
                jni_YGNodeFree(j);
            }
        } finally {
            super.finalize();
        }
    }
}
