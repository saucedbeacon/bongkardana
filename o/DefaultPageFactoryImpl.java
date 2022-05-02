package o;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJF\u0010\t\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000b0\n2\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000bH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0010\u001a\u00020\fH\u0016JF\u0010\u0011\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000b0\n2\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000bH\u0016JD\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u001e\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0019H\u0002J.\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u000b0\n2\u0006\u0010\u001b\u001a\u00020\fH\u0016J$\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u00162\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u001fH\u0002J\"\u0010 \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n2\u0006\u0010!\u001a\u00020\fH\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/data/profilemenu/repository/source/AmcsSettingsEntityData;", "Lid/dana/data/profilemenu/repository/source/SettingsEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "serializer", "Lid/dana/data/storage/Serializer;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;Lid/dana/data/storage/Serializer;)V", "getSetting", "Lio/reactivex/Observable;", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "settingCategoriesMap", "getSettingByKey", "settingKey", "getSettingCategories", "categoriesOrder", "getSettingCategoryData", "", "settingParent", "Lcom/alibaba/fastjson/JSONObject;", "settingMap", "entryCategories", "", "getSettingCollection", "collectionName", "getSettingData", "settings", "entrySetting", "", "getSettingKeyByCategoryKey", "categoryKey", "isSettingSplitNeedtoMigrate", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultPageFactoryImpl implements getDeclaredMinAppxVersion {
    /* access modifiers changed from: private */
    public final PluginInstallCallback serializer;

    @Inject
    public DefaultPageFactoryImpl(@Nullable Context context, @NotNull AppPausePoint appPausePoint, @NotNull PluginInstallCallback pluginInstallCallback) {
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        Intrinsics.checkNotNullParameter(pluginInstallCallback, "serializer");
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            Intrinsics.checkNotNull(context);
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCollection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "collectionName");
        TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(str));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ngCategoriesMap\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCategories(@NotNull LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "categoriesOrder");
        TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMax(this, linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …categoriesOrder\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> getSettingKeyByCategoryKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "categoryKey");
        TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(str));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …tingServicesMap\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSetting(@NotNull LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "settingCategoriesMap");
        TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMin(this, linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ngCategoriesMap\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getActivityClz> getSettingByKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "settingKey");
        TitleBarRightButtonView.AnonymousClass1<getActivityClz> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMax(this, str));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ty::class.java)\n        }");
        return fromCallable;
    }

    /* access modifiers changed from: private */
    public final void getSettingCategoryData(JSONObject jSONObject, LinkedHashMap<String, getActivityClz> linkedHashMap, Map.Entry<String, ? extends LinkedHashMap<String, getActivityClz>> entry) {
        for (Map.Entry entry2 : jSONObject.entrySet()) {
            Object value = entry2.getValue();
            if (Intrinsics.areEqual((Object) (String) entry2.getKey(), (Object) entry.getKey()) && (value instanceof JSONArray)) {
                int size = ((Collection) value).size();
                for (int i = 0; i < size; i++) {
                    String string = ((JSONArray) value).getString(i);
                    Intrinsics.checkNotNullExpressionValue(string, "value.getString(i)");
                    linkedHashMap.put(string, new getActivityClz());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void getSettingData(JSONObject jSONObject, Map.Entry<String, getActivityClz> entry) {
        for (Map.Entry entry2 : jSONObject.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof JSONObject) {
                getActivityClz getactivityclz = (getActivityClz) this.serializer.deserialize(((JSONObject) value).toJSONString(), getActivityClz.class);
                if (Intrinsics.areEqual((Object) str, (Object) entry.getKey())) {
                    Intrinsics.checkNotNullExpressionValue(getactivityclz, "settingEntity");
                    if (getactivityclz.isEnable()) {
                        entry.setValue(getactivityclz);
                    }
                }
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSettingSplitNeedtoMigrate() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> {
        final /* synthetic */ String getMax;

        length(String str) {
            this.getMax = str;
        }

        public final /* synthetic */ Object call() {
            org.json.JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig(this.getMax);
            if (jSONArrayConfig == null || jSONArrayConfig.length() == 0) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = jSONArrayConfig.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArrayConfig.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "config.getString(i)");
                linkedHashMap.put(string, new LinkedHashMap());
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMax<V> implements Callable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> {
        final /* synthetic */ DefaultPageFactoryImpl length;
        final /* synthetic */ LinkedHashMap setMin;

        getMax(DefaultPageFactoryImpl defaultPageFactoryImpl, LinkedHashMap linkedHashMap) {
            this.length = defaultPageFactoryImpl;
            this.setMin = linkedHashMap;
        }

        public final /* synthetic */ Object call() {
            org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("SettingCategories");
            if (sectionConfig == null || sectionConfig.length() == 0) {
                return null;
            }
            for (Map.Entry entry : this.setMin.entrySet()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                JSONObject parseObject = getPositiveString.parseObject(sectionConfig);
                DefaultPageFactoryImpl defaultPageFactoryImpl = this.length;
                Intrinsics.checkNotNullExpressionValue(parseObject, "setting");
                Intrinsics.checkNotNullExpressionValue(entry, "entryCategories");
                defaultPageFactoryImpl.getSettingCategoryData(parseObject, linkedHashMap, entry);
                Object key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "entryCategories.key");
                this.setMin.put(key, linkedHashMap);
            }
            return this.setMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<LinkedHashMap<String, getActivityClz>> {
        final /* synthetic */ String length;

        getMin(String str) {
            this.length = str;
        }

        public final /* synthetic */ Object call() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject parseObject = getPositiveString.parseObject(ConfigCenter.getInstance().getSectionConfig("SettingCategories"));
            JSONArray jSONArray = parseObject != null ? parseObject.getJSONArray(this.length) : null;
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof String) {
                        linkedHashMap.put(next, new getActivityClz());
                    }
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMin<V> implements Callable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> {
        final /* synthetic */ LinkedHashMap getMin;
        final /* synthetic */ DefaultPageFactoryImpl length;

        setMin(DefaultPageFactoryImpl defaultPageFactoryImpl, LinkedHashMap linkedHashMap) {
            this.length = defaultPageFactoryImpl;
            this.getMin = linkedHashMap;
        }

        public final /* synthetic */ Object call() {
            org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("Settings");
            if (sectionConfig == null || sectionConfig.length() == 0) {
                return null;
            }
            for (Map.Entry value : this.getMin.entrySet()) {
                for (Map.Entry entry : ((LinkedHashMap) value.getValue()).entrySet()) {
                    JSONObject parseObject = getPositiveString.parseObject(sectionConfig);
                    DefaultPageFactoryImpl defaultPageFactoryImpl = this.length;
                    Intrinsics.checkNotNullExpressionValue(parseObject, "parsedSetting");
                    Intrinsics.checkNotNullExpressionValue(entry, "entrySetting");
                    defaultPageFactoryImpl.getSettingData(parseObject, entry);
                }
            }
            return this.getMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<getActivityClz> {
        final /* synthetic */ DefaultPageFactoryImpl getMax;
        final /* synthetic */ String length;

        setMax(DefaultPageFactoryImpl defaultPageFactoryImpl, String str) {
            this.getMax = defaultPageFactoryImpl;
            this.length = str;
        }

        public final /* synthetic */ Object call() {
            org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("Settings");
            if (sectionConfig == null || sectionConfig.length() == 0) {
                return null;
            }
            return (getActivityClz) this.getMax.serializer.deserialize(sectionConfig.getString(this.length), getActivityClz.class);
        }
    }
}
