package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.SavingsActivity;
import o.SightCameraView;
import o.updateScreenRotation;

public final class notifyOpenCameraError implements getBindingAdapter<SavingsActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.SavingsActivity.savingPresenter")
    public static void getMax(SavingsActivity savingsActivity, updateScreenRotation.setMin setmin) {
        savingsActivity.savingPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.savings.activity.SavingsActivity.savingConfigPresenter")
    public static void setMax(SavingsActivity savingsActivity, SightCameraView.OnRecordListener onRecordListener) {
        savingsActivity.savingConfigPresenter = onRecordListener;
    }
}
