package o;

final class serialize implements RedDotDrawable {
    private final DefaultExtensionRegistry getMin;
    private final String setMin;

    public serialize(DefaultExtensionRegistry defaultExtensionRegistry, String str) {
        this.getMin = defaultExtensionRegistry;
        this.setMin = str;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$setSeedExtra$8(this.setMin, (String) obj);
    }
}
