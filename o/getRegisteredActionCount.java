package o;

final class getRegisteredActionCount implements RedDotManager {
    private final DefaultExtensionRegistry setMin;

    public getRegisteredActionCount(DefaultExtensionRegistry defaultExtensionRegistry) {
        this.setMin = defaultExtensionRegistry;
    }

    public final void accept(Object obj) {
        this.setMin.lambda$init$0((String) obj);
    }
}
