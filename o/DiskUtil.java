package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, d2 = {"Lid/dana/domain/nearbyme/model/MerchantConsult;", "", "reviewableShop", "Lid/dana/domain/nearbyme/model/Shop;", "shopInfos", "", "hasMore", "", "positiveTags", "Lid/dana/domain/nearbyme/model/Tag;", "negativeSentiments", "(Lid/dana/domain/nearbyme/model/Shop;Ljava/util/List;ZLjava/util/List;Ljava/util/List;)V", "getHasMore", "()Z", "getNegativeSentiments", "()Ljava/util/List;", "getPositiveTags", "getReviewableShop", "()Lid/dana/domain/nearbyme/model/Shop;", "setReviewableShop", "(Lid/dana/domain/nearbyme/model/Shop;)V", "getShopInfos", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class DiskUtil {
    private final boolean hasMore;
    @NotNull
    private final List<getExtensionFromMimeType> negativeSentiments;
    @NotNull
    private final List<getExtensionFromMimeType> positiveTags;
    @NotNull
    private GriverConfigUtils reviewableShop;
    @NotNull
    private final List<GriverConfigUtils> shopInfos;

    public DiskUtil() {
        this((GriverConfigUtils) null, (List) null, false, (List) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DiskUtil copy$default(DiskUtil diskUtil, GriverConfigUtils griverConfigUtils, List<GriverConfigUtils> list, boolean z, List<getExtensionFromMimeType> list2, List<getExtensionFromMimeType> list3, int i, Object obj) {
        if ((i & 1) != 0) {
            griverConfigUtils = diskUtil.reviewableShop;
        }
        if ((i & 2) != 0) {
            list = diskUtil.shopInfos;
        }
        List<GriverConfigUtils> list4 = list;
        if ((i & 4) != 0) {
            z = diskUtil.hasMore;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            list2 = diskUtil.positiveTags;
        }
        List<getExtensionFromMimeType> list5 = list2;
        if ((i & 16) != 0) {
            list3 = diskUtil.negativeSentiments;
        }
        return diskUtil.copy(griverConfigUtils, list4, z2, list5, list3);
    }

    @NotNull
    public final GriverConfigUtils component1() {
        return this.reviewableShop;
    }

    @NotNull
    public final List<GriverConfigUtils> component2() {
        return this.shopInfos;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    @NotNull
    public final List<getExtensionFromMimeType> component4() {
        return this.positiveTags;
    }

    @NotNull
    public final List<getExtensionFromMimeType> component5() {
        return this.negativeSentiments;
    }

    @NotNull
    public final DiskUtil copy(@NotNull GriverConfigUtils griverConfigUtils, @NotNull List<GriverConfigUtils> list, boolean z, @NotNull List<getExtensionFromMimeType> list2, @NotNull List<getExtensionFromMimeType> list3) {
        Intrinsics.checkNotNullParameter(griverConfigUtils, "reviewableShop");
        Intrinsics.checkNotNullParameter(list, "shopInfos");
        Intrinsics.checkNotNullParameter(list2, "positiveTags");
        Intrinsics.checkNotNullParameter(list3, "negativeSentiments");
        return new DiskUtil(griverConfigUtils, list, z, list2, list3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiskUtil)) {
            return false;
        }
        DiskUtil diskUtil = (DiskUtil) obj;
        return Intrinsics.areEqual((Object) this.reviewableShop, (Object) diskUtil.reviewableShop) && Intrinsics.areEqual((Object) this.shopInfos, (Object) diskUtil.shopInfos) && this.hasMore == diskUtil.hasMore && Intrinsics.areEqual((Object) this.positiveTags, (Object) diskUtil.positiveTags) && Intrinsics.areEqual((Object) this.negativeSentiments, (Object) diskUtil.negativeSentiments);
    }

    public final int hashCode() {
        GriverConfigUtils griverConfigUtils = this.reviewableShop;
        int i = 0;
        int hashCode = (griverConfigUtils != null ? griverConfigUtils.hashCode() : 0) * 31;
        List<GriverConfigUtils> list = this.shopInfos;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        List<getExtensionFromMimeType> list2 = this.positiveTags;
        int hashCode3 = (i2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<getExtensionFromMimeType> list3 = this.negativeSentiments;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantConsult(reviewableShop=");
        sb.append(this.reviewableShop);
        sb.append(", shopInfos=");
        sb.append(this.shopInfos);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", positiveTags=");
        sb.append(this.positiveTags);
        sb.append(", negativeSentiments=");
        sb.append(this.negativeSentiments);
        sb.append(")");
        return sb.toString();
    }

    public DiskUtil(@NotNull GriverConfigUtils griverConfigUtils, @NotNull List<GriverConfigUtils> list, boolean z, @NotNull List<getExtensionFromMimeType> list2, @NotNull List<getExtensionFromMimeType> list3) {
        Intrinsics.checkNotNullParameter(griverConfigUtils, "reviewableShop");
        Intrinsics.checkNotNullParameter(list, "shopInfos");
        Intrinsics.checkNotNullParameter(list2, "positiveTags");
        Intrinsics.checkNotNullParameter(list3, "negativeSentiments");
        this.reviewableShop = griverConfigUtils;
        this.shopInfos = list;
        this.hasMore = z;
        this.positiveTags = list2;
        this.negativeSentiments = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DiskUtil(o.GriverConfigUtils r41, java.util.List r42, boolean r43, java.util.List r44, java.util.List r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            r40 = this;
            r0 = r46 & 1
            if (r0 == 0) goto L_0x0044
            o.GriverConfigUtils r0 = new o.GriverConfigUtils
            r1 = r0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 2147483647(0x7fffffff, float:NaN)
            r39 = 0
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            goto L_0x0046
        L_0x0044:
            r0 = r41
        L_0x0046:
            r1 = r46 & 2
            if (r1 == 0) goto L_0x004f
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0051
        L_0x004f:
            r1 = r42
        L_0x0051:
            r2 = r46 & 4
            if (r2 == 0) goto L_0x0057
            r2 = 0
            goto L_0x0059
        L_0x0057:
            r2 = r43
        L_0x0059:
            r3 = r46 & 8
            if (r3 == 0) goto L_0x0062
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0064
        L_0x0062:
            r3 = r44
        L_0x0064:
            r4 = r46 & 16
            if (r4 == 0) goto L_0x006d
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x006f
        L_0x006d:
            r4 = r45
        L_0x006f:
            r41 = r40
            r42 = r0
            r43 = r1
            r44 = r2
            r45 = r3
            r46 = r4
            r41.<init>(r42, r43, r44, r45, r46)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DiskUtil.<init>(o.GriverConfigUtils, java.util.List, boolean, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final GriverConfigUtils getReviewableShop() {
        return this.reviewableShop;
    }

    public final void setReviewableShop(@NotNull GriverConfigUtils griverConfigUtils) {
        Intrinsics.checkNotNullParameter(griverConfigUtils, "<set-?>");
        this.reviewableShop = griverConfigUtils;
    }

    @NotNull
    public final List<GriverConfigUtils> getShopInfos() {
        return this.shopInfos;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final List<getExtensionFromMimeType> getPositiveTags() {
        return this.positiveTags;
    }

    @NotNull
    public final List<getExtensionFromMimeType> getNegativeSentiments() {
        return this.negativeSentiments;
    }
}
