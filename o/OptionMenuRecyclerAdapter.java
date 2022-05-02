package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.data.constant.BranchLinkConstant;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.nearbyme.model.ContactAddressModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010&J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013HÆ\u0003J\t\u00102\u001a\u00020\u0015HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\fHÆ\u0003J¸\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\n2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010?\u001a\u00020\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b(\u0010&R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018¨\u0006C"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "", "merchantId", "", "shopId", "mainName", "shopDesc", "shopType", "logoUrl", "isFullDay", "", "latitude", "", "longitude", "openHour", "closeHour", "rating", "reviewNumbers", "officeNumber", "", "contactAddress", "Lid/dana/nearbyme/model/ContactAddressModel;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lid/dana/nearbyme/model/ContactAddressModel;)V", "getCloseHour", "()Ljava/lang/String;", "getContactAddress", "()Lid/dana/nearbyme/model/ContactAddressModel;", "()Z", "getLatitude", "()D", "getLogoUrl", "getLongitude", "getMainName", "getMerchantId", "getOfficeNumber", "()Ljava/util/List;", "getOpenHour", "getRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getReviewNumbers", "getShopDesc", "getShopId", "getShopType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDDLjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Lid/dana/nearbyme/model/ContactAddressModel;)Lid/dana/nearbyme/merchantdetail/model/MerchantInfoModel;", "equals", "other", "getPhoneNumber", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OptionMenuRecyclerAdapter {
    @NotNull
    private final String FastBitmap$CoordinateSystem;
    @Nullable
    public final Double IsOverlapping;
    @Nullable
    public final Double equals;
    @Nullable
    public final String getMax;
    public final double getMin;
    @NotNull
    private final List<String> hashCode;
    @NotNull
    private final String isInside;
    @Nullable
    public final String length;
    public final double setMax;
    @Nullable
    public final String setMin;
    private final boolean toDoubleRange;
    @NotNull
    private final String toFloatRange;
    @NotNull
    public final ContactAddressModel toIntRange;
    @Nullable
    private final String toString;
    @Nullable
    private final String values;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptionMenuRecyclerAdapter)) {
            return false;
        }
        OptionMenuRecyclerAdapter optionMenuRecyclerAdapter = (OptionMenuRecyclerAdapter) obj;
        return Intrinsics.areEqual((Object) this.isInside, (Object) optionMenuRecyclerAdapter.isInside) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) optionMenuRecyclerAdapter.toFloatRange) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) optionMenuRecyclerAdapter.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.toString, (Object) optionMenuRecyclerAdapter.toString) && Intrinsics.areEqual((Object) this.values, (Object) optionMenuRecyclerAdapter.values) && Intrinsics.areEqual((Object) this.getMax, (Object) optionMenuRecyclerAdapter.getMax) && this.toDoubleRange == optionMenuRecyclerAdapter.toDoubleRange && Double.compare(this.getMin, optionMenuRecyclerAdapter.getMin) == 0 && Double.compare(this.setMax, optionMenuRecyclerAdapter.setMax) == 0 && Intrinsics.areEqual((Object) this.setMin, (Object) optionMenuRecyclerAdapter.setMin) && Intrinsics.areEqual((Object) this.length, (Object) optionMenuRecyclerAdapter.length) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) optionMenuRecyclerAdapter.IsOverlapping) && Intrinsics.areEqual((Object) this.equals, (Object) optionMenuRecyclerAdapter.equals) && Intrinsics.areEqual((Object) this.hashCode, (Object) optionMenuRecyclerAdapter.hashCode) && Intrinsics.areEqual((Object) this.toIntRange, (Object) optionMenuRecyclerAdapter.toIntRange);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantInfoModel(merchantId=");
        sb.append(this.isInside);
        sb.append(", shopId=");
        sb.append(this.toFloatRange);
        sb.append(", mainName=");
        sb.append(this.FastBitmap$CoordinateSystem);
        sb.append(", shopDesc=");
        sb.append(this.toString);
        sb.append(", shopType=");
        sb.append(this.values);
        sb.append(", logoUrl=");
        sb.append(this.getMax);
        sb.append(", isFullDay=");
        sb.append(this.toDoubleRange);
        sb.append(", latitude=");
        sb.append(this.getMin);
        sb.append(", longitude=");
        sb.append(this.setMax);
        sb.append(", openHour=");
        sb.append(this.setMin);
        sb.append(", closeHour=");
        sb.append(this.length);
        sb.append(", rating=");
        sb.append(this.IsOverlapping);
        sb.append(", reviewNumbers=");
        sb.append(this.equals);
        sb.append(", officeNumber=");
        sb.append(this.hashCode);
        sb.append(", contactAddress=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "", "goodsId", "", "provider", "type", "description", "goodsTitle", "price", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "denom", "available", "", "productCode", "extendInfo", "", "voucherInfo", "Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "savingRate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;ZLjava/lang/String;Ljava/util/Map;Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;D)V", "getAvailable", "()Z", "getDenom", "()Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "getDescription", "()Ljava/lang/String;", "getExtendInfo", "()Ljava/util/Map;", "getGoodsId", "getGoodsTitle", "getPrice", "getProductCode", "getProvider", "getSavingRate", "()D", "getType", "getVoucherInfo", "()Lid/dana/nearbyme/merchantdetail/model/MerchantVoucherInfoModel;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OptionMenuViewHolder {
        @NotNull
        private final Map<String, String> FastBitmap$CoordinateSystem;
        @NotNull
        private final MoneyViewModel IsOverlapping;
        public final double equals;
        @NotNull
        public final String getMax;
        @NotNull
        public final MoneyViewModel getMin;
        @NotNull
        public final SettingMenu isInside;
        @NotNull
        public final String length;
        @NotNull
        public final String setMax;
        @NotNull
        public final String setMin;
        @NotNull
        private final String toFloatRange;
        @NotNull
        private final String toIntRange;
        private final boolean values;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptionMenuViewHolder)) {
                return false;
            }
            OptionMenuViewHolder optionMenuViewHolder = (OptionMenuViewHolder) obj;
            return Intrinsics.areEqual((Object) this.setMin, (Object) optionMenuViewHolder.setMin) && Intrinsics.areEqual((Object) this.length, (Object) optionMenuViewHolder.length) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) optionMenuViewHolder.toFloatRange) && Intrinsics.areEqual((Object) this.toIntRange, (Object) optionMenuViewHolder.toIntRange) && Intrinsics.areEqual((Object) this.setMax, (Object) optionMenuViewHolder.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) optionMenuViewHolder.getMin) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) optionMenuViewHolder.IsOverlapping) && this.values == optionMenuViewHolder.values && Intrinsics.areEqual((Object) this.getMax, (Object) optionMenuViewHolder.getMax) && Intrinsics.areEqual((Object) this.FastBitmap$CoordinateSystem, (Object) optionMenuViewHolder.FastBitmap$CoordinateSystem) && Intrinsics.areEqual((Object) this.isInside, (Object) optionMenuViewHolder.isInside) && Double.compare(this.equals, optionMenuViewHolder.equals) == 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("MerchantProductInfoModel(goodsId=");
            sb.append(this.setMin);
            sb.append(", provider=");
            sb.append(this.length);
            sb.append(", type=");
            sb.append(this.toFloatRange);
            sb.append(", description=");
            sb.append(this.toIntRange);
            sb.append(", goodsTitle=");
            sb.append(this.setMax);
            sb.append(", price=");
            sb.append(this.getMin);
            sb.append(", denom=");
            sb.append(this.IsOverlapping);
            sb.append(", available=");
            sb.append(this.values);
            sb.append(", productCode=");
            sb.append(this.getMax);
            sb.append(", extendInfo=");
            sb.append(this.FastBitmap$CoordinateSystem);
            sb.append(", voucherInfo=");
            sb.append(this.isInside);
            sb.append(", savingRate=");
            sb.append(this.equals);
            sb.append(")");
            return sb.toString();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantReviewResultModel;", "", "hasMore", "", "merchantReviewList", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "(ZLjava/util/List;)V", "getHasMore", "()Z", "getMerchantReviewList", "()Ljava/util/List;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.OptionMenuRecyclerAdapter$OptionMenuViewHolder$2  reason: invalid class name */
        public final class AnonymousClass2 {
            @NotNull
            public final List<AnonymousClass1> getMax;
            private final boolean getMin;

            public AnonymousClass2() {
                this((byte) 0);
            }

            public AnonymousClass2(boolean z, @NotNull List<AnonymousClass1> list) {
                Intrinsics.checkNotNullParameter(list, "merchantReviewList");
                this.getMin = z;
                this.getMax = list;
            }

            private /* synthetic */ AnonymousClass2(byte b) {
                this(false, CollectionsKt.emptyList());
            }

            public final boolean setMax() {
                return this.getMin;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "", "type", "", "reviewModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "(ILid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;)V", "getReviewModel", "()Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "setReviewModel", "(Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;)V", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.OptionMenuRecyclerAdapter$OptionMenuViewHolder$3  reason: invalid class name */
        public final class AnonymousClass3 {
            @Nullable
            public AnonymousClass1 getMax;
            public final int setMax;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass3)) {
                    return false;
                }
                AnonymousClass3 r3 = (AnonymousClass3) obj;
                return this.setMax == r3.setMax && Intrinsics.areEqual((Object) this.getMax, (Object) r3.getMax);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("MerchantReviewViewModel(type=");
                sb.append(this.setMax);
                sb.append(", reviewModel=");
                sb.append(this.getMax);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ AnonymousClass3(int i) {
                this(i, (AnonymousClass1) null);
            }

            public AnonymousClass3(int i, @Nullable AnonymousClass1 r2) {
                this.setMax = i;
                this.getMax = r2;
            }

            public final int hashCode() {
                int hashCode = Integer.valueOf(this.setMax).hashCode() * 31;
                AnonymousClass1 r1 = this.getMax;
                return hashCode + (r1 != null ? r1.hashCode() : 0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 02\u00020\u0001:\u00010Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003Js\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013¨\u00061"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "", "userId", "", "userName", "avatar", "review", "rating", "", "modifyDate", "", "createdDate", "images", "", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "merchantName", "merchantId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJJLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getCreatedDate", "()J", "getImages", "()Ljava/util/List;", "getMerchantId", "getMerchantName", "getModifyDate", "getRating", "()I", "getReview", "getUserId", "getUserName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.OptionMenuRecyclerAdapter$OptionMenuViewHolder$1  reason: invalid class name */
        public final class AnonymousClass1 {
            @NotNull
            public static final length equals = new length((byte) 0);
            @NotNull
            public final String IsOverlapping;
            @NotNull
            public final String getMax;
            @NotNull
            public final String getMin;
            private final long hashCode;
            public final long isInside;
            @NotNull
            public final String length;
            @NotNull
            public final String setMax;
            public final int setMin;
            @NotNull
            public final String toFloatRange;
            @NotNull
            public final List<MerchantImageModel> toIntRange;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass1)) {
                    return false;
                }
                AnonymousClass1 r6 = (AnonymousClass1) obj;
                return Intrinsics.areEqual((Object) this.getMax, (Object) r6.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) r6.setMax) && Intrinsics.areEqual((Object) this.length, (Object) r6.length) && Intrinsics.areEqual((Object) this.getMin, (Object) r6.getMin) && this.setMin == r6.setMin && this.isInside == r6.isInside && this.hashCode == r6.hashCode && Intrinsics.areEqual((Object) this.toIntRange, (Object) r6.toIntRange) && Intrinsics.areEqual((Object) this.toFloatRange, (Object) r6.toFloatRange) && Intrinsics.areEqual((Object) this.IsOverlapping, (Object) r6.IsOverlapping);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("MerchantReviewModel(userId=");
                sb.append(this.getMax);
                sb.append(", userName=");
                sb.append(this.setMax);
                sb.append(", avatar=");
                sb.append(this.length);
                sb.append(", review=");
                sb.append(this.getMin);
                sb.append(", rating=");
                sb.append(this.setMin);
                sb.append(", modifyDate=");
                sb.append(this.isInside);
                sb.append(", createdDate=");
                sb.append(this.hashCode);
                sb.append(", images=");
                sb.append(this.toIntRange);
                sb.append(", merchantName=");
                sb.append(this.toFloatRange);
                sb.append(", merchantId=");
                sb.append(this.IsOverlapping);
                sb.append(")");
                return sb.toString();
            }

            private AnonymousClass1(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i, long j, long j2, @NotNull List<MerchantImageModel> list, @NotNull String str5, @NotNull String str6) {
                Intrinsics.checkNotNullParameter(str, "userId");
                Intrinsics.checkNotNullParameter(str2, "userName");
                Intrinsics.checkNotNullParameter(str3, "avatar");
                Intrinsics.checkNotNullParameter(str4, "review");
                Intrinsics.checkNotNullParameter(list, "images");
                Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.MERCHANT_NAME);
                Intrinsics.checkNotNullParameter(str6, "merchantId");
                this.getMax = str;
                this.setMax = str2;
                this.length = str3;
                this.getMin = str4;
                this.setMin = i;
                this.isInside = j;
                this.hashCode = j2;
                this.toIntRange = list;
                this.toFloatRange = str5;
                this.IsOverlapping = str6;
            }

            public /* synthetic */ AnonymousClass1(String str, String str2, String str3, String str4, int i, long j, long j2, List list) {
                this(str, str2, str3, str4, i, j, j2, list, "", "");
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0004¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel$Companion;", "", "()V", "createDetailReview", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "data", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "createLoadMore", "createLoading", "createReview", "createShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.OptionMenuRecyclerAdapter$OptionMenuViewHolder$1$length */
            public static final class length {
                private length() {
                }

                public /* synthetic */ length(byte b) {
                    this();
                }
            }

            public final int hashCode() {
                String str = this.getMax;
                int i = 0;
                int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.setMax;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.length;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
                String str4 = this.getMin;
                int hashCode5 = (((((((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.valueOf(this.setMin).hashCode()) * 31) + Long.valueOf(this.isInside).hashCode()) * 31) + Long.valueOf(this.hashCode).hashCode()) * 31;
                List<MerchantImageModel> list = this.toIntRange;
                int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
                String str5 = this.toFloatRange;
                int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
                String str6 = this.IsOverlapping;
                if (str6 != null) {
                    i = str6.hashCode();
                }
                return hashCode7 + i;
            }
        }

        public OptionMenuViewHolder(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2, boolean z, @NotNull String str6, @NotNull Map<String, String> map, @NotNull SettingMenu settingMenu, double d) {
            Intrinsics.checkNotNullParameter(str, "goodsId");
            Intrinsics.checkNotNullParameter(str2, "provider");
            Intrinsics.checkNotNullParameter(str3, "type");
            Intrinsics.checkNotNullParameter(str4, "description");
            Intrinsics.checkNotNullParameter(str5, "goodsTitle");
            Intrinsics.checkNotNullParameter(moneyViewModel, FirebaseAnalytics.Param.PRICE);
            Intrinsics.checkNotNullParameter(moneyViewModel2, "denom");
            Intrinsics.checkNotNullParameter(str6, "productCode");
            Intrinsics.checkNotNullParameter(map, "extendInfo");
            Intrinsics.checkNotNullParameter(settingMenu, "voucherInfo");
            this.setMin = str;
            this.length = str2;
            this.toFloatRange = str3;
            this.toIntRange = str4;
            this.setMax = str5;
            this.getMin = moneyViewModel;
            this.IsOverlapping = moneyViewModel2;
            this.values = z;
            this.getMax = str6;
            this.FastBitmap$CoordinateSystem = map;
            this.isInside = settingMenu;
            this.equals = d;
        }

        public final int hashCode() {
            String str = this.setMin;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.length;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.toFloatRange;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.toIntRange;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.setMax;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            MoneyViewModel moneyViewModel = this.getMin;
            int hashCode6 = (hashCode5 + (moneyViewModel != null ? moneyViewModel.hashCode() : 0)) * 31;
            MoneyViewModel moneyViewModel2 = this.IsOverlapping;
            int hashCode7 = (hashCode6 + (moneyViewModel2 != null ? moneyViewModel2.hashCode() : 0)) * 31;
            boolean z = this.values;
            if (z) {
                z = true;
            }
            int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
            String str6 = this.getMax;
            int hashCode8 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
            Map<String, String> map = this.FastBitmap$CoordinateSystem;
            int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
            SettingMenu settingMenu = this.isInside;
            if (settingMenu != null) {
                i = settingMenu.hashCode();
            }
            return ((hashCode9 + i) * 31) + Double.valueOf(this.equals).hashCode();
        }
    }

    public OptionMenuRecyclerAdapter(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, boolean z, double d, double d2, @Nullable String str7, @Nullable String str8, @Nullable Double d3, @Nullable Double d4, @NotNull List<String> list, @NotNull ContactAddressModel contactAddressModel) {
        List<String> list2 = list;
        ContactAddressModel contactAddressModel2 = contactAddressModel;
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(str2, FeatureParams.SHOP_ID);
        Intrinsics.checkNotNullParameter(str3, "mainName");
        Intrinsics.checkNotNullParameter(list2, "officeNumber");
        Intrinsics.checkNotNullParameter(contactAddressModel2, "contactAddress");
        this.isInside = str;
        this.toFloatRange = str2;
        this.FastBitmap$CoordinateSystem = str3;
        this.toString = str4;
        this.values = str5;
        this.getMax = str6;
        this.toDoubleRange = z;
        this.getMin = d;
        this.setMax = d2;
        this.setMin = str7;
        this.length = str8;
        this.IsOverlapping = d3;
        this.equals = d4;
        this.hashCode = list2;
        this.toIntRange = contactAddressModel2;
    }

    public final boolean getMax() {
        return this.toDoubleRange;
    }

    @NotNull
    public final String getMin() {
        Object obj;
        Iterator it = this.hashCode.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!StringsKt.isBlank((String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        String str = this.isInside;
        int i = 0;
        int hashCode2 = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.toFloatRange;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.FastBitmap$CoordinateSystem;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.toString;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.values;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.getMax;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.toDoubleRange;
        if (z) {
            z = true;
        }
        int hashCode8 = (((((hashCode7 + (z ? 1 : 0)) * 31) + Double.valueOf(this.getMin).hashCode()) * 31) + Double.valueOf(this.setMax).hashCode()) * 31;
        String str7 = this.setMin;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.length;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Double d = this.IsOverlapping;
        int hashCode11 = (hashCode10 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.equals;
        int hashCode12 = (hashCode11 + (d2 != null ? d2.hashCode() : 0)) * 31;
        List<String> list = this.hashCode;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        ContactAddressModel contactAddressModel = this.toIntRange;
        if (contactAddressModel != null) {
            i = contactAddressModel.hashCode();
        }
        return hashCode13 + i;
    }
}
