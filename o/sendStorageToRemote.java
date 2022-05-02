package o;

import o.b;

public final class sendStorageToRemote implements getAdapterPosition<getTinyLocalStorageInfo> {
    private final b.C0007b<broadcastInvalidation> getMin;

    private sendStorageToRemote(b.C0007b<broadcastInvalidation> bVar) {
        this.getMin = bVar;
    }

    public static sendStorageToRemote getMin(b.C0007b<broadcastInvalidation> bVar) {
        return new sendStorageToRemote(bVar);
    }

    public final /* synthetic */ Object get() {
        return new getTinyLocalStorageInfo(this.getMin.get());
    }
}
