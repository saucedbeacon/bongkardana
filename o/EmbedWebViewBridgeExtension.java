package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity;
import o.getDuration;

public final class EmbedWebViewBridgeExtension implements getBindingAdapter<MissingRequiredUserInfoDialogActivity> {
    @InjectedFieldSignature("id.dana.miniprogram.tnc.MissingRequiredUserInfoDialogActivity.readLinkPropertiesPresenter")
    public static void setMax(MissingRequiredUserInfoDialogActivity missingRequiredUserInfoDialogActivity, getDuration.length length) {
        missingRequiredUserInfoDialogActivity.readLinkPropertiesPresenter = length;
    }
}
