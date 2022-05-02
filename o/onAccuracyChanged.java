package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.onboarding.boku.BokuVerifyActivity;
import o.inTransaction;
import o.onSensorChanged;

public final class onAccuracyChanged implements getBindingAdapter<BokuVerifyActivity> {
    @InjectedFieldSignature("id.dana.onboarding.boku.BokuVerifyActivity.logoutPresenter")
    public static void setMin(BokuVerifyActivity bokuVerifyActivity, inTransaction.getMax getmax) {
        bokuVerifyActivity.logoutPresenter = getmax;
    }

    @InjectedFieldSignature("id.dana.onboarding.boku.BokuVerifyActivity.bokuVerifyPresenter")
    public static void length(BokuVerifyActivity bokuVerifyActivity, onSensorChanged.getMax getmax) {
        bokuVerifyActivity.bokuVerifyPresenter = getmax;
    }
}
