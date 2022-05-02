package o;

import id.dana.domain.merchant.MerchantCategoryType;
import java.util.List;
import java.util.Map;
import o.TitleBarRightButtonView;

public interface com_alibaba_ariver_engine_api_ExtOpt$19$1 {
    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getMerchantCategories();

    TitleBarRightButtonView.AnonymousClass1<List<String>> getMerchantOrder(String str);

    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getMerchantSubcategories();

    TitleBarRightButtonView.AnonymousClass1<Map<String, String>> getMerchantTopups();

    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getNewMerchantCategories();

    TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(MerchantCategoryType merchantCategoryType);

    TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getNewMerchantSubCategories();
}
