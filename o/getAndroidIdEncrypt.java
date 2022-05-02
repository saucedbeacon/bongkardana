package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lid/dana/domain/nearbyme/model/DanaDealsOrderRequest;", "", "productCode", "", "goodsId", "aggregatorGoodsId", "requestId", "secondaryBizParam", "price", "Lid/dana/domain/nearbyme/model/MoneyView;", "bizType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "getBizType", "getGoodsId", "getPrice", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getProductCode", "getRequestId", "getSecondaryBizParam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getAndroidIdEncrypt {
    @NotNull
    private final String aggregatorGoodsId;
    @NotNull
    private final String bizType;
    @NotNull
    private final String goodsId;
    @NotNull
    private final getAppDir price;
    @NotNull
    private final String productCode;
    @NotNull
    private final String requestId;
    @Nullable
    private final String secondaryBizParam;

    public static /* synthetic */ getAndroidIdEncrypt copy$default(getAndroidIdEncrypt getandroididencrypt, String str, String str2, String str3, String str4, String str5, getAppDir getappdir, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getandroididencrypt.productCode;
        }
        if ((i & 2) != 0) {
            str2 = getandroididencrypt.goodsId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = getandroididencrypt.aggregatorGoodsId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = getandroididencrypt.requestId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = getandroididencrypt.secondaryBizParam;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            getappdir = getandroididencrypt.price;
        }
        getAppDir getappdir2 = getappdir;
        if ((i & 64) != 0) {
            str6 = getandroididencrypt.bizType;
        }
        return getandroididencrypt.copy(str, str7, str8, str9, str10, getappdir2, str6);
    }

    @NotNull
    public final String component1() {
        return this.productCode;
    }

    @NotNull
    public final String component2() {
        return this.goodsId;
    }

    @NotNull
    public final String component3() {
        return this.aggregatorGoodsId;
    }

    @NotNull
    public final String component4() {
        return this.requestId;
    }

    @Nullable
    public final String component5() {
        return this.secondaryBizParam;
    }

    @NotNull
    public final getAppDir component6() {
        return this.price;
    }

    @NotNull
    public final String component7() {
        return this.bizType;
    }

    @NotNull
    public final getAndroidIdEncrypt copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull getAppDir getappdir, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str3, "aggregatorGoodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(getappdir, FirebaseAnalytics.Param.PRICE);
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "bizType");
        return new getAndroidIdEncrypt(str, str2, str3, str4, str5, getappdir, str7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAndroidIdEncrypt)) {
            return false;
        }
        getAndroidIdEncrypt getandroididencrypt = (getAndroidIdEncrypt) obj;
        return Intrinsics.areEqual((Object) this.productCode, (Object) getandroididencrypt.productCode) && Intrinsics.areEqual((Object) this.goodsId, (Object) getandroididencrypt.goodsId) && Intrinsics.areEqual((Object) this.aggregatorGoodsId, (Object) getandroididencrypt.aggregatorGoodsId) && Intrinsics.areEqual((Object) this.requestId, (Object) getandroididencrypt.requestId) && Intrinsics.areEqual((Object) this.secondaryBizParam, (Object) getandroididencrypt.secondaryBizParam) && Intrinsics.areEqual((Object) this.price, (Object) getandroididencrypt.price) && Intrinsics.areEqual((Object) this.bizType, (Object) getandroididencrypt.bizType);
    }

    public final int hashCode() {
        String str = this.productCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.goodsId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.aggregatorGoodsId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.requestId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.secondaryBizParam;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        getAppDir getappdir = this.price;
        int hashCode6 = (hashCode5 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        String str6 = this.bizType;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DanaDealsOrderRequest(productCode=");
        sb.append(this.productCode);
        sb.append(", goodsId=");
        sb.append(this.goodsId);
        sb.append(", aggregatorGoodsId=");
        sb.append(this.aggregatorGoodsId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", secondaryBizParam=");
        sb.append(this.secondaryBizParam);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(")");
        return sb.toString();
    }

    public getAndroidIdEncrypt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable String str5, @NotNull getAppDir getappdir, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str3, "aggregatorGoodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(getappdir, FirebaseAnalytics.Param.PRICE);
        Intrinsics.checkNotNullParameter(str6, "bizType");
        this.productCode = str;
        this.goodsId = str2;
        this.aggregatorGoodsId = str3;
        this.requestId = str4;
        this.secondaryBizParam = str5;
        this.price = getappdir;
        this.bizType = str6;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAndroidIdEncrypt(String str, String str2, String str3, String str4, String str5, getAppDir getappdir, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, str4, str5, getappdir, str6);
    }

    @NotNull
    public final String getAggregatorGoodsId() {
        return this.aggregatorGoodsId;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    public final String getSecondaryBizParam() {
        return this.secondaryBizParam;
    }

    @NotNull
    public final getAppDir getPrice() {
        return this.price;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }
}
