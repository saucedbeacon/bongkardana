package o;

import o.b;

public final class MonitoringData implements getAdapterPosition<fromBundle> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getResponseString> socialPrivacyRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;
    private final b.C0007b<onDescriptorWrite> userRepositoryProvider;

    public MonitoringData(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3, b.C0007b<getCommonResources> bVar4, b.C0007b<getResponseString> bVar5) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.userRepositoryProvider = bVar3;
        this.accountRepositoryProvider = bVar4;
        this.socialPrivacyRepositoryProvider = bVar5;
    }

    public final fromBundle get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.userRepositoryProvider.get(), this.accountRepositoryProvider.get(), this.socialPrivacyRepositoryProvider.get());
    }

    public static MonitoringData create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<onDescriptorWrite> bVar3, b.C0007b<getCommonResources> bVar4, b.C0007b<getResponseString> bVar5) {
        return new MonitoringData(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static fromBundle newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite, getCommonResources getcommonresources, getResponseString getresponsestring) {
        return new fromBundle(appxloadfailed, getscheme, ondescriptorwrite, getcommonresources, getresponsestring);
    }
}
