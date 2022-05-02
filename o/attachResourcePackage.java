package o;

final class attachResourcePackage implements RedDotDrawable {
    private final ResolveExtensionInvoker setMin;

    public attachResourcePackage(ResolveExtensionInvoker resolveExtensionInvoker) {
        this.setMin = resolveExtensionInvoker;
    }

    public final Object apply(Object obj) {
        return this.setMin.saveDanaUserContact((String) obj);
    }
}
