package o;

import java.util.Map;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003H&J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00040\u0003H&J\u001c\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u001c\u0010\f\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0004H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lid/dana/data/merchant/repository/source/CacheMerchantCategoriesEntityData;", "", "getCachedNewMerchantCategories", "Lio/reactivex/Observable;", "", "", "Lid/dana/data/merchant/model/MerchantCategoryEntity;", "getCachedNewMerchantSubCategories", "Lid/dana/data/merchant/model/MerchantSubcategoryEntity;", "saveMerchantNewCategories", "", "merchantCategories", "saveMerchantNewSubCategories", "merchantSubCategories", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface bizCheckPermission {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getCachedNewMerchantCategories();

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getCachedNewMerchantSubCategories();

    void saveMerchantNewCategories(@NotNull Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$98$1> map);

    void saveMerchantNewSubCategories(@NotNull Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$99$1> map);
}
