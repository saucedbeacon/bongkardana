package o;

import o.b;

public final class tryLock implements getAdapterPosition<ProcessLock> {
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public tryLock(b.C0007b<UpdateAppCallback> bVar) {
        this.splitFacadeProvider = bVar;
    }

    public final ProcessLock get() {
        return newInstance(this.splitFacadeProvider.get());
    }

    public static tryLock create(b.C0007b<UpdateAppCallback> bVar) {
        return new tryLock(bVar);
    }

    public static ProcessLock newInstance(UpdateAppCallback updateAppCallback) {
        return new ProcessLock(updateAppCallback);
    }
}
