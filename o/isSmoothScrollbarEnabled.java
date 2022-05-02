package o;

public final class isSmoothScrollbarEnabled extends setSmoothScrollbarEnabled implements scrollVerticallyBy {
    public String setMax = "*";

    public final void setMin(String str) throws IllegalArgumentException {
        if (str != null) {
            this.setMax = str;
            return;
        }
        throw new IllegalArgumentException("http resource descriptor must not be null");
    }

    public final String setMin() {
        return this.setMax;
    }
}
