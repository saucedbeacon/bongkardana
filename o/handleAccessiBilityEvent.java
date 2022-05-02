package o;

public final class handleAccessiBilityEvent {
    public String getMax;
    public String getMin;
    private String setMax;
    private int setMin = -1;

    handleAccessiBilityEvent(String str, String str2, String str3) {
        this.setMax = str;
        this.getMax = str2;
        this.getMin = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof handleAccessiBilityEvent)) {
            return false;
        }
        handleAccessiBilityEvent handleaccessibilityevent = (handleAccessiBilityEvent) obj;
        if (!this.setMax.equals(handleaccessibilityevent.setMax) || !this.getMax.equals(handleaccessibilityevent.getMax) || !this.getMin.equals(handleaccessibilityevent.getMin)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.setMin == -1) {
            this.setMin = (this.setMax.hashCode() ^ this.getMax.hashCode()) ^ this.getMin.hashCode();
        }
        return this.setMin;
    }
}
