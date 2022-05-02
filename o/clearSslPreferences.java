package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/featureconfig/interactor/SetRetryIntervalGeoFence;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/featureconfig/interactor/SetRetryIntervalGeoFence$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "geoFenceRepository", "Lid/dana/domain/geofence/GeoFenceRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/geofence/GeoFenceRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class clearSslPreferences extends parseFailed<Boolean, setMax> {
    private final onDownloadResult geoFenceRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public clearSslPreferences(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onDownloadResult ondownloadresult) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(ondownloadresult, "geoFenceRepository");
        this.geoFenceRepository = ondownloadresult;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.geoFenceRepository.setRetryInterval(setmax.getMaxRetry$domain_release());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lid/dana/domain/featureconfig/interactor/SetRetryIntervalGeoFence$Params;", "", "maxRetry", "", "(I)V", "getMaxRetry$domain_release", "()I", "setMaxRetry$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
        private int maxRetry;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lid/dana/domain/featureconfig/interactor/SetRetryIntervalGeoFence$Params$Companion;", "", "()V", "forRetryInterval", "Lid/dana/domain/featureconfig/interactor/SetRetryIntervalGeoFence$Params;", "maxRetry", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMin {
            private setMin() {
            }

            public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final setMax forRetryInterval(int i) {
                return new setMax(i, (DefaultConstructorMarker) null);
            }
        }

        private setMax(int i) {
            this.maxRetry = i;
        }

        public /* synthetic */ setMax(int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(i);
        }

        public final int getMaxRetry$domain_release() {
            return this.maxRetry;
        }

        public final void setMaxRetry$domain_release(int i) {
            this.maxRetry = i;
        }
    }
}
