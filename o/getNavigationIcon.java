package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/andrognito/flashbar/SwipeDismissTouchListener;", "Landroid/view/View$OnTouchListener;", "view", "Landroid/view/View;", "callbacks", "Lcom/andrognito/flashbar/SwipeDismissTouchListener$DismissCallbacks;", "(Landroid/view/View;Lcom/andrognito/flashbar/SwipeDismissTouchListener$DismissCallbacks;)V", "animationTime", "", "downX", "", "downY", "minFlingVelocity", "", "slop", "swiping", "", "swipingSlop", "translationX", "velocityTracker", "Landroid/view/VelocityTracker;", "viewWidth", "onTouch", "motionEvent", "Landroid/view/MotionEvent;", "performDismiss", "", "DismissCallbacks", "flashbar_release"}, k = 1, mv = {1, 1, 10})
public final class getNavigationIcon implements View.OnTouchListener {
    private VelocityTracker FastBitmap$CoordinateSystem;
    private int IsOverlapping = 1;
    private float equals;
    final View getMax;
    private final int getMin;
    private float hashCode;
    private boolean isInside;
    final long length;
    final getMin setMax;
    private final int setMin;
    private float toFloatRange;
    private int toIntRange;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/andrognito/flashbar/SwipeDismissTouchListener$DismissCallbacks;", "", "onDismiss", "", "view", "Landroid/view/View;", "onSwipe", "isSwiping", "", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public interface getMin {
        void onDismiss(@NotNull View view);

