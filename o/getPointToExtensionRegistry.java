package o;

final class getPointToExtensionRegistry implements RedDotDrawable {
    private final DefaultExtensionRegistry length;

    public getPointToExtensionRegistry(DefaultExtensionRegistry defaultExtensionRegistry) {
        this.length = defaultExtensionRegistry;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$initOfflinePay$5((String) obj);
    }
}
