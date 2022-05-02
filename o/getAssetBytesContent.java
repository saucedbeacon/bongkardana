package o;

import o.b;

public final class getAssetBytesContent implements getAdapterPosition<isSdkMatch> {
    private final b.C0007b<getMD5Byte> oauthRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getAssetBytesContent(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.oauthRepositoryProvider = bVar3;
    }

    public final isSdkMatch get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.oauthRepositoryProvider.get());
    }

    public static getAssetBytesContent create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        return new getAssetBytesContent(bVar, bVar2, bVar3);
    }

    public static isSdkMatch newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getMD5Byte getmd5byte) {
        return new isSdkMatch(appxloadfailed, getscheme, getmd5byte);
    }
}
