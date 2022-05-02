package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.danah5.bioutility.BioUtilityBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JY\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000f¨\u0006."}, d2 = {"Lid/dana/data/bokuverification/source/network/VerifySecurityProductRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "securityId", "", "verificationMethod", "validateData", "sendStrategy", "sendOtpStrategy", "userIdType", "correlationId", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCorrelationId", "()Ljava/lang/String;", "setCorrelationId", "(Ljava/lang/String;)V", "getPhoneNumber", "setPhoneNumber", "getSecurityId", "setSecurityId", "getSendOtpStrategy", "setSendOtpStrategy", "getSendStrategy", "setSendStrategy", "getUserIdType", "setUserIdType", "getValidateData", "setValidateData", "getVerificationMethod", "setVerificationMethod", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTextDelegate extends BaseRpcRequest {
    @NotNull
    private String correlationId;
    @NotNull
    private String phoneNumber;
    @NotNull
    private String securityId;
    @NotNull
    private String sendOtpStrategy;
    @NotNull
    private String sendStrategy;
    @NotNull
    private String userIdType;
    @NotNull
    private String validateData;
    @NotNull
    private String verificationMethod;

    public setTextDelegate() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setTextDelegate copy$default(setTextDelegate settextdelegate, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        setTextDelegate settextdelegate2 = settextdelegate;
        int i2 = i;
        return settextdelegate.copy((i2 & 1) != 0 ? settextdelegate2.securityId : str, (i2 & 2) != 0 ? settextdelegate2.verificationMethod : str2, (i2 & 4) != 0 ? settextdelegate2.validateData : str3, (i2 & 8) != 0 ? settextdelegate2.sendStrategy : str4, (i2 & 16) != 0 ? settextdelegate2.sendOtpStrategy : str5, (i2 & 32) != 0 ? settextdelegate2.userIdType : str6, (i2 & 64) != 0 ? settextdelegate2.correlationId : str7, (i2 & 128) != 0 ? settextdelegate2.phoneNumber : str8);
    }

    @NotNull
    public final String component1() {
        return this.securityId;
    }

    @NotNull
    public final String component2() {
        return this.verificationMethod;
    }

    @NotNull
    public final String component3() {
        return this.validateData;
    }

    @NotNull
    public final String component4() {
        return this.sendStrategy;
    }

    @NotNull
    public final String component5() {
        return this.sendOtpStrategy;
    }

    @NotNull
    public final String component6() {
        return this.userIdType;
    }

    @NotNull
    public final String component7() {
        return this.correlationId;
    }

    @NotNull
    public final String component8() {
        return this.phoneNumber;
    }

    @NotNull
    public final setTextDelegate copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, "validateData");
        Intrinsics.checkNotNullParameter(str4, "sendStrategy");
        Intrinsics.checkNotNullParameter(str5, "sendOtpStrategy");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "userIdType");
        String str10 = str7;
        Intrinsics.checkNotNullParameter(str10, "correlationId");
        String str11 = str8;
        Intrinsics.checkNotNullParameter(str11, "phoneNumber");
        return new setTextDelegate(str, str2, str3, str4, str5, str9, str10, str11);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setTextDelegate)) {
            return false;
        }
        setTextDelegate settextdelegate = (setTextDelegate) obj;
        return Intrinsics.areEqual((Object) this.securityId, (Object) settextdelegate.securityId) && Intrinsics.areEqual((Object) this.verificationMethod, (Object) settextdelegate.verificationMethod) && Intrinsics.areEqual((Object) this.validateData, (Object) settextdelegate.validateData) && Intrinsics.areEqual((Object) this.sendStrategy, (Object) settextdelegate.sendStrategy) && Intrinsics.areEqual((Object) this.sendOtpStrategy, (Object) settextdelegate.sendOtpStrategy) && Intrinsics.areEqual((Object) this.userIdType, (Object) settextdelegate.userIdType) && Intrinsics.areEqual((Object) this.correlationId, (Object) settextdelegate.correlationId) && Intrinsics.areEqual((Object) this.phoneNumber, (Object) settextdelegate.phoneNumber);
    }

    public final int hashCode() {
        String str = this.securityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.verificationMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.validateData;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sendStrategy;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.sendOtpStrategy;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.userIdType;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.correlationId;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.phoneNumber;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode7 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifySecurityProductRequest(securityId=");
        sb.append(this.securityId);
        sb.append(", verificationMethod=");
        sb.append(this.verificationMethod);
        sb.append(", validateData=");
        sb.append(this.validateData);
        sb.append(", sendStrategy=");
        sb.append(this.sendStrategy);
        sb.append(", sendOtpStrategy=");
        sb.append(this.sendOtpStrategy);
        sb.append(", userIdType=");
        sb.append(this.userIdType);
        sb.append(", correlationId=");
        sb.append(this.correlationId);
        sb.append(", phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.securityId = str;
    }

    @NotNull
    public final String getVerificationMethod() {
        return this.verificationMethod;
    }

    public final void setVerificationMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.verificationMethod = str;
    }

    @NotNull
    public final String getValidateData() {
        return this.validateData;
    }

    public final void setValidateData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validateData = str;
    }

    @NotNull
    public final String getSendStrategy() {
        return this.sendStrategy;
    }

    public final void setSendStrategy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sendStrategy = str;
    }

    @NotNull
    public final String getSendOtpStrategy() {
        return this.sendOtpStrategy;
    }

    public final void setSendOtpStrategy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sendOtpStrategy = str;
    }

    @NotNull
    public final String getUserIdType() {
        return this.userIdType;
    }

    public final void setUserIdType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userIdType = str;
    }

    @NotNull
    public final String getCorrelationId() {
        return this.correlationId;
    }

    public final void setCorrelationId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.correlationId = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ setTextDelegate(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r10
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r11
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r12
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r13
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0027
        L_0x0026:
            r6 = r14
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002e
        L_0x002d:
            r7 = r15
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r16
        L_0x0036:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r2 = r17
        L_0x003d:
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
        throw new UnsupportedOperationException("Method not decompiled: o.setTextDelegate.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    public setTextDelegate(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8) {
        Intrinsics.checkNotNullParameter(str, BioUtilityBridge.SECURITY_ID);
        Intrinsics.checkNotNullParameter(str2, "verificationMethod");
        Intrinsics.checkNotNullParameter(str3, "validateData");
        Intrinsics.checkNotNullParameter(str4, "sendStrategy");
        Intrinsics.checkNotNullParameter(str5, "sendOtpStrategy");
        Intrinsics.checkNotNullParameter(str6, "userIdType");
        Intrinsics.checkNotNullParameter(str7, "correlationId");
        Intrinsics.checkNotNullParameter(str8, "phoneNumber");
        this.securityId = str;
        this.verificationMethod = str2;
        this.validateData = str3;
        this.sendStrategy = str4;
        this.sendOtpStrategy = str5;
        this.userIdType = str6;
        this.correlationId = str7;
        this.phoneNumber = str8;
    }
}
