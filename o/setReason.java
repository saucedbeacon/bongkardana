package o;

import o.CreatePromptParam;
import o.b;

public final class setReason implements getAdapterPosition<Event$1> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<CreatePromptParam.PositiveListener> geocodeEntityRepositoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<Event$Stub> mapperProvider;
    private final b.C0007b<incrementRef> referralEntityDataFactoryProvider;

    public setReason(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<Event$Stub> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<CreatePromptParam.PositiveListener> bVar6, b.C0007b<incrementRef> bVar7, b.C0007b<onCallBack> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.mapperProvider = bVar4;
        this.errorConfigFactoryProvider = bVar5;
        this.geocodeEntityRepositoryProvider = bVar6;
        this.referralEntityDataFactoryProvider = bVar7;
        this.configEntityDataFactoryProvider = bVar8;
    }

    public final Event$1 get() {
        Event$1 newInstance = newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get());
        getReason.injectInjectDataFactory(newInstance, this.geocodeEntityRepositoryProvider.get(), this.referralEntityDataFactoryProvider.get(), this.configEntityDataFactoryProvider.get());
        return newInstance;
    }

    public static setReason create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<Event$Stub> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<CreatePromptParam.PositiveListener> bVar6, b.C0007b<incrementRef> bVar7, b.C0007b<onCallBack> bVar8) {
        return new setReason(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static Event$1 newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, Event$Stub event$Stub, getAppLaunchParams getapplaunchparams) {
        return new Event$1(dialogLayout, r8, backKeyDownPoint, event$Stub, getapplaunchparams);
    }
}
