package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.SavingHistoryActivity;
import o.isEnableFrameData;

public final class zoom implements getBindingAdapter<SavingHistoryActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.SavingHistoryActivity.savingTopUpHistoryPresenter")
    public static void setMax(SavingHistoryActivity savingHistoryActivity, isEnableFrameData.getMax getmax) {
        savingHistoryActivity.savingTopUpHistoryPresenter = getmax;
    }
}
