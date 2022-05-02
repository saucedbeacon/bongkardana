package o;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.OnlineResourceFetcher;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lid/dana/data/globalnetwork/source/amcs/AmcsGnConfigEntityData;", "Lid/dana/data/globalnetwork/source/GnConfigEntityData;", "()V", "getGnCScanBBlacklistedCountry", "Lio/reactivex/Observable;", "", "", "getGnContent", "Lid/dana/data/globalnetwork/model/GnContentResult;", "countryCode", "getGnCountriesWhitelist", "getGnCountryFlag", "getGnCountryFlagSquare", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isConfigSupport implements getStateListDrawable {
    private static final String BUTTON_TITLE = "buttonTitle";
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    private static final String IMAGE_URL = "imageUrl";
    private static final String SUBTITLE = "subtitle";
    private static final String TITLE = "title";

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<attachPage> getGnContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        JSONObject gnSectionJSONObject = OnlineResourceFetcher.FallbackListener.getGnSectionJSONObject("gn_content_".concat(String.valueOf(str)));
        attachPage attachpage = new attachPage((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        if (gnSectionJSONObject != null) {
            try {
                String string = gnSectionJSONObject.getString("title");
                Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(TITLE)");
                attachpage.setTitle(string);
                String string2 = gnSectionJSONObject.getString(SUBTITLE);
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(SUBTITLE)");
                attachpage.setSubtitle(string2);
                String string3 = gnSectionJSONObject.getString(BUTTON_TITLE);
                Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(BUTTON_TITLE)");
                attachpage.setButtonTitle(string3);
                String string4 = gnSectionJSONObject.getString(IMAGE_URL);
                Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(IMAGE_URL)");
                attachpage.setImageUrl(string4);
            } catch (TypeCastException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append(' ');
                sb.append(e.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_NETWORK, sb.toString());
            }
        }
        TitleBarRightButtonView.AnonymousClass1<attachPage> just = TitleBarRightButtonView.AnonymousClass1.just(attachpage);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(gnContentResult)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCountriesWhitelist() {
        JSONArray gnSectionJSONArray = OnlineResourceFetcher.FallbackListener.getGnSectionJSONArray("gn_countries");
        List arrayList = new ArrayList();
        if (gnSectionJSONArray != null) {
            for (Object next : gnSectionJSONArray) {
                if (!Intrinsics.areEqual((Object) next.toString(), (Object) "ID")) {
                    arrayList.add(next.toString());
                }
            }
        }
        TitleBarRightButtonView.AnonymousClass1<List<String>> just = TitleBarRightButtonView.AnonymousClass1.just(arrayList);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(gnCountries)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlag(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        JSONObject gnSectionJSONObject = OnlineResourceFetcher.FallbackListener.getGnSectionJSONObject("gn_country_flag");
        if (gnSectionJSONObject != null) {
            str2 = gnSectionJSONObject.getString(str);
            Intrinsics.checkNotNullExpressionValue(str2, "it.getString(countryCode)");
        } else {
            str2 = "";
        }
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(str2);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(flagUrl)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getGnCountryFlagSquare(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        JSONObject gnSectionJSONObject = OnlineResourceFetcher.FallbackListener.getGnSectionJSONObject("gn_country_flag_square");
        if (gnSectionJSONObject != null) {
            str2 = gnSectionJSONObject.getString(str);
            Intrinsics.checkNotNullExpressionValue(str2, "it.getString(countryCode)");
        } else {
            str2 = "";
        }
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(str2);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(flagUrl)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getGnCScanBBlacklistedCountry() {
        throw new UnsupportedOperationException();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/globalnetwork/source/amcs/AmcsGnConfigEntityData$Companion;", "", "()V", "BUTTON_TITLE", "", "IMAGE_URL", "SUBTITLE", "TITLE", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
