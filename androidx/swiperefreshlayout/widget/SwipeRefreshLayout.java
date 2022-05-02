package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import o.IntRange;
import o.initDelegate;
import o.onDestroy;
import o.onWindowVisibilityChanged;
import o.openOptionsMenu;
import o.setOnItemSelectedListener;
import o.setView;
import o.show;

public class SwipeRefreshLayout extends ViewGroup implements initDelegate, setOnItemSelectedListener {
    @VisibleForTesting
    static final int CIRCLE_DIAMETER = 40;
    @VisibleForTesting
    static final int CIRCLE_DIAMETER_LARGE = 56;
    public static final int DEFAULT = 1;
    public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
    private static final int[] Grayscale$Algorithm = {16842766};
    public static final int LARGE = 0;
    private static final String getMin = SwipeRefreshLayout.class.getSimpleName();
    private float FastBitmap$CoordinateSystem;
    private Animation ICustomTabsCallback;
    private final show IsOverlapping;
    private boolean Mean$Arithmetic;
    private Animation b;
    private Animation create;
    private final setView equals;
    private final Animation extraCallback;
    private Animation getCause;
    private View getMax;
    private boolean hashCode;
    private int invoke;
    private Animation invokeSuspend;
    private final int[] isInside;
    private int length;
    onWindowVisibilityChanged mCircleView;
    int mCurrentTargetOffsetTop;
    int mCustomSlingshotDistance;
    protected int mFrom;
    setMin mListener;
    boolean mNotify;
    protected int mOriginalOffsetTop;
    CircularProgressDrawable mProgress;
    boolean mRefreshing;
    boolean mScale;
    int mSpinnerOffsetEnd;
    float mStartingScale;
    boolean mUsingCustomStart;
    private final Animation onMessageChannelReady;
    private int onNavigationEvent;
    private getMin onPostMessage;
    private Animation.AnimationListener onRelationshipValidationResult;
    private float setMax;
    private float setMin;
    private int toDoubleRange;
    private final int[] toFloatRange;
    private boolean toIntRange;
    private int toString;
    private final DecelerateInterpolator valueOf;
    private float values;

    public interface getMin {
        boolean setMax();
    }

