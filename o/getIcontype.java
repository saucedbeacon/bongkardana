package o;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¥\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014¨\u0006@"}, d2 = {"Lid/dana/domain/announcement/model/Announcement;", "", "id", "", "title", "subtitle", "widgetType", "expirationDate", "gmtCreate", "subMerchantId", "goodsName", "subscriptionDueDate", "paymentStatus", "totalAmount", "extInfo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getExpirationDate", "()Ljava/lang/String;", "setExpirationDate", "(Ljava/lang/String;)V", "getExtInfo", "()Ljava/util/Map;", "setExtInfo", "(Ljava/util/Map;)V", "getGmtCreate", "setGmtCreate", "getGoodsName", "setGoodsName", "getId", "setId", "getPaymentStatus", "setPaymentStatus", "getSubMerchantId", "setSubMerchantId", "getSubscriptionDueDate", "setSubscriptionDueDate", "getSubtitle", "setSubtitle", "getTitle", "setTitle", "getTotalAmount", "setTotalAmount", "getWidgetType", "setWidgetType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getIcontype {
    @Nullable
    private String expirationDate;
    @Nullable
    private Map<String, String> extInfo;
    @Nullable
    private String gmtCreate;
    @Nullable
    private String goodsName;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private String f9926id;
    @Nullable
    private String paymentStatus;
    @Nullable
    private String subMerchantId;
    @Nullable
    private String subscriptionDueDate;
    @Nullable
    private String subtitle;
    @Nullable
    private String title;
    @Nullable
    private String totalAmount;
    @Nullable
    private String widgetType;

    public getIcontype() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getIcontype copy$default(getIcontype geticontype, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Map map, int i, Object obj) {
        getIcontype geticontype2 = geticontype;
        int i2 = i;
        return geticontype.copy((i2 & 1) != 0 ? geticontype2.f9926id : str, (i2 & 2) != 0 ? geticontype2.title : str2, (i2 & 4) != 0 ? geticontype2.subtitle : str3, (i2 & 8) != 0 ? geticontype2.widgetType : str4, (i2 & 16) != 0 ? geticontype2.expirationDate : str5, (i2 & 32) != 0 ? geticontype2.gmtCreate : str6, (i2 & 64) != 0 ? geticontype2.subMerchantId : str7, (i2 & 128) != 0 ? geticontype2.goodsName : str8, (i2 & 256) != 0 ? geticontype2.subscriptionDueDate : str9, (i2 & 512) != 0 ? geticontype2.paymentStatus : str10, (i2 & 1024) != 0 ? geticontype2.totalAmount : str11, (i2 & 2048) != 0 ? geticontype2.extInfo : map);
    }

    @Nullable
    public final String component1() {
        return this.f9926id;
    }

    @Nullable
    public final String component10() {
        return this.paymentStatus;
    }

    @Nullable
    public final String component11() {
        return this.totalAmount;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.extInfo;
    }

    @Nullable
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component3() {
        return this.subtitle;
    }

    @Nullable
    public final String component4() {
        return this.widgetType;
    }

    @Nullable
    public final String component5() {
        return this.expirationDate;
    }

    @Nullable
    public final String component6() {
        return this.gmtCreate;
    }

    @Nullable
    public final String component7() {
        return this.subMerchantId;
    }

    @Nullable
    public final String component8() {
        return this.goodsName;
    }

    @Nullable
    public final String component9() {
        return this.subscriptionDueDate;
    }

    @NotNull
    public final getIcontype copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Map<String, String> map) {
        return new getIcontype(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, map);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIcontype)) {
            return false;
        }
        getIcontype geticontype = (getIcontype) obj;
        return Intrinsics.areEqual((Object) this.f9926id, (Object) geticontype.f9926id) && Intrinsics.areEqual((Object) this.title, (Object) geticontype.title) && Intrinsics.areEqual((Object) this.subtitle, (Object) geticontype.subtitle) && Intrinsics.areEqual((Object) this.widgetType, (Object) geticontype.widgetType) && Intrinsics.areEqual((Object) this.expirationDate, (Object) geticontype.expirationDate) && Intrinsics.areEqual((Object) this.gmtCreate, (Object) geticontype.gmtCreate) && Intrinsics.areEqual((Object) this.subMerchantId, (Object) geticontype.subMerchantId) && Intrinsics.areEqual((Object) this.goodsName, (Object) geticontype.goodsName) && Intrinsics.areEqual((Object) this.subscriptionDueDate, (Object) geticontype.subscriptionDueDate) && Intrinsics.areEqual((Object) this.paymentStatus, (Object) geticontype.paymentStatus) && Intrinsics.areEqual((Object) this.totalAmount, (Object) geticontype.totalAmount) && Intrinsics.areEqual((Object) this.extInfo, (Object) geticontype.extInfo);
    }

    public final int hashCode() {
        String str = this.f9926id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.subtitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.widgetType;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.expirationDate;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.gmtCreate;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.subMerchantId;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.goodsName;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.subscriptionDueDate;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.paymentStatus;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.totalAmount;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        Map<String, String> map = this.extInfo;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode11 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Announcement(id=");
        sb.append(this.f9926id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", widgetType=");
        sb.append(this.widgetType);
        sb.append(", expirationDate=");
        sb.append(this.expirationDate);
        sb.append(", gmtCreate=");
        sb.append(this.gmtCreate);
        sb.append(", subMerchantId=");
        sb.append(this.subMerchantId);
        sb.append(", goodsName=");
        sb.append(this.goodsName);
        sb.append(", subscriptionDueDate=");
        sb.append(this.subscriptionDueDate);
        sb.append(", paymentStatus=");
        sb.append(this.paymentStatus);
        sb.append(", totalAmount=");
        sb.append(this.totalAmount);
        sb.append(", extInfo=");
        sb.append(this.extInfo);
        sb.append(")");
        return sb.toString();
    }

    public getIcontype(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Map<String, String> map) {
        this.f9926id = str;
        this.title = str2;
        this.subtitle = str3;
        this.widgetType = str4;
        this.expirationDate = str5;
        this.gmtCreate = str6;
        this.subMerchantId = str7;
        this.goodsName = str8;
        this.subscriptionDueDate = str9;
        this.paymentStatus = str10;
        this.totalAmount = str11;
        this.extInfo = map;
    }

    @Nullable
    public final String getId() {
        return this.f9926id;
    }

    public final void setId(@Nullable String str) {
        this.f9926id = str;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    @Nullable
    public final String getWidgetType() {
        return this.widgetType;
    }

    public final void setWidgetType(@Nullable String str) {
        this.widgetType = str;
    }

    @Nullable
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final void setExpirationDate(@Nullable String str) {
        this.expirationDate = str;
    }

    @Nullable
    public final String getGmtCreate() {
        return this.gmtCreate;
    }

    public final void setGmtCreate(@Nullable String str) {
        this.gmtCreate = str;
    }

    @Nullable
    public final String getSubMerchantId() {
        return this.subMerchantId;
    }

    public final void setSubMerchantId(@Nullable String str) {
        this.subMerchantId = str;
    }

    @Nullable
    public final String getGoodsName() {
        return this.goodsName;
    }

    public final void setGoodsName(@Nullable String str) {
        this.goodsName = str;
    }

    @Nullable
    public final String getSubscriptionDueDate() {
        return this.subscriptionDueDate;
    }

    public final void setSubscriptionDueDate(@Nullable String str) {
        this.subscriptionDueDate = str;
    }

    @Nullable
    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final void setPaymentStatus(@Nullable String str) {
        this.paymentStatus = str;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public final void setTotalAmount(@Nullable String str) {
        this.totalAmount = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getIcontype(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.Map r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r13 = this;
            r0 = r26
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r15
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0019
        L_0x0017:
            r4 = r16
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0021
        L_0x001f:
            r5 = r17
        L_0x0021:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0027
            r6 = r2
            goto L_0x0029
        L_0x0027:
            r6 = r18
        L_0x0029:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002f
            r7 = r2
            goto L_0x0031
        L_0x002f:
            r7 = r19
        L_0x0031:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0037
            r8 = r2
            goto L_0x0039
        L_0x0037:
            r8 = r20
        L_0x0039:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003f
            r9 = r2
            goto L_0x0041
        L_0x003f:
            r9 = r21
        L_0x0041:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r2
            goto L_0x0049
        L_0x0047:
            r10 = r22
        L_0x0049:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004f
            r11 = r2
            goto L_0x0051
        L_0x004f:
            r11 = r23
        L_0x0051:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0057
            r12 = r2
            goto L_0x0059
        L_0x0057:
            r12 = r24
        L_0x0059:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r2 = r25
        L_0x0060:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r12
            r26 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIcontype.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final Map<String, String> getExtInfo() {
        return this.extInfo;
    }

    public final void setExtInfo(@Nullable Map<String, String> map) {
        this.extInfo = map;
    }
}
