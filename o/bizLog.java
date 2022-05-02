package o;

import o.b;

public final class bizLog implements getAdapterPosition<region> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public bizLog(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final region get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static bizLog create(b.C0007b<UpdateAppCallback> bVar) {
        return new bizLog(bVar);
    }

    public static region newInstance(UpdateAppCallback updateAppCallback) {
        return new region(updateAppCallback);
    }
}
