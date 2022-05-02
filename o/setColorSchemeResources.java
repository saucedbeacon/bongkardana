package o;

import id.dana.contract.account.FirstTimeModule;
import o.setProgressBackgroundColorSchemeResource;

public final class setColorSchemeResources implements getAdapterPosition<setProgressBackgroundColorSchemeResource.setMin> {
    private final FirstTimeModule setMin;

    private setColorSchemeResources(FirstTimeModule firstTimeModule) {
        this.setMin = firstTimeModule;
    }

    public static setColorSchemeResources setMin(FirstTimeModule firstTimeModule) {
        return new setColorSchemeResources(firstTimeModule);
    }

    public final /* synthetic */ Object get() {
        setProgressBackgroundColorSchemeResource.setMin min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
