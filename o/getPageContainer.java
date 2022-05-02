package o;

import o.Page;
import o.b;

public final class getPageContainer implements getAdapterPosition<Page.RenderReadyListener> {
    private final b.C0007b<getErrorView> networkDonationCampaignEntityDataProvider;

    public getPageContainer(b.C0007b<getErrorView> bVar) {
        this.networkDonationCampaignEntityDataProvider = bVar;
    }

    public final Page.RenderReadyListener get() {
        return newInstance(this.networkDonationCampaignEntityDataProvider.get());
    }

    public static getPageContainer create(b.C0007b<getErrorView> bVar) {
        return new getPageContainer(bVar);
    }

    public static Page.RenderReadyListener newInstance(getErrorView geterrorview) {
        return new Page.RenderReadyListener(geterrorview);
    }
}
