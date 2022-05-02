package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/homeinfo/repository/source/local/MaintenanceBroadcastEntityData;", "Lid/dana/data/homeinfo/repository/source/MaintenanceBroadcastRepository;", "maintenanceBroadcastPreference", "Lid/dana/data/homeinfo/repository/source/local/MaintenanceBroadcastPreference;", "(Lid/dana/data/homeinfo/repository/source/local/MaintenanceBroadcastPreference;)V", "getBroadcastSavingState", "Lio/reactivex/Observable;", "Lid/dana/domain/maintenance/model/BroadcastSavingStateResult;", "lastDismissedBroadcast", "", "setBroadcastSavingState", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class registerAppHandler implements showTitleLoading {
    private final unRegisterAppHandler maintenanceBroadcastPreference;

    @Inject
    public registerAppHandler(@NotNull unRegisterAppHandler unregisterapphandler) {
        Intrinsics.checkNotNullParameter(unregisterapphandler, "maintenanceBroadcastPreference");
        this.maintenanceBroadcastPreference = unregisterapphandler;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<overTime> setBroadcastSavingState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastDismissedBroadcast");
        if (str.length() > 0) {
            this.maintenanceBroadcastPreference.saveLastDismissedBroadcast(str);
        }
        TitleBarRightButtonView.AnonymousClass1<overTime> just = TitleBarRightButtonView.AnonymousClass1.just(new overTime(true));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(BroadcastSavingStateResult(true))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<overTime> getBroadcastSavingState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastDismissedBroadcast");
        TitleBarRightButtonView.AnonymousClass1<overTime> just = TitleBarRightButtonView.AnonymousClass1.just(new overTime(!Intrinsics.areEqual((Object) this.maintenanceBroadcastPreference.getLastDismissedBroadcast(), (Object) str)));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n       …t\n            )\n        )");
        return just;
    }
}
