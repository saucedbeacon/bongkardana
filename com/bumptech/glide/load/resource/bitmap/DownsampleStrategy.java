package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import o.setTranslationX;

public abstract class DownsampleStrategy {
    public static final setTranslationX<DownsampleStrategy> IsOverlapping;
    public static final DownsampleStrategy equals;
    public static final DownsampleStrategy getMax = new getMax();
    public static final DownsampleStrategy getMin = new setMin();
    static final boolean isInside = (Build.VERSION.SDK_INT >= 19);
    public static final DownsampleStrategy length = new getMin();
    public static final DownsampleStrategy setMax = new setMax();
    public static final DownsampleStrategy setMin = new length();
    public static final DownsampleStrategy toFloatRange = new equals();

    public enum SampleSizeRounding {
        MEMORY,
        QUALITY
    }

    public abstract SampleSizeRounding getMax(int i, int i2, int i3, int i4);

    public abstract float setMin(int i, int i2, int i3, int i4);

    static {
        DownsampleStrategy downsampleStrategy = setMax;
        equals = downsampleStrategy;
        IsOverlapping = setTranslationX.setMin("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", downsampleStrategy);
    }

    static class length extends DownsampleStrategy {
        length() {
        }

        public final float setMin(int i, int i2, int i3, int i4) {
            if (isInside) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            if (isInside) {
                return SampleSizeRounding.QUALITY;
            }
            return SampleSizeRounding.MEMORY;
        }
    }

    static class setMax extends DownsampleStrategy {
        setMax() {
        }

        public final float setMin(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class getMin extends DownsampleStrategy {
        getMin() {
        }

        public final float setMin(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class getMax extends DownsampleStrategy {
        getMax() {
        }

        public final float setMin(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.MEMORY;
        }
    }

    static class equals extends DownsampleStrategy {
        public final float setMin(int i, int i2, int i3, int i4) {
            return 1.0f;
        }

        equals() {
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            return SampleSizeRounding.QUALITY;
        }
    }

    static class setMin extends DownsampleStrategy {
        setMin() {
        }

        public final float setMin(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, setMin.setMin(i, i2, i3, i4));
        }

        public final SampleSizeRounding getMax(int i, int i2, int i3, int i4) {
            if (Math.min(1.0f, setMin.setMin(i, i2, i3, i4)) == 1.0f) {
                return SampleSizeRounding.QUALITY;
            }
            return setMin.getMax(i, i2, i3, i4);
        }
    }
}
