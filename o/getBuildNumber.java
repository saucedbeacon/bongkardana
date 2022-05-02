package o;

import o.APExpansion;
import o.b;

public final class getBuildNumber implements getAdapterPosition<getModel> {
    private final b.C0007b<APExpansion.AnonymousClass1> ioDispatcherProvider;
    private final b.C0007b<APExpansion.AnonymousClass1> mainDispatcherProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getRequestedModel> socialSyncRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getBuildNumber(b.C0007b<APExpansion.AnonymousClass1> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<getScheme> bVar4, b.C0007b<getRequestedModel> bVar5) {
        this.ioDispatcherProvider = bVar;
        this.mainDispatcherProvider = bVar2;
        this.threadExecutorProvider = bVar3;
        this.postExecutionThreadProvider = bVar4;
        this.socialSyncRepositoryProvider = bVar5;
    }

    public final getModel get() {
        return newInstance(this.ioDispatcherProvider.get(), this.mainDispatcherProvider.get(), this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.socialSyncRepositoryProvider.get());
    }

    public static getBuildNumber create(b.C0007b<APExpansion.AnonymousClass1> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<appxLoadFailed> bVar3, b.C0007b<getScheme> bVar4, b.C0007b<getRequestedModel> bVar5) {
        return new getBuildNumber(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static getModel newInstance(APExpansion.AnonymousClass1 r7, APExpansion.AnonymousClass1 r8, appxLoadFailed appxloadfailed, getScheme getscheme, getRequestedModel getrequestedmodel) {
        return new getModel(r7, r8, appxloadfailed, getscheme, getrequestedmodel);
    }
}
