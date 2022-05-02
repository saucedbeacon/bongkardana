package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.savings.activity.SavingUpdateActivity;
import o.GriverManifest;
import o.SightCameraViewImpl;

public final class focusOnTouch implements getBindingAdapter<SavingUpdateActivity> {
    @InjectedFieldSignature("id.dana.savings.activity.SavingUpdateActivity.savingUpdatePresenter")
    public static void length(SavingUpdateActivity savingUpdateActivity, SightCameraViewImpl.AnonymousClass2 r1) {
        savingUpdateActivity.savingUpdatePresenter = r1;
    }

    @InjectedFieldSignature("id.dana.savings.activity.SavingUpdateActivity.checkoutH5EventPresenter")
    public static void getMax(SavingUpdateActivity savingUpdateActivity, GriverManifest.AnonymousClass22.getMin getmin) {
        savingUpdateActivity.checkoutH5EventPresenter = getmin;
    }
}
