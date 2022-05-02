package o;

import o.b;

public final class SettingsData implements getAdapterPosition<StartRMData> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<applyChanges> sslPinningRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public SettingsData(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<applyChanges> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.sslPinningRepositoryProvider = bVar3;
    }

    public final StartRMData get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.sslPinningRepositoryProvider.get());
    }

    public static SettingsData create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<applyChanges> bVar3) {
        return new SettingsData(bVar, bVar2, bVar3);
    }

    public static StartRMData newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, applyChanges applychanges) {
        return new StartRMData(appxloadfailed, getscheme, applychanges);
    }
}
