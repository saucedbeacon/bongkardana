package o;

final class setLanguageAware implements RedDotDrawable {
    private final PackageQueryPoint getMax;

    public setLanguageAware(PackageQueryPoint packageQueryPoint) {
        this.getMax = packageQueryPoint;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((setTemplateConfig) obj);
    }
}
