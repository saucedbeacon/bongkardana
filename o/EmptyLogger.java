package o;

import o.b;

public final class EmptyLogger implements getAdapterPosition<AbstractAndroidLogger> {
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;

    public EmptyLogger(b.C0007b<getResponseCode> bVar) {
        this.socialGeneralRepositoryProvider = bVar;
    }

    public final AbstractAndroidLogger get() {
        return newInstance(this.socialGeneralRepositoryProvider.get());
    }

    public static EmptyLogger create(b.C0007b<getResponseCode> bVar) {
        return new EmptyLogger(bVar);
    }

    public static AbstractAndroidLogger newInstance(getResponseCode getresponsecode) {
        return new AbstractAndroidLogger(getresponsecode);
    }
}
