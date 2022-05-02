package o;

import id.dana.model.CdpContentModel;
import id.dana.richview.NewBannerView;

public final class onPictureProcessError implements Runnable {
    private final CdpContentModel length;
    private final NewBannerView setMax;

    public onPictureProcessError(NewBannerView newBannerView, CdpContentModel cdpContentModel) {
        this.setMax = newBannerView;
        this.length = cdpContentModel;
    }

    public final void run() {
        this.setMax.setMax(this.length, "Promotion Banner Appear");
    }
}
