package o;

import id.dana.data.constant.BranchLinkConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006'"}, d2 = {"Lid/dana/data/config/source/amcs/result/DonationCampaignConfigResult;", "", "enable", "", "title", "", "description", "buttonTitle", "redirectUrl", "action", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getButtonTitle", "setButtonTitle", "getDescription", "setDescription", "getEnable", "()Z", "setEnable", "(Z)V", "getRedirectUrl", "setRedirectUrl", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class performBack {
    @NotNull
    private String action;
    @NotNull
    private String buttonTitle;
    @NotNull
    private String description;
    private boolean enable;
    @NotNull
    private String redirectUrl;
    @NotNull
    private String title;

    public performBack() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ performBack copy$default(performBack performback, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = performback.enable;
        }
        if ((i & 2) != 0) {
            str = performback.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = performback.description;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = performback.buttonTitle;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = performback.redirectUrl;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = performback.action;
        }
        return performback.copy(z, str6, str7, str8, str9, str5);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    @NotNull
    public final String component4() {
        return this.buttonTitle;
    }

    @NotNull
    public final String component5() {
        return this.redirectUrl;
    }

    @NotNull
    public final String component6() {
        return this.action;
    }

    @NotNull
    public final performBack copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "buttonTitle");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str5, "action");
        return new performBack(z, str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof performBack)) {
            return false;
        }
        performBack performback = (performBack) obj;
        return this.enable == performback.enable && Intrinsics.areEqual((Object) this.title, (Object) performback.title) && Intrinsics.areEqual((Object) this.description, (Object) performback.description) && Intrinsics.areEqual((Object) this.buttonTitle, (Object) performback.buttonTitle) && Intrinsics.areEqual((Object) this.redirectUrl, (Object) performback.redirectUrl) && Intrinsics.areEqual((Object) this.action, (Object) performback.action);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.title;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.buttonTitle;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.redirectUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.action;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationCampaignConfigResult(enable=");
        sb.append(this.enable);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", redirectUrl=");
        sb.append(this.redirectUrl);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(")");
        return sb.toString();
    }

    public performBack(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "description");
        Intrinsics.checkNotNullParameter(str3, "buttonTitle");
        Intrinsics.checkNotNullParameter(str4, BranchLinkConstant.OauthParams.REDIRECT_URL);
        Intrinsics.checkNotNullParameter(str5, "action");
        this.enable = z;
        this.title = str;
        this.description = str2;
        this.buttonTitle = str3;
        this.redirectUrl = str4;
        this.action = str5;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final void setButtonTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.buttonTitle = str;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final void setRedirectUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectUrl = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ performBack(boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000b
            java.lang.String r6 = "Sedekah Jadi Berkah"
        L_0x000b:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0012
            java.lang.String r7 = "Are you up for something challenging?"
        L_0x0012:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x0019
            java.lang.String r8 = "Learn More"
        L_0x0019:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0020
            java.lang.String r9 = "https://dana.kitabisa.xyz"
        L_0x0020:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            java.lang.String r10 = "GET"
        L_0x0027:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.performBack.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action = str;
    }
}
