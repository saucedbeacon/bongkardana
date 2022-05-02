package o;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;

public final class getDialog extends ChartTouchListener<BarLineChartBase<? extends dispatchOnDrawerClosed<? extends EmojiAppCompatButton<? extends Entry>>>> {
    private float FastBitmap$CoordinateSystem = 1.0f;
    private setArguments Grayscale$Algorithm = setArguments.getMax(0.0f, 0.0f);
    private Matrix IsOverlapping = new Matrix();
    private float Mean$Arithmetic;
    private setArguments equals = setArguments.getMax(0.0f, 0.0f);
    private long hashCode = 0;
    private float invokeSuspend;
    private Matrix isInside = new Matrix();
    private VelocityTracker toDoubleRange;
    private float toFloatRange = 1.0f;
    private setArguments toIntRange = setArguments.getMax(0.0f, 0.0f);
    private EmojiAppCompatTextView toString;
    private setArguments valueOf = setArguments.getMax(0.0f, 0.0f);
    private float values = 1.0f;

    public getDialog(BarLineChartBase<? extends dispatchOnDrawerClosed<? extends EmojiAppCompatButton<? extends Entry>>> barLineChartBase, Matrix matrix) {
        super(barLineChartBase);
        this.isInside = matrix;
        this.Mean$Arithmetic = getTargetFragment.setMax(3.0f);
        this.invokeSuspend = getTargetFragment.setMax(3.5f);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        addFocusables highlightByTouchPoint;
        VelocityTracker velocityTracker;
        if (this.toDoubleRange == null) {
            this.toDoubleRange = VelocityTracker.obtain();
        }
        this.toDoubleRange.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.toDoubleRange) != null) {
            velocityTracker.recycle();
            this.toDoubleRange = null;
        }
        if (this.setMax == 0) {
            this.length.onTouchEvent(motionEvent);
        }
        if (!((BarLineChartBase) this.getMax).isDragEnabled() && !((BarLineChartBase) this.getMax).isScaleXEnabled() && !((BarLineChartBase) this.getMax).isScaleYEnabled()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        float f = 0.0f;
        if (action != 0) {
            boolean z5 = false;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.toDoubleRange;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, (float) getTargetFragment.getMin());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > ((float) getTargetFragment.setMax()) || Math.abs(yVelocity) > ((float) getTargetFragment.setMax())) && this.setMax == 1 && ((BarLineChartBase) this.getMax).isDragDecelerationEnabled()) {
                    this.Grayscale$Algorithm.length = 0.0f;
                    this.Grayscale$Algorithm.getMin = 0.0f;
                    this.hashCode = AnimationUtils.currentAnimationTimeMillis();
                    this.valueOf.length = motionEvent.getX();
                    this.valueOf.getMin = motionEvent.getY();
                    this.Grayscale$Algorithm.length = xVelocity;
                    this.Grayscale$Algorithm.getMin = yVelocity;
                    getTargetFragment.getMin((View) this.getMax);
                }
                if (this.setMax == 2 || this.setMax == 3 || this.setMax == 4 || this.setMax == 5) {
                    ((BarLineChartBase) this.getMax).calculateOffsets();
                    ((BarLineChartBase) this.getMax).postInvalidate();
                }
                this.setMax = 0;
                ((BarLineChartBase) this.getMax).enableScroll();
                VelocityTracker velocityTracker3 = this.toDoubleRange;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.toDoubleRange = null;
                }
                setMax();
            } else if (action != 2) {
                if (action == 3) {
                    this.setMax = 0;
                    setMax();
                } else if (action != 5) {
                    if (action == 6) {
                        getTargetFragment.setMax(motionEvent, this.toDoubleRange);
                        this.setMax = 5;
                    }
                } else if (motionEvent.getPointerCount() >= 2) {
                    ((BarLineChartBase) this.getMax).disableScroll();
                    length(motionEvent);
                    this.toFloatRange = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                    this.values = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                    float min = getMin(motionEvent);
                    this.FastBitmap$CoordinateSystem = min;
                    if (min > 10.0f) {
                        if (((BarLineChartBase) this.getMax).isPinchZoomEnabled()) {
                            i = 4;
                        } else if (((BarLineChartBase) this.getMax).isScaleXEnabled() != ((BarLineChartBase) this.getMax).isScaleYEnabled()) {
                            if (((BarLineChartBase) this.getMax).isScaleXEnabled()) {
                                i = 2;
                            }
                            this.setMax = i;
                        } else if (this.toFloatRange > this.values) {
                            i = 2;
                        }
                        this.setMax = i;
                    }
                    setArguments setarguments = this.toIntRange;
                    setarguments.length = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
                    setarguments.getMin = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
                }
            } else if (this.setMax == 1) {
                ((BarLineChartBase) this.getMax).disableScroll();
                float x = ((BarLineChartBase) this.getMax).isDragXEnabled() ? motionEvent.getX() - this.equals.length : 0.0f;
                if (((BarLineChartBase) this.getMax).isDragYEnabled()) {
                    f = motionEvent.getY() - this.equals.getMin;
                }
                getMax(x, f);
            } else if (this.setMax == 2 || this.setMax == 3 || this.setMax == 4) {
                ((BarLineChartBase) this.getMax).disableScroll();
                if ((((BarLineChartBase) this.getMax).isScaleXEnabled() || ((BarLineChartBase) this.getMax).isScaleYEnabled()) && motionEvent.getPointerCount() >= 2) {
                    ((BarLineChartBase) this.getMax).getOnChartGestureListener();
                    float min2 = getMin(motionEvent);
                    if (min2 > this.invokeSuspend) {
                        setArguments length = length(this.toIntRange.length, this.toIntRange.getMin);
                        setTargetFragment viewPortHandler = ((BarLineChartBase) this.getMax).getViewPortHandler();
                        float f2 = 1.0f;
                        if (this.setMax == 4) {
                            this.getMin = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                            float f3 = min2 / this.FastBitmap$CoordinateSystem;
                            if (f3 < 1.0f) {
                                z5 = true;
                            }
                            if (z5) {
                                z3 = viewPortHandler.getCause();
                            } else {
                                z3 = viewPortHandler.ICustomTabsCallback();
                            }
                            if (z5) {
                                z4 = viewPortHandler.onRelationshipValidationResult();
                            } else {
                                z4 = viewPortHandler.onMessageChannelReady();
                            }
                            float f4 = ((BarLineChartBase) this.getMax).isScaleXEnabled() ? f3 : 1.0f;
                            if (((BarLineChartBase) this.getMax).isScaleYEnabled()) {
                                f2 = f3;
                            }
                            if (z4 || z3) {
                                this.isInside.set(this.IsOverlapping);
                                this.isInside.postScale(f4, f2, length.length, length.getMin);
                            }
                        } else if (this.setMax == 2 && ((BarLineChartBase) this.getMax).isScaleXEnabled()) {
                            this.getMin = ChartTouchListener.ChartGesture.X_ZOOM;
                            float abs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.toFloatRange;
                            if (abs < 1.0f) {
                                z5 = true;
                            }
                            if (z5) {
                                z2 = viewPortHandler.getCause();
                            } else {
                                z2 = viewPortHandler.ICustomTabsCallback();
                            }
                            if (z2) {
                                this.isInside.set(this.IsOverlapping);
                                this.isInside.postScale(abs, 1.0f, length.length, length.getMin);
                            }
                        } else if (this.setMax == 3 && ((BarLineChartBase) this.getMax).isScaleYEnabled()) {
                            this.getMin = ChartTouchListener.ChartGesture.Y_ZOOM;
                            float abs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.values;
                            if (abs2 < 1.0f) {
                                z5 = true;
                            }
                            if (z5) {
                                z = viewPortHandler.onRelationshipValidationResult();
                            } else {
                                z = viewPortHandler.onMessageChannelReady();
                            }
                            if (z) {
                                this.isInside.set(this.IsOverlapping);
                                this.isInside.postScale(1.0f, abs2, length.length, length.getMin);
                            }
                        }
                        setArguments.setMin(length);
                    }
                }
            } else if (this.setMax == 0) {
                float x2 = motionEvent.getX() - this.equals.length;
                float y = motionEvent.getY() - this.equals.getMin;
                if (Math.abs((float) Math.sqrt((double) ((x2 * x2) + (y * y)))) > this.Mean$Arithmetic && ((BarLineChartBase) this.getMax).isDragEnabled()) {
                    if (!((BarLineChartBase) this.getMax).isFullyZoomedOut() || !((BarLineChartBase) this.getMax).hasNoDragOffset()) {
                        z5 = true;
                    }
                    if (z5) {
                        float abs3 = Math.abs(motionEvent.getX() - this.equals.length);
                        float abs4 = Math.abs(motionEvent.getY() - this.equals.getMin);
                        if ((((BarLineChartBase) this.getMax).isDragXEnabled() || abs4 >= abs3) && (((BarLineChartBase) this.getMax).isDragYEnabled() || abs4 <= abs3)) {
                            this.getMin = ChartTouchListener.ChartGesture.DRAG;
                            this.setMax = 1;
                        }
                    } else if (((BarLineChartBase) this.getMax).isHighlightPerDragEnabled()) {
                        this.getMin = ChartTouchListener.ChartGesture.DRAG;
                        if (((BarLineChartBase) this.getMax).isHighlightPerDragEnabled() && (highlightByTouchPoint = ((BarLineChartBase) this.getMax).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY())) != null && !highlightByTouchPoint.length(this.setMin)) {
                            this.setMin = highlightByTouchPoint;
                            ((BarLineChartBase) this.getMax).highlightValue(highlightByTouchPoint, true);
                        }
                    }
                }
            }
        } else {
            getMin();
            this.Grayscale$Algorithm.length = 0.0f;
            this.Grayscale$Algorithm.getMin = 0.0f;
            length(motionEvent);
        }
        this.isInside = ((BarLineChartBase) this.getMax).getViewPortHandler().getMin(this.isInside, (View) this.getMax, true);
        return true;
    }

    private void length(MotionEvent motionEvent) {
        this.IsOverlapping.set(this.isInside);
        this.equals.length = motionEvent.getX();
        this.equals.getMin = motionEvent.getY();
        this.toString = ((BarLineChartBase) this.getMax).getDataSetByTouchPoint(motionEvent.getX(), motionEvent.getY());
    }

    private void getMax(float f, float f2) {
        this.getMin = ChartTouchListener.ChartGesture.DRAG;
        this.isInside.set(this.IsOverlapping);
        ((BarLineChartBase) this.getMax).getOnChartGestureListener();
        if (length()) {
            if (this.getMax instanceof HorizontalBarChart) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.isInside.postTranslate(f, f2);
    }

    private static float getMin(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    private setArguments length(float f, float f2) {
        float f3;
        setTargetFragment viewPortHandler = ((BarLineChartBase) this.getMax).getViewPortHandler();
        float min = f - viewPortHandler.setMin();
        if (length()) {
            f3 = -(f2 - viewPortHandler.setMax());
        } else {
            f3 = -((((float) ((BarLineChartBase) this.getMax).getMeasuredHeight()) - f2) - viewPortHandler.getMin());
        }
        return setArguments.getMax(min, f3);
    }

    private boolean length() {
        if (this.toString != null || !((BarLineChartBase) this.getMax).isAnyAxisInverted()) {
            return this.toString != null && ((BarLineChartBase) this.getMax).isInverted(this.toString.getCause());
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.getMin = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        ((BarLineChartBase) this.getMax).getOnChartGestureListener();
        if (((BarLineChartBase) this.getMax).isDoubleTapToZoomEnabled() && ((dispatchOnDrawerClosed) ((BarLineChartBase) this.getMax).getData()).isInside() > 0) {
            setArguments length = length(motionEvent.getX(), motionEvent.getY());
            BarLineChartBase barLineChartBase = (BarLineChartBase) this.getMax;
            float f = 1.4f;
            float f2 = ((BarLineChartBase) this.getMax).isScaleXEnabled() ? 1.4f : 1.0f;
            if (!((BarLineChartBase) this.getMax).isScaleYEnabled()) {
                f = 1.0f;
            }
            barLineChartBase.zoom(f2, f, length.length, length.getMin);
            ((BarLineChartBase) this.getMax).isLogEnabled();
            setArguments.setMin(length);
        }
        return super.onDoubleTap(motionEvent);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.getMin = ChartTouchListener.ChartGesture.LONG_PRESS;
        ((BarLineChartBase) this.getMax).getOnChartGestureListener();
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.getMin = ChartTouchListener.ChartGesture.SINGLE_TAP;
        ((BarLineChartBase) this.getMax).getOnChartGestureListener();
        if (!((BarLineChartBase) this.getMax).isHighlightPerTapEnabled()) {
            return false;
        }
        setMin(((BarLineChartBase) this.getMax).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()));
        return super.onSingleTapUp(motionEvent);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.getMin = ChartTouchListener.ChartGesture.FLING;
        ((BarLineChartBase) this.getMax).getOnChartGestureListener();
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void setMin() {
        if (this.Grayscale$Algorithm.length != 0.0f || this.Grayscale$Algorithm.getMin != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.Grayscale$Algorithm.length *= ((BarLineChartBase) this.getMax).getDragDecelerationFrictionCoef();
            this.Grayscale$Algorithm.getMin *= ((BarLineChartBase) this.getMax).getDragDecelerationFrictionCoef();
            float f = ((float) (currentAnimationTimeMillis - this.hashCode)) / 1000.0f;
            float f2 = this.Grayscale$Algorithm.length * f;
            float f3 = this.Grayscale$Algorithm.getMin * f;
            this.valueOf.length += f2;
            this.valueOf.getMin += f3;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, this.valueOf.length, this.valueOf.getMin, 0);
            getMax(((BarLineChartBase) this.getMax).isDragXEnabled() ? this.valueOf.length - this.equals.length : 0.0f, ((BarLineChartBase) this.getMax).isDragYEnabled() ? this.valueOf.getMin - this.equals.getMin : 0.0f);
            obtain.recycle();
            this.isInside = ((BarLineChartBase) this.getMax).getViewPortHandler().getMin(this.isInside, (View) this.getMax, false);
            this.hashCode = currentAnimationTimeMillis;
            if (((double) Math.abs(this.Grayscale$Algorithm.length)) >= 0.01d || ((double) Math.abs(this.Grayscale$Algorithm.getMin)) >= 0.01d) {
                getTargetFragment.getMin((View) this.getMax);
                return;
            }
            ((BarLineChartBase) this.getMax).calculateOffsets();
            ((BarLineChartBase) this.getMax).postInvalidate();
            this.Grayscale$Algorithm.length = 0.0f;
            this.Grayscale$Algorithm.getMin = 0.0f;
        }
    }
}