    public interface setMin {
        void getMax();
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.mCircleView.clearAnimation();
        this.mProgress.stop();
        this.mCircleView.setVisibility(8);
        this.mCircleView.getBackground().setAlpha(255);
        this.mProgress.setAlpha(255);
        if (this.mScale) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCurrentTargetOffsetTop);
        }
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            reset();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        reset();
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.mScale = z;
        this.mOriginalOffsetTop = i;
        this.mSpinnerOffsetEnd = i2;
        this.mUsingCustomStart = true;
        reset();
        this.mRefreshing = false;
    }

    public int getProgressViewStartOffset() {
        return this.mOriginalOffsetTop;
    }

    public int getProgressViewEndOffset() {
        return this.mSpinnerOffsetEnd;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.mSpinnerOffsetEnd = i;
        this.mScale = z;
        this.mCircleView.invalidate();
    }

    public void setSlingshotDistance(@Px int i) {
        this.mCustomSlingshotDistance = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.onNavigationEvent = (int) (displayMetrics.density * 56.0f);
            } else {
                this.onNavigationEvent = (int) (displayMetrics.density * 40.0f);
            }
            this.mCircleView.setImageDrawable((Drawable) null);
            this.mProgress.getMax(i);
            this.mCircleView.setImageDrawable(this.mProgress);
        }
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, (AttributeSet) null);
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRefreshing = false;
        this.setMax = -1.0f;
        this.toFloatRange = new int[2];
        this.isInside = new int[2];
        this.toDoubleRange = -1;
        this.invoke = -1;
        this.onRelationshipValidationResult = new Animation.AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.mRefreshing) {
                    SwipeRefreshLayout.this.mProgress.setAlpha(255);
                    SwipeRefreshLayout.this.mProgress.start();
                    if (SwipeRefreshLayout.this.mNotify && SwipeRefreshLayout.this.mListener != null) {
                        SwipeRefreshLayout.this.mListener.getMax();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.mCurrentTargetOffsetTop = swipeRefreshLayout.mCircleView.getTop();
                    return;
                }
                SwipeRefreshLayout.this.reset();
            }
        };
        this.onMessageChannelReady = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                int i;
                if (!SwipeRefreshLayout.this.mUsingCustomStart) {
                    i = SwipeRefreshLayout.this.mSpinnerOffsetEnd - Math.abs(SwipeRefreshLayout.this.mOriginalOffsetTop);
                } else {
                    i = SwipeRefreshLayout.this.mSpinnerOffsetEnd;
                }
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((SwipeRefreshLayout.this.mFrom + ((int) (((float) (i - SwipeRefreshLayout.this.mFrom)) * f))) - SwipeRefreshLayout.this.mCircleView.getTop());
                CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.mProgress;
                float f2 = 1.0f - f;
                CircularProgressDrawable.getMin getmin = circularProgressDrawable.getMax;
                if (f2 != getmin.valueOf) {
                    getmin.valueOf = f2;
                }
                circularProgressDrawable.invalidateSelf();
            }
        };
        this.extraCallback = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.moveToStart(f);
            }
        };
        this.length = ViewConfiguration.get(context).getScaledTouchSlop();
        this.toString = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.valueOf = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.onNavigationEvent = (int) (displayMetrics.density * 40.0f);
        this.mCircleView = new onWindowVisibilityChanged(getContext());
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.mProgress = circularProgressDrawable;
        circularProgressDrawable.getMax(1);
        this.mCircleView.setImageDrawable(this.mProgress);
        this.mCircleView.setVisibility(8);
        addView(this.mCircleView);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.mSpinnerOffsetEnd = i;
        this.setMax = (float) i;
        this.IsOverlapping = new show();
        this.equals = new setView(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.onNavigationEvent;
        this.mCurrentTargetOffsetTop = i2;
        this.mOriginalOffsetTop = i2;
        moveToStart(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Grayscale$Algorithm);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.invoke;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public void setOnRefreshListener(@Nullable setMin setmin) {
        this.mListener = setmin;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.mRefreshing == z) {
            setMax(z, false);
            return;
        }
        this.mRefreshing = z;
        if (!this.mUsingCustomStart) {
            i = this.mSpinnerOffsetEnd + this.mOriginalOffsetTop;
        } else {
            i = this.mSpinnerOffsetEnd;
        }
        setTargetOffsetTopAndBottom(i - this.mCurrentTargetOffsetTop);
        this.mNotify = false;
        Animation.AnimationListener animationListener = this.onRelationshipValidationResult;
        this.mCircleView.setVisibility(0);
        this.mProgress.setAlpha(255);
        AnonymousClass3 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f);
            }
        };
        this.invokeSuspend = r0;
        r0.setDuration((long) this.toString);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.invokeSuspend);
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.mCircleView.setScaleX(f);
        this.mCircleView.setScaleY(f);
    }

    private void setMax(boolean z, boolean z2) {
        if (this.mRefreshing != z) {
            this.mNotify = z2;
            setMin();
            this.mRefreshing = z;
            if (z) {
                setMin(this.mCurrentTargetOffsetTop, this.onRelationshipValidationResult);
            } else {
                startScaleDownAnimation(this.onRelationshipValidationResult);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void startScaleDownAnimation(Animation.AnimationListener animationListener) {
        AnonymousClass2 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
            }
        };
        this.getCause = r0;
        r0.setDuration(150);
        this.mCircleView.setAnimationListener(animationListener);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.getCause);
    }

    private Animation length(final int i, final int i2) {
        AnonymousClass5 r0 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                CircularProgressDrawable circularProgressDrawable = SwipeRefreshLayout.this.mProgress;
                int i = i;
                circularProgressDrawable.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r0.setDuration(300);
        this.mCircleView.setAnimationListener((Animation.AnimationListener) null);
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(r0);
        return r0;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i) {
        setProgressBackgroundColorSchemeColor(IntRange.setMax(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i) {
        this.mCircleView.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = IntRange.setMax(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        setMin();
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        CircularProgressDrawable.getMin getmin = circularProgressDrawable.getMax;
        getmin.isInside = iArr;
        getmin.toIntRange = 0;
        getmin.getCause = getmin.isInside[getmin.toIntRange];
        CircularProgressDrawable.getMin getmin2 = circularProgressDrawable.getMax;
        getmin2.toIntRange = 0;
        getmin2.getCause = getmin2.isInside[getmin2.toIntRange];
        circularProgressDrawable.invalidateSelf();
    }

    public boolean isRefreshing() {
        return this.mRefreshing;
    }

    private void setMin() {
        if (this.getMax == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.mCircleView)) {
                    this.getMax = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.setMax = (float) i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.getMax == null) {
                setMin();
            }
            View view = this.getMax;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.mCircleView.getMeasuredWidth();
                int measuredHeight2 = this.mCircleView.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.mCurrentTargetOffsetTop;
                this.mCircleView.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.getMax == null) {
            setMin();
        }
        View view = this.getMax;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.mCircleView.measure(View.MeasureSpec.makeMeasureSpec(this.onNavigationEvent, 1073741824), View.MeasureSpec.makeMeasureSpec(this.onNavigationEvent, 1073741824));
            this.invoke = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.mCircleView) {
                    this.invoke = i3;
                    return;
                }
            }
        }
    }

    public int getProgressCircleDiameter() {
        return this.onNavigationEvent;
    }

    public boolean canChildScrollUp() {
        getMin getmin = this.onPostMessage;
        if (getmin != null) {
            return getmin.setMax();
        }
        View view = this.getMax;
        if (view instanceof ListView) {
            return openOptionsMenu.setMin((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(@Nullable getMin getmin) {
        this.onPostMessage = getmin;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        setMin();
        int actionMasked = motionEvent.getActionMasked();
        if (this.Mean$Arithmetic && actionMasked == 0) {
            this.Mean$Arithmetic = false;
        }
        if (!isEnabled() || this.Mean$Arithmetic || canChildScrollUp() || this.mRefreshing || this.toIntRange) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.toDoubleRange;
                    if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) < 0) {
                        return false;
                    }
                    getMin(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        getMin(motionEvent);
                    }
                }
            }
            this.hashCode = false;
            this.toDoubleRange = -1;
        } else {
            setTargetOffsetTopAndBottom(this.mOriginalOffsetTop - this.mCircleView.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.toDoubleRange = pointerId;
            this.hashCode = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.FastBitmap$CoordinateSystem = motionEvent.getY(findPointerIndex2);
        }
        return this.hashCode;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT >= 21 || !(this.getMax instanceof AbsListView)) {
            View view = this.getMax;
            if (view == null || ViewCompat.ICustomTabsCallback$Stub(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.Mean$Arithmetic && !this.mRefreshing && (i & 2) != 0;
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.IsOverlapping.getMax = i;
        startNestedScroll(i & 2);
        this.setMin = 0.0f;
        this.toIntRange = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.setMin;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.setMin = 0.0f;
                } else {
                    this.setMin = f - f2;
                    iArr[1] = i2;
                }
                setMax(this.setMin);
            }
        }
        if (this.mUsingCustomStart && i2 > 0 && this.setMin == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.mCircleView.setVisibility(8);
        }
        int[] iArr2 = this.toFloatRange;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public int getNestedScrollAxes() {
        show show = this.IsOverlapping;
        return show.length | show.getMax;
    }

    public void onStopNestedScroll(View view) {
        this.IsOverlapping.getMax = 0;
        this.toIntRange = false;
        float f = this.setMin;
        if (f > 0.0f) {
            getMax(f);
            this.setMin = 0.0f;
        }
        stopNestedScroll();
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.isInside);
        int i5 = i4 + this.isInside[1];
        if (i5 < 0 && !canChildScrollUp()) {
            float abs = this.setMin + ((float) Math.abs(i5));
            this.setMin = abs;
            setMax(abs);
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        setView setview = this.equals;
        if (setview.setMin) {
            ViewCompat.asBinder(setview.setMax);
        }
        setview.setMin = z;
    }

    public boolean isNestedScrollingEnabled() {
        return this.equals.getMin();
    }

    public boolean startNestedScroll(int i) {
        return this.equals.getMin(i);
    }

    public void stopNestedScroll() {
        setView setview = this.equals;
        ViewParent min = setview.setMin(0);
        if (min != null) {
            onDestroy.setMin(min, setview.setMax, 0);
            setview.setMin(0, (ViewParent) null);
        }
    }

    public boolean hasNestedScrollingParent() {
        return this.equals.setMin();
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.equals.setMax(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.equals.getMax(i, i2, iArr, iArr2);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.equals.getMin(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.equals.length(f, f2);
    }

    private static boolean setMax(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    private void setMax(float f) {
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        CircularProgressDrawable.getMin getmin = circularProgressDrawable.getMax;
        if (!getmin.toString) {
            getmin.toString = true;
        }
        circularProgressDrawable.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f / this.setMax));
        double d = (double) min;
        Double.isNaN(d);
        float max = (Math.max((float) (d - 0.4d), 0.0f) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.setMax;
        int i = this.mCustomSlingshotDistance;
        if (i <= 0) {
            i = this.mUsingCustomStart ? this.mSpinnerOffsetEnd - this.mOriginalOffsetTop : this.mSpinnerOffsetEnd;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        double pow = Math.pow(max2, 2.0d);
        Double.isNaN(max2);
        float f3 = ((float) (max2 - pow)) * 2.0f;
        int i2 = this.mOriginalOffsetTop + ((int) ((f2 * min) + (f2 * f3 * 2.0f)));
        if (this.mCircleView.getVisibility() != 0) {
            this.mCircleView.setVisibility(0);
        }
        if (!this.mScale) {
            this.mCircleView.setScaleX(1.0f);
            this.mCircleView.setScaleY(1.0f);
        }
        if (this.mScale) {
            setAnimationProgress(Math.min(1.0f, f / this.setMax));
        }
        if (f < this.setMax) {
            if (this.mProgress.getAlpha() > 76 && !setMax(this.b)) {
                this.b = length(this.mProgress.getAlpha(), 76);
            }
        } else if (this.mProgress.getAlpha() < 255 && !setMax(this.ICustomTabsCallback)) {
            this.ICustomTabsCallback = length(this.mProgress.getAlpha(), 255);
        }
        CircularProgressDrawable circularProgressDrawable2 = this.mProgress;
        float min2 = Math.min(0.8f, max * 0.8f);
        circularProgressDrawable2.getMax.setMax = 0.0f;
        circularProgressDrawable2.getMax.toFloatRange = min2;
        circularProgressDrawable2.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable3 = this.mProgress;
        float min3 = Math.min(1.0f, max);
        CircularProgressDrawable.getMin getmin2 = circularProgressDrawable3.getMax;
        if (min3 != getmin2.valueOf) {
            getmin2.valueOf = min3;
        }
        circularProgressDrawable3.invalidateSelf();
        CircularProgressDrawable circularProgressDrawable4 = this.mProgress;
        circularProgressDrawable4.getMax.IsOverlapping = (((max * 0.4f) - 16.0f) + (f3 * 2.0f)) * 0.5f;
        circularProgressDrawable4.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.mCurrentTargetOffsetTop);
    }

    private void getMax(float f) {
        if (f > this.setMax) {
            setMax(true, true);
            return;
        }
        this.mRefreshing = false;
        CircularProgressDrawable circularProgressDrawable = this.mProgress;
        circularProgressDrawable.getMax.setMax = 0.0f;
        circularProgressDrawable.getMax.toFloatRange = 0.0f;
        circularProgressDrawable.invalidateSelf();
        AnonymousClass4 r0 = null;
        if (!this.mScale) {
            r0 = new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    if (!SwipeRefreshLayout.this.mScale) {
                        SwipeRefreshLayout.this.startScaleDownAnimation((Animation.AnimationListener) null);
                    }
                }
            };
        }
        length(this.mCurrentTargetOffsetTop, (Animation.AnimationListener) r0);
        CircularProgressDrawable circularProgressDrawable2 = this.mProgress;
        CircularProgressDrawable.getMin getmin = circularProgressDrawable2.getMax;
        if (getmin.toString) {
            getmin.toString = false;
        }
        circularProgressDrawable2.invalidateSelf();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.Mean$Arithmetic && actionMasked == 0) {
            this.Mean$Arithmetic = false;
        }
        if (!isEnabled() || this.Mean$Arithmetic || canChildScrollUp() || this.mRefreshing || this.toIntRange) {
            return false;
        }
        if (actionMasked == 0) {
            this.toDoubleRange = motionEvent.getPointerId(0);
            this.hashCode = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.toDoubleRange);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.hashCode) {
                this.hashCode = false;
                getMax((motionEvent.getY(findPointerIndex) - this.values) * 0.5f);
            }
            this.toDoubleRange = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.toDoubleRange);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            getMin(y);
            if (this.hashCode) {
                float f = (y - this.values) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                setMax(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.toDoubleRange = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                getMin(motionEvent);
            }
        }
        return true;
    }

    private void getMin(float f) {
        float f2 = this.FastBitmap$CoordinateSystem;
        int i = this.length;
        if (f - f2 > ((float) i) && !this.hashCode) {
            this.values = f2 + ((float) i);
            this.hashCode = true;
            this.mProgress.setAlpha(76);
        }
    }

    private void setMin(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.onMessageChannelReady.reset();
        this.onMessageChannelReady.setDuration(200);
        this.onMessageChannelReady.setInterpolator(this.valueOf);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.onMessageChannelReady);
    }

    private void length(int i, Animation.AnimationListener animationListener) {
        if (this.mScale) {
            getMax(i, animationListener);
            return;
        }
        this.mFrom = i;
        this.extraCallback.reset();
        this.extraCallback.setDuration(200);
        this.extraCallback.setInterpolator(this.valueOf);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.extraCallback);
    }

    /* access modifiers changed from: package-private */
    public void moveToStart(float f) {
        int i = this.mFrom;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.mOriginalOffsetTop - i)) * f))) - this.mCircleView.getTop());
    }

    private void getMax(int i, Animation.AnimationListener animationListener) {
        this.mFrom = i;
        this.mStartingScale = this.mCircleView.getScaleX();
        AnonymousClass8 r3 = new Animation() {
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(SwipeRefreshLayout.this.mStartingScale + ((-SwipeRefreshLayout.this.mStartingScale) * f));
                SwipeRefreshLayout.this.moveToStart(f);
            }
        };
        this.create = r3;
        r3.setDuration(150);
        if (animationListener != null) {
            this.mCircleView.setAnimationListener(animationListener);
        }
        this.mCircleView.clearAnimation();
        this.mCircleView.startAnimation(this.create);
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.mCircleView.bringToFront();
        ViewCompat.equals(this.mCircleView, i);
        this.mCurrentTargetOffsetTop = this.mCircleView.getTop();
    }

    private void getMin(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.toDoubleRange) {
            this.toDoubleRange = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
