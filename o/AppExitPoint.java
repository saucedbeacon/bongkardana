package o;

import android.content.Context;
import o.TitleBarRightButtonView;

public final class AppExitPoint extends setRepeatCount<AppInteractionPoint> implements AppDestroyPoint {
    public AppExitPoint(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
    }

    public final Class<AppInteractionPoint> getFacadeClass() {
        return AppInteractionPoint.class;
    }

    public final TitleBarRightButtonView.AnonymousClass1<loadApp> getFeeds(String str, int i, String str2) {
        AppLoadInterceptorPoint appLoadInterceptorPoint = new AppLoadInterceptorPoint();
        appLoadInterceptorPoint.envInfo = generateMobileEnvInfo();
        appLoadInterceptorPoint.setFeedSourceId(str);
        appLoadInterceptorPoint.setPageSize(i);
        appLoadInterceptorPoint.setMaxId(str2);
        return wrapper(new onAppInteraction(appLoadInterceptorPoint));
    }

    public final TitleBarRightButtonView.AnonymousClass1<intercept> deleteFeeds(String str) {
        onAppLeaveHint onappleavehint = new onAppLeaveHint();
        onappleavehint.envInfo = generateMobileEnvInfo();
        onappleavehint.setActivityId(str);
        return wrapper(new AppLoadPoint(onappleavehint));
    }
}
