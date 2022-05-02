package o;

import o.b;

public final class shouldShowConsoleBtn implements getAdapterPosition<DebugPanelBridgeExtension> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<initConsoleView> merchantManagementEntityDataFactoryProvider;

    public shouldShowConsoleBtn(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<initConsoleView> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.merchantManagementEntityDataFactoryProvider = bVar5;
    }

    public final DebugPanelBridgeExtension get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.merchantManagementEntityDataFactoryProvider.get());
    }

    public static shouldShowConsoleBtn create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<initConsoleView> bVar5) {
        return new shouldShowConsoleBtn(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static DebugPanelBridgeExtension newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, initConsoleView initconsoleview) {
        return new DebugPanelBridgeExtension(dialogLayout, r8, backKeyDownPoint, getapplaunchparams, initconsoleview);
    }
}
