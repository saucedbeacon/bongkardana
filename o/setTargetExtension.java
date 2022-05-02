package o;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import id.dana.domain.foundation.logger.PerformanceConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import o.EngineRouter;
import o.EngineUtils;
import o.TitleBarRightButtonView;
import o.Worker;
import o.b;
import org.jetbrains.annotations.NotNull;

public class setTargetExtension extends setMinProgress implements isRooted {
    private final handleMessage amcsConfigEntityData;
    private final SendToWorkerCallback cacheNearbyPromoFactory;
    private final needPermissionCheck merchantCategoriesEntityRepository;
    private final com_alibaba_ariver_app_api_ExtOpt$92$1 merchantCategoryDataFactory;
    private final createEngine merchantInfoMapper;
    private final newError nearbyMeDataFactory;
    private final postOnWorker nearbyPromoResultMapper;
    private final getUserAgentSuffix otherStoreListResultMapper;
    private final EngineUtils shopsResultMapper;
    private final AppUtils splitConfigEntityData;

    @Inject
    public setTargetExtension(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, newError newerror, EngineUtils engineUtils, createEngine createengine, postOnWorker postonworker, getUserAgentSuffix getuseragentsuffix, needPermissionCheck needpermissioncheck, getAppLaunchParams getapplaunchparams, com_alibaba_ariver_app_api_ExtOpt$92$1 com_alibaba_ariver_app_api_extopt_92_1, handleMessage handlemessage, AppUtils appUtils, SendToWorkerCallback sendToWorkerCallback) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.nearbyMeDataFactory = newerror;
        this.shopsResultMapper = engineUtils;
        this.merchantCategoryDataFactory = com_alibaba_ariver_app_api_extopt_92_1;
        this.merchantInfoMapper = createengine;
        this.nearbyPromoResultMapper = postonworker;
        this.otherStoreListResultMapper = getuseragentsuffix;
        this.amcsConfigEntityData = handlemessage;
        this.splitConfigEntityData = appUtils;
        this.cacheNearbyPromoFactory = sendToWorkerCallback;
        this.merchantCategoriesEntityRepository = needpermissioncheck;
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfig(@NotNull String str) {
        if (TextUtils.isEmpty(str)) {
            throw new UnsupportedOperationException();
        } else if ("ranking_v1".equals(str)) {
            return this.amcsConfigEntityData.getNearbyRankingConfig().onErrorResumeNext(retryNearbyMeWithDefault());
        } else {
            return this.splitConfigEntityData.getNearbyRankingConfigV2().startWith(createNearbyMeLocalFactory().getDefaultNearbyConfig(str));
        }
    }

