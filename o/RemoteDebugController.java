package o;

import o.DataChannel;
import o.LocalAuthPermissionManager;
import o.addAnimatorUpdateListener;
import o.b;

public final class RemoteDebugController implements getAdapterPosition<RDConstant> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<setPageLoaded> generateLinkEntityDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<DefaultAuthenticationProxyImpl> splitBillDetailResultMapperProvider;
    private final b.C0007b<hasPermissionOnScheme> splitBillDetailToSplitBillHistoryEntityMapperProvider;
    private final b.C0007b<onConnectError> splitBillEntityDataFactoryProvider;
    private final b.C0007b<LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1> splitBillHistoriesMapperProvider;
    private final b.C0007b<setOnConfirmClickListener> splitBillHistoryEntitiesMapperProvider;

    final class RemoteDebugExitClickListener implements addAnimatorUpdateListener.getMax {
        private final DataChannel.DataStatusChangedListener setMin;

        public RemoteDebugExitClickListener(DataChannel.DataStatusChangedListener dataStatusChangedListener) {
            this.setMin = dataStatusChangedListener;
        }

        public final Object processFacade(Object obj) {
            return ((onSocketMessage) obj).getSplitBillDetail(this.setMin);
        }
    }

    public RemoteDebugController(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<onConnectError> bVar5, b.C0007b<LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1> bVar6, b.C0007b<setOnConfirmClickListener> bVar7, b.C0007b<DefaultAuthenticationProxyImpl> bVar8, b.C0007b<hasPermissionOnScheme> bVar9, b.C0007b<setPageLoaded> bVar10) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.splitBillEntityDataFactoryProvider = bVar5;
        this.splitBillHistoriesMapperProvider = bVar6;
        this.splitBillHistoryEntitiesMapperProvider = bVar7;
        this.splitBillDetailResultMapperProvider = bVar8;
        this.splitBillDetailToSplitBillHistoryEntityMapperProvider = bVar9;
        this.generateLinkEntityDataFactoryProvider = bVar10;
    }

    public final RDConstant get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.splitBillEntityDataFactoryProvider.get(), this.splitBillHistoriesMapperProvider.get(), this.splitBillHistoryEntitiesMapperProvider.get(), this.splitBillDetailResultMapperProvider.get(), this.splitBillDetailToSplitBillHistoryEntityMapperProvider.get(), this.generateLinkEntityDataFactoryProvider.get());
    }

    public static RemoteDebugController create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<onConnectError> bVar5, b.C0007b<LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1> bVar6, b.C0007b<setOnConfirmClickListener> bVar7, b.C0007b<DefaultAuthenticationProxyImpl> bVar8, b.C0007b<hasPermissionOnScheme> bVar9, b.C0007b<setPageLoaded> bVar10) {
        return new RemoteDebugController(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public static RDConstant newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r13, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, onConnectError onconnecterror, LocalAuthPermissionManager.AnonymousClass2.AnonymousClass1 r17, setOnConfirmClickListener setonconfirmclicklistener, DefaultAuthenticationProxyImpl defaultAuthenticationProxyImpl, hasPermissionOnScheme haspermissiononscheme, setPageLoaded setpageloaded) {
        return new RDConstant(dialogLayout, r13, backKeyDownPoint, getapplaunchparams, onconnecterror, r17, setonconfirmclicklistener, defaultAuthenticationProxyImpl, haspermissiononscheme, setpageloaded);
    }
}
