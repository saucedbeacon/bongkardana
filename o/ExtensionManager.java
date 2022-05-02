package o;

final class ExtensionManager implements RedDotDrawable {
    private final setExtensionCreator getMin;

    public ExtensionManager(setExtensionCreator setextensioncreator) {
        this.getMin = setextensioncreator;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((ActionMeta) obj);
    }
}
