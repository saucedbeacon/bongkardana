package o;

import com.alipay.iap.android.aplog.core.uploader.UserDiagnostician;

final class AppStartPoint implements setMonitorLogAppendWorker {
    private final UserDiagnostician setMin;

    public AppStartPoint(UserDiagnostician userDiagnostician) {
        this.setMin = userDiagnostician;
    }

    public final void getMin(initExtParam initextparam) {
        onAppPause.lambda$initPushManagerForDiagnosticLog$0(this.setMin, initextparam);
    }
}
