package o;

import android.view.View;
import id.dana.home.tab.HomeTabFragment;
import id.dana.pay.PayActivity;
import id.dana.tracker.TrackerKey;

public final class NXEmbedPageExtension implements View.OnClickListener {
    private final HomeTabFragment length;

    public NXEmbedPageExtension(HomeTabFragment homeTabFragment) {
        this.length = homeTabFragment;
    }

    public final void onClick(View view) {
        this.length.startActivityForResult(PayActivity.createPayActivityIntent(this.length.getMax, TrackerKey.SourceType.HOME_PAY_BUTTON), HomeTabFragment.setMin);
    }
}
