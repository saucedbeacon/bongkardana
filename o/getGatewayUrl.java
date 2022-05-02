package o;

import android.view.View;
import id.dana.showcase.view.PagerContentView;

public final class getGatewayUrl implements View.OnClickListener {
    private final PagerContentView length;

    public getGatewayUrl(PagerContentView pagerContentView) {
        this.length = pagerContentView;
    }

    public final void onClick(View view) {
        PagerContentView.length(this.length);
    }
}
