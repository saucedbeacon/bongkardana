package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.nearbyme.model.ShopModel;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import o.convertDipToPx;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J!\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0002\b\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nH\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016J\b\u0010 \u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, d2 = {"Lid/dana/nearbyme/tracker/NearbyDefaultTracker;", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alphaNumericRegex", "Lkotlin/text/Regex;", "getContext", "()Landroid/content/Context;", "alphaNumericPattern", "", "execute", "", "builderFunction", "Lkotlin/Function1;", "Lid/dana/tracker/EventTrackerModel$Builder;", "Lkotlin/ExtensionFunctionType;", "trackNearbyFilterSearch", "category", "trackNearbyHomeShoppingOpen", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "source", "trackNearbyHomeShoppingOrder", "merchantName", "shopName", "trackNearbyOpen", "trackNearbyOpenAllShop", "trackNearbyOpenSearchKeyword", "keyword", "searchType", "trackNearbySearchOpen", "trackOpenMapResult", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class s implements t {
    @NotNull
    private final Context length;
    private final Regex setMin = new Regex("[a-zA-Z0-9]+");

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<convertDipToPx.length, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_SEARCH_PAGE_OPEN;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $merchantName;
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(String str, String str2) {
            super(1);
            this.$source = str;
            this.$merchantName = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_SHOP_LIST_OPEN;
            length.setMax("Source", this.$source);
            length.setMax("Merchant Name", this.$merchantName);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $category;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str) {
            super(1);
            this.$category = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_ME_SEARCH_FILTER;
            length.setMax(TrackerKey.Property.SEARCH_FILTER, this.$category);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ ShopModel $shopModel;
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(ShopModel shopModel, String str) {
            super(1);
            this.$shopModel = shopModel;
            this.$source = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_HOME_SHOPPING_OPEN;
            length.setMax("Merchant Name", this.$shopModel.asInterface);
            length.setMax("Shop Name", this.$shopModel.invoke);
            length.setMax("Source", this.$source);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $merchantName;
        final /* synthetic */ String $shopName;
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(String str, String str2, String str3) {
            super(1);
            this.$merchantName = str;
            this.$shopName = str2;
            this.$source = str3;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_HOME_SHOPPING_ORDER;
            length.setMax("Merchant Name", this.$merchantName);
            length.setMax("Shop Name", this.$shopName);
            length.setMax("Source", this.$source);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(String str) {
            super(1);
            this.$source = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_ME_OPEN;
            length.setMax("Source", this.$source);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_SEARCH_MAP_RESULT;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ String $searchType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(String str, String str2) {
            super(1);
            this.$keyword = str;
            this.$searchType = str2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.NEARBY_ME_SEARCH_KEYWORD;
            length.setMax(TrackerKey.Property.SEARCH_KEYWORD, startBluetoothDevicesDiscovery.INSTANCE.capitalizeWords(this.$keyword));
            length.setMax(TrackerKey.Property.SEARCH_TYPE, this.$searchType);
        }
    }

    @Inject
    public s(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.length = context;
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new setMin(str).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void length(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(str2, "searchType");
        CharSequence charSequence = str;
        if ((charSequence.length() > 0) && str.length() > 3 && this.setMin.containsMatchIn(charSequence)) {
            convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
            Intrinsics.checkNotNullExpressionValue(min, "builder");
            new toIntRange(str, str2).invoke(min);
            min.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "category");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new getMin(str).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void setMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new getMax(str, str2).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void setMin(@NotNull ShopModel shopModel, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(str, "source");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new length(shopModel, str).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMax(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.MERCHANT_NAME);
        Intrinsics.checkNotNullParameter(str2, "shopName");
        Intrinsics.checkNotNullParameter(str3, "source");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new setMax(str, str2, str3).invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMax() {
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        IsOverlapping.INSTANCE.invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }

    public final void getMin() {
        convertDipToPx.length min = convertDipToPx.length.setMin(this.length);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        toFloatRange.INSTANCE.invoke(min);
        min.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
        List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
    }
}
