package o;

final class asUrl implements RedDotDrawable {
    private final PackageQueryPoint length;

    public asUrl(PackageQueryPoint packageQueryPoint) {
        this.length = packageQueryPoint;
    }

    public final Object apply(Object obj) {
        return this.length.transform((setStatus) obj);
    }
}
