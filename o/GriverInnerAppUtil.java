package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverExecutors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/kycrenewal/model/QueryKYCUserData;", "", "succes", "", "userInfo", "Lid/dana/domain/kycrenewal/model/KYCRenewalUserInfo;", "(ZLid/dana/domain/kycrenewal/model/KYCRenewalUserInfo;)V", "getSucces", "()Z", "getUserInfo", "()Lid/dana/domain/kycrenewal/model/KYCRenewalUserInfo;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class GriverInnerAppUtil {
    private final boolean succes;
    @Nullable
    private final GriverExecutors.DiscardOldestPolicy userInfo;

    public static /* synthetic */ GriverInnerAppUtil copy$default(GriverInnerAppUtil griverInnerAppUtil, boolean z, GriverExecutors.DiscardOldestPolicy discardOldestPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            z = griverInnerAppUtil.succes;
        }
        if ((i & 2) != 0) {
            discardOldestPolicy = griverInnerAppUtil.userInfo;
        }
        return griverInnerAppUtil.copy(z, discardOldestPolicy);
    }

    public final boolean component1() {
        return this.succes;
    }

    @Nullable
    public final GriverExecutors.DiscardOldestPolicy component2() {
        return this.userInfo;
    }

    @NotNull
    public final GriverInnerAppUtil copy(boolean z, @Nullable GriverExecutors.DiscardOldestPolicy discardOldestPolicy) {
        return new GriverInnerAppUtil(z, discardOldestPolicy);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GriverInnerAppUtil)) {
            return false;
        }
        GriverInnerAppUtil griverInnerAppUtil = (GriverInnerAppUtil) obj;
        return this.succes == griverInnerAppUtil.succes && Intrinsics.areEqual((Object) this.userInfo, (Object) griverInnerAppUtil.userInfo);
    }

    public final int hashCode() {
        boolean z = this.succes;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        GriverExecutors.DiscardOldestPolicy discardOldestPolicy = this.userInfo;
        return i + (discardOldestPolicy != null ? discardOldestPolicy.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QueryKYCUserData(succes=");
        sb.append(this.succes);
        sb.append(", userInfo=");
        sb.append(this.userInfo);
        sb.append(")");
        return sb.toString();
    }

    public GriverInnerAppUtil(boolean z, @Nullable GriverExecutors.DiscardOldestPolicy discardOldestPolicy) {
        this.succes = z;
        this.userInfo = discardOldestPolicy;
    }

    public final boolean getSucces() {
        return this.succes;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ GriverInnerAppUtil(boolean r16, o.GriverExecutors.DiscardOldestPolicy r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r15 = this;
            r0 = r18 & 2
            if (r0 == 0) goto L_0x001c
            o.GriverExecutors$DiscardOldestPolicy r0 = new o.GriverExecutors$DiscardOldestPolicy
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 2047(0x7ff, float:2.868E-42)
            r14 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r15
            r2 = r16
            goto L_0x0021
        L_0x001c:
            r1 = r15
            r2 = r16
            r0 = r17
        L_0x0021:
            r15.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverInnerAppUtil.<init>(boolean, o.GriverExecutors$DiscardOldestPolicy, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final GriverExecutors.DiscardOldestPolicy getUserInfo() {
        return this.userInfo;
    }
}
