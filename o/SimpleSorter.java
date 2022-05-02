package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lid/dana/data/qrbarcode/repository/source/network/result/QrDetail;", "", "qrCode", "", "expireDateTimestamp", "", "expireTimeInSeconds", "qris", "", "(Ljava/lang/String;JJZ)V", "getExpireDateTimestamp", "()J", "setExpireDateTimestamp", "(J)V", "getExpireTimeInSeconds", "setExpireTimeInSeconds", "getQrCode", "()Ljava/lang/String;", "setQrCode", "(Ljava/lang/String;)V", "getQris", "()Z", "setQris", "(Z)V", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SimpleSorter {
    private long expireDateTimestamp;
    private long expireTimeInSeconds;
    @NotNull
    private String qrCode;
    private boolean qris;

    public SimpleSorter(@NotNull String str, long j, long j2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "qrCode");
        this.qrCode = str;
        this.expireDateTimestamp = j;
        this.expireTimeInSeconds = j2;
        this.qris = z;
    }

    @NotNull
    public final String getQrCode() {
        return this.qrCode;
    }

    public final void setQrCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.qrCode = str;
    }

    public final long getExpireDateTimestamp() {
        return this.expireDateTimestamp;
    }

    public final void setExpireDateTimestamp(long j) {
        this.expireDateTimestamp = j;
    }

    public final long getExpireTimeInSeconds() {
        return this.expireTimeInSeconds;
    }

    public final void setExpireTimeInSeconds(long j) {
        this.expireTimeInSeconds = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SimpleSorter(java.lang.String r6, long r7, long r9, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r5 = this;
            r0 = r12 & 2
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r7
        L_0x0009:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r1 = r9
        L_0x000f:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x0015
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = r11
        L_0x0016:
            r7 = r5
            r8 = r6
            r9 = r3
            r11 = r1
            r13 = r0
            r7.<init>(r8, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SimpleSorter.<init>(java.lang.String, long, long, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getQris() {
        return this.qris;
    }

    public final void setQris(boolean z) {
        this.qris = z;
    }
}
