package o;

import o.b;

public final class getDomain implements getAdapterPosition<isDomainMatch> {
    private final b.C0007b<getMD5Byte> oauthRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getDomain(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.oauthRepositoryProvider = bVar3;
    }

    public final isDomainMatch get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.oauthRepositoryProvider.get());
    }

    public static getDomain create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getMD5Byte> bVar3) {
        return new getDomain(bVar, bVar2, bVar3);
    }

    public static isDomainMatch newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getMD5Byte getmd5byte) {
        return new isDomainMatch(appxloadfailed, getscheme, getmd5byte);
    }
}
