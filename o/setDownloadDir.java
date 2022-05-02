package o;

import o.NetworkUtil;
import o.b;

public final class setDownloadDir implements getAdapterPosition<addDownload> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<onFinish> riskServicesConfigEntityDataFactoryProvider;
    private final b.C0007b<NetworkUtil.AnonymousClass1> sendRiskEventEntityDataFactoryProvider;

    public setDownloadDir(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<NetworkUtil.AnonymousClass1> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<onFinish> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.sendRiskEventEntityDataFactoryProvider = bVar4;
        this.errorConfigFactoryProvider = bVar5;
        this.riskServicesConfigEntityDataFactoryProvider = bVar6;
    }

    public final addDownload get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.sendRiskEventEntityDataFactoryProvider.get(), this.errorConfigFactoryProvider.get(), this.riskServicesConfigEntityDataFactoryProvider.get());
    }

    public static setDownloadDir create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<NetworkUtil.AnonymousClass1> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<onFinish> bVar6) {
        return new setDownloadDir(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static addDownload newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, NetworkUtil.AnonymousClass1 r11, getAppLaunchParams getapplaunchparams, onFinish onfinish) {
        return new addDownload(dialogLayout, r9, backKeyDownPoint, r11, getapplaunchparams, onfinish);
    }
}
