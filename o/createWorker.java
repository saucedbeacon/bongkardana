package o;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import id.dana.data.Source;
import id.dana.domain.merchant.MerchantCategoryType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppMsgReceiver;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.json.JSONArray;
import org.json.JSONException;

@Singleton
public class createWorker implements com_alibaba_ariver_engine_api_ExtOpt$19$1 {
    private static final String MC_ID = "mc_id";
    private final onCallBack configEntityDataFactory;
    private final addAnimatorListener danaContentApi;
    private final PluginInstallCallback serializer;

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getFromCdn$7(Map map, List list) throws Exception {
        return map;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map lambda$getMerchantSubCategoryFromCdn$13(Map map, List list) throws Exception {
        return map;
    }

    @Inject
    public createWorker(PluginInstallCallback pluginInstallCallback, onCallBack oncallback, addAnimatorListener addanimatorlistener) {
        this.serializer = pluginInstallCallback;
        this.configEntityDataFactory = oncallback;
        this.danaContentApi = addanimatorlistener;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getMerchantOrder(String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new injectStartParam(this)).flatMap(com_alibaba_ariver_engine_api_ExtOpt$32$1.setMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantOrder$0(JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Merchant Order is Empty"));
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            if (!TextUtils.isEmpty(string)) {
                arrayList.add(string);
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(arrayList);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getMerchantCategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new com_alibaba_ariver_resource_api_ExtOpt$16$1(this)).flatMap(new getResource(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantCategories$1(JSONObject jSONObject) throws Exception {
        if (jSONObject.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Merchant Categories is Empty"));
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : jSONObject.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof JSONObject) {
                com_alibaba_ariver_app_api_ExtOpt$98$1 com_alibaba_ariver_app_api_extopt_98_1 = (com_alibaba_ariver_app_api_ExtOpt$98$1) this.serializer.deserialize(((JSONObject) value).toJSONString(), com_alibaba_ariver_app_api_ExtOpt$98$1.class);
                com_alibaba_ariver_app_api_extopt_98_1.f9900id = str;
                hashMap.put(str, com_alibaba_ariver_app_api_extopt_98_1);
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(hashMap);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getMerchantSubcategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new shouldInterceptRequest(this)).flatMap(new onGetAppInfo(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantSubcategories$2(JSONObject jSONObject) throws Exception {
        if (jSONObject.isEmpty()) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Merchant Sub Categories is Empty"));
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : jSONObject.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof JSONObject) {
                hashMap.put(str, (com_alibaba_ariver_app_api_ExtOpt$99$1) this.serializer.deserialize(((JSONObject) value).toJSONString(), com_alibaba_ariver_app_api_ExtOpt$99$1.class));
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.just(hashMap);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, String>> getMerchantTopups() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new onResourceParsed(this)).flatMap(com_alibaba_ariver_resource_api_ExtOpt$18$1.getMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantTopups$3(JSONObject jSONObject) throws Exception {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : jSONObject.entrySet()) {
            hashMap.put((String) next.getKey(), next.getValue().toString());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(hashMap);
    }

    /* access modifiers changed from: private */
    public JSONObject getMerchantTopupsFromConfig() {
        return createSplitConfigEntityData().getMerchantTopups().onErrorResumeNext(createAMCSConfigEntityData().getMerchantTopups()).blockingFirst();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(MerchantCategoryType merchantCategoryType) {
        return createSplitConfigEntityData().getNewMerchantCategoryOrder(merchantCategoryType);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getNewMerchantCategories() {
        return createSplitConfigEntityData().getNewMerchantCategories().flatMap(new com_alibaba_ariver_resource_api_ExtOpt$20$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantCategories$4(AppNode.AnonymousClass10 r2) throws Exception {
        if (TextUtils.isEmpty(r2.getUrl())) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty url"));
        }
        return getFromCdn(r2.getUrl());
    }

    private TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$98$1>> getFromCdn(String str) {
        return this.danaContentApi.getMerchantCategoriesContent(str).flatMap(new com_alibaba_ariver_resource_api_ExtOpt$19$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getFromCdn$9(JSONObject jSONObject) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new com_alibaba_ariver_resource_api_ExtOpt$15$1(this, jSONObject)).flatMap(new ignoreAppPermission(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getFromCdn$5(JSONObject jSONObject) throws Exception {
        Map<String, String> deserializeMap = this.serializer.deserializeMap(jSONObject.toString());
        if (!deserializeMap.isEmpty()) {
            return deserializeMap.entrySet();
        }
        throw new Exception("Empty categories");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getFromCdn$8(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new com_alibaba_ariver_resource_api_ExtOpt$14$1(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new com_alibaba_ariver_resource_api_ExtOpt$17$1(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$98$1 lambda$getFromCdn$6(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        com_alibaba_ariver_app_api_ExtOpt$98$1 com_alibaba_ariver_app_api_extopt_98_1 = (com_alibaba_ariver_app_api_ExtOpt$98$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$98$1.class);
        com_alibaba_ariver_app_api_extopt_98_1.f9900id = str;
        map.put(str, com_alibaba_ariver_app_api_extopt_98_1);
        return com_alibaba_ariver_app_api_extopt_98_1;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getNewMerchantSubCategories() {
        return createSplitConfigEntityData().getNewMerchantSubCategories().flatMap(new isAsyncCreateWorker(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNewMerchantSubCategories$10(AppNode.AnonymousClass10 r2) throws Exception {
        if (TextUtils.isEmpty(r2.getUrl())) {
            return TitleBarRightButtonView.AnonymousClass1.error(new Throwable("Empty url"));
        }
        return getMerchantSubCategoryFromCdn(r2.getUrl());
    }

    private TitleBarRightButtonView.AnonymousClass1<Map<String, com_alibaba_ariver_app_api_ExtOpt$99$1>> getMerchantSubCategoryFromCdn(String str) {
        return this.danaContentApi.getMerchantCategoriesContent(str).flatMap(new com_alibaba_ariver_permission_ExtOpt$4$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantSubCategoryFromCdn$15(JSONObject jSONObject) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new interceptGetAuthCode(this, jSONObject)).flatMap(new com_alibaba_ariver_permission_ExtOpt$3$1(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Set lambda$getMerchantSubCategoryFromCdn$11(JSONObject jSONObject) throws Exception {
        Map<String, String> deserializeMap = this.serializer.deserializeMap(jSONObject.toString());
        if (!deserializeMap.isEmpty()) {
            return deserializeMap.entrySet();
        }
        throw new Exception("Empty categories");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getMerchantSubCategoryFromCdn$14(Set set) throws Exception {
        TitleBarRightButtonView.AnonymousClass1 r3;
        HashMap hashMap = new HashMap();
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 list = TitleBarRightButtonView.AnonymousClass1.fromIterable(set).map(new onResourceFinishLoad(this, hashMap)).toList();
        if (list instanceof getSecondFloorView) {
            r3 = ((getSecondFloorView) list).setMax();
        } else {
            setTitleLoading settitleloading = new setTitleLoading(list);
            RedDotDrawable<? super TitleBarRightButtonView.AnonymousClass1, ? extends TitleBarRightButtonView.AnonymousClass1> redDotDrawable = SecuritySignature.FastBitmap$CoordinateSystem;
            r3 = redDotDrawable != null ? (TitleBarRightButtonView.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, settitleloading) : settitleloading;
        }
        return r3.map(new com_alibaba_ariver_resource_api_ExtOpt$13$1(hashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ com_alibaba_ariver_app_api_ExtOpt$99$1 lambda$getMerchantSubCategoryFromCdn$12(Map map, Map.Entry entry) throws Exception {
        String str = (String) entry.getKey();
        com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) this.serializer.deserialize((String) entry.getValue(), com_alibaba_ariver_app_api_ExtOpt$99$1.class);
        com_alibaba_ariver_app_api_extopt_99_1.mcc = str;
        map.put(str, com_alibaba_ariver_app_api_extopt_99_1);
        return com_alibaba_ariver_app_api_extopt_99_1;
    }

    /* access modifiers changed from: private */
    public JSONObject getMerchantCategoriesFromConfig() {
        return createSplitConfigEntityData().getMerchantCategories().onErrorResumeNext(createAMCSConfigEntityData().getMerchantCategories()).blockingFirst();
    }

    /* access modifiers changed from: private */
    public JSONArray getMerchantOrderFromConfig() {
        return createSplitConfigEntityData().getMerchantOrder().onErrorResumeNext(createAMCSConfigEntityData().getMerchantOrder()).blockingFirst();
    }

    private AppMsgReceiver.AnonymousClass2 createSplitConfigEntityData() {
        return this.configEntityDataFactory.createData(Source.SPLIT);
    }

    private AppMsgReceiver.AnonymousClass2 createAMCSConfigEntityData() {
        return this.configEntityDataFactory.createData("amcs");
    }

    /* access modifiers changed from: private */
    public JSONObject getSubMerchantCategoriesFromConfig() {
        return getMerchantSubcategoriesFromSplit().onErrorResumeNext(createAMCSConfigEntityData().getMerchantSubcategories()).blockingFirst();
    }

    private TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantSubcategoriesFromSplit() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new injectStartParam(this)).map(new com_alibaba_ariver_engine_api_ExtOpt$34$1(this));
    }

    /* access modifiers changed from: private */
    public JSONObject onGotMerchantOrder(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        for (String onGotMcId : jsonArrayToStringList(jSONArray)) {
            onGotMcId(jSONObject, onGotMcId);
        }
        return jSONObject;
    }

    private void onGotMcId(JSONObject jSONObject, String str) {
        for (String next : getStringListFromSplit(str)) {
            JSONObject jSONObjectFromSplit = getJSONObjectFromSplit(next);
            if (!jSONObjectFromSplit.isEmpty()) {
                jSONObjectFromSplit.put(MC_ID, (Object) str);
                jSONObject.put(next, (Object) jSONObjectFromSplit);
            }
        }
    }

    private List<String> getStringListFromSplit(String str) {
        return getSplitConfigEntityData().getStringList(str).onErrorReturnItem(new ArrayList()).blockingFirst();
    }

    private JSONObject getJSONObjectFromSplit(String str) {
        return getSplitConfigEntityData().getJSONObject(str).onErrorReturnItem(new JSONObject()).blockingFirst();
    }

    private List<String> jsonArrayToStringList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.getString(i));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private AppUtils getSplitConfigEntityData() {
        return (AppUtils) createSplitConfigEntityData();
    }
}
