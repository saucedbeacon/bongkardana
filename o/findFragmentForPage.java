package o;

import id.dana.data.di.ApiModule;
import o.UtdidDeviceIdProvider;
import o.b;

public final class findFragmentForPage implements getAdapterPosition<getTextColor> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public findFragmentForPage(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final getTextColor get() {
        return provideHereAutocompleteApi(this.module, this.builderProvider.get());
    }

    public static findFragmentForPage create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new findFragmentForPage(apiModule, bVar);
    }

    public static getTextColor provideHereAutocompleteApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        getTextColor provideHereAutocompleteApi = apiModule.provideHereAutocompleteApi(getmin);
        if (provideHereAutocompleteApi != null) {
            return provideHereAutocompleteApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
