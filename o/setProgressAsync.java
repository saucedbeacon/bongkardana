package o;

import id.dana.promoquest.model.MissionModel;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/mission/MissionListContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setProgressAsync {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/mission/MissionListContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "fetchMissionsFirstTime", "", "reloadActiveMissions", "reloadPastMissions", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void getMax();

        void length();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/contract/promoquest/mission/MissionListContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "dismisssActiveMissionProgress", "", "dismisssPastMissionProgress", "onFetchActiveMissionFailed", "errorMessage", "", "onFetchActiveMissionSucceeded", "missionModels", "", "Lid/dana/promoquest/model/MissionModel;", "onFetchPastMissionFailed", "onFetchPastMissionSucceeded", "showActiveMissionProgress", "showPastMissionProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.getMax {
        void dismisssActiveMissionProgress();

        void dismisssPastMissionProgress();

        void onFetchActiveMissionFailed(@Nullable String str);

        void onFetchActiveMissionSucceeded(@NotNull List<MissionModel> list);

        void onFetchPastMissionFailed(@Nullable String str);

        void onFetchPastMissionSucceeded(@NotNull List<MissionModel> list);

        void showActiveMissionProgress();

        void showPastMissionProgress();
    }
}
