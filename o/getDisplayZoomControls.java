package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lid/dana/domain/donation/model/DonationCampaign;", "", "aggregator", "", "fundRaiserName", "verified", "", "backgroundImage", "redirectType", "title", "redirectValue", "Lid/dana/domain/donation/model/RedirectValue;", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lid/dana/domain/donation/model/RedirectValue;)V", "getAggregator", "()Ljava/lang/String;", "setAggregator", "(Ljava/lang/String;)V", "getBackgroundImage", "setBackgroundImage", "getFundRaiserName", "setFundRaiserName", "getRedirectType", "setRedirectType", "getRedirectValue", "()Lid/dana/domain/donation/model/RedirectValue;", "setRedirectValue", "(Lid/dana/domain/donation/model/RedirectValue;)V", "getTitle", "setTitle", "getVerified", "()Z", "setVerified", "(Z)V", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDisplayZoomControls {
    @NotNull
    private String aggregator;
    @NotNull
    private String backgroundImage;
    @NotNull
    private String fundRaiserName;
    @NotNull
    private String redirectType;
    @NotNull
    private getAllowFileAccess redirectValue;
    @NotNull
    private String title;
    private boolean verified;

    public getDisplayZoomControls() {
        this((String) null, (String) null, false, (String) null, (String) null, (String) null, (getAllowFileAccess) null, 127, (DefaultConstructorMarker) null);
    }

    public getDisplayZoomControls(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull getAllowFileAccess getallowfileaccess) {
        Intrinsics.checkNotNullParameter(str, "aggregator");
        Intrinsics.checkNotNullParameter(str2, "fundRaiserName");
        Intrinsics.checkNotNullParameter(str3, "backgroundImage");
        Intrinsics.checkNotNullParameter(str4, "redirectType");
        Intrinsics.checkNotNullParameter(str5, "title");
        Intrinsics.checkNotNullParameter(getallowfileaccess, "redirectValue");
        this.aggregator = str;
        this.fundRaiserName = str2;
        this.verified = z;
        this.backgroundImage = str3;
        this.redirectType = str4;
        this.title = str5;
        this.redirectValue = getallowfileaccess;
    }

    @NotNull
    public final String getAggregator() {
        return this.aggregator;
    }

    public final void setAggregator(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aggregator = str;
    }

    @NotNull
    public final String getFundRaiserName() {
        return this.fundRaiserName;
    }

    public final void setFundRaiserName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fundRaiserName = str;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }

    @NotNull
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final void setBackgroundImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backgroundImage = str;
    }

    @NotNull
    public final String getRedirectType() {
        return this.redirectType;
    }

    public final void setRedirectType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.redirectType = str;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getDisplayZoomControls(java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, o.getAllowFileAccess r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r7
        L_0x0010:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x0017
            r8 = 0
            r2 = 0
            goto L_0x0018
        L_0x0017:
            r2 = r8
        L_0x0018:
            r6 = r13 & 8
            if (r6 == 0) goto L_0x001e
            r3 = r0
            goto L_0x001f
        L_0x001e:
            r3 = r9
        L_0x001f:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0025
            r4 = r0
            goto L_0x0026
        L_0x0025:
            r4 = r10
        L_0x0026:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r11
        L_0x002c:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x003f
            o.getAllowFileAccess r6 = new o.getAllowFileAccess
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 15
            r13 = 0
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r13 = r6
            goto L_0x0040
        L_0x003f:
            r13 = r12
        L_0x0040:
            r6 = r5
            r7 = r14
            r8 = r1
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDisplayZoomControls.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, o.getAllowFileAccess, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final getAllowFileAccess getRedirectValue() {
        return this.redirectValue;
    }

    public final void setRedirectValue(@NotNull getAllowFileAccess getallowfileaccess) {
        Intrinsics.checkNotNullParameter(getallowfileaccess, "<set-?>");
        this.redirectValue = getallowfileaccess;
    }
}
