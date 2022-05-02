package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.x2l.view.SendToLinkSelectorView;
import o.PhotoBrowseView;

public final class showProgress implements getBindingAdapter<SendToLinkSelectorView> {
    @InjectedFieldSignature("id.dana.sendmoney_v2.x2l.view.SendToLinkSelectorView.sendToLinkSelectorPresenter")
    public static void getMax(SendToLinkSelectorView sendToLinkSelectorView, PhotoBrowseView.AnonymousClass8.length length) {
        sendToLinkSelectorView.sendToLinkSelectorPresenter = length;
    }
}
