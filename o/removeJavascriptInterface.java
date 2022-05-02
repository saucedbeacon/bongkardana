package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0014R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/domain/featureconfig/interactor/GetCurrentPOICacheTime;", "Lid/dana/domain/UseCase;", "", "Ljava/lang/Void;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "geofenceConfigFactory", "Lid/dana/domain/geofence/GeoFenceRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/geofence/GeoFenceRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "aVoid", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class removeJavascriptInterface extends parseFailed<Long, Void> {
    private final onDownloadResult geofenceConfigFactory;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public removeJavascriptInterface(@Nullable appxLoadFailed appxloadfailed, @Nullable getScheme getscheme, @NotNull onDownloadResult ondownloadresult) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(ondownloadresult, "geofenceConfigFactory");
        this.geofenceConfigFactory = ondownloadresult;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> buildUseCaseObservable(@Nullable Void voidR) {
        return this.geofenceConfigFactory.getCurrentPOICacheTime();
    }
}
