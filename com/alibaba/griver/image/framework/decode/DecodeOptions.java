package com.alibaba.griver.image.framework.decode;

public class DecodeOptions extends BaseDecodeOptions {
    public Mode mode = new MaxLenMode(0);

    public static class Mode {
        public static final int TYPE_FIT_RECT = 2;
        public static final int TYPE_MAX_LEN = 0;
        public static final int TYPE_MIN_LEN = 1;
        public final int type;

        public Mode(int i) {
            this.type = i;
        }
    }

    public static final class MaxLenMode extends Mode {
        public final Integer len;

        public MaxLenMode(Integer num) {
            super(0);
            this.len = num;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("APMaxLenMode{len=");
            sb.append(this.len);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class MinLenMode extends Mode {
        public final Integer len;

        public MinLenMode(Integer num) {
            super(1);
            this.len = num;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("APMinLenMode{len=");
            sb.append(this.len);
            sb.append('}');
            return sb.toString();
        }
    }

    public static final class FitRectMode extends Mode {
        public final int rectHeight;
        public final int rectWidth;

        public FitRectMode(int i, int i2) {
            super(2);
            this.rectWidth = i;
            this.rectHeight = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FitRectMode{rectWidth=");
            sb.append(this.rectWidth);
            sb.append(", rectHeight=");
            sb.append(this.rectHeight);
            sb.append('}');
            return sb.toString();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DecodeOptions{mode=");
        sb.append(this.mode);
        sb.append('}');
        return sb.toString();
    }
}
