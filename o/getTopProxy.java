package o;

import o.b;

public final class getTopProxy implements getAdapterPosition<postOnWorker> {
    private final b.C0007b<sendToRender> promoInfoEntityMapperProvider;

    public getTopProxy(b.C0007b<sendToRender> bVar) {
        this.promoInfoEntityMapperProvider = bVar;
    }

    public final postOnWorker get() {
        return newInstance(this.promoInfoEntityMapperProvider.get());
    }

    public static getTopProxy create(b.C0007b<sendToRender> bVar) {
        return new getTopProxy(bVar);
    }

    public static postOnWorker newInstance(sendToRender sendtorender) {
        return new postOnWorker(sendtorender);
    }
}
