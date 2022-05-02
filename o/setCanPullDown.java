package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;

final class setCanPullDown implements Function1 {
    public static final setCanPullDown length = new setCanPullDown();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[GetProfileCompletionData]MyProfilePresenter:onError", (Throwable) obj);
    }
}
