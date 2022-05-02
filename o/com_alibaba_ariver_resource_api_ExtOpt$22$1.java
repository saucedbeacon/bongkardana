package o;

import android.content.Context;
import id.dana.domain.merchant.MerchantCategoryType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.d;
import org.jetbrains.annotations.NotNull;

@Singleton
public class com_alibaba_ariver_resource_api_ExtOpt$22$1 implements com_alibaba_ariver_engine_api_ExtOpt$19$1, bizCheckPermission {
    private static final String MERCHANT_CATEGORIES_ORDER_JSON = "json/amcs-merchant-categories-order-default.json";
    private final Context context;
    private final Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1> merchantCategoryEntities = new HashMap();
    private final Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1> merchantSubcategoryEntityMap = new HashMap();
    private final PluginInstallCallback serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMerchantCategories$3(Map map, List list) throws Exception {
        return map;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMerchantSubcategories$7(Map map, List list) throws Exception {
        return map;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMerchantTopups$11(Map map, List list) throws Exception {
        return map;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getNewMerchantCategories$16(Map map, List list) throws Exception {
        return map;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getNewMerchantSubCategories$20(Map map, List list) throws Exception {
        return map;
    }

    @Inject
    public com_alibaba_ariver_resource_api_ExtOpt$22$1(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getMerchantOrder(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new onPluginParsed(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getMerchantOrder$0(String str) throws Exception {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1106146306, oncanceled);
            onCancelLoad.getMin(-1106146306, oncanceled);
        }
        return this.serializer.deserializeList(this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, MERCHANT_CATEGORIES_ORDER_JSON)).get(str));
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getMerchantCategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMainPackage(this)).flatMap(new RedDotDrawable(this) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 setMax;

            {
                this.setMax = r1;
            }

            public final Object apply(Object obj) {
                return this.setMax.lambda$getMerchantCategories$4((Set) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getMerchantCategories$1() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_MERCHANT_CATEGORIES)).entrySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantCategories$4(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new RedDotDrawable(this, hashMap) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMin;
            private final Map length;

            {
                this.getMin = r1;
                this.length = r2;
            }

            public final Object apply(Object obj) {
                return this.getMin.lambda$getMerchantCategories$2(this.length, (Map.Entry) obj);
            }
        }).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new RedDotDrawable(hashMap) {
            private final Map getMin;

            {
                this.getMin = r1;
            }

            public final Object apply(Object obj) {
                return com_alibaba_ariver_resource_api_ExtOpt$22$1.lambda$getMerchantCategories$3(this.getMin, (List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$98$1 lambda$getMerchantCategories$2(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        com_alibaba_ariver_app_api_ExtOpt$98$1 com_alibaba_ariver_app_api_extopt_98_1 = (com_alibaba_ariver_app_api_ExtOpt$98$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$98$1.class);
        com_alibaba_ariver_app_api_extopt_98_1.f9900id = str;
        map.put(str, com_alibaba_ariver_app_api_extopt_98_1);
        return com_alibaba_ariver_app_api_extopt_98_1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getMerchantSubcategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable(this) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMax;

            {
                this.getMax = r1;
            }

            public final Object call() {
                return this.getMax.lambda$getMerchantSubcategories$5();
            }
        }).flatMap(new RedDotDrawable(this) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 length;

            {
                this.length = r1;
            }

            public final Object apply(Object obj) {
                return this.length.lambda$getMerchantSubcategories$8((Set) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getMerchantSubcategories$5() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_MERCHANT_SUB_CATEGORIES)).entrySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantSubcategories$8(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new RedDotDrawable(this, hashMap) {
            private final Map length;
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 setMin;

            {
                this.setMin = r1;
                this.length = r2;
            }

            public final Object apply(Object obj) {
                return this.setMin.lambda$getMerchantSubcategories$6(this.length, (Map.Entry) obj);
            }
        }).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new RedDotDrawable(hashMap) {
            private final Map length;

            {
                this.length = r1;
            }

            public final Object apply(Object obj) {
                return com_alibaba_ariver_resource_api_ExtOpt$22$1.lambda$getMerchantSubcategories$7(this.length, (List) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$99$1 lambda$getMerchantSubcategories$6(Map map, Map.Entry entry) throws Exception {
        com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$99$1.class);
        map.put((String) entry.getKey(), com_alibaba_ariver_app_api_extopt_99_1);
        return com_alibaba_ariver_app_api_extopt_99_1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, String>> getMerchantTopups() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable(this) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 getMax;

            {
                this.getMax = r1;
            }

            public final Object call() {
                return this.getMax.lambda$getMerchantTopups$9();
            }
        }).flatMap(d.AnonymousClass3.getMax);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getMerchantTopups$9() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_MERCHANT_TOPUP)).entrySet();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantTopups$12(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r2;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new com_alibaba_ariver_resource_api_ExtOpt$24$1(hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r2 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r2 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r2.map(new RedDotDrawable(hashMap) {
            private final Map setMax;

            {
                this.setMax = r1;
            }

            public final Object apply(Object obj) {
                return com_alibaba_ariver_resource_api_ExtOpt$22$1.lambda$getMerchantTopups$11(this.setMax, (List) obj);
            }
        });
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(MerchantCategoryType merchantCategoryType) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new DebugConsoleExtension(this, merchantCategoryType));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ List lambda$getNewMerchantCategoryOrder$13(MerchantCategoryType merchantCategoryType) throws Exception {
        return this.serializer.deserializeList(getPositiveString.loadJSONFromAsset(this.context, merchantCategoryType.getDefaultPath()));
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getNewMerchantCategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new Callable(this) {
            private final com_alibaba_ariver_resource_api_ExtOpt$22$1 length;

            {
                this.length = r1;
            }

            public final Object call() {
                return this.length.lambda$getNewMerchantCategories$14();
            }
        }).flatMap(new onConsoleViewCreated(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getNewMerchantCategories$14() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_MERCHANT_CATEGORIES_V2)).entrySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantCategories$17(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new onAppConfigModelInit(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new com_alibaba_ariver_resource_api_ExtOpt$23$1(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$98$1 lambda$getNewMerchantCategories$15(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        com_alibaba_ariver_app_api_ExtOpt$98$1 com_alibaba_ariver_app_api_extopt_98_1 = (com_alibaba_ariver_app_api_ExtOpt$98$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$98$1.class);
        com_alibaba_ariver_app_api_extopt_98_1.f9900id = str;
        map.put(str, com_alibaba_ariver_app_api_extopt_98_1);
        return com_alibaba_ariver_app_api_extopt_98_1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getNewMerchantSubCategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getResourcePackages(this)).flatMap(new createPluginPackage(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getNewMerchantSubCategories$18() throws Exception {
        return this.serializer.deserializeMap(getPositiveString.loadJSONFromAsset(this.context, BaseAppContext.DEFAULT_MERCHANT_SUB_CATEGORIES_V2)).entrySet();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantSubCategories$21(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new d(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new onResourceRequest(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$99$1 lambda$getNewMerchantSubCategories$19(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$99$1.class);
        com_alibaba_ariver_app_api_extopt_99_1.mcc = str;
        map.put(str, com_alibaba_ariver_app_api_extopt_99_1);
        return com_alibaba_ariver_app_api_extopt_99_1;
    }

    public void saveMerchantNewCategories(@NotNull Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$98$1> map) {
        this.merchantCategoryEntities.putAll(map);
    }

    public void saveMerchantNewSubCategories(@NotNull Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$99$1> map) {
        this.merchantSubcategoryEntityMap.putAll(map);
    }

    @NotNull
    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getCachedNewMerchantCategories() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.merchantCategoryEntities);
    }

    @NotNull
    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getCachedNewMerchantSubCategories() {
        return TitleBarRightButtonView.AnonymousClass1.just(this.merchantSubcategoryEntityMap);
    }
}
