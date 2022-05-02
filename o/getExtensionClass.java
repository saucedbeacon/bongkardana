package o;

final class getExtensionClass implements RedDotDrawable {
    private final DefaultExtensionRegistry length;

    public getExtensionClass(DefaultExtensionRegistry defaultExtensionRegistry) {
        this.length = defaultExtensionRegistry;
    }

    public final Object apply(Object obj) {
        return this.length.lambda$start$6((String) obj);
    }
}
