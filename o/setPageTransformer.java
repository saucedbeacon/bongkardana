package o;

import android.location.Location;

final class setPageTransformer implements RedDotDrawable {
    private final updateAdapter setMax;

    public setPageTransformer(updateAdapter updateadapter) {
        this.setMax = updateadapter;
    }

    public final Object apply(Object obj) {
        return this.setMax.asBinder = (Location) obj;
    }
}
