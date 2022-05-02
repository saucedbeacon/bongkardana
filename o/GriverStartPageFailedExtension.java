package o;

import id.dana.di.modules.SortingSendMoneyModule;
import o.BindArray;

public final class GriverStartPageFailedExtension implements getAdapterPosition<BindArray.getMin> {
    private final SortingSendMoneyModule setMin;

    private GriverStartPageFailedExtension(SortingSendMoneyModule sortingSendMoneyModule) {
        this.setMin = sortingSendMoneyModule;
    }

    public static GriverStartPageFailedExtension setMin(SortingSendMoneyModule sortingSendMoneyModule) {
        return new GriverStartPageFailedExtension(sortingSendMoneyModule);
    }

    public final /* synthetic */ Object get() {
        BindArray.getMin max = this.setMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
