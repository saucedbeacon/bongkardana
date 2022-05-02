package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.SavingDetailActivity;
import o.GriverManifest;
import o.SightCameraView;

public final class onAutoFocus implements getBindingAdapter<SavingDetailActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.SavingDetailActivity.savingDetailPresenter")
    public static void setMin(SavingDetailActivity savingDetailActivity, SightCameraView.BufferType bufferType) {
        savingDetailActivity.savingDetailPresenter = bufferType;
    }

    @InjectedFieldSignature("id.dana.savings.activity.SavingDetailActivity.savingTopUpPresenter")
    public static void setMax(SavingDetailActivity savingDetailActivity, setOnTapListener setontaplistener) {
        savingDetailActivity.savingTopUpPresenter = setontaplistener;
    }

    @InjectedFieldSignature("id.dana.savings.activity.SavingDetailActivity.checkoutH5EventPresenter")
    public static void getMin(SavingDetailActivity savingDetailActivity, GriverManifest.AnonymousClass22.getMin getmin) {
        savingDetailActivity.checkoutH5EventPresenter = getmin;
    }
}
