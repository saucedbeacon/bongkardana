package o;

import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$96$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$97$1> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<ConsoleViewCreateCallback> networkProductEntityDataProvider;

    public com_alibaba_ariver_app_api_ExtOpt$96$1(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<ConsoleViewCreateCallback> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.networkProductEntityDataProvider = bVar5;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$97$1 get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.networkProductEntityDataProvider.get());
    }

    public static com_alibaba_ariver_app_api_ExtOpt$96$1 create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<ConsoleViewCreateCallback> bVar5) {
        return new com_alibaba_ariver_app_api_ExtOpt$96$1(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$97$1 newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, ConsoleViewCreateCallback consoleViewCreateCallback) {
        return new com_alibaba_ariver_app_api_ExtOpt$97$1(dialogLayout, r8, backKeyDownPoint, getapplaunchparams, consoleViewCreateCallback);
    }
}
