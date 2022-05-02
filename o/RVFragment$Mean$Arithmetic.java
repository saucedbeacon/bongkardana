package o;

import android.location.Location;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.domain.globalsearch.model.PaySearchInfo;
import id.dana.domain.globalsearch.model.SearchResultResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "kotlin.jvm.PlatformType", "categoryMap", "", "", "Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "apply"}, k = 3, mv = {1, 4, 2})
final class RVFragment$Mean$Arithmetic<T, R> implements RedDotDrawable<Map<String, ? extends setVerticalScrollBarEnabled>, TitleBarRightButtonView.AnonymousClass4<? extends List<? extends SearchResultResponse>>> {
    final /* synthetic */ int getMax;
    final /* synthetic */ RVFragment getMin;
    final /* synthetic */ int length;
    final /* synthetic */ List setMax;
    final /* synthetic */ String setMin;
    final /* synthetic */ Location toFloatRange;

    RVFragment$Mean$Arithmetic(RVFragment rVFragment, List list, String str, int i, int i2, Location location) {
        this.getMin = rVFragment;
        this.setMax = list;
        this.setMin = str;
        this.getMax = i;
        this.length = i2;
        this.toFloatRange = location;
    }

    public final /* synthetic */ Object apply(Object obj) {
        Map map = (Map) obj;
        Intrinsics.checkNotNullParameter(map, "categoryMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (this.setMax.isEmpty() || this.setMax.contains(str)) {
                z = true;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map map2 = linkedHashMap;
        Collection arrayList = new ArrayList(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            String str2 = (String) entry2.getKey();
            RVFragment rVFragment = this.getMin;
            String str3 = this.setMin;
            int i = this.getMax;
            int i2 = this.length;
            List<String> permission = ((setVerticalScrollBarEnabled) entry2.getValue()).getPermission();
            arrayList.add(RVFragment.setMin(rVFragment, str3, i, i2, str2, permission != null && permission.contains("location")));
        }
        return TitleBarRightButtonView.AnonymousClass1.zipIterable((List) arrayList, AnonymousClass3.setMin, true, 1).zipWith(connectBluetoothDevice.requestSingleUpdateObservable(this.getMin.getMin, this.toFloatRange).onErrorReturnItem(this.getMin.getMax), new removeNode<List<? extends SearchResultResponse>, LatLng, List<? extends SearchResultResponse>>(this) {
            final /* synthetic */ RVFragment$Mean$Arithmetic getMax;

            {
                this.getMax = r1;
            }

            public final /* synthetic */ Object setMax(Object obj, Object obj2) {
                List<SearchResultResponse> list = (List) obj;
                LatLng latLng = (LatLng) obj2;
                Intrinsics.checkNotNullParameter(list, "result");
                Intrinsics.checkNotNullParameter(latLng, "userLocation");
                this.getMax.getMin.getMax = latLng;
                for (SearchResultResponse searchResultList : list) {
                    List<PaySearchInfo> searchResultList2 = searchResultList.getSearchResultList();
                    if (searchResultList2 != null) {
                        for (PaySearchInfo userLocation : searchResultList2) {
                            userLocation.setUserLocation(latLng);
                        }
                    }
                }
                return list;
            }
        });
    }
}
