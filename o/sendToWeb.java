package o;

import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0014R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/geofence/interactor/GetListPoi;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/geofence/model/Poi;", "", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "geoFenceRepository", "Lid/dana/domain/geofence/GeoFenceRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/geofence/GeoFenceRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "location", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class sendToWeb extends parseFailed<List<? extends H5Data>, String> {
    private final onDownloadResult geoFenceRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public sendToWeb(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull onDownloadResult ondownloadresult) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(ondownloadresult, "geoFenceRepository");
        this.geoFenceRepository = ondownloadresult;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<H5Data>> buildUseCaseObservable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "location");
        return this.geoFenceRepository.getListPoi(str);
    }
}
