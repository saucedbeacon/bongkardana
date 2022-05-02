package o;

import id.dana.danah5.httprequest.HttpRequestExtension;
import o.b;

public final class setCanceledOnTouchOutside implements getAdapterPosition<HttpRequestExtension> {
    private final b.C0007b<onScroll> rpcProxyProvider;
    private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

    public setCanceledOnTouchOutside(b.C0007b<onScroll> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        this.rpcProxyProvider = bVar;
        this.splitFacadeProvider = bVar2;
    }

    public final HttpRequestExtension get() {
        return newInstance(this.rpcProxyProvider.get(), this.splitFacadeProvider.get());
    }

    public static setCanceledOnTouchOutside create(b.C0007b<onScroll> bVar, b.C0007b<UpdateAppCallback> bVar2) {
        return new setCanceledOnTouchOutside(bVar, bVar2);
    }

    public static HttpRequestExtension newInstance(onScroll onscroll, UpdateAppCallback updateAppCallback) {
        return new HttpRequestExtension(onscroll, updateAppCallback);
    }
}
