package o;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
public class getAppxMinVersionFromPackage implements getDeclaredMinAppxVersion {
    private static final String SETTING_CATEGORIES_JSON = "json/amcs-setting-categories-default.json";
    private static final String SETTING_JSON = "json/amcs-setting-default.json";
    private static final String SETTING_ORDER_JSON = "json/amcs-setting-collection-me-default.json";
    private final Context context;
    private final PluginInstallCallback serializer;

    @Inject
    public getAppxMinVersionFromPackage(Context context2, PluginInstallCallback pluginInstallCallback) {
        this.context = context2;
        this.serializer = pluginInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCollection(@NonNull String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new checkAppxMinFrameworkVersion(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getSettingCollection$0(String str) throws Exception {
        JSONArray jSONArray = new JSONObject(getPositiveString.loadJSONFromAsset(this.context, SETTING_ORDER_JSON)).getJSONArray(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            linkedHashMap.put(jSONArray.getString(i), new LinkedHashMap());
        }
        return linkedHashMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCategories(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getAppxMinFrameworkVersionFromPackage(this, linkedHashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getSettingCategories$1(LinkedHashMap linkedHashMap) throws Exception {
        JSONObject jSONObject = new JSONObject(getPositiveString.loadJSONFromAsset(this.context, SETTING_CATEGORIES_JSON));
        for (Map.Entry key : linkedHashMap.entrySet()) {
            String str = (String) key.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (int i = 0; i < jSONObject.getJSONArray(str).length(); i++) {
                linkedHashMap2.put(jSONObject.getJSONArray(str).getString(i), new getActivityClz());
            }
            linkedHashMap.put(str, linkedHashMap2);
        }
        return linkedHashMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> getSettingKeyByCategoryKey(@NonNull String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new forceUpdateAppInfo(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getSettingKeyByCategoryKey$2(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(getPositiveString.loadJSONFromAsset(this.context, SETTING_CATEGORIES_JSON));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < jSONObject.getJSONArray(str).length(); i++) {
            linkedHashMap.put(jSONObject.getJSONArray(str).getString(i), new getActivityClz());
        }
        return linkedHashMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSetting(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new handleForceUpdateAppInfo(this, linkedHashMap));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ LinkedHashMap lambda$getSetting$3(LinkedHashMap linkedHashMap) throws Exception {
        JSONObject jSONObject = new JSONObject(getPositiveString.loadJSONFromAsset(this.context, SETTING_JSON));
        for (Map.Entry value : linkedHashMap.entrySet()) {
            for (Map.Entry entry : ((LinkedHashMap) value.getValue()).entrySet()) {
                getActivityClz getactivityclz = (getActivityClz) this.serializer.deserialize(jSONObject.getString((String) entry.getKey()), getActivityClz.class);
                if (getactivityclz.isEnable()) {
                    entry.setValue(getactivityclz);
                }
            }
        }
        return linkedHashMap;
    }

    public TitleBarRightButtonView.AnonymousClass1<getActivityClz> getSettingByKey(@NonNull String str) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new onUpdateSuccess(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getActivityClz lambda$getSettingByKey$4(String str) throws Exception {
        JSONObject jSONObject = new JSONObject(getPositiveString.loadJSONFromAsset(this.context, SETTING_JSON));
        if (!jSONObject.has(str)) {
            return getActivityClz.empty();
        }
        return (getActivityClz) this.serializer.deserialize(jSONObject.getString(str), getActivityClz.class);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSettingSplitNeedtoMigrate() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }
}
