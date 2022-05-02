package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.ConstraintAnchor;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import o.AnimRes;
import o.AnimatorRes;
import o.CheckResult;
import o.ColorRes;
import o.ComponentActivity;
import o.DrawableRes;
import o.from;
import o.reportFullyDrawn;
import o.to;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    protected ColorRes mConstraintLayoutSpec = null;
    private from mConstraintSet = null;
    private int mConstraintSetId = -1;
    private DrawableRes mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    public AnimRes mLayoutWidget = new AnimRes();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    getMax mMeasurer = new getMax(this);
    private ComponentActivity.AnonymousClass5 mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public ConstraintLayout(@NonNull Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    class getMax implements CheckResult.getMax {
        int equals;
        int getMax;
        int getMin;
        int length;
        ConstraintLayout setMax;
        int setMin;
        int toFloatRange;

        public getMax(ConstraintLayout constraintLayout) {
            this.setMax = constraintLayout;
        }

        private static boolean getMin(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        public final void getMin() {
            int childCount = this.setMax.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.setMax.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).updatePostMeasure(this.setMax);
                }
            }
            int size = this.setMax.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.setMax.mConstraintHelpers.get(i2)).updatePostMeasure(this.setMax);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:116:0x0180  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:166:0x0206  */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x020b  */
        /* JADX WARNING: Removed duplicated region for block: B:170:0x020d  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x0217  */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x0219  */
        /* JADX WARNING: Removed duplicated region for block: B:181:0x0223  */
        /* JADX WARNING: Removed duplicated region for block: B:182:0x0225  */
        /* JADX WARNING: Removed duplicated region for block: B:187:0x022f  */
        /* JADX WARNING: Removed duplicated region for block: B:188:0x0231  */
        /* JADX WARNING: Removed duplicated region for block: B:192:0x023a  */
        /* JADX WARNING: Removed duplicated region for block: B:193:0x023c  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x023f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:196:0x0240  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void setMax(androidx.constraintlayout.solver.widgets.ConstraintWidget r18, o.CheckResult.setMax r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.areNotificationsEnabled
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001d
                boolean r3 = r18.values()
                if (r3 != 0) goto L_0x001d
                r2.toFloatRange = r5
                r2.toIntRange = r5
                r2.equals = r5
                return
            L_0x001d:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r1.requestPostMessageChannel
                if (r3 != 0) goto L_0x0022
                return
            L_0x0022:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getMin
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r6 = r2.setMax
                int r7 = r2.IsOverlapping
                int r8 = r2.isInside
                int r9 = r0.getMin
                int r10 = r0.length
                int r9 = r9 + r10
                int r10 = r0.getMax
                java.lang.Object r11 = r1.ITrustedWebActivityCallback$Stub$Proxy
                android.view.View r11 = (android.view.View) r11
                int[] r12 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass5.setMin
                int r13 = r3.ordinal()
                r12 = r12[r13]
                r13 = 4
                r14 = 3
                r15 = 2
                r5 = -2
                r4 = 1
                if (r12 == r4) goto L_0x00c5
                if (r12 == r15) goto L_0x00be
                if (r12 == r14) goto L_0x00a0
                if (r12 == r13) goto L_0x004d
                r7 = 0
                goto L_0x00cb
            L_0x004d:
                int r7 = r0.toFloatRange
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r5)
                int r10 = r1.Mean$Arithmetic
                if (r10 != r4) goto L_0x0059
                r10 = 1
                goto L_0x005a
            L_0x0059:
                r10 = 0
            L_0x005a:
                int r12 = r2.values
                int r13 = o.CheckResult.setMax.length
                if (r12 == r13) goto L_0x0066
                int r12 = r2.values
                int r13 = o.CheckResult.setMax.setMin
                if (r12 != r13) goto L_0x00cb
            L_0x0066:
                int r12 = r11.getMeasuredHeight()
                int r13 = r1.areNotificationsEnabled
                r14 = 8
                if (r13 != r14) goto L_0x0072
                r13 = 0
                goto L_0x0074
            L_0x0072:
                int r13 = r1.postMessage
            L_0x0074:
                if (r12 != r13) goto L_0x0078
                r12 = 1
                goto L_0x0079
            L_0x0078:
                r12 = 0
            L_0x0079:
                int r13 = r2.values
                int r14 = o.CheckResult.setMax.setMin
                if (r13 == r14) goto L_0x0092
                if (r10 == 0) goto L_0x0092
                if (r10 == 0) goto L_0x0085
                if (r12 != 0) goto L_0x0092
            L_0x0085:
                boolean r10 = r11 instanceof androidx.constraintlayout.widget.Placeholder
                if (r10 != 0) goto L_0x0092
                boolean r10 = r18.getMin()
                if (r10 == 0) goto L_0x0090
                goto L_0x0092
            L_0x0090:
                r10 = 0
                goto L_0x0093
            L_0x0092:
                r10 = 1
            L_0x0093:
                if (r10 == 0) goto L_0x00cb
                int r7 = r1.areNotificationsEnabled
                r10 = 8
                if (r7 != r10) goto L_0x009d
                r7 = 0
                goto L_0x00c5
            L_0x009d:
                int r7 = r1.requestPostMessageChannelWithExtras
                goto L_0x00c5
            L_0x00a0:
                int r7 = r0.toFloatRange
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r1.ICustomTabsCallback$Default
                if (r12 == 0) goto L_0x00ad
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r1.ICustomTabsCallback$Default
                int r12 = r12.equals
                r13 = 0
                int r12 = r12 + r13
                goto L_0x00ae
            L_0x00ad:
                r12 = 0
            L_0x00ae:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.ICustomTabsCallback$Stub$Proxy
                if (r13 == 0) goto L_0x00b7
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r13 = r1.ICustomTabsCallback$Stub$Proxy
                int r13 = r13.equals
                int r12 = r12 + r13
            L_0x00b7:
                int r10 = r10 + r12
                r12 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r12)
                goto L_0x00cb
            L_0x00be:
                int r7 = r0.toFloatRange
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r10, r5)
                goto L_0x00cb
            L_0x00c5:
                r10 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r10)
            L_0x00cb:
                int[] r10 = androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass5.setMin
                int r12 = r6.ordinal()
                r10 = r10[r12]
                if (r10 == r4) goto L_0x015b
                if (r10 == r15) goto L_0x0153
                r8 = 3
                if (r10 == r8) goto L_0x0135
                r8 = 4
                if (r10 == r8) goto L_0x00e0
                r13 = 0
                goto L_0x0162
            L_0x00e0:
                int r8 = r0.equals
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r8, r9, r5)
                int r8 = r1.invoke
                if (r8 != r4) goto L_0x00ec
                r8 = 1
                goto L_0x00ed
            L_0x00ec:
                r8 = 0
            L_0x00ed:
                int r9 = r2.values
                int r10 = o.CheckResult.setMax.length
                if (r9 == r10) goto L_0x00f9
                int r9 = r2.values
                int r10 = o.CheckResult.setMax.setMin
                if (r9 != r10) goto L_0x0159
            L_0x00f9:
                int r9 = r11.getMeasuredWidth()
                int r10 = r1.areNotificationsEnabled
                r12 = 8
                if (r10 != r12) goto L_0x0105
                r10 = 0
                goto L_0x0107
            L_0x0105:
                int r10 = r1.requestPostMessageChannelWithExtras
            L_0x0107:
                if (r9 != r10) goto L_0x010b
                r9 = 1
                goto L_0x010c
            L_0x010b:
                r9 = 0
            L_0x010c:
                int r10 = r2.values
                int r12 = o.CheckResult.setMax.setMin
                if (r10 == r12) goto L_0x0125
                if (r8 == 0) goto L_0x0125
                if (r8 == 0) goto L_0x0118
                if (r9 != 0) goto L_0x0125
            L_0x0118:
                boolean r8 = r11 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x0125
                boolean r8 = r18.setMin()
                if (r8 == 0) goto L_0x0123
                goto L_0x0125
            L_0x0123:
                r8 = 0
                goto L_0x0126
            L_0x0125:
                r8 = 1
            L_0x0126:
                if (r8 == 0) goto L_0x0159
                int r5 = r1.areNotificationsEnabled
                r8 = 8
                if (r5 != r8) goto L_0x0132
                r5 = 1073741824(0x40000000, float:2.0)
                r8 = 0
                goto L_0x015d
            L_0x0132:
                int r8 = r1.postMessage
                goto L_0x015b
            L_0x0135:
                int r5 = r0.equals
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r1.ICustomTabsCallback$Default
                if (r8 == 0) goto L_0x0142
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r8 = r1.setDefaultImpl
                int r8 = r8.equals
                r10 = 0
                int r8 = r8 + r10
                goto L_0x0143
            L_0x0142:
                r8 = 0
            L_0x0143:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r1.ICustomTabsCallback$Stub$Proxy
                if (r10 == 0) goto L_0x014c
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r1.getInterfaceDescriptor
                int r10 = r10.equals
                int r8 = r8 + r10
            L_0x014c:
                int r9 = r9 + r8
                r8 = -1
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r8)
                goto L_0x0159
            L_0x0153:
                int r8 = r0.equals
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r8, r9, r5)
            L_0x0159:
                r13 = r5
                goto L_0x0162
            L_0x015b:
                r5 = 1073741824(0x40000000, float:2.0)
            L_0x015d:
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r5)
                r13 = r8
            L_0x0162:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r5 = r1.requestPostMessageChannel
                o.AnimRes r5 = (o.AnimRes) r5
                if (r5 == 0) goto L_0x0200
                androidx.constraintlayout.widget.ConstraintLayout r8 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r8 = r8.mOptimizationLevel
                r9 = 256(0x100, float:3.59E-43)
                boolean r8 = o.ArrayRes.setMin(r8, r9)
                if (r8 == 0) goto L_0x0200
                int r8 = r11.getMeasuredWidth()
                int r9 = r1.areNotificationsEnabled
                r10 = 8
                if (r9 != r10) goto L_0x0182
                r9 = 0
                goto L_0x0184
            L_0x0182:
                int r9 = r1.requestPostMessageChannelWithExtras
            L_0x0184:
                if (r8 != r9) goto L_0x0200
                int r8 = r11.getMeasuredWidth()
                int r9 = r5.areNotificationsEnabled
                if (r9 != r10) goto L_0x0190
                r9 = 0
                goto L_0x0192
            L_0x0190:
                int r9 = r5.requestPostMessageChannelWithExtras
            L_0x0192:
                if (r8 >= r9) goto L_0x0200
                int r8 = r11.getMeasuredHeight()
                int r9 = r1.areNotificationsEnabled
                if (r9 != r10) goto L_0x019e
                r9 = 0
                goto L_0x01a0
            L_0x019e:
                int r9 = r1.postMessage
            L_0x01a0:
                if (r8 != r9) goto L_0x0200
                int r8 = r11.getMeasuredHeight()
                int r9 = r5.areNotificationsEnabled
                if (r9 != r10) goto L_0x01ac
                r5 = 0
                goto L_0x01ae
            L_0x01ac:
                int r5 = r5.postMessage
            L_0x01ae:
                if (r8 >= r5) goto L_0x0200
                int r5 = r11.getBaseline()
                int r8 = r1.IPostMessageService$Stub
                if (r5 != r8) goto L_0x0200
                boolean r5 = r18.Grayscale$Algorithm()
                if (r5 != 0) goto L_0x0200
                int r5 = r1.asBinder
                int r8 = r1.areNotificationsEnabled
                r9 = 8
                if (r8 != r9) goto L_0x01c8
                r8 = 0
                goto L_0x01ca
            L_0x01c8:
                int r8 = r1.requestPostMessageChannelWithExtras
            L_0x01ca:
                boolean r5 = getMin(r5, r7, r8)
                if (r5 == 0) goto L_0x01e2
                int r5 = r1.asInterface
                int r8 = r1.areNotificationsEnabled
                if (r8 != r9) goto L_0x01d8
                r8 = 0
                goto L_0x01da
            L_0x01d8:
                int r8 = r1.postMessage
            L_0x01da:
                boolean r5 = getMin(r5, r13, r8)
                if (r5 == 0) goto L_0x01e2
                r5 = 1
                goto L_0x01e3
            L_0x01e2:
                r5 = 0
            L_0x01e3:
                if (r5 == 0) goto L_0x0200
                int r3 = r1.areNotificationsEnabled
                r4 = 8
                if (r3 != r4) goto L_0x01ed
                r3 = 0
                goto L_0x01ef
            L_0x01ed:
                int r3 = r1.requestPostMessageChannelWithExtras
            L_0x01ef:
                r2.toFloatRange = r3
                int r3 = r1.areNotificationsEnabled
                if (r3 != r4) goto L_0x01f7
                r5 = 0
                goto L_0x01f9
            L_0x01f7:
                int r5 = r1.postMessage
            L_0x01f9:
                r2.toIntRange = r5
                int r1 = r1.IPostMessageService$Stub
                r2.equals = r1
                return
            L_0x0200:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r5) goto L_0x0206
                r5 = 1
                goto L_0x0207
            L_0x0206:
                r5 = 0
            L_0x0207:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r6 != r8) goto L_0x020d
                r8 = 1
                goto L_0x020e
            L_0x020d:
                r8 = 0
            L_0x020e:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r6 == r9) goto L_0x0219
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r6 != r9) goto L_0x0217
                goto L_0x0219
            L_0x0217:
                r6 = 0
                goto L_0x021a
            L_0x0219:
                r6 = 1
            L_0x021a:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r3 == r9) goto L_0x0225
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r9) goto L_0x0223
                goto L_0x0225
            L_0x0223:
                r3 = 0
                goto L_0x0226
            L_0x0225:
                r3 = 1
            L_0x0226:
                r9 = 0
                if (r5 == 0) goto L_0x0231
                float r10 = r1.updateVisuals
                int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r10 <= 0) goto L_0x0231
                r10 = 1
                goto L_0x0232
            L_0x0231:
                r10 = 0
            L_0x0232:
                if (r8 == 0) goto L_0x023c
                float r12 = r1.updateVisuals
                int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x023c
                r9 = 1
                goto L_0x023d
            L_0x023c:
                r9 = 0
            L_0x023d:
                if (r11 != 0) goto L_0x0240
                return
            L_0x0240:
                android.view.ViewGroup$LayoutParams r12 = r11.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
                int r14 = r2.values
                int r15 = o.CheckResult.setMax.length
                if (r14 == r15) goto L_0x0266
                int r14 = r2.values
                int r15 = o.CheckResult.setMax.setMin
                if (r14 == r15) goto L_0x0266
                if (r5 == 0) goto L_0x0266
                int r5 = r1.Mean$Arithmetic
                if (r5 != 0) goto L_0x0266
                if (r8 == 0) goto L_0x0266
                int r5 = r1.invoke
                if (r5 == 0) goto L_0x025f
                goto L_0x0266
            L_0x025f:
                r0 = -1
                r3 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                goto L_0x0318
            L_0x0266:
                boolean r5 = r11 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r5 == 0) goto L_0x0278
                boolean r5 = r1 instanceof o.BinderThread
                if (r5 == 0) goto L_0x0278
                r5 = r1
                o.BinderThread r5 = (o.BinderThread) r5
                r8 = r11
                androidx.constraintlayout.widget.VirtualLayout r8 = (androidx.constraintlayout.widget.VirtualLayout) r8
                r8.onMeasure(r5, r7, r13)
                goto L_0x027b
            L_0x0278:
                r11.measure(r7, r13)
            L_0x027b:
                r1.asBinder = r7
                r1.asInterface = r13
                r5 = 0
                r1.values = r5
                int r5 = r11.getMeasuredWidth()
                int r8 = r11.getMeasuredHeight()
                int r14 = r11.getBaseline()
                int r15 = r1.invokeSuspend
                if (r15 <= 0) goto L_0x0299
                int r15 = r1.invokeSuspend
                int r15 = java.lang.Math.max(r15, r5)
                goto L_0x029a
            L_0x0299:
                r15 = r5
            L_0x029a:
                int r4 = r1.Grayscale$Algorithm
                if (r4 <= 0) goto L_0x02a4
                int r4 = r1.Grayscale$Algorithm
                int r15 = java.lang.Math.min(r4, r15)
            L_0x02a4:
                int r4 = r1.onNavigationEvent
                if (r4 <= 0) goto L_0x02b1
                int r4 = r1.onNavigationEvent
                int r4 = java.lang.Math.max(r4, r8)
                r16 = r7
                goto L_0x02b4
            L_0x02b1:
                r16 = r7
                r4 = r8
            L_0x02b4:
                int r7 = r1.getCause
                if (r7 <= 0) goto L_0x02be
                int r7 = r1.getCause
                int r4 = java.lang.Math.min(r7, r4)
            L_0x02be:
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.mOptimizationLevel
                r0 = 1
                boolean r7 = o.ArrayRes.setMin(r7, r0)
                if (r7 != 0) goto L_0x02e5
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r10 == 0) goto L_0x02da
                if (r6 == 0) goto L_0x02da
                float r3 = r1.updateVisuals
                float r6 = (float) r4
                float r6 = r6 * r3
                float r6 = r6 + r0
                int r0 = (int) r6
                r15 = r0
                goto L_0x02e5
            L_0x02da:
                if (r9 == 0) goto L_0x02e5
                if (r3 == 0) goto L_0x02e5
                float r3 = r1.updateVisuals
                float r4 = (float) r15
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r4 = r0
            L_0x02e5:
                if (r5 != r15) goto L_0x02ee
                if (r8 == r4) goto L_0x02ea
                goto L_0x02ee
            L_0x02ea:
                r3 = r4
                r0 = -1
                r13 = 0
                goto L_0x0318
            L_0x02ee:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r5 == r15) goto L_0x02f7
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x02f9
            L_0x02f7:
                r7 = r16
            L_0x02f9:
                if (r8 == r4) goto L_0x02ff
                int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r0)
            L_0x02ff:
                r11.measure(r7, r13)
                r1.asBinder = r7
                r1.asInterface = r13
                r13 = 0
                r1.values = r13
                int r0 = r11.getMeasuredWidth()
                int r3 = r11.getMeasuredHeight()
                int r4 = r11.getBaseline()
                r15 = r0
                r14 = r4
                r0 = -1
            L_0x0318:
                if (r14 == r0) goto L_0x031c
                r0 = 1
                goto L_0x031d
            L_0x031c:
                r0 = 0
            L_0x031d:
                int r4 = r2.IsOverlapping
                if (r15 != r4) goto L_0x0328
                int r4 = r2.isInside
                if (r3 == r4) goto L_0x0326
                goto L_0x0328
            L_0x0326:
                r5 = 0
                goto L_0x0329
            L_0x0328:
                r5 = 1
            L_0x0329:
                r2.hashCode = r5
                boolean r4 = r12.receiveFile
                if (r4 == 0) goto L_0x0330
                r0 = 1
            L_0x0330:
                if (r0 == 0) goto L_0x033c
                r4 = -1
                if (r14 == r4) goto L_0x033c
                int r1 = r1.IPostMessageService$Stub
                if (r1 == r14) goto L_0x033c
                r1 = 1
                r2.hashCode = r1
            L_0x033c:
                r2.toFloatRange = r15
                r2.toIntRange = r3
                r2.toDoubleRange = r0
                r2.equals = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.getMax.setMax(androidx.constraintlayout.solver.widgets.ConstraintWidget, o.CheckResult$setMax):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.AnonymousClass5.<clinit>():void");
        }
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.ITrustedWebActivityCallback$Stub$Proxy = this;
        this.mLayoutWidget.getMin((CheckResult.getMax) this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.onSessionDestroyed, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == to.length.onSessionReady) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == to.length.unregisterCallbackListener) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == to.length.IMediaControllerCallback$Stub) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == to.length.onShuffleModeChanged) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == to.length.ResultReceiver$MyResultReceiver) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == to.length.prepare) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == to.length.getVolumeAttributes) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        from from = new from();
                        this.mConstraintSet = from;
                        from.getMax(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        AnimRes animRes = this.mLayoutWidget;
        animRes.onPlaybackStateChanged = this.mOptimizationLevel;
        reportFullyDrawn.setMax = animRes.FastBitmap$CoordinateSystem(512);
    }

    /* access modifiers changed from: protected */
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ColorRes(getContext(), this, i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof AnimatorRes)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.cancelNotification = new AnimatorRes();
            layoutParams.ICustomTabsService$Default = true;
            ((AnimatorRes) layoutParams.cancelNotification).hashCode(layoutParams.extraCommand);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).ICustomTabsService$Stub$Proxy = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.onVolumeInfoChanged.remove(viewWidget);
        viewWidget.valueOf();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.valueOf();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).ITrustedWebActivityService = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        from from = this.mConstraintSet;
        if (from != null) {
            from.getMax(this);
        }
        this.mLayoutWidget.onVolumeInfoChanged.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                this.mLayoutWidget.setMin(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, (LayoutParams) childAt5.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        View view2 = view;
        ConstraintWidget constraintWidget6 = constraintWidget;
        LayoutParams layoutParams2 = layoutParams;
        SparseArray<ConstraintWidget> sparseArray2 = sparseArray;
        layoutParams.setMax();
        int i = 0;
        layoutParams2.getSmallIconId = false;
        constraintWidget6.areNotificationsEnabled = view.getVisibility();
        if (layoutParams2.IPostMessageService) {
            constraintWidget6.onTransact = true;
            constraintWidget6.areNotificationsEnabled = 8;
        }
        constraintWidget6.ITrustedWebActivityCallback$Stub$Proxy = view2;
        if (view2 instanceof ConstraintHelper) {
            ((ConstraintHelper) view2).resolveRtl(constraintWidget6, this.mLayoutWidget.toFloatRange());
        }
        if (layoutParams2.ICustomTabsService$Default) {
            AnimatorRes animatorRes = (AnimatorRes) constraintWidget6;
            int i2 = layoutParams2.ITrustedWebActivityService;
            int i3 = layoutParams2.areNotificationsEnabled;
            float f = layoutParams2.ITrustedWebActivityCallback$Stub;
            if (Build.VERSION.SDK_INT < 17) {
                i2 = layoutParams2.getMax;
                i3 = layoutParams2.length;
                f = layoutParams2.setMax;
            }
            if (f != -1.0f) {
                animatorRes.getMax(f);
            } else if (i2 != -1) {
                animatorRes.values(i2);
            } else if (i3 != -1) {
                animatorRes.toString(i3);
            }
        } else {
            int i4 = layoutParams2.IPostMessageService$Stub;
            int i5 = layoutParams2.IPostMessageService$Stub$Proxy;
            int i6 = layoutParams2.ITrustedWebActivityCallback;
            int i7 = layoutParams2.IPostMessageService$Default;
            int i8 = layoutParams2.onExtraCallback;
            int i9 = layoutParams2.ITrustedWebActivityCallback$Stub$Proxy;
            float f2 = layoutParams2.ITrustedWebActivityCallback$Default;
            if (Build.VERSION.SDK_INT < 17) {
                i4 = layoutParams2.getMin;
                int i10 = layoutParams2.setMin;
                i6 = layoutParams2.toIntRange;
                i7 = layoutParams2.isInside;
                i8 = layoutParams2.invoke;
                i9 = layoutParams2.ICustomTabsCallback;
                f2 = layoutParams2.extraCallback;
                if (i4 == -1 && i10 == -1) {
                    if (layoutParams2.Grayscale$Algorithm != -1) {
                        i4 = layoutParams2.Grayscale$Algorithm;
                    } else if (layoutParams2.invokeSuspend != -1) {
                        i10 = layoutParams2.invokeSuspend;
                    }
                }
                i5 = i10;
                if (i6 == -1 && i7 == -1) {
                    if (layoutParams2.valueOf != -1) {
                        i6 = layoutParams2.valueOf;
                    } else if (layoutParams2.Mean$Arithmetic != -1) {
                        i7 = layoutParams2.Mean$Arithmetic;
                    }
                }
            }
            if (layoutParams2.values != -1) {
                ConstraintWidget constraintWidget7 = sparseArray2.get(layoutParams2.values);
                if (constraintWidget7 != null) {
                    float f3 = layoutParams2.hashCode;
                    constraintWidget6.setMax(ConstraintAnchor.Type.CENTER).length(constraintWidget7.setMax(ConstraintAnchor.Type.CENTER), layoutParams2.FastBitmap$CoordinateSystem, 0, true);
                    constraintWidget6.extraCallback = f3;
                }
            } else {
                if (i4 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray2.get(i4);
                    if (constraintWidget8 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                        constraintWidget6.setMax(type).length(constraintWidget8.setMax(type2), layoutParams2.leftMargin, i8, true);
                    }
                } else if (!(i5 == -1 || (constraintWidget5 = sparseArray2.get(i5)) == null)) {
                    ConstraintAnchor.Type type3 = ConstraintAnchor.Type.LEFT;
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget6.setMax(type3).length(constraintWidget5.setMax(type4), layoutParams2.leftMargin, i8, true);
                }
                if (i6 != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray2.get(i6);
                    if (constraintWidget9 != null) {
                        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.RIGHT;
                        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.LEFT;
                        constraintWidget6.setMax(type5).length(constraintWidget9.setMax(type6), layoutParams2.rightMargin, i9, true);
                    }
                } else if (!(i7 == -1 || (constraintWidget4 = sparseArray2.get(i7)) == null)) {
                    ConstraintAnchor.Type type7 = ConstraintAnchor.Type.RIGHT;
                    ConstraintAnchor.Type type8 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget6.setMax(type7).length(constraintWidget4.setMax(type8), layoutParams2.rightMargin, i9, true);
                }
                if (layoutParams2.toFloatRange != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray2.get(layoutParams2.toFloatRange);
                    if (constraintWidget10 != null) {
                        ConstraintAnchor.Type type9 = ConstraintAnchor.Type.TOP;
                        ConstraintAnchor.Type type10 = ConstraintAnchor.Type.TOP;
                        constraintWidget6.setMax(type9).length(constraintWidget10.setMax(type10), layoutParams2.topMargin, layoutParams2.create, true);
                    }
                } else if (!(layoutParams2.IsOverlapping == -1 || (constraintWidget3 = sparseArray2.get(layoutParams2.IsOverlapping)) == null)) {
                    ConstraintAnchor.Type type11 = ConstraintAnchor.Type.TOP;
                    ConstraintAnchor.Type type12 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget6.setMax(type11).length(constraintWidget3.setMax(type12), layoutParams2.topMargin, layoutParams2.create, true);
                }
                if (layoutParams2.equals != -1) {
                    ConstraintWidget constraintWidget11 = sparseArray2.get(layoutParams2.equals);
                    if (constraintWidget11 != null) {
                        ConstraintAnchor.Type type13 = ConstraintAnchor.Type.BOTTOM;
                        ConstraintAnchor.Type type14 = ConstraintAnchor.Type.TOP;
                        constraintWidget6.setMax(type13).length(constraintWidget11.setMax(type14), layoutParams2.bottomMargin, layoutParams2.onNavigationEvent, true);
                    }
                } else if (!(layoutParams2.toDoubleRange == -1 || (constraintWidget2 = sparseArray2.get(layoutParams2.toDoubleRange)) == null)) {
                    ConstraintAnchor.Type type15 = ConstraintAnchor.Type.BOTTOM;
                    ConstraintAnchor.Type type16 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget6.setMax(type15).length(constraintWidget2.setMax(type16), layoutParams2.bottomMargin, layoutParams2.onNavigationEvent, true);
                }
                if (layoutParams2.toString != -1) {
                    View view3 = this.mChildrenByIds.get(layoutParams2.toString);
                    ConstraintWidget constraintWidget12 = sparseArray2.get(layoutParams2.toString);
                    if (!(constraintWidget12 == null || view3 == null || !(view3.getLayoutParams() instanceof LayoutParams))) {
                        LayoutParams layoutParams3 = (LayoutParams) view3.getLayoutParams();
                        layoutParams2.receiveFile = true;
                        layoutParams3.receiveFile = true;
                        constraintWidget6.setMax(ConstraintAnchor.Type.BASELINE).length(constraintWidget12.setMax(ConstraintAnchor.Type.BASELINE), 0, -1, true);
                        constraintWidget6.ICustomTabsCallback$Stub = true;
                        layoutParams3.cancelNotification.ICustomTabsCallback$Stub = true;
                        constraintWidget6.setMax(ConstraintAnchor.Type.TOP).setMin();
                        constraintWidget6.setMax(ConstraintAnchor.Type.BOTTOM).setMin();
                    }
                }
                if (f2 >= 0.0f) {
                    constraintWidget6.ITrustedWebActivityCallback$Default = f2;
                }
                if (layoutParams2.onMessageChannelReady >= 0.0f) {
                    constraintWidget6.ITrustedWebActivityCallback$Stub = layoutParams2.onMessageChannelReady;
                }
            }
            if (z && !(layoutParams2.warmup == -1 && layoutParams2.newSessionWithExtras == -1)) {
                constraintWidget6.setMax(layoutParams2.warmup, layoutParams2.newSessionWithExtras);
            }
            if (layoutParams2.requestPostMessageChannelWithExtras) {
                constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                constraintWidget6.getMax(layoutParams2.width);
                if (layoutParams2.width == -2) {
                    constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
            } else if (layoutParams2.width == -1) {
                if (layoutParams2.updateVisuals) {
                    constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                } else {
                    constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                }
                constraintWidget6.setMax(ConstraintAnchor.Type.LEFT).equals = layoutParams2.leftMargin;
                constraintWidget6.setMax(ConstraintAnchor.Type.RIGHT).equals = layoutParams2.rightMargin;
            } else {
                constraintWidget6.extraCommand[0] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                constraintWidget6.getMax(0);
            }
            if (layoutParams2.postMessage) {
                constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                constraintWidget6.toFloatRange(layoutParams2.height);
                if (layoutParams2.height == -2) {
                    constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
            } else if (layoutParams2.height == -1) {
                if (layoutParams2.validateRelationship) {
                    constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                } else {
                    constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                }
                constraintWidget6.setMax(ConstraintAnchor.Type.TOP).equals = layoutParams2.topMargin;
                constraintWidget6.setMax(ConstraintAnchor.Type.BOTTOM).equals = layoutParams2.bottomMargin;
            } else {
                constraintWidget6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                constraintWidget6.toFloatRange(0);
            }
            constraintWidget6.getMax(layoutParams2.extraCallbackWithResult);
            constraintWidget6.IconCompatParcelizer[0] = layoutParams2.ICustomTabsCallback$Default;
            constraintWidget6.IconCompatParcelizer[1] = layoutParams2.ICustomTabsCallback$Stub;
            constraintWidget6.cancelAll = layoutParams2.asInterface;
            constraintWidget6.INotificationSideChannel$Stub$Proxy = layoutParams2.onTransact;
            int i11 = layoutParams2.asBinder;
            int i12 = layoutParams2.ICustomTabsService;
            int i13 = layoutParams2.getInterfaceDescriptor;
            float f4 = layoutParams2.mayLaunchUrl;
            constraintWidget6.Mean$Arithmetic = i11;
            constraintWidget6.invokeSuspend = i12;
            if (i13 == Integer.MAX_VALUE) {
                i13 = 0;
            }
            constraintWidget6.Grayscale$Algorithm = i13;
            constraintWidget6.ICustomTabsCallback = f4;
            if (f4 > 0.0f && f4 < 1.0f && constraintWidget6.Mean$Arithmetic == 0) {
                constraintWidget6.Mean$Arithmetic = 2;
            }
            int i14 = layoutParams2.ICustomTabsCallback$Stub$Proxy;
            int i15 = layoutParams2.getDefaultImpl;
            int i16 = layoutParams2.setDefaultImpl;
            float f5 = layoutParams2.newSession;
            constraintWidget6.invoke = i14;
            constraintWidget6.onNavigationEvent = i15;
            if (i16 != Integer.MAX_VALUE) {
                i = i16;
            }
            constraintWidget6.getCause = i;
            constraintWidget6.create = f5;
            if (f5 > 0.0f && f5 < 1.0f && constraintWidget6.invoke == 0) {
                constraintWidget6.invoke = 2;
            }
        }
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).cancelNotification;
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).cancelNotification;
    }

    public void fillMetrics(ComponentActivity.AnonymousClass5 r2) {
        this.mMetrics = r2;
        this.mLayoutWidget.MediaBrowserCompat$SearchResultReceiver = r2;
        reportFullyDrawn.getMax(r2);
    }

    public void resolveSystem(AnimRes animRes, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        getMax getmax = this.mMeasurer;
        getmax.getMin = max;
        getmax.length = max2;
        getmax.getMax = paddingWidth;
        getmax.setMin = i5;
        getmax.toFloatRange = i2;
        getmax.equals = i3;
        if (Build.VERSION.SDK_INT >= 17) {
            i4 = Math.max(0, getPaddingStart());
            int max3 = Math.max(0, getPaddingEnd());
            if (i4 <= 0 && max3 <= 0) {
                i4 = Math.max(0, getPaddingLeft());
            } else if (isRtl()) {
                i4 = max3;
            }
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size2 - i5;
        int i7 = mode;
        int i8 = size - paddingWidth;
        int i9 = mode2;
        int i10 = i6;
        setSelfDimensionBehaviour(animRes, i7, i8, i9, i10);
        animRes.getMax(i, i7, i8, i9, i10, i4, max);
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.mMeasurer.setMin;
        int i6 = i3 + this.mMeasurer.getMax;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = resolveSizeAndState(i6, i, 0);
            int resolveSizeAndState2 = resolveSizeAndState(i7, i2, 0);
            int i8 = resolveSizeAndState & FlexItem.MAX_SIZE;
            int i9 = resolveSizeAndState2 & FlexItem.MAX_SIZE;
            int min = Math.min(this.mMaxWidth, i8);
            int min2 = Math.min(this.mMaxHeight, i9);
            if (z) {
                min |= C.DEFAULT_MUXED_BUFFER_SIZE;
            }
            if (z2) {
                min2 |= C.DEFAULT_MUXED_BUFFER_SIZE;
            }
            setMeasuredDimension(min, min2);
            this.mLastMeasureWidth = min;
            this.mLastMeasureHeight = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.mLastMeasureWidth = i6;
        this.mLastMeasureHeight = i7;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                } else if (getChildAt(i10).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            if (this.mOnMeasureWidthMeasureSpec == i && this.mOnMeasureHeightMeasureSpec == i2) {
                AnimRes animRes = this.mLayoutWidget;
                if (animRes.areNotificationsEnabled == 8) {
                    i8 = 0;
                } else {
                    i8 = animRes.requestPostMessageChannelWithExtras;
                }
                AnimRes animRes2 = this.mLayoutWidget;
                if (animRes2.areNotificationsEnabled == 8) {
                    i9 = 0;
                } else {
                    i9 = animRes2.postMessage;
                }
                resolveMeasuredDimension(i, i2, i8, i9, this.mLayoutWidget.length(), this.mLayoutWidget.isInside());
                return;
            } else if (this.mOnMeasureWidthMeasureSpec == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE) {
                int size = View.MeasureSpec.getSize(i2);
                AnimRes animRes3 = this.mLayoutWidget;
                if (animRes3.areNotificationsEnabled == 8) {
                    i5 = 0;
                } else {
                    i5 = animRes3.postMessage;
                }
                if (size >= i5) {
                    this.mOnMeasureWidthMeasureSpec = i;
                    this.mOnMeasureHeightMeasureSpec = i2;
                    AnimRes animRes4 = this.mLayoutWidget;
                    if (animRes4.areNotificationsEnabled == 8) {
                        i6 = 0;
                    } else {
                        i6 = animRes4.requestPostMessageChannelWithExtras;
                    }
                    AnimRes animRes5 = this.mLayoutWidget;
                    if (animRes5.areNotificationsEnabled == 8) {
                        i7 = 0;
                    } else {
                        i7 = animRes5.postMessage;
                    }
                    resolveMeasuredDimension(i, i2, i6, i7, this.mLayoutWidget.length(), this.mLayoutWidget.isInside());
                    return;
                }
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.setMin = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                AnimRes animRes6 = this.mLayoutWidget;
                animRes6.length.getMin(animRes6);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        AnimRes animRes7 = this.mLayoutWidget;
        if (animRes7.areNotificationsEnabled == 8) {
            i3 = 0;
        } else {
            i3 = animRes7.requestPostMessageChannelWithExtras;
        }
        AnimRes animRes8 = this.mLayoutWidget;
        if (animRes8.areNotificationsEnabled == 8) {
            i4 = 0;
        } else {
            i4 = animRes8.postMessage;
        }
        resolveMeasuredDimension(i, i2, i3, i4, this.mLayoutWidget.length(), this.mLayoutWidget.isInside());
    }

    public boolean isRtl() {
        if (Build.VERSION.SDK_INT >= 17) {
            if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
                return false;
            }
            return true;
        }
        return false;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r13 != r10) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSelfDimensionBehaviour(o.AnimRes r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.ConstraintLayout$getMax r0 = r8.mMeasurer
            int r0 = r0.setMin
            androidx.constraintlayout.widget.ConstraintLayout$getMax r1 = r8.mMeasurer
            int r1 = r1.getMax
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            int r4 = r8.getChildCount()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r10 == r6) goto L_0x0030
            if (r10 == 0) goto L_0x0025
            if (r10 == r5) goto L_0x001d
        L_0x001b:
            r11 = 0
            goto L_0x003a
        L_0x001d:
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            int r11 = java.lang.Math.min(r10, r11)
            goto L_0x003a
        L_0x0025:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L_0x001b
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r7, r10)
            goto L_0x003a
        L_0x0030:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L_0x003a
            int r10 = r8.mMinWidth
            int r11 = java.lang.Math.max(r7, r10)
        L_0x003a:
            if (r12 == r6) goto L_0x0055
            if (r12 == 0) goto L_0x004a
            if (r12 == r5) goto L_0x0042
        L_0x0040:
            r13 = 0
            goto L_0x005f
        L_0x0042:
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            int r13 = java.lang.Math.min(r10, r13)
            goto L_0x005f
        L_0x004a:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L_0x0040
            int r10 = r8.mMinHeight
            int r13 = java.lang.Math.max(r7, r10)
            goto L_0x005f
        L_0x0055:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r4 != 0) goto L_0x005f
            int r10 = r8.mMinHeight
            int r13 = java.lang.Math.max(r7, r10)
        L_0x005f:
            int r10 = r9.areNotificationsEnabled
            r12 = 8
            if (r10 != r12) goto L_0x0067
            r10 = 0
            goto L_0x0069
        L_0x0067:
            int r10 = r9.requestPostMessageChannelWithExtras
        L_0x0069:
            r4 = 1
            if (r11 != r10) goto L_0x0076
            int r10 = r9.areNotificationsEnabled
            if (r10 != r12) goto L_0x0072
            r10 = 0
            goto L_0x0074
        L_0x0072:
            int r10 = r9.postMessage
        L_0x0074:
            if (r13 == r10) goto L_0x007a
        L_0x0076:
            o.suggest r10 = r9.setMax
            r10.getMin = r4
        L_0x007a:
            r9.length((int) r7)
            r9.setMin((int) r7)
            int r10 = r8.mMaxWidth
            int r10 = r10 - r1
            int[] r12 = r9.onMessageChannelReady
            r12[r7] = r10
            int r10 = r8.mMaxHeight
            int r10 = r10 - r0
            int[] r12 = r9.onMessageChannelReady
            r12[r4] = r10
            r9.toIntRange(r7)
            r9.isInside(r7)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r9.extraCommand
            r10[r7] = r2
            r9.getMax((int) r11)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r9.extraCommand
            r10[r4] = r3
            r9.toFloatRange(r13)
            int r10 = r8.mMinWidth
            int r10 = r10 - r1
            r9.toIntRange(r10)
            int r10 = r8.mMinHeight
            int r10 = r10 - r0
            r9.isInside(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setSelfDimensionBehaviour(o.AnimRes, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        ColorRes colorRes = this.mConstraintLayoutSpec;
        if (colorRes != null) {
            colorRes.getMin(i, (float) i2, (float) i3);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.cancelNotification;
            if ((childAt.getVisibility() != 8 || layoutParams.ICustomTabsService$Default || layoutParams.ICustomTabsService$Stub$Proxy || layoutParams.ICustomTabsService$Stub || isInEditMode) && !layoutParams.IPostMessageService) {
                int Mean$Arithmetic = constraintWidget.Mean$Arithmetic();
                int onNavigationEvent = constraintWidget.onNavigationEvent();
                if (constraintWidget.areNotificationsEnabled == 8) {
                    i5 = 0;
                } else {
                    i5 = constraintWidget.requestPostMessageChannelWithExtras;
                }
                int i8 = i5 + Mean$Arithmetic;
                if (constraintWidget.areNotificationsEnabled == 8) {
                    i6 = 0;
                } else {
                    i6 = constraintWidget.postMessage;
                }
                int i9 = i6 + onNavigationEvent;
                childAt.layout(Mean$Arithmetic, onNavigationEvent, i8, i9);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(Mean$Arithmetic, onNavigationEvent, i8, i9);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.mConstraintHelpers.get(i10).updatePostLayout(this);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        AnimRes animRes = this.mLayoutWidget;
        animRes.onPlaybackStateChanged = i;
        reportFullyDrawn.setMax = animRes.FastBitmap$CoordinateSystem(512);
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.onPlaybackStateChanged;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setConstraintSet(from from) {
        this.mConstraintSet = from;
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f10 = parseInt4;
                        float f11 = f7;
                        canvas2.drawLine(f8, f10, f11, f9, paint);
                        float f12 = f7;
                        canvas2.drawLine(f12, f10, f11, f5, paint);
                        paint.setColor(-16711936);
                        float f13 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f12, f5, f13, parseInt4, paint);
                        canvas2.drawLine(f12, parseInt4, f13, f5, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(DrawableRes drawableRes) {
        this.mConstraintsChangedListener = drawableRes;
        ColorRes colorRes = this.mConstraintLayoutSpec;
        if (colorRes != null) {
            colorRes.getMin = drawableRes;
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new ColorRes(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public int FastBitmap$CoordinateSystem = 0;
        public int Grayscale$Algorithm = -1;
        public int ICustomTabsCallback = -1;
        public float ICustomTabsCallback$Default = -1.0f;
        public float ICustomTabsCallback$Stub = -1.0f;
        public int ICustomTabsCallback$Stub$Proxy = 0;
        public int ICustomTabsService = 0;
        boolean ICustomTabsService$Default = false;
        boolean ICustomTabsService$Stub = false;
        boolean ICustomTabsService$Stub$Proxy = false;
        boolean IPostMessageService = false;
        int IPostMessageService$Default = -1;
        int IPostMessageService$Stub = -1;
        int IPostMessageService$Stub$Proxy = -1;
        int ITrustedWebActivityCallback = -1;
        float ITrustedWebActivityCallback$Default = 0.5f;
        float ITrustedWebActivityCallback$Stub;
        int ITrustedWebActivityCallback$Stub$Proxy = -1;
        int ITrustedWebActivityService;
        public int IsOverlapping = -1;
        public int Mean$Arithmetic = -1;
        int areNotificationsEnabled;
        public int asBinder = 0;
        public int asInterface = 0;
        public int b = -1;
        public ConstraintWidget cancelNotification = new ConstraintWidget();
        public int create = -1;
        public int equals = -1;
        public float extraCallback = 0.5f;
        public String extraCallbackWithResult = null;
        public int extraCommand = -1;
        public int getCause = -1;
        public int getDefaultImpl = 0;
        public int getInterfaceDescriptor = 0;
        public int getMax = -1;
        public int getMin = -1;
        public boolean getSmallIconId = false;
        public float hashCode = 0.0f;
        public int invoke = -1;
        public int invokeSuspend = -1;
        public int isInside = -1;
        public int length = -1;
        public float mayLaunchUrl = 1.0f;
        public float newSession = 1.0f;
        public int newSessionWithExtras = -1;
        int onExtraCallback = -1;
        public float onMessageChannelReady = 0.5f;
        public int onNavigationEvent = -1;
        float onPostMessage = 0.0f;
        int onRelationshipValidationResult = 1;
        public int onTransact = 0;
        boolean postMessage = true;
        boolean receiveFile = false;
        public String requestPostMessageChannel = null;
        boolean requestPostMessageChannelWithExtras = true;
        public int setDefaultImpl = 0;
        public float setMax = -1.0f;
        public int setMin = -1;
        public int toDoubleRange = -1;
        public int toFloatRange = -1;
        public int toIntRange = -1;
        public int toString = -1;
        public boolean updateVisuals = false;
        public boolean validateRelationship = false;
        public int valueOf = -1;
        public int values = -1;
        public int warmup = -1;

        static class setMin {
            public static final SparseIntArray getMax;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                getMax = sparseIntArray;
                sparseIntArray.append(to.length.MediaControllerCompat$Callback$StubCompat, 8);
                getMax.append(to.length.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, 9);
                getMax.append(to.length.MediaSessionCompat$ResultReceiverWrapper, 10);
                getMax.append(to.length.MediaSessionCompat$MediaSessionImplBase$MediaSessionStub, 11);
                getMax.append(to.length.PlaybackStateCompat, 12);
                getMax.append(to.length.PlaybackStateCompat$Actions, 13);
                getMax.append(to.length.previous, 14);
                getMax.append(to.length.playFromUri, 15);
                getMax.append(to.length.playFromSearch, 16);
                getMax.append(to.length.next, 2);
                getMax.append(to.length.pause, 3);
                getMax.append(to.length.fastForward, 4);
                getMax.append(to.length.IResultReceiver$Stub$Proxy, 49);
                getMax.append(to.length.IResultReceiver$Stub, 50);
                getMax.append(to.length.rateWithExtras, 5);
                getMax.append(to.length.rewind, 6);
                getMax.append(to.length.seekTo, 7);
                getMax.append(to.length.onRepeatModeChanged, 1);
                getMax.append(to.length.postToHandler, 17);
                getMax.append(to.length.MediaSessionCompat$QueueItem, 18);
                getMax.append(to.length.setCaptioningEnabled, 19);
                getMax.append(to.length.rate, 20);
                getMax.append(to.length.onCreate, 21);
                getMax.append(to.length.ComponentActivity, 22);
                getMax.append(to.length.ResultReceiver, 23);
                getMax.append(to.length.IResultReceiver$Default, 24);
                getMax.append(to.length.onSaveInstanceState, 25);
                getMax.append(to.length.send, 26);
                getMax.append(to.length.setShuffleMode, 29);
                getMax.append(to.length.ParcelableVolumeInfo, 30);
                getMax.append(to.length.stop, 44);
                getMax.append(to.length.MediaControllerCompat$MediaControllerImplApi21$ExtraCallback, 45);
                getMax.append(to.length.PlaybackStateCompat$ShuffleMode, 46);
                getMax.append(to.length.IMediaSession$Stub$Proxy, 47);
                getMax.append(to.length.PlaybackStateCompat$ErrorCode, 48);
                getMax.append(to.length.skipToQueueItem, 27);
                getMax.append(to.length.prepareFromUri, 28);
                getMax.append(to.length.PlaybackStateCompat$RepeatMode, 31);
                getMax.append(to.length.setRepeatMode, 32);
                getMax.append(to.length.PlaybackStateCompat$MediaKeyAction, 33);
                getMax.append(to.length.PlaybackStateCompat$State, 34);
                getMax.append(to.length.IResultReceiver, 35);
                getMax.append(to.length.setShuffleModeEnabledRemoved, 36);
                getMax.append(to.length.sendCustomAction, 37);
                getMax.append(to.length.IMediaSession$Stub, 38);
                getMax.append(to.length.MediaSessionCompat$MediaSessionImplApi21$ExtraSession, 39);
                getMax.append(to.length.PlaybackStateCompat$CustomAction, 40);
                getMax.append(to.length.MediaSessionCompat$SessionFlags, 41);
                getMax.append(to.length.playFromMediaId, 42);
                getMax.append(to.length.play, 43);
                getMax.append(to.length.MediaSessionCompat$Token, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, to.length.onSessionDestroyed);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = setMin.getMax.get(index);
                switch (i3) {
                    case 1:
                        this.extraCommand = obtainStyledAttributes.getInt(index, this.extraCommand);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.values);
                        this.values = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.values = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.FastBitmap$CoordinateSystem = obtainStyledAttributes.getDimensionPixelSize(index, this.FastBitmap$CoordinateSystem);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.hashCode) % 360.0f;
                        this.hashCode = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.hashCode = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.getMax = obtainStyledAttributes.getDimensionPixelOffset(index, this.getMax);
                        break;
                    case 6:
                        this.length = obtainStyledAttributes.getDimensionPixelOffset(index, this.length);
                        break;
                    case 7:
                        this.setMax = obtainStyledAttributes.getFloat(index, this.setMax);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.getMin);
                        this.getMin = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.getMin = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.setMin);
                        this.setMin = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.setMin = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.toIntRange);
                        this.toIntRange = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.toIntRange = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.isInside);
                        this.isInside = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.isInside = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.toFloatRange);
                        this.toFloatRange = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.toFloatRange = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.IsOverlapping);
                        this.IsOverlapping = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.IsOverlapping = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.equals);
                        this.equals = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.equals = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.toDoubleRange);
                        this.toDoubleRange = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.toDoubleRange = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.toString);
                        this.toString = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.toString = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.invokeSuspend);
                        this.invokeSuspend = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.invokeSuspend = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.Grayscale$Algorithm);
                        this.Grayscale$Algorithm = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.Grayscale$Algorithm = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.valueOf);
                        this.valueOf = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.valueOf = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.Mean$Arithmetic);
                        this.Mean$Arithmetic = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.Mean$Arithmetic = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.invoke = obtainStyledAttributes.getDimensionPixelSize(index, this.invoke);
                        break;
                    case 22:
                        this.create = obtainStyledAttributes.getDimensionPixelSize(index, this.create);
                        break;
                    case 23:
                        this.ICustomTabsCallback = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsCallback);
                        break;
                    case 24:
                        this.onNavigationEvent = obtainStyledAttributes.getDimensionPixelSize(index, this.onNavigationEvent);
                        break;
                    case 25:
                        this.b = obtainStyledAttributes.getDimensionPixelSize(index, this.b);
                        break;
                    case 26:
                        this.getCause = obtainStyledAttributes.getDimensionPixelSize(index, this.getCause);
                        break;
                    case 27:
                        this.updateVisuals = obtainStyledAttributes.getBoolean(index, this.updateVisuals);
                        break;
                    case 28:
                        this.validateRelationship = obtainStyledAttributes.getBoolean(index, this.validateRelationship);
                        break;
                    case 29:
                        this.extraCallback = obtainStyledAttributes.getFloat(index, this.extraCallback);
                        break;
                    case 30:
                        this.onMessageChannelReady = obtainStyledAttributes.getFloat(index, this.onMessageChannelReady);
                        break;
                    case 31:
                        this.asBinder = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.ICustomTabsCallback$Stub$Proxy = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.ICustomTabsService = obtainStyledAttributes.getDimensionPixelSize(index, this.ICustomTabsService);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.ICustomTabsService) != -2) {
                                break;
                            } else {
                                this.ICustomTabsService = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.getInterfaceDescriptor = obtainStyledAttributes.getDimensionPixelSize(index, this.getInterfaceDescriptor);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.getInterfaceDescriptor) != -2) {
                                break;
                            } else {
                                this.getInterfaceDescriptor = -2;
                                break;
                            }
                        }
                    case 35:
                        this.mayLaunchUrl = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.mayLaunchUrl));
                        this.asBinder = 2;
                        break;
                    case 36:
                        try {
                            this.getDefaultImpl = obtainStyledAttributes.getDimensionPixelSize(index, this.getDefaultImpl);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.getDefaultImpl) != -2) {
                                break;
                            } else {
                                this.getDefaultImpl = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.setDefaultImpl = obtainStyledAttributes.getDimensionPixelSize(index, this.setDefaultImpl);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.setDefaultImpl) != -2) {
                                break;
                            } else {
                                this.setDefaultImpl = -2;
                                break;
                            }
                        }
                    case 38:
                        this.newSession = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.newSession));
                        this.ICustomTabsCallback$Stub$Proxy = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.extraCallbackWithResult = string;
                                this.onPostMessage = Float.NaN;
                                this.onRelationshipValidationResult = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length2 = string.length();
                                    int indexOf = this.extraCallbackWithResult.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length2 - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.extraCallbackWithResult.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.onRelationshipValidationResult = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.onRelationshipValidationResult = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.extraCallbackWithResult.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length2 - 1) {
                                        String substring2 = this.extraCallbackWithResult.substring(i, indexOf2);
                                        String substring3 = this.extraCallbackWithResult.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.onRelationshipValidationResult != 1) {
                                                        this.onPostMessage = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.onPostMessage = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.extraCallbackWithResult.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.onPostMessage = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.ICustomTabsCallback$Default = obtainStyledAttributes.getFloat(index, this.ICustomTabsCallback$Default);
                                break;
                            case 46:
                                this.ICustomTabsCallback$Stub = obtainStyledAttributes.getFloat(index, this.ICustomTabsCallback$Stub);
                                break;
                            case 47:
                                this.asInterface = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.onTransact = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.warmup = obtainStyledAttributes.getDimensionPixelOffset(index, this.warmup);
                                break;
                            case 50:
                                this.newSessionWithExtras = obtainStyledAttributes.getDimensionPixelOffset(index, this.newSessionWithExtras);
                                break;
                            case 51:
                                this.requestPostMessageChannel = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            setMax();
        }

        public final void setMax() {
            this.ICustomTabsService$Default = false;
            this.requestPostMessageChannelWithExtras = true;
            this.postMessage = true;
            if (this.width == -2 && this.updateVisuals) {
                this.requestPostMessageChannelWithExtras = false;
                if (this.asBinder == 0) {
                    this.asBinder = 1;
                }
            }
            if (this.height == -2 && this.validateRelationship) {
                this.postMessage = false;
                if (this.ICustomTabsCallback$Stub$Proxy == 0) {
                    this.ICustomTabsCallback$Stub$Proxy = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.requestPostMessageChannelWithExtras = false;
                if (this.width == 0 && this.asBinder == 1) {
                    this.width = -2;
                    this.updateVisuals = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.postMessage = false;
                if (this.height == 0 && this.ICustomTabsCallback$Stub$Proxy == 1) {
                    this.height = -2;
                    this.validateRelationship = true;
                }
            }
            if (this.setMax != -1.0f || this.getMax != -1 || this.length != -1) {
                this.ICustomTabsService$Default = true;
                this.requestPostMessageChannelWithExtras = true;
                this.postMessage = true;
                if (!(this.cancelNotification instanceof AnimatorRes)) {
                    this.cancelNotification = new AnimatorRes();
                }
                ((AnimatorRes) this.cancelNotification).hashCode(this.extraCommand);
            }
        }

        public LayoutParams() {
            super(-2, -2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 0
                r4 = 1
                r5 = 17
                if (r2 < r5) goto L_0x0017
                super.resolveLayoutDirection(r7)
                int r7 = r6.getLayoutDirection()
                if (r4 != r7) goto L_0x0017
                r7 = 1
                goto L_0x0018
            L_0x0017:
                r7 = 0
            L_0x0018:
                r2 = -1
                r6.ITrustedWebActivityCallback = r2
                r6.IPostMessageService$Default = r2
                r6.IPostMessageService$Stub = r2
                r6.IPostMessageService$Stub$Proxy = r2
                r6.onExtraCallback = r2
                r6.ITrustedWebActivityCallback$Stub$Proxy = r2
                int r5 = r6.invoke
                r6.onExtraCallback = r5
                int r5 = r6.ICustomTabsCallback
                r6.ITrustedWebActivityCallback$Stub$Proxy = r5
                float r5 = r6.extraCallback
                r6.ITrustedWebActivityCallback$Default = r5
                int r5 = r6.getMax
                r6.ITrustedWebActivityService = r5
                int r5 = r6.length
                r6.areNotificationsEnabled = r5
                float r5 = r6.setMax
                r6.ITrustedWebActivityCallback$Stub = r5
                if (r7 == 0) goto L_0x00a0
                int r7 = r6.invokeSuspend
                if (r7 == r2) goto L_0x0047
                r6.ITrustedWebActivityCallback = r7
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r7 = r6.Grayscale$Algorithm
                if (r7 == r2) goto L_0x004e
                r6.IPostMessageService$Default = r7
                goto L_0x0045
            L_0x004e:
                int r7 = r6.valueOf
                if (r7 == r2) goto L_0x0055
                r6.IPostMessageService$Stub$Proxy = r7
                r3 = 1
            L_0x0055:
                int r7 = r6.Mean$Arithmetic
                if (r7 == r2) goto L_0x005c
                r6.IPostMessageService$Stub = r7
                r3 = 1
            L_0x005c:
                int r7 = r6.b
                if (r7 == r2) goto L_0x0062
                r6.ITrustedWebActivityCallback$Stub$Proxy = r7
            L_0x0062:
                int r7 = r6.getCause
                if (r7 == r2) goto L_0x0068
                r6.onExtraCallback = r7
            L_0x0068:
                r7 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.extraCallback
                float r3 = r7 - r3
                r6.ITrustedWebActivityCallback$Default = r3
            L_0x0072:
                boolean r3 = r6.ICustomTabsService$Default
                if (r3 == 0) goto L_0x00c4
                int r3 = r6.extraCommand
                if (r3 != r4) goto L_0x00c4
                float r3 = r6.setMax
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r7 = r7 - r3
                r6.ITrustedWebActivityCallback$Stub = r7
                r6.ITrustedWebActivityService = r2
                r6.areNotificationsEnabled = r2
                goto L_0x00c4
            L_0x008a:
                int r7 = r6.getMax
                if (r7 == r2) goto L_0x0095
                r6.areNotificationsEnabled = r7
                r6.ITrustedWebActivityService = r2
                r6.ITrustedWebActivityCallback$Stub = r4
                goto L_0x00c4
            L_0x0095:
                int r7 = r6.length
                if (r7 == r2) goto L_0x00c4
                r6.ITrustedWebActivityService = r7
                r6.areNotificationsEnabled = r2
                r6.ITrustedWebActivityCallback$Stub = r4
                goto L_0x00c4
            L_0x00a0:
                int r7 = r6.invokeSuspend
                if (r7 == r2) goto L_0x00a6
                r6.IPostMessageService$Stub$Proxy = r7
            L_0x00a6:
                int r7 = r6.Grayscale$Algorithm
                if (r7 == r2) goto L_0x00ac
                r6.IPostMessageService$Stub = r7
            L_0x00ac:
                int r7 = r6.valueOf
                if (r7 == r2) goto L_0x00b2
                r6.ITrustedWebActivityCallback = r7
            L_0x00b2:
                int r7 = r6.Mean$Arithmetic
                if (r7 == r2) goto L_0x00b8
                r6.IPostMessageService$Default = r7
            L_0x00b8:
                int r7 = r6.b
                if (r7 == r2) goto L_0x00be
                r6.onExtraCallback = r7
            L_0x00be:
                int r7 = r6.getCause
                if (r7 == r2) goto L_0x00c4
                r6.ITrustedWebActivityCallback$Stub$Proxy = r7
            L_0x00c4:
                int r7 = r6.valueOf
                if (r7 != r2) goto L_0x010e
                int r7 = r6.Mean$Arithmetic
                if (r7 != r2) goto L_0x010e
                int r7 = r6.Grayscale$Algorithm
                if (r7 != r2) goto L_0x010e
                int r7 = r6.invokeSuspend
                if (r7 != r2) goto L_0x010e
                int r7 = r6.toIntRange
                if (r7 == r2) goto L_0x00e3
                r6.ITrustedWebActivityCallback = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
                goto L_0x00f1
            L_0x00e3:
                int r7 = r6.isInside
                if (r7 == r2) goto L_0x00f1
                r6.IPostMessageService$Default = r7
                int r7 = r6.rightMargin
                if (r7 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
            L_0x00f1:
                int r7 = r6.getMin
                if (r7 == r2) goto L_0x0100
                r6.IPostMessageService$Stub = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
                return
            L_0x0100:
                int r7 = r6.setMin
                if (r7 == r2) goto L_0x010e
                r6.IPostMessageService$Stub$Proxy = r7
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }
}
