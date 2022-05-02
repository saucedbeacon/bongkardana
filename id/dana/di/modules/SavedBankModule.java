package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import o.IWorkManagerImplCallback;
import o.onSuccess;

@Module
public class SavedBankModule {
    private final onSuccess.getMax getMin;

    @PerActivity
    @Provides
    public onSuccess.length getMin(IWorkManagerImplCallback iWorkManagerImplCallback) {
        return iWorkManagerImplCallback;
    }

    public SavedBankModule(onSuccess.getMax getmax) {
        this.getMin = getmax;
    }

    @PerActivity
    @Provides
    public onSuccess.getMax setMax() {
        return this.getMin;
    }
}
