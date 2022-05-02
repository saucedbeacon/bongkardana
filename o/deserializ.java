package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class deserializ implements ServiceBeanManagerImpl {
    private final registerAndOverride promoAdsPreferences;
    private final RVPerfLogLifeCycleExtension promoCategoryPreferences;

    @Inject
    deserializ(RVPerfLogLifeCycleExtension rVPerfLogLifeCycleExtension, registerAndOverride registerandoverride) {
        this.promoCategoryPreferences = rVPerfLogLifeCycleExtension;
        this.promoAdsPreferences = registerandoverride;
    }

    public TitleBarRightButtonView.AnonymousClass1<transSyncThreadNames> getCategories(int i, int i2) {
        throw new UnsupportedOperationException("Unable to get categories with pagination on local data");
    }

    public transSyncThreadNames getCachedCategories() {
        return this.promoCategoryPreferences.getCategories();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveCategories(transSyncThreadNames transsyncthreadnames) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.promoCategoryPreferences.saveCategories(transsyncthreadnames)));
    }

    public TitleBarRightButtonView.AnonymousClass1<ByteArrayPools> queryAllPromo(int i, int i2, String str) {
        throw new UnsupportedOperationException("Unable to get promo on local data");
    }

    public TitleBarRightButtonView.AnonymousClass1<UsePermission> queryCategorizedPromo(List<String> list, int i, int i2, String str, String str2, double d, double d2) {
        throw new UnsupportedOperationException("Unable to get promo on local data");
    }

    public TitleBarRightButtonView.AnonymousClass1<Local> getPromoAds(int i, int i2, double d, double d2, int i3) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2089244545, oncanceled);
            onCancelLoad.getMin(-2089244545, oncanceled);
        }
        throw new UnsupportedOperationException("Unable to get promo ads on local data");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RVParams lambda$getUserLastCoordinate$0(String str) throws Exception {
        return this.promoAdsPreferences.getUserLastCoordinate(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<RVParams> getUserLastCoordinate(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new ObjSerializUtil(this, str)).onErrorReturn(unregister.getMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ RVParams lambda$getUserLastCoordinate$1(Throwable th) throws Exception {
        return new RVParams();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveUserLastCoordinate(String str, RVParams rVParams) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new register(this, str, rVParams));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveUserLastCoordinate$2(String str, RVParams rVParams) throws Exception {
        return Boolean.valueOf(this.promoAdsPreferences.saveUserLastCoordinate(str, rVParams));
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getCurrentAdsPageNumber(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(this.promoAdsPreferences.getCurrentAdsPageNumber(str)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveCurrentAdsPageNumber(String str, int i) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new unregisterAll(this, str, i));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveCurrentAdsPageNumber$3(String str, int i) throws Exception {
        this.promoAdsPreferences.saveCurrentAdsPageNumber(str, i);
        return Boolean.TRUE;
    }
}
