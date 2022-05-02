package id.dana.data.globalsearch.source.network.result;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u000e\u0010 R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010$R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0017¨\u0006,"}, d2 = {"Lid/dana/data/globalsearch/source/network/result/ProductBizIdEntity;", "", "bizId", "", "secondaryBizId", "transactionDate", "customerName", "goodsId", "goodsTitle", "goodsType", "denom", "Lid/dana/data/globalsearch/source/network/result/DenomEntity;", "provider", "providerName", "isGoodsActive", "", "productCode", "productDesc", "profileKey", "extendInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/globalsearch/source/network/result/DenomEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getBizId", "()Ljava/lang/String;", "getCustomerName", "getDenom", "()Lid/dana/data/globalsearch/source/network/result/DenomEntity;", "getExtendInfo", "()Ljava/util/Map;", "getGoodsId", "getGoodsTitle", "getGoodsType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductCode", "setProductCode", "(Ljava/lang/String;)V", "getProductDesc", "setProductDesc", "getProfileKey", "getProvider", "getProviderName", "getSecondaryBizId", "getTransactionDate", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class ProductBizIdEntity {
    @SerializedName("bizId")
    @Nullable
    private final String bizId;
    @SerializedName("customerName")
    @Nullable
    private final String customerName;
    @SerializedName("denom")
    @Nullable
    private final DenomEntity denom;
    @SerializedName("extendInfo")
    @Nullable
    private final Map<String, Object> extendInfo;
    @SerializedName("goodsId")
    @Nullable
    private final String goodsId;
    @SerializedName("goodsTitle")
    @Nullable
    private final String goodsTitle;
    @SerializedName("goodsType")
    @Nullable
    private final String goodsType;
    @SerializedName("isGoodsActive")
    @Nullable
    private final Boolean isGoodsActive;
    @SerializedName("productCode")
    @Nullable
    private String productCode;
    @SerializedName("productDesc")
    @Nullable
    private String productDesc;
    @SerializedName("profileKey")
    @Nullable
    private final String profileKey;
    @SerializedName("provider")
    @Nullable
    private final String provider;
    @SerializedName("providerName")
    @Nullable
    private final String providerName;
    @SerializedName("secondaryBizId")
    @Nullable
    private final String secondaryBizId;
    @SerializedName("transactionDate")
    @Nullable
    private final String transactionDate;

    public ProductBizIdEntity() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DenomEntity) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (Map) null, 32767, (DefaultConstructorMarker) null);
    }

    public ProductBizIdEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable DenomEntity denomEntity, @Nullable String str8, @Nullable String str9, @Nullable Boolean bool, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Map<String, ? extends Object> map) {
        this.bizId = str;
        this.secondaryBizId = str2;
        this.transactionDate = str3;
        this.customerName = str4;
        this.goodsId = str5;
        this.goodsTitle = str6;
        this.goodsType = str7;
        this.denom = denomEntity;
        this.provider = str8;
        this.providerName = str9;
        this.isGoodsActive = bool;
        this.productCode = str10;
        this.productDesc = str11;
        this.profileKey = str12;
        this.extendInfo = map;
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getSecondaryBizId() {
        return this.secondaryBizId;
    }

    @Nullable
    public final String getTransactionDate() {
        return this.transactionDate;
    }

    @Nullable
    public final String getCustomerName() {
        return this.customerName;
    }

    @Nullable
    public final String getGoodsId() {
        return this.goodsId;
    }

    @Nullable
    public final String getGoodsTitle() {
        return this.goodsTitle;
    }

    @Nullable
    public final String getGoodsType() {
        return this.goodsType;
    }

    @Nullable
    public final DenomEntity getDenom() {
        return this.denom;
    }

    @Nullable
    public final String getProvider() {
        return this.provider;
    }

    @Nullable
    public final String getProviderName() {
        return this.providerName;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ProductBizIdEntity(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, id.dana.data.globalsearch.source.network.result.DenomEntity r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.util.Map r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r18
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r20
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r21
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0032
            r7 = r2
            goto L_0x0034
        L_0x0032:
            r7 = r22
        L_0x0034:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x003a
            r8 = r2
            goto L_0x003c
        L_0x003a:
            r8 = r23
        L_0x003c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0042
            r9 = 0
            goto L_0x0044
        L_0x0042:
            r9 = r24
        L_0x0044:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x004a
            r10 = r2
            goto L_0x004c
        L_0x004a:
            r10 = r25
        L_0x004c:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0052
            r11 = r2
            goto L_0x0054
        L_0x0052:
            r11 = r26
        L_0x0054:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005b
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto L_0x005d
        L_0x005b:
            r12 = r27
        L_0x005d:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0063
            r13 = r2
            goto L_0x0065
        L_0x0063:
            r13 = r28
        L_0x0065:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006b
            r14 = r2
            goto L_0x006d
        L_0x006b:
            r14 = r29
        L_0x006d:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r2 = r30
        L_0x0074:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x007d
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x007f
        L_0x007d:
            r0 = r31
        L_0x007f:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r14
            r31 = r2
            r32 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.data.globalsearch.source.network.result.ProductBizIdEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, id.dana.data.globalsearch.source.network.result.DenomEntity, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Boolean isGoodsActive() {
        return this.isGoodsActive;
    }

    @Nullable
    public final String getProductCode() {
        return this.productCode;
    }

    public final void setProductCode(@Nullable String str) {
        this.productCode = str;
    }

    @Nullable
    public final String getProductDesc() {
        return this.productDesc;
    }

    public final void setProductDesc(@Nullable String str) {
        this.productDesc = str;
    }

    @Nullable
    public final String getProfileKey() {
        return this.profileKey;
    }

    @Nullable
    public final Map<String, Object> getExtendInfo() {
        return this.extendInfo;
    }
}
