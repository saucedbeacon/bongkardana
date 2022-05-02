package o;

import o.b;

public final class SecurityGuardUtils implements getAdapterPosition<getSecurityExtraData> {
    private final b.C0007b<containsRelativeParentPath> ottRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public SecurityGuardUtils(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<containsRelativeParentPath> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.ottRepositoryProvider = bVar3;
    }

    public final getSecurityExtraData get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.ottRepositoryProvider.get());
    }

    public static SecurityGuardUtils create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<containsRelativeParentPath> bVar3) {
        return new SecurityGuardUtils(bVar, bVar2, bVar3);
    }

    public static getSecurityExtraData newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, containsRelativeParentPath containsrelativeparentpath) {
        return new getSecurityExtraData(appxloadfailed, getscheme, containsrelativeparentpath);
    }
}
