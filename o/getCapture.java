package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0015\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\t\u0010*\u001a\u00020\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lid/dana/data/nearbyme/model/ProductInfoEntity;", "", "goodsId", "", "provider", "type", "description", "goodsTitle", "price", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "denom", "available", "", "productCode", "extendInfo", "", "voucherInfo", "Lid/dana/data/nearbyme/model/VoucherInfoEntity;", "savingRate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;ZLjava/lang/String;Ljava/util/Map;Lid/dana/data/nearbyme/model/VoucherInfoEntity;D)V", "getAvailable", "()Z", "getDenom", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getDescription", "()Ljava/lang/String;", "getExtendInfo", "()Ljava/util/Map;", "getGoodsId", "getGoodsTitle", "getPrice", "getProductCode", "getProvider", "getSavingRate", "()D", "getType", "getVoucherInfo", "()Lid/dana/data/nearbyme/model/VoucherInfoEntity;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCapture {
    private final boolean available;
    @NotNull
    private final onWorkerReady denom;
    @NotNull
    private final String description;
    @NotNull
    private final Map<String, String> extendInfo;
    @NotNull
    private final String goodsId;
    @NotNull
    private final String goodsTitle;
    @NotNull
    private final onWorkerReady price;
    @NotNull
    private final String productCode;
    @NotNull
    private final String provider;
    private final double savingRate;
    @NotNull
    private final String type;
    @NotNull
    private final registerWorkerReadyListener voucherInfo;

    public getCapture() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (onWorkerReady) null, (onWorkerReady) null, false, (String) null, (Map) null, (registerWorkerReadyListener) null, 0.0d, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getCapture copy$default(getCapture getcapture, String str, String str2, String str3, String str4, String str5, onWorkerReady onworkerready, onWorkerReady onworkerready2, boolean z, String str6, Map map, registerWorkerReadyListener registerworkerreadylistener, double d, int i, Object obj) {
        getCapture getcapture2 = getcapture;
        int i2 = i;
        return getcapture.copy((i2 & 1) != 0 ? getcapture2.goodsId : str, (i2 & 2) != 0 ? getcapture2.provider : str2, (i2 & 4) != 0 ? getcapture2.type : str3, (i2 & 8) != 0 ? getcapture2.description : str4, (i2 & 16) != 0 ? getcapture2.goodsTitle : str5, (i2 & 32) != 0 ? getcapture2.price : onworkerready, (i2 & 64) != 0 ? getcapture2.denom : onworkerready2, (i2 & 128) != 0 ? getcapture2.available : z, (i2 & 256) != 0 ? getcapture2.productCode : str6, (i2 & 512) != 0 ? getcapture2.extendInfo : map, (i2 & 1024) != 0 ? getcapture2.voucherInfo : registerworkerreadylistener, (i2 & 2048) != 0 ? getcapture2.savingRate : d);
    }

    @NotNull
    public final String component1() {
        return this.goodsId;
    }

    @NotNull
    public final Map<String, String> component10() {
        return this.extendInfo;
    }

    @NotNull
    public final registerWorkerReadyListener component11() {
        return this.voucherInfo;
    }

    public final double component12() {
        return this.savingRate;
    }

    @NotNull
    public final String component2() {
        return this.provider;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    @NotNull
    public final String component4() {
        return this.description;
    }

    @NotNull
    public final String component5() {
        return this.goodsTitle;
    }

    @NotNull
    public final onWorkerReady component6() {
        return this.price;
    }

    @NotNull
    public final onWorkerReady component7() {
        return this.denom;
    }

    public final boolean component8() {
        return this.available;
    }

    @NotNull
    public final String component9() {
        return this.productCode;
    }

    @NotNull
    public final getCapture copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, boolean z, @NotNull String str6, @NotNull Map<String, String> map, @NotNull registerWorkerReadyListener registerworkerreadylistener, double d) {
        String str7 = str;
        int length = str7 != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(975435853, oncanceled);
            onCancelLoad.getMin(975435853, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str7, "goodsId");
        String str8 = str2;
        Intrinsics.checkNotNullParameter(str8, "provider");
        String str9 = str3;
        Intrinsics.checkNotNullParameter(str9, "type");
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "description");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "goodsTitle");
        onWorkerReady onworkerready3 = onworkerready;
        Intrinsics.checkNotNullParameter(onworkerready3, FirebaseAnalytics.Param.PRICE);
        onWorkerReady onworkerready4 = onworkerready2;
        Intrinsics.checkNotNullParameter(onworkerready4, "denom");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, "productCode");
        Map<String, String> map2 = map;
        Intrinsics.checkNotNullParameter(map2, "extendInfo");
        registerWorkerReadyListener registerworkerreadylistener2 = registerworkerreadylistener;
        Intrinsics.checkNotNullParameter(registerworkerreadylistener2, "voucherInfo");
        return new getCapture(str, str8, str9, str10, str11, onworkerready3, onworkerready4, z, str12, map2, registerworkerreadylistener2, d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCapture)) {
            return false;
        }
        getCapture getcapture = (getCapture) obj;
        return Intrinsics.areEqual((Object) this.goodsId, (Object) getcapture.goodsId) && Intrinsics.areEqual((Object) this.provider, (Object) getcapture.provider) && Intrinsics.areEqual((Object) this.type, (Object) getcapture.type) && Intrinsics.areEqual((Object) this.description, (Object) getcapture.description) && Intrinsics.areEqual((Object) this.goodsTitle, (Object) getcapture.goodsTitle) && Intrinsics.areEqual((Object) this.price, (Object) getcapture.price) && Intrinsics.areEqual((Object) this.denom, (Object) getcapture.denom) && this.available == getcapture.available && Intrinsics.areEqual((Object) this.productCode, (Object) getcapture.productCode) && Intrinsics.areEqual((Object) this.extendInfo, (Object) getcapture.extendInfo) && Intrinsics.areEqual((Object) this.voucherInfo, (Object) getcapture.voucherInfo) && Double.compare(this.savingRate, getcapture.savingRate) == 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductInfoEntity(goodsId=");
        sb.append(this.goodsId);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", goodsTitle=");
        sb.append(this.goodsTitle);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", denom=");
        sb.append(this.denom);
        sb.append(", available=");
        sb.append(this.available);
        sb.append(", productCode=");
        sb.append(this.productCode);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", voucherInfo=");
        sb.append(this.voucherInfo);
        sb.append(", savingRate=");
        sb.append(this.savingRate);
        sb.append(")");
        return sb.toString();
    }

    public getCapture(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, boolean z, @NotNull String str6, @NotNull Map<String, String> map, @NotNull registerWorkerReadyListener registerworkerreadylistener, double d) {
        Intrinsics.checkNotNullParameter(str, "goodsId");
        Intrinsics.checkNotNullParameter(str2, "provider");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(str4, "description");
        Intrinsics.checkNotNullParameter(str5, "goodsTitle");
        Intrinsics.checkNotNullParameter(onworkerready, FirebaseAnalytics.Param.PRICE);
        Intrinsics.checkNotNullParameter(onworkerready2, "denom");
        Intrinsics.checkNotNullParameter(str6, "productCode");
        Intrinsics.checkNotNullParameter(map, "extendInfo");
        Intrinsics.checkNotNullParameter(registerworkerreadylistener, "voucherInfo");
        this.goodsId = str;
        this.provider = str2;
        this.type = str3;
        this.description = str4;
        this.goodsTitle = str5;
        this.price = onworkerready;
        this.denom = onworkerready2;
        this.available = z;
        this.productCode = str6;
        this.extendInfo = map;
        this.voucherInfo = registerworkerreadylistener;
        this.savingRate = d;
    }

    @NotNull
    public final String getGoodsId() {
        return this.goodsId;
    }

    @NotNull
    public final String getProvider() {
        return this.provider;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getGoodsTitle() {
        return this.goodsTitle;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getCapture(java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, o.onWorkerReady r32, o.onWorkerReady r33, boolean r34, java.lang.String r35, java.util.Map r36, o.registerWorkerReadyListener r37, double r38, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r26 = this;
            r0 = r40
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r27
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r28
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r29
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r30
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r31
        L_0x002c:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0047
            o.onWorkerReady r7 = new o.onWorkerReady
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r27.<init>(r28, r29, r30, r31, r32)
            goto L_0x0049
        L_0x0047:
            r7 = r32
        L_0x0049:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0064
            o.onWorkerReady r8 = new o.onWorkerReady
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r13
            r27.<init>(r28, r29, r30, r31, r32)
            goto L_0x0066
        L_0x0064:
            r8 = r33
        L_0x0066:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x006c
            r9 = 0
            goto L_0x006e
        L_0x006c:
            r9 = r34
        L_0x006e:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r2 = r35
        L_0x0075:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x007e
            java.util.Map r10 = kotlin.collections.MapsKt.emptyMap()
            goto L_0x0080
        L_0x007e:
            r10 = r36
        L_0x0080:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x00a2
            o.registerWorkerReadyListener r11 = new o.registerWorkerReadyListener
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 2047(0x7ff, float:2.868E-42)
            r25 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00a4
        L_0x00a2:
            r11 = r37
        L_0x00a4:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x00ab
            r12 = 0
            goto L_0x00ad
        L_0x00ab:
            r12 = r38
        L_0x00ad:
            r27 = r26
            r28 = r1
            r29 = r3
            r30 = r4
            r31 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            r35 = r9
            r36 = r2
            r37 = r10
            r38 = r11
            r39 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCapture.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.onWorkerReady, o.onWorkerReady, boolean, java.lang.String, java.util.Map, o.registerWorkerReadyListener, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final onWorkerReady getPrice() {
        return this.price;
    }

    @NotNull
    public final onWorkerReady getDenom() {
        return this.denom;
    }

    public final boolean getAvailable() {
        return this.available;
    }

    @NotNull
    public final String getProductCode() {
        return this.productCode;
    }

    @NotNull
    public final Map<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    @NotNull
    public final registerWorkerReadyListener getVoucherInfo() {
        return this.voucherInfo;
    }

    public final double getSavingRate() {
        return this.savingRate;
    }

    public final int hashCode() {
        String str = this.goodsId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.provider;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.goodsTitle;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        onWorkerReady onworkerready = this.price;
        int hashCode6 = (hashCode5 + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        onWorkerReady onworkerready2 = this.denom;
        int hashCode7 = (hashCode6 + (onworkerready2 != null ? onworkerready2.hashCode() : 0)) * 31;
        boolean z = this.available;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str6 = this.productCode;
        int hashCode8 = (i2 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Map<String, String> map = this.extendInfo;
        int hashCode9 = (hashCode8 + (map != null ? map.hashCode() : 0)) * 31;
        registerWorkerReadyListener registerworkerreadylistener = this.voucherInfo;
        if (registerworkerreadylistener != null) {
            i = registerworkerreadylistener.hashCode();
        }
        return ((hashCode9 + i) * 31) + Double.valueOf(this.savingRate).hashCode();
    }
}
