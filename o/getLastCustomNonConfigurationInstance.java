package o;

public final class getLastCustomNonConfigurationInstance {
    private static String toIntRange = "VelocityMatrix";
    public float IsOverlapping;
    public float getMax;
    public float getMin;
    public float length;
    public float setMax;
    public float setMin;

    public final void length(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.length;
        float f8 = f4 + this.setMin;
        float f9 = f7 + (this.getMin * f5);
        float f10 = f8 + (this.setMax * f6);
        float radians = (float) Math.toRadians((double) this.getMax);
        double d = (double) (((float) (-i3)) * f5);
        double radians2 = (double) ((float) Math.toRadians((double) this.IsOverlapping));
        double sin = Math.sin(radians2);
        Double.isNaN(d);
        double d2 = d * sin;
        double d3 = (double) (((float) i2) * f6);
        double cos = Math.cos(radians2);
        Double.isNaN(d3);
        float f11 = f9 + (((float) (d2 - (cos * d3))) * radians);
        double d4 = (double) (((float) i3) * f5);
        double cos2 = Math.cos(radians2);
        Double.isNaN(d4);
        double d5 = d4 * cos2;
        double sin2 = Math.sin(radians2);
        Double.isNaN(d3);
        fArr[0] = f11;
        fArr[1] = f10 + (radians * ((float) (d5 - (d3 * sin2))));
    }

    public final void length(removeOnContextAvailableListener removeoncontextavailablelistener, removeOnContextAvailableListener removeoncontextavailablelistener2, float f) {
        if (removeoncontextavailablelistener != null) {
            this.length = (float) removeoncontextavailablelistener.length.setMax(f);
        }
        if (removeoncontextavailablelistener2 != null) {
            this.setMin = (float) removeoncontextavailablelistener2.length.setMax(f);
        }
    }

    public final void setMin(removeOnContextAvailableListener removeoncontextavailablelistener, removeOnContextAvailableListener removeoncontextavailablelistener2, float f) {
        if (removeoncontextavailablelistener != null || removeoncontextavailablelistener2 != null) {
            if (removeoncontextavailablelistener == null) {
                this.getMin = (float) removeoncontextavailablelistener.length.setMax(f);
            }
            if (removeoncontextavailablelistener2 == null) {
                this.setMax = (float) removeoncontextavailablelistener2.length.setMax(f);
            }
        }
    }
}
