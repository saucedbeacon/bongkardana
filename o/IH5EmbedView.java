package o;

import o.b;

public final class IH5EmbedView implements getAdapterPosition<execJavaScript> {
    private final b.C0007b<onWebViewDestory> globalNetworkRepositoryProvider;

    public IH5EmbedView(b.C0007b<onWebViewDestory> bVar) {
        this.globalNetworkRepositoryProvider = bVar;
    }

    public final execJavaScript get() {
        return newInstance(this.globalNetworkRepositoryProvider.get());
    }

    public static IH5EmbedView create(b.C0007b<onWebViewDestory> bVar) {
        return new IH5EmbedView(bVar);
    }

    public static execJavaScript newInstance(onWebViewDestory onwebviewdestory) {
        return new execJavaScript(onwebviewdestory);
    }
}
