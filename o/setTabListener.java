package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverExecutors;
import o.RVTabbarLayout;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class setTabListener extends setMinProgress implements GriverExecutors.H5SingleThreadFactory.AnonymousClass1 {
    private final addCheckedState lazadaRegistrationUrlEntityDataFactory;
    private final getTabSize lazadaRegistrationUrlMapper;
    private final AppModel userConfigRepository;

    @Inject
    public setTabListener(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getOrigin getorigin, addCheckedState addcheckedstate, getTabSize gettabsize) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.userConfigRepository = getorigin;
        this.lazadaRegistrationUrlEntityDataFactory = addcheckedstate;
        this.lazadaRegistrationUrlMapper = gettabsize;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isClickedAgree() {
        return this.userConfigRepository.getUserSpecificConfig(new onFirstScanTime(UserConfigBizTypeConstant.CONFIG_LAZADA_JKT_CONSENT, getAbsoluteUrl.class)).map(removeTab.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveClickedAgree() {
        getAbsoluteUrl getabsoluteurl = new getAbsoluteUrl();
        getabsoluteurl.userConsent = true;
        return this.userConfigRepository.saveUserSpecificConfig(new RVTabbarLayout.Listener(getabsoluteurl));
    }

    public TitleBarRightButtonView.AnonymousClass1<GriverRVExecutorServiceImpl> getLazadaRegistrationUrl(String str, String str2) {
        return authenticatedRequest(createIpgEntityData().getLazadaRegistrationUrl(str, str2)).map(new getTabBarItemAt(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ GriverRVExecutorServiceImpl lambda$getLazadaRegistrationUrl$1(renderView renderview) throws Exception {
        return this.lazadaRegistrationUrlMapper.transform(renderview);
    }

    private TabBarUtils createIpgEntityData() {
        return this.lazadaRegistrationUrlEntityDataFactory.createData("network");
    }
}
