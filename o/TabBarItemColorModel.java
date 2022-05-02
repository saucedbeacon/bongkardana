package o;

import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.here.AddressNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0011H\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016J4\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00152\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/data/here/source/network/NetworkHereLocationEntityData;", "Lid/dana/data/nearbyplaces/NearbyPlaceEntityData;", "hereAutosuggestApi", "Lid/dana/data/here/source/network/HereAutosuggestApi;", "hereLookupByIdApi", "Lid/dana/data/here/source/network/HereLookupByIdApi;", "hereOauthManager", "Lid/dana/data/here/HereOauthManager;", "(Lid/dana/data/here/source/network/HereAutosuggestApi;Lid/dana/data/here/source/network/HereLookupByIdApi;Lid/dana/data/here/HereOauthManager;)V", "composeAddressText", "", "it", "Lid/dana/data/here/model/Item;", "composeSubdistrictName", "generatePlaceComponentResult", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceComponentResult;", "generatePlacePredictionResult", "", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "items", "getDetailLocation", "Lio/reactivex/Observable;", "placeId", "uuid", "getListNearbyLocations", "keyword", "lat", "", "lon", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TabBarItemColorModel implements source {
    @NotNull
    public static final String CATEGORY_QUERY = "categoryQuery";
    @NotNull
    public static final String CHAIN_QUERY = "chainQuery";
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String LIMIT = "20";
    /* access modifiers changed from: private */
    public final getTextColor hereAutosuggestApi;
    /* access modifiers changed from: private */
    public final setBadgeColor hereLookupByIdApi;
    private final getTabbarModel hereOauthManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceComponentResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/here/model/Item;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<TabBarColorModel, print> {
        final /* synthetic */ TabBarItemColorModel getMax;

        setMax(TabBarItemColorModel tabBarItemColorModel) {
            this.getMax = tabBarItemColorModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TabBarColorModel tabBarColorModel = (TabBarColorModel) obj;
            Intrinsics.checkNotNullParameter(tabBarColorModel, "it");
            return this.getMax.generatePlaceComponentResult(tabBarColorModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "kotlin.jvm.PlatformType", "response", "Lid/dana/data/here/model/HereAutoCompleteResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<TabBarBadgeModel, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends getAction>>> {
        final /* synthetic */ TabBarItemColorModel getMax;

        setMin(TabBarItemColorModel tabBarItemColorModel) {
            this.getMax = tabBarItemColorModel;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            TabBarBadgeModel tabBarBadgeModel = (TabBarBadgeModel) obj;
            Intrinsics.checkNotNullParameter(tabBarBadgeModel, "response");
            if (tabBarBadgeModel.getItems() != null) {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(this.getMax.generatePlacePredictionResult(tabBarBadgeModel.getItems()));
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(\n       …ms)\n                    )");
            } else {
                r2 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new AddressNotFoundException());
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.error(exception)");
            }
            return r2;
        }
    }

    @Inject
    public TabBarItemColorModel(@NotNull getTextColor gettextcolor, @NotNull setBadgeColor setbadgecolor, @NotNull getTabbarModel gettabbarmodel) {
        Intrinsics.checkNotNullParameter(gettextcolor, "hereAutosuggestApi");
        Intrinsics.checkNotNullParameter(setbadgecolor, "hereLookupByIdApi");
        Intrinsics.checkNotNullParameter(gettabbarmodel, "hereOauthManager");
        this.hereAutosuggestApi = gettextcolor;
        this.hereLookupByIdApi = setbadgecolor;
        this.hereOauthManager = gettabbarmodel;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getAction>> getListNearbyLocations(@NotNull String str, double d, double d2, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(str2, HeaderConstant.HEADER_KEY_UUID);
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        sb.append(',');
        sb.append(d2);
        TitleBarRightButtonView.AnonymousClass1<List<getAction>> flatMap = this.hereOauthManager.executeHereApi(new length(this, sb.toString(), str)).flatMap(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "hereOauthManager.execute…bleToReturn\n            }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/HereAutoCompleteResponse;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<String, TitleBarRightButtonView.AnonymousClass1<TabBarBadgeModel>> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ String $locationStr;
        final /* synthetic */ TabBarItemColorModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(TabBarItemColorModel tabBarItemColorModel, String str, String str2) {
            super(1);
            this.this$0 = tabBarItemColorModel;
            this.$locationStr = str;
            this.$keyword = str2;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<TabBarBadgeModel> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return this.this$0.hereAutosuggestApi.autoSuggest(this.$locationStr, "en-US", TabBarItemColorModel.LIMIT, this.$keyword, "countryCode:IDN", str);
        }
    }

    /* access modifiers changed from: private */
    public final List<getAction> generatePlacePredictionResult(List<TabBarColorModel> list) {
        Collection arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TabBarColorModel tabBarColorModel = (TabBarColorModel) next;
            if ((!Intrinsics.areEqual((Object) tabBarColorModel.getResultType(), (Object) CHAIN_QUERY)) && (!Intrinsics.areEqual((Object) tabBarColorModel.getResultType(), (Object) CATEGORY_QUERY))) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterable<TabBarColorModel> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (TabBarColorModel tabBarColorModel2 : iterable) {
            String title = tabBarColorModel2.getTitle();
            String str = "";
            String str2 = title == null ? str : title;
            Integer distance = tabBarColorModel2.getDistance();
            long intValue = (long) (distance != null ? distance.intValue() : 0);
            String id2 = tabBarColorModel2.getId();
            String str3 = id2 == null ? str : id2;
            String id3 = tabBarColorModel2.getId();
            String str4 = id3 == null ? str : id3;
            String title2 = tabBarColorModel2.getTitle();
            if (title2 != null) {
                str = title2;
            }
            arrayList2.add(new getAction(str2, intValue, str3, str4, new getEventId(str, composeAddressText(tabBarColorModel2))));
        }
        return (List) arrayList2;
    }

    private final String composeAddressText(TabBarColorModel tabBarColorModel) {
        String composeSubdistrictName = composeSubdistrictName(tabBarColorModel);
        StringBuilder sb = new StringBuilder();
        sb.append(composeSubdistrictName);
        removeTabBarBadge address = tabBarColorModel.getAddress();
        String str = null;
        String district = address != null ? address.getDistrict() : null;
        String str2 = "";
        if (district == null) {
            district = str2;
        }
        sb.append(district);
        boolean z = true;
        if (sb.toString().length() == 0) {
            removeTabBarBadge address2 = tabBarColorModel.getAddress();
            CharSequence street = address2 != null ? address2.getStreet() : null;
            if (!(street == null || street.length() == 0)) {
                z = false;
            }
            if (z) {
                removeTabBarBadge address3 = tabBarColorModel.getAddress();
                if (address3 != null) {
                    str = address3.getLabel();
                }
                if (str == null) {
                    return str2;
                }
                return str;
            }
            removeTabBarBadge address4 = tabBarColorModel.getAddress();
            if (address4 != null) {
                str = address4.getStreet();
            }
            return str == null ? str2 : str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(composeSubdistrictName);
        removeTabBarBadge address5 = tabBarColorModel.getAddress();
        if (address5 != null) {
            str = address5.getDistrict();
        }
        if (str != null) {
            str2 = str;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    private final String composeSubdistrictName(TabBarColorModel tabBarColorModel) {
        removeTabBarBadge address = tabBarColorModel.getAddress();
        String str = null;
        CharSequence subdistrict = address != null ? address.getSubdistrict() : null;
        if (subdistrict == null || subdistrict.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        removeTabBarBadge address2 = tabBarColorModel.getAddress();
        if (address2 != null) {
            str = address2.getSubdistrict();
        }
        sb.append(str);
        sb.append(", ");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/Item;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<String, TitleBarRightButtonView.AnonymousClass1<TabBarColorModel>> {
        final /* synthetic */ String $placeId;
        final /* synthetic */ TabBarItemColorModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(TabBarItemColorModel tabBarItemColorModel, String str) {
            super(1);
            this.this$0 = tabBarItemColorModel;
            this.$placeId = str;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<TabBarColorModel> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return this.this$0.hereLookupByIdApi.lookupById("en-US", this.$placeId, str);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<print> getDetailLocation(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "placeId");
        Intrinsics.checkNotNullParameter(str2, HeaderConstant.HEADER_KEY_UUID);
        TitleBarRightButtonView.AnonymousClass1<print> map = this.hereOauthManager.executeHereApi(new getMin(this, str)).map(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(map, "hereOauthManager.execute…tResult(it)\n            }");
        return map;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r3.getLat();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.print generatePlaceComponentResult(o.TabBarColorModel r9) {
        /*
            r8 = this;
            o.print r0 = new o.print
            o.RenderCallContext r1 = new o.RenderCallContext
            o.NativeCallContext$StatData$1 r2 = new o.NativeCallContext$StatData$1
            o.getBadgeColor r3 = r9.getPosition()
            r4 = 0
            if (r3 == 0) goto L_0x0019
            java.lang.Double r3 = r3.getLat()
            if (r3 == 0) goto L_0x0019
            double r6 = r3.doubleValue()
            goto L_0x001a
        L_0x0019:
            r6 = r4
        L_0x001a:
            o.getBadgeColor r9 = r9.getPosition()
            if (r9 == 0) goto L_0x002a
            java.lang.Double r9 = r9.getLng()
            if (r9 == 0) goto L_0x002a
            double r4 = r9.doubleValue()
        L_0x002a:
            r2.<init>(r6, r4)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TabBarItemColorModel.generatePlaceComponentResult(o.TabBarColorModel):o.print");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/data/here/source/network/NetworkHereLocationEntityData$Companion;", "", "()V", "CATEGORY_QUERY", "", "CHAIN_QUERY", "LIMIT", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
