package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.myprofile.ProfileQrisDialogActivity;
import o.OnTouch;
import o.getTransitionProperties;

public final class shareTinyAppMsg implements getBindingAdapter<ProfileQrisDialogActivity> {
    @InjectedFieldSignature("id.dana.myprofile.ProfileQrisDialogActivity.getStaticQrPresenter")
    public static void getMax(ProfileQrisDialogActivity profileQrisDialogActivity, OnTouch.setMin setmin) {
        profileQrisDialogActivity.getStaticQrPresenter = setmin;
    }

    @InjectedFieldSignature("id.dana.myprofile.ProfileQrisDialogActivity.profileQrDeepLinkPresenter")
    public static void setMax(ProfileQrisDialogActivity profileQrisDialogActivity, getTransitionProperties.setMin setmin) {
        profileQrisDialogActivity.profileQrDeepLinkPresenter = setmin;
    }
}
