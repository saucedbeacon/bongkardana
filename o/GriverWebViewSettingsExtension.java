package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lid/dana/nearbyme/model/DanaDealsOrderRequestModel;", "", "productCode", "", "goodsId", "aggregatorGoodsId", "requestId", "secondaryBizParam", "price", "Lid/dana/domain/nearbyme/model/MoneyView;", "bizType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "getBizType", "getGoodsId", "getPrice", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getProductCode", "getRequestId", "getSecondaryBizParam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverWebViewSettingsExtension {
    @NotNull
    public final getAppDir equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @Nullable
    public final String setMax;
    @NotNull
    public final String setMin;
    @NotNull
    public final String toIntRange;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverWebViewSettingsExtension)) {
            return false;
        }
        GriverWebViewSettingsExtension griverWebViewSettingsExtension = (GriverWebViewSettingsExtension) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) griverWebViewSettingsExtension.length) && Intrinsics.areEqual((Object) this.getMin, (Object) griverWebViewSettingsExtension.getMin) && Intrinsics.areEqual((Object) this.setMin, (Object) griverWebViewSettingsExtension.setMin) && Intrinsics.areEqual((Object) this.getMax, (Object) griverWebViewSettingsExtension.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) griverWebViewSettingsExtension.setMax) && Intrinsics.areEqual((Object) this.equals, (Object) griverWebViewSettingsExtension.equals) && Intrinsics.areEqual((Object) this.toIntRange, (Object) griverWebViewSettingsExtension.toIntRange);
    }

    public final int hashCode() {
        String str = this.length;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMin;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMax;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.setMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        getAppDir getappdir = this.equals;
        int hashCode6 = (hashCode5 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        String str6 = this.toIntRange;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DanaDealsOrderRequestModel(productCode=");
        sb.append(this.length);
        sb.append(", goodsId=");
        sb.append(this.getMin);
        sb.append(", aggregatorGoodsId=");
        sb.append(this.setMin);
        sb.append(", requestId=");
        sb.append(this.getMax);
        sb.append(", secondaryBizParam=");
        sb.append(this.setMax);
        sb.append(", price=");
        sb.append(this.equals);
        sb.append(", bizType=");
        sb.append(this.toIntRange);
        sb.append(")");
        return sb.toString();
    }

    public GriverWebViewSettingsExtension(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull getAppDir getappdir, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str3, "aggregatorGoodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(getappdir, FirebaseAnalytics.Param.PRICE);
        Intrinsics.checkNotNullParameter(str6, "bizType");
        this.length = str;
        this.getMin = str2;
        this.setMin = str3;
        this.getMax = str4;
        this.setMax = str5;
        this.equals = getappdir;
        this.toIntRange = str6;
    }
}
