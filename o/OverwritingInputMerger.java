package o;

import id.dana.data.constant.BranchLinkConstant;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.RxWorker;
import o.queryAppInfos;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0004\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/contract/promoquest/redeem/RedeemQuestPresenter;", "Lid/dana/contract/promoquest/redeem/RedeemQuestContract$Presenter;", "view", "Lid/dana/contract/promoquest/redeem/RedeemQuestContract$View;", "redeemQuest", "Lid/dana/domain/promoquest/interactor/RedeemQuest;", "(Lid/dana/contract/promoquest/redeem/RedeemQuestContract$View;Lid/dana/domain/promoquest/interactor/RedeemQuest;)V", "onDestroy", "", "missionId", "", "questId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OverwritingInputMerger implements RxWorker.setMin {
    private final queryAppInfos getMax;
    /* access modifiers changed from: private */
    public final RxWorker.getMin getMin;

    @Inject
    public OverwritingInputMerger(@NotNull RxWorker.getMin getmin, @NotNull queryAppInfos queryappinfos) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        Intrinsics.checkNotNullParameter(queryappinfos, "redeemQuest");
        this.getMin = getmin;
        this.getMax = queryappinfos;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/promoquest/redeem/RedeemQuestPresenter$redeemQuest$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/promoquest/model/QuestRedeem;", "onError", "", "e", "", "onNext", "redeemQuest", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<GriverAppSQLiteStorage> {
        final /* synthetic */ OverwritingInputMerger getMax;

        getMax(OverwritingInputMerger overwritingInputMerger) {
            this.getMax = overwritingInputMerger;
        }

        public final /* synthetic */ void onNext(Object obj) {
            GriverAppSQLiteStorage griverAppSQLiteStorage = (GriverAppSQLiteStorage) obj;
            Intrinsics.checkNotNullParameter(griverAppSQLiteStorage, "redeemQuest");
            this.getMax.getMin.dismissProgress();
            List<GriverAMCSAppUpdater> prizeInfoList = griverAppSQLiteStorage.getPrizeInfoList();
            Intrinsics.checkNotNullExpressionValue(prizeInfoList, "redeemQuest.prizeInfoList");
            if (!prizeInfoList.isEmpty()) {
                RxWorker.getMin max = this.getMax.getMin;
                List<GriverAMCSAppUpdater> prizeInfoList2 = griverAppSQLiteStorage.getPrizeInfoList();
                Intrinsics.checkNotNullExpressionValue(prizeInfoList2, "redeemQuest.prizeInfoList");
                Object first = CollectionsKt.first(prizeInfoList2);
                Intrinsics.checkNotNullExpressionValue(first, "redeemQuest.prizeInfoList.first()");
                max.length((GriverAMCSAppUpdater) first);
                return;
            }
            this.getMax.getMin.getMax();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.getMin.dismissProgress();
            this.getMax.getMin.getMax();
        }
    }

    public final void length(@NotNull String str, @NotNull String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1503766095, oncanceled);
            onCancelLoad.getMin(1503766095, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.Params.MISSION_ID);
        Intrinsics.checkNotNullParameter(str2, "questId");
        this.getMin.showProgress();
        this.getMax.execute(new getMax(this), queryAppInfos.getMax.forRedeemQuest(str, str2));
    }

    public final void setMax() {
        this.getMax.dispose();
    }
}
