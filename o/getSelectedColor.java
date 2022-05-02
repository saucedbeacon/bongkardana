package o;

import android.location.Location;
import id.dana.data.here.AddressNotFoundException;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.TitleBarRightButtonView;
import o.onUpdateResult;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\f2\u0006\u0010\u0013\u001a\u00020\rH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/data/here/source/network/NetworkHereGeocodeEntityData;", "Lid/dana/data/geocode/repository/source/GeocodeEntityData;", "geocodeApi", "Lid/dana/data/here/source/network/HereGeocodeApi;", "oauthManager", "Lid/dana/data/here/HereOauthManager;", "(Lid/dana/data/here/source/network/HereGeocodeApi;Lid/dana/data/here/HereOauthManager;)V", "generateSubdivision", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "address", "Lid/dana/data/here/model/Address;", "getDistrictNameByLocation", "Lio/reactivex/Observable;", "", "location", "Landroid/location/Location;", "getLatestLocationSubdisivision", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "getLocationFromLocationName", "locationName", "getReverseGeocodeByLoc", "Lid/dana/domain/miniprogram/model/Address;", "getSubdivisionsFromGeocoder", "saveLatestLocationSubdisivision", "", "locationSubdisivision", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSelectedColor implements onInitSuccess {
    /* access modifiers changed from: private */
    public final setBadgeSize geocodeApi;
    private final getTabbarModel oauthManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "kotlin.jvm.PlatformType", "response", "Lid/dana/data/here/model/HereGeocodeResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<getBadgeSize, TitleBarRightButtonView.AnonymousClass4<? extends onUpdateResult>> {
        final /* synthetic */ getSelectedColor setMin;

        getMax(getSelectedColor getselectedcolor) {
            this.setMin = getselectedcolor;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            getBadgeSize getbadgesize = (getBadgeSize) obj;
            Intrinsics.checkNotNullParameter(getbadgesize, "response");
            List<TabBarColorModel> hereItems = getbadgesize.getHereItems();
            removeTabBarBadge removetabbarbadge = null;
            TabBarColorModel tabBarColorModel = hereItems != null ? (TabBarColorModel) CollectionsKt.firstOrNull(hereItems) : null;
            if (tabBarColorModel != null) {
                removetabbarbadge = tabBarColorModel.getAddress();
            }
            if (removetabbarbadge != null) {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(this.setMin.generateSubdivision(tabBarColorModel.getAddress()));
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(subDivision)");
            } else {
                r2 = TitleBarRightButtonView.AnonymousClass1.error((Throwable) new AddressNotFoundException());
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.error(exception)");
            }
            return r2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "response", "Lid/dana/data/here/model/HereGeocodeResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<getBadgeSize, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        public static final getMin setMin = new getMin();

        getMin() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
            r2 = (r2 = (o.TabBarColorModel) kotlin.collections.CollectionsKt.firstOrNull(r2)).getAddress();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r2) {
            /*
                r1 = this;
                o.getBadgeSize r2 = (o.getBadgeSize) r2
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.List r2 = r2.getHereItems()
                if (r2 == 0) goto L_0x0020
                java.lang.Object r2 = kotlin.collections.CollectionsKt.firstOrNull(r2)
                o.TabBarColorModel r2 = (o.TabBarColorModel) r2
                if (r2 == 0) goto L_0x0020
                o.removeTabBarBadge r2 = r2.getAddress()
                if (r2 == 0) goto L_0x0020
                java.lang.String r2 = r2.getDistrict()
                goto L_0x0021
            L_0x0020:
                r2 = 0
            L_0x0021:
                if (r2 != 0) goto L_0x0025
                java.lang.String r2 = ""
            L_0x0025:
                r0 = r2
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                if (r0 == 0) goto L_0x0044
                id.dana.data.here.AddressNotFoundException r2 = new id.dana.data.here.AddressNotFoundException
                r2.<init>()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                o.TitleBarRightButtonView$1 r2 = o.TitleBarRightButtonView.AnonymousClass1.error((java.lang.Throwable) r2)
                java.lang.String r0 = "Observable.error(exception)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
                goto L_0x004d
            L_0x0044:
                o.TitleBarRightButtonView$1 r2 = o.TitleBarRightButtonView.AnonymousClass1.just(r2)
                java.lang.String r0 = "Observable.just(districtName)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            L_0x004d:
                o.TitleBarRightButtonView$4 r2 = (o.TitleBarRightButtonView.AnonymousClass4) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getSelectedColor.getMin.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public getSelectedColor(@NotNull setBadgeSize setbadgesize, @NotNull getTabbarModel gettabbarmodel) {
        Intrinsics.checkNotNullParameter(setbadgesize, "geocodeApi");
        Intrinsics.checkNotNullParameter(gettabbarmodel, "oauthManager");
        this.geocodeApi = setbadgesize;
        this.oauthManager = gettabbarmodel;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getDistrictNameByLocation(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        StringBuilder sb = new StringBuilder();
        sb.append(location.getLatitude());
        sb.append(',');
        sb.append(location.getLongitude());
        TitleBarRightButtonView.AnonymousClass1<String> flatMap = this.oauthManager.executeHereApi(new setMin(this, sb.toString())).flatMap(getMin.setMin);
        Intrinsics.checkNotNullExpressionValue(flatMap, "oauthManager.executeHere…ervableToReturn\n        }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/HereGeocodeResponse;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<String, TitleBarRightButtonView.AnonymousClass1<getBadgeSize>> {
        final /* synthetic */ String $locationStr;
        final /* synthetic */ getSelectedColor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(getSelectedColor getselectedcolor, String str) {
            super(1);
            this.this$0 = getselectedcolor;
            this.$locationStr = str;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<getBadgeSize> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return this.this$0.geocodeApi.geocodeReverse(this.$locationStr, "en-US", str);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getSubdivisionsFromGeocoder(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        StringBuilder sb = new StringBuilder();
        sb.append(location.getLatitude());
        sb.append(',');
        sb.append(location.getLongitude());
        TitleBarRightButtonView.AnonymousClass1<onUpdateResult> flatMap = this.oauthManager.executeHereApi(new length(this, sb.toString())).flatMap(new getMax(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "oauthManager.executeHere…ervableToReturn\n        }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Lid/dana/data/here/model/HereGeocodeResponse;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<String, TitleBarRightButtonView.AnonymousClass1<getBadgeSize>> {
        final /* synthetic */ String $locationStr;
        final /* synthetic */ getSelectedColor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(getSelectedColor getselectedcolor, String str) {
            super(1);
            this.this$0 = getselectedcolor;
            this.$locationStr = str;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<getBadgeSize> invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            return this.this$0.geocodeApi.geocodeReverse(this.$locationStr, "en-US", str);
        }
    }

    /* access modifiers changed from: private */
    public final onUpdateResult generateSubdivision(removeTabBarBadge removetabbarbadge) {
        onUpdateResult.length length2 = new onUpdateResult.length();
        String countryCode = removetabbarbadge.getCountryCode();
        String str = "";
        if (countryCode == null) {
            countryCode = str;
        }
        length2.withCountryCode(countryCode);
        String countryName = removetabbarbadge.getCountryName();
        if (countryName == null) {
            countryName = str;
        }
        length2.withCountryName(countryName);
        String county = removetabbarbadge.getCounty();
        if (county == null) {
            county = str;
        }
        length2.withProvinceName(county);
        String city = removetabbarbadge.getCity();
        if (city == null) {
            city = str;
        }
        length2.withCityName(city);
        String district = removetabbarbadge.getDistrict();
        if (district == null) {
            district = str;
        }
        length2.withDistrictName(district);
        String subdistrict = removetabbarbadge.getSubdistrict();
        if (subdistrict != null) {
            str = subdistrict;
        }
        length2.withSubdistrictName(str);
        return length2.create();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Location> getLocationFromLocationName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "locationName");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<processFacade> getReverseGeocodeByLoc(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverPerformanceStages> getLatestLocationSubdisivision() {
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveLatestLocationSubdisivision(@NotNull GriverPerformanceStages griverPerformanceStages) {
        Intrinsics.checkNotNullParameter(griverPerformanceStages, "locationSubdisivision");
        throw new NotImplementedError((String) null, 1, (DefaultConstructorMarker) null);
    }
}
