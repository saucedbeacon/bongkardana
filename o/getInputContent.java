package o;

import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getInputContent {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onLoadMerchantPromo", "", "promoInfos", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "onLoadingMerchantInfoFail", "onLoadingMerchantInfoSuccess", "merchantInfoModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.getMax {
        void getMin(@NotNull OptionMenuRecyclerAdapter optionMenuRecyclerAdapter);

        void length(@NotNull List<? extends PromoInfoModel> list);

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantInfoContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getMerchantInfo", "", "shopId", "", "merchantId", "currentDayOfWeek", "getMerchantPromo", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.setMin {
        void getMax(@NotNull ShopModel shopModel);

        void setMax(@NotNull String str, @NotNull String str2, @NotNull String str3);
    }
}
