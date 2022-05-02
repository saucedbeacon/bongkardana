package id.dana.contract.user;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getThemeRes;
import o.parameters;

@Module
public class GetBalanceModule {
    private final parameters.getMin length;

    @PerActivity
    @Provides
    public parameters.setMax length(getThemeRes getthemeres) {
        return getthemeres;
    }

    public GetBalanceModule(parameters.getMin getmin) {
        this.length = getmin;
    }

    @PerActivity
    @Provides
    public parameters.getMin getMin() {
        return this.length;
    }
}
