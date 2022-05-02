package o;

final class setDiagnoseEnable implements RedDotDrawable {
    private final isInnerApp getMin;

    public setDiagnoseEnable(isInnerApp isinnerapp) {
        this.getMin = isinnerapp;
    }

    public final Object apply(Object obj) {
        return this.getMin.doForceLogout(((Boolean) obj).booleanValue());
    }
}
