package o;

import id.dana.promoquest.model.MissionModel;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionSummaryContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getBackgroundExecutor {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001e\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionSummaryContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckPromoQuestFeature", "", "promoQuestFeatureEnable", "", "onFailedGetMissionSummaries", "onSuccessGetMissionSummaries", "missionSummaryModels", "", "Lid/dana/promoquest/model/MissionModel;", "referralQuestExists", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.getMax {
        void getMax();

        void getMax(@NotNull List<MissionModel> list, boolean z);

        void setMax(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/quest/MissionSummaryContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkPromoQuestFeature", "", "getMissionSummaries", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.setMin {
        void length();

        void setMin();
    }
}
