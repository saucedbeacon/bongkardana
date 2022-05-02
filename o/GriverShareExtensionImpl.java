package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;

final class GriverShareExtensionImpl implements Function1 {
    private final restorePullToRefresh setMax;

    public GriverShareExtensionImpl(restorePullToRefresh restorepulltorefresh) {
        this.setMax = restorepulltorefresh;
    }

    public final Object invoke(Object obj) {
        return this.setMax.ICustomTabsCallback.execute(new GriverAppVirtualHostProxy<Boolean>((H5PatternHelper) obj) {
            public final /* synthetic */ void onNext(Object obj) {
                restorePullToRefresh.length(restorePullToRefresh.this, r3, (Boolean) obj);
            }

            public final void onError(Throwable th) {
                super.onError(th);
                updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[GetProfileCompletionData]MyProfilePresenter:onError", th);
            }
        });
    }
}
