package o;

import android.content.Intent;
import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/contract/services/ServicesContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface style {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0017J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0017J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0017J\u0016\u0010\u0012\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0017J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0017J\u0016\u0010\u0015\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0017J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\rH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lid/dana/contract/services/ServicesContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onActionFailed", "", "message", "", "onActionGet", "thirdPartyService", "Lid/dana/model/ThirdPartyService;", "onActionPost", "authCode", "onCheckFavoriteServicesFeature", "enable", "", "onEmptySearchService", "onFeatureServices", "thirdPartyServices", "", "onGetFilteredThirdPartyServices", "", "onGetInitThirdPartyServices", "onGetThirdPartyServices", "onMaintenanceAction", "onShowTooltip", "show", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.getMax {
        @JvmDefault
        void getMax(@NotNull ThirdPartyService thirdPartyService);

        @JvmDefault
        void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str);

        @JvmDefault
        void getMax(@NotNull List<ThirdPartyService> list);

        @JvmDefault
        void getMin(@NotNull List<ThirdPartyService> list);

        @JvmDefault
        void length();

        @JvmDefault
        void setMax(@NotNull List<ThirdPartyService> list);

        @JvmDefault
        void setMax(boolean z);

        @JvmDefault
        void setMin();

        @JvmDefault
        void setMin(@NotNull ThirdPartyService thirdPartyService);

        @JvmDefault
        void setMin(@NotNull List<ThirdPartyService> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&JL\u0010\u000b\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\rH&J\u001a\u0010\u0014\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0003H\u0017J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\rH\u0017J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\nH&J\u001e\u0010\u0017\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0006\u0010\u0018\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\u0003H&J\b\u0010\u001d\u001a\u00020\u0003H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\rH&J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH&J\u001e\u0010 \u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0006\u0010\"\u001a\u00020\rH\u0017J&\u0010 \u001a\u00020\u00032\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001b2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\nH&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\rH&J\u0018\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\n2\u0006\u0010%\u001a\u00020\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lid/dana/contract/services/ServicesContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkFavoriteServicesFeature", "", "consultAndOpenEmoney", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "immediateOpen", "", "consultAndOpenMiniProgram", "action", "", "params", "", "extendedInfo", "Lorg/json/JSONObject;", "destinationPath", "orderId", "doAction", "thirdPartyService", "Lid/dana/model/ThirdPartyService;", "getCategoryServices", "isExcludeHeader", "categoryKey", "categoryKeys", "", "getFeatureServices", "getInitThirdPartyServices", "getSearchedServices", "query", "getThirdPartyServicesFilterBy", "csvNames", "filterBy", "names", "isNeedToShowToolTip", "scenario", "saveShowToolTip", "hasShown", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void getMax();

        void getMax(@NotNull ThirdPartyService thirdPartyService);

        void getMax(@NotNull String str);

        void getMax(@NotNull List<String> list, @NotNull String str, boolean z);

        void getMin();

        void getMin(@NotNull String str);

        @JvmDefault
        void length();

        void length(@Nullable Intent intent, boolean z);

        @JvmDefault
        void length(@NotNull String str);

        void length(@NotNull List<String> list);

        void length(boolean z);

        void setMax(@NotNull String str);

        void setMin();

        void setMin(@NotNull String str);

        void setMin(@NotNull String str, @NotNull String str2);
    }
}
