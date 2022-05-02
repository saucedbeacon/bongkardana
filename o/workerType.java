package o;

import id.dana.domain.merchant.MerchantCategoryType;
import java.util.List;
import o.GriverRVTransortServiceImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

public interface workerType {
    TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> getMerchantCategories();

    TitleBarRightButtonView.AnonymousClass1<List<download>> getMerchantSubcategories();

    TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> getNewMerchantCategories(@NotNull MerchantCategoryType merchantCategoryType);

    TitleBarRightButtonView.AnonymousClass1<List<download>> getNewMerchantSubCategories();

    TitleBarRightButtonView.AnonymousClass1<Boolean> initMerchantCategoriesV2();
}
