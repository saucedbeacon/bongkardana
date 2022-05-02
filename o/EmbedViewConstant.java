package o;

import com.google.firebase.installations.FirebaseInstallations;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.CommonBackPerform;
import o.CommonExitPerform;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class EmbedViewConstant extends setMinProgress implements getCharsetName {
    private final DialogLayout accountEntityDataFactory;
    private final CommonExitPerform.CollectJsApiHandler factory;
    private final PackageInstallCallback generalPreferencesDataFactory;
    private final CommonBackPerform.AnonymousClass1 pushNotificationMapper;
    private final BackKeyDownPoint securityGuardFacade;

    @Inject
    public EmbedViewConstant(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, PackageInstallCallback packageInstallCallback, CommonExitPerform.CollectJsApiHandler collectJsApiHandler, CommonBackPerform.AnonymousClass1 r6, BackKeyDownPoint backKeyDownPoint2, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.factory = collectJsApiHandler;
        this.pushNotificationMapper = r6;
        this.accountEntityDataFactory = dialogLayout;
        this.generalPreferencesDataFactory = packageInstallCallback;
        this.securityGuardFacade = backKeyDownPoint2;
    }

    public setDrawDivider createAccountData() {
        return this.accountEntityDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<imageQuality> reportDevice(String str, String str2, String str3, String str4) {
        TitleBarRightButtonView.AnonymousClass1<ResourceResponseInfo> authenticatedRequest = authenticatedRequest(createNotificationData().reportDevice(str, str2, str3, str4));
        CommonBackPerform.AnonymousClass1 r3 = this.pushNotificationMapper;
        Objects.requireNonNull(r3);
        return authenticatedRequest.map(new logApiSendBack(r3)).doOnError(new EmbedViewProvider(this)).map(new APILogUtils(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$reportDevice$0(Throwable th) throws Exception {
        createGeneralPreferences().saveTokenRegistrationStatus(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ imageQuality lambda$reportDevice$1(imageQuality imagequality) throws Exception {
        createGeneralPreferences().saveTokenRegistrationStatus(true);
        return imagequality;
    }

    private handleCollectedApi createNotificationData() {
        return this.factory.createData("network");
    }

    private isInDownloadPath createGeneralPreferences() {
        return this.generalPreferencesDataFactory.createData("local");
    }

    public TitleBarRightButtonView.AnonymousClass1<H5UrlHelper> bindApp() {
        return createGeneralPreferences().getRegistrationTokenStatus().flatMap(new setPerformanceReporter(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$bindApp$2(Boolean bool) throws Exception {
        if (!bool.booleanValue()) {
            FirebaseInstallations.getInstance().delete();
        }
        TitleBarRightButtonView.AnonymousClass1<onSurfaceAvailable> authenticatedRequest = authenticatedRequest(createNotificationData().bindApp(getBadgeList.getUserId(this.securityGuardFacade, "")));
        CommonBackPerform.AnonymousClass1 r0 = this.pushNotificationMapper;
        Objects.requireNonNull(r0);
        return authenticatedRequest.map(new IEmbedPerformance(r0));
    }
}
