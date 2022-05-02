package o;

import java.util.List;

final class addOnAdapterChangeListener implements RedDotDrawable {
    private final updateAdapter length;

    public addOnAdapterChangeListener(updateAdapter updateadapter) {
        this.length = updateadapter;
    }

    public final Object apply(Object obj) {
        return updateAdapter.length(this.length, (List) obj);
    }
}
