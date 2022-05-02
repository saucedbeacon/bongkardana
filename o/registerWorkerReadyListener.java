package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0006\u0010/\u001a\u000200R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u00061"}, d2 = {"Lid/dana/data/nearbyme/model/VoucherInfoEntity;", "", "voucherName", "", "voucherIcon", "voucherBackGround", "voucherShortDescription", "voucherValue", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "voucherPrice", "displayVoucherValue", "displayVoucherPrice", "tnc", "howTo", "discountOffRate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscountOffRate", "()Ljava/lang/String;", "getDisplayVoucherPrice", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getDisplayVoucherValue", "getHowTo", "getTnc", "getVoucherBackGround", "getVoucherIcon", "getVoucherName", "getVoucherPrice", "getVoucherShortDescription", "getVoucherValue", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "toVoucherInfo", "Lid/dana/domain/nearbyme/model/VoucherInfo;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class registerWorkerReadyListener {
    @Nullable
    private final String discountOffRate;
    @Nullable
    private final onWorkerReady displayVoucherPrice;
    @Nullable
    private final onWorkerReady displayVoucherValue;
    @Nullable
    private final String howTo;
    @Nullable
    private final String tnc;
    @Nullable
    private final String voucherBackGround;
    @Nullable
    private final String voucherIcon;
    @Nullable
    private final String voucherName;
    @Nullable
    private final onWorkerReady voucherPrice;
    @Nullable
    private final String voucherShortDescription;
    @Nullable
    private final onWorkerReady voucherValue;

    public registerWorkerReadyListener() {
        this((String) null, (String) null, (String) null, (String) null, (onWorkerReady) null, (onWorkerReady) null, (onWorkerReady) null, (onWorkerReady) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ registerWorkerReadyListener copy$default(registerWorkerReadyListener registerworkerreadylistener, String str, String str2, String str3, String str4, onWorkerReady onworkerready, onWorkerReady onworkerready2, onWorkerReady onworkerready3, onWorkerReady onworkerready4, String str5, String str6, String str7, int i, Object obj) {
        registerWorkerReadyListener registerworkerreadylistener2 = registerworkerreadylistener;
        int i2 = i;
        return registerworkerreadylistener.copy((i2 & 1) != 0 ? registerworkerreadylistener2.voucherName : str, (i2 & 2) != 0 ? registerworkerreadylistener2.voucherIcon : str2, (i2 & 4) != 0 ? registerworkerreadylistener2.voucherBackGround : str3, (i2 & 8) != 0 ? registerworkerreadylistener2.voucherShortDescription : str4, (i2 & 16) != 0 ? registerworkerreadylistener2.voucherValue : onworkerready, (i2 & 32) != 0 ? registerworkerreadylistener2.voucherPrice : onworkerready2, (i2 & 64) != 0 ? registerworkerreadylistener2.displayVoucherValue : onworkerready3, (i2 & 128) != 0 ? registerworkerreadylistener2.displayVoucherPrice : onworkerready4, (i2 & 256) != 0 ? registerworkerreadylistener2.tnc : str5, (i2 & 512) != 0 ? registerworkerreadylistener2.howTo : str6, (i2 & 1024) != 0 ? registerworkerreadylistener2.discountOffRate : str7);
    }

    @Nullable
    public final String component1() {
        return this.voucherName;
    }

    @Nullable
    public final String component10() {
        return this.howTo;
    }

    @Nullable
    public final String component11() {
        return this.discountOffRate;
    }

    @Nullable
    public final String component2() {
        return this.voucherIcon;
    }

    @Nullable
    public final String component3() {
        return this.voucherBackGround;
    }

    @Nullable
    public final String component4() {
        return this.voucherShortDescription;
    }

    @Nullable
    public final onWorkerReady component5() {
        return this.voucherValue;
    }

    @Nullable
    public final onWorkerReady component6() {
        return this.voucherPrice;
    }

    @Nullable
    public final onWorkerReady component7() {
        return this.displayVoucherValue;
    }

    @Nullable
    public final onWorkerReady component8() {
        return this.displayVoucherPrice;
    }

    @Nullable
    public final String component9() {
        return this.tnc;
    }

    @NotNull
    public final registerWorkerReadyListener copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable onWorkerReady onworkerready, @Nullable onWorkerReady onworkerready2, @Nullable onWorkerReady onworkerready3, @Nullable onWorkerReady onworkerready4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new registerWorkerReadyListener(str, str2, str3, str4, onworkerready, onworkerready2, onworkerready3, onworkerready4, str5, str6, str7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerWorkerReadyListener)) {
            return false;
        }
        registerWorkerReadyListener registerworkerreadylistener = (registerWorkerReadyListener) obj;
        return Intrinsics.areEqual((Object) this.voucherName, (Object) registerworkerreadylistener.voucherName) && Intrinsics.areEqual((Object) this.voucherIcon, (Object) registerworkerreadylistener.voucherIcon) && Intrinsics.areEqual((Object) this.voucherBackGround, (Object) registerworkerreadylistener.voucherBackGround) && Intrinsics.areEqual((Object) this.voucherShortDescription, (Object) registerworkerreadylistener.voucherShortDescription) && Intrinsics.areEqual((Object) this.voucherValue, (Object) registerworkerreadylistener.voucherValue) && Intrinsics.areEqual((Object) this.voucherPrice, (Object) registerworkerreadylistener.voucherPrice) && Intrinsics.areEqual((Object) this.displayVoucherValue, (Object) registerworkerreadylistener.displayVoucherValue) && Intrinsics.areEqual((Object) this.displayVoucherPrice, (Object) registerworkerreadylistener.displayVoucherPrice) && Intrinsics.areEqual((Object) this.tnc, (Object) registerworkerreadylistener.tnc) && Intrinsics.areEqual((Object) this.howTo, (Object) registerworkerreadylistener.howTo) && Intrinsics.areEqual((Object) this.discountOffRate, (Object) registerworkerreadylistener.discountOffRate);
    }

    public final int hashCode() {
        String str = this.voucherName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.voucherIcon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.voucherBackGround;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.voucherShortDescription;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        onWorkerReady onworkerready = this.voucherValue;
        int hashCode5 = (hashCode4 + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        onWorkerReady onworkerready2 = this.voucherPrice;
        int hashCode6 = (hashCode5 + (onworkerready2 != null ? onworkerready2.hashCode() : 0)) * 31;
        onWorkerReady onworkerready3 = this.displayVoucherValue;
        int hashCode7 = (hashCode6 + (onworkerready3 != null ? onworkerready3.hashCode() : 0)) * 31;
        onWorkerReady onworkerready4 = this.displayVoucherPrice;
        int hashCode8 = (hashCode7 + (onworkerready4 != null ? onworkerready4.hashCode() : 0)) * 31;
        String str5 = this.tnc;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.howTo;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.discountOffRate;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode10 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VoucherInfoEntity(voucherName=");
        sb.append(this.voucherName);
        sb.append(", voucherIcon=");
        sb.append(this.voucherIcon);
        sb.append(", voucherBackGround=");
        sb.append(this.voucherBackGround);
        sb.append(", voucherShortDescription=");
        sb.append(this.voucherShortDescription);
        sb.append(", voucherValue=");
        sb.append(this.voucherValue);
        sb.append(", voucherPrice=");
        sb.append(this.voucherPrice);
        sb.append(", displayVoucherValue=");
        sb.append(this.displayVoucherValue);
        sb.append(", displayVoucherPrice=");
        sb.append(this.displayVoucherPrice);
        sb.append(", tnc=");
        sb.append(this.tnc);
        sb.append(", howTo=");
        sb.append(this.howTo);
        sb.append(", discountOffRate=");
        sb.append(this.discountOffRate);
        sb.append(")");
        return sb.toString();
    }

    public registerWorkerReadyListener(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable onWorkerReady onworkerready, @Nullable onWorkerReady onworkerready2, @Nullable onWorkerReady onworkerready3, @Nullable onWorkerReady onworkerready4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.voucherName = str;
        this.voucherIcon = str2;
        this.voucherBackGround = str3;
        this.voucherShortDescription = str4;
        this.voucherValue = onworkerready;
        this.voucherPrice = onworkerready2;
        this.displayVoucherValue = onworkerready3;
        this.displayVoucherPrice = onworkerready4;
        this.tnc = str5;
        this.howTo = str6;
        this.discountOffRate = str7;
    }

    @Nullable
    public final String getVoucherName() {
        return this.voucherName;
    }

    @Nullable
    public final String getVoucherIcon() {
        return this.voucherIcon;
    }

    @Nullable
    public final String getVoucherBackGround() {
        return this.voucherBackGround;
    }

    @Nullable
    public final String getVoucherShortDescription() {
        return this.voucherShortDescription;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ registerWorkerReadyListener(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, o.onWorkerReady r20, o.onWorkerReady r21, o.onWorkerReady r22, o.onWorkerReady r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r16
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r17
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r18
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r19
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0034
            o.onWorkerReady r6 = new o.onWorkerReady
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0036
        L_0x0034:
            r6 = r20
        L_0x0036:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0051
            o.onWorkerReady r7 = new o.onWorkerReady
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 7
            r12 = 0
            r16 = r7
            r17 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r21 = r12
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0053
        L_0x0051:
            r7 = r21
        L_0x0053:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x006e
            o.onWorkerReady r8 = new o.onWorkerReady
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 7
            r13 = 0
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x0070
        L_0x006e:
            r8 = r22
        L_0x0070:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x008b
            o.onWorkerReady r9 = new o.onWorkerReady
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 7
            r14 = 0
            r16 = r9
            r17 = r10
            r18 = r11
            r19 = r12
            r20 = r13
            r21 = r14
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x008d
        L_0x008b:
            r9 = r23
        L_0x008d:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0093
            r10 = r2
            goto L_0x0095
        L_0x0093:
            r10 = r24
        L_0x0095:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x009b
            r11 = r2
            goto L_0x009d
        L_0x009b:
            r11 = r25
        L_0x009d:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r2 = r26
        L_0x00a4:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.registerWorkerReadyListener.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, o.onWorkerReady, o.onWorkerReady, o.onWorkerReady, o.onWorkerReady, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final onWorkerReady getVoucherValue() {
        return this.voucherValue;
    }

    @Nullable
    public final onWorkerReady getVoucherPrice() {
        return this.voucherPrice;
    }

    @Nullable
    public final onWorkerReady getDisplayVoucherValue() {
        return this.displayVoucherValue;
    }

    @Nullable
    public final onWorkerReady getDisplayVoucherPrice() {
        return this.displayVoucherPrice;
    }

    @Nullable
    public final String getTnc() {
        return this.tnc;
    }

    @Nullable
    public final String getHowTo() {
        return this.howTo;
    }

    @Nullable
    public final String getDiscountOffRate() {
        return this.discountOffRate;
    }

    @NotNull
    public final fileName toVoucherInfo() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = this.voucherName;
        String str8 = str7 == null ? "" : str7;
        String str9 = this.voucherIcon;
        if (str9 == null) {
            str = "";
        } else {
            str = str9;
        }
        String str10 = this.voucherBackGround;
        if (str10 == null) {
            str2 = "";
        } else {
            str2 = str10;
        }
        String str11 = this.voucherShortDescription;
        if (str11 == null) {
            str3 = "";
        } else {
            str3 = str11;
        }
        getAppDir moneyView = isReady.toMoneyView(this.voucherValue);
        getAppDir moneyView2 = isReady.toMoneyView(this.voucherPrice);
        getAppDir moneyView3 = isReady.toMoneyView(this.displayVoucherValue);
        getAppDir moneyView4 = isReady.toMoneyView(this.displayVoucherPrice);
        String str12 = this.tnc;
        if (str12 == null) {
            str4 = "";
        } else {
            str4 = str12;
        }
        String str13 = this.howTo;
        if (str13 == null) {
            str5 = "";
        } else {
            str5 = str13;
        }
        String str14 = this.discountOffRate;
        if (str14 == null) {
            str6 = "";
        } else {
            str6 = str14;
        }
        return new fileName(str8, str, str2, str3, moneyView, moneyView2, moneyView3, moneyView4, str4, str5, str6);
    }
}
