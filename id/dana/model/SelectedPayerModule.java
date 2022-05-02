package id.dana.model;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.CameraView;
import o.setActivityOrFragment;

@Module
public class SelectedPayerModule {
    private final CameraView.length setMin;

    @PerActivity
    @Provides
    public CameraView.setMin length(setActivityOrFragment setactivityorfragment) {
        return setactivityorfragment;
    }

    public SelectedPayerModule(CameraView.length length) {
        this.setMin = length;
    }

    @PerActivity
    @Provides
    public CameraView.length setMin() {
        return this.setMin;
    }
}
