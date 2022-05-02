package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00061"}, d2 = {"Lid/dana/data/nearbyme/repository/source/network/request/ProductOrderRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "productCode", "", "goodsId", "aggregatorGoodsId", "requestId", "param", "secondaryBizParam", "amount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "bizType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/nearbyme/model/MoneyViewEntity;Ljava/lang/String;)V", "getAggregatorGoodsId", "()Ljava/lang/String;", "setAggregatorGoodsId", "(Ljava/lang/String;)V", "getAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "setAmount", "(Lid/dana/data/nearbyme/model/MoneyViewEntity;)V", "getBizType", "setBizType", "getGoodsId", "setGoodsId", "getParam", "setParam", "getProductCode", "setProductCode", "getRequestId", "setRequestId", "getSecondaryBizParam", "setSecondaryBizParam", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getPluginId extends BaseRpcRequest {
    @NotNull
    private String aggregatorGoodsId;
    @NotNull
    private onWorkerReady amount;
    @NotNull
    private String bizType;
    @NotNull
    private String goodsId;
    @NotNull
    private String param;
    @NotNull
    private String productCode;
    @NotNull
    private String requestId;
    @Nullable
    private String secondaryBizParam;

    public static /* synthetic */ getPluginId copy$default(getPluginId getpluginid, String str, String str2, String str3, String str4, String str5, String str6, onWorkerReady onworkerready, String str7, int i, Object obj) {
        getPluginId getpluginid2 = getpluginid;
        int i2 = i;
        return getpluginid.copy((i2 & 1) != 0 ? getpluginid2.productCode : str, (i2 & 2) != 0 ? getpluginid2.goodsId : str2, (i2 & 4) != 0 ? getpluginid2.aggregatorGoodsId : str3, (i2 & 8) != 0 ? getpluginid2.requestId : str4, (i2 & 16) != 0 ? getpluginid2.param : str5, (i2 & 32) != 0 ? getpluginid2.secondaryBizParam : str6, (i2 & 64) != 0 ? getpluginid2.amount : onworkerready, (i2 & 128) != 0 ? getpluginid2.bizType : str7);
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

    @NotNull
    public final String component5() {
        return this.param;
    }

    @Nullable
    public final String component6() {
        return this.secondaryBizParam;
    }

    @NotNull
    public final onWorkerReady component7() {
        return this.amount;
    }

    @NotNull
    public final String component8() {
        return this.bizType;
    }

    @NotNull
    public final getPluginId copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull onWorkerReady onworkerready, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str3, "aggregatorGoodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(str5, "param");
        onWorkerReady onworkerready2 = onworkerready;
        Intrinsics.checkNotNullParameter(onworkerready2, "amount");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "bizType");
        return new getPluginId(str, str2, str3, str4, str5, str6, onworkerready2, str8);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getPluginId)) {
            return false;
        }
        getPluginId getpluginid = (getPluginId) obj;
        return Intrinsics.areEqual((Object) this.productCode, (Object) getpluginid.productCode) && Intrinsics.areEqual((Object) this.goodsId, (Object) getpluginid.goodsId) && Intrinsics.areEqual((Object) this.aggregatorGoodsId, (Object) getpluginid.aggregatorGoodsId) && Intrinsics.areEqual((Object) this.requestId, (Object) getpluginid.requestId) && Intrinsics.areEqual((Object) this.param, (Object) getpluginid.param) && Intrinsics.areEqual((Object) this.secondaryBizParam, (Object) getpluginid.secondaryBizParam) && Intrinsics.areEqual((Object) this.amount, (Object) getpluginid.amount) && Intrinsics.areEqual((Object) this.bizType, (Object) getpluginid.bizType);
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
        onWorkerReady onworkerready = this.amount;
        int hashCode7 = (hashCode6 + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        String str7 = this.bizType;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductOrderRequest(productCode=");
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

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    public final void setProductCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productCode = str;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    public final void setGoodsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.goodsId = str;
    }

    @NotNull
    public final String getAggregatorGoodsId() {
        return this.aggregatorGoodsId;
    }

    public final void setAggregatorGoodsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aggregatorGoodsId = str;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public final void setRequestId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestId = str;
    }

    @NotNull
    public final String getParam() {
        return this.param;
    }

    public final void setParam(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.param = str;
    }

    @Nullable
    public final String getSecondaryBizParam() {
        return this.secondaryBizParam;
    }

    public final void setSecondaryBizParam(@Nullable String str) {
        this.secondaryBizParam = str;
    }

    @NotNull
    public final onWorkerReady getAmount() {
        return this.amount;
    }

    public final void setAmount(@NotNull onWorkerReady onworkerready) {
        Intrinsics.checkNotNullParameter(onworkerready, "<set-?>");
        this.amount = onworkerready;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    public final void setBizType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bizType = str;
    }

    public getPluginId(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull onWorkerReady onworkerready, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "productCode");
        Intrinsics.checkNotNullParameter(str2, "goodsId");
        Intrinsics.checkNotNullParameter(str3, "aggregatorGoodsId");
        Intrinsics.checkNotNullParameter(str4, "requestId");
        Intrinsics.checkNotNullParameter(str5, "param");
        Intrinsics.checkNotNullParameter(onworkerready, "amount");
        Intrinsics.checkNotNullParameter(str7, "bizType");
        this.productCode = str;
        this.goodsId = str2;
        this.aggregatorGoodsId = str3;
        this.requestId = str4;
        this.param = str5;
        this.secondaryBizParam = str6;
        this.amount = onworkerready;
        this.bizType = str7;
    }
}
