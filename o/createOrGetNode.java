package o;

import o.b;

public final class createOrGetNode implements getAdapterPosition<unBindStartToken> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public createOrGetNode(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final unBindStartToken get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static createOrGetNode create(b.C0007b<UpdateAppCallback> bVar) {
        return new createOrGetNode(bVar);
    }

    public static unBindStartToken newInstance(UpdateAppCallback updateAppCallback) {
        return new unBindStartToken(updateAppCallback);
    }
}
