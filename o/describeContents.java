package o;

public final class describeContents {
    public final writeToParcel getMin;
    public final float length;

    public describeContents(writeToParcel writetoparcel, float f) {
        this.getMin = writetoparcel;
        this.length = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            describeContents describecontents = (describeContents) obj;
            return Float.compare(describecontents.length, this.length) == 0 && this.getMin.equals(describecontents.getMin);
        }
    }

    public final int hashCode() {
        int hashCode = this.getMin.hashCode() * 31;
        float f = this.length;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PropertyAnimation{ PropertyHandle=");
        sb.append(this.getMin);
        sb.append(", TargetValue=");
        sb.append(this.length);
        sb.append("}");
        return sb.toString();
    }
}
