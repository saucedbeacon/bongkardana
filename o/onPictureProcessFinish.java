package o;

import id.dana.model.CdpContentModel;
import id.dana.richview.NewBannerView;
import o.GriverManifest;

public final class onPictureProcessFinish implements GriverManifest.AnonymousClass54.getMin {
    private final NewBannerView length;

    public onPictureProcessFinish(NewBannerView newBannerView) {
        this.length = newBannerView;
    }

    public final void getMax(CdpContentModel cdpContentModel) {
        NewBannerView.getMin(this.length, cdpContentModel);
    }
}
