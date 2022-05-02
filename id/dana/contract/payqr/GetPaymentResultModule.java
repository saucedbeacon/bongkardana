package id.dana.contract.payqr;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.FragmentStateAdapter$5;
import o.snapToPage;

@Module
public class GetPaymentResultModule {
    private final FragmentStateAdapter$5.getMax getMin;

    @PerActivity
    @Provides
    public FragmentStateAdapter$5.setMin getMin(snapToPage snaptopage) {
        return snaptopage;
    }

    public GetPaymentResultModule(FragmentStateAdapter$5.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public FragmentStateAdapter$5.getMax length() {
        return this.getMin;
    }
}
