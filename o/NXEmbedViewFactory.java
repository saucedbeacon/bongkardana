package o;

import id.dana.home.tab.HomeTabFragment;

public final class NXEmbedViewFactory implements onMeasure {
    private final HomeTabFragment getMax;

    public NXEmbedViewFactory(HomeTabFragment homeTabFragment) {
        this.getMax = homeTabFragment;
    }

    public final void onChanged(Object obj) {
        HomeTabFragment.getMax(this.getMax, (Boolean) obj);
    }
}
