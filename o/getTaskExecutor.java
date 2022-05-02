package o;

import id.dana.data.constant.BranchLinkConstant;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.getTableName;
import o.isUsed;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/contract/promoquest/redeem/RedeemMissionPresenter;", "Lid/dana/contract/promoquest/redeem/RedeemMissionContract$Presenter;", "view", "Lid/dana/contract/promoquest/redeem/RedeemMissionContract$View;", "redeemMission", "Lid/dana/domain/promoquest/interactor/RedeemMission;", "(Lid/dana/contract/promoquest/redeem/RedeemMissionContract$View;Lid/dana/domain/promoquest/interactor/RedeemMission;)V", "onDestroy", "", "missionId", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTaskExecutor implements isUsed.length {
    /* access modifiers changed from: private */
    public final isUsed.getMax getMin;
    private final getTableName length;

    @Inject
    public getTaskExecutor(@NotNull isUsed.getMax getmax, @NotNull getTableName gettablename) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(gettablename, "redeemMission");
        this.getMin = getmax;
        this.length = gettablename;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/promoquest/redeem/RedeemMissionPresenter$redeemMission$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/promoquest/model/MissionRedeem;", "onError", "", "e", "", "onNext", "missionRedeem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends GriverAppVirtualHostProxy<GriverAppInfoPreDownloadStorage> {
        final /* synthetic */ getTaskExecutor setMin;

        setMax(getTaskExecutor gettaskexecutor) {
            this.setMin = gettaskexecutor;
        }

        public final /* synthetic */ void onNext(Object obj) {
            GriverAppInfoPreDownloadStorage griverAppInfoPreDownloadStorage = (GriverAppInfoPreDownloadStorage) obj;
            Intrinsics.checkNotNullParameter(griverAppInfoPreDownloadStorage, "missionRedeem");
            this.setMin.getMin.dismissProgress();
            List<GriverAMCSAppUpdater> prizeInfoList = griverAppInfoPreDownloadStorage.getPrizeInfoList();
            Intrinsics.checkNotNullExpressionValue(prizeInfoList, "missionRedeem.prizeInfoList");
            if (!prizeInfoList.isEmpty()) {
                isUsed.getMax min = this.setMin.getMin;
                List<GriverAMCSAppUpdater> prizeInfoList2 = griverAppInfoPreDownloadStorage.getPrizeInfoList();
                Intrinsics.checkNotNullExpressionValue(prizeInfoList2, "missionRedeem.prizeInfoList");
                Object first = CollectionsKt.first(prizeInfoList2);
                Intrinsics.checkNotNullExpressionValue(first, "missionRedeem.prizeInfoList.first()");
                min.getMin((GriverAMCSAppUpdater) first);
                return;
            }
            this.setMin.getMin.setMin();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.setMin.getMin.dismissProgress();
            this.setMin.getMin.setMin();
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        this.getMin.showProgress();
        this.length.execute(new setMax(this), getTableName.getMax.forRedeemMission(str));
    }

    public final void setMax() {
        this.length.dispose();
    }
}
