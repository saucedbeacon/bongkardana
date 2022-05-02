package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J_\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, d2 = {"Lid/dana/domain/exploredana/model/CreateOrderRequest;", "", "productCode", "", "goodsId", "aggregatorGoodsId", "requestId", "param", "secondaryBizParam", "amount", "Lid/dana/domain/nearbyme/model/MoneyView;", "bizType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/nearbyme/model/MoneyView;Ljava/lang/String;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "getAmount", "()Lid/dana/domain/nearbyme/model/MoneyView;", "getBizType", "getGoodsId", "getParam", "getProductCode", "getRequestId", "getSecondaryBizParam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getSerifFontFamily {
    @Nullable
    private final String aggregatorGoodsId;
    @Nullable
    private final getAppDir amount;
    @NotNull
    private final String bizType;
    @NotNull
    private final String goodsId;
    @NotNull
    private final String param;
    @NotNull
    private final String productCode;
    @NotNull
    private final String requestId;
    @Nullable
    private final String secondaryBizParam;

    public static /* synthetic */ getSerifFontFamily copy$default(getSerifFontFamily getseriffontfamily, String str, String str2, String str3, String str4, String str5, String str6, getAppDir getappdir, String str7, int i, Object obj) {
        getSerifFontFamily getseriffontfamily2 = getseriffontfamily;
        int i2 = i;
        return getseriffontfamily.copy((i2 & 1) != 0 ? getseriffontfamily2.productCode : str, (i2 & 2) != 0 ? getseriffontfamily2.goodsId : str2, (i2 & 4) != 0 ? getseriffontfamily2.aggregatorGoodsId : str3, (i2 & 8) != 0 ? getseriffontfamily2.requestId : str4, (i2 & 16) != 0 ? getseriffontfamily2.param : str5, (i2 & 32) != 0 ? getseriffontfamily2.secondaryBizParam : str6, (i2 & 64) != 0 ? getseriffontfamily2.amount : getappdir, (i2 & 128) != 0 ? getseriffontfamily2.bizType : str7);
    }

    @NotNull
    public final String component1() {
        return this.productCode;
    }

    @NotNull
    public final String component2() {
        return this.goodsId;
    }

    @Nullable
    public final String component3() {
        return this.aggregatorGoodsId;
    }

    @NotNull
    public final String component4() {
        return this.requestId;
    }

    @NotNull
    public final String component5() {
        return this.param;
    }

    @Nullable
    public final String component6() {
        return this.secondaryBizParam;
    }

    @Nullable
    public final getAppDir component7() {
        return this.amount;
    }

    @NotNull
    public final String component8() {
        return this.bizType;
    }

    @NotNull
    public final getSerifFontFamily copy(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable getAppDir getappdir, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(str5, "param");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "bizType");
        return new getSerifFontFamily(str, str2, str3, str4, str5, str6, getappdir, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSerifFontFamily)) {
            return false;
        }
        getSerifFontFamily getseriffontfamily = (getSerifFontFamily) obj;
        return Intrinsics.areEqual((Object) this.productCode, (Object) getseriffontfamily.productCode) && Intrinsics.areEqual((Object) this.goodsId, (Object) getseriffontfamily.goodsId) && Intrinsics.areEqual((Object) this.aggregatorGoodsId, (Object) getseriffontfamily.aggregatorGoodsId) && Intrinsics.areEqual((Object) this.requestId, (Object) getseriffontfamily.requestId) && Intrinsics.areEqual((Object) this.param, (Object) getseriffontfamily.param) && Intrinsics.areEqual((Object) this.secondaryBizParam, (Object) getseriffontfamily.secondaryBizParam) && Intrinsics.areEqual((Object) this.amount, (Object) getseriffontfamily.amount) && Intrinsics.areEqual((Object) this.bizType, (Object) getseriffontfamily.bizType);
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
        String str5 = this.param;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.secondaryBizParam;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        getAppDir getappdir = this.amount;
        int hashCode7 = (hashCode6 + (getappdir != null ? getappdir.hashCode() : 0)) * 31;
        String str7 = this.bizType;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateOrderRequest(productCode=");
        sb.append(this.productCode);
        sb.append(", goodsId=");
        sb.append(this.goodsId);
        sb.append(", aggregatorGoodsId=");
        sb.append(this.aggregatorGoodsId);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", param=");
        sb.append(this.param);
        sb.append(", secondaryBizParam=");
        sb.append(this.secondaryBizParam);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(")");
        return sb.toString();
    }

    public getSerifFontFamily(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @Nullable getAppDir getappdir, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(str5, "param");
        Intrinsics.checkNotNullParameter(str7, "bizType");
        this.productCode = str;
        this.goodsId = str2;
        this.aggregatorGoodsId = str3;
        this.requestId = str4;
        this.param = str5;
        this.secondaryBizParam = str6;
        this.amount = getappdir;
        this.bizType = str7;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @Nullable
    public final String getAggregatorGoodsId() {
        return this.aggregatorGoodsId;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getParam() {
        return this.param;
    }

    @Nullable
    public final String getSecondaryBizParam() {
        return this.secondaryBizParam;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getSerifFontFamily(String str, String str2, String str3, String str4, String str5, String str6, getAppDir getappdir, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : getappdir, str7);
    }

    @Nullable
    public final getAppDir getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }
}
