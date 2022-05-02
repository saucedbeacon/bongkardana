package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import o.onFling;
import o.publishImageAction;

@Module
public class UserBankModule {
    private publishImageAction.length getMax;

    @Provides
    public publishImageAction.setMin length(onFling onfling) {
        return onfling;
    }

    public UserBankModule(publishImageAction.length length) {
        this.getMax = length;
    }

    @Provides
    public publishImageAction.length length() {
        return this.getMax;
    }
}
