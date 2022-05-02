package o;

import o.AppPausePoint;
import o.TitleBarRightButtonView;

final class AppRestartPoint implements AppPausePoint.setMax {
    private final onAppPause setMin;

    public AppRestartPoint(onAppPause onapppause) {
        this.setMin = onapppause;
    }

    public final void onAmcsInitialized() {
        TitleBarRightButtonView.AnonymousClass1 unused = this.setMin.initPushManagerForDiagnosticLog();
    }
}
