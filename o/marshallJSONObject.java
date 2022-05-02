package o;

final class marshallJSONObject implements RedDotDrawable {
    private final isNIOEnabled getMax;
    private final setAllowPduOverflow getMin;
    private final Boolean length;

    public marshallJSONObject(isNIOEnabled isnioenabled, setAllowPduOverflow setallowpduoverflow, Boolean bool) {
        this.getMax = isnioenabled;
        this.getMin = setallowpduoverflow;
        this.length = bool;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$nameCheck$4(this.getMin, this.length, (String) obj);
    }
}
