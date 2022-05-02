package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.ConstraintProxy$NetworkStateProxy;
import o.ConstraintProxy$StorageNotLowProxy;

@Module
public class ReferralTrackerModule {
    private ConstraintProxy$StorageNotLowProxy.setMax setMax;

    @PerActivity
    @Provides
    public ConstraintProxy$StorageNotLowProxy.setMin length(ConstraintProxy$NetworkStateProxy constraintProxy$NetworkStateProxy) {
        return constraintProxy$NetworkStateProxy;
    }

    public ReferralTrackerModule(ConstraintProxy$StorageNotLowProxy.setMax setmax) {
        this.setMax = setmax;
    }

    @PerActivity
    @Provides
    public ConstraintProxy$StorageNotLowProxy.setMax getMax() {
        return this.setMax;
    }
}
