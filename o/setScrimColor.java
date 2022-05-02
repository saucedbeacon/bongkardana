package o;

import android.animation.TimeInterpolator;
import androidx.annotation.RequiresApi;

@RequiresApi(11)
public final class setScrimColor {
    public static final setMin FastBitmap$CoordinateSystem = new setMin() {
        public final float getInterpolation(float f) {
            double d = (double) f;
            Double.isNaN(d);
            return (-((float) Math.cos(d * 1.5707963267948966d))) + 1.0f;
        }
    };
    public static final setMin Grayscale$Algorithm = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (float) Math.sqrt((double) (1.0f - (f2 * f2)));
        }
    };
    public static final setMin ICustomTabsCallback = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return f2 * f2 * ((f2 * 3.5949094f) - 2.5949094f) * 0.5f;
            }
            float f3 = f2 - 2.0f;
            return ((f3 * f3 * ((f3 * 3.5949094f) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    };
    public static final setMin IsOverlapping = new setMin() {
        public final float getInterpolation(float f) {
            return -(((float) Math.pow((double) (f - 1.0f), 4.0d)) - 1.0f);
        }
    };
    public static final setMin Mean$Arithmetic = new setMin() {
        public final float getInterpolation(float f) {
            float f2;
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f3 = f * 2.0f;
            if (f3 < 1.0f) {
                f2 = (float) Math.pow(2.0d, (double) ((f3 - 1.0f) * 10.0f));
            } else {
                f2 = (-((float) Math.pow(2.0d, (double) ((f3 - 1.0f) * -10.0f)))) + 2.0f;
            }
            return f2 * 0.5f;
        }
    };
    public static final setMin b = new setMin() {
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (double) (-10.0f * f))) * ((float) Math.sin((double) (((f - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f)))) + 1.0f;
        }
    };
    public static final setMin create = new setMin() {
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            float f2 = f * 2.0f;
            if (f2 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f2 < 1.0f) {
                float f3 = f2 - 1.0f;
                return ((float) Math.pow(2.0d, (double) (10.0f * f3))) * ((float) Math.sin((double) (((f3 * 1.0f) - asin) * 6.2831855f * 2.2222223f))) * -0.5f;
            }
            float f4 = f2 - 1.0f;
            return (((float) Math.pow(2.0d, (double) (-10.0f * f4))) * 0.5f * ((float) Math.sin((double) (((f4 * 1.0f) - asin) * 6.2831855f * 2.2222223f)))) + 1.0f;
        }
    };
    public static final setMin equals = new setMin() {
        public final float getInterpolation(float f) {
            float pow;
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                pow = (float) Math.pow((double) f2, 3.0d);
            } else {
                pow = ((float) Math.pow((double) (f2 - 2.0f), 3.0d)) + 2.0f;
            }
            return pow * 0.5f;
        }
    };
    public static final setMin extraCallback = new setMin() {
        public final float getInterpolation(float f) {
            if (f < 0.36363637f) {
                return 7.5625f * f * f;
            }
            if (f < 0.72727275f) {
                float f2 = f - 0.54545456f;
                return (7.5625f * f2 * f2) + 0.75f;
            } else if (f < 0.90909094f) {
                float f3 = f - 0.8181818f;
                return (7.5625f * f3 * f3) + 0.9375f;
            } else {
                float f4 = f - 0.95454544f;
                return (7.5625f * f4 * f4) + 0.984375f;
            }
        }
    };
    public static final setMin extraCallbackWithResult = new setMin() {
        public final float getInterpolation(float f) {
            return 1.0f - setScrimColor.extraCallback.getInterpolation(1.0f - f);
        }
    };
    public static final setMin getCause = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * ((f2 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    };
    public static final setMin getMax = new setMin() {
        public final float getInterpolation(float f) {
            return f;
        }
    };
    public static final setMin getMin = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return 0.5f * f2 * f2;
            }
            float f3 = f2 - 1.0f;
            return ((f3 * (f3 - 2.0f)) - 1.0f) * -0.5f;
        }
    };
    public static final setMin hashCode = new setMin() {
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (double) ((f - 1.0f) * 10.0f));
        }
    };
    public static final setMin invoke = new setMin() {
        public final float getInterpolation(float f) {
            return -(((float) Math.sqrt((double) (1.0f - (f * f)))) - 1.0f);
        }
    };
    public static final setMin invokeSuspend = new setMin() {
        public final float getInterpolation(float f) {
            if (f == 0.0f) {
                return 0.0f;
            }
            if (f == 1.0f) {
                return 1.0f;
            }
            float f2 = f - 1.0f;
            return -(((float) Math.pow(2.0d, (double) (10.0f * f2))) * ((float) Math.sin((double) (((f2 - (((float) Math.asin(1.0d)) * 0.047746483f)) * 6.2831855f) / 0.3f))));
        }
    };
    public static final setMin isInside = new setMin() {
        public final float getInterpolation(float f) {
            return ((float) Math.pow((double) (f - 1.0f), 3.0d)) + 1.0f;
        }
    };
    public static final setMin length = new setMin() {
        public final float getInterpolation(float f) {
            return (-f) * (f - 2.0f);
        }
    };
    public static final setMin onNavigationEvent = new setMin() {
        public final float getInterpolation(float f) {
            return f * f * ((f * 2.70158f) - 1.70158f);
        }
    };
    public static final setMin onPostMessage = new setMin() {
        public final float getInterpolation(float f) {
            if (f < 0.5f) {
                return setScrimColor.extraCallbackWithResult.getInterpolation(f * 2.0f) * 0.5f;
            }
            return (setScrimColor.extraCallback.getInterpolation((f * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    };
    public static final setMin setMax = new setMin() {
        public final float getInterpolation(float f) {
            return f * f;
        }
    };
    public static final setMin setMin = new setMin() {
        public final float getInterpolation(float f) {
            return (float) Math.pow((double) f, 3.0d);
        }
    };
    public static final setMin toDoubleRange = new setMin() {
        public final float getInterpolation(float f) {
            if (f == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (double) ((f + 1.0f) * -10.0f)));
        }
    };
    public static final setMin toFloatRange = new setMin() {
        public final float getInterpolation(float f) {
            return (float) Math.pow((double) f, 4.0d);
        }
    };
    public static final setMin toIntRange = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return ((float) Math.pow((double) f2, 4.0d)) * 0.5f;
            }
            return (((float) Math.pow((double) (f2 - 2.0f), 4.0d)) - 2.0f) * -0.5f;
        }
    };
    public static final setMin toString = new setMin() {
        public final float getInterpolation(float f) {
            double d = (double) f;
            Double.isNaN(d);
            return (((float) Math.cos(d * 3.141592653589793d)) - 1.0f) * -0.5f;
        }
    };
    public static final setMin valueOf = new setMin() {
        public final float getInterpolation(float f) {
            float f2 = f * 2.0f;
            if (f2 < 1.0f) {
                return (((float) Math.sqrt((double) (1.0f - (f2 * f2)))) - 1.0f) * -0.5f;
            }
            float f3 = f2 - 2.0f;
            return (((float) Math.sqrt((double) (1.0f - (f3 * f3)))) + 1.0f) * 0.5f;
        }
    };
    public static final setMin values = new setMin() {
        public final float getInterpolation(float f) {
            double d = (double) f;
            Double.isNaN(d);
            return (float) Math.sin(d * 1.5707963267948966d);
        }
    };

    public interface setMin extends TimeInterpolator {
        float getInterpolation(float f);
    }
}
