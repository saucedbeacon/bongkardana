package o;

final class waitForHeight implements RedDotDrawable {
    private final getWidthAndHeight getMin;

    public waitForHeight(getWidthAndHeight getwidthandheight) {
        this.getMin = getwidthandheight;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((maybeSetTextColor) obj);
    }
}
