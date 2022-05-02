package o;

public class isCaptioningEnabled {
    public boolean equals = false;
    public int getMax = 0;
    public int getMin = Integer.MIN_VALUE;
    public int isInside = 0;
    public int length = 0;
    public int setMax = Integer.MIN_VALUE;
    public int setMin = 0;
    public boolean toFloatRange = false;

    public final void setMin(int i, int i2) {
        this.getMin = i;
        this.setMax = i2;
        this.equals = true;
        if (this.toFloatRange) {
            if (i2 != Integer.MIN_VALUE) {
                this.setMin = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.getMax = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.setMin = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.getMax = i2;
        }
    }

    public final void getMin(int i, int i2) {
        this.equals = false;
        if (i != Integer.MIN_VALUE) {
            this.length = i;
            this.setMin = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.isInside = i2;
            this.getMax = i2;
        }
    }
}
