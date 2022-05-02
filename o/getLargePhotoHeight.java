package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.view.RecipientHomeView;
import o.getModifiedTime;

public final class getLargePhotoHeight implements getBindingAdapter<RecipientHomeView> {
    @InjectedFieldSignature("id.dana.sendmoney.view.RecipientHomeView.recipientHomePresenter")
    public static void setMin(RecipientHomeView recipientHomeView, getModifiedTime.getMin getmin) {
        recipientHomeView.recipientHomePresenter = getmin;
    }
}
