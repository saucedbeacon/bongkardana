package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.landing.view.RecipientSelectorView;
import o.getModifiedTime;

public final class PhotoUtil implements getBindingAdapter<RecipientSelectorView> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.landing.view.RecipientSelectorView.recipientHomePresenter")
    public static void setMin(RecipientSelectorView recipientSelectorView, getModifiedTime.getMin getmin) {
        recipientSelectorView.recipientHomePresenter = getmin;
    }
}
