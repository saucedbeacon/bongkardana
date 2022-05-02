package o;

import android.graphics.Paint;

public abstract class isCancelable extends onDestroyView {
    protected Paint equals;
    protected Paint getMax;
    protected Paint getMin;
    protected Paint length;
    protected getActivity setMax;
    protected getDrawerLockMode setMin;

    public isCancelable(setTargetFragment settargetfragment, getActivity getactivity, getDrawerLockMode getdrawerlockmode) {
        super(settargetfragment);
        this.setMax = getactivity;
        this.setMin = getdrawerlockmode;
        if (this.invokeSuspend != null) {
            this.getMax = new Paint(1);
            Paint paint = new Paint();
            this.length = paint;
            paint.setColor(-7829368);
            this.length.setStrokeWidth(1.0f);
            this.length.setStyle(Paint.Style.STROKE);
            this.length.setAlpha(90);
            Paint paint2 = new Paint();
            this.getMin = paint2;
            paint2.setColor(-16777216);
            this.getMin.setStrokeWidth(1.0f);
            this.getMin.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint(1);
            this.equals = paint3;
            paint3.setStyle(Paint.Style.STROKE);
        }
    }

    public final Paint setMax() {
        return this.getMax;
    }

    public void getMax(float f, float f2, boolean z) {
        double d;
        if (this.invokeSuspend != null && this.invokeSuspend.IsOverlapping() > 10.0f && !this.invokeSuspend.b()) {
            getActivity getactivity = this.setMax;
            float isInside = this.invokeSuspend.isInside();
            float intRange = this.invokeSuspend.toIntRange();
            isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
            getactivity.length(isInside, intRange, min);
            getActivity getactivity2 = this.setMax;
            float isInside2 = this.invokeSuspend.isInside();
            float floatRange = this.invokeSuspend.toFloatRange();
            isStateSaved min2 = isStateSaved.getMin(0.0d, 0.0d);
            getactivity2.length(isInside2, floatRange, min2);
            if (!z) {
                f = (float) min2.getMin;
                d = min.getMin;
            } else {
                f = (float) min.getMin;
                d = min2.getMin;
            }
            f2 = (float) d;
            isStateSaved.getMax(min);
            isStateSaved.getMax(min2);
        }
        length(f, f2);
    }

    /* access modifiers changed from: protected */
    public void length(float f, float f2) {
        double d;
        double d2;
        float f3 = f;
        float f4 = f2;
        int i = this.setMin.IsOverlapping;
        double abs = (double) Math.abs(f4 - f3);
        if (i == 0 || abs <= 0.0d || Double.isInfinite(abs)) {
            this.setMin.toIntRange = new float[0];
            this.setMin.toFloatRange = new float[0];
            this.setMin.isInside = 0;
            return;
        }
        double d3 = (double) i;
        Double.isNaN(abs);
        Double.isNaN(d3);
        double min = (double) getTargetFragment.setMin(abs / d3);
        if (this.setMin.toIntRange() && min < ((double) this.setMin.IsOverlapping())) {
            min = (double) this.setMin.IsOverlapping();
        }
        double min2 = (double) getTargetFragment.setMin(Math.pow(10.0d, (double) ((int) Math.log10(min))));
        Double.isNaN(min2);
        if (((int) (min / min2)) > 5) {
            Double.isNaN(min2);
            min = Math.floor(min2 * 10.0d);
        }
        int min3 = this.setMin.getMin();
        if (this.setMin.equals()) {
            min = (double) (((float) abs) / ((float) (i - 1)));
            this.setMin.isInside = i;
            if (this.setMin.toIntRange.length < i) {
                this.setMin.toIntRange = new float[i];
            }
            for (int i2 = 0; i2 < i; i2++) {
                this.setMin.toIntRange[i2] = f3;
                double d4 = (double) f3;
                Double.isNaN(d4);
                Double.isNaN(min);
                f3 = (float) (d4 + min);
            }
        } else {
            if (min == 0.0d) {
                d = 0.0d;
            } else {
                double d5 = (double) f3;
                Double.isNaN(d5);
                d = Math.ceil(d5 / min) * min;
            }
            if (this.setMin.getMin()) {
                d -= min;
            }
            if (min == 0.0d) {
                d2 = 0.0d;
            } else {
                double d6 = (double) f4;
                Double.isNaN(d6);
                d2 = getTargetFragment.getMax(Math.floor(d6 / min) * min);
            }
            if (min != 0.0d) {
                for (double d7 = d; d7 <= d2; d7 += min) {
                    min3++;
                }
            }
            this.setMin.isInside = min3;
            if (this.setMin.toIntRange.length < min3) {
                this.setMin.toIntRange = new float[min3];
            }
            for (int i3 = 0; i3 < min3; i3++) {
                if (d == 0.0d) {
                    d = 0.0d;
                }
                this.setMin.toIntRange[i3] = (float) d;
                d += min;
            }
            i = min3;
        }
        if (min < 1.0d) {
            this.setMin.equals = (int) Math.ceil(-Math.log10(min));
        } else {
            this.setMin.equals = 0;
        }
        if (this.setMin.getMin()) {
            if (this.setMin.toFloatRange.length < i) {
                this.setMin.toFloatRange = new float[i];
            }
            float f5 = ((float) min) / 2.0f;
            for (int i4 = 0; i4 < i; i4++) {
                this.setMin.toFloatRange[i4] = this.setMin.toIntRange[i4] + f5;
            }
        }
    }
}
