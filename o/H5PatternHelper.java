package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u0006/"}, d2 = {"Lid/dana/domain/profilecompletion/model/ProfileCompletionData;", "", "phoneNumber", "", "nickName", "email", "securityQuestionAvailable", "", "userAvatarUrl", "kycAccepted", "redirect", "username", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getKycAccepted", "()Z", "setKycAccepted", "(Z)V", "getNickName", "setNickName", "getPhoneNumber", "setPhoneNumber", "getRedirect", "setRedirect", "getSecurityQuestionAvailable", "setSecurityQuestionAvailable", "getUserAvatarUrl", "setUserAvatarUrl", "getUsername", "setUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class H5PatternHelper {
    @NotNull
    private String email;
    private boolean kycAccepted;
    @NotNull
    private String nickName;
    @NotNull
    private String phoneNumber;
    @Nullable
    private String redirect;
    private boolean securityQuestionAvailable;
    @NotNull
    private String userAvatarUrl;
    @NotNull
    private String username;

    public H5PatternHelper() {
        this((String) null, (String) null, (String) null, false, (String) null, false, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ H5PatternHelper copy$default(H5PatternHelper h5PatternHelper, String str, String str2, String str3, boolean z, String str4, boolean z2, String str5, String str6, int i, Object obj) {
        H5PatternHelper h5PatternHelper2 = h5PatternHelper;
        int i2 = i;
        return h5PatternHelper.copy((i2 & 1) != 0 ? h5PatternHelper2.phoneNumber : str, (i2 & 2) != 0 ? h5PatternHelper2.nickName : str2, (i2 & 4) != 0 ? h5PatternHelper2.email : str3, (i2 & 8) != 0 ? h5PatternHelper2.securityQuestionAvailable : z, (i2 & 16) != 0 ? h5PatternHelper2.userAvatarUrl : str4, (i2 & 32) != 0 ? h5PatternHelper2.kycAccepted : z2, (i2 & 64) != 0 ? h5PatternHelper2.redirect : str5, (i2 & 128) != 0 ? h5PatternHelper2.username : str6);
    }

    @NotNull
    public final String component1() {
        return this.phoneNumber;
    }

    @NotNull
    public final String component2() {
        return this.nickName;
    }

    @NotNull
    public final String component3() {
        return this.email;
    }

    public final boolean component4() {
        return this.securityQuestionAvailable;
    }

    @NotNull
    public final String component5() {
        return this.userAvatarUrl;
    }

    public final boolean component6() {
        return this.kycAccepted;
    }

    @Nullable
    public final String component7() {
        return this.redirect;
    }

    @NotNull
    public final String component8() {
        return this.username;
    }

    @NotNull
    public final H5PatternHelper copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, boolean z2, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "nickName");
        Intrinsics.checkNotNullParameter(str3, "email");
        Intrinsics.checkNotNullParameter(str4, "userAvatarUrl");
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, setBuildNumber.USERNAME_KEY);
        return new H5PatternHelper(str, str2, str3, z, str4, z2, str5, str7);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5PatternHelper)) {
            return false;
        }
        H5PatternHelper h5PatternHelper = (H5PatternHelper) obj;
        return Intrinsics.areEqual((Object) this.phoneNumber, (Object) h5PatternHelper.phoneNumber) && Intrinsics.areEqual((Object) this.nickName, (Object) h5PatternHelper.nickName) && Intrinsics.areEqual((Object) this.email, (Object) h5PatternHelper.email) && this.securityQuestionAvailable == h5PatternHelper.securityQuestionAvailable && Intrinsics.areEqual((Object) this.userAvatarUrl, (Object) h5PatternHelper.userAvatarUrl) && this.kycAccepted == h5PatternHelper.kycAccepted && Intrinsics.areEqual((Object) this.redirect, (Object) h5PatternHelper.redirect) && Intrinsics.areEqual((Object) this.username, (Object) h5PatternHelper.username);
    }

    public final int hashCode() {
        String str = this.phoneNumber;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.securityQuestionAvailable;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str4 = this.userAvatarUrl;
        int hashCode4 = (i2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z3 = this.kycAccepted;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        String str5 = this.redirect;
        int hashCode5 = (i3 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.username;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCompletionData(phoneNumber=");
        sb.append(this.phoneNumber);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", securityQuestionAvailable=");
        sb.append(this.securityQuestionAvailable);
        sb.append(", userAvatarUrl=");
        sb.append(this.userAvatarUrl);
        sb.append(", kycAccepted=");
        sb.append(this.kycAccepted);
        sb.append(", redirect=");
        sb.append(this.redirect);
        sb.append(", username=");
        sb.append(this.username);
        sb.append(")");
        return sb.toString();
    }

    public H5PatternHelper(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, boolean z2, @Nullable String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "nickName");
        Intrinsics.checkNotNullParameter(str3, "email");
        Intrinsics.checkNotNullParameter(str4, "userAvatarUrl");
        Intrinsics.checkNotNullParameter(str6, setBuildNumber.USERNAME_KEY);
        this.phoneNumber = str;
        this.nickName = str2;
        this.email = str3;
        this.securityQuestionAvailable = z;
        this.userAvatarUrl = str4;
        this.kycAccepted = z2;
        this.redirect = str5;
        this.username = str6;
    }

    @NotNull
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }

    @NotNull
    public final String getNickName() {
        return this.nickName;
    }

    public final void setNickName(@NotNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1930955805, oncanceled);
            onCancelLoad.getMin(-1930955805, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nickName = str;
    }

    @NotNull
    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final boolean getSecurityQuestionAvailable() {
        return this.securityQuestionAvailable;
    }

    public final void setSecurityQuestionAvailable(boolean z) {
        this.securityQuestionAvailable = z;
    }

    @NotNull
    public final String getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    public final void setUserAvatarUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userAvatarUrl = str;
    }

    public final boolean getKycAccepted() {
        return this.kycAccepted;
    }

    public final void setKycAccepted(boolean z) {
        this.kycAccepted = z;
    }

    @Nullable
    public final String getRedirect() {
        return this.redirect;
    }

    public final void setRedirect(@Nullable String str) {
        this.redirect = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ H5PatternHelper(java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13, java.lang.String r14, boolean r15, java.lang.String r16, java.lang.String r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
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
            r6 = 0
            if (r5 == 0) goto L_0x0020
            r5 = 0
            goto L_0x0021
        L_0x0020:
            r5 = r13
        L_0x0021:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0027
            r7 = r2
            goto L_0x0028
        L_0x0027:
            r7 = r14
        L_0x0028:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r6 = r15
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
            r15 = r7
            r16 = r6
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.H5PatternHelper.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public final void setUsername(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.username = str;
    }
}
