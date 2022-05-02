package o;

import o.b;

public final class serializ implements getAdapterPosition<setLocalCallRetryHandler> {
    private final b.C0007b<deserializ> localPromoCenterEntityDataProvider;
    private final b.C0007b<RVEvents> networkPromoCenterEntityDataProvider;

    public serializ(b.C0007b<RVEvents> bVar, b.C0007b<deserializ> bVar2) {
        this.networkPromoCenterEntityDataProvider = bVar;
        this.localPromoCenterEntityDataProvider = bVar2;
    }

    public final setLocalCallRetryHandler get() {
        return newInstance(this.networkPromoCenterEntityDataProvider.get(), this.localPromoCenterEntityDataProvider.get());
    }

    public static serializ create(b.C0007b<RVEvents> bVar, b.C0007b<deserializ> bVar2) {
        return new serializ(bVar, bVar2);
    }

    public static setLocalCallRetryHandler newInstance(RVEvents rVEvents, deserializ deserializ) {
        return new setLocalCallRetryHandler(rVEvents, deserializ);
    }
}
