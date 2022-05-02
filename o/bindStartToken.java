package o;

import o.b;

public final class bindStartToken implements getAdapterPosition<onNodeExit> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public bindStartToken(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final onNodeExit get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static bindStartToken create(b.C0007b<UpdateAppCallback> bVar) {
        return new bindStartToken(bVar);
    }

    public static onNodeExit newInstance(UpdateAppCallback updateAppCallback) {
        return new onNodeExit(updateAppCallback);
    }
}
