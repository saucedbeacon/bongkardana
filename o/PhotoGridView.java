package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney_v2.x2l.di.SendToLinkSelectorModule;
import id.dana.sendmoney_v2.x2l.view.SendToLinkBannerView;
import o.PhotoBrowseView;
import o.access$2602;

public final class PhotoGridView implements getBindingAdapter<SendToLinkBannerView> {

    public final class OnOverScrolledListener implements getAdapterPosition<PhotoBrowseView.AnonymousClass8.getMax> {
        private final SendToLinkSelectorModule length;

        private OnOverScrolledListener(SendToLinkSelectorModule sendToLinkSelectorModule) {
            this.length = sendToLinkSelectorModule;
        }

        public static OnOverScrolledListener getMin(SendToLinkSelectorModule sendToLinkSelectorModule) {
            return new OnOverScrolledListener(sendToLinkSelectorModule);
        }

        public final /* synthetic */ Object get() {
            PhotoBrowseView.AnonymousClass8.getMax min = this.length.setMin();
            if (min != null) {
                return min;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    @InjectedFieldSignature("id.dana.sendmoney_v2.x2l.view.SendToLinkBannerView.sendToLinkBannerPresenter")
    public static void getMax(SendToLinkBannerView sendToLinkBannerView, access$2602.length length) {
        sendToLinkBannerView.sendToLinkBannerPresenter = length;
    }
}
