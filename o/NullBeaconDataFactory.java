package o;

import o.b;

public final class NullBeaconDataFactory implements getAdapterPosition<DataProviderException> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<AndroidModel> shortenerRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public NullBeaconDataFactory(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<AndroidModel> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.shortenerRepositoryProvider = bVar3;
    }

    public final DataProviderException get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.shortenerRepositoryProvider.get());
    }

    public static NullBeaconDataFactory create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<AndroidModel> bVar3) {
        return new NullBeaconDataFactory(bVar, bVar2, bVar3);
    }

    public static DataProviderException newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, AndroidModel androidModel) {
        return new DataProviderException(appxloadfailed, getscheme, androidModel);
    }
}
