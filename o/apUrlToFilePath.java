package o;

import o.b;

public final class apUrlToFilePath implements getAdapterPosition<copyToFile> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getCharsetName> pushNotificationRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public apUrlToFilePath(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCharsetName> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.pushNotificationRepositoryProvider = bVar3;
    }

    public final copyToFile get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.pushNotificationRepositoryProvider.get());
    }

    public static apUrlToFilePath create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCharsetName> bVar3) {
        return new apUrlToFilePath(bVar, bVar2, bVar3);
    }

    public static copyToFile newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCharsetName getcharsetname) {
        return new copyToFile(appxloadfailed, getscheme, getcharsetname);
    }
}
