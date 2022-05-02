package o;

import o.b;

public final class access$1202 implements getAdapterPosition<readData> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public access$1202(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.userRepositoryProvider = bVar3;
    }

    public final readData get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.userRepositoryProvider.get());
    }

    public static access$1202 create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3) {
        return new access$1202(bVar, bVar2, bVar3);
    }

    public static readData newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite) {
        return new readData(appxloadfailed, getscheme, ondescriptorwrite);
    }
}
