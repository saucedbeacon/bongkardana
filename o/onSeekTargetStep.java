package o;

public final class onSeekTargetStep {
    public final String getMax;
    public final validateChildOrder getMin;
    public final String length;
    public final Class<?> setMin;

    public onSeekTargetStep(String str, Class<?> cls, validateChildOrder validatechildorder, String str2) {
        this.length = str;
        this.setMin = cls;
        this.getMin = validatechildorder;
        this.getMax = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[PropertyDescription ");
        sb.append(this.length);
        sb.append(",");
        sb.append(this.setMin);
        sb.append(", ");
        sb.append(this.getMin);
        sb.append("/");
        sb.append(this.getMax);
        sb.append("]");
        return sb.toString();
    }
}