        void onSwipe(boolean z);
    }

    public getNavigationIcon(@NotNull View view, @NotNull getMin getmin) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(getmin, "callbacks");
        this.getMax = view;
        this.setMax = getmin;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Intrinsics.checkExpressionValueIsNotNull(viewConfiguration, "vc");
        this.getMin = viewConfiguration.getScaledTouchSlop();
        this.setMin = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        Context context = this.getMax.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "view.context");
        this.length = (long) context.getResources().getInteger(17694720);
    }

    @RequiresApi(api = 12)
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(motionEvent, "motionEvent");
        motionEvent.offsetLocation(this.hashCode, 0.0f);
        if (this.IsOverlapping < 2) {
            this.IsOverlapping = this.getMax.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            boolean z2 = true;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker = this.FastBitmap$CoordinateSystem;
                    if (velocityTracker != null) {
                        if (velocityTracker == null) {
                            Intrinsics.throwNpe();
                        }
                        velocityTracker.addMovement(motionEvent);
                        float rawX = motionEvent.getRawX() - this.equals;
                        float rawY = motionEvent.getRawY() - this.toFloatRange;
                        if (Math.abs(rawX) > ((float) this.getMin) && Math.abs(rawY) < Math.abs(rawX) / 2.0f) {
                            this.isInside = true;
                            this.setMax.onSwipe(true);
                            this.toIntRange = rawX > 0.0f ? this.getMin : -this.getMin;
                            this.getMax.getParent().requestDisallowInterceptTouchEvent(true);
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            Intrinsics.checkExpressionValueIsNotNull(obtain, "cancelEvent");
                            obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                            this.getMax.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (this.isInside) {
                            this.hashCode = rawX;
                            this.getMax.setTranslationX(rawX - ((float) this.toIntRange));
                            this.getMax.setAlpha(Math.max(0.0f, Math.min(1.0f, 1.0f - ((Math.abs(rawX) * 2.0f) / ((float) this.IsOverlapping)))));
                            return true;
                        }
                    }
                } else if (actionMasked != 3) {
                    view.performClick();
                    return false;
                } else if (this.FastBitmap$CoordinateSystem != null) {
                    this.getMax.animate().translationX(0.0f).alpha(1.0f).setDuration(this.length).setListener((Animator.AnimatorListener) null);
                    VelocityTracker velocityTracker2 = this.FastBitmap$CoordinateSystem;
                    if (velocityTracker2 == null) {
                        Intrinsics.throwNpe();
                    }
                    velocityTracker2.recycle();
                    this.FastBitmap$CoordinateSystem = null;
                    this.hashCode = 0.0f;
                    this.equals = 0.0f;
                    this.toFloatRange = 0.0f;
                    this.isInside = false;
                    this.setMax.onSwipe(false);
                }
            } else if (this.FastBitmap$CoordinateSystem != null) {
                float rawX2 = motionEvent.getRawX() - this.equals;
                VelocityTracker velocityTracker3 = this.FastBitmap$CoordinateSystem;
                if (velocityTracker3 == null) {
                    Intrinsics.throwNpe();
                }
                velocityTracker3.addMovement(motionEvent);
                VelocityTracker velocityTracker4 = this.FastBitmap$CoordinateSystem;
                if (velocityTracker4 == null) {
                    Intrinsics.throwNpe();
                }
                velocityTracker4.computeCurrentVelocity(1000);
                VelocityTracker velocityTracker5 = this.FastBitmap$CoordinateSystem;
                if (velocityTracker5 == null) {
                    Intrinsics.throwNpe();
                }
                float xVelocity = velocityTracker5.getXVelocity();
                float abs = Math.abs(xVelocity);
                VelocityTracker velocityTracker6 = this.FastBitmap$CoordinateSystem;
                if (velocityTracker6 == null) {
                    Intrinsics.throwNpe();
                }
                float abs2 = Math.abs(velocityTracker6.getYVelocity());
                if (Math.abs(rawX2) > ((float) (this.IsOverlapping / 2)) && this.isInside) {
                    z = rawX2 > 0.0f;
                } else if (((float) this.setMin) > abs || abs2 >= abs || !this.isInside) {
                    z = false;
                    z2 = false;
                } else {
                    boolean z3 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX2 > 0.0f ? 1 : (rawX2 == 0.0f ? 0 : -1)) < 0);
                    VelocityTracker velocityTracker7 = this.FastBitmap$CoordinateSystem;
                    if (velocityTracker7 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (velocityTracker7.getXVelocity() <= 0.0f) {
                        z2 = false;
                    }
                    boolean z4 = z2;
                    z2 = z3;
                    z = z4;
                }
                if (z2) {
                    this.getMax.animate().translationX(z ? (float) this.IsOverlapping : -((float) this.IsOverlapping)).alpha(0.0f).setDuration(this.length).setListener(new setMin(this));
                } else if (this.isInside) {
                    this.getMax.animate().translationX(0.0f).alpha(1.0f).setDuration(this.length).setListener((Animator.AnimatorListener) null);
                }
                VelocityTracker velocityTracker8 = this.FastBitmap$CoordinateSystem;
                if (velocityTracker8 == null) {
                    Intrinsics.throwNpe();
                }
                velocityTracker8.recycle();
                this.FastBitmap$CoordinateSystem = null;
                this.hashCode = 0.0f;
                this.equals = 0.0f;
                this.toFloatRange = 0.0f;
                this.isInside = false;
                this.setMax.onSwipe(false);
            }
            return false;
        }
        this.equals = motionEvent.getRawX();
        this.toFloatRange = motionEvent.getRawY();
        VelocityTracker obtain2 = VelocityTracker.obtain();
        this.FastBitmap$CoordinateSystem = obtain2;
        if (obtain2 == null) {
            Intrinsics.throwNpe();
        }
        obtain2.addMovement(motionEvent);
        return false;
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/andrognito/flashbar/SwipeDismissTouchListener$onTouch$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/andrognito/flashbar/SwipeDismissTouchListener;)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class setMin extends AnimatorListenerAdapter {
        final /* synthetic */ getNavigationIcon setMin;

        setMin(getNavigationIcon getnavigationicon) {
            this.setMin = getnavigationicon;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            getNavigationIcon getnavigationicon = this.setMin;
            ViewGroup.LayoutParams layoutParams = getnavigationicon.getMax.getLayoutParams();
            int height = getnavigationicon.getMax.getHeight();
            ValueAnimator duration = ValueAnimator.ofInt(new int[]{height, 1}).setDuration(getnavigationicon.length);
            duration.addListener(new getMax(getnavigationicon, layoutParams, height));
            duration.addUpdateListener(new setMax(getnavigationicon, layoutParams));
            duration.start();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/andrognito/flashbar/SwipeDismissTouchListener$performDismiss$1", "Landroid/animation/AnimatorListenerAdapter;", "(Lcom/andrognito/flashbar/SwipeDismissTouchListener;Landroid/view/ViewGroup$LayoutParams;I)V", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "flashbar_release"}, k = 1, mv = {1, 1, 10})
    public static final class getMax extends AnimatorListenerAdapter {
        final /* synthetic */ getNavigationIcon getMax;
        final /* synthetic */ int getMin;
        final /* synthetic */ ViewGroup.LayoutParams length;

        getMax(getNavigationIcon getnavigationicon, ViewGroup.LayoutParams layoutParams, int i) {
            this.getMax = getnavigationicon;
            this.length = layoutParams;
            this.getMin = i;
        }

        public final void onAnimationEnd(@NotNull Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            this.getMax.setMax.onDismiss(this.getMax.getMax);
            this.getMax.getMax.setAlpha(1.0f);
            this.getMax.getMax.setTranslationX(0.0f);
            this.length.height = this.getMin;
            this.getMax.getMax.setLayoutParams(this.length);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 1, 10})
    static final class setMax implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ ViewGroup.LayoutParams getMax;
        final /* synthetic */ getNavigationIcon length;

        setMax(getNavigationIcon getnavigationicon, ViewGroup.LayoutParams layoutParams) {
            this.length = getnavigationicon;
            this.getMax = layoutParams;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.LayoutParams layoutParams = this.getMax;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "valueAnimator");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = ((Integer) animatedValue).intValue();
                this.length.getMax.setLayoutParams(this.getMax);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }
}
