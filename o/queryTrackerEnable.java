package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.jvm.functions.Function1;

final class queryTrackerEnable implements Function1 {
    public static final queryTrackerEnable getMin = new queryTrackerEnable();

    public final Object invoke(Object obj) {
        return updateActionSheetContent.e(DanaLogConstants.TAG.PROFILE_TAG, "[GetProfileCompletionVisibility]MyProfilePresenter:onError", (Throwable) obj);
    }
}
