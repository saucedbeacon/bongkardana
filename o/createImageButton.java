package o;

import androidx.annotation.RestrictTo;
import o.createEditText;

public final class createImageButton {
    private final createEditText.setMin IsOverlapping = new createEditText.setMin();
    private double equals;
    double getMax;
    public double getMin = 0.5d;
    private double isInside;
    public boolean length = false;
    public double setMax = Math.sqrt(1500.0d);
    double setMin;
    public double toFloatRange = Double.MAX_VALUE;
    private double toIntRange;

    public createImageButton() {
    }

    public createImageButton(float f) {
        this.toFloatRange = (double) f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean setMax(float f, float f2) {
        return ((double) Math.abs(f2)) < this.getMax && ((double) Math.abs(f - ((float) this.toFloatRange))) < this.setMin;
    }

    private void length() {
        if (!this.length) {
            if (this.toFloatRange != Double.MAX_VALUE) {
                double d = this.getMin;
                if (d > 1.0d) {
                    double d2 = this.setMax;
                    this.equals = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                    double d3 = this.getMin;
                    double d4 = this.setMax;
                    this.isInside = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.toIntRange = this.setMax * Math.sqrt(1.0d - (d * d));
                }
                this.length = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* access modifiers changed from: package-private */
    public final createEditText.setMin getMin(double d, double d2, long j) {
        double d3;
        double d4;
        length();
        double d5 = (double) j;
        Double.isNaN(d5);
        double d6 = d5 / 1000.0d;
        double d7 = d - this.toFloatRange;
        double d8 = this.getMin;
        if (d8 > 1.0d) {
            double d9 = this.isInside;
            double d10 = this.equals;
            double d11 = d7 - (((d9 * d7) - d2) / (d9 - d10));
            double d12 = ((d7 * d9) - d2) / (d9 - d10);
            d4 = (Math.pow(2.718281828459045d, d9 * d6) * d11) + (Math.pow(2.718281828459045d, this.equals * d6) * d12);
            double d13 = this.isInside;
            double pow = d11 * d13 * Math.pow(2.718281828459045d, d13 * d6);
            double d14 = this.equals;
            d3 = pow + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d6));
        } else if (d8 == 1.0d) {
            double d15 = this.setMax;
            double d16 = d2 + (d15 * d7);
            double d17 = d7 + (d16 * d6);
            d4 = Math.pow(2.718281828459045d, (-d15) * d6) * d17;
            double pow2 = d17 * Math.pow(2.718281828459045d, (-this.setMax) * d6);
            double d18 = this.setMax;
            d3 = (d16 * Math.pow(2.718281828459045d, (-d18) * d6)) + (pow2 * (-d18));
        } else {
            double d19 = 1.0d / this.toIntRange;
            double d20 = this.setMax;
            double d21 = d19 * ((d8 * d20 * d7) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d8) * d20 * d6) * ((Math.cos(this.toIntRange * d6) * d7) + (Math.sin(this.toIntRange * d6) * d21));
            double d22 = this.setMax;
            double d23 = this.getMin;
            double d24 = (-d22) * pow3 * d23;
            double pow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d6);
            double d25 = this.toIntRange;
            double d26 = pow3;
            double sin = (-d25) * d7 * Math.sin(d25 * d6);
            double d27 = this.toIntRange;
            d3 = d24 + (pow4 * (sin + (d21 * d27 * Math.cos(d27 * d6))));
            d4 = d26;
        }
        this.IsOverlapping.setMax = (float) (d4 + this.toFloatRange);
        this.IsOverlapping.getMin = (float) d3;
        return this.IsOverlapping;
    }
}
