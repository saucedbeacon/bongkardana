package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.SavingCreateActivity;
import o.notifyMicError;

public final class initCamera implements getBindingAdapter<SavingCreateActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.SavingCreateActivity.presenter")
    public static void getMin(SavingCreateActivity savingCreateActivity, notifyMicError.getMin getmin) {
        savingCreateActivity.presenter = getmin;
    }
}
