package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import id.dana.domain.services.Category;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\r\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\b0\u000eH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0002J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000f0\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\tH\u0002J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\tH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8BX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/data/services/repository/source/split/SplitServicesEntityData;", "Lid/dana/data/services/repository/source/ServicesEntityData;", "context", "Landroid/content/Context;", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "(Landroid/content/Context;Lid/dana/data/toggle/SplitFacade;)V", "serviceMap", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "getServiceMap", "()Ljava/util/Map;", "getAllServices", "Lio/reactivex/Observable;", "", "getCategories", "category", "getListOfServices", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "getListOfServicesFromAmcs", "getRawServices", "getServicesByCategoryKey", "categoryKey", "getServicesByCategoryKeyFromLocal", "Lorg/json/JSONArray;", "getThirdPartyEntity", "serviceKey", "getThirdPartyEntityFromLocal", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isNoPermissionConfigAndAllow implements IPCParameter {
    private final Context context;
    private final UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$1", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class IsOverlapping extends TypeReference<Map<String, ? extends String>> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$1", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<Map<String, ? extends String>> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends TypeReference<Map<String, ? extends TitleBar>> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "ttUser", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getRequestMainPackage, Map<String, ? extends List<? extends TitleBar>>> {
        final /* synthetic */ isNoPermissionConfigAndAllow setMin;

        getMin(isNoPermissionConfigAndAllow isnopermissionconfigandallow) {
            this.setMin = isnopermissionconfigandallow;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "ttUser");
            Map linkedHashMap = new LinkedHashMap();
            String max = getrequestmainpackage.getMax(Category.SERVICES, true);
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
            if (!(max.length() > 0)) {
                max = null;
            }
            String str = max;
            if (str != null) {
                List<String> stringList = setFantasyFontFamily.toStringList(new JSONArray(str));
                stringList.add(Category.GLOBAL_NETWORK_FEATURED);
                for (String str2 : stringList) {
                    String access$getServicesByCategoryKey = this.setMin.getServicesByCategoryKey(getrequestmainpackage, str2);
                    if (!(access$getServicesByCategoryKey.length() > 0)) {
                        access$getServicesByCategoryKey = null;
                    }
                    if (access$getServicesByCategoryKey != null) {
                        Iterable<String> stringList2 = setFantasyFontFamily.toStringList(new JSONArray(access$getServicesByCategoryKey));
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stringList2, 10));
                        for (String access$getThirdPartyEntity : stringList2) {
                            arrayList.add(this.setMin.getThirdPartyEntity(getrequestmainpackage, access$getThirdPartyEntity));
                        }
                        Collection arrayList2 = new ArrayList();
                        for (Object next : (List) arrayList) {
                            if (((TitleBar) next).getName() != null) {
                                arrayList2.add(next);
                            }
                        }
                        linkedHashMap.put(str2, (List) arrayList2);
                    }
                }
            }
            return linkedHashMap;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "traffic", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends TitleBar>> {
        final /* synthetic */ isNoPermissionConfigAndAllow length;

        length(isNoPermissionConfigAndAllow isnopermissionconfigandallow) {
            this.length = isnopermissionconfigandallow;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "traffic");
            Collection arrayList = new ArrayList();
            for (Object next : this.length.getListOfServices(getrequestmainpackage)) {
                if (((TitleBar) next).getName() != null) {
                    arrayList.add(next);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : (List) arrayList) {
                if (hashSet.add(((TitleBar) next2).getKey())) {
                    arrayList2.add(next2);
                }
            }
            return arrayList2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/toggle/traffictype/BaseTrafficType;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<getRequestMainPackage, List<? extends String>> {
        final /* synthetic */ String getMin;

        setMin(String str) {
            this.getMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            getRequestMainPackage getrequestmainpackage = (getRequestMainPackage) obj;
            Intrinsics.checkNotNullParameter(getrequestmainpackage, "it");
            String max = getrequestmainpackage.getMax(this.getMin, true);
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
            return setFantasyFontFamily.toStringList(new JSONArray(max));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<Throwable, setMinDuration<? extends TitleBar>> {
        final /* synthetic */ String getMin;
        final /* synthetic */ isNoPermissionConfigAndAllow setMin;

        toFloatRange(isNoPermissionConfigAndAllow isnopermissionconfigandallow, String str) {
            this.setMin = isnopermissionconfigandallow;
            this.getMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            TitleBar titleBar = (TitleBar) this.setMin.getServiceMap().get(this.getMin);
            if (titleBar == null) {
                titleBar = this.setMin.getThirdPartyEntityFromLocal(this.getMin);
            }
            return TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(titleBar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<Throwable, setMinDuration<? extends String>> {
        final /* synthetic */ String getMax;
        final /* synthetic */ isNoPermissionConfigAndAllow length;

        toIntRange(isNoPermissionConfigAndAllow isnopermissionconfigandallow, String str) {
            this.length = isnopermissionconfigandallow;
            this.getMax = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            ConfigCenter instance = ConfigCenter.getInstance();
            String str = this.getMax;
            return TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.getMax(String.valueOf(instance.getJSONArrayConfig(str, this.length.getServicesByCategoryKeyFromLocal(str))));
        }
    }

    @Inject
    public isNoPermissionConfigAndAllow(@NotNull Context context2, @NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(updateAppCallback, "splitFacade");
        this.context = context2;
        this.splitFacade = updateAppCallback;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, o.TitleBar> getServiceMap() {
        /*
            r9 = this;
            com.iap.ac.config.lite.ConfigCenter r0 = com.iap.ac.config.lite.ConfigCenter.getInstance()
            java.lang.String r1 = "Services"
            org.json.JSONObject r0 = r0.getSectionConfig(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0015
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x002e }
            goto L_0x0032
        L_0x0015:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002e }
            o.isNoPermissionConfigAndAllow$IsOverlapping r2 = new o.isNoPermissionConfigAndAllow$IsOverlapping     // Catch:{ Exception -> 0x002e }
            r2.<init>()     // Catch:{ Exception -> 0x002e }
            com.alibaba.fastjson.TypeReference r2 = (com.alibaba.fastjson.TypeReference) r2     // Catch:{ Exception -> 0x002e }
            com.alibaba.fastjson.parser.Feature[] r3 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch:{ Exception -> 0x002e }
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, r2, (com.alibaba.fastjson.parser.Feature[]) r3)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "JSON.parseObject(json.to…nce<Map<String, V>>() {})"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x002e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x002e }
            goto L_0x0032
        L_0x002e:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L_0x0032:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r3.getValue()
            java.lang.String r6 = (java.lang.String) r6
            r7 = 2
            java.lang.String r8 = "service_"
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r5, r8, r1, r7, r4)
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r5 = 123(0x7b, float:1.72E-43)
            boolean r4 = kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) r6, (char) r5, (boolean) r1, (int) r7, (java.lang.Object) r4)
            if (r4 == 0) goto L_0x006f
            r4 = 1
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r2.put(r4, r3)
            goto L_0x0041
        L_0x007e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r2.size()
            int r1 = kotlin.collections.MapsKt.mapCapacity(r1)
            r0.<init>(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Set r1 = r2.entrySet()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0097:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d8
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r5 = r2.getValue()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L_0x00b1
        L_0x00af:
            r5 = r4
            goto L_0x00c5
        L_0x00b1:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00af }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00af }
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00af }
            r5.<init>()     // Catch:{ Exception -> 0x00af }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00af }
            java.lang.Class<o.TitleBar> r7 = o.TitleBar.class
            java.lang.Object r5 = r5.fromJson((java.lang.String) r6, r7)     // Catch:{ Exception -> 0x00af }
        L_0x00c5:
            o.TitleBar r5 = (o.TitleBar) r5
            if (r5 == 0) goto L_0x00d3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r5.setKey(r2)
            goto L_0x00d4
        L_0x00d3:
            r5 = r4
        L_0x00d4:
            r0.put(r3, r5)
            goto L_0x0097
        L_0x00d8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isNoPermissionConfigAndAllow.getServiceMap():java.util.Map");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCategories(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new setMin(str));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n        .tra….toStringList()\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> getRawServices() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new length(this));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n        .tra…ctBy { it.key }\n        }");
        return map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0078 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<o.TitleBar> getListOfServicesFromAmcs() {
        /*
            r8 = this;
            com.iap.ac.config.lite.ConfigCenter r0 = com.iap.ac.config.lite.ConfigCenter.getInstance()
            java.lang.String r1 = "Services"
            org.json.JSONObject r0 = r0.getSectionConfig(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0015
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x002e }
            goto L_0x0032
        L_0x0015:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002e }
            o.isNoPermissionConfigAndAllow$getMax r2 = new o.isNoPermissionConfigAndAllow$getMax     // Catch:{ Exception -> 0x002e }
            r2.<init>()     // Catch:{ Exception -> 0x002e }
            com.alibaba.fastjson.TypeReference r2 = (com.alibaba.fastjson.TypeReference) r2     // Catch:{ Exception -> 0x002e }
            com.alibaba.fastjson.parser.Feature[] r3 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch:{ Exception -> 0x002e }
            java.lang.Object r0 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r0, r2, (com.alibaba.fastjson.parser.Feature[]) r3)     // Catch:{ Exception -> 0x002e }
            java.lang.String r2 = "JSON.parseObject(json.to…nce<Map<String, V>>() {})"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x002e }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x002e }
            goto L_0x0032
        L_0x002e:
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
        L_0x0032:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x003f:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0067
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r6 = 2
            java.lang.String r7 = "service_"
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r5, r7, r1, r6, r4)
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            r2.put(r4, r3)
            goto L_0x003f
        L_0x0067:
            java.util.Map r2 = (java.util.Map) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0078:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b7
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x008e
        L_0x008c:
            r3 = r4
            goto L_0x00a2
        L_0x008e:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x008c }
            r5.<init>(r3)     // Catch:{ Exception -> 0x008c }
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch:{ Exception -> 0x008c }
            r3.<init>()     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x008c }
            java.lang.Class<o.TitleBar> r6 = o.TitleBar.class
            java.lang.Object r3 = r3.fromJson((java.lang.String) r5, r6)     // Catch:{ Exception -> 0x008c }
        L_0x00a2:
            o.TitleBar r3 = (o.TitleBar) r3
            if (r3 == 0) goto L_0x00b0
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r3.setKey(r2)
            goto L_0x00b1
        L_0x00b0:
            r3 = r4
        L_0x00b1:
            if (r3 == 0) goto L_0x0078
            r0.add(r3)
            goto L_0x0078
        L_0x00b7:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isNoPermissionConfigAndAllow.getListOfServicesFromAmcs():java.util.List");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> getAllServices() {
        TitleBarRightButtonView.AnonymousClass1<R> map = getMinimumFontSize.timeoutForFirstEmit(this.splitFacade.setMin.length(), 10000).map(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(map, "splitFacade\n        .tra…            map\n        }");
        return map;
    }

    /* access modifiers changed from: private */
    public final String getServicesByCategoryKey(getRequestMainPackage getrequestmainpackage, String str) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(new setMax(getrequestmainpackage, str));
        RedDotDrawable tointrange = new toIntRange(this, str);
        setRefreshAnimation.getMax(tointrange, "resumeFunctionInCaseOfError is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setclosebuttoncolor = new setCloseButtonColor(max, tointrange);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setclosebuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setclosebuttoncolor);
        }
        Object min = setclosebuttoncolor.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "Single.fromCallable {\n  …    )\n    }.blockingGet()");
        return (String) min;
    }

    /* access modifiers changed from: private */
    public final JSONArray getServicesByCategoryKeyFromLocal(String str) {
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, LocalCallManager.CATEGORIES_JSON);
        Object obj = null;
        if (loadJSONFromAsset != null) {
            try {
                obj = new Gson().fromJson(new JSONObject(loadJSONFromAsset).toString(), Map.class);
            } catch (Exception unused) {
            }
        }
        Map map = (Map) obj;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Collection collection = (List) map.get(str);
        return collection == null || collection.isEmpty() ? new JSONArray(collection) : new JSONArray();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class equals<V> implements Callable<TitleBar> {
        final /* synthetic */ String getMax;
        final /* synthetic */ getRequestMainPackage setMax;

        equals(getRequestMainPackage getrequestmainpackage, String str) {
            this.setMax = getrequestmainpackage;
            this.getMax = str;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
        /* renamed from: length */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.TitleBar call() {
            /*
                r4 = this;
                o.getRequestMainPackage r0 = r4.setMax
                java.lang.String r1 = r4.getMax
                r2 = 1
                java.lang.String r0 = r0.getMax((java.lang.String) r1, (boolean) r2)
                java.lang.Class<o.TitleBar> r1 = o.TitleBar.class
                java.lang.Class<org.json.JSONArray> r2 = org.json.JSONArray.class
                boolean r1 = r1.isAssignableFrom(r2)
                r2 = 0
                if (r1 == 0) goto L_0x0021
                org.json.JSONArray r1 = new org.json.JSONArray
                if (r0 != 0) goto L_0x001a
                java.lang.String r0 = ""
            L_0x001a:
                r1.<init>(r0)
                r2 = r1
                o.TitleBar r2 = (o.TitleBar) r2
                goto L_0x0043
            L_0x0021:
                if (r0 == 0) goto L_0x0040
                if (r0 != 0) goto L_0x0027
            L_0x0025:
                r0 = r2
                goto L_0x003b
            L_0x0027:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0025 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0025 }
                com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0025 }
                r0.<init>()     // Catch:{ Exception -> 0x0025 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0025 }
                java.lang.Class<o.TitleBar> r3 = o.TitleBar.class
                java.lang.Object r0 = r0.fromJson((java.lang.String) r1, r3)     // Catch:{ Exception -> 0x0025 }
            L_0x003b:
                if (r0 != 0) goto L_0x003e
                goto L_0x0040
            L_0x003e:
                r2 = r0
                goto L_0x0043
            L_0x0040:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            L_0x0043:
                o.TitleBar r2 = (o.TitleBar) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.isNoPermissionConfigAndAllow.equals.call():o.TitleBar");
        }
    }

    /* access modifiers changed from: private */
    public final TitleBar getThirdPartyEntity(getRequestMainPackage getrequestmainpackage, String str) {
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 max = TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1.setMax(new equals(getrequestmainpackage, str));
        RedDotDrawable tofloatrange = new toFloatRange(this, str);
        setRefreshAnimation.getMax(tofloatrange, "resumeFunctionInCaseOfError is null");
        TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1 setclosebuttoncolor = new setCloseButtonColor(max, tofloatrange);
        RedDotDrawable<? super TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1, ? extends TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1> redDotDrawable = SecuritySignature.toString;
        if (redDotDrawable != null) {
            setclosebuttoncolor = (TitleBarRightButtonView.CornerMarkingUIController.AnonymousClass1) SecuritySignature.getMax(redDotDrawable, setclosebuttoncolor);
        }
        Object min = setclosebuttoncolor.setMin();
        TitleBar titleBar = (TitleBar) min;
        titleBar.setKey(str);
        Intrinsics.checkNotNullExpressionValue(min, "Single.fromCallable {\n  …   key = serviceKey\n    }");
        return titleBar;
    }

    /* access modifiers changed from: private */
    public final TitleBar getThirdPartyEntityFromLocal(String str) {
        Map map;
        String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.context, LocalCallManager.SERVICES_JSON);
        if (loadJSONFromAsset == null) {
            try {
                map = MapsKt.emptyMap();
            } catch (Exception unused) {
                map = MapsKt.emptyMap();
            }
        } else {
            Object parseObject = JSON.parseObject(new JSONObject(loadJSONFromAsset).toString(), new isInside(), new Feature[0]);
            Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
            map = (Map) parseObject;
        }
        TitleBar titleBar = (TitleBar) map.get(str);
        return titleBar == null ? new TitleBar((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, false, (String) null, (inflateFromResource) null, false, (List) null, 8380415, (DefaultConstructorMarker) null) : titleBar;
    }

    /* access modifiers changed from: private */
    public final List<TitleBar> getListOfServices(getRequestMainPackage getrequestmainpackage) {
        String max = getrequestmainpackage.getMax(Category.SERVICES, true);
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
        List<String> list = null;
        if (!(max.length() > 0)) {
            max = null;
        }
        String str = max;
        if (str != null) {
            List<String> stringList = setFantasyFontFamily.toStringList(new JSONArray(str));
            if (true ^ stringList.isEmpty()) {
                list = stringList;
            }
            if (list != null) {
                List arrayList = new ArrayList();
                Map<String, getSystemLocation> min = isUesCacheLocation.getMax().setMin(list, getrequestmainpackage.setMin());
                Intrinsics.checkNotNullExpressionValue(min, "it");
                getrequestmainpackage.setMin(min);
                Map linkedHashMap = new LinkedHashMap();
                for (Map.Entry next : min.entrySet()) {
                    String str2 = (String) next.getKey();
                    String str3 = ((getSystemLocation) next.getValue()).getMin;
                    if (str3 != null) {
                        Intrinsics.checkNotNullExpressionValue(str2, "key");
                        if (str3 != null) {
                            linkedHashMap.put(str2, str3);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                }
                Collection arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry value : linkedHashMap.entrySet()) {
                    for (String thirdPartyEntity : setFantasyFontFamily.toStringList(new JSONArray((String) value.getValue()))) {
                        arrayList.add(getThirdPartyEntity(getrequestmainpackage, thirdPartyEntity));
                    }
                    arrayList2.add(Unit.INSTANCE);
                }
                Collection arrayList3 = new ArrayList();
                Iterator it = ((List) arrayList2).iterator();
                while (it.hasNext()) {
                    it.next();
                    CollectionsKt.addAll(arrayList3, arrayList);
                }
                return (List) arrayList3;
            }
        }
        return getListOfServicesFromAmcs();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<String> {
        final /* synthetic */ String length;
        final /* synthetic */ getRequestMainPackage setMin;

        setMax(getRequestMainPackage getrequestmainpackage, String str) {
            this.setMin = getrequestmainpackage;
            this.length = str;
        }

        public final /* synthetic */ Object call() {
            String max = this.setMin.getMax(this.length, true);
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
            return max;
        }
    }
}
