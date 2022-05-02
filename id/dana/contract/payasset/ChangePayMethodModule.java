package id.dana.contract.payasset;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.beginFakeDrag;
import o.onSecondaryPointerUp;

@Module
public class ChangePayMethodModule {
    private final beginFakeDrag.getMin getMin;

    @PerActivity
    @Provides
    public beginFakeDrag.setMax setMax(onSecondaryPointerUp onsecondarypointerup) {
        return onsecondarypointerup;
    }

    public ChangePayMethodModule(beginFakeDrag.getMin getmin) {
        this.getMin = getmin;
    }

    @PerActivity
    @Provides
    public beginFakeDrag.getMin length() {
        return this.getMin;
    }
}
