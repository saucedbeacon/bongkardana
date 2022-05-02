package o;

import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.domain.services.Category;
import id.dana.model.SkuAttributeModel;
import id.dana.model.ThirdPartyService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.NullBeaconDataFactory;
import o.OrientationDetector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\"\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0014J(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001bJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010 \u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0002J\u0012\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003J&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00022\u0006\u0010#\u001a\u00020\u000eJ.\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00022\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eJ\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010'\u001a\u00020\u0017J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00022\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0002J\u001e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0010\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0002J\u0014\u0010+\u001a\u0004\u0018\u00010,2\b\u0010\u0016\u001a\u0004\u0018\u00010-H\u0002R\u0014\u0010\b\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006."}, d2 = {"Lid/dana/mapper/ThirdPartyServicesMapper;", "Lid/dana/data/base/BaseMapper;", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "Lid/dana/model/ThirdPartyService;", "serviceCategoryMapper", "Lid/dana/richview/servicescard/mapper/ServiceCategoryMapper;", "(Lid/dana/richview/servicescard/mapper/ServiceCategoryMapper;)V", "edit", "getEdit", "()Lid/dana/model/ThirdPartyService;", "empty", "getEmpty", "favoritesEnabled", "", "space", "getSpace", "fillEmpty", "", "services", "", "getHeader", "entity", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "isFeatured", "isFeaturedService", "key", "", "map", "entities", "keyCategory", "setFavoritesEnabled", "takeoutPromotedService", "transform", "transformCategoryServices", "isExcludeHeader", "editMode", "transformFavoriteServices", "transformForEditFavorites", "thirdPartyCategoryService", "transformServiceKeywords", "keyword", "transformServicesOnly", "transformSpmId", "Lid/dana/model/ThirdPartyService$SpmId;", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse$SpmId;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class parseBatteryPercentage extends setSpeed<List<? extends ThirdPartyServiceResponse>, List<? extends ThirdPartyService>> {
    public boolean length;
    private final OrientationDetector.OrientationListener setMax;

    public final /* synthetic */ Object map(Object obj) {
        List<ThirdPartyServiceResponse> list = (List) obj;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (ThirdPartyServiceResponse max : list) {
            ThirdPartyService max2 = setMax(max);
            if (max2 != null) {
                arrayList.add(max2);
            }
        }
        return (List) arrayList;
    }

    @Inject
    public parseBatteryPercentage(@NotNull OrientationDetector.OrientationListener orientationListener) {
        Intrinsics.checkNotNullParameter(orientationListener, "serviceCategoryMapper");
        this.setMax = orientationListener;
    }

    @NotNull
    private static List<ThirdPartyService> length(@Nullable List<ThirdPartyServiceResponse> list, @Nullable String str) {
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Collection arrayList = new ArrayList();
        for (ThirdPartyServiceResponse max : list) {
            ThirdPartyService max2 = setMax(max);
            if (max2 != null) {
                max2.getMin = str;
            } else {
                max2 = null;
            }
            if (max2 != null) {
                arrayList.add(max2);
            }
        }
        return (List) arrayList;
    }

    @Nullable
    public static ThirdPartyService setMax(@Nullable ThirdPartyServiceResponse thirdPartyServiceResponse) {
        SkuAttributeModel skuAttributeModel = null;
        if (thirdPartyServiceResponse == null) {
            return null;
        }
        ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
        getmin.getMax = thirdPartyServiceResponse.getAction();
        getmin.setMin = thirdPartyServiceResponse.getClientId();
        getmin.setMax = thirdPartyServiceResponse.getAppId();
        getmin.length = thirdPartyServiceResponse.isEnable();
        getmin.getMin = thirdPartyServiceResponse.getIcon();
        String key = thirdPartyServiceResponse.getKey();
        Intrinsics.checkNotNullParameter(key, "key");
        getmin.isInside = key;
        getmin.IsOverlapping = thirdPartyServiceResponse.getLink();
        getmin.toIntRange = thirdPartyServiceResponse.getName();
        getmin.equals = thirdPartyServiceResponse.getNameInd();
        getmin.toFloatRange = thirdPartyServiceResponse.getNameTag();
        getmin.toDoubleRange = thirdPartyServiceResponse.getOperationType();
        getmin.toString = thirdPartyServiceResponse.getRedirectUrl();
        getmin.FastBitmap$CoordinateSystem = thirdPartyServiceResponse.getScopes();
        getmin.values = 0;
        getmin.hashCode = thirdPartyServiceResponse.getUserAction();
        getmin.Mean$Arithmetic = thirdPartyServiceResponse.getDescription();
        ThirdPartyService.getMin length2 = getmin.length(thirdPartyServiceResponse.getButtonTitle());
        length2.valueOf = getMax(thirdPartyServiceResponse.getKeyword());
        length2.invokeSuspend = thirdPartyServiceResponse.getRibbonText();
        length2.invoke = thirdPartyServiceResponse.isHasRedDot();
        length2.Grayscale$Algorithm = getMin(thirdPartyServiceResponse.getSpmId());
        length2.ICustomTabsCallback = thirdPartyServiceResponse.getNeedConsult();
        length2.create = thirdPartyServiceResponse.getSpaceCodes();
        GriverInnerAmcsLiteConfig skuAttr = thirdPartyServiceResponse.getSkuAttr();
        if (skuAttr != null) {
            skuAttributeModel = safelyFillForConcurrentMap.setMax(skuAttr);
        }
        length2.onNavigationEvent = skuAttributeModel;
        return length2.setMin();
    }

    private static ThirdPartyService.SpmId getMin(ThirdPartyServiceResponse.SpmId spmId) {
        if (spmId == null) {
            return null;
        }
        ThirdPartyService.SpmId spmId2 = new ThirdPartyService.SpmId((byte) 0);
        spmId2.setMax = spmId.getHome();
        spmId2.getMin = spmId.getAll();
        return spmId2;
    }

    private static List<String> getMax(String str) {
        if (str == null) {
            str = "";
        }
        Collection arrayList = new ArrayList();
        for (Object next : StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null)) {
            if (!(((String) next).length() == 0)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    @NotNull
    public final List<ThirdPartyService> getMax(@Nullable List<? extends NullBeaconDataFactory.AnonymousClass1> list, boolean z, boolean z2) {
        List<ThirdPartyService> arrayList = new ArrayList<>();
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List<NullBeaconDataFactory.AnonymousClass1> filterNotNull = CollectionsKt.filterNotNull(list);
        for (NullBeaconDataFactory.AnonymousClass1 r2 : filterNotNull) {
            String key = r2.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "it.key");
            boolean max = setMax(key);
            if (!z2) {
                arrayList.add(setMax(r2, max));
            }
            arrayList.addAll(length(r2.getThirdPartyServices(), r2.getKey()));
            if (max) {
                if (this.length) {
                    if (arrayList.size() > 1) {
                        arrayList.remove(1);
                    }
                    if (z) {
                        ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
                        getmin.values = 5;
                        Intrinsics.checkNotNullParameter("edit", "key");
                        getmin.isInside = "edit";
                        getmin.b = true;
                        arrayList.add(getmin.setMin());
                    }
                }
                for (ThirdPartyService thirdPartyService : arrayList) {
                    thirdPartyService.valueOf = true;
                }
            }
        }
        if (filterNotNull.size() > 1) {
            ThirdPartyService.getMin getmin2 = new ThirdPartyService.getMin();
            getmin2.values = 4;
            getmin2.valueOf = new ArrayList();
            arrayList.add(getmin2.setMin());
        }
        return arrayList;
    }

    private static boolean setMax(String str) {
        return StringsKt.equals(Category.FEATURED, str, true);
    }

    public final ThirdPartyService setMax(NullBeaconDataFactory.AnonymousClass1 r4, boolean z) {
        ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
        OrientationDetector.OrientationListener orientationListener = this.setMax;
        String key = r4.getKey();
        Intrinsics.checkNotNullExpressionValue(key, "entity.key");
        getmin.toIntRange = orientationListener.getMax(key);
        getmin.values = 3;
        getmin.b = z;
        getmin.valueOf = new ArrayList();
        return getmin.setMin();
    }

    @NotNull
    public static List<ThirdPartyService> setMin(@Nullable List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
        List<ThirdPartyServiceResponse> list2;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        Iterable<NullBeaconDataFactory.AnonymousClass1> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (NullBeaconDataFactory.AnonymousClass1 r1 : iterable) {
            String str = null;
            if (r1 != null) {
                list2 = r1.getThirdPartyServices();
            } else {
                list2 = null;
            }
            if (r1 != null) {
                str = r1.getKey();
            }
            arrayList.add(length(list2, str));
        }
        return CollectionsKt.flatten((List) arrayList);
    }

    public static void getMin(List<ThirdPartyService> list) {
        for (int size = list.size(); size <= 8; size++) {
            ThirdPartyService.getMin getmin = new ThirdPartyService.getMin();
            getmin.values = 6;
            Intrinsics.checkNotNullParameter("", "key");
            getmin.isInside = "";
            list.add(getmin.setMin());
        }
    }
}
