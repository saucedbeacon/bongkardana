package o;

public final class onCanceled extends onForceLoad {
    public final int length;
    public final int setMin;

    public onCanceled(int i, int i2, int i3) {
        super(((long) (i2 ^ i)) << 32, i3);
        this.setMin = i;
        this.length = i2;
    }
}
