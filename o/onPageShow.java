package o;

import id.dana.data.userconfig.UserConfigBizTypeConstant;

public final class onPageShow extends onConnectedSuccessful<onVisit> {
    private static final String TERMS_CONDITION_SYNC_KEY = "feature_sync_terms_conditions";

    public onPageShow(onVisit onvisit) {
        super(UserConfigBizTypeConstant.DIALOG_TNC, TERMS_CONDITION_SYNC_KEY, onvisit);
    }
}
