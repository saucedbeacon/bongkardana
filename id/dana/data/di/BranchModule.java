package id.dana.data.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import io.branch.referral.Branch;
import javax.inject.Singleton;

@Module
public class BranchModule {
    private final boolean debugMode;

    public BranchModule(boolean z) {
        this.debugMode = z;
    }

    @Singleton
    @Provides
    public Branch provideBranch(Application application) {
        if (this.debugMode) {
            Branch.toFloatRange();
        } else {
            Branch.toIntRange();
        }
        return Branch.getMin((Context) application);
    }
}
