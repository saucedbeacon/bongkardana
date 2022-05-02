package o;

import java.util.Set;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/oauth/InputNameContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getScreenBrightness {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/oauth/InputNameContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckSkipButtonMerchantList", "", "merchantIdEnable", "", "", "onUpdateNameFailed", "errorMessage", "onUpdateNameSuccess", "isSuccess", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.getMax {
        void onCheckSkipButtonMerchantList(@NotNull Set<String> set);

        void onUpdateNameFailed(@Nullable String str);

        void onUpdateNameSuccess(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/oauth/InputNameContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkSkipButtonFeature", "", "updateName", "nickname", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.setMin {
        void getMax();

        void setMin(@NotNull String str);
    }
}
