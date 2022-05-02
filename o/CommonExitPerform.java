package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.CommonBackPerform;
import o.b;

public final class CommonExitPerform implements getAdapterPosition<setGoBackCallback> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<needCheckDslError> factoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<CommonBackPerform.AnonymousClass2> notificationCenterMapperProvider;

    @Singleton
    public class CollectJsApiHandler extends uncheckItems<handleCollectedApi> {
        private final IEmbedPerformanceReporter networkPushNotificationEntityData;

        @Inject
        public CollectJsApiHandler(IEmbedPerformanceReporter iEmbedPerformanceReporter) {
            this.networkPushNotificationEntityData = iEmbedPerformanceReporter;
        }

        public handleCollectedApi createData(String str) {
            return this.networkPushNotificationEntityData;
        }
    }

    public CommonExitPerform(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<needCheckDslError> bVar4, b.C0007b<CommonBackPerform.AnonymousClass2> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.factoryProvider = bVar4;
        this.notificationCenterMapperProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
    }

    public final setGoBackCallback get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.factoryProvider.get(), this.notificationCenterMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static CommonExitPerform create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<needCheckDslError> bVar4, b.C0007b<CommonBackPerform.AnonymousClass2> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        return new CommonExitPerform(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static setGoBackCallback newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, needCheckDslError needcheckdslerror, CommonBackPerform.AnonymousClass2 r12, getAppLaunchParams getapplaunchparams) {
        return new setGoBackCallback(dialogLayout, r9, backKeyDownPoint, needcheckdslerror, r12, getapplaunchparams);
    }
}
