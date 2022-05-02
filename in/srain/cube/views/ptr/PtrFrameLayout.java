package in.srain.cube.views.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import o.TinyAppActionStateManager;
import o.TinyBlurMenu;
import o.access$1602;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PtrFrameLayout extends ViewGroup {
    public static boolean DEBUG = false;
    private static byte IsOverlapping = 3;
    public static final byte PTR_STATUS_COMPLETE = 4;
    public static final byte PTR_STATUS_INIT = 1;
    public static final byte PTR_STATUS_LOADING = 3;
    public static final byte PTR_STATUS_PREPARE = 2;
    private static byte getMin = 4;
    private static byte length = 2;
    private static int setMax = 1;
    private static byte setMin = 1;
    private static byte toFloatRange = 8;
    private View FastBitmap$CoordinateSystem;
    private access$1602 Grayscale$Algorithm;
    private int ICustomTabsCallback;
    protected final String LOG_TAG;
    private boolean Mean$Arithmetic;
    private boolean b;
    private TinyBlurMenu create;
    private int equals;
    private boolean extraCallback;
    private int getCause;
    private byte getMax;
    private boolean hashCode;
    private int invoke;
    private int invokeSuspend;
    private int isInside;
    protected View mContent;
    /* access modifiers changed from: private */
    public TinyBlurMenu.AnonymousClass1 onMessageChannelReady;
    private MotionEvent onNavigationEvent;
    private long onPostMessage;
    private Runnable onRelationshipValidationResult;
    private int toDoubleRange;
    private int toIntRange;
    private TinyAppActionStateManager.AnonymousClass1 toString;
    private length valueOf;
    private boolean values;

    /* access modifiers changed from: protected */
    public void onPositionChange(boolean z, byte b2, TinyBlurMenu.AnonymousClass1 r3) {
    }

    @Deprecated
    public void setInterceptEventWhileWorking(boolean z) {
    }

    public PtrFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getMax = 1;
        StringBuilder sb = new StringBuilder("ptr-frame-");
        int i2 = setMax + 1;
        setMax = i2;
        sb.append(i2);
        this.LOG_TAG = sb.toString();
        this.isInside = 0;
        this.toIntRange = 0;
        this.equals = 200;
        this.toDoubleRange = 1000;
        this.values = true;
        this.hashCode = false;
        this.toString = TinyAppActionStateManager.AnonymousClass1.length();
        this.Mean$Arithmetic = false;
        this.ICustomTabsCallback = 0;
        this.b = false;
        this.getCause = 500;
        this.onPostMessage = 0;
        this.extraCallback = false;
        this.onRelationshipValidationResult = new Runnable() {
            public final void run() {
                PtrFrameLayout.this.setMax();
            }
        };
        this.onMessageChannelReady = new Object() {
            public int IsOverlapping;
            public float equals = 1.2f;
            protected int getMax = 0;
            public int getMin = 0;
            public int hashCode = 0;
            public int isInside = 0;
            public float length;
            public PointF setMax = new PointF();
            public float setMin;
            public boolean toDoubleRange = false;
            public int toFloatRange = 0;
            public float toIntRange = 1.7f;
            public int toString = -1;

            public static boolean setMin(int i) {
                return i < 0;
            }

            public final boolean setMin() {
                return this.toDoubleRange;
            }

            public final boolean length() {
                return this.getMin >= this.hashCode;
            }

            public final void length(float f) {
                this.equals = f;
                this.getMax = (int) (((float) this.IsOverlapping) * f);
            }

            public final int getMax() {
                return this.getMax;
            }

            public final void getMin(int i) {
                this.equals = (((float) this.IsOverlapping) * 1.0f) / ((float) i);
                this.getMax = i;
            }

            public final void length(int i) {
                this.IsOverlapping = i;
                this.getMax = (int) (this.equals * ((float) i));
            }

            public final boolean getMin() {
                return this.getMin > 0;
            }

            public final boolean setMax() {
                return this.toFloatRange == 0 && getMin();
            }

            public final boolean isInside() {
                return this.toFloatRange != 0 && IsOverlapping();
            }

            public final boolean toFloatRange() {
                return this.getMin >= this.getMax;
            }

            public final boolean equals() {
                return this.getMin != this.isInside;
            }

            public final boolean IsOverlapping() {
                return this.getMin == 0;
            }

            public final boolean toIntRange() {
                int i = this.toFloatRange;
                int i2 = this.getMax;
                return i < i2 && this.getMin >= i2;
            }

            public final boolean values() {
                int i = this.toFloatRange;
                int i2 = this.IsOverlapping;
                return i < i2 && this.getMin >= i2;
            }

            public final boolean toDoubleRange() {
                int i = this.getMin;
                int i2 = this.toString;
                if (i2 < 0) {
                    i2 = this.IsOverlapping;
                }
                return i > i2;
            }

            public final boolean getMax(int i) {
                return this.getMin == i;
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TinyBlurMenu.AnonymousClass2.getMin.setMax, 0, 0);
        if (obtainStyledAttributes != null) {
            this.isInside = obtainStyledAttributes.getResourceId(TinyBlurMenu.AnonymousClass2.getMin.isInside, this.isInside);
            this.toIntRange = obtainStyledAttributes.getResourceId(TinyBlurMenu.AnonymousClass2.getMin.getMin, this.toIntRange);
            this.onMessageChannelReady.toIntRange = obtainStyledAttributes.getFloat(TinyBlurMenu.AnonymousClass2.getMin.values, this.onMessageChannelReady.toIntRange);
            this.equals = obtainStyledAttributes.getInt(TinyBlurMenu.AnonymousClass2.getMin.length, this.equals);
            this.toDoubleRange = obtainStyledAttributes.getInt(TinyBlurMenu.AnonymousClass2.getMin.equals, this.toDoubleRange);
            this.onMessageChannelReady.length(obtainStyledAttributes.getFloat(TinyBlurMenu.AnonymousClass2.getMin.IsOverlapping, this.onMessageChannelReady.equals));
            this.values = obtainStyledAttributes.getBoolean(TinyBlurMenu.AnonymousClass2.getMin.toFloatRange, this.values);
            this.hashCode = obtainStyledAttributes.getBoolean(TinyBlurMenu.AnonymousClass2.getMin.toIntRange, this.hashCode);
            obtainStyledAttributes.recycle();
        }
        this.valueOf = new length();
        this.invokeSuspend = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (r2 == r0) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinishInflate() {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 2
            if (r0 > r1) goto L_0x009c
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0062
            int r0 = r4.isInside
            if (r0 == 0) goto L_0x0019
            android.view.View r1 = r4.FastBitmap$CoordinateSystem
            if (r1 != 0) goto L_0x0019
            android.view.View r0 = r4.findViewById(r0)
            r4.FastBitmap$CoordinateSystem = r0
        L_0x0019:
            int r0 = r4.toIntRange
            if (r0 == 0) goto L_0x0027
            android.view.View r1 = r4.mContent
            if (r1 != 0) goto L_0x0027
            android.view.View r0 = r4.findViewById(r0)
            r4.mContent = r0
        L_0x0027:
            android.view.View r0 = r4.mContent
            if (r0 == 0) goto L_0x002f
            android.view.View r0 = r4.FastBitmap$CoordinateSystem
            if (r0 != 0) goto L_0x0091
        L_0x002f:
            android.view.View r0 = r4.getChildAt(r2)
            android.view.View r1 = r4.getChildAt(r3)
            boolean r2 = r0 instanceof o.TinyAppActionStateManager.Holder
            if (r2 == 0) goto L_0x003e
            r4.FastBitmap$CoordinateSystem = r0
            goto L_0x005e
        L_0x003e:
            boolean r2 = r1 instanceof o.TinyAppActionStateManager.Holder
            if (r2 == 0) goto L_0x0045
            r4.FastBitmap$CoordinateSystem = r1
            goto L_0x005f
        L_0x0045:
            android.view.View r2 = r4.mContent
            if (r2 != 0) goto L_0x0050
            android.view.View r2 = r4.FastBitmap$CoordinateSystem
            if (r2 != 0) goto L_0x0050
            r4.FastBitmap$CoordinateSystem = r0
            goto L_0x005e
        L_0x0050:
            android.view.View r2 = r4.FastBitmap$CoordinateSystem
            if (r2 != 0) goto L_0x005c
            android.view.View r2 = r4.mContent
            if (r2 != r0) goto L_0x0059
            r0 = r1
        L_0x0059:
            r4.FastBitmap$CoordinateSystem = r0
            goto L_0x0091
        L_0x005c:
            if (r2 != r0) goto L_0x005f
        L_0x005e:
            r0 = r1
        L_0x005f:
            r4.mContent = r0
            goto L_0x0091
        L_0x0062:
            if (r0 != r3) goto L_0x006b
            android.view.View r0 = r4.getChildAt(r2)
            r4.mContent = r0
            goto L_0x0091
        L_0x006b:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            r0.setClickable(r3)
            r1 = -39424(0xffffffffffff6600, float:NaN)
            r0.setTextColor(r1)
            r1 = 17
            r0.setGravity(r1)
            r1 = 1101004800(0x41a00000, float:20.0)
            r0.setTextSize(r1)
            java.lang.String r1 = "The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?"
            r0.setText(r1)
            r4.mContent = r0
            r4.addView(r0)
        L_0x0091:
            android.view.View r0 = r4.FastBitmap$CoordinateSystem
            if (r0 == 0) goto L_0x0098
            r0.bringToFront()
        L_0x0098:
            super.onFinishInflate()
            return
        L_0x009c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "PtrFrameLayout only can host 2 elements"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: in.srain.cube.views.ptr.PtrFrameLayout.onFinishInflate():void");
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        length length2 = this.valueOf;
        if (length2 != null) {
            length2.length = false;
            length2.getMin = 0;
            PtrFrameLayout.this.removeCallbacks(length2);
            if (!length2.setMin.isFinished()) {
                length2.setMin.forceFinished(true);
            }
        }
        Runnable runnable = this.onRelationshipValidationResult;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (DEBUG) {
            Integer.valueOf(getMeasuredHeight());
            Integer.valueOf(getMeasuredWidth());
            Integer.valueOf(getPaddingLeft());
            Integer.valueOf(getPaddingRight());
            Integer.valueOf(getPaddingTop());
            Integer.valueOf(getPaddingBottom());
            TinyBlurMenu.AnonymousClass3.length();
        }
        View view = this.FastBitmap$CoordinateSystem;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.FastBitmap$CoordinateSystem.getLayoutParams();
            int measuredHeight = this.FastBitmap$CoordinateSystem.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            this.invoke = measuredHeight;
            this.onMessageChannelReady.length(measuredHeight);
        }
        View view2 = this.mContent;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            view2.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin, marginLayoutParams2.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams2.topMargin, marginLayoutParams2.height));
            if (DEBUG) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.mContent.getLayoutParams();
                Integer.valueOf(getMeasuredWidth());
                Integer.valueOf(getMeasuredHeight());
                Integer.valueOf(marginLayoutParams3.leftMargin);
                Integer.valueOf(marginLayoutParams3.topMargin);
                Integer.valueOf(marginLayoutParams3.rightMargin);
                Integer.valueOf(marginLayoutParams3.bottomMargin);
                TinyBlurMenu.AnonymousClass3.length();
                Integer.valueOf(this.onMessageChannelReady.getMin);
                Integer.valueOf(this.onMessageChannelReady.toFloatRange);
                Integer.valueOf(this.mContent.getTop());
                TinyBlurMenu.AnonymousClass3.length();
            }
        }
    }

    public boolean dispatchTouchEventSupper(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r0 != 3) goto L_0x00bc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x010f
            android.view.View r0 = r8.mContent
            if (r0 == 0) goto L_0x010f
            android.view.View r0 = r8.FastBitmap$CoordinateSystem
            if (r0 != 0) goto L_0x0010
            goto L_0x010f
        L_0x0010:
            int r0 = r9.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ed
            if (r0 == r2) goto L_0x00c1
            r3 = 2
            if (r0 == r3) goto L_0x0022
            r3 = 3
            if (r0 == r3) goto L_0x00c1
            goto L_0x00bc
        L_0x0022:
            r8.onNavigationEvent = r9
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            float r3 = r9.getX()
            float r4 = r9.getY()
            android.graphics.PointF r5 = r0.setMax
            float r5 = r5.x
            float r5 = r3 - r5
            android.graphics.PointF r6 = r0.setMax
            float r6 = r6.y
            float r6 = r4 - r6
            float r7 = r0.toIntRange
            float r6 = r6 / r7
            r0.setMin = r5
            r0.length = r6
            android.graphics.PointF r0 = r0.setMax
            r0.set(r3, r4)
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            float r0 = r0.setMin
            o.TinyBlurMenu$1 r3 = r8.onMessageChannelReady
            float r3 = r3.length
            boolean r4 = r8.Mean$Arithmetic
            if (r4 == 0) goto L_0x0077
            boolean r4 = r8.b
            if (r4 != 0) goto L_0x0077
            float r4 = java.lang.Math.abs(r0)
            int r5 = r8.invokeSuspend
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0077
            float r0 = java.lang.Math.abs(r0)
            float r4 = java.lang.Math.abs(r3)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0077
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            boolean r0 = r0.IsOverlapping()
            if (r0 == 0) goto L_0x0077
            r8.b = r2
        L_0x0077:
            boolean r0 = r8.b
            if (r0 == 0) goto L_0x0080
            boolean r9 = r8.dispatchTouchEventSupper(r9)
            return r9
        L_0x0080:
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            r4 = r0 ^ 1
            o.TinyBlurMenu$1 r5 = r8.onMessageChannelReady
            boolean r5 = r5.getMin()
            boolean r6 = DEBUG
            if (r6 == 0) goto L_0x00b2
            o.access$1602 r6 = r8.Grayscale$Algorithm
            if (r6 == 0) goto L_0x0099
            r1 = 1
        L_0x0099:
            java.lang.Float.valueOf(r3)
            o.TinyBlurMenu$1 r6 = r8.onMessageChannelReady
            int r6 = r6.getMin
            java.lang.Integer.valueOf(r6)
            java.lang.Boolean.valueOf(r4)
            java.lang.Boolean.valueOf(r5)
            java.lang.Boolean.valueOf(r0)
            java.lang.Boolean.valueOf(r1)
            o.TinyBlurMenu.AnonymousClass3.getMax()
        L_0x00b2:
            if (r4 == 0) goto L_0x00b6
            if (r5 != 0) goto L_0x00b8
        L_0x00b6:
            if (r0 == 0) goto L_0x00bc
        L_0x00b8:
            r8.getMin(r3)
            return r2
        L_0x00bc:
            boolean r9 = r8.dispatchTouchEventSupper(r9)
            return r9
        L_0x00c1:
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            r0.toDoubleRange = r1
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            boolean r0 = r0.getMin()
            if (r0 == 0) goto L_0x00e8
            boolean r0 = DEBUG
            if (r0 == 0) goto L_0x00d4
            o.TinyBlurMenu.AnonymousClass3.setMax()
        L_0x00d4:
            r8.setMax(r1)
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            boolean r0 = r0.equals()
            if (r0 == 0) goto L_0x00e3
            r8.equals()
            return r2
        L_0x00e3:
            boolean r9 = r8.dispatchTouchEventSupper(r9)
            return r9
        L_0x00e8:
            boolean r9 = r8.dispatchTouchEventSupper(r9)
            return r9
        L_0x00ed:
            r8.extraCallback = r1
            o.TinyBlurMenu$1 r0 = r8.onMessageChannelReady
            float r3 = r9.getX()
            float r4 = r9.getY()
            r0.toDoubleRange = r2
            int r5 = r0.getMin
            r0.isInside = r5
            android.graphics.PointF r0 = r0.setMax
            r0.set(r3, r4)
            in.srain.cube.views.ptr.PtrFrameLayout$length r0 = r8.valueOf
            r0.getMin()
            r8.b = r1
            r8.dispatchTouchEventSupper(r9)
            return r2
        L_0x010f:
            boolean r9 = r8.dispatchTouchEventSupper(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: in.srain.cube.views.ptr.PtrFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    public void getMin(float f) {
        if (f >= 0.0f || !this.onMessageChannelReady.IsOverlapping()) {
            int i = this.onMessageChannelReady.getMin + ((int) f);
            if (TinyBlurMenu.AnonymousClass1.setMin(i)) {
                if (DEBUG) {
                    TinyBlurMenu.AnonymousClass3.isInside();
                }
                i = 0;
            }
            TinyBlurMenu.AnonymousClass1 r3 = this.onMessageChannelReady;
            r3.toFloatRange = r3.getMin;
            r3.getMin = i;
            length(i - this.onMessageChannelReady.toFloatRange);
        } else if (DEBUG) {
            TinyBlurMenu.AnonymousClass3.isInside();
        }
    }

    private void length(int i) {
        if (i != 0) {
            boolean min = this.onMessageChannelReady.setMin();
            if (min && !this.extraCallback && this.onMessageChannelReady.equals()) {
                this.extraCallback = true;
                equals();
            }
            if ((this.onMessageChannelReady.setMax() && this.getMax == 1) || (this.onMessageChannelReady.length() && this.getMax == 4 && isEnabledNextPtrAtOnce())) {
                this.getMax = 2;
                this.toString.onUIRefreshPrepare(this);
                if (DEBUG) {
                    Integer.valueOf(this.ICustomTabsCallback);
                    TinyBlurMenu.AnonymousClass3.getMin();
                }
            }
            if (this.onMessageChannelReady.isInside()) {
                getMax();
                if (min) {
                    toIntRange();
                }
            }
            if (this.getMax == 2) {
                if (min && !isAutoRefresh() && this.hashCode && this.onMessageChannelReady.toIntRange()) {
                    length();
                }
                if (getMin() && this.onMessageChannelReady.values()) {
                    length();
                }
            }
            if (DEBUG) {
                Integer.valueOf(i);
                Integer.valueOf(this.onMessageChannelReady.getMin);
                Integer.valueOf(this.onMessageChannelReady.toFloatRange);
                Integer.valueOf(this.mContent.getTop());
                Integer.valueOf(this.invoke);
                TinyBlurMenu.AnonymousClass3.getMax();
            }
            this.FastBitmap$CoordinateSystem.offsetTopAndBottom(i);
            if (!isPinContent()) {
                this.mContent.offsetTopAndBottom(i);
            }
            invalidate();
            if (this.toString.getMin()) {
                this.toString.onUIPositionChange(this, min, this.getMax, this.onMessageChannelReady);
            }
            onPositionChange(min, this.getMax, this.onMessageChannelReady);
        }
    }

    public int getHeaderHeight() {
        return this.invoke;
    }

    private void setMax(boolean z) {
        length();
        byte b2 = this.getMax;
        if (b2 == 3) {
            if (this.values) {
                if (this.onMessageChannelReady.toDoubleRange() && !z) {
                    length length2 = this.valueOf;
                    TinyBlurMenu.AnonymousClass1 r0 = this.onMessageChannelReady;
                    length2.setMin(r0.toString >= 0 ? r0.toString : r0.IsOverlapping, this.equals);
                }
            } else if (!this.onMessageChannelReady.setMin()) {
                this.valueOf.setMin(0, this.toDoubleRange);
            }
        } else if (b2 == 4) {
            setMin(false);
        } else if (!this.onMessageChannelReady.setMin()) {
            this.valueOf.setMin(0, this.toDoubleRange);
        }
    }

    public void setRefreshCompleteHook(TinyBlurMenu tinyBlurMenu) {
        this.create = tinyBlurMenu;
        tinyBlurMenu.length = new Runnable() {
            public final void run() {
                if (PtrFrameLayout.DEBUG) {
                    TinyBlurMenu.AnonymousClass3.setMax();
                }
                PtrFrameLayout.this.setMin(true);
            }
        };
    }

    private boolean length() {
        if (this.getMax != 2) {
            return false;
        }
        if ((this.onMessageChannelReady.toDoubleRange() && isAutoRefresh()) || this.onMessageChannelReady.toFloatRange()) {
            this.getMax = 3;
            setMin();
        }
        return false;
    }

    private void setMin() {
        this.onPostMessage = System.currentTimeMillis();
        if (this.toString.getMin()) {
            this.toString.onUIRefreshBegin(this);
            if (DEBUG) {
                TinyBlurMenu.AnonymousClass3.setMin();
            }
        }
        access$1602 access_1602 = this.Grayscale$Algorithm;
        if (access_1602 != null) {
            access_1602.getMax();
        }
    }

    private boolean getMax() {
        byte b2 = this.getMax;
        if ((b2 != 4 && b2 != 2) || !this.onMessageChannelReady.IsOverlapping()) {
            return false;
        }
        if (this.toString.getMin()) {
            this.toString.onUIReset(this);
            if (DEBUG) {
                TinyBlurMenu.AnonymousClass3.setMin();
            }
        }
        this.getMax = 1;
        this.ICustomTabsCallback &= IsOverlapping ^ -1;
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPtrScrollAbort() {
        if (this.onMessageChannelReady.getMin() && isAutoRefresh()) {
            if (DEBUG) {
                TinyBlurMenu.AnonymousClass3.setMax();
            }
            setMax(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPtrScrollFinish() {
        if (this.onMessageChannelReady.getMin() && isAutoRefresh()) {
            if (DEBUG) {
                TinyBlurMenu.AnonymousClass3.setMax();
            }
            setMax(true);
        }
    }

    public boolean isRefreshing() {
        return this.getMax == 3;
    }

    public final void refreshComplete() {
        if (DEBUG) {
            TinyBlurMenu.AnonymousClass3.setMin();
        }
        TinyBlurMenu tinyBlurMenu = this.create;
        if (tinyBlurMenu != null) {
            tinyBlurMenu.setMax = 0;
        }
        int currentTimeMillis = (int) (((long) this.getCause) - (System.currentTimeMillis() - this.onPostMessage));
        if (currentTimeMillis <= 0) {
            if (DEBUG) {
                TinyBlurMenu.AnonymousClass3.setMax();
            }
            setMax();
            return;
        }
        postDelayed(this.onRelationshipValidationResult, (long) currentTimeMillis);
        if (DEBUG) {
            Integer.valueOf(currentTimeMillis);
            TinyBlurMenu.AnonymousClass3.length();
        }
    }

    /* access modifiers changed from: private */
    public void setMax() {
        this.getMax = 4;
        if (!this.valueOf.length || !isAutoRefresh()) {
            setMin(false);
        } else if (DEBUG) {
            Boolean.valueOf(this.valueOf.length);
            Integer.valueOf(this.ICustomTabsCallback);
            TinyBlurMenu.AnonymousClass3.length();
        }
    }

    /* access modifiers changed from: private */
    public void setMin(boolean z) {
        if (!this.onMessageChannelReady.getMin() || z || this.create == null) {
            if (this.toString.getMin()) {
                if (DEBUG) {
                    TinyBlurMenu.AnonymousClass3.setMin();
                }
                this.toString.onUIRefreshComplete(this);
            }
            TinyBlurMenu.AnonymousClass1 r3 = this.onMessageChannelReady;
            r3.hashCode = r3.getMin;
            if (!this.onMessageChannelReady.setMin()) {
                this.valueOf.setMin(0, this.toDoubleRange);
            }
            getMax();
            return;
        }
        if (DEBUG) {
            TinyBlurMenu.AnonymousClass3.setMax();
        }
        this.create.getMax();
    }

    public void autoRefresh() {
        autoRefresh(true, this.toDoubleRange);
    }

    public void autoRefresh(boolean z) {
        autoRefresh(z, this.toDoubleRange);
    }

    public void autoRefresh(boolean z, int i) {
        if (this.getMax == 1) {
            this.ICustomTabsCallback |= z ? setMin : length;
            this.getMax = 2;
            if (this.toString.getMin()) {
                this.toString.onUIRefreshPrepare(this);
                if (DEBUG) {
                    Integer.valueOf(this.ICustomTabsCallback);
                    TinyBlurMenu.AnonymousClass3.getMin();
                }
            }
            this.valueOf.setMin(this.onMessageChannelReady.getMax(), i);
            if (z) {
                this.getMax = 3;
                setMin();
            }
        }
    }

    public boolean isAutoRefresh() {
        return (this.ICustomTabsCallback & IsOverlapping) > 0;
    }

    private boolean getMin() {
        return (this.ICustomTabsCallback & IsOverlapping) == length;
    }

    public boolean isEnabledNextPtrAtOnce() {
        return (this.ICustomTabsCallback & getMin) > 0;
    }

    public void setEnabledNextPtrAtOnce(boolean z) {
        if (z) {
            this.ICustomTabsCallback |= getMin;
        } else {
            this.ICustomTabsCallback &= getMin ^ -1;
        }
    }

    public boolean isPinContent() {
        return (this.ICustomTabsCallback & toFloatRange) > 0;
    }

    public void setPinContent(boolean z) {
        if (z) {
            this.ICustomTabsCallback |= toFloatRange;
        } else {
            this.ICustomTabsCallback &= toFloatRange ^ -1;
        }
    }

    public void disableWhenHorizontalMove(boolean z) {
        this.Mean$Arithmetic = z;
    }

    public void setLoadingMinTime(int i) {
        this.getCause = i;
    }

    public View getContentView() {
        return this.mContent;
    }

    public void setPtrHandler(access$1602 access_1602) {
        this.Grayscale$Algorithm = access_1602;
    }

    public void addPtrUIHandler(TinyAppActionStateManager.Holder holder) {
        TinyAppActionStateManager.AnonymousClass1.length(this.toString, holder);
    }

    public void removePtrUIHandler(TinyAppActionStateManager.Holder holder) {
        this.toString = TinyAppActionStateManager.AnonymousClass1.getMin(this.toString, holder);
    }

    public void setPtrIndicator(TinyBlurMenu.AnonymousClass1 r3) {
        TinyBlurMenu.AnonymousClass1 r0 = this.onMessageChannelReady;
        if (!(r0 == null || r0 == r3)) {
            r3.getMin = r0.getMin;
            r3.toFloatRange = r0.toFloatRange;
            r3.IsOverlapping = r0.IsOverlapping;
        }
        this.onMessageChannelReady = r3;
    }

    public float getResistance() {
        return this.onMessageChannelReady.toIntRange;
    }

    public void setResistance(float f) {
        this.onMessageChannelReady.toIntRange = f;
    }

    public float getDurationToClose() {
        return (float) this.equals;
    }

    public void setDurationToClose(int i) {
        this.equals = i;
    }

    public long getDurationToCloseHeader() {
        return (long) this.toDoubleRange;
    }

    public void setDurationToCloseHeader(int i) {
        this.toDoubleRange = i;
    }

    public void setRatioOfHeaderHeightToRefresh(float f) {
        this.onMessageChannelReady.length(f);
    }

    public int getOffsetToRefresh() {
        return this.onMessageChannelReady.getMax();
    }

    public void setOffsetToRefresh(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-533655163, oncanceled);
            onCancelLoad.getMin(-533655163, oncanceled);
        }
        this.onMessageChannelReady.getMin(i);
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.onMessageChannelReady.equals;
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        TinyBlurMenu.AnonymousClass1 r0 = this.onMessageChannelReady;
        return r0.toString >= 0 ? r0.toString : r0.IsOverlapping;
    }

    public void setOffsetToKeepHeaderWhileLoading(int i) {
        this.onMessageChannelReady.toString = i;
    }

    public boolean isKeepHeaderWhenRefresh() {
        return this.values;
    }

    public void setKeepHeaderWhenRefresh(boolean z) {
        this.values = z;
    }

    public boolean isPullToRefresh() {
        return this.hashCode;
    }

    public void setPullToRefresh(boolean z) {
        this.hashCode = z;
    }

    public View getHeaderView() {
        return this.FastBitmap$CoordinateSystem;
    }

    public void setHeaderView(View view) {
        View view2 = this.FastBitmap$CoordinateSystem;
        if (!(view2 == null || view == null || view2 == view)) {
            removeView(view2);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(-2));
        }
        this.FastBitmap$CoordinateSystem = view;
        addView(view);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private void equals() {
        if (DEBUG) {
            TinyBlurMenu.AnonymousClass3.setMax();
        }
        MotionEvent motionEvent = this.onNavigationEvent;
        if (motionEvent != null) {
            dispatchTouchEventSupper(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    private void toIntRange() {
        if (DEBUG) {
            TinyBlurMenu.AnonymousClass3.setMax();
        }
        MotionEvent motionEvent = this.onNavigationEvent;
        dispatchTouchEventSupper(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i) {
            super(-1, i);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    class length implements Runnable {
        private int getMax;
        int getMin;
        /* access modifiers changed from: package-private */
        public boolean length = false;
        Scroller setMin;
        private int toIntRange;

        public length() {
            this.setMin = new Scroller(PtrFrameLayout.this.getContext());
        }

        public final void run() {
            boolean z = !this.setMin.computeScrollOffset() || this.setMin.isFinished();
            int currY = this.setMin.getCurrY();
            int i = currY - this.getMin;
            if (PtrFrameLayout.DEBUG && i != 0) {
                Boolean.valueOf(z);
                Integer.valueOf(this.getMax);
                Integer.valueOf(this.toIntRange);
                Integer.valueOf(PtrFrameLayout.this.onMessageChannelReady.getMin);
                Integer.valueOf(currY);
                Integer.valueOf(this.getMin);
                Integer.valueOf(i);
                TinyBlurMenu.AnonymousClass3.getMax();
            }
            if (!z) {
                this.getMin = currY;
                PtrFrameLayout.this.getMin((float) i);
                PtrFrameLayout.this.post(this);
                return;
            }
            if (PtrFrameLayout.DEBUG) {
                Integer.valueOf(PtrFrameLayout.this.onMessageChannelReady.getMin);
                TinyBlurMenu.AnonymousClass3.getMax();
            }
            this.length = false;
            this.getMin = 0;
            PtrFrameLayout.this.removeCallbacks(this);
            PtrFrameLayout.this.onPtrScrollFinish();
        }

        public final void getMin() {
            if (this.length) {
                if (!this.setMin.isFinished()) {
                    this.setMin.forceFinished(true);
                }
                PtrFrameLayout.this.onPtrScrollAbort();
                this.length = false;
                this.getMin = 0;
                PtrFrameLayout.this.removeCallbacks(this);
            }
        }

        public final void setMin(int i, int i2) {
            if (!PtrFrameLayout.this.onMessageChannelReady.getMax(i)) {
                int i3 = PtrFrameLayout.this.onMessageChannelReady.getMin;
                this.getMax = i3;
                this.toIntRange = i;
                int i4 = i - i3;
                if (PtrFrameLayout.DEBUG) {
                    Integer.valueOf(this.getMax);
                    Integer.valueOf(i4);
                    Integer.valueOf(i);
                    TinyBlurMenu.AnonymousClass3.length();
                }
                PtrFrameLayout.this.removeCallbacks(this);
                this.getMin = 0;
                if (!this.setMin.isFinished()) {
                    this.setMin.forceFinished(true);
                }
                this.setMin.startScroll(0, 0, 0, i4, i2);
                PtrFrameLayout.this.post(this);
                this.length = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.onMessageChannelReady.getMin;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.FastBitmap$CoordinateSystem;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i6 = marginLayoutParams.leftMargin + paddingLeft;
            int i7 = ((marginLayoutParams.topMargin + paddingTop) + i5) - this.invoke;
            int measuredWidth = this.FastBitmap$CoordinateSystem.getMeasuredWidth() + i6;
            int measuredHeight = this.FastBitmap$CoordinateSystem.getMeasuredHeight() + i7;
            this.FastBitmap$CoordinateSystem.layout(i6, i7, measuredWidth, measuredHeight);
            if (DEBUG) {
                Integer.valueOf(i6);
                Integer.valueOf(i7);
                Integer.valueOf(measuredWidth);
                Integer.valueOf(measuredHeight);
                TinyBlurMenu.AnonymousClass3.length();
            }
        }
        if (this.mContent != null) {
            if (isPinContent()) {
                i5 = 0;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mContent.getLayoutParams();
            int i8 = paddingLeft + marginLayoutParams2.leftMargin;
            int i9 = paddingTop + marginLayoutParams2.topMargin + i5;
            int measuredWidth2 = this.mContent.getMeasuredWidth() + i8;
            int measuredHeight2 = this.mContent.getMeasuredHeight() + i9;
            if (DEBUG) {
                Integer.valueOf(i8);
                Integer.valueOf(i9);
                Integer.valueOf(measuredWidth2);
                Integer.valueOf(measuredHeight2);
                TinyBlurMenu.AnonymousClass3.length();
            }
            this.mContent.layout(i8, i9, measuredWidth2, measuredHeight2);
        }
    }
}
