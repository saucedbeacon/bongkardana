package o;

import id.dana.sendmoney_v2.x2l.di.SendToLinkSelectorModule;
import o.PhotoBrowseView;
import o.b;

public final class isPhotoType implements getAdapterPosition<PhotoBrowseView.AnonymousClass8.length> {
    private final b.C0007b<PhotoBrowseView.AnonymousClass7> getMax;
    private final SendToLinkSelectorModule setMin;

    private isPhotoType(SendToLinkSelectorModule sendToLinkSelectorModule, b.C0007b<PhotoBrowseView.AnonymousClass7> bVar) {
        this.setMin = sendToLinkSelectorModule;
        this.getMax = bVar;
    }

    public static isPhotoType setMax(SendToLinkSelectorModule sendToLinkSelectorModule, b.C0007b<PhotoBrowseView.AnonymousClass7> bVar) {
        return new isPhotoType(sendToLinkSelectorModule, bVar);
    }

    public final /* synthetic */ Object get() {
        PhotoBrowseView.AnonymousClass8.length max = this.setMin.getMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
