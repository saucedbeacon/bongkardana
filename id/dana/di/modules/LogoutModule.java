package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.createAllTables;
import o.inTransaction;

@Module
public class LogoutModule {
    private inTransaction.getMin length;

    @PerActivity
    @Provides
    public inTransaction.getMax setMax(createAllTables createalltables) {
        return createalltables;
    }

    public LogoutModule(inTransaction.getMin getmin) {
        this.length = getmin;
    }

    @PerActivity
    @Provides
    public inTransaction.getMin getMin() {
        return this.length;
    }
}
