package o;

public final class writeToParcel {
    public final requestChildFocus setMax;
    public final pageScroll setMin;

    public writeToParcel(pageScroll pagescroll, requestChildFocus requestchildfocus) {
        this.setMin = pagescroll;
        this.setMax = requestchildfocus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            writeToParcel writetoparcel = (writeToParcel) obj;
            return this.setMin.equals(writetoparcel.setMin) && this.setMax.equals(writetoparcel.setMax);
        }
    }

    public final int hashCode() {
        return (this.setMin.hashCode() * 31) + this.setMax.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PropertyHandle{ mTransitionId='");
        sb.append(this.setMin);
        sb.append("', mProperty=");
        sb.append(this.setMax);
        sb.append("}");
        return sb.toString();
    }
}
