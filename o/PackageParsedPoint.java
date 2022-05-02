package o;

final class PackageParsedPoint implements RedDotDrawable {
    private final defaultPlatform length;

    public PackageParsedPoint(defaultPlatform defaultplatform) {
        this.length = defaultplatform;
    }

    public final Object apply(Object obj) {
        return this.length.apply(obj);
    }
}
