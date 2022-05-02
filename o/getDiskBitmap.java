package o;

import o.b;

public final class getDiskBitmap implements getAdapterPosition<getCharset> {
    private final b.C0007b<getMD5Byte> oauthRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getDiskBitmap(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.oauthRepositoryProvider = bVar3;
    }

    public final getCharset get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.oauthRepositoryProvider.get());
    }

    public static getDiskBitmap create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        return new getDiskBitmap(bVar, bVar2, bVar3);
    }

    public static getCharset newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getMD5Byte getmd5byte) {
        return new getCharset(appxloadfailed, getscheme, getmd5byte);
    }
}