    @NotNull
    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getDefaultNearbyRankingConfig(@NotNull String str) {
        return createNearbyMeLocalFactory().getDefaultNearbyConfig(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getCachedNearbyShops() {
        TitleBarRightButtonView.AnonymousClass1<generateUniqueId> nearbyMeWithPagination = createNearbyMeLocalFactory().getNearbyMeWithPagination(0.0d, 0.0d, 0, 0, "");
        EngineUtils engineUtils = this.shopsResultMapper;
        Objects.requireNonNull(engineUtils);
        return nearbyMeWithPagination.map(new sendMessageToWorker(engineUtils));
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getNearbyShops(double d, double d2, int i, int i2, @NotNull String str, boolean z, String str2) {
        boolean z2 = z;
        return authenticatedRequest(createNearbyMeDataFactory().getNearbyMeWithPagination(d, d2, i, i2, str).zipWith(getMerchantSubcategories(z2), new sendJsonToWorker(this)).zipWith(getMerchantTopupAgent(), new sendNotGrantPermission(this)).flatMap(new sendSilentDenyPermission(this, z2, d, d2)).doOnNext(new EngineRouter(this, str2)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ generateUniqueId lambda$getNearbyShops$0(generateUniqueId generateuniqueid, Map map) throws Exception {
        this.shopsResultMapper.setMerchantSubcategory(map);
        return generateuniqueid;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ generateUniqueId lambda$getNearbyShops$1(generateUniqueId generateuniqueid, Map map) throws Exception {
        this.shopsResultMapper.setMerchantInstId(map);
        return generateuniqueid;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNearbyShops$2(boolean z, double d, double d2, generateUniqueId generateuniqueid) throws Exception {
        this.shopsResultMapper.setUsingNewMerchantCategories(z);
        return TitleBarRightButtonView.AnonymousClass1.just(sortByDistance(this.shopsResultMapper.apply(d, d2, generateuniqueid)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getNearbyShops$3(String str, H5FileUtil h5FileUtil) throws Exception {
        if (PerformanceConstant.PAGE_HOME.equals(str)) {
            createNearbyMeLocalFactory().saveNearbyShops(h5FileUtil);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<H5FileUtil> getNearbyShopByRadius(Location location, int i, int i2, int i3, boolean z, boolean z2, String str, String str2) {
        Location location2 = location;
        return authenticatedRequest(createNearbyMeDataFactory().getNearbyMeWithRadius(location.getLatitude(), location.getLongitude(), i, i3, i2, str, str2).flatMap(new NativeBridge(this, z, location, i2, i3)).map(new sendToNative(this, location2, i)).flatMap(new bindEngineRouter(this, z2, location2)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNearbyShopByRadius$4(boolean z, Location location, int i, int i2, generateUniqueId generateuniqueid) throws Exception {
        if ((generateuniqueid.getShops() == null || generateuniqueid.getShops().isEmpty()) && z) {
            return createNearbyMeLocalFactory().getNearbyMeWithPagination(location.getLatitude(), location.getLongitude(), i, i2, "");
        }
        return TitleBarRightButtonView.AnonymousClass1.just(generateuniqueid);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ generateUniqueId lambda$getNearbyShopByRadius$5(Location location, int i, generateUniqueId generateuniqueid) throws Exception {
        generateuniqueid.setShops(getFilteredShopEntities(generateuniqueid.getShops(), location, i));
        return generateuniqueid;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getNearbyShopByRadius$7(boolean z, Location location, generateUniqueId generateuniqueid) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.zip(getMerchantSubcategories(z), getMerchantTopupAgent(), new EngineRouter.RenderInitListener(this, z, location, generateuniqueid));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ H5FileUtil lambda$getNearbyShopByRadius$6(boolean z, Location location, generateUniqueId generateuniqueid, Map map, Map map2) throws Exception {
        this.shopsResultMapper.setUsingNewMerchantCategories(z);
        this.shopsResultMapper.setMerchantSubcategory(map);
        this.shopsResultMapper.setMerchantInstId(map2);
        return sortByDistance(this.shopsResultMapper.apply(location.getLatitude(), location.getLongitude(), generateuniqueid));
    }

    private List<Render> getFilteredShopEntities(List<Render> list, Location location, int i) {
        ArrayList arrayList = new ArrayList();
        for (Render next : list) {
            if (isWithinRadius(next, location, (float) i)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private boolean isWithinRadius(Render render, Location location, float f) {
        Location location2 = new Location("");
        location2.setLatitude(render.getLatitude());
        location2.setLongitude(render.getLongtitude());
        return location.distanceTo(location2) <= f;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getTempPath>> getNearbyShopsPromo(List<getUtdidEncrypt> list) {
        ArrayList arrayList = new ArrayList();
        List list2 = (List) this.merchantInfoMapper.apply(list);
        return createNearbyMeLocalFactory().getNearbyMerchantPromo(list2).map(new RenderBridge(this, arrayList)).map(removeMerchantInfoFoundInCache(list2)).flatMap(new NativeCallNotFoundPoint(this, list2, arrayList));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EngineInitCallback lambda$getNearbyShopsPromo$8(List list, EngineInitCallback engineInitCallback) throws Exception {
        list.addAll((Collection) this.nearbyPromoResultMapper.apply(engineInitCallback));
        return engineInitCallback;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNearbyShopsPromo$10(List list, List list2, List list3) throws Exception {
        if (list.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.just(list2);
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = getMerchantPromoFromBackend(list).map(saveMerchantPromoToCache());
        postOnWorker postonworker = this.nearbyPromoResultMapper;
        Objects.requireNonNull(postonworker);
        return map.map(new sendUserNotGrantPermission(postonworker)).map(new onRenderInit(list2));
    }

    @NonNull
    private RedDotDrawable<EngineInitCallback, List<ApiContext>> removeMerchantInfoFoundInCache(List<ApiContext> list) {
        return new Worker.WorkerReadyListener(list);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$removeMerchantInfoFoundInCache$11(List list, EngineInitCallback engineInitCallback) throws Exception {
        for (EngineUtils.AnonymousClass2.AnonymousClass1 next : engineInitCallback.getShops()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ApiContext) it.next()).merchantId.equals(next.getMerchantId())) {
                    it.remove();
                }
            }
        }
        return list;
    }

    @NonNull
    private TitleBarRightButtonView.AnonymousClass1<EngineInitCallback> getMerchantPromoFromBackend(List<ApiContext> list) {
        return authenticatedRequest(createNearbyMeDataFactory().getNearbyMerchantPromo(list));
    }

    @NonNull
    private RedDotDrawable<EngineInitCallback, EngineInitCallback> saveMerchantPromoToCache() {
        return new BridgeResponseHelper(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EngineInitCallback lambda$saveMerchantPromoToCache$12(EngineInitCallback engineInitCallback) throws Exception {
        createCacheNearbyPromo().saveNearbyPromoResult(engineInitCallback);
        return engineInitCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<getCachePath> getOtherStoreList(String str, double d, double d2, int i, int i2, String str2, String str3, boolean z) {
        boolean z2 = z;
        return authenticatedRequest(createNearbyMeDataFactory().getOtherShopList(str, d, d2, i2, i, str2, str3).zipWith(getMerchantSubcategories(z2), new sendSuccess(this, z2)).zipWith(getMerchantTopupAgent(), new sendBridgeResultWithCallbackKept(this)).flatMap(new sendBridgeResult(this, d, d2)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EngineSetupCallback lambda$getOtherStoreList$13(boolean z, EngineSetupCallback engineSetupCallback, Map map) throws Exception {
        this.shopsResultMapper.setUsingNewMerchantCategories(z);
        this.shopsResultMapper.setMerchantSubcategory(map);
        return engineSetupCallback;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ EngineSetupCallback lambda$getOtherStoreList$14(EngineSetupCallback engineSetupCallback, Map map) throws Exception {
        this.shopsResultMapper.setMerchantInstId(map);
        return engineSetupCallback;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getOtherStoreList$15(double d, double d2, EngineSetupCallback engineSetupCallback) throws Exception {
        this.shopsResultMapper.setCurrentMarkerLocation(d, d2);
        getCachePath apply = this.otherStoreListResultMapper.apply(d, d2, engineSetupCallback);
        apply.setShops(this.shopsResultMapper.transform(engineSetupCallback.getShops()));
        return TitleBarRightButtonView.AnonymousClass1.just(apply);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isNeedToShowOnboardingTooltip() {
        return getPhoneNumber().flatMap(new executeSendBack(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$isNeedToShowOnboardingTooltip$16(String str) throws Exception {
        return createNearbyMeLocalFactory().isNeedToShowOnboardingTooltip(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveShowOnboardingTooltip() {
        return getPhoneNumber().flatMap(new getInnerBridgeResponse(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$saveShowOnboardingTooltip$17(String str) throws Exception {
        return createNearbyMeLocalFactory().saveShowOnboardingTooltip(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<getCacheDir> getNearbyAutoSearchConfig() {
        return this.amcsConfigEntityData.getNearbyAutoSearchConfig();
    }

    private TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        return createAccountData().getAccount().map(sendNoRigHtToInvoke4NewJSAPIPermission.length);
    }

    private pushEnginePorxy createNearbyMeDataFactory() {
        return this.nearbyMeDataFactory.createData("network");
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getMerchantSubcategories(boolean z) {
        if (z) {
            return this.merchantCategoriesEntityRepository.getNewMerchantSubCategoriesMap();
        }
        return authenticatedRequest(createMerchantCategoryDataFactory().getMerchantSubcategories()).onErrorResumeNext(createDefaultMerchantCategories().getMerchantSubcategories());
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, String>> getMerchantTopupAgent() {
        return authenticatedRequest(createMerchantCategoryDataFactory().getMerchantTopups()).onErrorResumeNext(createDefaultMerchantCategories().getMerchantTopups()).flatMap(new sendNoRigHtToInvoke(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getMerchantTopupAgent$18(Map map) throws Exception {
        if (map.isEmpty()) {
            return createDefaultMerchantCategories().getMerchantTopups();
        }
        return TitleBarRightButtonView.AnonymousClass1.just(map);
    }

    private H5FileUtil sortByDistance(H5FileUtil h5FileUtil) {
        if (h5FileUtil != null) {
            Collections.sort(h5FileUtil.getShops(), sendNotFound.length);
        }
        return h5FileUtil;
    }

    private com_alibaba_ariver_engine_api_ExtOpt$19$1 createMerchantCategoryDataFactory() {
        return this.merchantCategoryDataFactory.createData("network");
    }

    private com_alibaba_ariver_engine_api_ExtOpt$19$1 createDefaultMerchantCategories() {
        return this.merchantCategoryDataFactory.createData("local");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$retryNearbyMeWithDefault$20(Throwable th) throws Exception {
        return authenticatedRequest(createNearbyMeLocalFactory().getDefaultNearbyConfig("ranking_v1"));
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends clearTempPath>> retryNearbyMeWithDefault() {
        return new sendError(this);
    }

    private pushEnginePorxy createNearbyMeLocalFactory() {
        return this.nearbyMeDataFactory.createData("local");
    }

    private unRegisterRender createCacheNearbyPromo() {
        return this.cacheNearbyPromoFactory.createData("local");
    }
}
