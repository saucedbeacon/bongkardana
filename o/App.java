package o;

import android.app.Application;
import android.content.Context;
import id.dana.data.base.BasePersistenceDao;
import id.dana.data.di.ApiModule;
import id.dana.data.di.BranchModule;
import id.dana.data.di.DataModule;
import id.dana.data.di.NetworkModule;
import io.branch.referral.Branch;
import o.Draft;
import o.UtdidDeviceIdProvider;
import o.b;

public final class App implements getAdapterPosition<decode> {
    private final b.C0007b<UtdidDeviceIdProvider.getMin> builderProvider;
    private final ApiModule module;

    public final class PageReadyListener implements getAdapterPosition<BasePersistenceDao> {
        private final b.C0007b<Context> contextProvider;
        private final DataModule module;

        public PageReadyListener(DataModule dataModule, b.C0007b<Context> bVar) {
            this.module = dataModule;
            this.contextProvider = bVar;
        }

        public final BasePersistenceDao get() {
            return provideDatabase(this.module, this.contextProvider.get());
        }

        public static PageReadyListener create(DataModule dataModule, b.C0007b<Context> bVar) {
            return new PageReadyListener(dataModule, bVar);
        }

        public static BasePersistenceDao provideDatabase(DataModule dataModule, Context context) {
            BasePersistenceDao provideDatabase = dataModule.provideDatabase(context);
            if (provideDatabase != null) {
                return provideDatabase;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class PopParams implements getAdapterPosition<Draft.CloseHandshakeType> {
        private final b.C0007b<Context> contextProvider;
        private final NetworkModule module;

        public PopParams(NetworkModule networkModule, b.C0007b<Context> bVar) {
            this.module = networkModule;
            this.contextProvider = bVar;
        }

        public final Draft.CloseHandshakeType get() {
            return provideCache(this.module, this.contextProvider.get());
        }

        public static PopParams create(NetworkModule networkModule, b.C0007b<Context> bVar) {
            return new PopParams(networkModule, bVar);
        }

        public static Draft.CloseHandshakeType provideCache(NetworkModule networkModule, Context context) {
            Draft.CloseHandshakeType provideCache = networkModule.provideCache(context);
            if (provideCache != null) {
                return provideCache;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public final class ResumeParams implements getAdapterPosition<Branch> {
        private final b.C0007b<Application> applicationProvider;
        private final BranchModule module;

        public ResumeParams(BranchModule branchModule, b.C0007b<Application> bVar) {
            this.module = branchModule;
            this.applicationProvider = bVar;
        }

        public final Branch get() {
            return provideBranch(this.module, this.applicationProvider.get());
        }

        public static ResumeParams create(BranchModule branchModule, b.C0007b<Application> bVar) {
            return new ResumeParams(branchModule, bVar);
        }

        public static Branch provideBranch(BranchModule branchModule, Application application) {
            Branch provideBranch = branchModule.provideBranch(application);
            if (provideBranch != null) {
                return provideBranch;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public App(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        this.module = apiModule;
        this.builderProvider = bVar;
    }

    public final decode get() {
        return provideNameCheckApi(this.module, this.builderProvider.get());
    }

    public static App create(ApiModule apiModule, b.C0007b<UtdidDeviceIdProvider.getMin> bVar) {
        return new App(apiModule, bVar);
    }

    public static decode provideNameCheckApi(ApiModule apiModule, UtdidDeviceIdProvider.getMin getmin) {
        decode provideNameCheckApi = apiModule.provideNameCheckApi(getmin);
        if (provideNameCheckApi != null) {
            return provideNameCheckApi;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
