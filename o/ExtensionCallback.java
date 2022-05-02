package o;

final class ExtensionCallback implements RedDotDrawable {
    private final setExtensionCreator getMax;

    public ExtensionCallback(setExtensionCreator setextensioncreator) {
        this.getMax = setextensioncreator;
    }

    public final Object apply(Object obj) {
        return this.getMax.transform((ActionMeta) obj);
    }
}
