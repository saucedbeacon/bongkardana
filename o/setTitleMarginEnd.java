package o;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

public final class setTitleMarginEnd extends Toolbar implements Choreographer.FrameCallback {
    private boolean IsOverlapping = false;
    @VisibleForTesting
    protected boolean equals = false;
    @Nullable
    public setVerticalGravity getMax;
    public float getMin = 0.0f;
    public float length = 1.0f;
    public float setMax = 2.14748365E9f;
    public float setMin = -2.14748365E9f;
    private int toFloatRange = 0;
    private long toIntRange = 0;

    public final Object getAnimatedValue() {
        return Float.valueOf(getMin());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getMin() {
        setVerticalGravity setverticalgravity = this.getMax;
        if (setverticalgravity == null) {
            return 0.0f;
        }
        return (this.getMin - setverticalgravity.values) / (this.getMax.toDoubleRange - this.getMax.values);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (this.getMax == null) {
            return 0.0f;
        }
        if (toFloatRange()) {
            setVerticalGravity setverticalgravity = this.getMax;
            if (setverticalgravity == null) {
                f3 = 0.0f;
            } else {
                f3 = this.setMax;
                if (f3 == 2.14748365E9f) {
                    f3 = setverticalgravity.toDoubleRange;
                }
            }
            float f6 = f3 - this.getMin;
            setVerticalGravity setverticalgravity2 = this.getMax;
            if (setverticalgravity2 == null) {
                f4 = 0.0f;
            } else {
                f4 = this.setMax;
                if (f4 == 2.14748365E9f) {
                    f4 = setverticalgravity2.toDoubleRange;
                }
            }
            setVerticalGravity setverticalgravity3 = this.getMax;
            if (setverticalgravity3 != null) {
                f5 = this.setMin;
                if (f5 == -2.14748365E9f) {
                    f5 = setverticalgravity3.values;
                }
            }
            return f6 / (f4 - f5);
        }
        float f7 = this.getMin;
        setVerticalGravity setverticalgravity4 = this.getMax;
        if (setverticalgravity4 == null) {
            f = 0.0f;
        } else {
            f = this.setMin;
            if (f == -2.14748365E9f) {
                f = setverticalgravity4.values;
            }
        }
        float f8 = f7 - f;
        setVerticalGravity setverticalgravity5 = this.getMax;
        if (setverticalgravity5 == null) {
            f2 = 0.0f;
        } else {
            f2 = this.setMax;
            if (f2 == 2.14748365E9f) {
                f2 = setverticalgravity5.toDoubleRange;
            }
        }
        setVerticalGravity setverticalgravity6 = this.getMax;
        if (setverticalgravity6 != null) {
            f5 = this.setMin;
            if (f5 == -2.14748365E9f) {
                f5 = setverticalgravity6.values;
            }
        }
        return f8 / (f2 - f5);
    }

    public final long getDuration() {
        setVerticalGravity setverticalgravity = this.getMax;
        if (setverticalgravity == null) {
            return 0;
        }
        return (long) ((float) ((long) (((setverticalgravity.toDoubleRange - setverticalgravity.values) / setverticalgravity.toString) * 1000.0f)));
    }

    public final boolean isRunning() {
        return this.equals;
    }

    public final void getMax(float f) {
        float f2;
        if (this.getMin != f) {
            setVerticalGravity setverticalgravity = this.getMax;
            float f3 = 0.0f;
            if (setverticalgravity == null) {
                f2 = 0.0f;
            } else {
                f2 = this.setMin;
                if (f2 == -2.14748365E9f) {
                    f2 = setverticalgravity.values;
                }
            }
            setVerticalGravity setverticalgravity2 = this.getMax;
            if (setverticalgravity2 != null) {
                f3 = this.setMax;
                if (f3 == 2.14748365E9f) {
                    f3 = setverticalgravity2.toDoubleRange;
                }
            }
            this.getMin = getTitleMarginTop.setMax(f, f2, f3);
            this.toIntRange = 0;
            length();
        }
    }

    public final void getMin(float f, float f2) {
        if (f <= f2) {
            setVerticalGravity setverticalgravity = this.getMax;
            float f3 = setverticalgravity == null ? -3.4028235E38f : setverticalgravity.values;
            setVerticalGravity setverticalgravity2 = this.getMax;
            float f4 = setverticalgravity2 == null ? Float.MAX_VALUE : setverticalgravity2.toDoubleRange;
            float max = getTitleMarginTop.setMax(f, f3, f4);
            float max2 = getTitleMarginTop.setMax(f2, f3, f4);
            if (max != this.setMin || max2 != this.setMax) {
                this.setMin = max;
                this.setMax = max2;
                getMax((float) ((int) getTitleMarginTop.setMax(this.getMin, max, max2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.IsOverlapping) {
            this.IsOverlapping = false;
            this.length = -this.length;
        }
    }

    @MainThread
    public final void setMin() {
        this.equals = true;
        getMax(toFloatRange());
        float f = 0.0f;
        if (toFloatRange()) {
            setVerticalGravity setverticalgravity = this.getMax;
            if (setverticalgravity != null) {
                f = this.setMax;
                if (f == 2.14748365E9f) {
                    f = setverticalgravity.toDoubleRange;
                }
            }
        } else {
            setVerticalGravity setverticalgravity2 = this.getMax;
            if (setverticalgravity2 != null) {
                f = this.setMin;
                if (f == -2.14748365E9f) {
                    f = setverticalgravity2.values;
                }
            }
        }
        getMax((float) ((int) f));
        this.toIntRange = 0;
        this.toFloatRange = 0;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public final void isInside() {
        float f;
        float f2;
        this.equals = true;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.toIntRange = 0;
        float f3 = 0.0f;
        if (toFloatRange()) {
            float f4 = this.getMin;
            setVerticalGravity setverticalgravity = this.getMax;
            if (setverticalgravity == null) {
                f2 = 0.0f;
            } else {
                f2 = this.setMin;
                if (f2 == -2.14748365E9f) {
                    f2 = setverticalgravity.values;
                }
            }
            if (f4 == f2) {
                setVerticalGravity setverticalgravity2 = this.getMax;
                if (setverticalgravity2 != null) {
                    f3 = this.setMax;
                    if (f3 == 2.14748365E9f) {
                        f3 = setverticalgravity2.toDoubleRange;
                    }
                }
                this.getMin = f3;
                return;
            }
        }
        if (!toFloatRange()) {
            float f5 = this.getMin;
            setVerticalGravity setverticalgravity3 = this.getMax;
            if (setverticalgravity3 == null) {
                f = 0.0f;
            } else {
                f = this.setMax;
                if (f == 2.14748365E9f) {
                    f = setverticalgravity3.toDoubleRange;
                }
            }
            if (f5 == f) {
                setVerticalGravity setverticalgravity4 = this.getMax;
                if (setverticalgravity4 != null) {
                    f3 = this.setMin;
                    if (f3 == -2.14748365E9f) {
                        f3 = setverticalgravity4.values;
                    }
                }
                this.getMin = f3;
            }
        }
    }

    @MainThread
    public final void cancel() {
        getMax();
        Choreographer.getInstance().removeFrameCallback(this);
        this.equals = false;
    }

    public final void doFrame(long j) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        if (this.getMax != null && isRunning()) {
            setChildFrame.getMin("LottieValueAnimator#doFrame");
            long j2 = this.toIntRange;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            setVerticalGravity setverticalgravity = this.getMax;
            if (setverticalgravity == null) {
                f = Float.MAX_VALUE;
            } else {
                f = (1.0E9f / setverticalgravity.toString) / Math.abs(this.length);
            }
            float f6 = ((float) j3) / f;
            float f7 = this.getMin;
            if (toFloatRange()) {
                f6 = -f6;
            }
            float f8 = f7 + f6;
            this.getMin = f8;
            setVerticalGravity setverticalgravity2 = this.getMax;
            float f9 = 0.0f;
            if (setverticalgravity2 == null) {
                f2 = 0.0f;
            } else {
                f2 = this.setMin;
                if (f2 == -2.14748365E9f) {
                    f2 = setverticalgravity2.values;
                }
            }
            setVerticalGravity setverticalgravity3 = this.getMax;
            if (setverticalgravity3 == null) {
                f3 = 0.0f;
            } else {
                f3 = this.setMax;
                if (f3 == 2.14748365E9f) {
                    f3 = setverticalgravity3.toDoubleRange;
                }
            }
            boolean z = !getTitleMarginTop.getMax(f8, f2, f3);
            float f10 = this.getMin;
            setVerticalGravity setverticalgravity4 = this.getMax;
            if (setverticalgravity4 == null) {
                f4 = 0.0f;
            } else {
                f4 = this.setMin;
                if (f4 == -2.14748365E9f) {
                    f4 = setverticalgravity4.values;
                }
            }
            setVerticalGravity setverticalgravity5 = this.getMax;
            if (setverticalgravity5 == null) {
                f5 = 0.0f;
            } else {
                f5 = this.setMax;
                if (f5 == 2.14748365E9f) {
                    f5 = setverticalgravity5.toDoubleRange;
                }
            }
            this.getMin = getTitleMarginTop.setMax(f10, f4, f5);
            this.toIntRange = j;
            length();
            if (z) {
                if (getRepeatCount() == -1 || this.toFloatRange < getRepeatCount()) {
                    setMax();
                    this.toFloatRange++;
                    if (getRepeatMode() == 2) {
                        this.IsOverlapping = !this.IsOverlapping;
                        this.length = -this.length;
                    } else {
                        if (toFloatRange()) {
                            setVerticalGravity setverticalgravity6 = this.getMax;
                            if (setverticalgravity6 != null) {
                                f9 = this.setMax;
                                if (f9 == 2.14748365E9f) {
                                    f9 = setverticalgravity6.toDoubleRange;
                                }
                            }
                        } else {
                            setVerticalGravity setverticalgravity7 = this.getMax;
                            if (setverticalgravity7 != null) {
                                f9 = this.setMin;
                                if (f9 == -2.14748365E9f) {
                                    f9 = setverticalgravity7.values;
                                }
                            }
                        }
                        this.getMin = f9;
                    }
                    this.toIntRange = j;
                } else {
                    if (this.length < 0.0f) {
                        setVerticalGravity setverticalgravity8 = this.getMax;
                        if (setverticalgravity8 != null) {
                            f9 = this.setMin;
                            if (f9 == -2.14748365E9f) {
                                f9 = setverticalgravity8.values;
                            }
                        }
                    } else {
                        setVerticalGravity setverticalgravity9 = this.getMax;
                        if (setverticalgravity9 != null) {
                            f9 = this.setMax;
                            if (f9 == 2.14748365E9f) {
                                f9 = setverticalgravity9.toDoubleRange;
                            }
                        }
                    }
                    this.getMin = f9;
                    Choreographer.getInstance().removeFrameCallback(this);
                    this.equals = false;
                    length(toFloatRange());
                }
            }
            if (this.getMax != null) {
                float f11 = this.getMin;
                if (f11 < this.setMin || f11 > this.setMax) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.setMin), Float.valueOf(this.setMax), Float.valueOf(this.getMin)}));
                }
            }
            setChildFrame.length("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public final void IsOverlapping() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.equals = false;
        length(toFloatRange());
    }

    @MainThread
    public final void toIntRange() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.equals = false;
    }

    private boolean toFloatRange() {
        return this.length < 0.0f;
    }
}
