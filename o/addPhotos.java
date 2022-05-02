package o;

import id.dana.sendmoney_v2.x2l.di.SendToLinkBannerModule;
import o.PhotoBrowseView;
import o.access$2602;
import o.b;

public final class addPhotos implements getAdapterPosition<access$2602.length> {
    private final SendToLinkBannerModule getMax;
    private final b.C0007b<PhotoBrowseView.AnonymousClass4> setMin;

    private addPhotos(SendToLinkBannerModule sendToLinkBannerModule, b.C0007b<PhotoBrowseView.AnonymousClass4> bVar) {
        this.getMax = sendToLinkBannerModule;
        this.setMin = bVar;
    }

    public static addPhotos length(SendToLinkBannerModule sendToLinkBannerModule, b.C0007b<PhotoBrowseView.AnonymousClass4> bVar) {
        return new addPhotos(sendToLinkBannerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        access$2602.length min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
