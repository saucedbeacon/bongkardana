package o;

import id.dana.showcase.view.PagerContentView;

public final class setGatewayUrl implements Runnable {
    private final PagerContentView setMin;

    public setGatewayUrl(PagerContentView pagerContentView) {
        this.setMin = pagerContentView;
    }

    public final void run() {
        this.setMin.viewPager.setAdapter(this.setMin.getMin);
    }
}
