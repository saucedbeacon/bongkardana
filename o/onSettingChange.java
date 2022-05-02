package o;

import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.onDelete;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface onSettingChange {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "disableUserReviewCoachmarkVisiblity", "", "disposeMerchantAverageRating", "getMerchantAverageRating", "merchantId", "", "shopId", "getMerchantReviewForm", "getUserAccount", "getUserReviewCoachmarkVisiblity", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends onDelete.getMin {
        void getMax();

        void getMin();

        void getMin(@NotNull String str, @NotNull String str2);

        void length();

        void length(@NotNull String str);

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantAverageRatingContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "getMerchantReviewFormFail", "", "getMerchantReviewFormSuccess", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "onGetUserAccount", "userAccount", "Lid/dana/domain/account/Account;", "onGetUserReviewCoachmarkVisibility", "shouldVisible", "", "onLoadingMerchantAverageRatingFail", "onLoadingMerchantAverageRatingSuccess", "merchantReviewSummaryModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewSummaryModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.getMax {
        void getMin(@NotNull MerchantConsultReviewModel merchantConsultReviewModel);

        void getMin(@NotNull onStateChange onstatechange);

        void length();

        @JvmDefault
        void length(@Nullable GriverCommonResourceProxy griverCommonResourceProxy);

        void setMax();

        @JvmDefault
        void setMin(boolean z);
    }
}
