package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;
import o.b;

public final class RVTabbarLayout implements getAdapterPosition<setTabListener> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<addCheckedState> lazadaRegistrationUrlEntityDataFactoryProvider;
    private final b.C0007b<getTabSize> lazadaRegistrationUrlMapperProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getOrigin> userConfigEntityRepositoryProvider;

    public final class Listener extends onConnectedSuccessful<getAbsoluteUrl> {
        private static final String FEATURE_SYNC_LAZADA_CONSENT = "feature_sync_lazada_user_consent";

        public Listener(getAbsoluteUrl getabsoluteurl) {
            super(UserConfigBizTypeConstant.CONFIG_LAZADA_JKT_CONSENT, FEATURE_SYNC_LAZADA_CONSENT, getabsoluteurl);
        }
    }

    public RVTabbarLayout(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<addCheckedState> bVar6, b.C0007b<getTabSize> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.userConfigEntityRepositoryProvider = bVar5;
        this.lazadaRegistrationUrlEntityDataFactoryProvider = bVar6;
        this.lazadaRegistrationUrlMapperProvider = bVar7;
    }

    public final setTabListener get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.userConfigEntityRepositoryProvider.get(), this.lazadaRegistrationUrlEntityDataFactoryProvider.get(), this.lazadaRegistrationUrlMapperProvider.get());
    }

    public static RVTabbarLayout create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<addCheckedState> bVar6, b.C0007b<getTabSize> bVar7) {
        return new RVTabbarLayout(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static setTabListener newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getOrigin getorigin, addCheckedState addcheckedstate, getTabSize gettabsize) {
        return new setTabListener(dialogLayout, r10, backKeyDownPoint, getapplaunchparams, getorigin, addcheckedstate, gettabsize);
    }
}
