package o;

import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.domain.merchant.MerchantOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.GriverRVTransortServiceImpl;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
public class needPermissionCheck implements workerType {
    private final com_alibaba_ariver_app_api_ExtOpt$87$1 cacheMerchantCategoriesEntityDataFactory;
    private final com_alibaba_ariver_app_api_ExtOpt$92$1 merchantCategoriesEntityDataFactory;
    private final com_alibaba_ariver_app_api_ExtOpt$91$1 merchantCategoriesMapper;
    private final com_alibaba_ariver_app_api_ExtOpt$94$1 merchantSubcategoryMapper;

    /* access modifiers changed from: private */
    public static /* synthetic */ Iterable lambda$getMerchantCategories$1(List list) throws Exception {
        return list;
    }

    @Inject
    public needPermissionCheck(com_alibaba_ariver_app_api_ExtOpt$92$1 com_alibaba_ariver_app_api_extopt_92_1, com_alibaba_ariver_app_api_ExtOpt$91$1 com_alibaba_ariver_app_api_extopt_91_1, com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1, com_alibaba_ariver_app_api_ExtOpt$87$1 com_alibaba_ariver_app_api_extopt_87_1) {
        this.merchantCategoriesEntityDataFactory = com_alibaba_ariver_app_api_extopt_92_1;
        this.merchantCategoriesMapper = com_alibaba_ariver_app_api_extopt_91_1;
        this.merchantSubcategoryMapper = com_alibaba_ariver_app_api_extopt_94_1;
        this.cacheMerchantCategoriesEntityDataFactory = com_alibaba_ariver_app_api_extopt_87_1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> initMerchantCategoriesV2() {
        return getNewMerchantCategoryFromConfig().zipWith(getNewMerchantSubCategoryFromConfig(), manageAccessorGroup.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$initMerchantCategoriesV2$0(Map map, Map map2) throws Exception {
        return Boolean.valueOf(!map.isEmpty() && !map2.isEmpty());
    }

    public TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> getMerchantCategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createMerchantCategories().getMerchantCategories().onErrorResumeNext(defaultMerchantCategoriesIfEmpty()).flatMap(new asyncCheckPermission(this));
        com_alibaba_ariver_app_api_ExtOpt$91$1 com_alibaba_ariver_app_api_extopt_91_1 = this.merchantCategoriesMapper;
        Objects.requireNonNull(com_alibaba_ariver_app_api_extopt_91_1);
        return flatMap.map(new com_alibaba_ariver_engine_api_ExtOpt$25$1(com_alibaba_ariver_app_api_extopt_91_1));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantCategories$3(Map map) throws Exception {
        TitleBarRightButtonView.AnonymousClass1<U> filter = createMerchantCategories().getMerchantOrder(MerchantOrder.ALL).onErrorResumeNext(defaultCategoryIfEmpty(MerchantOrder.ALL)).flatMapIterable(onCallDispatch.length).filter(new com_alibaba_ariver_engine_api_ExtOpt$27$1(map));
        Objects.requireNonNull(map);
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1<List<R>> list = filter.map(new com_alibaba_ariver_engine_api_ExtOpt$29$1(map)).toList();
        if (list instanceof getSecondFloorView) {
            return ((getSecondFloorView) list).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(list);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getMerchantCategories$2(Map map, String str) throws Exception {
        return map.get(str) != null;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<download>> getMerchantSubcategories() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createMerchantCategories().getMerchantSubcategories().onErrorResumeNext(defaultMerchantSubcategoriesIfEmpty()).flatMap(onCreateWorkerException.length);
        com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1 = this.merchantSubcategoryMapper;
        Objects.requireNonNull(com_alibaba_ariver_app_api_extopt_94_1);
        return flatMap.map(new com_alibaba_ariver_engine_api_ExtOpt$30$1(com_alibaba_ariver_app_api_extopt_94_1));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ArrayList lambda$getMerchantSubcategories$4(Map map) throws Exception {
        return new ArrayList(map.values());
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>>> defaultMerchantSubcategoriesIfEmpty() {
        return new loadGlobalResource(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$defaultMerchantSubcategoriesIfEmpty$6(Throwable th) throws Exception {
        return createDefaultMerchantCategories().getMerchantSubcategories();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> getNewMerchantCategories(@NotNull MerchantCategoryType merchantCategoryType) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createCacheMerchantCategories().getCachedNewMerchantCategories().flatMap(getConfigNewMerchantCategoryIfEmpty()).flatMap(getOrderedNewMerchantCategories(merchantCategoryType));
        com_alibaba_ariver_app_api_ExtOpt$91$1 com_alibaba_ariver_app_api_extopt_91_1 = this.merchantCategoriesMapper;
        Objects.requireNonNull(com_alibaba_ariver_app_api_extopt_91_1);
        return flatMap.map(new com_alibaba_ariver_engine_api_ExtOpt$25$1(com_alibaba_ariver_app_api_extopt_91_1));
    }

    private RedDotDrawable<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>, TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>>> getConfigNewMerchantCategoryIfEmpty() {
        return new onReceivedResponseHeader(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getConfigNewMerchantCategoryIfEmpty$7(Map map) throws Exception {
        return map.isEmpty() ? getNewMerchantCategoryFromConfig() : TitleBarRightButtonView.AnonymousClass1.just(map);
    }

    private RedDotDrawable<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>, TitleBarRightButtonView.AnonymousClass1<List<com_alibaba_ariver_app_api_ExtOpt$98$1>>> getOrderedNewMerchantCategories(@NotNull MerchantCategoryType merchantCategoryType) {
        return new load(this, merchantCategoryType);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getOrderedNewMerchantCategories$10(MerchantCategoryType merchantCategoryType, Map map) throws Exception {
        return getMerchantCategoriesOrder(merchantCategoryType).flatMap(new onJsEngineErrorIntercept(map));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getOrderedNewMerchantCategories$9(Map map, List list) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 filter = TitleBarRightButtonView.AnonymousClass1.fromIterable(list).filter(new interceptBackEvent(map));
        Objects.requireNonNull(map);
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list2 = filter.map(new com_alibaba_ariver_engine_api_ExtOpt$29$1(map)).toList();
        if (list2 instanceof getSecondFloorView) {
            return ((getSecondFloorView) list2).setMax();
        }
        setTitleLoading settitleloading = new setTitleLoading(list2);
        RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
        return redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getOrderedNewMerchantCategories$8(Map map, String str) throws Exception {
        return map.get(str) != null;
    }

    private TitleBarRightButtonView.AnonymousClass1<List<String>> getMerchantCategoriesOrder(MerchantCategoryType merchantCategoryType) {
        return createMerchantCategories().getNewMerchantCategoryOrder(merchantCategoryType).onErrorResumeNext(getDefaultNewMerchantOrders(merchantCategoryType));
    }

    public TitleBarRightButtonView.AnonymousClass1<List<download>> getNewMerchantSubCategories() {
        TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> newMerchantSubCategoriesMap = getNewMerchantSubCategoriesMap();
        com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1 = this.merchantSubcategoryMapper;
        Objects.requireNonNull(com_alibaba_ariver_app_api_extopt_94_1);
        return newMerchantSubCategoriesMap.map(new com_alibaba_ariver_engine_api_ExtOpt$31$1(com_alibaba_ariver_app_api_extopt_94_1));
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getNewMerchantSubCategoriesMap() {
        return createCacheMerchantCategories().getCachedNewMerchantSubCategories().flatMap(getConfigNewMerchantSubCategoryIfEmpty()).flatMap(getNewMerchantSubCategoriesMappedToCategory());
    }

    private RedDotDrawable<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>, TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>>> getConfigNewMerchantSubCategoryIfEmpty() {
        return new onResourceResponse(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getConfigNewMerchantSubCategoryIfEmpty$11(Map map) throws Exception {
        return map.isEmpty() ? getNewMerchantSubCategoryFromConfig() : TitleBarRightButtonView.AnonymousClass1.just(map);
    }

    private RedDotDrawable<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>, TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>>> getNewMerchantSubCategoriesMappedToCategory() {
        return new needIntercept(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$getNewMerchantSubCategoriesMappedToCategory$12(Map map) throws Exception {
        return createCacheMerchantCategories().getCachedNewMerchantCategories().flatMap(getConfigNewMerchantCategoryIfEmpty()).flatMap(mapNewSubCategories(map));
    }

    private RedDotDrawable<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>, TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>>> mapNewSubCategories(Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1> map) {
        return new handleNotFound(map);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$mapNewSubCategories$13(Map map, Map map2) throws Exception {
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getValue() == null || ((com_alibaba_ariver_app_api_ExtOpt$98$1) entry.getValue()).mccCodes == null)) {
                for (String next : ((com_alibaba_ariver_app_api_ExtOpt$98$1) entry.getValue()).mccCodes) {
                    com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) map2.get(next);
                    if (com_alibaba_ariver_app_api_extopt_99_1 != null && !com_alibaba_ariver_app_api_extopt_99_1.categoryIds.contains(next)) {
                        com_alibaba_ariver_app_api_extopt_99_1.categoryIds.add((String) entry.getKey());
                    }
                }
            }
        }
        return map2;
    }

    private TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getNewMerchantCategoryFromConfig() {
        return createMerchantCategories().getNewMerchantCategories().onErrorResumeNext(getDefaultNewMerchantCategories()).flatMap(new com_alibaba_ariver_engine_api_ExtOpt$21$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantCategoryFromConfig$16(Map map) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new onInvoke(this, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$getNewMerchantCategoryFromConfig$15(Map map) throws Exception {
        createCacheMerchantCategories().saveMerchantNewCategories(map);
        return map;
    }

    private TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getNewMerchantSubCategoryFromConfig() {
        return createMerchantCategories().getNewMerchantSubCategories().onErrorResumeNext(getDefaultNewMerchantSubCategories()).flatMap(new com_alibaba_ariver_engine_api_ExtOpt$20$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantSubCategoryFromConfig$18(Map map) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new com_alibaba_ariver_engine_api_ExtOpt$24$1(this, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$getNewMerchantSubCategoryFromConfig$17(Map map) throws Exception {
        createCacheMerchantCategories().saveMerchantNewSubCategories(map);
        return map;
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>>> defaultMerchantCategoriesIfEmpty() {
        return new onSendBack(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$defaultMerchantCategoriesIfEmpty$19(Throwable th) throws Exception {
        return createDefaultMerchantCategories().getMerchantCategories();
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<List<String>>> defaultCategoryIfEmpty(String str) {
        return new com_alibaba_ariver_engine_api_ExtOpt$23$1(this, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$defaultCategoryIfEmpty$20(String str, Throwable th) throws Exception {
        return createDefaultMerchantCategories().getMerchantOrder(str);
    }

    private com_alibaba_ariver_engine_api_ExtOpt$19$1 createMerchantCategories() {
        return this.merchantCategoriesEntityDataFactory.createData("network");
    }

    private com_alibaba_ariver_engine_api_ExtOpt$19$1 createDefaultMerchantCategories() {
        return this.merchantCategoriesEntityDataFactory.createData("local");
    }

    @NotNull
    private bizCheckPermission createCacheMerchantCategories() {
        return this.cacheMerchantCategoriesEntityDataFactory.createData("local");
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>>> getDefaultNewMerchantCategories() {
        return new com_alibaba_ariver_engine_api_ExtOpt$22$1(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDefaultNewMerchantCategories$21(Throwable th) throws Exception {
        return createDefaultMerchantCategories().getNewMerchantCategories();
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>>> getDefaultNewMerchantSubCategories() {
        return new onWorkerErrorIntercept(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDefaultNewMerchantSubCategories$22(Throwable th) throws Exception {
        return createDefaultMerchantCategories().getNewMerchantSubCategories();
    }

    private RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<List<String>>> getDefaultNewMerchantOrders(MerchantCategoryType merchantCategoryType) {
        return new onHandleResponse(this, merchantCategoryType);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getDefaultNewMerchantOrders$23(MerchantCategoryType merchantCategoryType, Throwable th) throws Exception {
        return createDefaultMerchantCategories().getNewMerchantCategoryOrder(merchantCategoryType);
    }
}
