package o;

final class resolveClass implements RedDotDrawable {
    private final LocalCallManagerImpl length;

    public resolveClass(LocalCallManagerImpl localCallManagerImpl) {
        this.length = localCallManagerImpl;
    }

    public final Object apply(Object obj) {
        return this.length.apply(obj);
    }
}
