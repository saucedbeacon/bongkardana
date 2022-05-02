package o;

import id.dana.data.constant.BranchLinkConstant;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n¢\u0006\u0002\u0010\rJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003Jc\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\nHÆ\u0001J\u0013\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000f\"\u0004\b\u001c\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015¨\u00062"}, d2 = {"Lid/dana/sendmoney_v2/model/BillerX2BModel;", "", "billerName", "", "instId", "prefix", "clientId", "redirectUrl", "scopes", "agreed", "", "customerNumber", "isRecents", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "getAgreed", "()Z", "setAgreed", "(Z)V", "getBillerName", "()Ljava/lang/String;", "setBillerName", "(Ljava/lang/String;)V", "getClientId", "setClientId", "getCustomerNumber", "setCustomerNumber", "getInstId", "setInstId", "setRecents", "getPrefix", "setPrefix", "getRedirectUrl", "setRedirectUrl", "getScopes", "setScopes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrX {
    public boolean IsOverlapping;
    @NotNull
    public String getMax;
    @NotNull
    public String getMin;
    @NotNull
    public String isInside;
    @NotNull
    public String length;
    @NotNull
    public String setMax;
    @NotNull
    public String setMin;
    private boolean toFloatRange;
    @NotNull
    private String toIntRange;

    public getCurrX() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, 511);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrX)) {
            return false;
        }
        getCurrX getcurrx = (getCurrX) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) getcurrx.setMin) && Intrinsics.areEqual((Object) this.toIntRange, (Object) getcurrx.toIntRange) && Intrinsics.areEqual((Object) this.setMax, (Object) getcurrx.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) getcurrx.getMin) && Intrinsics.areEqual((Object) this.getMax, (Object) getcurrx.getMax) && Intrinsics.areEqual((Object) this.length, (Object) getcurrx.length) && this.toFloatRange == getcurrx.toFloatRange && Intrinsics.areEqual((Object) this.isInside, (Object) getcurrx.isInside) && this.IsOverlapping == getcurrx.IsOverlapping;
    }

    public final int hashCode() {
        String str = this.setMin;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.toIntRange;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.setMax;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.getMin;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.getMax;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.length;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z = this.toFloatRange;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode6 + (z ? 1 : 0)) * 31;
        String str7 = this.isInside;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.IsOverlapping;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BillerX2BModel(billerName=");
        sb.append(this.setMin);
        sb.append(", instId=");
        sb.append(this.toIntRange);
        sb.append(", prefix=");
        sb.append(this.setMax);
        sb.append(", clientId=");
        sb.append(this.getMin);
        sb.append(", redirectUrl=");
        sb.append(this.getMax);
        sb.append(", scopes=");
        sb.append(this.length);
        sb.append(", agreed=");
        sb.append(this.toFloatRange);
        sb.append(", customerNumber=");
        sb.append(this.isInside);
        sb.append(", isRecents=");
        sb.append(this.IsOverlapping);
        sb.append(")");
        return sb.toString();
    }

    private getCurrX(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "billerName");
        Intrinsics.checkNotNullParameter(str2, UrlTag.INSTID);
        Intrinsics.checkNotNullParameter(str3, "prefix");
        Intrinsics.checkNotNullParameter(str4, "clientId");
        Intrinsics.checkNotNullParameter(str5, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str6, BranchLinkConstant.OauthParams.SCOPES);
        Intrinsics.checkNotNullParameter(str7, "customerNumber");
        this.setMin = str;
        this.toIntRange = str2;
        this.setMax = str3;
        this.getMin = str4;
        this.getMax = str5;
        this.length = str6;
        this.toFloatRange = z;
        this.isInside = str7;
        this.IsOverlapping = false;
    }

    public final boolean getMin() {
        return this.toFloatRange;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getCurrX(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, int r18) {
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
            r8 = 0
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
        throw new UnsupportedOperationException("Method not decompiled: o.getCurrX.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int):void");
    }

    public final boolean setMax() {
        return this.IsOverlapping;
    }
}
