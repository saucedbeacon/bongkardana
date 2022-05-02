package o;

import o.b;

public final class setAction implements getAdapterPosition<setEventId> {
    private final b.C0007b<onCallBack> length;

    private setAction(b.C0007b<onCallBack> bVar) {
        this.length = bVar;
    }

    public static setAction length(b.C0007b<onCallBack> bVar) {
        return new setAction(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setEventId(this.length.get());
    }
}
