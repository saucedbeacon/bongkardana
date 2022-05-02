package o;

import o.b;

public final class params implements getAdapterPosition<getCallMode> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public params(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final getCallMode get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static params create(b.C0007b<UpdateAppCallback> bVar) {
        return new params(bVar);
    }

    public static getCallMode newInstance(UpdateAppCallback updateAppCallback) {
        return new getCallMode(updateAppCallback);
    }
}
