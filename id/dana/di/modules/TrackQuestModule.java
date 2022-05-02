package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.doWork;
import o.getWorkerFactory;

@Module
public class TrackQuestModule {
    private final getWorkerFactory.length getMin;

    @PerActivity
    @Provides
    public getWorkerFactory.setMax setMin(doWork dowork) {
        return dowork;
    }

    public TrackQuestModule(getWorkerFactory.length length) {
        this.getMin = length;
    }

    @PerActivity
    @Provides
    public getWorkerFactory.length getMax() {
        return this.getMin;
    }
}
