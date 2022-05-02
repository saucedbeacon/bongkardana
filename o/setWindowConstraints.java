package o;

final class setWindowConstraints implements RedDotManager {
    private final getThemeRes getMin;

    public setWindowConstraints(getThemeRes getthemeres) {
        this.getMin = getthemeres;
    }

    public final void accept(Object obj) {
        getThemeRes.getMax(this.getMin, (Boolean) obj);
    }
}
