package o;

import android.content.Context;
import com.alibaba.fastjson.TypeReference;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.Gson;
import com.iap.ac.config.lite.ConfigCenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t0\bH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\b2\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bH\u0016¨\u0006\u0010"}, d2 = {"Lid/dana/data/services/repository/source/amcs/AmcsServicesEntityData;", "Lid/dana/data/services/repository/source/ServicesEntityData;", "context", "Landroid/content/Context;", "amcsManager", "Lid/dana/data/foundation/amcs/AMCSManager;", "(Landroid/content/Context;Lid/dana/data/foundation/amcs/AMCSManager;)V", "getAllServices", "Lio/reactivex/Observable;", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "getCategories", "category", "getRawServices", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class IPCResultDesc implements IPCParameter {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<List<? extends TitleBar>> {
        public static final getMin length = new getMin();

        getMin() {
        }

        public final /* synthetic */ Object call() {
            return getMin();
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x006c A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.List<o.TitleBar> getMin() {
            /*
                com.iap.ac.config.lite.ConfigCenter r0 = com.iap.ac.config.lite.ConfigCenter.getInstance()
                java.lang.String r1 = "Services"
                org.json.JSONObject r0 = r0.getSectionConfig(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = r1
                goto L_0x0021
            L_0x0012:
                com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0010 }
                r2.<init>()     // Catch:{ Exception -> 0x0010 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0010 }
                java.lang.Class<java.util.Map> r3 = java.util.Map.class
                java.lang.Object r0 = r2.fromJson((java.lang.String) r0, r3)     // Catch:{ Exception -> 0x0010 }
            L_0x0021:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.util.Map r0 = (java.util.Map) r0
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                r2.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L_0x0033:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L_0x005b
                java.lang.Object r3 = r0.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getKey()
                java.lang.String r4 = (java.lang.String) r4
                r5 = 0
                r6 = 2
                java.lang.String r7 = "service_"
                boolean r4 = kotlin.text.StringsKt.startsWith$default(r4, r7, r5, r6, r1)
                if (r4 == 0) goto L_0x0033
                java.lang.Object r4 = r3.getKey()
                java.lang.Object r3 = r3.getValue()
                r2.put(r4, r3)
                goto L_0x0033
            L_0x005b:
                java.util.Map r2 = (java.util.Map) r2
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x006c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00ab
                java.lang.Object r3 = r2.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto L_0x0082
            L_0x0080:
                r4 = r1
                goto L_0x0096
            L_0x0082:
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x0080 }
                r5.<init>(r4)     // Catch:{ Exception -> 0x0080 }
                com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0080 }
                r4.<init>()     // Catch:{ Exception -> 0x0080 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0080 }
                java.lang.Class<o.TitleBar> r6 = o.TitleBar.class
                java.lang.Object r4 = r4.fromJson((java.lang.String) r5, r6)     // Catch:{ Exception -> 0x0080 }
            L_0x0096:
                o.TitleBar r4 = (o.TitleBar) r4
                if (r4 == 0) goto L_0x00a4
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                r4.setKey(r3)
                goto L_0x00a5
            L_0x00a4:
                r4 = r1
            L_0x00a5:
                if (r4 == 0) goto L_0x006c
                r0.add(r4)
                goto L_0x006c
            L_0x00ab:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r0 = r0.iterator()
            L_0x00ba:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00d1
                java.lang.Object r2 = r0.next()
                r3 = r2
                o.TitleBar r3 = (o.TitleBar) r3
                boolean r3 = r3.getEnable()
                if (r3 == 0) goto L_0x00ba
                r1.add(r2)
                goto L_0x00ba
            L_0x00d1:
                java.util.List r1 = (java.util.List) r1
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x00e3:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x00fe
                java.lang.Object r3 = r1.next()
                r4 = r3
                o.TitleBar r4 = (o.TitleBar) r4
                java.lang.String r4 = r4.getKey()
                boolean r4 = r0.add(r4)
                if (r4 == 0) goto L_0x00e3
                r2.add(r3)
                goto L_0x00e3
            L_0x00fe:
                java.util.List r2 = (java.util.List) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IPCResultDesc.getMin.getMin():java.util.List");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a.\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "", "", "Lid/dana/data/homeinfo/model/ThirdPartyEntity;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<Map<String, ? extends List<? extends TitleBar>>> {
        public static final length length = new length();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$1", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends TypeReference<Map<String, ? extends String>> {
        }

        length() {
        }

        public final /* synthetic */ Object call() {
            return length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[Catch:{ Exception -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0036 A[SYNTHETIC, Splitter:B:8:0x0036] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.util.Map<java.lang.String, java.util.List<o.TitleBar>> length() {
            /*
                com.iap.ac.config.lite.ConfigCenter r0 = com.iap.ac.config.lite.ConfigCenter.getInstance()
                java.lang.String r1 = "Categories"
                org.json.JSONObject r0 = r0.getSectionConfig(r1)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                r0 = r1
                goto L_0x0021
            L_0x0012:
                com.google.gson.Gson r2 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0010 }
                r2.<init>()     // Catch:{ Exception -> 0x0010 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0010 }
                java.lang.Class<java.util.Map> r3 = java.util.Map.class
                java.lang.Object r0 = r2.fromJson((java.lang.String) r0, r3)     // Catch:{ Exception -> 0x0010 }
            L_0x0021:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                java.util.Map r0 = (java.util.Map) r0
                com.iap.ac.config.lite.ConfigCenter r2 = com.iap.ac.config.lite.ConfigCenter.getInstance()
                java.lang.String r3 = "Services"
                org.json.JSONObject r2 = r2.getSectionConfig(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                r3 = 0
                if (r2 != 0) goto L_0x003b
                java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()     // Catch:{ Exception -> 0x0054 }
                goto L_0x0058
            L_0x003b:
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0054 }
                o.IPCResultDesc$length$setMax r4 = new o.IPCResultDesc$length$setMax     // Catch:{ Exception -> 0x0054 }
                r4.<init>()     // Catch:{ Exception -> 0x0054 }
                com.alibaba.fastjson.TypeReference r4 = (com.alibaba.fastjson.TypeReference) r4     // Catch:{ Exception -> 0x0054 }
                com.alibaba.fastjson.parser.Feature[] r5 = new com.alibaba.fastjson.parser.Feature[r3]     // Catch:{ Exception -> 0x0054 }
                java.lang.Object r2 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r2, r4, (com.alibaba.fastjson.parser.Feature[]) r5)     // Catch:{ Exception -> 0x0054 }
                java.lang.String r4 = "JSON.parseObject(json.to…nce<Map<String, V>>() {})"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ Exception -> 0x0054 }
                java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            L_0x0058:
                java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
                r4.<init>()
                java.util.Map r4 = (java.util.Map) r4
                java.util.Set r2 = r2.entrySet()
                java.util.Iterator r2 = r2.iterator()
            L_0x0067:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x00a3
                java.lang.Object r5 = r2.next()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r6 = r5.getKey()
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r5.getValue()
                java.lang.String r7 = (java.lang.String) r7
                r8 = 2
                java.lang.String r9 = "service_"
                boolean r6 = kotlin.text.StringsKt.startsWith$default(r6, r9, r3, r8, r1)
                if (r6 == 0) goto L_0x0094
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r6 = 123(0x7b, float:1.72E-43)
                boolean r6 = kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) r7, (char) r6, (boolean) r3, (int) r8, (java.lang.Object) r1)
                if (r6 == 0) goto L_0x0094
                r6 = 1
                goto L_0x0095
            L_0x0094:
                r6 = 0
            L_0x0095:
                if (r6 == 0) goto L_0x0067
                java.lang.Object r6 = r5.getKey()
                java.lang.Object r5 = r5.getValue()
                r4.put(r6, r5)
                goto L_0x0067
            L_0x00a3:
                java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                int r3 = r4.size()
                int r3 = kotlin.collections.MapsKt.mapCapacity(r3)
                r2.<init>(r3)
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r4.entrySet()
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.Iterator r3 = r3.iterator()
            L_0x00bc:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00fd
                java.lang.Object r4 = r3.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r5 = r4.getKey()
                java.lang.Object r6 = r4.getValue()
                java.lang.String r6 = (java.lang.String) r6
                if (r6 != 0) goto L_0x00d6
            L_0x00d4:
                r6 = r1
                goto L_0x00ea
            L_0x00d6:
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d4 }
                r7.<init>(r6)     // Catch:{ Exception -> 0x00d4 }
                com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00d4 }
                r6.<init>()     // Catch:{ Exception -> 0x00d4 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00d4 }
                java.lang.Class<o.TitleBar> r8 = o.TitleBar.class
                java.lang.Object r6 = r6.fromJson((java.lang.String) r7, r8)     // Catch:{ Exception -> 0x00d4 }
            L_0x00ea:
                o.TitleBar r6 = (o.TitleBar) r6
                if (r6 == 0) goto L_0x00f8
                java.lang.Object r4 = r4.getKey()
                java.lang.String r4 = (java.lang.String) r4
                r6.setKey(r4)
                goto L_0x00f9
            L_0x00f8:
                r6 = r1
            L_0x00f9:
                r2.put(r5, r6)
                goto L_0x00bc
            L_0x00fd:
                java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
                r3.<init>()
                java.util.Map r3 = (java.util.Map) r3
                java.lang.String r4 = "category_services"
                java.lang.Object r4 = r0.get(r4)
                java.util.List r4 = (java.util.List) r4
                if (r4 == 0) goto L_0x017d
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                java.util.Iterator r4 = r4.iterator()
            L_0x0114:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x017d
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Object r6 = r0.get(r5)
                java.util.List r6 = (java.util.List) r6
                if (r6 == 0) goto L_0x0150
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                java.util.Collection r7 = (java.util.Collection) r7
                java.util.Iterator r6 = r6.iterator()
            L_0x0135:
                boolean r8 = r6.hasNext()
                if (r8 == 0) goto L_0x014d
                java.lang.Object r8 = r6.next()
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r8 = r2.get(r8)
                o.TitleBar r8 = (o.TitleBar) r8
                if (r8 == 0) goto L_0x0135
                r7.add(r8)
                goto L_0x0135
            L_0x014d:
                java.util.List r7 = (java.util.List) r7
                goto L_0x0151
            L_0x0150:
                r7 = r1
            L_0x0151:
                if (r7 == 0) goto L_0x0114
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Collection r6 = (java.util.Collection) r6
                java.util.Iterator r7 = r7.iterator()
            L_0x0160:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0177
                java.lang.Object r8 = r7.next()
                r9 = r8
                o.TitleBar r9 = (o.TitleBar) r9
                boolean r9 = r9.getEnable()
                if (r9 == 0) goto L_0x0160
                r6.add(r8)
                goto L_0x0160
            L_0x0177:
                java.util.List r6 = (java.util.List) r6
                r3.put(r5, r6)
                goto L_0x0114
            L_0x017d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.IPCResultDesc.length.length():java.util.Map");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class setMax<V> implements Callable<List<? extends String>> {
        public static final setMax setMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object call() {
            return length();
        }

        private static List<String> length() {
            JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("Categories");
            Intrinsics.checkNotNull(sectionConfig);
            Map map = null;
            if (sectionConfig != null) {
                try {
                    map = new Gson().fromJson(sectionConfig.toString(), Map.class);
                } catch (Exception unused) {
                }
            }
            Intrinsics.checkNotNull(map);
            Map map2 = map;
            Collection arrayList = new ArrayList(map2.size());
            for (Map.Entry value : map2.entrySet()) {
                arrayList.add(setFantasyFontFamily.toStringList(new JSONArray((String) value.getValue())));
            }
            return CollectionsKt.distinct(CollectionsKt.flatten((List) arrayList));
        }
    }

    @Inject
    public IPCResultDesc(@NotNull Context context, @NotNull AppPausePoint appPausePoint) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appPausePoint, "amcsManager");
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCategories(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        TitleBarRightButtonView.AnonymousClass1<List<String>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(setMax.setMin);
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …    .distinct()\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> getRawServices() {
        TitleBarRightButtonView.AnonymousClass1<List<TitleBar>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(getMin.length);
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ctBy { it.key }\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> getAllServices() {
        TitleBarRightButtonView.AnonymousClass1<Map<String, List<TitleBar>>> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(length.length);
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …            map\n        }");
        return fromCallable;
    }
}
