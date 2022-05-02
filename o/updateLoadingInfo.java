package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\n\"\u0004\b\u0011\u0010\fR\u0011\u0010\u0012\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\n¨\u0006 "}, d2 = {"Lid/dana/domain/auth/face/result/FaceAuthPopUpConsultationResult;", "", "isFaceLoginFeatureEnabled", "", "isFaceLoginEnabled", "hasFaceLoginEnrolled", "isFaceLoginReady", "alreadyKyc", "(ZZZZZ)V", "getAlreadyKyc", "()Z", "setAlreadyKyc", "(Z)V", "getHasFaceLoginEnrolled", "setHasFaceLoginEnrolled", "setFaceLoginEnabled", "setFaceLoginFeatureEnabled", "setFaceLoginReady", "shouldShowPopUp", "getShouldShowPopUp", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class updateLoadingInfo {
    private boolean alreadyKyc;
    private boolean hasFaceLoginEnrolled;
    private boolean isFaceLoginEnabled;
    private boolean isFaceLoginFeatureEnabled;
    private boolean isFaceLoginReady;

    public updateLoadingInfo() {
        this(false, false, false, false, false, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ updateLoadingInfo copy$default(updateLoadingInfo updateloadinginfo, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateloadinginfo.isFaceLoginFeatureEnabled;
        }
        if ((i & 2) != 0) {
            z2 = updateloadinginfo.isFaceLoginEnabled;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = updateloadinginfo.hasFaceLoginEnrolled;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = updateloadinginfo.isFaceLoginReady;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = updateloadinginfo.alreadyKyc;
        }
        return updateloadinginfo.copy(z, z6, z7, z8, z5);
    }

    public final boolean component1() {
        return this.isFaceLoginFeatureEnabled;
    }

    public final boolean component2() {
        return this.isFaceLoginEnabled;
    }

    public final boolean component3() {
        return this.hasFaceLoginEnrolled;
    }

    public final boolean component4() {
        return this.isFaceLoginReady;
    }

    public final boolean component5() {
        return this.alreadyKyc;
    }

    @NotNull
    public final updateLoadingInfo copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new updateLoadingInfo(z, z2, z3, z4, z5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateLoadingInfo)) {
            return false;
        }
        updateLoadingInfo updateloadinginfo = (updateLoadingInfo) obj;
        return this.isFaceLoginFeatureEnabled == updateloadinginfo.isFaceLoginFeatureEnabled && this.isFaceLoginEnabled == updateloadinginfo.isFaceLoginEnabled && this.hasFaceLoginEnrolled == updateloadinginfo.hasFaceLoginEnrolled && this.isFaceLoginReady == updateloadinginfo.isFaceLoginReady && this.alreadyKyc == updateloadinginfo.alreadyKyc;
    }

    public final int hashCode() {
        boolean z = this.isFaceLoginFeatureEnabled;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.isFaceLoginEnabled;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.hasFaceLoginEnrolled;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isFaceLoginReady;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.alreadyKyc;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FaceAuthPopUpConsultationResult(isFaceLoginFeatureEnabled=");
        sb.append(this.isFaceLoginFeatureEnabled);
        sb.append(", isFaceLoginEnabled=");
        sb.append(this.isFaceLoginEnabled);
        sb.append(", hasFaceLoginEnrolled=");
        sb.append(this.hasFaceLoginEnrolled);
        sb.append(", isFaceLoginReady=");
        sb.append(this.isFaceLoginReady);
        sb.append(", alreadyKyc=");
        sb.append(this.alreadyKyc);
        sb.append(")");
        return sb.toString();
    }

    public updateLoadingInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isFaceLoginFeatureEnabled = z;
        this.isFaceLoginEnabled = z2;
        this.hasFaceLoginEnrolled = z3;
        this.isFaceLoginReady = z4;
        this.alreadyKyc = z5;
    }

    public final boolean isFaceLoginFeatureEnabled() {
        return this.isFaceLoginFeatureEnabled;
    }

    public final void setFaceLoginFeatureEnabled(boolean z) {
        this.isFaceLoginFeatureEnabled = z;
    }

    public final boolean isFaceLoginEnabled() {
        return this.isFaceLoginEnabled;
    }

    public final void setFaceLoginEnabled(boolean z) {
        this.isFaceLoginEnabled = z;
    }

    public final boolean getHasFaceLoginEnrolled() {
        return this.hasFaceLoginEnrolled;
    }

    public final void setHasFaceLoginEnrolled(boolean z) {
        this.hasFaceLoginEnrolled = z;
    }

    public final boolean isFaceLoginReady() {
        return this.isFaceLoginReady;
    }

    public final void setFaceLoginReady(boolean z) {
        this.isFaceLoginReady = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ updateLoadingInfo(boolean r5, boolean r6, boolean r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = 0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = 0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = 0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = 0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.updateLoadingInfo.<init>(boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getAlreadyKyc() {
        return this.alreadyKyc;
    }

    public final void setAlreadyKyc(boolean z) {
        this.alreadyKyc = z;
    }

    public final boolean getShouldShowPopUp() {
        return this.isFaceLoginFeatureEnabled && this.isFaceLoginReady && !this.hasFaceLoginEnrolled;
    }
}
