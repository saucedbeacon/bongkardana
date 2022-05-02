package o;

import o.b;

public final class APWebMessagePort implements getAdapterPosition<APWebResourceRequest> {
    private final b.C0007b<setSupportZoom> deepLinkRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public final class APWebMessageCallback implements getAdapterPosition<onMessage> {
        private final b.C0007b<setSupportZoom> deepLinkRepositoryProvider;
        private final b.C0007b<getScheme> postExecutionThreadProvider;
        private final b.C0007b<appxLoadFailed> threadExecutorProvider;

        public APWebMessageCallback(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
            this.threadExecutorProvider = bVar;
            this.postExecutionThreadProvider = bVar2;
            this.deepLinkRepositoryProvider = bVar3;
        }

        public final onMessage get() {
            return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.deepLinkRepositoryProvider.get());
        }

        public static APWebMessageCallback create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
            return new APWebMessageCallback(bVar, bVar2, bVar3);
        }

        public static onMessage newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setSupportZoom setsupportzoom) {
            return new onMessage(appxloadfailed, getscheme, setsupportzoom);
        }
    }

    public APWebMessagePort(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.deepLinkRepositoryProvider = bVar3;
    }

    public final APWebResourceRequest get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.deepLinkRepositoryProvider.get());
    }

    public static APWebMessagePort create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setSupportZoom> bVar3) {
        return new APWebMessagePort(bVar, bVar2, bVar3);
    }

    public static APWebResourceRequest newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setSupportZoom setsupportzoom) {
        return new APWebResourceRequest(appxloadfailed, getscheme, setsupportzoom);
    }
}
