package o;

import com.iap.ac.config.lite.ConfigCenter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JF\u0010\u0005\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00070\u00062\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0007H\u0002J:\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\f0\u00062\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0002JH\u0010\u0010\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00070\u00062 \u0010\u0011\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0007H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016JH\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00070\u00062 \u0010\u0015\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0007H\u0016J.\u0010\u0016\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00070\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0016J\"\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006H\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u001c\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/data/profilemenu/repository/source/SplitSettingsEntityData;", "Lid/dana/data/profilemenu/repository/source/SettingsEntityData;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Lid/dana/data/toggle/SplitFacade;)V", "categoriesLinkedHashMap", "Lio/reactivex/Observable;", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "collectionsCategory", "getListOfSettingsFromCategories", "", "Lorg/json/JSONArray;", "getServicesByCategoryKeyFromAMCS", "categoryKey", "getSetting", "settingCategoriesMap", "getSettingByKey", "settingKey", "getSettingCategories", "settingMap", "getSettingCollection", "collectionName", "getSettingKeyByCategoryKey", "isSettingSplitNeedtoMigrate", "", "servicesLinkedHashMap", "settingKeys", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class checkAppxMinVersion implements getDeclaredMinAppxVersion {
    private final UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "result", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<List<? extends String>, LinkedHashMap<String, getActivityClz>> {
        public static final IsOverlapping length = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<String> list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "result");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String put : list) {
                linkedHashMap.put(put, new getActivityClz());
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply", "(Lid/dana/data/toggle/traffictype/BaseTrafficType;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<getRequestMainPackage, Boolean> {
        public static final equals length = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            return Boolean.valueOf(getrequestmainpackage.setMin("feature_setting_split_migration", false, false));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "result", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<List<? extends String>, LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> {
        public static final isInside setMax = new isInside();

        isInside() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<String> list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "result");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String put : list) {
                linkedHashMap.put(put, new LinkedHashMap());
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends String>> {
        final /* synthetic */ String length;

        setMax(String str) {
            this.length = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax(this.length, true);
            if (String.class.isAssignableFrom(String.class)) {
                if (max == null) {
                    max = "";
                }
                if (max == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (max == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return setFantasyFontFamily.toStringList(max);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends String>> {
        final /* synthetic */ String setMin;

        toFloatRange(String str) {
            this.setMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax(this.setMin, true);
            if (String.class.isAssignableFrom(String.class)) {
                if (max == null) {
                    max = "";
                }
                if (max == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (max == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            return setFantasyFontFamily.toStringList(max);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a:\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001 \u0004*\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0018\u00010\u00010\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "linkedListCategory", "", "Lorg/json/JSONArray;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<Map<String, ? extends JSONArray>, LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> {
        final /* synthetic */ checkAppxMinVersion getMin;

        getMax(checkAppxMinVersion checkappxminversion) {
            this.getMin = checkappxminversion;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            Intrinsics.checkNotNullParameter(map, "linkedListCategory");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), this.getMin.servicesLinkedHashMap((JSONArray) entry.getValue()));
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0001\u0012>\b\u0001\u0012:\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00020\u0002 \u0005*D\u0012>\b\u0001\u0012:\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002 \u0005*\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0002H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Ljava/util/LinkedHashMap;", "", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "collectionsCategory", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>, TitleBarRightButtonView.AnonymousClass4<? extends LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>>> {
        final /* synthetic */ checkAppxMinVersion setMin;

        setMin(checkAppxMinVersion checkappxminversion) {
            this.setMin = checkappxminversion;
        }

        public final /* synthetic */ Object apply(Object obj) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
            Intrinsics.checkNotNullParameter(linkedHashMap, "collectionsCategory");
            return this.setMin.categoriesLinkedHashMap(linkedHashMap);
        }
    }

    @Inject
    public checkAppxMinVersion(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCollection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "collectionName");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new setMax(str)).map(isInside.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…ngCategoriesMap\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSettingCategories(@Nullable LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = TitleBarRightButtonView.AnonymousClass1.just(linkedHashMap).flatMap(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "Observable.just(settingM…ap(collectionsCategory) }");
        return flatMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> categoriesLinkedHashMap(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        TitleBarRightButtonView.AnonymousClass1<R> map = getListOfSettingsFromCategories(linkedHashMap).map(new getMax(this));
        Intrinsics.checkNotNullExpressionValue(map, "getListOfSettingsFromCat…tegoriesMap\n            }");
        return map;
    }

    private final TitleBarRightButtonView.AnonymousClass1<Map<String, JSONArray>> getListOfSettingsFromCategories(LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new getMin(this, linkedHashMap));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…CategoryMap\n            }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lorg/json/JSONArray;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, Map<String, ? extends JSONArray>> {
        final /* synthetic */ LinkedHashMap getMin;
        final /* synthetic */ checkAppxMinVersion length;

        getMin(checkAppxMinVersion checkappxminversion, LinkedHashMap linkedHashMap) {
            this.length = checkappxminversion;
            this.getMin = linkedHashMap;
        }

        /* access modifiers changed from: private */
        /* renamed from: setMin */
        public Map<String, JSONArray> apply(@NotNull getRequestMainPackage getrequestmainpackage) {
            JSONArray jSONArray;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            HashMap hashMap = new HashMap();
            Set<String> keySet = this.getMin.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "collectionsCategory.keys");
            for (String str : keySet) {
                Map map = hashMap;
                Intrinsics.checkNotNullExpressionValue(str, "categoryKey");
                try {
                    String max = getrequestmainpackage.getMax(str, true);
                    if (String.class.isAssignableFrom(String.class)) {
                        if (max == null) {
                            max = "";
                        }
                        if (max == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (max == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    jSONArray = new JSONArray(setFantasyFontFamily.toStringList(max));
                } catch (Exception unused) {
                    jSONArray = this.length.getServicesByCategoryKeyFromAMCS(str);
                }
                map.put(str, jSONArray);
            }
            return hashMap;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, getActivityClz>> getSettingKeyByCategoryKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "categoryKey");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new toFloatRange(str)).map(IsOverlapping.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…tingServicesMap\n        }");
        return map;
    }

    /* access modifiers changed from: private */
    public final JSONArray getServicesByCategoryKeyFromAMCS(String str) {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig(str);
        if (jSONArrayConfig == null) {
            jSONArrayConfig = new JSONArray();
        }
        Intrinsics.checkNotNullExpressionValue(jSONArrayConfig, "ConfigCenter.getInstance…tegoryKey) ?: JSONArray()");
        return jSONArrayConfig;
    }

    /* access modifiers changed from: private */
    public final LinkedHashMap<String, getActivityClz> servicesLinkedHashMap(JSONArray jSONArray) {
        LinkedHashMap<String, getActivityClz> linkedHashMap = new LinkedHashMap<>();
        int length2 = jSONArray.length();
        int i = 0;
        while (i < length2) {
            Object obj = jSONArray.get(i);
            if (obj != null) {
                linkedHashMap.put((String) obj, new getActivityClz());
                i++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>> getSetting(@Nullable LinkedHashMap<String, LinkedHashMap<String, getActivityClz>> linkedHashMap) {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getActivityClz> getSettingByKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "settingKey");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new length(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…          )\n            }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/profilemenu/model/SettingEntity;", "kotlin.jvm.PlatformType", "traffic", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRequestMainPackage, getActivityClz> {
        final /* synthetic */ String setMin;

        length(String str) {
            this.setMin = str;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
        /* renamed from: setMin */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.getActivityClz apply(@org.jetbrains.annotations.NotNull o.getRequestMainPackage r4) {
            /*
                r3 = this;
                java.lang.String r0 = "traffic"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                java.lang.String r0 = r3.setMin
                r1 = 1
                java.lang.String r4 = r4.getMax((java.lang.String) r0, (boolean) r1)
                java.lang.Class<o.getActivityClz> r0 = o.getActivityClz.class
                java.lang.Class<org.json.JSONArray> r1 = org.json.JSONArray.class
                boolean r0 = r0.isAssignableFrom(r1)
                r1 = 0
                if (r0 == 0) goto L_0x0024
                org.json.JSONArray r0 = new org.json.JSONArray
                if (r4 != 0) goto L_0x001d
                java.lang.String r4 = ""
            L_0x001d:
                r0.<init>(r4)
                r1 = r0
                o.getActivityClz r1 = (o.getActivityClz) r1
                goto L_0x0046
            L_0x0024:
                if (r4 == 0) goto L_0x0043
                if (r4 != 0) goto L_0x002a
            L_0x0028:
                r4 = r1
                goto L_0x003e
            L_0x002a:
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0028 }
                r0.<init>(r4)     // Catch:{ Exception -> 0x0028 }
                com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0028 }
                r4.<init>()     // Catch:{ Exception -> 0x0028 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0028 }
                java.lang.Class<o.getActivityClz> r2 = o.getActivityClz.class
                java.lang.Object r4 = r4.fromJson((java.lang.String) r0, r2)     // Catch:{ Exception -> 0x0028 }
            L_0x003e:
                if (r4 != 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r1 = r4
                goto L_0x0046
            L_0x0043:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            L_0x0046:
                o.getActivityClz r1 = (o.getActivityClz) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.checkAppxMinVersion.length.apply(o.getRequestMainPackage):o.getActivityClz");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSettingSplitNeedtoMigrate() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(equals.length);
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade.trafficTypeU…e\n            )\n        }");
        return map;
    }
}
