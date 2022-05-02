package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00108\u001a\u00020\u000b2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010#\"\u0004\b&\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0012\"\u0004\b(\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006="}, d2 = {"Lid/dana/domain/nearbyme/model/ContactAddress;", "", "address1", "", "address2", "area", "city", "contactAddressId", "contactAddressType", "country", "isDefaultAddress", "", "extendInfo", "province", "isVerified", "zipcode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getAddress1", "()Ljava/lang/String;", "setAddress1", "(Ljava/lang/String;)V", "getAddress2", "setAddress2", "getArea", "setArea", "getCity", "setCity", "getContactAddressId", "setContactAddressId", "getContactAddressType", "setContactAddressType", "getCountry", "setCountry", "getExtendInfo", "setExtendInfo", "()Z", "setDefaultAddress", "(Z)V", "setVerified", "getProvince", "setProvince", "getZipcode", "setZipcode", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getMacEncrypt {
    @Nullable
    private String address1;
    @Nullable
    private String address2;
    @Nullable
    private String area;
    @Nullable
    private String city;
    @Nullable
    private String contactAddressId;
    @Nullable
    private String contactAddressType;
    @Nullable
    private String country;
    @Nullable
    private String extendInfo;
    private boolean isDefaultAddress;
    private boolean isVerified;
    @Nullable
    private String province;
    @Nullable
    private String zipcode;

    public getMacEncrypt() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, false, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getMacEncrypt copy$default(getMacEncrypt getmacencrypt, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, String str10, int i, Object obj) {
        getMacEncrypt getmacencrypt2 = getmacencrypt;
        int i2 = i;
        return getmacencrypt.copy((i2 & 1) != 0 ? getmacencrypt2.address1 : str, (i2 & 2) != 0 ? getmacencrypt2.address2 : str2, (i2 & 4) != 0 ? getmacencrypt2.area : str3, (i2 & 8) != 0 ? getmacencrypt2.city : str4, (i2 & 16) != 0 ? getmacencrypt2.contactAddressId : str5, (i2 & 32) != 0 ? getmacencrypt2.contactAddressType : str6, (i2 & 64) != 0 ? getmacencrypt2.country : str7, (i2 & 128) != 0 ? getmacencrypt2.isDefaultAddress : z, (i2 & 256) != 0 ? getmacencrypt2.extendInfo : str8, (i2 & 512) != 0 ? getmacencrypt2.province : str9, (i2 & 1024) != 0 ? getmacencrypt2.isVerified : z2, (i2 & 2048) != 0 ? getmacencrypt2.zipcode : str10);
    }

    @Nullable
    public final String component1() {
        return this.address1;
    }

    @Nullable
    public final String component10() {
        return this.province;
    }

    public final boolean component11() {
        return this.isVerified;
    }

    @Nullable
    public final String component12() {
        return this.zipcode;
    }

    @Nullable
    public final String component2() {
        return this.address2;
    }

    @Nullable
    public final String component3() {
        return this.area;
    }

    @Nullable
    public final String component4() {
        return this.city;
    }

    @Nullable
    public final String component5() {
        return this.contactAddressId;
    }

    @Nullable
    public final String component6() {
        return this.contactAddressType;
    }

    @Nullable
    public final String component7() {
        return this.country;
    }

    public final boolean component8() {
        return this.isDefaultAddress;
    }

    @Nullable
    public final String component9() {
        return this.extendInfo;
    }

    @NotNull
    public final getMacEncrypt copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, @Nullable String str8, @Nullable String str9, boolean z2, @Nullable String str10) {
        return new getMacEncrypt(str, str2, str3, str4, str5, str6, str7, z, str8, str9, z2, str10);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getMacEncrypt)) {
            return false;
        }
        getMacEncrypt getmacencrypt = (getMacEncrypt) obj;
        return Intrinsics.areEqual((Object) this.address1, (Object) getmacencrypt.address1) && Intrinsics.areEqual((Object) this.address2, (Object) getmacencrypt.address2) && Intrinsics.areEqual((Object) this.area, (Object) getmacencrypt.area) && Intrinsics.areEqual((Object) this.city, (Object) getmacencrypt.city) && Intrinsics.areEqual((Object) this.contactAddressId, (Object) getmacencrypt.contactAddressId) && Intrinsics.areEqual((Object) this.contactAddressType, (Object) getmacencrypt.contactAddressType) && Intrinsics.areEqual((Object) this.country, (Object) getmacencrypt.country) && this.isDefaultAddress == getmacencrypt.isDefaultAddress && Intrinsics.areEqual((Object) this.extendInfo, (Object) getmacencrypt.extendInfo) && Intrinsics.areEqual((Object) this.province, (Object) getmacencrypt.province) && this.isVerified == getmacencrypt.isVerified && Intrinsics.areEqual((Object) this.zipcode, (Object) getmacencrypt.zipcode);
    }

    public final int hashCode() {
        String str = this.address1;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.address2;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.area;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.city;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.contactAddressId;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.contactAddressType;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.country;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        boolean z = this.isDefaultAddress;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode7 + (z ? 1 : 0)) * 31;
        String str8 = this.extendInfo;
        int hashCode8 = (i2 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.province;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        boolean z3 = this.isVerified;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode9 + (z2 ? 1 : 0)) * 31;
        String str10 = this.zipcode;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactAddress(address1=");
        sb.append(this.address1);
        sb.append(", address2=");
        sb.append(this.address2);
        sb.append(", area=");
        sb.append(this.area);
        sb.append(", city=");
        sb.append(this.city);
        sb.append(", contactAddressId=");
        sb.append(this.contactAddressId);
        sb.append(", contactAddressType=");
        sb.append(this.contactAddressType);
        sb.append(", country=");
        sb.append(this.country);
        sb.append(", isDefaultAddress=");
        sb.append(this.isDefaultAddress);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", province=");
        sb.append(this.province);
        sb.append(", isVerified=");
        sb.append(this.isVerified);
        sb.append(", zipcode=");
        sb.append(this.zipcode);
        sb.append(")");
        return sb.toString();
    }

    public getMacEncrypt(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, boolean z, @Nullable String str8, @Nullable String str9, boolean z2, @Nullable String str10) {
        this.address1 = str;
        this.address2 = str2;
        this.area = str3;
        this.city = str4;
        this.contactAddressId = str5;
        this.contactAddressType = str6;
        this.country = str7;
        this.isDefaultAddress = z;
        this.extendInfo = str8;
        this.province = str9;
        this.isVerified = z2;
        this.zipcode = str10;
    }

    @Nullable
    public final String getAddress1() {
        return this.address1;
    }

    public final void setAddress1(@Nullable String str) {
        this.address1 = str;
    }

    @Nullable
    public final String getAddress2() {
        return this.address2;
    }

    public final void setAddress2(@Nullable String str) {
        this.address2 = str;
    }

    @Nullable
    public final String getArea() {
        return this.area;
    }

    public final void setArea(@Nullable String str) {
        this.area = str;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    @Nullable
    public final String getContactAddressId() {
        return this.contactAddressId;
    }

    public final void setContactAddressId(@Nullable String str) {
        this.contactAddressId = str;
    }

    @Nullable
    public final String getContactAddressType() {
        return this.contactAddressType;
    }

    public final void setContactAddressType(@Nullable String str) {
        this.contactAddressType = str;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final boolean isDefaultAddress() {
        return this.isDefaultAddress;
    }

    public final void setDefaultAddress(boolean z) {
        this.isDefaultAddress = z;
    }

    @Nullable
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final void setExtendInfo(@Nullable String str) {
        this.extendInfo = str;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }

    public final void setVerified(boolean z) {
        this.isVerified = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getMacEncrypt(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, java.lang.String r23, java.lang.String r24, boolean r25, java.lang.String r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r14 = this;
            r0 = r27
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r15
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r16
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r17
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0021
            r5 = r2
            goto L_0x0023
        L_0x0021:
            r5 = r18
        L_0x0023:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0029
            r6 = r2
            goto L_0x002b
        L_0x0029:
            r6 = r19
        L_0x002b:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0031
            r7 = r2
            goto L_0x0033
        L_0x0031:
            r7 = r20
        L_0x0033:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0039
            r8 = r2
            goto L_0x003b
        L_0x0039:
            r8 = r21
        L_0x003b:
            r9 = r0 & 128(0x80, float:1.794E-43)
            r10 = 0
            if (r9 == 0) goto L_0x0042
            r9 = 0
            goto L_0x0044
        L_0x0042:
            r9 = r22
        L_0x0044:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004a
            r11 = r2
            goto L_0x004c
        L_0x004a:
            r11 = r23
        L_0x004c:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0052
            r12 = r2
            goto L_0x0054
        L_0x0052:
            r12 = r24
        L_0x0054:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r10 = r25
        L_0x005b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r2 = r26
        L_0x0062:
            r15 = r14
            r16 = r1
            r17 = r3
            r18 = r4
            r19 = r5
            r20 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r24 = r11
            r25 = r12
            r26 = r10
            r27 = r2
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getMacEncrypt.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final String getZipcode() {
        return this.zipcode;
    }

    public final void setZipcode(@Nullable String str) {
        this.zipcode = str;
    }
}
