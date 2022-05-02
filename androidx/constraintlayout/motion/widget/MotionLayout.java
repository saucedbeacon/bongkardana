package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.widget.NestedScrollView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.AnimRes;
import o.AnimatorRes;
import o.AnyRes;
import o.AnyThread;
import o.AttrRes;
import o.BinderThread;
import o.ComponentActivity;
import o.DoNotInline;
import o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import o.access$001;
import o.addContentView;
import o.from;
import o.getLastCustomNonConfigurationInstance;
import o.getOnBackPressedDispatcher;
import o.getSavedStateRegistry;
import o.initViewTreeOwners;
import o.onBackPressed;
import o.onRequestPermissionsResult;
import o.removeOnContextAvailableListener;
import o.setContentView;
import o.setTheme;
import o.startActivityForResult;
import o.startIntentSenderForResult;
import o.to;

public class MotionLayout extends ConstraintLayout implements setTheme {
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    private boolean FastBitmap$CoordinateSystem = false;
    private boolean Grayscale$Algorithm = false;
    private long ICustomTabsCallback = -1;
    private float IsOverlapping = 1.0f;
    private setContentView Mean$Arithmetic;
    private View asBinder = null;
    private float b = 0.0f;
    private int create = 0;
    private long equals;
    private initViewTreeOwners extraCallback = new initViewTreeOwners();
    private isInside extraCallbackWithResult;
    boolean firstDown = true;
    private int getCause = 0;
    /* access modifiers changed from: private */
    public int getMax = -1;
    /* access modifiers changed from: private */
    public int getMin = -1;
    private float hashCode;
    private ArrayList<MotionHelper> invoke = null;
    private ArrayList<MotionHelper> invokeSuspend = null;
    private boolean isInside;
    private boolean length = true;
    public int mCurrentState = -1;
    public int mDebugPath = 0;
    getMin mDevModeDraw;
    int mEndWrapHeight;
    int mEndWrapWidth;
    HashMap<View, onBackPressed> mFrameArrayList = new HashMap<>();
    int mHeightMeasureMode;
    boolean mInTransition = false;
    boolean mIndirectTransition = false;
    Interpolator mInterpolator;
    boolean mIsAnimating = false;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    public float mLastVelocity = 0.0f;
    protected boolean mMeasureDuringTransition = false;
    setMax mModel = new setMax();
    int mOldHeight;
    int mOldWidth;
    float mPostInterpolationPosition;
    onRequestPermissionsResult mScene;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    ArrayList<Integer> mTransitionCompleted = new ArrayList<>();
    float mTransitionGoalPosition = 0.0f;
    float mTransitionLastPosition = 0.0f;
    float mTransitionPosition = 0.0f;
    TransitionState mTransitionState = TransitionState.UNDEFINED;
    boolean mUndergoingMotion = false;
    int mWidthMeasureMode;
    private RectF onMessageChannelReady = new RectF();
    private float onNavigationEvent = 0.0f;
    private boolean onPostMessage = false;
    private boolean onRelationshipValidationResult = false;
    /* access modifiers changed from: private */
    public int setMax = 0;
    /* access modifiers changed from: private */
    public int setMin = 0;
    private length toDoubleRange = new length();
    private long toFloatRange = 0;
    private equals toIntRange;
    private float toString;
    private ArrayList<equals> valueOf = null;
    private ComponentActivity values = new ComponentActivity();

    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public interface equals {
        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    public interface getMax {
        void getMax();

        void getMin();

        float setMax();

        void setMax(MotionEvent motionEvent);

        float setMin();
    }

    private static boolean setMax(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) > 1.0f;
        }
        float f5 = (-f) / f3;
        return f2 + ((f * f5) + (((f3 * f5) * f5) / 2.0f)) < 0.0f;
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        length((AttributeSet) null);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        length(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        length(attributeSet);
    }

    /* access modifiers changed from: protected */
    public long getNanoTime() {
        return System.nanoTime();
    }

    public getMax obtainVelocityTracker() {
        return setMin.length();
    }

    public void enableTransition(int i, boolean z) {
        onRequestPermissionsResult.length transition = getTransition(i);
        if (z) {
            transition.toFloatRange = false;
            return;
        }
        if (transition == this.mScene.setMax) {
            Iterator<onRequestPermissionsResult.length> it = this.mScene.length(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                onRequestPermissionsResult.length next = it.next();
                if (next.length()) {
                    this.mScene.setMax = next;
                    break;
                }
            }
        }
        transition.toFloatRange = true;
    }

    public void setState(TransitionState transitionState) {
        if (transitionState != TransitionState.FINISHED || this.mCurrentState != -1) {
            TransitionState transitionState2 = this.mTransitionState;
            this.mTransitionState = transitionState;
            if (transitionState2 == TransitionState.MOVING && transitionState == TransitionState.MOVING) {
                setMin();
            }
            int i = AnonymousClass4.setMin[transitionState2.ordinal()];
            if (i == 1 || i == 2) {
                if (transitionState == TransitionState.MOVING) {
                    setMin();
                }
                if (transitionState == TransitionState.FINISHED) {
                    fireTransitionCompleted();
                }
            } else if (i == 3 && transitionState == TransitionState.FINISHED) {
                fireTransitionCompleted();
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.SETUP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.AnonymousClass4.<clinit>():void");
        }
    }

    static class setMin implements getMax {
        private static setMin length = new setMin();
        VelocityTracker getMin;

        private setMin() {
        }

        public static setMin length() {
            length.getMin = VelocityTracker.obtain();
            return length;
        }

        public final void getMax() {
            VelocityTracker velocityTracker = this.getMin;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.getMin = null;
            }
        }

        public final void setMax(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.getMin;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        public final void getMin() {
            VelocityTracker velocityTracker = this.getMin;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000);
            }
        }

        public final float setMin() {
            VelocityTracker velocityTracker = this.getMin;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        public final float setMax() {
            VelocityTracker velocityTracker = this.getMin;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new isInside();
            }
            this.extraCallbackWithResult.setMax = i;
            this.extraCallbackWithResult.setMin = i2;
            return;
        }
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            this.getMin = i;
            this.getMax = i2;
            onrequestpermissionsresult.length(i, i2);
            this.mModel.getMin(this.mScene.getMin(i), this.mScene.getMin(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            onRequestPermissionsResult.length transition = getTransition(i);
            this.getMin = transition.getMin;
            this.getMax = transition.setMax;
            if (!isAttachedToWindow()) {
                if (this.extraCallbackWithResult == null) {
                    this.extraCallbackWithResult = new isInside();
                }
                this.extraCallbackWithResult.setMax = this.getMin;
                this.extraCallbackWithResult.setMin = this.getMax;
                return;
            }
            float f = Float.NaN;
            int i2 = this.mCurrentState;
            float f2 = 0.0f;
            if (i2 == this.getMin) {
                f = 0.0f;
            } else if (i2 == this.getMax) {
                f = 1.0f;
            }
            this.mScene.setMin(transition);
            this.mModel.getMin(this.mScene.getMin(this.getMin), this.mScene.getMin(this.getMax));
            rebuildScene();
            if (!Float.isNaN(f)) {
                f2 = f;
            }
            this.mTransitionLastPosition = f2;
            if (Float.isNaN(f)) {
                addContentView.length();
                transitionToStart();
                return;
            }
            setProgress(f);
        }
    }

    public void setTransition(onRequestPermissionsResult.length length2) {
        int i;
        int i2;
        this.mScene.setMin(length2);
        setState(TransitionState.SETUP);
        int i3 = this.mCurrentState;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        int i4 = -1;
        if (onrequestpermissionsresult.setMax == null) {
            i = -1;
        } else {
            i = onrequestpermissionsresult.setMax.setMax;
        }
        if (i3 == i) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.equals = length2.getMax() ? -1 : getNanoTime();
        onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
        if (onrequestpermissionsresult2.setMax == null) {
            i2 = -1;
        } else {
            i2 = onrequestpermissionsresult2.setMax.getMin;
        }
        onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
        if (onrequestpermissionsresult3.setMax != null) {
            i4 = onrequestpermissionsresult3.setMax.setMax;
        }
        if (i2 != this.getMin || i4 != this.getMax) {
            this.getMin = i2;
            this.getMax = i4;
            this.mScene.length(i2, i4);
            this.mModel.getMin(this.mScene.getMin(this.getMin), this.mScene.getMin(this.getMax));
            setMax setmax = this.mModel;
            int i5 = this.getMin;
            int i6 = this.getMax;
            setmax.setMin = i5;
            setmax.isInside = i6;
            this.mModel.getMax();
            rebuildScene();
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mScene = new onRequestPermissionsResult(getContext(), this, i);
                if (Build.VERSION.SDK_INT < 19 || isAttachedToWindow()) {
                    this.mScene.setMax(this);
                    this.mModel.getMin(this.mScene.getMin(this.getMin), this.mScene.getMin(this.getMax));
                    rebuildScene();
                    this.mScene.getMin(isRtl());
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } else {
            this.mScene = null;
        }
    }

    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.getMin = -1;
        this.getMax = -1;
        if (this.mConstraintLayoutSpec != null) {
            this.mConstraintLayoutSpec.getMin(i, (float) i2, (float) i3);
            return;
        }
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.getMin(i).setMin(this);
        }
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator length2 = this.mScene.length();
            if (length2 != null) {
                setProgress(length2.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new isInside();
            }
            this.extraCallbackWithResult.length = f;
            this.extraCallbackWithResult.getMax = f2;
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f2;
        animateTo(1.0f);
    }

    class isInside {
        final String equals = "motion.velocity";
        float getMax = Float.NaN;
        final String getMin = "motion.progress";
        float length = Float.NaN;
        int setMax = -1;
        int setMin = -1;
        final String toFloatRange = "motion.StartState";
        final String toIntRange = "motion.EndState";

        isInside() {
        }

        /* access modifiers changed from: package-private */
        public final void setMin() {
            if (!(this.setMax == -1 && this.setMin == -1)) {
                int i = this.setMax;
                if (i == -1) {
                    MotionLayout.this.transitionToState(this.setMin);
                } else {
                    int i2 = this.setMin;
                    if (i2 == -1) {
                        MotionLayout.this.setState(i, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i, i2);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (!Float.isNaN(this.getMax)) {
                MotionLayout.this.setProgress(this.length, this.getMax);
                this.length = Float.NaN;
                this.getMax = Float.NaN;
                this.setMax = -1;
                this.setMin = -1;
            } else if (!Float.isNaN(this.length)) {
                MotionLayout.this.setProgress(this.length);
            }
        }
    }

    public void setTransitionState(Bundle bundle) {
        if (this.extraCallbackWithResult == null) {
            this.extraCallbackWithResult = new isInside();
        }
        isInside isinside = this.extraCallbackWithResult;
        isinside.length = bundle.getFloat("motion.progress");
        isinside.getMax = bundle.getFloat("motion.velocity");
        isinside.setMax = bundle.getInt("motion.StartState");
        isinside.setMin = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.extraCallbackWithResult.setMin();
        }
    }

    public Bundle getTransitionState() {
        if (this.extraCallbackWithResult == null) {
            this.extraCallbackWithResult = new isInside();
        }
        isInside isinside = this.extraCallbackWithResult;
        isinside.setMin = MotionLayout.this.getMax;
        isinside.setMax = MotionLayout.this.getMin;
        isinside.getMax = MotionLayout.this.getVelocity();
        isinside.length = MotionLayout.this.getProgress();
        isInside isinside2 = this.extraCallbackWithResult;
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", isinside2.length);
        bundle.putFloat("motion.velocity", isinside2.getMax);
        bundle.putInt("motion.StartState", isinside2.setMax);
        bundle.putInt("motion.EndState", isinside2.setMin);
        return bundle;
    }

    public void setProgress(float f) {
        if (!isAttachedToWindow()) {
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new isInside();
            }
            this.extraCallbackWithResult.length = f;
            return;
        }
        if (f <= 0.0f) {
            this.mCurrentState = this.getMin;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.mCurrentState = this.getMax;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene != null) {
            this.isInside = true;
            this.mTransitionGoalPosition = f;
            this.mTransitionPosition = f;
            this.equals = -1;
            this.toFloatRange = -1;
            this.mInterpolator = null;
            this.mInTransition = true;
            invalidate();
        }
    }

