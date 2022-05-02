package o;

import android.location.Location;
import id.dana.domain.nearbyme.model.MerchantStatusEnum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FileCache;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001DB\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\"\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\nH\u0002J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0018\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0017H\u0002J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010%\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0014J\u0016\u0010&\u001a\u00020'2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u001c\u0010(\u001a\u00020'2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u001c\u0010*\u001a\u00020'2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011J\u000e\u0010,\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u000e\u00100\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010$J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0002J\u001e\u00105\u001a\b\u0012\u0004\u0012\u0002020.2\u000e\u00106\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010$H\u0002J\u0014\u00107\u001a\u0004\u0018\u00010\u00122\b\u00108\u001a\u0004\u0018\u00010\u0012H\u0002J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020:0.2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010$H\u0002J\u0010\u0010=\u001a\u00020/2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0002J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00020?0.2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010$H\u0002R\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lid/dana/data/nearbyme/mapper/NearbyShopsResultMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/data/nearbyme/repository/source/network/result/NearbyShopsResult;", "Lid/dana/domain/nearbyme/model/ShopsPage;", "subcategoryMapper", "Lid/dana/data/merchant/mapper/MerchantSubcategoryMapper;", "promoInfoEntityMapper", "Lid/dana/data/nearbyme/mapper/PromoInfoEntityMapper;", "(Lid/dana/data/merchant/mapper/MerchantSubcategoryMapper;Lid/dana/data/nearbyme/mapper/PromoInfoEntityMapper;)V", "<set-?>", "Landroid/location/Location;", "currentMarkerLocation", "getCurrentMarkerLocation", "()Landroid/location/Location;", "isUsingNewMerchantCategories", "", "merchantSubcategoriesMap", "", "", "Lid/dana/data/merchant/model/MerchantSubcategoryEntity;", "merchantTopUpEntityMap", "apply", "currentLat", "", "currentLon", "oldItem", "getDistanceBetweenShopAndMarkerPosition", "shopEntity", "Lid/dana/data/nearbyme/model/ShopEntity;", "markerLocation", "getDistanceInKM", "distance", "getLocation", "latitude", "longitude", "getSubCategory", "", "map", "setCurrentMarkerLocation", "", "setMerchantInstId", "merchantTopUpMap", "setMerchantSubcategory", "merchantCategoryMap", "setUsingNewMerchantCategories", "transform", "", "Lid/dana/domain/nearbyme/model/Shop;", "shopEntities", "transformContactAddress", "Lid/dana/domain/nearbyme/model/ContactAddress;", "contactAddressEntity", "Lid/dana/data/nearbyme/model/ContactAddressEntity;", "transformContactAddressEntities", "contactAddressEntities", "transformMerchantId", "merchantId", "transformPromoInfoEntities", "Lid/dana/domain/nearbyme/model/PromoInfo;", "promoInfoEntities", "Lid/dana/data/nearbyme/model/PromoInfoEntity;", "transformShopEntity", "transformShopOpenHour", "Lid/dana/domain/nearbyme/model/ShopOpenHour;", "shopOpenHourEntity", "Lid/dana/data/nearbyme/model/ShopOpenHourEntity;", "transformShopOpenHourEntities", "shopOpenHourEntities", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EngineUtils extends setSpeed<generateUniqueId, H5FileUtil> {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    private static final int METER_TO_KM_DIVIDER = 1000;
    @Nullable
    private Location currentMarkerLocation;
    private boolean isUsingNewMerchantCategories;
    private Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$99$1> merchantSubcategoriesMap;
    private Map<String, String> merchantTopUpEntityMap;
    private final sendToRender promoInfoEntityMapper;
    private final com_alibaba_ariver_app_api_ExtOpt$94$1 subcategoryMapper;

    private final double getDistanceInKM(double d) {
        return d / 1000.0d;
    }

    @Inject
    public EngineUtils(@NotNull com_alibaba_ariver_app_api_ExtOpt$94$1 com_alibaba_ariver_app_api_extopt_94_1, @NotNull sendToRender sendtorender) {
        Intrinsics.checkNotNullParameter(com_alibaba_ariver_app_api_extopt_94_1, "subcategoryMapper");
        Intrinsics.checkNotNullParameter(sendtorender, "promoInfoEntityMapper");
        this.subcategoryMapper = com_alibaba_ariver_app_api_extopt_94_1;
        this.promoInfoEntityMapper = sendtorender;
    }

    @Nullable
    public final Location getCurrentMarkerLocation() {
        return this.currentMarkerLocation;
    }

    public final void setMerchantSubcategory(@Nullable Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$99$1> map) {
        this.merchantSubcategoriesMap = map;
    }

    public final void setMerchantInstId(@Nullable Map<String, String> map) {
        this.merchantTopUpEntityMap = map;
    }

    public final void setCurrentMarkerLocation(double d, double d2) {
        this.currentMarkerLocation = getLocation(d, d2);
    }

    public final void setUsingNewMerchantCategories(boolean z) {
        this.isUsingNewMerchantCategories = z;
    }

    private final Location getLocation(double d, double d2) {
        return stopBluetoothDevicesDiscovery.latLonToLocation(d, d2);
    }

    @Nullable
    public final H5FileUtil apply(double d, double d2, @Nullable generateUniqueId generateuniqueid) {
        this.currentMarkerLocation = getLocation(d, d2);
        return (H5FileUtil) apply(generateuniqueid);
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final H5FileUtil map(@Nullable generateUniqueId generateuniqueid) {
        if (generateuniqueid != null) {
            return new H5FileUtil(generateuniqueid.hasMore(), transform(generateuniqueid.getShops()));
        }
        return H5FileUtil.Companion.empty();
    }

    @NotNull
    public final List<GriverConfigUtils> transform(@Nullable List<? extends Render> list) {
        List<GriverConfigUtils> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<Render> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Render transformShopEntity : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(transformShopEntity(transformShopEntity))));
            }
        }
        return arrayList;
    }

    @NotNull
    public final GriverConfigUtils transformShopEntity(@Nullable Render render) {
        Render render2 = render;
        GriverConfigUtils griverConfigUtils = r2;
        GriverConfigUtils griverConfigUtils2 = new GriverConfigUtils((String) null, (String) null, (String) null, (List) null, 0.0d, (Map) null, (String) null, (String) null, false, 0.0d, (String) null, (Map) null, 0.0d, (String) null, (List) null, (String) null, (String) null, (List) null, (List) null, 0.0d, (String) null, 0.0d, (String) null, (String) null, (List) null, (MerchantStatusEnum) null, (String) null, (List) null, false, (String) null, (Long) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        if (render2 == null) {
            return griverConfigUtils;
        }
        GriverConfigUtils griverConfigUtils3 = griverConfigUtils;
        griverConfigUtils3.setBranchName(render.getBranchName());
        griverConfigUtils3.setBrandName(render.getBrandName());
        griverConfigUtils3.setCertStatus(render.getCertStatus());
        griverConfigUtils3.setContactAddresses(transformContactAddressEntities(render.getContactAddresses()));
        griverConfigUtils3.setExternalShopId(render.getExternalShopId());
        griverConfigUtils3.setExtInfo(render.getExtInfo());
        griverConfigUtils3.setLatitude(render.getLatitude());
        griverConfigUtils3.setLongtitude(render.getLongtitude());
        griverConfigUtils3.setLogoUrl(render.getLogoUrl());
        griverConfigUtils3.setLogoUrlMap(render.getLogoUrlMap());
        griverConfigUtils3.setMainName(render.getMainName());
        griverConfigUtils3.setMccCodes(render.getMccCodes());
        griverConfigUtils3.setSubcategories((List) this.subcategoryMapper.apply(getSubCategory(render)));
        griverConfigUtils3.setMerchantId(render.getMerchantId());
        griverConfigUtils3.setRegisterSource(render.getRegisterSource());
        griverConfigUtils3.setShopDesc(render.getShopDesc());
        griverConfigUtils3.setShopId(render.getShopId());
        griverConfigUtils3.setShopType(render.getShopType());
        griverConfigUtils3.setInstId(transformMerchantId(render.getMerchantId()));
        griverConfigUtils3.setReviewNumbers(render.getReviewNumber());
        griverConfigUtils3.setRating(render.getRating());
        griverConfigUtils3.setFullDay(render.getFullDay());
        griverConfigUtils3.setOfficeNumbers(render.getOfficeNumbers());
        griverConfigUtils3.setShopOpenHours(transformShopOpenHourEntities(render.getShopOpenHours()));
        Location location = this.currentMarkerLocation;
        if (location != null) {
            Intrinsics.checkNotNull(location);
            griverConfigUtils3.setDistance(getDistanceBetweenShopAndMarkerPosition(render2, location));
        }
        griverConfigUtils3.setPromoInfos(transformPromoInfoEntities(render.getPromoInfos()));
        griverConfigUtils3.setMerchantSizeType(render.getMerchantSizeType());
        griverConfigUtils3.setHasMoreShop(render.isHasMoreShops());
        griverConfigUtils3.setMerchantName(render.getMerchantName());
        griverConfigUtils3.setTransactionDate(render.getTransactionDate());
        return griverConfigUtils3;
    }

    private final List<getMacEncrypt> transformContactAddressEntities(List<? extends AnonymousClass2> list) {
        List<getMacEncrypt> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<AnonymousClass2> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (AnonymousClass2 transformContactAddress : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(transformContactAddress(transformContactAddress))));
            }
        }
        return arrayList;
    }

    private final List<com_alibaba_ariver_app_api_ExtOpt$99$1> getSubCategory(Render render) {
        com_alibaba_ariver_app_api_ExtOpt$99$1 com_alibaba_ariver_app_api_extopt_99_1;
        Map<String, ? extends com_alibaba_ariver_app_api_ExtOpt$99$1> map = this.merchantSubcategoriesMap;
        List<com_alibaba_ariver_app_api_ExtOpt$99$1> list = null;
        if (map != null) {
            if (render.getMccCodes() == null) {
                return null;
            }
            for (String next : render.getMccCodes()) {
                if (this.isUsingNewMerchantCategories) {
                    com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) map.get(next);
                } else {
                    com_alibaba_ariver_app_api_extopt_99_1 = (com_alibaba_ariver_app_api_ExtOpt$99$1) map.get("msc_".concat(String.valueOf(next)));
                }
                if (com_alibaba_ariver_app_api_extopt_99_1 != null) {
                    if (list == null) {
                        list = new ArrayList<>();
                    }
                    Intrinsics.checkNotNull(list);
                    list.add(com_alibaba_ariver_app_api_extopt_99_1);
                }
            }
        }
        return list;
    }

    private final String transformMerchantId(String str) {
        Map<String, String> map;
        if (str == null || (map = this.merchantTopUpEntityMap) == null || map == null) {
            return null;
        }
        return map.get(str);
    }

    private final List<getWebSetting> transformShopOpenHourEntities(List<getInstanceId> list) {
        List<getWebSetting> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<getInstanceId> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (getInstanceId transformShopOpenHour : iterable) {
                arrayList2.add(Boolean.valueOf(arrayList.add(transformShopOpenHour(transformShopOpenHour))));
            }
        }
        return arrayList;
    }

    private final double getDistanceBetweenShopAndMarkerPosition(Render render, Location location) {
        return getDistanceInKM((double) location.distanceTo(getLocation(render.getLatitude(), render.getLongtitude())));
    }

    private final List<FileCache.AnonymousClass1> transformPromoInfoEntities(List<? extends setScrollChangedCallback> list) {
        List<FileCache.AnonymousClass1> arrayList = new ArrayList<>();
        if (list != null) {
            Iterable<setScrollChangedCallback> iterable = list;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (setScrollChangedCallback apply : iterable) {
                Object apply2 = this.promoInfoEntityMapper.apply(apply);
                Intrinsics.checkNotNullExpressionValue(apply2, "promoInfoEntityMapper.apply(entity)");
                arrayList2.add(Boolean.valueOf(arrayList.add(apply2)));
            }
        }
        return arrayList;
    }

    private final getMacEncrypt transformContactAddress(AnonymousClass2 r17) {
        getMacEncrypt getmacencrypt = new getMacEncrypt((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, false, (String) null, 4095, (DefaultConstructorMarker) null);
        if (r17 != null) {
            getmacencrypt.setAddress1(r17.getAddress1());
            getmacencrypt.setAddress2(r17.getAddress2());
            getmacencrypt.setArea(r17.getArea());
            getmacencrypt.setCity(r17.getCity());
            getmacencrypt.setContactAddressId(r17.getContactAddressId());
            getmacencrypt.setContactAddressType(r17.getContactAddressType());
            getmacencrypt.setCountry(r17.getCountry());
            getmacencrypt.setDefaultAddress(r17.isDefaultAddress());
            getmacencrypt.setExtendInfo(r17.getExtendInfo());
            getmacencrypt.setProvince(r17.getProvince());
            getmacencrypt.setVerified(r17.isVerified());
            getmacencrypt.setZipcode(r17.getZipcode());
        }
        return getmacencrypt;
    }

    private final getWebSetting transformShopOpenHour(getInstanceId getinstanceid) {
        if (getinstanceid != null) {
            return new getWebSetting(getinstanceid.getDay(), getinstanceid.getOpenHour(), getinstanceid.getCloseHour());
        }
        return new getWebSetting((String) null, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/nearbyme/mapper/NearbyShopsResultMapper$Companion;", "", "()V", "METER_TO_KM_DIVIDER", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
