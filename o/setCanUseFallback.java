package o;

final class setCanUseFallback implements RedDotDrawable {
    private final PackageQueryPoint getMax;

    public setCanUseFallback(PackageQueryPoint packageQueryPoint) {
        this.getMax = packageQueryPoint;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((attach) obj);
    }
}
