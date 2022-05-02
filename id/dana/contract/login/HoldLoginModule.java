package id.dana.contract.login;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.getItemPosition;
import o.registerDataSetObserver;

@Module
public class HoldLoginModule {
    private final registerDataSetObserver.getMin setMax;

    @PerActivity
    @Provides
    public registerDataSetObserver.setMax length(getItemPosition getitemposition) {
        return getitemposition;
    }

    public HoldLoginModule(registerDataSetObserver.getMin getmin) {
        this.setMax = getmin;
    }

    @PerActivity
    @Provides
    public registerDataSetObserver.getMin setMax() {
        return this.setMax;
    }
}
