package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.EngineUtils;
import o.TitleBarRightButtonView;

public class getAppxDomain implements pushEnginePorxy, unRegisterRender {
    private static final String NEARBY_RADIUS = "radius";
    private static final String NEARBY_RATING = "rating";
    private static final String NEARBY_REVIEW = "review";
    public static final String NEARBY_V2_RANKING_DEFAULT = "json/amcs-nearby-ranking-default.json";
    private static final HashMap<String, EngineUtils.AnonymousClass2.AnonymousClass1> nearbyPromoCache = new HashMap<>();
    private final Context context;
    private final setCallMode nearbyMePreferences;
    private final PluginInstallCallback serializer;

    public TitleBarRightButtonView.AnonymousClass1<EngineSetupCallback> getOtherShopList(String str, double d, double d2, int i, int i2, String str2, String str3) {
        return null;
    }

    @Inject
    public getAppxDomain(Context context2, setCallMode setcallmode, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.nearbyMePreferences = setcallmode;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithPagination(double d, double d2, int i, int i2, String str) {
        String nearbyShopsWithPagination = this.nearbyMePreferences.getNearbyShopsWithPagination();
        if (TextUtils.isEmpty(nearbyShopsWithPagination)) {
            return TitleBarRightButtonView.AnonymousClass1.just(new generateUniqueId());
        }
        return TitleBarRightButtonView.AnonymousClass1.just((generateUniqueId) this.serializer.deserialize(nearbyShopsWithPagination, generateUniqueId.class));
    }

    public TitleBarRightButtonView.AnonymousClass1<generateUniqueId> getNearbyMeWithRadius(double d, double d2, int i, int i2, int i3, String str, String str2) {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> saveNearbyShops(H5FileUtil h5FileUtil) {
        if (h5FileUtil == null) {
            return TitleBarRightButtonView.AnonymousClass1.just(H5FileUtil.empty());
        }
        this.nearbyMePreferences.setNearbyShopsWithPagination(this.serializer.serialize(h5FileUtil));
        return TitleBarRightButtonView.AnonymousClass1.just(h5FileUtil);
    }

    public TitleBarRightButtonView.AnonymousClass1<EngineInitCallback> getNearbyMerchantPromo(List<ApiContext> list) {
        EngineInitCallback engineInitCallback = new EngineInitCallback();
        if (list != null) {
            for (ApiContext apiContext : list) {
                EngineUtils.AnonymousClass2.AnonymousClass1 r1 = nearbyPromoCache.get(apiContext.merchantId);
                if (r1 != null) {
                    engineInitCallback.getShops().add(r1);
                }
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(engineInitCallback);
    }

    public void saveNearbyPromoResult(EngineInitCallback engineInitCallback) {
        if (engineInitCallback.getShops() != null && !engineInitCallback.getShops().isEmpty()) {
            for (EngineUtils.AnonymousClass2.AnonymousClass1 next : engineInitCallback.getShops()) {
                nearbyPromoCache.put(next.getMerchantId(), next);
            }
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(!this.nearbyMePreferences.getToolTipShow(str)));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip(String str) {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.nearbyMePreferences.saveToolTipShow(str)));
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyConfig(String str) {
        if (!TextUtils.isEmpty(str)) {
            return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getStatData(this, str));
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ clearTempPath lambda$getDefaultNearbyConfig$0(String str) throws Exception {
        String str2;
        if ("ranking_v2".equals(str)) {
            str2 = getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_NEARBY_RANKING_CONFIG);
        } else {
            str2 = getPositiveString.loadJSONFromAsset(this.context, NEARBY_V2_RANKING_DEFAULT);
        }
        Map<String, Integer> deserializeMaps = this.serializer.deserializeMaps(str2);
        return new clearTempPath(deserializeMaps.get("radius"), deserializeMaps.get(NEARBY_RATING).intValue(), deserializeMaps.get(NEARBY_REVIEW).intValue());
    }
}
