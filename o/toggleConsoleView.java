package o;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\t\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, d2 = {"Lid/dana/data/merchant/repository/source/network/request/BizIds;", "", "bizId", "", "customerName", "denom", "Lid/dana/data/merchant/repository/source/network/request/Denom;", "goodsId", "goodsType", "isGoodsActive", "", "provider", "transactionDate", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/request/Denom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBizId", "()Ljava/lang/String;", "getCustomerName", "getDenom", "()Lid/dana/data/merchant/repository/source/network/request/Denom;", "getGoodsId", "getGoodsType", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProvider", "getTransactionDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lid/dana/data/merchant/repository/source/network/request/Denom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lid/dana/data/merchant/repository/source/network/request/BizIds;", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class toggleConsoleView {
    @SerializedName("bizId")
    @Nullable
    private final String bizId;
    @SerializedName("customerName")
    @Nullable
    private final String customerName;
    @SerializedName("denom")
    @Nullable
    private final DebugConsolePoint denom;
    @SerializedName("goodsId")
    @Nullable
    private final String goodsId;
    @SerializedName("goodsType")
    @Nullable
    private final String goodsType;
    @SerializedName("isGoodsActive")
    @Nullable
    private final Boolean isGoodsActive;
    @SerializedName("provider")
    @Nullable
    private final String provider;
    @SerializedName("transactionDate")
    @Nullable
    private final String transactionDate;

    public toggleConsoleView() {
        this((String) null, (String) null, (DebugConsolePoint) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ toggleConsoleView copy$default(toggleConsoleView toggleconsoleview, String str, String str2, DebugConsolePoint debugConsolePoint, String str3, String str4, Boolean bool, String str5, String str6, int i, Object obj) {
        toggleConsoleView toggleconsoleview2 = toggleconsoleview;
        int i2 = i;
        return toggleconsoleview.copy((i2 & 1) != 0 ? toggleconsoleview2.bizId : str, (i2 & 2) != 0 ? toggleconsoleview2.customerName : str2, (i2 & 4) != 0 ? toggleconsoleview2.denom : debugConsolePoint, (i2 & 8) != 0 ? toggleconsoleview2.goodsId : str3, (i2 & 16) != 0 ? toggleconsoleview2.goodsType : str4, (i2 & 32) != 0 ? toggleconsoleview2.isGoodsActive : bool, (i2 & 64) != 0 ? toggleconsoleview2.provider : str5, (i2 & 128) != 0 ? toggleconsoleview2.transactionDate : str6);
    }

    @Nullable
    public final String component1() {
        return this.bizId;
    }

    @Nullable
    public final String component2() {
        return this.customerName;
    }

    @Nullable
    public final DebugConsolePoint component3() {
        return this.denom;
    }

    @Nullable
    public final String component4() {
        return this.goodsId;
    }

    @Nullable
    public final String component5() {
        return this.goodsType;
    }

    @Nullable
    public final Boolean component6() {
        return this.isGoodsActive;
    }

    @Nullable
    public final String component7() {
        return this.provider;
    }

    @Nullable
    public final String component8() {
        return this.transactionDate;
    }

    @NotNull
    public final toggleConsoleView copy(@Nullable String str, @Nullable String str2, @Nullable DebugConsolePoint debugConsolePoint, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        return new toggleConsoleView(str, str2, debugConsolePoint, str3, str4, bool, str5, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toggleConsoleView)) {
            return false;
        }
        toggleConsoleView toggleconsoleview = (toggleConsoleView) obj;
        return Intrinsics.areEqual((Object) this.bizId, (Object) toggleconsoleview.bizId) && Intrinsics.areEqual((Object) this.customerName, (Object) toggleconsoleview.customerName) && Intrinsics.areEqual((Object) this.denom, (Object) toggleconsoleview.denom) && Intrinsics.areEqual((Object) this.goodsId, (Object) toggleconsoleview.goodsId) && Intrinsics.areEqual((Object) this.goodsType, (Object) toggleconsoleview.goodsType) && Intrinsics.areEqual((Object) this.isGoodsActive, (Object) toggleconsoleview.isGoodsActive) && Intrinsics.areEqual((Object) this.provider, (Object) toggleconsoleview.provider) && Intrinsics.areEqual((Object) this.transactionDate, (Object) toggleconsoleview.transactionDate);
    }

    public final int hashCode() {
        String str = this.bizId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.customerName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        DebugConsolePoint debugConsolePoint = this.denom;
        int hashCode3 = (hashCode2 + (debugConsolePoint != null ? debugConsolePoint.hashCode() : 0)) * 31;
        String str3 = this.goodsId;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.goodsType;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Boolean bool = this.isGoodsActive;
        int hashCode6 = (hashCode5 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str5 = this.provider;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.transactionDate;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BizIds(bizId=");
        sb.append(this.bizId);
        sb.append(", customerName=");
        sb.append(this.customerName);
        sb.append(", denom=");
        sb.append(this.denom);
        sb.append(", goodsId=");
        sb.append(this.goodsId);
        sb.append(", goodsType=");
        sb.append(this.goodsType);
        sb.append(", isGoodsActive=");
        sb.append(this.isGoodsActive);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", transactionDate=");
        sb.append(this.transactionDate);
        sb.append(")");
        return sb.toString();
    }

    public toggleConsoleView(@Nullable String str, @Nullable String str2, @Nullable DebugConsolePoint debugConsolePoint, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6) {
        this.bizId = str;
        this.customerName = str2;
        this.denom = debugConsolePoint;
        this.goodsId = str3;
        this.goodsType = str4;
        this.isGoodsActive = bool;
        this.provider = str5;
        this.transactionDate = str6;
    }

    @Nullable
    public final String getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getCustomerName() {
        return this.customerName;
    }

    @Nullable
    public final DebugConsolePoint getDenom() {
        return this.denom;
    }

    @Nullable
    public final String getGoodsId() {
        return this.goodsId;
    }

    @Nullable
    public final String getGoodsType() {
        return this.goodsType;
    }

    @Nullable
    public final Boolean isGoodsActive() {
        return this.isGoodsActive;
    }

    @Nullable
    public final String getProvider() {
        return this.provider;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ toggleConsoleView(java.lang.String r10, java.lang.String r11, o.DebugConsolePoint r12, java.lang.String r13, java.lang.String r14, java.lang.Boolean r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r11
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0033
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r16
        L_0x0035:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r2 = r17
        L_0x003c:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.toggleConsoleView.<init>(java.lang.String, java.lang.String, o.DebugConsolePoint, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getTransactionDate() {
        return this.transactionDate;
    }
}
