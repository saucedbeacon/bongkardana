package o;

import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.NetworkUtil;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class addDownload extends setMinProgress {
    private final onFinish riskServicesConfigEntityDataFactory;
    private final NetworkUtil.AnonymousClass1 sendRiskEventEntityDataFactory;

    @Inject
    public addDownload(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, NetworkUtil.AnonymousClass1 r4, getAppLaunchParams getapplaunchparams, onFinish onfinish) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.sendRiskEventEntityDataFactory = r4;
        this.riskServicesConfigEntityDataFactory = onfinish;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> sendRiskEvent(String str, String str2, String str3) {
        return authenticatedRequest(createNetworkConfigData().isEnableSendRiskLuckyMoney().flatMap(new httpRequest(this, str, str2, str3)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$sendRiskEvent$1(String str, String str2, String str3, Boolean bool) throws Exception {
        if (bool == null || !bool.booleanValue()) {
            return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        }
        return createNetworkData().sendRiskEvent(str, str2, str3).map(getDownloadDir.getMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$sendRiskEvent$0(Object obj) throws Exception {
        return Boolean.valueOf(obj != null);
    }

    private RVTransportService createNetworkData() {
        return this.sendRiskEventEntityDataFactory.createData("network");
    }

    private AppMsgReceiver.AnonymousClass2 createNetworkConfigData() {
        return this.riskServicesConfigEntityDataFactory.createData("network");
    }
}
