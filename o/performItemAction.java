package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;

@VisibleForTesting
public final class performItemAction extends RecyclerView.getMax implements RecyclerView.equals {
    private static final int[] Grayscale$Algorithm = new int[0];
    private static final int[] valueOf = {16842919};
    int FastBitmap$CoordinateSystem = 0;
    private final Drawable ICustomTabsCallback;
    private final RecyclerView.toIntRange ICustomTabsCallback$Default = new RecyclerView.toIntRange() {
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            performItemAction performitemaction = performItemAction.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = performitemaction.toDoubleRange.computeVerticalScrollRange();
            int i3 = performitemaction.FastBitmap$CoordinateSystem;
            performitemaction.values = computeVerticalScrollRange - i3 > 0 && performitemaction.FastBitmap$CoordinateSystem >= performitemaction.length;
            int computeHorizontalScrollRange = performitemaction.toDoubleRange.computeHorizontalScrollRange();
            int i4 = performitemaction.toIntRange;
            performitemaction.toString = computeHorizontalScrollRange - i4 > 0 && performitemaction.toIntRange >= performitemaction.length;
            if (performitemaction.values || performitemaction.toString) {
                if (performitemaction.values) {
                    float f = (float) i3;
                    performitemaction.getMin = (int) ((f * (((float) computeVerticalScrollOffset) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                    performitemaction.setMax = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                }
                if (performitemaction.toString) {
                    float f2 = (float) computeHorizontalScrollOffset;
                    float f3 = (float) i4;
                    performitemaction.toFloatRange = (int) ((f3 * (f2 + (f3 / 2.0f))) / ((float) computeHorizontalScrollRange));
                    performitemaction.IsOverlapping = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                }
                if (performitemaction.hashCode == 0 || performitemaction.hashCode == 1) {
                    performitemaction.setMax(1);
                }
            } else if (performitemaction.hashCode != 0) {
                performitemaction.setMax(0);
            }
        }
    };
    @VisibleForTesting
    int IsOverlapping;
    private final int Mean$Arithmetic;
    private final int b;
    private final int create;
    @VisibleForTesting
    float equals;
    private int extraCallback = 0;
    private final int extraCallbackWithResult;
    private final int getCause;
    final StateListDrawable getMax;
    @VisibleForTesting
    int getMin;
    int hashCode = 0;
    final ValueAnimator invoke = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
    int invokeSuspend = 0;
    @VisibleForTesting
    float isInside;
    final int length;
    private final Runnable onMessageChannelReady = new Runnable() {
        public final void run() {
            performItemAction performitemaction = performItemAction.this;
            int i = performitemaction.invokeSuspend;
            if (i == 1) {
                performitemaction.invoke.cancel();
            } else if (i != 2) {
                return;
            }
            performitemaction.invokeSuspend = 3;
            performitemaction.invoke.setFloatValues(new float[]{((Float) performitemaction.invoke.getAnimatedValue()).floatValue(), 0.0f});
            performitemaction.invoke.setDuration(500);
            performitemaction.invoke.start();
        }
    };
    private final StateListDrawable onNavigationEvent;
    private final int[] onPostMessage = new int[2];
    private final int[] onRelationshipValidationResult = new int[2];
    @VisibleForTesting
    int setMax;
    final Drawable setMin;
    RecyclerView toDoubleRange;
    @VisibleForTesting
    int toFloatRange;
    int toIntRange = 0;
    boolean toString = false;
    boolean values = false;

    public performItemAction(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        this.getMax = stateListDrawable;
        this.setMin = drawable;
        this.onNavigationEvent = stateListDrawable2;
        this.ICustomTabsCallback = drawable2;
        this.b = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.create = Math.max(i, drawable.getIntrinsicWidth());
        this.getCause = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.extraCallbackWithResult = Math.max(i, drawable2.getIntrinsicWidth());
        this.length = i2;
        this.Mean$Arithmetic = i3;
        this.getMax.setAlpha(255);
        this.setMin.setAlpha(255);
        this.invoke.addListener(new setMax());
        this.invoke.addUpdateListener(new length());
        RecyclerView recyclerView2 = this.toDoubleRange;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.toDoubleRange.removeOnItemTouchListener(this);
                this.toDoubleRange.removeOnScrollListener(this.ICustomTabsCallback$Default);
                this.toDoubleRange.removeCallbacks(this.onMessageChannelReady);
            }
            this.toDoubleRange = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.toDoubleRange.addOnItemTouchListener(this);
                this.toDoubleRange.addOnScrollListener(this.ICustomTabsCallback$Default);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setMax(int i) {
        if (i == 2 && this.hashCode != 2) {
            this.getMax.setState(valueOf);
            this.toDoubleRange.removeCallbacks(this.onMessageChannelReady);
        }
        if (i == 0) {
            this.toDoubleRange.invalidate();
        } else {
            setMin();
        }
        if (this.hashCode == 2 && i != 2) {
            this.getMax.setState(Grayscale$Algorithm);
            this.toDoubleRange.removeCallbacks(this.onMessageChannelReady);
            this.toDoubleRange.postDelayed(this.onMessageChannelReady, 1200);
        } else if (i == 1) {
            this.toDoubleRange.removeCallbacks(this.onMessageChannelReady);
            this.toDoubleRange.postDelayed(this.onMessageChannelReady, 1500);
        }
        this.hashCode = i;
    }

    private boolean setMax() {
        return ViewCompat.IsOverlapping(this.toDoubleRange) == 1;
    }

    private void setMin() {
        int i = this.invokeSuspend;
        if (i != 0) {
            if (i == 3) {
                this.invoke.cancel();
            } else {
                return;
            }
        }
        this.invokeSuspend = 1;
        ValueAnimator valueAnimator = this.invoke;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.invoke.setDuration(500);
        this.invoke.setStartDelay(0);
        this.invoke.start();
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        if (this.toIntRange != this.toDoubleRange.getWidth() || this.FastBitmap$CoordinateSystem != this.toDoubleRange.getHeight()) {
            this.toIntRange = this.toDoubleRange.getWidth();
            this.FastBitmap$CoordinateSystem = this.toDoubleRange.getHeight();
            setMax(0);
        } else if (this.invokeSuspend != 0) {
            if (this.values) {
                int i = this.toIntRange;
                int i2 = this.b;
                int i3 = i - i2;
                int i4 = this.getMin;
                int i5 = this.setMax;
                int i6 = i4 - (i5 / 2);
                this.getMax.setBounds(0, 0, i2, i5);
                this.setMin.setBounds(0, 0, this.create, this.FastBitmap$CoordinateSystem);
                if (setMax()) {
                    this.setMin.draw(canvas);
                    canvas.translate((float) this.b, (float) i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.getMax.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-this.b), (float) (-i6));
                } else {
                    canvas.translate((float) i3, 0.0f);
                    this.setMin.draw(canvas);
                    canvas.translate(0.0f, (float) i6);
                    this.getMax.draw(canvas);
                    canvas.translate((float) (-i3), (float) (-i6));
                }
            }
            if (this.toString) {
                int i7 = this.FastBitmap$CoordinateSystem;
                int i8 = this.getCause;
                int i9 = i7 - i8;
                int i10 = this.toFloatRange;
                int i11 = this.IsOverlapping;
                int i12 = i10 - (i11 / 2);
                this.onNavigationEvent.setBounds(0, 0, i11, i8);
                this.ICustomTabsCallback.setBounds(0, 0, this.toIntRange, this.extraCallbackWithResult);
                canvas.translate(0.0f, (float) i9);
                this.ICustomTabsCallback.draw(canvas);
                canvas.translate((float) i12, 0.0f);
                this.onNavigationEvent.draw(canvas);
                canvas.translate((float) (-i12), (float) (-i9));
            }
        }
    }

    public final boolean setMax(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i = this.hashCode;
        if (i == 1) {
            boolean min = getMin(motionEvent.getX(), motionEvent.getY());
            boolean max = setMax(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!min && !max) {
                return false;
            }
            if (max) {
                this.extraCallback = 1;
                this.equals = (float) ((int) motionEvent.getX());
            } else if (min) {
                this.extraCallback = 2;
                this.isInside = (float) ((int) motionEvent.getY());
            }
            setMax(2);
        } else if (i == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final void getMin(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.hashCode != 0) {
            if (motionEvent.getAction() == 0) {
                boolean min = getMin(motionEvent.getX(), motionEvent.getY());
                boolean max = setMax(motionEvent.getX(), motionEvent.getY());
                if (min || max) {
                    if (max) {
                        this.extraCallback = 1;
                        this.equals = (float) ((int) motionEvent.getX());
                    } else if (min) {
                        this.extraCallback = 2;
                        this.isInside = (float) ((int) motionEvent.getY());
                    }
                    setMax(2);
                }
            } else if (motionEvent.getAction() == 1 && this.hashCode == 2) {
                this.isInside = 0.0f;
                this.equals = 0.0f;
                setMax(1);
                this.extraCallback = 0;
            } else if (motionEvent.getAction() == 2 && this.hashCode == 2) {
                setMin();
                if (this.extraCallback == 1) {
                    float x = motionEvent.getX();
                    int[] iArr = this.onRelationshipValidationResult;
                    int i = this.Mean$Arithmetic;
                    iArr[0] = i;
                    iArr[1] = this.toIntRange - i;
                    float max2 = Math.max((float) iArr[0], Math.min((float) iArr[1], x));
                    if (Math.abs(((float) this.toFloatRange) - max2) >= 2.0f) {
                        int length2 = length(this.equals, max2, iArr, this.toDoubleRange.computeHorizontalScrollRange(), this.toDoubleRange.computeHorizontalScrollOffset(), this.toIntRange);
                        if (length2 != 0) {
                            this.toDoubleRange.scrollBy(length2, 0);
                        }
                        this.equals = max2;
                    }
                }
                if (this.extraCallback == 2) {
                    float y = motionEvent.getY();
                    int[] iArr2 = this.onPostMessage;
                    int i2 = this.Mean$Arithmetic;
                    iArr2[0] = i2;
                    iArr2[1] = this.FastBitmap$CoordinateSystem - i2;
                    float max3 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y));
                    if (Math.abs(((float) this.getMin) - max3) >= 2.0f) {
                        int length3 = length(this.isInside, max3, iArr2, this.toDoubleRange.computeVerticalScrollRange(), this.toDoubleRange.computeVerticalScrollOffset(), this.FastBitmap$CoordinateSystem);
                        if (length3 != 0) {
                            this.toDoubleRange.scrollBy(0, length3);
                        }
                        this.isInside = max3;
                    }
                }
            }
        }
    }

