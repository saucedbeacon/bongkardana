package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b>\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B«\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0013J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¯\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001J\u0013\u0010E\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0019\"\u0004\b&\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0019\"\u0004\b,\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010\u001bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0019\"\u0004\b0\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u0010\u001b¨\u0006K"}, d2 = {"Lid/dana/data/authcode/AuthRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "redirectUrl", "", "clientId", "scopes", "state", "agreed", "", "requestId", "securityId", "codeChallenge", "requestSourceType", "netAuthId", "subMerchantId", "signatureCode", "originalAuthUrl", "isNeedMobileToken", "miniProgram", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getAgreed", "()Z", "setAgreed", "(Z)V", "getClientId", "()Ljava/lang/String;", "setClientId", "(Ljava/lang/String;)V", "getCodeChallenge", "setCodeChallenge", "setNeedMobileToken", "getMiniProgram", "setMiniProgram", "getNetAuthId", "setNetAuthId", "getOriginalAuthUrl", "setOriginalAuthUrl", "getRedirectUrl", "setRedirectUrl", "getRequestId", "setRequestId", "getRequestSourceType", "setRequestSourceType", "getScopes", "setScopes", "getSecurityId", "setSecurityId", "getSignatureCode", "setSignatureCode", "getState", "setState", "getSubMerchantId", "setSubMerchantId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class waitForWidth extends BaseRpcRequest {
    private boolean agreed;
    @NotNull
    private String clientId;
    @Nullable
    private String codeChallenge;
    private boolean isNeedMobileToken;
    private boolean miniProgram;
    @Nullable
    private String netAuthId;
    @Nullable
    private String originalAuthUrl;
    @NotNull
    private String redirectUrl;
    @Nullable
    private String requestId;
    @Nullable
    private String requestSourceType;
    @NotNull
    private String scopes;
    @Nullable
    private String securityId;
    @Nullable
    private String signatureCode;
    @NotNull
    private String state;
    @Nullable
    private String subMerchantId;

    public waitForWidth() {
        this((String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false, 32767, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ waitForWidth copy$default(waitForWidth waitforwidth, String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z2, boolean z3, int i, Object obj) {
        waitForWidth waitforwidth2 = waitforwidth;
        int i2 = i;
        return waitforwidth.copy((i2 & 1) != 0 ? waitforwidth2.redirectUrl : str, (i2 & 2) != 0 ? waitforwidth2.clientId : str2, (i2 & 4) != 0 ? waitforwidth2.scopes : str3, (i2 & 8) != 0 ? waitforwidth2.state : str4, (i2 & 16) != 0 ? waitforwidth2.agreed : z, (i2 & 32) != 0 ? waitforwidth2.requestId : str5, (i2 & 64) != 0 ? waitforwidth2.securityId : str6, (i2 & 128) != 0 ? waitforwidth2.codeChallenge : str7, (i2 & 256) != 0 ? waitforwidth2.requestSourceType : str8, (i2 & 512) != 0 ? waitforwidth2.netAuthId : str9, (i2 & 1024) != 0 ? waitforwidth2.subMerchantId : str10, (i2 & 2048) != 0 ? waitforwidth2.signatureCode : str11, (i2 & 4096) != 0 ? waitforwidth2.originalAuthUrl : str12, (i2 & 8192) != 0 ? waitforwidth2.isNeedMobileToken : z2, (i2 & 16384) != 0 ? waitforwidth2.miniProgram : z3);
    }

    @NotNull
    public final String component1() {
        return this.redirectUrl;
    }

    @Nullable
    public final String component10() {
        return this.netAuthId;
    }

    @Nullable
    public final String component11() {
        return this.subMerchantId;
    }

    @Nullable
    public final String component12() {
        return this.signatureCode;
    }

    @Nullable
    public final String component13() {
        return this.originalAuthUrl;
    }

    public final boolean component14() {
        return this.isNeedMobileToken;
    }

    public final boolean component15() {
        return this.miniProgram;
    }

    @NotNull
    public final String component2() {
        return this.clientId;
    }

    @NotNull
    public final String component3() {
        return this.scopes;
    }

    @NotNull
    public final String component4() {
        return this.state;
    }

    public final boolean component5() {
        return this.agreed;
    }

    @Nullable
    public final String component6() {
        return this.requestId;
    }

    @Nullable
    public final String component7() {
        return this.securityId;
    }

    @Nullable
    public final String component8() {
        return this.codeChallenge;
    }

    @Nullable
    public final String component9() {
        return this.requestSourceType;
    }

    @NotNull
    public final waitForWidth copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z2, boolean z3) {
        String str13 = str;
        Intrinsics.checkNotNullParameter(str13, BranchLinkConstant.OauthParams.REDIRECT_URL);
        String str14 = str2;
        Intrinsics.checkNotNullParameter(str14, "clientId");
        String str15 = str3;
        Intrinsics.checkNotNullParameter(str15, BranchLinkConstant.OauthParams.SCOPES);
        String str16 = str4;
        Intrinsics.checkNotNullParameter(str16, "state");
        return new waitForWidth(str13, str14, str15, str16, z, str5, str6, str7, str8, str9, str10, str11, str12, z2, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof waitForWidth)) {
            return false;
        }
        waitForWidth waitforwidth = (waitForWidth) obj;
        return Intrinsics.areEqual((Object) this.redirectUrl, (Object) waitforwidth.redirectUrl) && Intrinsics.areEqual((Object) this.clientId, (Object) waitforwidth.clientId) && Intrinsics.areEqual((Object) this.scopes, (Object) waitforwidth.scopes) && Intrinsics.areEqual((Object) this.state, (Object) waitforwidth.state) && this.agreed == waitforwidth.agreed && Intrinsics.areEqual((Object) this.requestId, (Object) waitforwidth.requestId) && Intrinsics.areEqual((Object) this.securityId, (Object) waitforwidth.securityId) && Intrinsics.areEqual((Object) this.codeChallenge, (Object) waitforwidth.codeChallenge) && Intrinsics.areEqual((Object) this.requestSourceType, (Object) waitforwidth.requestSourceType) && Intrinsics.areEqual((Object) this.netAuthId, (Object) waitforwidth.netAuthId) && Intrinsics.areEqual((Object) this.subMerchantId, (Object) waitforwidth.subMerchantId) && Intrinsics.areEqual((Object) this.signatureCode, (Object) waitforwidth.signatureCode) && Intrinsics.areEqual((Object) this.originalAuthUrl, (Object) waitforwidth.originalAuthUrl) && this.isNeedMobileToken == waitforwidth.isNeedMobileToken && this.miniProgram == waitforwidth.miniProgram;
    }

    public final int hashCode() {
        String str = this.redirectUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.clientId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scopes;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.agreed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str5 = this.requestId;
        int hashCode5 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.securityId;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.codeChallenge;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.requestSourceType;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.netAuthId;
        int hashCode9 = (hashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.subMerchantId;
        int hashCode10 = (hashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.signatureCode;
        int hashCode11 = (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.originalAuthUrl;
        if (str12 != null) {
            i = str12.hashCode();
        }
        int i3 = (hashCode11 + i) * 31;
        boolean z3 = this.isNeedMobileToken;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.miniProgram;
        if (!z4) {
            z2 = z4;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRequest(redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", clientId=");
        sb.append(this.clientId);
        sb.append(", scopes=");
        sb.append(this.scopes);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", agreed=");
        sb.append(this.agreed);
        sb.append(", requestId=");
        sb.append(this.requestId);
        sb.append(", securityId=");
        sb.append(this.securityId);
        sb.append(", codeChallenge=");
        sb.append(this.codeChallenge);
        sb.append(", requestSourceType=");
        sb.append(this.requestSourceType);
        sb.append(", netAuthId=");
        sb.append(this.netAuthId);
        sb.append(", subMerchantId=");
        sb.append(this.subMerchantId);
        sb.append(", signatureCode=");
        sb.append(this.signatureCode);
        sb.append(", originalAuthUrl=");
        sb.append(this.originalAuthUrl);
        sb.append(", isNeedMobileToken=");
        sb.append(this.isNeedMobileToken);
        sb.append(", miniProgram=");
        sb.append(this.miniProgram);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectUrl = str;
    }

    @NotNull
    public final String getClientId() {
        return this.clientId;
    }

    public final void setClientId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clientId = str;
    }

    @NotNull
    public final String getScopes() {
        return this.scopes;
    }

    public final void setScopes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.scopes = str;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final void setState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state = str;
    }

    public final boolean getAgreed() {
        return this.agreed;
    }

    public final void setAgreed(boolean z) {
        this.agreed = z;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public final void setRequestId(@Nullable String str) {
        this.requestId = str;
    }

    @Nullable
    public final String getSecurityId() {
        return this.securityId;
    }

    public final void setSecurityId(@Nullable String str) {
        this.securityId = str;
    }

    @Nullable
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final void setCodeChallenge(@Nullable String str) {
        this.codeChallenge = str;
    }

    @Nullable
    public final String getRequestSourceType() {
        return this.requestSourceType;
    }

    public final void setRequestSourceType(@Nullable String str) {
        this.requestSourceType = str;
    }

    @Nullable
    public final String getNetAuthId() {
        return this.netAuthId;
    }

    public final void setNetAuthId(@Nullable String str) {
        this.netAuthId = str;
    }

    @Nullable
    public final String getSubMerchantId() {
        return this.subMerchantId;
    }

    public final void setSubMerchantId(@Nullable String str) {
        this.subMerchantId = str;
    }

    @Nullable
    public final String getSignatureCode() {
        return this.signatureCode;
    }

    public final void setSignatureCode(@Nullable String str) {
        this.signatureCode = str;
    }

    @Nullable
    public final String getOriginalAuthUrl() {
        return this.originalAuthUrl;
    }

    public final void setOriginalAuthUrl(@Nullable String str) {
        this.originalAuthUrl = str;
    }

    public final boolean isNeedMobileToken() {
        return this.isNeedMobileToken;
    }

    public final void setNeedMobileToken(boolean z) {
        this.isNeedMobileToken = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ waitForWidth(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
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
            if (r5 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r2 = r20
        L_0x0023:
            r5 = r0 & 16
            r6 = 0
            if (r5 == 0) goto L_0x002a
            r5 = 0
            goto L_0x002c
        L_0x002a:
            r5 = r21
        L_0x002c:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0033
            r7 = r8
            goto L_0x0035
        L_0x0033:
            r7 = r22
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = r8
            goto L_0x003d
        L_0x003b:
            r9 = r23
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0043
            r10 = r8
            goto L_0x0045
        L_0x0043:
            r10 = r24
        L_0x0045:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004b
            r11 = r8
            goto L_0x004d
        L_0x004b:
            r11 = r25
        L_0x004d:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0053
            r12 = r8
            goto L_0x0055
        L_0x0053:
            r12 = r26
        L_0x0055:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x005b
            r13 = r8
            goto L_0x005d
        L_0x005b:
            r13 = r27
        L_0x005d:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x0063
            r14 = r8
            goto L_0x0065
        L_0x0063:
            r14 = r28
        L_0x0065:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r8 = r29
        L_0x006c:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x0072
            r15 = 0
            goto L_0x0074
        L_0x0072:
            r15 = r30
        L_0x0074:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r6 = r31
        L_0x007b:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r2
            r22 = r5
            r23 = r7
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r8
            r31 = r15
            r32 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.waitForWidth.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getMiniProgram() {
        return this.miniProgram;
    }

    public final void setMiniProgram(boolean z) {
        this.miniProgram = z;
    }

    public waitForWidth(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str2, "clientId");
        Intrinsics.checkNotNullParameter(str3, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(str4, "state");
        this.redirectUrl = str;
        this.clientId = str2;
        this.scopes = str3;
        this.state = str4;
        this.agreed = z;
        this.requestId = str5;
        this.securityId = str6;
        this.codeChallenge = str7;
        this.requestSourceType = str8;
        this.netAuthId = str9;
        this.subMerchantId = str10;
        this.signatureCode = str11;
        this.originalAuthUrl = str12;
        this.isNeedMobileToken = z2;
        this.miniProgram = z3;
    }
}
