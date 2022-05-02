package o;

import id.dana.home.tab.HomeTabFragment;

public final class NXEmbedAppExtension implements onMeasure {
    private final HomeTabFragment length;

    public NXEmbedAppExtension(HomeTabFragment homeTabFragment) {
        this.length = homeTabFragment;
    }

    public final void onChanged(Object obj) {
        HomeTabFragment.getMin(this.length, (Boolean) obj);
    }
}
