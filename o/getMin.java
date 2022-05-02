package o;

public final class getMin {
    public int[] FastBitmap$CoordinateSystem = new int[256];
    public getMax IsOverlapping = new getMax(0, 255);
    public int[] equals = new int[256];
    public getMax getMax = new getMax(0, 255);
    public getMax getMin = new getMax(0, 255);
    public getMax isInside = new getMax(0, 255);
    public getMax length = new getMax(0, 255);
    public getMax setMax = new getMax(0, 255);
    public getMax setMin = new getMax(0, 255);
    public int[] toFloatRange = new int[256];
    public getMax toIntRange = new getMax(0, 255);
    public int[] toString = new int[256];

    public static void setMin(getMax getmax, getMax getmax2, int[] iArr) {
        double d;
        int i;
        double d2 = 0.0d;
        if (getmax.getMax() != getmax.getMin()) {
            double max = (double) (getmax2.getMax() - getmax2.getMin());
            double max2 = (double) (getmax.getMax() - getmax.getMin());
            Double.isNaN(max);
            Double.isNaN(max2);
            d2 = max / max2;
            double min = (double) getmax2.getMin();
            double min2 = (double) getmax.getMin();
            Double.isNaN(min2);
            Double.isNaN(min);
            d = min - (min2 * d2);
        } else {
            d = 0.0d;
        }
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 >= getmax.getMax()) {
                i = getmax2.getMax();
            } else if (i2 <= getmax.getMin()) {
                i = getmax2.getMin();
            } else {
                double d3 = (double) i2;
                Double.isNaN(d3);
                i = (int) ((d3 * d2) + d);
            }
            iArr[i2] = i;
        }
    }
}
