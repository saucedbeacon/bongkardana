package o;

import o.InitParams;

final class getSpmMonitor {
    int getMax;
    int getMin;
    private boolean isInside;
    InitParams.AnonymousClass1 length;
    int setMax;
    int setMin;

    public getSpmMonitor(int i, boolean z, int i2, int i3, int i4, InitParams.AnonymousClass1 r6) {
        this.setMin = i;
        this.isInside = z;
        this.getMin = i2;
        this.setMax = i3;
        this.getMax = i4;
        this.length = r6;
    }

    public final boolean setMin() {
        return this.isInside;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleKey - tokenNumber=");
        sb.append(this.setMin);
        sb.append(" required=");
        sb.append(this.isInside);
        sb.append(" index=");
        sb.append(this.getMin);
        sb.append(" line=");
        sb.append(this.setMax);
        sb.append(" column=");
        sb.append(this.getMax);
        return sb.toString();
    }
}
