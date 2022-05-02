package o;

import id.dana.model.GnContentModel;

final class Griver implements RedDotManager {
    private final BLEServiceUnit getMax;

    public Griver(BLEServiceUnit bLEServiceUnit) {
        this.getMax = bLEServiceUnit;
    }

    public final void accept(Object obj) {
        this.getMax.create.setMax(new GnContentModel(), this.getMax.ICustomTabsCallback$Default.toLowerCase());
    }
}
