package id.dana.data.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import id.dana.data.base.BasePersistenceDao;
import javax.inject.Singleton;
import o.removeUpdateListener;

@Module(includes = {BranchModule.class, ApiModule.class, NetworkModule.class})
public class DataModule {
    @Singleton
    @Provides
    public BasePersistenceDao provideDatabase(Context context) {
        return removeUpdateListener.create(context);
    }
}
