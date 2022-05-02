package o;

import o.AppUpdaterFactory;
import o.b;

public final class getPackageBrief implements getAdapterPosition<registerRule> {
    private final b.C0007b<unRegisterRule> mockSyncContactEntityDataProvider;
    private final b.C0007b<AppUpdaterFactory.Rule> networkSyncContactEntityDataProvider;
    private final b.C0007b<AppUpdaterFactory> preferencesSyncContactEntityDataProvider;

    public getPackageBrief(b.C0007b<AppUpdaterFactory> bVar, b.C0007b<AppUpdaterFactory.Rule> bVar2, b.C0007b<unRegisterRule> bVar3) {
        this.preferencesSyncContactEntityDataProvider = bVar;
        this.networkSyncContactEntityDataProvider = bVar2;
        this.mockSyncContactEntityDataProvider = bVar3;
    }

    public final registerRule get() {
        return newInstance(this.preferencesSyncContactEntityDataProvider.get(), this.networkSyncContactEntityDataProvider.get(), this.mockSyncContactEntityDataProvider.get());
    }

    public static getPackageBrief create(b.C0007b<AppUpdaterFactory> bVar, b.C0007b<AppUpdaterFactory.Rule> bVar2, b.C0007b<unRegisterRule> bVar3) {
        return new getPackageBrief(bVar, bVar2, bVar3);
    }

    public static registerRule newInstance(AppUpdaterFactory appUpdaterFactory, AppUpdaterFactory.Rule rule, unRegisterRule unregisterrule) {
        return new registerRule(appUpdaterFactory, rule, unregisterrule);
    }
}