    private static int length(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @VisibleForTesting
    private boolean getMin(float f, float f2) {
        if (setMax()) {
            if (f > ((float) this.b)) {
                return false;
            }
        } else if (f < ((float) (this.toIntRange - this.b))) {
            return false;
        }
        int i = this.getMin;
        int i2 = this.setMax;
        return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
    }

    @VisibleForTesting
    private boolean setMax(float f, float f2) {
        if (f2 < ((float) (this.FastBitmap$CoordinateSystem - this.getCause))) {
            return false;
        }
        int i = this.toFloatRange;
        int i2 = this.IsOverlapping;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
    }

    class setMax extends AnimatorListenerAdapter {
        private boolean setMax = false;

        setMax() {
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.setMax) {
                this.setMax = false;
            } else if (((Float) performItemAction.this.invoke.getAnimatedValue()).floatValue() == 0.0f) {
                performItemAction.this.invokeSuspend = 0;
                performItemAction.this.setMax(0);
            } else {
                performItemAction.this.invokeSuspend = 2;
                performItemAction.this.toDoubleRange.invalidate();
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.setMax = true;
        }
    }

    class length implements ValueAnimator.AnimatorUpdateListener {
        length() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            performItemAction.this.getMax.setAlpha(floatValue);
            performItemAction.this.setMin.setAlpha(floatValue);
            performItemAction.this.toDoubleRange.invalidate();
        }
    }
}
