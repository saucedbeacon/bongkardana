package id.dana.contract.payqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.enableLayers;
import o.infoForCurrentScrollPosition;

@Module
public class AddNewCardModule {
    private final enableLayers.getMin length;

    @PerActivity
    @Provides
    public enableLayers.setMin getMax(infoForCurrentScrollPosition infoforcurrentscrollposition) {
        return infoforcurrentscrollposition;
    }

    public AddNewCardModule(enableLayers.getMin getmin) {
        this.length = getmin;
    }

    @PerActivity
    @Provides
    public enableLayers.getMin setMin() {
        return this.length;
    }
}
