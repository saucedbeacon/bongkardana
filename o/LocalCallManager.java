package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0006H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u00062\u0006\u0010\f\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/data/services/repository/source/local/DefaultServicesEntityData;", "Lid/dana/data/services/repository/source/ServicesEntityData;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getAllServices", "Lio/reactivex/Observable;", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "getCategories", "category", "getRawServices", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LocalCallManager implements IPCParameter {
    @NotNull
    public static final String CATEGORIES_JSON = "json/amcs-categories-default.json";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String SERVICES_JSON = "json/amcs-services-default.json";
    /* access modifiers changed from: private */
    public final Context context;

    @Inject
    public LocalCallManager(@NotNull Context context2) {
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        this.context = context2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<List<? extends String>> {
        final /* synthetic */ LocalCallManager setMin;

        length(LocalCallManager localCallManager) {
            this.setMin = localCallManager;
        }

        /* access modifiers changed from: private */
        /* renamed from: setMin */
        public List<String> call() {
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.setMin.context, LocalCallManager.CATEGORIES_JSON);
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
            Iterable<Map.Entry> entrySet = map.entrySet();
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entrySet, 10));
            for (Map.Entry value : entrySet) {
                arrayList.add(setFantasyFontFamily.toStringList(new JSONArray((Collection) value.getValue())));
            }
            return CollectionsKt.distinct(CollectionsKt.flatten((List) arrayList));
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCategories(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        TitleBarRightButtonView.AnonymousClass1<List<String>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new length(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …    .distinct()\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<List<? extends TitleBar>> {
        final /* synthetic */ LocalCallManager setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends TypeReference<Map<String, ? extends TitleBar>> {
        }

        setMax(LocalCallManager localCallManager) {
            this.setMax = localCallManager;
        }

        /* access modifiers changed from: private */
        /* renamed from: setMax */
        public List<TitleBar> call() {
            Map map;
            String loadJSONFromAsset = getPositiveString.loadJSONFromAsset(this.setMax.context, LocalCallManager.SERVICES_JSON);
            if (loadJSONFromAsset == null) {
                try {
                    map = MapsKt.emptyMap();
                } catch (Exception unused) {
                    map = MapsKt.emptyMap();
                }
            } else {
                Object parseObject = JSON.parseObject(new JSONObject(loadJSONFromAsset).toString(), new getMax(), new Feature[0]);
                Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                map = (Map) parseObject;
            }
            Collection arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                TitleBar titleBar = (TitleBar) entry.getValue();
                titleBar.setKey((String) entry.getKey());
                arrayList.add(titleBar);
            }
            Collection arrayList2 = new ArrayList();
            for (Object next : (List) arrayList) {
                if (((TitleBar) next).getEnable()) {
                    arrayList2.add(next);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object next2 : (List) arrayList2) {
                if (hashSet.add(((TitleBar) next2).getKey())) {
                    arrayList3.add(next2);
                }
            }
            return arrayList3;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> getRawServices() {
        TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ctBy { it.key }\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMin<V> implements Callable<Map<String, ? extends List<? extends TitleBar>>> {
        final /* synthetic */ LocalCallManager setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends TypeReference<Map<String, ? extends TitleBar>> {
        }

        setMin(LocalCallManager localCallManager) {
            this.setMax = localCallManager;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003b A[SYNTHETIC, Splitter:B:11:0x003b] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[Catch:{ Exception -> 0x005f }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* renamed from: length */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.Map<java.lang.String, java.util.List<o.TitleBar>> call() {
            /*
                r10 = this;
                o.LocalCallManager r0 = r10.setMax
                android.content.Context r0 = r0.context
                java.lang.String r1 = "json/amcs-categories-default.json"
                java.lang.String r0 = o.getPositiveString.loadJSONFromAsset(r0, r1)
                r1 = 0
                if (r0 != 0) goto L_0x0011
            L_0x000f:
                r0 = r1
                goto L_0x0025
            L_0x0011:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x000f }
                r2.<init>(r0)     // Catch:{ Exception -> 0x000f }
                com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch:{ Exception -> 0x000f }
                r0.<init>()     // Catch:{ Exception -> 0x000f }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x000f }
                java.lang.Class<java.util.Map> r3 = java.util.Map.class
                java.lang.Object r0 = r0.fromJson((java.lang.String) r2, r3)     // Catch:{ Exception -> 0x000f }
            L_0x0025:
                java.util.Map r0 = (java.util.Map) r0
                if (r0 != 0) goto L_0x002d
                java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            L_0x002d:
                o.LocalCallManager r2 = r10.setMax
                android.content.Context r2 = r2.context
                java.lang.String r3 = "json/amcs-services-default.json"
                java.lang.String r2 = o.getPositiveString.loadJSONFromAsset(r2, r3)
                if (r2 != 0) goto L_0x0040
                java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x005f }
                goto L_0x0063
            L_0x0040:
                org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x005f }
                r3.<init>(r2)     // Catch:{ Exception -> 0x005f }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x005f }
                o.LocalCallManager$setMin$getMax r3 = new o.LocalCallManager$setMin$getMax     // Catch:{ Exception -> 0x005f }
                r3.<init>()     // Catch:{ Exception -> 0x005f }
                com.alibaba.fastjson.TypeReference r3 = (com.alibaba.fastjson.TypeReference) r3     // Catch:{ Exception -> 0x005f }
                r4 = 0
                com.alibaba.fastjson.parser.Feature[] r4 = new com.alibaba.fastjson.parser.Feature[r4]     // Catch:{ Exception -> 0x005f }
                java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r2, r3, (com.alibaba.fastjson.parser.Feature[]) r4)     // Catch:{ Exception -> 0x005f }
                java.lang.String r3 = "JSON.parseObject(json.to…nce<Map<String, V>>() {})"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ Exception -> 0x005f }
                java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x005f }
                goto L_0x0063
            L_0x005f:
                java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            L_0x0063:
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "category_services"
                java.lang.Object r4 = r0.get(r4)
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L_0x00ea
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x007a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x00ea
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r0.get(r5)
                java.util.List r6 = (java.util.List) r6
                if (r6 == 0) goto L_0x00bd
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.Iterator r6 = r6.iterator()
            L_0x009b:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x00ba
                java.lang.Object r8 = r6.next()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r2.get(r8)
                o.TitleBar r9 = (o.TitleBar) r9
                if (r9 == 0) goto L_0x00b3
                r9.setKey(r8)
                goto L_0x00b4
            L_0x00b3:
                r9 = r1
            L_0x00b4:
                if (r9 == 0) goto L_0x009b
                r7.add(r9)
                goto L_0x009b
            L_0x00ba:
                java.util.List r7 = (java.util.List) r7
                goto L_0x00be
            L_0x00bd:
                r7 = r1
            L_0x00be:
                if (r7 == 0) goto L_0x007a
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r7 = r7.iterator()
            L_0x00cd:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x00e4
                java.lang.Object r8 = r7.next()
                r9 = r8
                o.TitleBar r9 = (o.TitleBar) r9
                boolean r9 = r9.getEnable()
                if (r9 == 0) goto L_0x00cd
                r6.add(r8)
                goto L_0x00cd
            L_0x00e4:
                java.util.List r6 = (java.util.List) r6
                r3.put(r5, r6)
                goto L_0x007a
            L_0x00ea:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.LocalCallManager.setMin.call():java.util.Map");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> getAllServices() {
        TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …            map\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/data/services/repository/source/local/DefaultServicesEntityData$Companion;", "", "()V", "CATEGORIES_JSON", "", "SERVICES_JSON", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
