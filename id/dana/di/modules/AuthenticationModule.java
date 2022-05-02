package id.dana.di.modules;

import android.app.Activity;
import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.Embedded;

@Module
public class AuthenticationModule {
    private final Activity setMin;

    public AuthenticationModule(Activity activity) {
        this.setMin = activity;
    }

    @PerActivity
    @Provides
    public Embedded setMax() {
        return new Embedded(this.setMin);
    }
}