    public void touchAnimateTo(int i, float f, float f2) {
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        if (this.mScene != null && this.mTransitionLastPosition != f) {
            this.FastBitmap$CoordinateSystem = true;
            this.toFloatRange = getNanoTime();
            onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
            if (onrequestpermissionsresult.setMax != null) {
                i2 = onrequestpermissionsresult.setMax.setMin;
            } else {
                i2 = onrequestpermissionsresult.equals;
            }
            this.IsOverlapping = ((float) i2) / 1000.0f;
            this.mTransitionGoalPosition = f;
            this.mInTransition = true;
            float f8 = 0.0f;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 1.0f;
                }
                ComponentActivity componentActivity = this.values;
                float f9 = this.mTransitionLastPosition;
                float f10 = this.IsOverlapping;
                onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
                if (onrequestpermissionsresult2.setMax == null || onrequestpermissionsresult2.setMax.length == null) {
                    f3 = 0.0f;
                } else {
                    f3 = onrequestpermissionsresult2.setMax.length.hashCode;
                }
                onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
                if (onrequestpermissionsresult3.setMax == null || onrequestpermissionsresult3.setMax.length == null) {
                    f4 = 0.0f;
                } else {
                    f4 = onrequestpermissionsresult3.setMax.length.toString;
                }
                componentActivity.getMin(f9, f, f2, f10, f3, f4);
                int i3 = this.mCurrentState;
                this.mTransitionGoalPosition = f;
                this.mCurrentState = i3;
                this.mInterpolator = this.values;
            } else if (i == 4) {
                length length2 = this.toDoubleRange;
                float f11 = this.mTransitionLastPosition;
                onRequestPermissionsResult onrequestpermissionsresult4 = this.mScene;
                if (!(onrequestpermissionsresult4.setMax == null || onrequestpermissionsresult4.setMax.length == null)) {
                    f8 = onrequestpermissionsresult4.setMax.length.hashCode;
                }
                length2.getMin = f2;
                length2.setMax = f11;
                length2.setMin = f8;
                this.mInterpolator = this.toDoubleRange;
            } else if (i == 5) {
                float f12 = this.mTransitionLastPosition;
                onRequestPermissionsResult onrequestpermissionsresult5 = this.mScene;
                if (onrequestpermissionsresult5.setMax == null || onrequestpermissionsresult5.setMax.length == null) {
                    f5 = 0.0f;
                } else {
                    f5 = onrequestpermissionsresult5.setMax.length.hashCode;
                }
                if (setMax(f2, f12, f5)) {
                    length length3 = this.toDoubleRange;
                    float f13 = this.mTransitionLastPosition;
                    onRequestPermissionsResult onrequestpermissionsresult6 = this.mScene;
                    if (!(onrequestpermissionsresult6.setMax == null || onrequestpermissionsresult6.setMax.length == null)) {
                        f8 = onrequestpermissionsresult6.setMax.length.hashCode;
                    }
                    length3.getMin = f2;
                    length3.setMax = f13;
                    length3.setMin = f8;
                    this.mInterpolator = this.toDoubleRange;
                } else {
                    ComponentActivity componentActivity2 = this.values;
                    float f14 = this.mTransitionLastPosition;
                    float f15 = this.IsOverlapping;
                    onRequestPermissionsResult onrequestpermissionsresult7 = this.mScene;
                    if (onrequestpermissionsresult7.setMax == null || onrequestpermissionsresult7.setMax.length == null) {
                        f6 = 0.0f;
                    } else {
                        f6 = onrequestpermissionsresult7.setMax.length.hashCode;
                    }
                    onRequestPermissionsResult onrequestpermissionsresult8 = this.mScene;
                    if (onrequestpermissionsresult8.setMax == null || onrequestpermissionsresult8.setMax.length == null) {
                        f7 = 0.0f;
                    } else {
                        f7 = onrequestpermissionsresult8.setMax.length.toString;
                    }
                    componentActivity2.getMin(f14, f, f2, f15, f6, f7);
                    this.mLastVelocity = 0.0f;
                    int i4 = this.mCurrentState;
                    this.mTransitionGoalPosition = f;
                    this.mCurrentState = i4;
                    this.mInterpolator = this.values;
                }
            }
            this.isInside = false;
            this.toFloatRange = getNanoTime();
            invalidate();
        }
    }

    class length extends startActivityForResult {
        float getMin = 0.0f;
        float setMax = 0.0f;
        float setMin;

        length() {
        }

        public final float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.getMin;
            if (f4 > 0.0f) {
                float f5 = this.setMin;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.mLastVelocity = this.getMin - (this.setMin * f);
                f2 = (this.getMin * f) - (((this.setMin * f) * f) / 2.0f);
                f3 = this.setMax;
            } else {
                float f6 = this.setMin;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                MotionLayout.this.mLastVelocity = this.getMin + (this.setMin * f);
                f2 = (this.getMin * f) + (((this.setMin * f) * f) / 2.0f);
                f3 = this.setMax;
            }
            return f2 + f3;
        }

        public final float length() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* access modifiers changed from: package-private */
    public void animateTo(float f) {
        int i;
        if (this.mScene != null) {
            float f2 = this.mTransitionLastPosition;
            float f3 = this.mTransitionPosition;
            if (f2 != f3 && this.isInside) {
                this.mTransitionLastPosition = f3;
            }
            float f4 = this.mTransitionLastPosition;
            if (f4 != f) {
                this.FastBitmap$CoordinateSystem = false;
                this.mTransitionGoalPosition = f;
                onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
                if (onrequestpermissionsresult.setMax != null) {
                    i = onrequestpermissionsresult.setMax.setMin;
                } else {
                    i = onrequestpermissionsresult.equals;
                }
                this.IsOverlapping = ((float) i) / 1000.0f;
                setProgress(this.mTransitionGoalPosition);
                this.mInterpolator = this.mScene.length();
                this.isInside = false;
                this.toFloatRange = getNanoTime();
                this.mInTransition = true;
                this.mTransitionPosition = f4;
                this.mTransitionLastPosition = f4;
                invalidate();
            }
        }
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToEnd() {
        animateTo(1.0f);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new isInside();
            }
            this.extraCallbackWithResult.setMin = i;
            return;
        }
        transitionToState(i, -1, -1);
    }

    public void transitionToState(int i, int i2, int i3) {
        int i4;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (!(onrequestpermissionsresult == null || onrequestpermissionsresult.setMin == null)) {
            DoNotInline doNotInline = this.mScene.setMin;
            int i5 = this.mCurrentState;
            float f = (float) i2;
            float f2 = (float) i3;
            DoNotInline.setMax setmax = doNotInline.getMax.get(i);
            if (setmax == null) {
                i5 = i;
            } else if (f != -1.0f && f2 != -1.0f) {
                Iterator<DoNotInline.length> it = setmax.getMin.iterator();
                DoNotInline.length length2 = null;
                while (true) {
                    if (it.hasNext()) {
                        DoNotInline.length next = it.next();
                        if (next.setMax(f, f2)) {
                            if (i5 == next.setMax) {
                                break;
                            }
                            length2 = next;
                        }
                    } else {
                        i5 = length2 != null ? length2.setMax : setmax.getMax;
                    }
                }
            } else if (setmax.getMax != i5) {
                Iterator<DoNotInline.length> it2 = setmax.getMin.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (i5 == it2.next().setMax) {
                            break;
                        }
                    } else {
                        i5 = setmax.getMax;
                        break;
                    }
                }
            }
            if (i5 != -1) {
                i = i5;
            }
        }
        int i6 = this.mCurrentState;
        if (i6 != i) {
            if (this.getMin == i) {
                animateTo(0.0f);
            } else if (this.getMax == i) {
                animateTo(1.0f);
            } else {
                this.getMax = i;
                if (i6 != -1) {
                    setTransition(i6, i);
                    animateTo(1.0f);
                    this.mTransitionLastPosition = 0.0f;
                    transitionToEnd();
                    return;
                }
                this.FastBitmap$CoordinateSystem = false;
                this.mTransitionGoalPosition = 1.0f;
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.equals = getNanoTime();
                this.toFloatRange = getNanoTime();
                this.isInside = false;
                this.mInterpolator = null;
                onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
                if (onrequestpermissionsresult2.setMax != null) {
                    i4 = onrequestpermissionsresult2.setMax.setMin;
                } else {
                    i4 = onrequestpermissionsresult2.equals;
                }
                this.IsOverlapping = ((float) i4) / 1000.0f;
                this.getMin = -1;
                this.mScene.length(-1, this.getMax);
                onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
                if (onrequestpermissionsresult3.setMax != null) {
                    int unused = onrequestpermissionsresult3.setMax.getMin;
                }
                int childCount = getChildCount();
                this.mFrameArrayList.clear();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt = getChildAt(i7);
                    this.mFrameArrayList.put(childAt, new onBackPressed(childAt));
                }
                this.mInTransition = true;
                this.mModel.getMin((from) null, this.mScene.getMin(i));
                rebuildScene();
                this.mModel.getMin();
                int childCount2 = getChildCount();
                for (int i8 = 0; i8 < childCount2; i8++) {
                    View childAt2 = getChildAt(i8);
                    onBackPressed onbackpressed = this.mFrameArrayList.get(childAt2);
                    if (onbackpressed != null) {
                        onbackpressed.getMin.setMin = 0.0f;
                        onbackpressed.getMin.length = 0.0f;
                        getSavedStateRegistry getsavedstateregistry = onbackpressed.getMin;
                        float x = childAt2.getX();
                        float y = childAt2.getY();
                        getsavedstateregistry.toFloatRange = x;
                        getsavedstateregistry.equals = y;
                        getsavedstateregistry.isInside = (float) childAt2.getWidth();
                        getsavedstateregistry.IsOverlapping = (float) childAt2.getHeight();
                        getOnBackPressedDispatcher getonbackpresseddispatcher = onbackpressed.toFloatRange;
                        float x2 = childAt2.getX();
                        float y2 = childAt2.getY();
                        getonbackpresseddispatcher.valueOf = x2;
                        getonbackpresseddispatcher.invoke = y2;
                        getonbackpresseddispatcher.Mean$Arithmetic = (float) childAt2.getWidth();
                        getonbackpresseddispatcher.invokeSuspend = (float) childAt2.getHeight();
                        getonbackpresseddispatcher.getMin = childAt2.getVisibility();
                        getonbackpresseddispatcher.setMin = childAt2.getVisibility() != 0 ? 0.0f : childAt2.getAlpha();
                        getonbackpresseddispatcher.length = false;
                        if (Build.VERSION.SDK_INT >= 21) {
                            getonbackpresseddispatcher.setMax = childAt2.getElevation();
                        }
                        getonbackpresseddispatcher.toFloatRange = childAt2.getRotation();
                        getonbackpresseddispatcher.equals = childAt2.getRotationX();
                        getonbackpresseddispatcher.isInside = childAt2.getRotationY();
                        getonbackpresseddispatcher.IsOverlapping = childAt2.getScaleX();
                        getonbackpresseddispatcher.toIntRange = childAt2.getScaleY();
                        getonbackpresseddispatcher.values = childAt2.getPivotX();
                        getonbackpresseddispatcher.toDoubleRange = childAt2.getPivotY();
                        getonbackpresseddispatcher.toString = childAt2.getTranslationX();
                        getonbackpresseddispatcher.hashCode = childAt2.getTranslationY();
                        if (Build.VERSION.SDK_INT >= 21) {
                            getonbackpresseddispatcher.FastBitmap$CoordinateSystem = childAt2.getTranslationZ();
                        }
                    }
                }
                int width = getWidth();
                int height = getHeight();
                for (int i9 = 0; i9 < childCount; i9++) {
                    onBackPressed onbackpressed2 = this.mFrameArrayList.get(getChildAt(i9));
                    this.mScene.getMax(onbackpressed2);
                    onbackpressed2.setMax(width, height, getNanoTime());
                }
                onRequestPermissionsResult onrequestpermissionsresult4 = this.mScene;
                float invokeSuspend2 = onrequestpermissionsresult4.setMax != null ? onrequestpermissionsresult4.setMax.hashCode : 0.0f;
                if (invokeSuspend2 != 0.0f) {
                    float f3 = Float.MAX_VALUE;
                    float f4 = -3.4028235E38f;
                    for (int i10 = 0; i10 < childCount; i10++) {
                        onBackPressed onbackpressed3 = this.mFrameArrayList.get(getChildAt(i10));
                        float f5 = onbackpressed3.setMin.equals + onbackpressed3.setMin.toFloatRange;
                        f3 = Math.min(f3, f5);
                        f4 = Math.max(f4, f5);
                    }
                    for (int i11 = 0; i11 < childCount; i11++) {
                        onBackPressed onbackpressed4 = this.mFrameArrayList.get(getChildAt(i11));
                        float f6 = onbackpressed4.setMin.toFloatRange;
                        float f7 = onbackpressed4.setMin.equals;
                        onbackpressed4.FastBitmap$CoordinateSystem = 1.0f / (1.0f - invokeSuspend2);
                        onbackpressed4.toIntRange = invokeSuspend2 - ((((f6 + f7) - f3) * invokeSuspend2) / (f4 - f3));
                    }
                }
                this.mTransitionPosition = 0.0f;
                this.mTransitionLastPosition = 0.0f;
                this.mInTransition = true;
                invalidate();
            }
        }
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float f3;
        int i2;
        startIntentSenderForResult startintentsenderforresult;
        removeOnContextAvailableListener removeoncontextavailablelistener;
        startIntentSenderForResult startintentsenderforresult2;
        float f4 = f;
        float f5 = f2;
        float[] fArr2 = fArr;
        int i3 = i;
        float f6 = this.mLastVelocity;
        float f7 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f7);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + 1.0E-5f);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f6 = (signum * ((interpolation - interpolation2) / 1.0E-5f)) / this.IsOverlapping;
            f7 = interpolation2;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof startActivityForResult) {
            f6 = ((startActivityForResult) interpolator).length();
        }
        float f8 = f6;
        onBackPressed onbackpressed = this.mFrameArrayList.get(view);
        if ((i3 & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float min = onbackpressed.getMin(f7, onbackpressed.valueOf);
            startIntentSenderForResult startintentsenderforresult3 = onbackpressed.Grayscale$Algorithm == null ? null : onbackpressed.Grayscale$Algorithm.get("translationX");
            startIntentSenderForResult startintentsenderforresult4 = onbackpressed.Grayscale$Algorithm == null ? null : onbackpressed.Grayscale$Algorithm.get("translationY");
            startIntentSenderForResult startintentsenderforresult5 = onbackpressed.Grayscale$Algorithm == null ? null : onbackpressed.Grayscale$Algorithm.get("rotation");
            f3 = f8;
            startIntentSenderForResult startintentsenderforresult6 = onbackpressed.Grayscale$Algorithm == null ? null : onbackpressed.Grayscale$Algorithm.get("scaleX");
            int i4 = height;
            if (onbackpressed.Grayscale$Algorithm == null) {
                i2 = width;
                startintentsenderforresult = null;
            } else {
                startintentsenderforresult = onbackpressed.Grayscale$Algorithm.get("scaleY");
                i2 = width;
            }
            removeOnContextAvailableListener removeoncontextavailablelistener2 = onbackpressed.invokeSuspend == null ? null : onbackpressed.invokeSuspend.get("translationX");
            removeOnContextAvailableListener removeoncontextavailablelistener3 = onbackpressed.invokeSuspend == null ? null : onbackpressed.invokeSuspend.get("translationY");
            removeOnContextAvailableListener removeoncontextavailablelistener4 = onbackpressed.invokeSuspend == null ? null : onbackpressed.invokeSuspend.get("rotation");
            removeOnContextAvailableListener removeoncontextavailablelistener5 = onbackpressed.invokeSuspend == null ? null : onbackpressed.invokeSuspend.get("scaleX");
            removeOnContextAvailableListener removeoncontextavailablelistener6 = onbackpressed.invokeSuspend == null ? null : onbackpressed.invokeSuspend.get("scaleY");
            getLastCustomNonConfigurationInstance getlastcustomnonconfigurationinstance = new getLastCustomNonConfigurationInstance();
            getlastcustomnonconfigurationinstance.getMax = 0.0f;
            getlastcustomnonconfigurationinstance.setMin = 0.0f;
            getlastcustomnonconfigurationinstance.length = 0.0f;
            getlastcustomnonconfigurationinstance.setMax = 0.0f;
            getlastcustomnonconfigurationinstance.getMin = 0.0f;
            if (startintentsenderforresult5 != null) {
                getlastcustomnonconfigurationinstance.getMax = startintentsenderforresult5.getMax(min);
                getlastcustomnonconfigurationinstance.IsOverlapping = startintentsenderforresult5.length(min);
            }
            if (startintentsenderforresult3 != null) {
                getlastcustomnonconfigurationinstance.length = startintentsenderforresult3.getMax(min);
            }
            if (startintentsenderforresult4 != null) {
                getlastcustomnonconfigurationinstance.setMin = startintentsenderforresult4.getMax(min);
            }
            if (startintentsenderforresult6 != null) {
                getlastcustomnonconfigurationinstance.getMin = startintentsenderforresult6.getMax(min);
            }
            if (startintentsenderforresult != null) {
                getlastcustomnonconfigurationinstance.setMax = startintentsenderforresult.getMax(min);
            }
            if (removeoncontextavailablelistener4 != null) {
                removeoncontextavailablelistener = removeoncontextavailablelistener4;
                startintentsenderforresult2 = startintentsenderforresult3;
                getlastcustomnonconfigurationinstance.getMax = (float) removeoncontextavailablelistener4.length.setMax(min);
            } else {
                removeoncontextavailablelistener = removeoncontextavailablelistener4;
                startintentsenderforresult2 = startintentsenderforresult3;
            }
            getlastcustomnonconfigurationinstance.length(removeoncontextavailablelistener2, removeoncontextavailablelistener3, min);
            getlastcustomnonconfigurationinstance.setMin(removeoncontextavailablelistener5, removeoncontextavailablelistener6, min);
            if (onbackpressed.isInside != null) {
                if (onbackpressed.values.length > 0) {
                    double d = (double) min;
                    onbackpressed.isInside.length(d, onbackpressed.values);
                    onbackpressed.isInside.getMin(d, onbackpressed.toString);
                    getSavedStateRegistry.length(f, f5, fArr2, onbackpressed.hashCode, onbackpressed.toString);
                } else {
                    float f9 = f;
                }
                getlastcustomnonconfigurationinstance.length(f, f2, i2, i4, fArr);
            } else {
                float f10 = f;
                if (onbackpressed.equals != null) {
                    double min2 = (double) onbackpressed.getMin(min, onbackpressed.valueOf);
                    onbackpressed.equals[0].getMin(min2, onbackpressed.toString);
                    onbackpressed.equals[0].length(min2, onbackpressed.values);
                    float f11 = onbackpressed.valueOf[0];
                    for (int i5 = 0; i5 < onbackpressed.toString.length; i5++) {
                        double[] dArr = onbackpressed.toString;
                        double d2 = dArr[i5];
                        double d3 = (double) f11;
                        Double.isNaN(d3);
                        dArr[i5] = d2 * d3;
                    }
                    getSavedStateRegistry.length(f10, f5, fArr2, onbackpressed.hashCode, onbackpressed.toString);
                    getlastcustomnonconfigurationinstance.length(f, f2, i2, i4, fArr);
                } else {
                    float f12 = onbackpressed.setMin.toFloatRange - onbackpressed.getMin.toFloatRange;
                    removeOnContextAvailableListener removeoncontextavailablelistener7 = removeoncontextavailablelistener5;
                    float f13 = onbackpressed.setMin.equals - onbackpressed.getMin.equals;
                    removeOnContextAvailableListener removeoncontextavailablelistener8 = removeoncontextavailablelistener6;
                    float f14 = (onbackpressed.setMin.IsOverlapping - onbackpressed.getMin.IsOverlapping) + f13;
                    fArr2[0] = (f12 * (1.0f - f10)) + (((onbackpressed.setMin.isInside - onbackpressed.getMin.isInside) + f12) * f10);
                    fArr2[1] = (f13 * (1.0f - f5)) + (f14 * f5);
                    getlastcustomnonconfigurationinstance.getMax = 0.0f;
                    getlastcustomnonconfigurationinstance.setMin = 0.0f;
                    getlastcustomnonconfigurationinstance.length = 0.0f;
                    getlastcustomnonconfigurationinstance.setMax = 0.0f;
                    getlastcustomnonconfigurationinstance.getMin = 0.0f;
                    if (startintentsenderforresult5 != null) {
                        getlastcustomnonconfigurationinstance.getMax = startintentsenderforresult5.getMax(min);
                        getlastcustomnonconfigurationinstance.IsOverlapping = startintentsenderforresult5.length(min);
                    }
                    if (startintentsenderforresult2 != null) {
                        getlastcustomnonconfigurationinstance.length = startintentsenderforresult2.getMax(min);
                    }
                    if (startintentsenderforresult4 != null) {
                        getlastcustomnonconfigurationinstance.setMin = startintentsenderforresult4.getMax(min);
                    }
                    if (startintentsenderforresult6 != null) {
                        getlastcustomnonconfigurationinstance.getMin = startintentsenderforresult6.getMax(min);
                    }
                    if (startintentsenderforresult != null) {
                        getlastcustomnonconfigurationinstance.setMax = startintentsenderforresult.getMax(min);
                    }
                    if (removeoncontextavailablelistener != null) {
                        getlastcustomnonconfigurationinstance.getMax = (float) removeoncontextavailablelistener.length.setMax(min);
                    }
                    getlastcustomnonconfigurationinstance.length(removeoncontextavailablelistener2, removeoncontextavailablelistener3, min);
                    getlastcustomnonconfigurationinstance.setMin(removeoncontextavailablelistener7, removeoncontextavailablelistener8, min);
                    getlastcustomnonconfigurationinstance.length(f, f2, i2, i4, fArr);
                }
            }
        } else {
            f3 = f8;
            onbackpressed.length(f7, f4, f5, fArr2);
        }
        if (i < 2) {
            fArr2[0] = fArr2[0] * f3;
            fArr2[1] = fArr2[1] * f3;
        }
    }

    class setMax {
        AnimRes getMax = new AnimRes();
        from getMin = null;
        int isInside;
        from length = null;
        AnimRes setMax = new AnimRes();
        int setMin;

        setMax() {
        }

        /* access modifiers changed from: package-private */
        public final void getMin(from from, from from2) {
            this.getMin = from;
            this.length = from2;
            this.setMax = new AnimRes();
            this.getMax = new AnimRes();
            this.setMax.getMin(MotionLayout.this.mLayoutWidget.setMax());
            this.getMax.getMin(MotionLayout.this.mLayoutWidget.setMax());
            this.setMax.onVolumeInfoChanged.clear();
            this.getMax.onVolumeInfoChanged.clear();
            length(MotionLayout.this.mLayoutWidget, this.setMax);
            length(MotionLayout.this.mLayoutWidget, this.getMax);
            if (((double) MotionLayout.this.mTransitionLastPosition) > 0.5d) {
                if (from != null) {
                    setMin(this.setMax, from);
                }
                setMin(this.getMax, from2);
            } else {
                setMin(this.getMax, from2);
                if (from != null) {
                    setMin(this.setMax, from);
                }
            }
            this.setMax.setMin = MotionLayout.this.isRtl();
            AnimRes animRes = this.setMax;
            animRes.length.getMin(animRes);
            this.getMax.setMin = MotionLayout.this.isRtl();
            AnimRes animRes2 = this.getMax;
            animRes2.length.getMin(animRes2);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    AnimRes animRes3 = this.setMax;
                    animRes3.extraCommand[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    AnimRes animRes4 = this.getMax;
                    animRes4.extraCommand[0] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                if (layoutParams.height == -2) {
                    AnimRes animRes5 = this.setMax;
                    animRes5.extraCommand[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    AnimRes animRes6 = this.getMax;
                    animRes6.extraCommand[1] = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
            }
        }

        private void setMin(AnimRes animRes, from from) {
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, animRes);
            sparseArray.put(MotionLayout.this.getId(), animRes);
            Iterator<ConstraintWidget> it = animRes.onVolumeInfoChanged.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                sparseArray.put(((View) next.ITrustedWebActivityCallback$Stub$Proxy).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = animRes.onVolumeInfoChanged.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.ITrustedWebActivityCallback$Stub$Proxy;
                from.length(view.getId(), layoutParams);
                next2.getMax(from.length(view.getId()).setMin.setMin);
                next2.toFloatRange(from.length(view.getId()).setMin.getMax);
                if (view instanceof ConstraintHelper) {
                    from.length((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                if (from.length(view.getId()).length.getMin == 1) {
                    next2.areNotificationsEnabled = view.getVisibility();
                } else {
                    next2.areNotificationsEnabled = from.length(view.getId()).length.length;
                }
            }
            Iterator<ConstraintWidget> it3 = animRes.onVolumeInfoChanged.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof BinderThread) {
                    AttrRes attrRes = (AttrRes) next3;
                    ((ConstraintHelper) next3.ITrustedWebActivityCallback$Stub$Proxy).updatePreLayout(animRes, attrRes, sparseArray);
                    ((BinderThread) attrRes).setMax();
                }
            }
        }

        public final void getMax() {
            getMin(MotionLayout.this.setMax, MotionLayout.this.setMin);
            MotionLayout.access$1100(MotionLayout.this);
        }

        private void getMin(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            MotionLayout.this.mWidthMeasureMode = mode;
            MotionLayout.this.mHeightMeasureMode = mode2;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            if (MotionLayout.this.mCurrentState == MotionLayout.this.getStartState()) {
                MotionLayout.this.resolveSystem(this.getMax, optimizationLevel, i, i2);
                if (this.getMin != null) {
                    MotionLayout.this.resolveSystem(this.setMax, optimizationLevel, i, i2);
                }
            } else {
                if (this.getMin != null) {
                    MotionLayout.this.resolveSystem(this.setMax, optimizationLevel, i, i2);
                }
                MotionLayout.this.resolveSystem(this.getMax, optimizationLevel, i, i2);
            }
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                MotionLayout.this.mWidthMeasureMode = mode;
                MotionLayout.this.mHeightMeasureMode = mode2;
                if (MotionLayout.this.mCurrentState == MotionLayout.this.getStartState()) {
                    MotionLayout.this.resolveSystem(this.getMax, optimizationLevel, i, i2);
                    if (this.getMin != null) {
                        MotionLayout.this.resolveSystem(this.setMax, optimizationLevel, i, i2);
                    }
                } else {
                    if (this.getMin != null) {
                        MotionLayout.this.resolveSystem(this.setMax, optimizationLevel, i, i2);
                    }
                    MotionLayout.this.resolveSystem(this.getMax, optimizationLevel, i, i2);
                }
                MotionLayout motionLayout = MotionLayout.this;
                AnimRes animRes = this.setMax;
                if (animRes.areNotificationsEnabled == 8) {
                    i3 = 0;
                } else {
                    i3 = animRes.requestPostMessageChannelWithExtras;
                }
                motionLayout.mStartWrapWidth = i3;
                MotionLayout motionLayout2 = MotionLayout.this;
                AnimRes animRes2 = this.setMax;
                if (animRes2.areNotificationsEnabled == 8) {
                    i4 = 0;
                } else {
                    i4 = animRes2.postMessage;
                }
                motionLayout2.mStartWrapHeight = i4;
                MotionLayout motionLayout3 = MotionLayout.this;
                AnimRes animRes3 = this.getMax;
                if (animRes3.areNotificationsEnabled == 8) {
                    i5 = 0;
                } else {
                    i5 = animRes3.requestPostMessageChannelWithExtras;
                }
                motionLayout3.mEndWrapWidth = i5;
                MotionLayout motionLayout4 = MotionLayout.this;
                AnimRes animRes4 = this.getMax;
                if (animRes4.areNotificationsEnabled == 8) {
                    i6 = 0;
                } else {
                    i6 = animRes4.postMessage;
                }
                motionLayout4.mEndWrapHeight = i6;
                MotionLayout motionLayout5 = MotionLayout.this;
                motionLayout5.mMeasureDuringTransition = (motionLayout5.mStartWrapWidth == MotionLayout.this.mEndWrapWidth && MotionLayout.this.mStartWrapHeight == MotionLayout.this.mEndWrapHeight) ? false : true;
            }
            int i7 = MotionLayout.this.mStartWrapWidth;
            int i8 = MotionLayout.this.mStartWrapHeight;
            if (MotionLayout.this.mWidthMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mWidthMeasureMode == 0) {
                i7 = (int) (((float) MotionLayout.this.mStartWrapWidth) + (MotionLayout.this.mPostInterpolationPosition * ((float) (MotionLayout.this.mEndWrapWidth - MotionLayout.this.mStartWrapWidth))));
            }
            int i9 = i7;
            if (MotionLayout.this.mHeightMeasureMode == Integer.MIN_VALUE || MotionLayout.this.mHeightMeasureMode == 0) {
                i8 = (int) (((float) MotionLayout.this.mStartWrapHeight) + (MotionLayout.this.mPostInterpolationPosition * ((float) (MotionLayout.this.mEndWrapHeight - MotionLayout.this.mStartWrapHeight))));
            }
            MotionLayout.this.resolveMeasuredDimension(i, i2, i9, i8, this.setMax.length() || this.getMax.length(), this.setMax.isInside() || this.getMax.isInside());
        }

        public final void getMin() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.mFrameArrayList.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.mFrameArrayList.put(childAt, new onBackPressed(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                onBackPressed onbackpressed = MotionLayout.this.mFrameArrayList.get(childAt2);
                if (onbackpressed != null) {
                    if (this.getMin != null) {
                        ConstraintWidget max = setMax(this.setMax, childAt2);
                        if (max != null) {
                            onbackpressed.getMin(max, this.getMin);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            addContentView.length();
                            addContentView.setMax(childAt2);
                        }
                    }
                    if (this.length != null) {
                        ConstraintWidget max2 = setMax(this.getMax, childAt2);
                        if (max2 != null) {
                            onbackpressed.length(max2, this.length);
                        } else if (MotionLayout.this.mDebugPath != 0) {
                            addContentView.length();
                            addContentView.setMax(childAt2);
                        }
                    }
                }
            }
        }

        public final boolean getMax(int i, int i2) {
            return (i == this.setMin && i2 == this.isInside) ? false : true;
        }

        private static void length(AnimRes animRes, AnimRes animRes2) {
            ConstraintWidget constraintWidget;
            ArrayList<ConstraintWidget> arrayList = animRes.onVolumeInfoChanged;
            HashMap hashMap = new HashMap();
            hashMap.put(animRes, animRes2);
            animRes2.onVolumeInfoChanged.clear();
            animRes2.setMax((ConstraintWidget) animRes, (HashMap<ConstraintWidget, ConstraintWidget>) hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                if (next instanceof OnBackPressedDispatcher$LifecycleOnBackPressedCancellable) {
                    constraintWidget = new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable();
                } else if (next instanceof AnimatorRes) {
                    constraintWidget = new AnimatorRes();
                } else if (next instanceof AnyRes) {
                    constraintWidget = new AnyRes();
                } else if (next instanceof AttrRes) {
                    constraintWidget = new AnyThread();
                } else {
                    constraintWidget = new ConstraintWidget();
                }
                animRes2.setMin(constraintWidget);
                hashMap.put(next, constraintWidget);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                ((ConstraintWidget) hashMap.get(next2)).setMax(next2, (HashMap<ConstraintWidget, ConstraintWidget>) hashMap);
            }
        }

        private static ConstraintWidget setMax(AnimRes animRes, View view) {
            if (animRes.ITrustedWebActivityCallback$Stub$Proxy == view) {
                return animRes;
            }
            ArrayList<ConstraintWidget> arrayList = animRes.onVolumeInfoChanged;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.ITrustedWebActivityCallback$Stub$Proxy == view) {
                    return constraintWidget;
                }
            }
            return null;
        }
    }

    public void requestLayout() {
        onRequestPermissionsResult onrequestpermissionsresult;
        if (this.mMeasureDuringTransition || this.mCurrentState != -1 || (onrequestpermissionsresult = this.mScene) == null || onrequestpermissionsresult.setMax == null || this.mScene.setMax.toIntRange != 0) {
            super.requestLayout();
        }
    }

    public String toString() {
        Context context = getContext();
        StringBuilder sb = new StringBuilder();
        sb.append(addContentView.length(context, this.getMin));
        sb.append("->");
        sb.append(addContentView.length(context, this.getMax));
        sb.append(" (pos:");
        sb.append(this.mTransitionLastPosition);
        sb.append(" Dpos/Dt:");
        sb.append(this.mLastVelocity);
        return sb.toString();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.setMax == i && this.setMin == i2) ? false : true;
        if (this.onPostMessage) {
            this.onPostMessage = false;
            onNewStateAttachHandlers();
            getMax();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.setMax = i;
        this.setMin = i2;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult.setMax == null) {
            i3 = -1;
        } else {
            i3 = onrequestpermissionsresult.setMax.getMin;
        }
        onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
        if (onrequestpermissionsresult2.setMax == null) {
            i4 = -1;
        } else {
            i4 = onrequestpermissionsresult2.setMax.setMax;
        }
        if ((z3 || this.mModel.getMax(i3, i4)) && this.getMin != -1) {
            super.onMeasure(i, i2);
            this.mModel.getMin(this.mScene.getMin(i3), this.mScene.getMin(i4));
            this.mModel.getMax();
            setMax setmax = this.mModel;
            setmax.setMin = i3;
            setmax.isInside = i4;
            z = false;
        } else {
            z = true;
        }
        if (this.mMeasureDuringTransition || z) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = getPaddingLeft() + getPaddingRight();
            AnimRes animRes = this.mLayoutWidget;
            if (animRes.areNotificationsEnabled == 8) {
                i5 = 0;
            } else {
                i5 = animRes.requestPostMessageChannelWithExtras;
            }
            int i7 = i5 + paddingLeft;
            AnimRes animRes2 = this.mLayoutWidget;
            if (animRes2.areNotificationsEnabled == 8) {
                i6 = 0;
            } else {
                i6 = animRes2.postMessage;
            }
            int i8 = i6 + paddingTop;
            int i9 = this.mWidthMeasureMode;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                int i10 = this.mStartWrapWidth;
                i7 = (int) (((float) i10) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapWidth - i10))));
                requestLayout();
            }
            int i11 = this.mHeightMeasureMode;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                int i12 = this.mStartWrapHeight;
                i8 = (int) (((float) i12) + (this.mPostInterpolationPosition * ((float) (this.mEndWrapHeight - i12))));
                requestLayout();
            }
            setMeasuredDimension(i7, i8);
        }
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        float f = this.mTransitionLastPosition + (!(this.mInterpolator instanceof ComponentActivity) ? ((((float) (nanoTime - this.equals)) * signum) * 1.0E-9f) / this.IsOverlapping : 0.0f);
        if (this.isInside) {
            f = this.mTransitionGoalPosition;
        }
        if ((signum <= 0.0f || f < this.mTransitionGoalPosition) && (signum > 0.0f || f > this.mTransitionGoalPosition)) {
            z2 = false;
        } else {
            f = this.mTransitionGoalPosition;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator != null && !z2) {
            if (this.FastBitmap$CoordinateSystem) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.toFloatRange)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((signum > 0.0f && f >= this.mTransitionGoalPosition) || (signum <= 0.0f && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            onBackPressed onbackpressed = this.mFrameArrayList.get(childAt);
            if (onbackpressed != null) {
                onbackpressed.getMax(childAt, f, nanoTime2, this.extraCallback);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        return (onrequestpermissionsresult == null || onrequestpermissionsresult.setMax == null || this.mScene.setMax.length == null || (this.mScene.setMax.length.valueOf & 2) != 0) ? false : true;
    }

    public void onStopNestedScroll(View view, int i) {
        float f;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            float f2 = this.mScrollTargetDX;
            float f3 = this.mScrollTargetDT;
            float f4 = f2 / f3;
            float f5 = this.mScrollTargetDY / f3;
            if (onrequestpermissionsresult.setMax != null && onrequestpermissionsresult.setMax.length != null) {
                access$001 min = onrequestpermissionsresult.setMax.length;
                boolean z = false;
                min.toFloatRange = false;
                float progress = min.values.getProgress();
                min.values.getAnchorDpDt(min.getMax, progress, min.IsOverlapping, min.getMin, min.isInside);
                float f6 = 0.0f;
                if (min.equals != 0.0f) {
                    f = (f4 * min.equals) / min.isInside[0];
                } else {
                    f = (f5 * min.toIntRange) / min.isInside[1];
                }
                if (!Float.isNaN(f)) {
                    progress += f / 3.0f;
                }
                if (progress != 0.0f) {
                    boolean z2 = progress != 1.0f;
                    if (min.length != 3) {
                        z = true;
                    }
                    if (z && z2) {
                        MotionLayout motionLayout = min.values;
                        int i2 = min.length;
                        if (((double) progress) >= 0.5d) {
                            f6 = 1.0f;
                        }
                        motionLayout.touchAnimateTo(i2, f6, f);
                    }
                }
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!(!this.mUndergoingMotion && i == 0 && i2 == 0)) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        float f;
        float f2;
        access$001 access_001;
        int i4;
        final View view2 = view;
        int i5 = i;
        int i6 = i2;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null && onrequestpermissionsresult.setMax != null && this.mScene.setMax.length()) {
            onRequestPermissionsResult.length length2 = this.mScene.setMax;
            if (length2 == null || !length2.length() || (access_001 = length2.length) == null || (i4 = access_001.setMin) == -1 || view.getId() == i4) {
                onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
                if (onrequestpermissionsresult2 != null && onrequestpermissionsresult2.getMin()) {
                    float f3 = this.mTransitionPosition;
                    if ((f3 == 1.0f || f3 == 0.0f) && view2.canScrollVertically(-1)) {
                        return;
                    }
                }
                if (!(length2.length == null || (this.mScene.setMax.length.valueOf & 1) == 0)) {
                    onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
                    float f4 = (float) i5;
                    float f5 = (float) i6;
                    if (onrequestpermissionsresult3.setMax == null || onrequestpermissionsresult3.setMax.length == null) {
                        f2 = 0.0f;
                    } else {
                        access$001 min = onrequestpermissionsresult3.setMax.length;
                        float progress = min.values.getProgress();
                        min.values.getAnchorDpDt(min.getMax, progress, min.IsOverlapping, min.getMin, min.isInside);
                        if (min.equals != 0.0f) {
                            if (min.isInside[0] == 0.0f) {
                                min.isInside[0] = 1.0E-7f;
                            }
                            f2 = (f4 * min.equals) / min.isInside[0];
                        } else {
                            if (min.isInside[1] == 0.0f) {
                                min.isInside[1] = 1.0E-7f;
                            }
                            f2 = (f5 * min.toIntRange) / min.isInside[1];
                        }
                    }
                    if ((this.mTransitionLastPosition <= 0.0f && f2 < 0.0f) || (this.mTransitionLastPosition >= 1.0f && f2 > 0.0f)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            view2.setNestedScrollingEnabled(false);
                            view2.post(new Runnable() {
                                public final void run() {
                                    view2.setNestedScrollingEnabled(true);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
                float f6 = this.mTransitionPosition;
                long nanoTime = getNanoTime();
                float f7 = (float) i5;
                this.mScrollTargetDX = f7;
                float f8 = (float) i6;
                this.mScrollTargetDY = f8;
                double d = (double) (nanoTime - this.mScrollTargetTime);
                Double.isNaN(d);
                this.mScrollTargetDT = (float) (d * 1.0E-9d);
                this.mScrollTargetTime = nanoTime;
                onRequestPermissionsResult onrequestpermissionsresult4 = this.mScene;
                if (!(onrequestpermissionsresult4.setMax == null || onrequestpermissionsresult4.setMax.length == null)) {
                    access$001 min2 = onrequestpermissionsresult4.setMax.length;
                    float progress2 = min2.values.getProgress();
                    if (!min2.toFloatRange) {
                        min2.toFloatRange = true;
                        min2.values.setProgress(progress2);
                    }
                    min2.values.getAnchorDpDt(min2.getMax, progress2, min2.IsOverlapping, min2.getMin, min2.isInside);
                    if (((double) Math.abs((min2.equals * min2.isInside[0]) + (min2.toIntRange * min2.isInside[1]))) < 0.01d) {
                        min2.isInside[0] = 0.01f;
                        min2.isInside[1] = 0.01f;
                    }
                    if (min2.equals != 0.0f) {
                        f = (f7 * min2.equals) / min2.isInside[0];
                    } else {
                        f = (f8 * min2.toIntRange) / min2.isInside[1];
                    }
                    float max = Math.max(Math.min(progress2 + f, 1.0f), 0.0f);
                    if (max != min2.values.getProgress()) {
                        min2.values.setProgress(max);
                    }
                }
                if (f6 != this.mTransitionPosition) {
                    iArr[0] = i5;
                    iArr[1] = i6;
                }
                evaluate(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.mUndergoingMotion = true;
                }
            }
        }
    }

    class getMin {
        final int FastBitmap$CoordinateSystem = -13391360;
        Rect Grayscale$Algorithm = new Rect();
        Paint IsOverlapping;
        boolean Mean$Arithmetic = false;
        final int equals = -21965;
        private float[] getCause;
        Paint getMax;
        Path getMin;
        DashPathEffect hashCode;
        int invoke = 1;
        int invokeSuspend;
        Paint isInside;
        float[] length;
        int[] setMax;
        float[] setMin;
        final int toDoubleRange = 1996488704;
        Paint toFloatRange;
        Paint toIntRange;
        final int toString = 10;
        final int values = -2067046;

        public getMin() {
            Paint paint = new Paint();
            this.getMax = paint;
            paint.setAntiAlias(true);
            this.getMax.setColor(-21965);
            this.getMax.setStrokeWidth(2.0f);
            this.getMax.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.toIntRange = paint2;
            paint2.setAntiAlias(true);
            this.toIntRange.setColor(-2067046);
            this.toIntRange.setStrokeWidth(2.0f);
            this.toIntRange.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.isInside = paint3;
            paint3.setAntiAlias(true);
            this.isInside.setColor(-13391360);
            this.isInside.setStrokeWidth(2.0f);
            this.isInside.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.IsOverlapping = paint4;
            paint4.setAntiAlias(true);
            this.IsOverlapping.setColor(-13391360);
            this.IsOverlapping.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.getCause = new float[8];
            Paint paint5 = new Paint();
            this.toFloatRange = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.hashCode = dashPathEffect;
            this.isInside.setPathEffect(dashPathEffect);
            this.setMin = new float[100];
            this.setMax = new int[50];
            if (this.Mean$Arithmetic) {
                this.getMax.setStrokeWidth(8.0f);
                this.toFloatRange.setStrokeWidth(8.0f);
                this.toIntRange.setStrokeWidth(8.0f);
                this.invoke = 4;
            }
        }

        public final void getMax(Canvas canvas, HashMap<View, onBackPressed> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.getMax));
                    sb.append(":");
                    sb.append(MotionLayout.this.getProgress());
                    String obj = sb.toString();
                    canvas.drawText(obj, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.IsOverlapping);
                    canvas.drawText(obj, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.getMax);
                }
                for (onBackPressed next : hashMap.values()) {
                    int min = next.setMin();
                    if (i2 > 0 && min == 0) {
                        min = 1;
                    }
                    if (min != 0) {
                        this.invokeSuspend = next.getMax(this.setMin, this.setMax);
                        if (min > 0) {
                            int i3 = i / 16;
                            float[] fArr = this.length;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.length = new float[(i3 * 2)];
                                this.getMin = new Path();
                            }
                            int i4 = this.invoke;
                            canvas.translate((float) i4, (float) i4);
                            this.getMax.setColor(1996488704);
                            this.toFloatRange.setColor(1996488704);
                            this.toIntRange.setColor(1996488704);
                            this.isInside.setColor(1996488704);
                            next.setMin(this.length, i3);
                            setMin(canvas, min, this.invokeSuspend, next);
                            this.getMax.setColor(-21965);
                            this.toIntRange.setColor(-2067046);
                            this.toFloatRange.setColor(-2067046);
                            this.isInside.setColor(-13391360);
                            int i5 = this.invoke;
                            canvas.translate((float) (-i5), (float) (-i5));
                            setMin(canvas, min, this.invokeSuspend, next);
                            if (min == 5) {
                                getMax(canvas, next);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        private void setMin(Canvas canvas, int i, int i2, onBackPressed onbackpressed) {
            if (i == 4) {
                length(canvas);
            }
            if (i == 2) {
                getMin(canvas);
            }
            if (i == 3) {
                getMax(canvas);
            }
            canvas.drawLines(this.length, this.getMax);
            length(canvas, i, i2, onbackpressed);
        }

        private void length(Canvas canvas, int i, int i2, onBackPressed onbackpressed) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            Canvas canvas2 = canvas;
            int i6 = i;
            onBackPressed onbackpressed2 = onbackpressed;
            if (onbackpressed2.setMax != null) {
                i4 = onbackpressed2.setMax.getWidth();
                i3 = onbackpressed2.setMax.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            for (int i7 = 1; i7 < i2 - 1; i7++) {
                if (i6 != 4 || this.setMax[i7 - 1] != 0) {
                    float[] fArr = this.setMin;
                    int i8 = i7 * 2;
                    float f3 = fArr[i8];
                    float f4 = fArr[i8 + 1];
                    this.getMin.reset();
                    this.getMin.moveTo(f3, f4 + 10.0f);
                    this.getMin.lineTo(f3 + 10.0f, f4);
                    this.getMin.lineTo(f3, f4 - 10.0f);
                    this.getMin.lineTo(f3 - 10.0f, f4);
                    this.getMin.close();
                    int i9 = i7 - 1;
                    onbackpressed2.toDoubleRange.get(i9);
                    if (i6 == 4) {
                        int[] iArr = this.setMax;
                        if (iArr[i9] == 1) {
                            getMax(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i9] == 2) {
                            getMin(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i9] == 3) {
                            i5 = 3;
                            f2 = f4;
                            f = f3;
                            getMin(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.getMin, this.toFloatRange);
                        }
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                        canvas2.drawPath(this.getMin, this.toFloatRange);
                    } else {
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                    }
                    if (i6 == 2) {
                        getMax(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == i5) {
                        getMin(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == 6) {
                        getMin(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.getMin, this.toFloatRange);
                }
            }
            float[] fArr2 = this.length;
            if (fArr2.length > 1) {
                canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.toIntRange);
                float[] fArr3 = this.length;
                canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.toIntRange);
            }
        }

        private void getMin(Canvas canvas) {
            float[] fArr = this.length;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.isInside);
        }

        private void length(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.invokeSuspend; i++) {
                if (this.setMax[i] == 1) {
                    z = true;
                }
                if (this.setMax[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                getMin(canvas);
            }
            if (z2) {
                getMax(canvas);
            }
        }

        private void getMax(Canvas canvas, float f, float f2) {
            float f3 = f;
            float f4 = f2;
            float[] fArr = this.length;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f5 - f7), (double) (f6 - f8));
            float f9 = f7 - f5;
            float f10 = f8 - f6;
            float f11 = (((f3 - f5) * f9) + ((f4 - f6) * f10)) / (hypot * hypot);
            float f12 = f5 + (f9 * f11);
            float f13 = f6 + (f11 * f10);
            Path path = new Path();
            path.moveTo(f3, f4);
            path.lineTo(f12, f13);
            float hypot2 = (float) Math.hypot((double) (f12 - f3), (double) (f13 - f4));
            StringBuilder sb = new StringBuilder("");
            sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String obj = sb.toString();
            this.IsOverlapping.getTextBounds(obj, 0, obj.length(), this.Grayscale$Algorithm);
            canvas.drawTextOnPath(obj, path, (hypot2 / 2.0f) - ((float) (this.Grayscale$Algorithm.width() / 2)), -20.0f, this.IsOverlapping);
            canvas.drawLine(f3, f4, f12, f13, this.isInside);
        }

        private void getMax(Canvas canvas) {
            float[] fArr = this.length;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.isInside);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.isInside);
        }

        private void getMin(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.length;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder("");
            float f7 = f4;
            double abs = (double) ((min2 * 100.0f) / Math.abs(f5 - f3));
            Double.isNaN(abs);
            sb.append(((float) ((int) (abs + 0.5d))) / 100.0f);
            String obj = sb.toString();
            this.IsOverlapping.getTextBounds(obj, 0, obj.length(), this.Grayscale$Algorithm);
            canvas2.drawText(obj, ((min2 / 2.0f) - ((float) (this.Grayscale$Algorithm.width() / 2))) + min, f2 - 20.0f, this.IsOverlapping);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.isInside);
            StringBuilder sb2 = new StringBuilder("");
            double abs2 = (double) ((max2 * 100.0f) / Math.abs(f6 - f7));
            Double.isNaN(abs2);
            sb2.append(((float) ((int) (abs2 + 0.5d))) / 100.0f);
            String obj2 = sb2.toString();
            this.IsOverlapping.getTextBounds(obj2, 0, obj2.length(), this.Grayscale$Algorithm);
            canvas2.drawText(obj2, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.Grayscale$Algorithm.height() / 2))), this.IsOverlapping);
            canvas.drawLine(f, f2, f, Math.max(f7, f6), this.isInside);
        }

        private void getMin(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder("");
            double width = (double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)));
            Double.isNaN(width);
            sb.append(((float) ((int) (width + 0.5d))) / 100.0f);
            String obj = sb.toString();
            this.IsOverlapping.getTextBounds(obj, 0, obj.length(), this.Grayscale$Algorithm);
            canvas2.drawText(obj, ((f / 2.0f) - ((float) (this.Grayscale$Algorithm.width() / 2))) + 0.0f, f2 - 20.0f, this.IsOverlapping);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.isInside);
            StringBuilder sb2 = new StringBuilder("");
            double height = (double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)));
            Double.isNaN(height);
            sb2.append(((float) ((int) (height + 0.5d))) / 100.0f);
            String obj2 = sb2.toString();
            this.IsOverlapping.getTextBounds(obj2, 0, obj2.length(), this.Grayscale$Algorithm);
            canvas2.drawText(obj2, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.Grayscale$Algorithm.height() / 2))), this.IsOverlapping);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.isInside);
        }

        private void getMax(Canvas canvas, onBackPressed onbackpressed) {
            Canvas canvas2 = canvas;
            onBackPressed onbackpressed2 = onbackpressed;
            this.getMin.reset();
            char c = 0;
            int i = 0;
            while (i <= 50) {
                float[] fArr = this.getCause;
                onbackpressed2.equals[c].length((double) onbackpressed2.getMin(((float) i) / 50.0f, (float[]) null), onbackpressed2.values);
                getSavedStateRegistry getsavedstateregistry = onbackpressed2.getMin;
                int[] iArr = onbackpressed2.hashCode;
                double[] dArr = onbackpressed2.values;
                float f = getsavedstateregistry.toFloatRange;
                float f2 = getsavedstateregistry.equals;
                float f3 = getsavedstateregistry.isInside;
                float f4 = getsavedstateregistry.IsOverlapping;
                int i2 = 0;
                while (i2 < iArr.length) {
                    int i3 = i;
                    float f5 = (float) dArr[i2];
                    int i4 = iArr[i2];
                    if (i4 == 1) {
                        f = f5;
                    } else if (i4 == 2) {
                        f2 = f5;
                    } else if (i4 == 3) {
                        f3 = f5;
                    } else if (i4 == 4) {
                        f4 = f5;
                    }
                    i2++;
                    i = i3;
                }
                float f6 = f3 + f;
                float f7 = f4 + f2;
                float f8 = f + 0.0f;
                float f9 = f2 + 0.0f;
                float f10 = f6 + 0.0f;
                float f11 = f7 + 0.0f;
                fArr[0] = f8;
                fArr[1] = f9;
                fArr[2] = f10;
                fArr[3] = f9;
                fArr[4] = f10;
                fArr[5] = f11;
                fArr[6] = f8;
                fArr[7] = f11;
                Path path = this.getMin;
                float[] fArr2 = this.getCause;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.getMin;
                float[] fArr3 = this.getCause;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.getMin;
                float[] fArr4 = this.getCause;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.getMin;
                float[] fArr5 = this.getCause;
                path4.lineTo(fArr5[6], fArr5[7]);
                this.getMin.close();
                i++;
                c = 0;
            }
            this.getMax.setColor(1140850688);
            canvas2.translate(2.0f, 2.0f);
            canvas2.drawPath(this.getMin, this.getMax);
            canvas2.translate(-2.0f, -2.0f);
            this.getMax.setColor(-65536);
            canvas2.drawPath(this.getMin, this.getMax);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        int i;
        String str;
        String str2;
        evaluate(false);
        super.dispatchDraw(canvas);
        if (this.mScene != null) {
            if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
                this.create++;
                long nanoTime = getNanoTime();
                long j = this.ICustomTabsCallback;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.b = ((float) ((int) ((((float) this.create) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.create = 0;
                        this.ICustomTabsCallback = nanoTime;
                    }
                } else {
                    this.ICustomTabsCallback = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                float progress = ((float) ((int) (getProgress() * 1000.0f))) / 10.0f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.b);
                sb.append(" fps ");
                int i2 = this.getMin;
                String str3 = "UNDEFINED";
                if (i2 == -1) {
                    str = str3;
                } else {
                    str = getContext().getResources().getResourceEntryName(i2);
                }
                sb.append(str);
                sb.append(" -> ");
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                int i3 = this.getMax;
                if (i3 == -1) {
                    str2 = str3;
                } else {
                    str2 = getContext().getResources().getResourceEntryName(i3);
                }
                sb2.append(str2);
                sb2.append(" (progress: ");
                sb2.append(progress);
                sb2.append(" ) state=");
                int i4 = this.mCurrentState;
                if (i4 == -1) {
                    str3 = "undefined";
                } else if (i4 != -1) {
                    str3 = getContext().getResources().getResourceEntryName(i4);
                }
                sb2.append(str3);
                String obj2 = sb2.toString();
                paint.setColor(-16777216);
                canvas.drawText(obj2, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(obj2, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.mDebugPath > 1) {
                if (this.mDevModeDraw == null) {
                    this.mDevModeDraw = new getMin();
                }
                getMin getmin = this.mDevModeDraw;
                HashMap<View, onBackPressed> hashMap = this.mFrameArrayList;
                onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
                if (onrequestpermissionsresult.setMax != null) {
                    i = onrequestpermissionsresult.setMax.setMin;
                } else {
                    i = onrequestpermissionsresult.equals;
                }
                getmin.getMax(canvas, hashMap, i, this.mDebugPath);
            }
        }
    }

    public void evaluate(boolean z) {
        float f;
        boolean z2;
        int i;
        int i2;
        if (this.equals == -1) {
            this.equals = getNanoTime();
        }
        float f2 = this.mTransitionLastPosition;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z3 = true;
        boolean z4 = false;
        if (this.Grayscale$Algorithm || (this.mInTransition && (z || this.mTransitionGoalPosition != this.mTransitionLastPosition))) {
            float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
            long nanoTime = getNanoTime();
            if (!(this.mInterpolator instanceof startActivityForResult)) {
                f = ((((float) (nanoTime - this.equals)) * signum) * 1.0E-9f) / this.IsOverlapping;
                this.mLastVelocity = f;
            } else {
                f = 0.0f;
            }
            float f3 = this.mTransitionLastPosition + f;
            if (this.isInside) {
                f3 = this.mTransitionGoalPosition;
            }
            if ((signum <= 0.0f || f3 < this.mTransitionGoalPosition) && (signum > 0.0f || f3 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f3 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f3;
            this.mTransitionPosition = f3;
            this.equals = nanoTime;
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null && !z2) {
                if (this.FastBitmap$CoordinateSystem) {
                    float interpolation = interpolator.getInterpolation(((float) (nanoTime - this.toFloatRange)) * 1.0E-9f);
                    this.mTransitionLastPosition = interpolation;
                    this.equals = nanoTime;
                    Interpolator interpolator2 = this.mInterpolator;
                    if (interpolator2 instanceof startActivityForResult) {
                        float length2 = ((startActivityForResult) interpolator2).length();
                        this.mLastVelocity = length2;
                        if (Math.abs(length2) * this.IsOverlapping <= 1.0E-5f) {
                            this.mInTransition = false;
                        }
                        if (length2 > 0.0f && interpolation >= 1.0f) {
                            this.mTransitionLastPosition = 1.0f;
                            this.mInTransition = false;
                            interpolation = 1.0f;
                        }
                        if (length2 < 0.0f && interpolation <= 0.0f) {
                            this.mTransitionLastPosition = 0.0f;
                            this.mInTransition = false;
                            f3 = 0.0f;
                        }
                    }
                    f3 = interpolation;
                } else {
                    float interpolation2 = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.mInterpolator;
                    if (interpolator3 instanceof startActivityForResult) {
                        this.mLastVelocity = ((startActivityForResult) interpolator3).length();
                    } else {
                        this.mLastVelocity = ((interpolator3.getInterpolation(f3 + f) - interpolation2) * signum) / f;
                    }
                    f3 = interpolation2;
                }
            }
            if (Math.abs(this.mLastVelocity) > 1.0E-5f) {
                setState(TransitionState.MOVING);
            }
            if ((signum > 0.0f && f3 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f3 <= this.mTransitionGoalPosition)) {
                f3 = this.mTransitionGoalPosition;
                this.mInTransition = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.mInTransition = false;
                setState(TransitionState.FINISHED);
            }
            int childCount = getChildCount();
            this.Grayscale$Algorithm = false;
            long nanoTime2 = getNanoTime();
            this.mPostInterpolationPosition = f3;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                onBackPressed onbackpressed = this.mFrameArrayList.get(childAt);
                if (onbackpressed != null) {
                    this.Grayscale$Algorithm |= onbackpressed.getMax(childAt, f3, nanoTime2, this.extraCallback);
                }
            }
            boolean z5 = (signum > 0.0f && f3 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f3 <= this.mTransitionGoalPosition);
            if (!this.Grayscale$Algorithm && !this.mInTransition && z5) {
                setState(TransitionState.FINISHED);
            }
            if (this.mMeasureDuringTransition) {
                requestLayout();
            }
            this.Grayscale$Algorithm = (!z5) | this.Grayscale$Algorithm;
            if (!(f3 > 0.0f || (i2 = this.getMin) == -1 || this.mCurrentState == i2)) {
                this.mCurrentState = i2;
                this.mScene.getMin(i2).length((ConstraintLayout) this);
                setState(TransitionState.FINISHED);
                z4 = true;
            }
            if (((double) f3) >= 1.0d && this.mCurrentState != (i = this.getMax)) {
                this.mCurrentState = i;
                this.mScene.getMin(i).length((ConstraintLayout) this);
                setState(TransitionState.FINISHED);
                z4 = true;
            }
            if (this.Grayscale$Algorithm || this.mInTransition) {
                invalidate();
            } else if ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                setState(TransitionState.FINISHED);
            }
            if ((!this.Grayscale$Algorithm && this.mInTransition && signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                onNewStateAttachHandlers();
            }
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 >= 1.0f) {
            if (this.mCurrentState == this.getMax) {
                z3 = z4;
            }
            this.mCurrentState = this.getMax;
        } else {
            if (f4 <= 0.0f) {
                if (this.mCurrentState == this.getMin) {
                    z3 = z4;
                }
                this.mCurrentState = this.getMin;
            }
            this.onPostMessage |= z4;
            if (z4 && !this.onRelationshipValidationResult) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        z4 = z3;
        this.onPostMessage |= z4;
        requestLayout();
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.onRelationshipValidationResult = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (!(this.mLastLayoutWidth == i5 && this.mLastLayoutHeight == i6)) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.onRelationshipValidationResult = false;
        } finally {
            this.onRelationshipValidationResult = false;
        }
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    private void length(AttributeSet attributeSet) {
        onRequestPermissionsResult onrequestpermissionsresult;
        int i;
        int i2;
        onRequestPermissionsResult onrequestpermissionsresult2;
        int i3;
        int i4;
        IS_IN_EDIT_MODE = isInEditMode();
        int i5 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, to.length.performMenuItemShortcut);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == to.length.AppCompatDelegate$NightMode) {
                    this.mScene = new onRequestPermissionsResult(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == to.length.onNightModeChanged) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == to.length.closeOptionsMenu) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == to.length.openOptionsMenu) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == to.length.setBackgroundResource) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == to.length.AppCompatDelegateImpl$PanelFeatureState$SavedState) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.mScene = null;
            }
        }
        if (!(this.mDebugPath == 0 || (onrequestpermissionsresult2 = this.mScene) == null)) {
            if (onrequestpermissionsresult2.setMax == null) {
                i3 = -1;
            } else {
                i3 = onrequestpermissionsresult2.setMax.getMin;
            }
            onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
            if (onrequestpermissionsresult3.setMax == null) {
                i4 = -1;
            } else {
                i4 = onrequestpermissionsresult3.setMax.getMin;
            }
            from min = onrequestpermissionsresult3.getMin(i4);
            addContentView.length(getContext(), i3);
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                int id2 = childAt.getId();
                if ((min.setMax.containsKey(Integer.valueOf(id2)) ? min.setMax.get(Integer.valueOf(id2)) : null) == null) {
                    addContentView.setMax(childAt);
                }
            }
            Integer[] numArr = (Integer[]) min.setMax.keySet().toArray(new Integer[0]);
            int length2 = numArr.length;
            int[] iArr = new int[length2];
            for (int i8 = 0; i8 < length2; i8++) {
                iArr[i8] = numArr[i8].intValue();
            }
            for (int i9 = 0; i9 < length2; i9++) {
                int i10 = iArr[i9];
                addContentView.length(getContext(), i10);
                findViewById(iArr[i9]);
                min.length(i10);
                min.length(i10);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<onRequestPermissionsResult.length> it = this.mScene.getMin.iterator();
            while (it.hasNext()) {
                onRequestPermissionsResult.length next = it.next();
                Context context = getContext();
                if (next.getMin != -1) {
                    context.getResources().getResourceEntryName(next.getMin);
                }
                if (next.setMax != -1) {
                    context.getResources().getResourceEntryName(next.setMax);
                }
                int i11 = next.getMin;
                int i12 = next.setMax;
                addContentView.length(getContext(), i11);
                addContentView.length(getContext(), i12);
                sparseIntArray.get(i11);
                sparseIntArray2.get(i12);
                sparseIntArray.put(i11, i12);
                sparseIntArray2.put(i12, i11);
                this.mScene.getMin(i11);
                this.mScene.getMin(i12);
            }
        }
        if (this.mCurrentState == -1 && (onrequestpermissionsresult = this.mScene) != null) {
            if (onrequestpermissionsresult.setMax == null) {
                i = -1;
            } else {
                i = onrequestpermissionsresult.setMax.getMin;
            }
            this.mCurrentState = i;
            onRequestPermissionsResult onrequestpermissionsresult4 = this.mScene;
            if (onrequestpermissionsresult4.setMax == null) {
                i2 = -1;
            } else {
                i2 = onrequestpermissionsresult4.setMax.getMin;
            }
            this.getMin = i2;
            onRequestPermissionsResult onrequestpermissionsresult5 = this.mScene;
            if (onrequestpermissionsresult5.setMax != null) {
                i5 = onrequestpermissionsresult5.setMax.setMax;
            }
            this.getMax = i5;
        }
    }

    public void setScene(onRequestPermissionsResult onrequestpermissionsresult) {
        this.mScene = onrequestpermissionsresult;
        onrequestpermissionsresult.getMin(isRtl());
        rebuildScene();
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void getDebugMode(boolean z) {
        this.mDebugPath = z ? 2 : 1;
        invalidate();
    }

    private boolean getMax(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getMax(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        this.onMessageChannelReady.set(((float) view.getLeft()) + f, ((float) view.getTop()) + f2, f + ((float) view.getRight()), f2 + ((float) view.getBottom()));
        if (motionEvent.getAction() == 0) {
            return this.onMessageChannelReady.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent);
        }
        if (view.onTouchEvent(motionEvent)) {
            return true;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onRequestPermissionsResult.length length2;
        access$001 access_001;
        int i;
        RectF length3;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null && this.length && (length2 = onrequestpermissionsresult.setMax) != null && length2.length() && (access_001 = length2.length) != null && ((motionEvent.getAction() != 0 || (length3 = access_001.length(this, new RectF())) == null || length3.contains(motionEvent.getX(), motionEvent.getY())) && (i = access_001.setMin) != -1)) {
            View view = this.asBinder;
            if (view == null || view.getId() != i) {
                this.asBinder = findViewById(i);
            }
            View view2 = this.asBinder;
            if (view2 != null) {
                this.onMessageChannelReady.set((float) view2.getLeft(), (float) this.asBinder.getTop(), (float) this.asBinder.getRight(), (float) this.asBinder.getBottom());
                if (this.onMessageChannelReady.contains(motionEvent.getX(), motionEvent.getY()) && !getMax(0.0f, 0.0f, this.asBinder, motionEvent)) {
                    return onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null || !this.length || !onrequestpermissionsresult.setMin()) {
            return super.onTouchEvent(motionEvent);
        }
        onRequestPermissionsResult.length length2 = this.mScene.setMax;
        if (length2 != null && !length2.length()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.length(motionEvent, getCurrentState(), this);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (!(onrequestpermissionsresult == null || (i = this.mCurrentState) == -1)) {
            from min = onrequestpermissionsresult.getMin(i);
            this.mScene.setMax(this);
            if (min != null) {
                min.setMin(this);
            }
            this.getMin = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        isInside isinside = this.extraCallbackWithResult;
        if (isinside != null) {
            isinside.setMin();
            return;
        }
        onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
        if (onrequestpermissionsresult2 != null && onrequestpermissionsresult2.setMax != null && this.mScene.setMax.isInside == 4) {
            transitionToEnd();
            setState(TransitionState.SETUP);
            setState(TransitionState.MOVING);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.getMin(isRtl());
        }
    }

    public void onNewStateAttachHandlers() {
        View findViewById;
        View findViewById2;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            if (onrequestpermissionsresult.getMin(this, this.mCurrentState)) {
                requestLayout();
                return;
            }
            int i = this.mCurrentState;
            View view = null;
            if (i != -1) {
                onRequestPermissionsResult onrequestpermissionsresult2 = this.mScene;
                Iterator<onRequestPermissionsResult.length> it = onrequestpermissionsresult2.getMin.iterator();
                while (it.hasNext()) {
                    onRequestPermissionsResult.length next = it.next();
                    if (next.getMax.size() > 0) {
                        Iterator it2 = next.getMax.iterator();
                        while (it2.hasNext()) {
                            onRequestPermissionsResult.length.getMin getmin = (onRequestPermissionsResult.length.getMin) it2.next();
                            if (!(getmin.setMin == -1 || (findViewById2 = findViewById(getmin.setMin)) == null)) {
                                findViewById2.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<onRequestPermissionsResult.length> it3 = onrequestpermissionsresult2.getMax.iterator();
                while (it3.hasNext()) {
                    onRequestPermissionsResult.length next2 = it3.next();
                    if (next2.getMax.size() > 0) {
                        Iterator it4 = next2.getMax.iterator();
                        while (it4.hasNext()) {
                            onRequestPermissionsResult.length.getMin getmin2 = (onRequestPermissionsResult.length.getMin) it4.next();
                            if (!(getmin2.setMin == -1 || (findViewById = findViewById(getmin2.setMin)) == null)) {
                                findViewById.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<onRequestPermissionsResult.length> it5 = onrequestpermissionsresult2.getMin.iterator();
                while (it5.hasNext()) {
                    onRequestPermissionsResult.length next3 = it5.next();
                    if (next3.getMax.size() > 0) {
                        Iterator it6 = next3.getMax.iterator();
                        while (it6.hasNext()) {
                            ((onRequestPermissionsResult.length.getMin) it6.next()).setMax(this, i, next3);
                        }
                    }
                }
                Iterator<onRequestPermissionsResult.length> it7 = onrequestpermissionsresult2.getMax.iterator();
                while (it7.hasNext()) {
                    onRequestPermissionsResult.length next4 = it7.next();
                    if (next4.getMax.size() > 0) {
                        Iterator it8 = next4.getMax.iterator();
                        while (it8.hasNext()) {
                            ((onRequestPermissionsResult.length.getMin) it8.next()).setMax(this, i, next4);
                        }
                    }
                }
            }
            if (this.mScene.setMin()) {
                onRequestPermissionsResult onrequestpermissionsresult3 = this.mScene;
                if (onrequestpermissionsresult3.setMax != null && onrequestpermissionsresult3.setMax.length != null) {
                    access$001 min = onrequestpermissionsresult3.setMax.length;
                    if (min.getMax != -1 && (view = min.values.findViewById(min.getMax)) == null) {
                        addContentView.length(min.values.getContext(), min.getMax);
                    }
                    if (view instanceof NestedScrollView) {
                        NestedScrollView nestedScrollView = (NestedScrollView) view;
                        nestedScrollView.setOnTouchListener(new View.OnTouchListener() {
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                return false;
                            }
                        });
                        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.setMax() {
                            public final void setMax(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                            }
                        });
                    }
                }
            }
        }
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, onBackPressed> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        onBackPressed onbackpressed = hashMap.get(viewById);
        if (onbackpressed != null) {
            onbackpressed.length(f, f2, f3, fArr);
            float y = viewById.getY();
            this.hashCode = f;
            this.toString = y;
        } else if (viewById != null) {
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    public long getTransitionTimeMs() {
        int i;
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            if (onrequestpermissionsresult.setMax != null) {
                i = onrequestpermissionsresult.setMax.setMin;
            } else {
                i = onrequestpermissionsresult.equals;
            }
            this.IsOverlapping = ((float) i) / 1000.0f;
        }
        return (long) (this.IsOverlapping * 1000.0f);
    }

    public void setTransitionListener(equals equals2) {
        this.toIntRange = equals2;
    }

    public void addTransitionListener(equals equals2) {
        if (this.valueOf == null) {
            this.valueOf = new ArrayList<>();
        }
        this.valueOf.add(equals2);
    }

    public boolean removeTransitionListener(equals equals2) {
        ArrayList<equals> arrayList = this.valueOf;
        if (arrayList == null) {
            return false;
        }
        return arrayList.remove(equals2);
    }

    public void fireTrigger(int i, boolean z, float f) {
        equals equals2 = this.toIntRange;
        if (equals2 != null) {
            equals2.onTransitionTrigger(this, i, z, f);
        }
        ArrayList<equals> arrayList = this.valueOf;
        if (arrayList != null) {
            Iterator<equals> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    private void setMin() {
        ArrayList<equals> arrayList;
        if ((this.toIntRange != null || ((arrayList = this.valueOf) != null && !arrayList.isEmpty())) && this.onNavigationEvent != this.mTransitionPosition) {
            if (this.getCause != -1) {
                equals equals2 = this.toIntRange;
                if (equals2 != null) {
                    equals2.onTransitionStarted(this, this.getMin, this.getMax);
                }
                ArrayList<equals> arrayList2 = this.valueOf;
                if (arrayList2 != null) {
                    Iterator<equals> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().onTransitionStarted(this, this.getMin, this.getMax);
                    }
                }
                this.mIsAnimating = true;
            }
            this.getCause = -1;
            float f = this.mTransitionPosition;
            this.onNavigationEvent = f;
            equals equals3 = this.toIntRange;
            if (equals3 != null) {
                equals3.onTransitionChange(this, this.getMin, this.getMax, f);
            }
            ArrayList<equals> arrayList3 = this.valueOf;
            if (arrayList3 != null) {
                Iterator<equals> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionChange(this, this.getMin, this.getMax, this.mTransitionPosition);
                }
            }
            this.mIsAnimating = true;
        }
    }

    /* access modifiers changed from: protected */
    public void fireTransitionCompleted() {
        int i;
        ArrayList<equals> arrayList;
        if ((this.toIntRange != null || ((arrayList = this.valueOf) != null && !arrayList.isEmpty())) && this.getCause == -1) {
            this.getCause = this.mCurrentState;
            if (!this.mTransitionCompleted.isEmpty()) {
                ArrayList<Integer> arrayList2 = this.mTransitionCompleted;
                i = arrayList2.get(arrayList2.size() - 1).intValue();
            } else {
                i = -1;
            }
            int i2 = this.mCurrentState;
            if (!(i == i2 || i2 == -1)) {
                this.mTransitionCompleted.add(Integer.valueOf(i2));
            }
        }
        getMax();
    }

    private void getMax() {
        ArrayList<equals> arrayList;
        if (this.toIntRange != null || ((arrayList = this.valueOf) != null && !arrayList.isEmpty())) {
            this.mIsAnimating = false;
            Iterator<Integer> it = this.mTransitionCompleted.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                equals equals2 = this.toIntRange;
                if (equals2 != null) {
                    equals2.onTransitionCompleted(this, next.intValue());
                }
                ArrayList<equals> arrayList2 = this.valueOf;
                if (arrayList2 != null) {
                    Iterator<equals> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionCompleted(this, next.intValue());
                    }
                }
            }
            this.mTransitionCompleted.clear();
        }
    }

    public setContentView getDesignTool() {
        if (this.Mean$Arithmetic == null) {
            this.Mean$Arithmetic = new setContentView(this);
        }
        return this.Mean$Arithmetic;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.valueOf == null) {
                this.valueOf = new ArrayList<>();
            }
            this.valueOf.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.invoke == null) {
                    this.invoke = new ArrayList<>();
                }
                this.invoke.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.invokeSuspend == null) {
                    this.invokeSuspend = new ArrayList<>();
                }
                this.invokeSuspend.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.invoke;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.invokeSuspend;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.invoke;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.invoke.get(i).setProgress(f);
            }
        }
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.invokeSuspend;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.invokeSuspend.get(i).setProgress(f);
            }
        }
    }

    public int[] getConstraintSetIds() {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null) {
            return null;
        }
        int size = onrequestpermissionsresult.isInside.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = onrequestpermissionsresult.isInside.keyAt(i);
        }
        return iArr;
    }

    public from getConstraintSet(int i) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null) {
            return null;
        }
        return onrequestpermissionsresult.getMin(i);
    }

    @Deprecated
    public void rebuildMotion() {
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.getMax();
        invalidate();
    }

    public void updateState(int i, from from) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.isInside.put(i, from);
        }
        updateState();
        if (this.mCurrentState == i) {
            from.setMin(this);
        }
    }

    public void updateState() {
        this.mModel.getMin(this.mScene.getMin(this.getMin), this.mScene.getMin(this.getMax));
        rebuildScene();
    }

    public ArrayList<onRequestPermissionsResult.length> getDefinedTransitions() {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null) {
            return null;
        }
        return onrequestpermissionsresult.getMin;
    }

    public int getStartState() {
        return this.getMin;
    }

    public int getEndState() {
        return this.getMax;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public void setTransitionDuration(int i) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            if (onrequestpermissionsresult.setMax != null) {
                onrequestpermissionsresult.setMax.setMin = i;
            } else {
                onrequestpermissionsresult.equals = i;
            }
        }
    }

    public onRequestPermissionsResult.length getTransition(int i) {
        Iterator<onRequestPermissionsResult.length> it = this.mScene.getMin.iterator();
        while (it.hasNext()) {
            onRequestPermissionsResult.length next = it.next();
            if (next.IsOverlapping == i) {
                return next;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int lookUpConstraintId(String str) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null) {
            return 0;
        }
        return onrequestpermissionsresult.toIntRange.get(str).intValue();
    }

    /* access modifiers changed from: package-private */
    public String getConstraintSetNames(int i) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult == null) {
            return null;
        }
        for (Map.Entry next : onrequestpermissionsresult.toIntRange.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void disableAutoTransition(boolean z) {
        onRequestPermissionsResult onrequestpermissionsresult = this.mScene;
        if (onrequestpermissionsresult != null) {
            onrequestpermissionsresult.length = z;
        }
    }

    public void setInteractionEnabled(boolean z) {
        this.length = z;
    }

    public boolean isInteractionEnabled() {
        return this.length;
    }

    static /* synthetic */ void access$1100(MotionLayout motionLayout) {
        int childCount = motionLayout.getChildCount();
        motionLayout.mModel.getMin();
        boolean z = true;
        motionLayout.mInTransition = true;
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        onRequestPermissionsResult onrequestpermissionsresult = motionLayout.mScene;
        int hashCode2 = onrequestpermissionsresult.setMax != null ? onrequestpermissionsresult.setMax.invoke : -1;
        int i = 0;
        if (hashCode2 != -1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                onBackPressed onbackpressed = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i2));
                if (onbackpressed != null) {
                    onbackpressed.Mean$Arithmetic = hashCode2;
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            onBackPressed onbackpressed2 = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i3));
            if (onbackpressed2 != null) {
                motionLayout.mScene.getMax(onbackpressed2);
                onbackpressed2.setMax(width, height, motionLayout.getNanoTime());
            }
        }
        onRequestPermissionsResult onrequestpermissionsresult2 = motionLayout.mScene;
        float invokeSuspend2 = onrequestpermissionsresult2.setMax != null ? onrequestpermissionsresult2.setMax.hashCode : 0.0f;
        if (invokeSuspend2 != 0.0f) {
            boolean z2 = ((double) invokeSuspend2) < 0.0d;
            float abs = Math.abs(invokeSuspend2);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i4 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                onBackPressed onbackpressed3 = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i4));
                if (!Float.isNaN(onbackpressed3.IsOverlapping)) {
                    break;
                }
                float f5 = onbackpressed3.setMin.toFloatRange;
                float f6 = onbackpressed3.setMin.equals;
                float f7 = z2 ? f6 - f5 : f6 + f5;
                f3 = Math.min(f3, f7);
                f4 = Math.max(f4, f7);
                i4++;
            }
            if (z) {
                for (int i5 = 0; i5 < childCount; i5++) {
                    onBackPressed onbackpressed4 = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i5));
                    if (!Float.isNaN(onbackpressed4.IsOverlapping)) {
                        f2 = Math.min(f2, onbackpressed4.IsOverlapping);
                        f = Math.max(f, onbackpressed4.IsOverlapping);
                    }
                }
                while (i < childCount) {
                    onBackPressed onbackpressed5 = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i));
                    if (!Float.isNaN(onbackpressed5.IsOverlapping)) {
                        onbackpressed5.FastBitmap$CoordinateSystem = 1.0f / (1.0f - abs);
                        if (z2) {
                            onbackpressed5.toIntRange = abs - (((f - onbackpressed5.IsOverlapping) / (f - f2)) * abs);
                        } else {
                            onbackpressed5.toIntRange = abs - (((onbackpressed5.IsOverlapping - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                onBackPressed onbackpressed6 = motionLayout.mFrameArrayList.get(motionLayout.getChildAt(i));
                float f8 = onbackpressed6.setMin.toFloatRange;
                float f9 = onbackpressed6.setMin.equals;
                float f10 = z2 ? f9 - f8 : f9 + f8;
                onbackpressed6.FastBitmap$CoordinateSystem = 1.0f / (1.0f - abs);
                onbackpressed6.toIntRange = abs - (((f10 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }
}
