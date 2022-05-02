package id.dana.model;

/* renamed from: id.dana.model.$AutoValue_PopUpParcel  reason: invalid class name */
abstract class C$AutoValue_PopUpParcel extends PopUpParcel {
    private final String getMax;
    private final int getMin;
    private final int length;
    private final int setMax;
    private final int setMin;

    C$AutoValue_PopUpParcel(String str, int i, int i2, int i3, int i4) {
        if (str != null) {
            this.getMax = str;
            this.getMin = i;
            this.length = i2;
            this.setMin = i3;
            this.setMax = i4;
            return;
        }
        throw new NullPointerException("Null phoneNumber");
    }

    public final String length() {
        return this.getMax;
    }

    public final int setMin() {
        return this.getMin;
    }

    public final int getMax() {
        return this.length;
    }

    public final int getMin() {
        return this.setMin;
    }

    public final int setMax() {
        return this.setMax;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PopUpParcel{phoneNumber=");
        sb.append(this.getMax);
        sb.append(", activityNumber=");
        sb.append(this.getMin);
        sb.append(", otpCodeLength=");
        sb.append(this.length);
        sb.append(", retrySendSeconds=");
        sb.append(this.setMin);
        sb.append(", type=");
        sb.append(this.setMax);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PopUpParcel) {
            PopUpParcel popUpParcel = (PopUpParcel) obj;
            return this.getMax.equals(popUpParcel.length()) && this.getMin == popUpParcel.setMin() && this.length == popUpParcel.getMax() && this.setMin == popUpParcel.getMin() && this.setMax == popUpParcel.setMax();
        }
    }

    public int hashCode() {
        return ((((((((this.getMax.hashCode() ^ 1000003) * 1000003) ^ this.getMin) * 1000003) ^ this.length) * 1000003) ^ this.setMin) * 1000003) ^ this.setMax;
    }
}
