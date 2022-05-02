package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lid/dana/domain/referral/model/ReferralEngagementDialog;", "", "showDialog", "", "dialogTitleId", "", "dialogTitleEn", "dialogDescriptionId", "dialogDescriptionEn", "timerDuration", "", "scenario", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getDialogDescriptionEn", "()Ljava/lang/String;", "getDialogDescriptionId", "getDialogTitleEn", "getDialogTitleId", "getScenario", "getShowDialog", "()Z", "getTimerDuration", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getComponentAuth {
    @NotNull
    private final String dialogDescriptionEn;
    @NotNull
    private final String dialogDescriptionId;
    @NotNull
    private final String dialogTitleEn;
    @NotNull
    private final String dialogTitleId;
    @NotNull
    private final String scenario;
    private final boolean showDialog;
    private final long timerDuration;

    public getComponentAuth() {
        this(false, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getComponentAuth copy$default(getComponentAuth getcomponentauth, boolean z, String str, String str2, String str3, String str4, long j, String str5, int i, Object obj) {
        getComponentAuth getcomponentauth2 = getcomponentauth;
        return getcomponentauth.copy((i & 1) != 0 ? getcomponentauth2.showDialog : z, (i & 2) != 0 ? getcomponentauth2.dialogTitleId : str, (i & 4) != 0 ? getcomponentauth2.dialogTitleEn : str2, (i & 8) != 0 ? getcomponentauth2.dialogDescriptionId : str3, (i & 16) != 0 ? getcomponentauth2.dialogDescriptionEn : str4, (i & 32) != 0 ? getcomponentauth2.timerDuration : j, (i & 64) != 0 ? getcomponentauth2.scenario : str5);
    }

    public final boolean component1() {
        return this.showDialog;
    }

    @NotNull
    public final String component2() {
        return this.dialogTitleId;
    }

    @NotNull
    public final String component3() {
        return this.dialogTitleEn;
    }

    @NotNull
    public final String component4() {
        return this.dialogDescriptionId;
    }

    @NotNull
    public final String component5() {
        return this.dialogDescriptionEn;
    }

    public final long component6() {
        return this.timerDuration;
    }

    @NotNull
    public final String component7() {
        return this.scenario;
    }

    @NotNull
    public final getComponentAuth copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "dialogTitleId");
        Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
        Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
        Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "scenario");
        return new getComponentAuth(z, str, str2, str3, str4, j, str6);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getComponentAuth)) {
            return false;
        }
        getComponentAuth getcomponentauth = (getComponentAuth) obj;
        return this.showDialog == getcomponentauth.showDialog && Intrinsics.areEqual((Object) this.dialogTitleId, (Object) getcomponentauth.dialogTitleId) && Intrinsics.areEqual((Object) this.dialogTitleEn, (Object) getcomponentauth.dialogTitleEn) && Intrinsics.areEqual((Object) this.dialogDescriptionId, (Object) getcomponentauth.dialogDescriptionId) && Intrinsics.areEqual((Object) this.dialogDescriptionEn, (Object) getcomponentauth.dialogDescriptionEn) && this.timerDuration == getcomponentauth.timerDuration && Intrinsics.areEqual((Object) this.scenario, (Object) getcomponentauth.scenario);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralEngagementDialog(showDialog=");
        sb.append(this.showDialog);
        sb.append(", dialogTitleId=");
        sb.append(this.dialogTitleId);
        sb.append(", dialogTitleEn=");
        sb.append(this.dialogTitleEn);
        sb.append(", dialogDescriptionId=");
        sb.append(this.dialogDescriptionId);
        sb.append(", dialogDescriptionEn=");
        sb.append(this.dialogDescriptionEn);
        sb.append(", timerDuration=");
        sb.append(this.timerDuration);
        sb.append(", scenario=");
        sb.append(this.scenario);
        sb.append(")");
        return sb.toString();
    }

    public getComponentAuth(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "dialogTitleId");
        Intrinsics.checkNotNullParameter(str2, "dialogTitleEn");
        Intrinsics.checkNotNullParameter(str3, "dialogDescriptionId");
        Intrinsics.checkNotNullParameter(str4, "dialogDescriptionEn");
        Intrinsics.checkNotNullParameter(str5, "scenario");
        this.showDialog = z;
        this.dialogTitleId = str;
        this.dialogTitleEn = str2;
        this.dialogDescriptionId = str3;
        this.dialogDescriptionEn = str4;
        this.timerDuration = j;
        this.scenario = str5;
    }

    @NotNull
    public final String getDialogTitleId() {
        return this.dialogTitleId;
    }

    public final boolean getShowDialog() {
        return this.showDialog;
    }

    @NotNull
    public final String getDialogTitleEn() {
        return this.dialogTitleEn;
    }

    @NotNull
    public final String getDialogDescriptionId() {
        return this.dialogDescriptionId;
    }

    @NotNull
    public final String getDialogDescriptionEn() {
        return this.dialogDescriptionEn;
    }

    public final long getTimerDuration() {
        return this.timerDuration;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getComponentAuth(boolean r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14, java.lang.String r16, int r17, kotlin.jvm.internal.DefaultConstructorMarker r18) {
        /*
            r8 = this;
            r0 = r17 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r9
        L_0x0007:
            r1 = r17 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000f
            r1 = r2
            goto L_0x0010
        L_0x000f:
            r1 = r10
        L_0x0010:
            r3 = r17 & 4
            if (r3 == 0) goto L_0x0016
            r3 = r2
            goto L_0x0017
        L_0x0016:
            r3 = r11
        L_0x0017:
            r4 = r17 & 8
            if (r4 == 0) goto L_0x001d
            r4 = r2
            goto L_0x001e
        L_0x001d:
            r4 = r12
        L_0x001e:
            r5 = r17 & 16
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r13
        L_0x0024:
            r5 = r17 & 32
            if (r5 == 0) goto L_0x002b
            r5 = -1
            goto L_0x002c
        L_0x002b:
            r5 = r14
        L_0x002c:
            r7 = r17 & 64
            if (r7 == 0) goto L_0x0033
            java.lang.String r7 = "NPS"
            goto L_0x0035
        L_0x0033:
            r7 = r16
        L_0x0035:
            r9 = r8
            r10 = r0
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r2
            r15 = r5
            r17 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getComponentAuth.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final String getScenario() {
        return this.scenario;
    }

    public final int hashCode() {
        boolean z = this.showDialog;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.dialogTitleId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.dialogTitleEn;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.dialogDescriptionId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.dialogDescriptionEn;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.valueOf(this.timerDuration).hashCode()) * 31;
        String str5 = this.scenario;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode4 + i2;
    }
}
