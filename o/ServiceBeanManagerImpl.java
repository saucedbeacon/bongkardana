package o;

import java.util.List;
import o.TitleBarRightButtonView;

public interface ServiceBeanManagerImpl {
    transSyncThreadNames getCachedCategories();

    TitleBarRightButtonView.AnonymousClass1<transSyncThreadNames> getCategories(int i, int i2);

    TitleBarRightButtonView.AnonymousClass1<Integer> getCurrentAdsPageNumber(String str);

    TitleBarRightButtonView.AnonymousClass1<Local> getPromoAds(int i, int i2, double d, double d2, int i3);

    TitleBarRightButtonView.AnonymousClass1<RVParams> getUserLastCoordinate(String str);

    TitleBarRightButtonView.AnonymousClass1<ByteArrayPools> queryAllPromo(int i, int i2, String str);

    TitleBarRightButtonView.AnonymousClass1<UsePermission> queryCategorizedPromo(List<String> list, int i, int i2, String str, String str2, double d, double d2);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveCategories(transSyncThreadNames transsyncthreadnames);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentAdsPageNumber(String str, int i);

    TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserLastCoordinate(String str, RVParams rVParams);
}
