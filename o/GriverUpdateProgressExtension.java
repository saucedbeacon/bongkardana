package o;

import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/promocode/RedeemPromoCodeContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface GriverUpdateProgressExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/promocode/RedeemPromoCodeContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "redeemCode", "", "code", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.setMin {
        void getMax(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/promocode/RedeemPromoCodeContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onErrorResult", "", "errorCode", "", "errorMessage", "code", "onRedeemResult", "prizeInfoEntity", "Lid/dana/domain/promoquest/model/PrizeInfoEntity;", "campaignId", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.getMax {
        void onErrorResult(@Nullable String str, @Nullable String str2, @NotNull String str3);

        void onRedeemResult(@NotNull String str, @Nullable GriverAMCSAppUpdater griverAMCSAppUpdater, @Nullable String str2);
    }
}
