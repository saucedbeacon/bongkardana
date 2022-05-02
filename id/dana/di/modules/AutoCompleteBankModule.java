package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.onGridChecked;
import o.y;

@Module
public class AutoCompleteBankModule {
    private y.setMax setMin;

    @Provides
    public y.setMin getMin(onGridChecked ongridchecked) {
        return ongridchecked;
    }

    public AutoCompleteBankModule(y.setMax setmax) {
        this.setMin = setmax;
    }

    @Provides
    public y.setMax setMax() {
        return this.setMin;
    }
}
