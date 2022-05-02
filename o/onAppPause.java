package o;

import android.app.Application;
import com.alipay.iap.android.aplog.core.uploader.UserDiagnostician;
import com.alipay.mobile.common.reach.ReachManager;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;

@Singleton
public class onAppPause {
    private final AppPausePoint amcsManager;
    private final Application application;

    @Inject
    onAppPause(Application application2, AppPausePoint appPausePoint) {
        this.application = application2;
        this.amcsManager = appPausePoint;
    }

    public void initPushManager() {
        if (this.amcsManager.isInitialized()) {
            initPushManagerForDiagnosticLog();
        } else {
            this.amcsManager.addListener(new AppRestartPoint(this));
        }
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<Void> initPushManagerForDiagnosticLog() {
        ReachManager.getInstance().init(this.application);
        ReachManager.getInstance().registerMsgReceiver("IAPLog", new AppStartPoint(UserDiagnostician.createInstance(this.application)));
        return TitleBarRightButtonView.AnonymousClass1.empty();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$initPushManagerForDiagnosticLog$0(UserDiagnostician userDiagnostician, initExtParam initextparam) {
        try {
            userDiagnostician.processPushMsgInWorkThread(initextparam.getMin);
        } catch (Exception e) {
            updateActionSheetContent.e(DanaLogConstants.TAG.DIAGNOSTIC_TAG, "processPushMsgInWorkThread error: ", e);
        }
    }
}
