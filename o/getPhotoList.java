package o;

import id.dana.sendmoney_v2.x2l.di.SendToLinkBannerModule;
import id.dana.sendmoney_v2.x2l.view.SendToLinkBannerView;
import o.PhotoBrowseView;
import o.PrepareException;
import o.access$2602;
import o.b;

public final class getPhotoList implements resetData {
    private b.C0007b<access$2602.length> getMax;
    private b.C0007b<getByteCount> getMin;
    private b.C0007b<Identifier> length;
    private b.C0007b<access$2602.setMin> setMax;
    private b.C0007b<PhotoBrowseView.AnonymousClass4> setMin;

    public /* synthetic */ getPhotoList(SendToLinkBannerModule sendToLinkBannerModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(sendToLinkBannerModule, r2);
    }

    private getPhotoList(SendToLinkBannerModule sendToLinkBannerModule, PrepareException.AnonymousClass1 r3) {
        this.setMax = isScrap.getMin(PhotoBrowseView.MenuItemOnClickListener.setMax(sendToLinkBannerModule));
        getMax getmax = new getMax(r3);
        this.getMin = getmax;
        toByteArrayOfSpecifiedEndianness create = toByteArrayOfSpecifiedEndianness.create(getmax);
        this.length = create;
        PhotoBrowseView.AnonymousClass5 length2 = PhotoBrowseView.AnonymousClass5.length(this.setMax, create);
        this.setMin = length2;
        this.getMax = isScrap.getMin(addPhotos.length(sendToLinkBannerModule, length2));
    }

    public static final class setMin {
        public SendToLinkBannerModule getMax;
        public PrepareException.AnonymousClass1 length;

        public /* synthetic */ setMin(byte b) {
            this();
        }

        private setMin() {
        }
    }

    static class getMax implements b.C0007b<getByteCount> {
        private final PrepareException.AnonymousClass1 getMin;

        getMax(PrepareException.AnonymousClass1 r1) {
            this.getMin = r1;
        }

        public final /* synthetic */ Object get() {
            getByteCount create = this.getMin.create();
            if (create != null) {
                return create;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMin(SendToLinkBannerView sendToLinkBannerView) {
        PhotoGridView.getMax(sendToLinkBannerView, this.getMax.get());
    }
}
