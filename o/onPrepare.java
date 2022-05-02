package o;

import o.b;

public final class onPrepare implements getAdapterPosition<onFinish> {
    private final b.C0007b<handleMessage> amcsConfigEntityDataProvider;

    public onPrepare(b.C0007b<handleMessage> bVar) {
        this.amcsConfigEntityDataProvider = bVar;
    }

    public final onFinish get() {
        return newInstance(this.amcsConfigEntityDataProvider.get());
    }

    public static onPrepare create(b.C0007b<handleMessage> bVar) {
        return new onPrepare(bVar);
    }

    public static onFinish newInstance(handleMessage handlemessage) {
        return new onFinish(handlemessage);
    }
}
