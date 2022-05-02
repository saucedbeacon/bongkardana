package o;

import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.g;
import o.onDelete;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/MerchantContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface GetAboutInfoResult {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J \u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/MerchantContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "checkMerchantFilterFeatureEnable", "", "getMerchantCategories", "getNewMerchantCategories", "merchantCategoryType", "Lid/dana/domain/merchant/MerchantCategoryType;", "initNewMerchantCategories", "setShopModels", "shopModels", "", "Lid/dana/nearbyme/model/ShopModel;", "currentPage", "", "setupMerchantMapsObservable", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends onDelete.getMin {
        void getMax();

        void getMax(@NotNull List<ShopModel> list, int i);

        void getMin();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\u0003H\u0017J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017J\u0016\u0010\u000f\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/MerchantContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckMerchantFilterFeatureEnableSuccess", "", "enable", "", "onErrorGetNewMerchantCategories", "merchantCategoryType", "Lid/dana/domain/merchant/MerchantCategoryType;", "onFinishInitMerchantCategories", "onGetMerchantCategories", "merchantCategoryModels", "", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "onGetNewMerchantListCategories", "onGetNewMerchantMapsCategories", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.getMax {
        @JvmDefault
        void getMin(@NotNull List<g.AnonymousClass1> list);

        @JvmDefault
        void length(@NotNull MerchantCategoryType merchantCategoryType);

        @JvmDefault
        void onCheckMerchantFilterFeatureEnableSuccess(boolean z);

        @JvmDefault
        void onGetMerchantCategories(@NotNull List<g.AnonymousClass1> list);

        @JvmDefault
        void setMax(@NotNull List<g.AnonymousClass1> list);
    }
}
