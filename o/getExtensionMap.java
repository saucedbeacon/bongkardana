package o;

import android.content.Context;
import android.location.Location;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.domain.globalsearch.model.PaySearchInfo;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.SearchResult;
import id.dana.globalsearch.model.SearchResultModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0004\u001a\u00020\u0005\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u000b\u001a.\u0010\f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f¨\u0006\u0013"}, d2 = {"getCategory", "", "Lid/dana/globalsearch/model/SearchResult;", "getCategoryName", "context", "Landroid/content/Context;", "toListPaySearchInfoModel", "", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "toSearchResult", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "toSearchResultModel", "Lid/dana/globalsearch/model/SearchResultModel;", "hasSeeAll", "", "limitList", "", "shouldLoadMore", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getExtensionMap {
    @NotNull
    public static final SearchResultModel setMax(@NotNull SearchResult searchResult, @NotNull Context context, boolean z, int i, boolean z2) {
        Intrinsics.checkNotNullParameter(searchResult, "$this$toSearchResultModel");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        String length = length(searchResult, context);
        boolean requiresLocationPermission = searchResult.getRequiresLocationPermission();
        List<PaySearchInfo> searchResultListEntity = searchResult.getSearchResultListEntity();
        if (searchResultListEntity == null) {
            searchResultListEntity = CollectionsKt.emptyList();
        }
        return new SearchResultModel(length, requiresLocationPermission, setMax(searchResultListEntity, context), z, i, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = (id.dana.domain.globalsearch.model.PaySearchInfo) kotlin.collections.CollectionsKt.firstOrNull(r1);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String setMin(@org.jetbrains.annotations.NotNull id.dana.globalsearch.model.SearchResult r1) {
        /*
            java.lang.String r0 = "$this$getCategory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.util.List r1 = r1.getSearchResultListEntity()
            if (r1 == 0) goto L_0x0018
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r1)
            id.dana.domain.globalsearch.model.PaySearchInfo r1 = (id.dana.domain.globalsearch.model.PaySearchInfo) r1
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.getCategory()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = ""
        L_0x001d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExtensionMap.setMin(id.dana.globalsearch.model.SearchResult):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final java.lang.String length(id.dana.globalsearch.model.SearchResult r1, android.content.Context r2) {
        /*
            java.lang.String r1 = setMin(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1592831339: goto L_0x003c;
                case -667013580: goto L_0x002c;
                case 1016896708: goto L_0x001c;
                case 2014341056: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x004c
        L_0x000c:
            java.lang.String r0 = "DF_SKU"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004c
            r1 = 2131886862(0x7f12030e, float:1.9408315E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0053
        L_0x001c:
            java.lang.String r0 = "OFFLINE_MERCHANT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004c
            r1 = 2131888158(0x7f12081e, float:1.9410943E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0053
        L_0x002c:
            java.lang.String r0 = "ONLINE_MERCHANT"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004c
            r1 = 2131888221(0x7f12085d, float:1.9411071E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0053
        L_0x003c:
            java.lang.String r0 = "SERVICE"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004c
            r1 = 2131888878(0x7f120aee, float:1.9412404E38)
            java.lang.String r1 = r2.getString(r1)
            goto L_0x0053
        L_0x004c:
            r1 = 2131886863(0x7f12030f, float:1.9408317E38)
            java.lang.String r1 = r2.getString(r1)
        L_0x0053:
            java.lang.String r2 = "when (getCategory()) {\n …_eats_restaurant_title)\n}"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getExtensionMap.length(id.dana.globalsearch.model.SearchResult, android.content.Context):java.lang.String");
    }

    @NotNull
    private static List<PaySearchInfoModel> setMax(@NotNull List<PaySearchInfo> list, @NotNull Context context) {
        String str;
        List<PaySearchInfo> list2 = list;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(list2, "$this$toListPaySearchInfoModel");
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Iterable<PaySearchInfo> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (PaySearchInfo paySearchInfo : iterable) {
            if (paySearchInfo.getUserLocation().isUndefined() || paySearchInfo.getLocation() == null) {
                str = null;
            } else {
                double latitude = paySearchInfo.getUserLocation().getLatitude();
                double longitude = paySearchInfo.getUserLocation().getLongitude();
                LatLng location = paySearchInfo.getLocation();
                Intrinsics.checkNotNull(location);
                double latitude2 = location.getLatitude();
                LatLng location2 = paySearchInfo.getLocation();
                Intrinsics.checkNotNull(location2);
                double longitude2 = location2.getLongitude();
                Location location3 = new Location("");
                location3.setLatitude(latitude);
                location3.setLongitude(longitude);
                Location location4 = new Location("");
                location4.setLatitude(latitude2);
                location4.setLongitude(longitude2);
                double distanceTo = (double) location3.distanceTo(location4);
                Double.isNaN(distanceTo);
                str = context2.getString(R.string.km_away, new Object[]{Double.valueOf(distanceTo / 1000.0d)});
            }
            arrayList.add(new PaySearchInfoModel(paySearchInfo.getId(), paySearchInfo.getName(), paySearchInfo.getMcc(), paySearchInfo.getCategory(), paySearchInfo.getSubCategory(), paySearchInfo.getUrlMap(), paySearchInfo.getLogo(), paySearchInfo.getTag(), paySearchInfo.getDescription(), paySearchInfo.getScore(), paySearchInfo.getRating(), paySearchInfo.getAddress(), paySearchInfo.getLocation(), paySearchInfo.getInfoType(), paySearchInfo.getInfo(), str, (String) null, false, 196608, (DefaultConstructorMarker) null));
        }
        return (List) arrayList;
    }
}
