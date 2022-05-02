package o;

import o.b;

public final class doInstall implements getAdapterPosition<getSHA1> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getCharsetName> pushNotificationRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public doInstall(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCharsetName> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.pushNotificationRepositoryProvider = bVar3;
    }

    public final getSHA1 get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.pushNotificationRepositoryProvider.get());
    }

    public static doInstall create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCharsetName> bVar3) {
        return new doInstall(bVar, bVar2, bVar3);
    }

    public static getSHA1 newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCharsetName getcharsetname) {
        return new getSHA1(appxloadfailed, getscheme, getcharsetname);
    }
}
