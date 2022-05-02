package o;

final class scaleBitmap implements RedDotDrawable {
    private final px2sp setMin;

    public scaleBitmap(px2sp px2sp) {
        this.setMin = px2sp;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
