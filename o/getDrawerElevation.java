package o;

public abstract class getDrawerElevation<T> {
    protected int getMax;
    protected float getMin;
    protected int isInside;
    protected int length;
    public final float[] setMax;
    protected float setMin;

    public getDrawerElevation(int i) {
        this.length = 0;
        this.setMin = 1.0f;
        this.getMin = 1.0f;
        this.getMax = 0;
        this.isInside = 0;
        this.length = 0;
        this.setMax = new float[i];
    }

    public final void getMin() {
        this.length = 0;
    }

    public final void setMin(float f, float f2) {
        this.setMin = f;
        this.getMin = f2;
    }
}
