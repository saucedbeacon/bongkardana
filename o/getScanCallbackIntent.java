package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\u00032\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010,\u001a\u00020\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\u0006\u0010.\u001a\u00020\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001e\"\u0004\b \u0010!¨\u00060"}, d2 = {"Lid/dana/domain/social/model/SocialFeed;", "", "hasMore", "", "maxId", "", "activities", "", "Lid/dana/domain/social/model/ActivityResponse;", "feedVersion", "", "groupedActivities", "Lid/dana/domain/social/model/GroupedActivity;", "minId", "fromCache", "(ZLjava/lang/String;Ljava/util/List;ILjava/util/List;Ljava/lang/String;Z)V", "getActivities", "()Ljava/util/List;", "setActivities", "(Ljava/util/List;)V", "getFeedVersion", "()I", "getFromCache", "()Z", "setFromCache", "(Z)V", "getGroupedActivities", "setGroupedActivities", "getHasMore", "getMaxId", "()Ljava/lang/String;", "getMinId", "setMinId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hasActivities", "hashCode", "isFeedNotVersionTwo", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getScanCallbackIntent {
    @NotNull
    private List<RssiFilter> activities;
    private final int feedVersion;
    private boolean fromCache;
    @NotNull
    private List<onCycleEnd> groupedActivities;
    private final boolean hasMore;
    @NotNull
    private final String maxId;
    @NotNull
    private String minId;

    public getScanCallbackIntent() {
        this(false, (String) null, (List) null, 0, (List) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getScanCallbackIntent copy$default(getScanCallbackIntent getscancallbackintent, boolean z, String str, List<RssiFilter> list, int i, List<onCycleEnd> list2, String str2, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = getscancallbackintent.hasMore;
        }
        if ((i2 & 2) != 0) {
            str = getscancallbackintent.maxId;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            list = getscancallbackintent.activities;
        }
        List<RssiFilter> list3 = list;
        if ((i2 & 8) != 0) {
            i = getscancallbackintent.feedVersion;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list2 = getscancallbackintent.groupedActivities;
        }
        List<onCycleEnd> list4 = list2;
        if ((i2 & 32) != 0) {
            str2 = getscancallbackintent.minId;
        }
        String str4 = str2;
        if ((i2 & 64) != 0) {
            z2 = getscancallbackintent.fromCache;
        }
        return getscancallbackintent.copy(z, str3, list3, i3, list4, str4, z2);
    }

    public final boolean component1() {
        return this.hasMore;
    }

    @NotNull
    public final String component2() {
        return this.maxId;
    }

    @NotNull
    public final List<RssiFilter> component3() {
        return this.activities;
    }

    public final int component4() {
        return this.feedVersion;
    }

    @NotNull
    public final List<onCycleEnd> component5() {
        return this.groupedActivities;
    }

    @NotNull
    public final String component6() {
        return this.minId;
    }

    public final boolean component7() {
        return this.fromCache;
    }

    @NotNull
    public final getScanCallbackIntent copy(boolean z, @NotNull String str, @NotNull List<RssiFilter> list, int i, @NotNull List<onCycleEnd> list2, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "maxId");
        Intrinsics.checkNotNullParameter(list, "activities");
        Intrinsics.checkNotNullParameter(list2, "groupedActivities");
        Intrinsics.checkNotNullParameter(str2, "minId");
        return new getScanCallbackIntent(z, str, list, i, list2, str2, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getScanCallbackIntent)) {
            return false;
        }
        getScanCallbackIntent getscancallbackintent = (getScanCallbackIntent) obj;
        return this.hasMore == getscancallbackintent.hasMore && Intrinsics.areEqual((Object) this.maxId, (Object) getscancallbackintent.maxId) && Intrinsics.areEqual((Object) this.activities, (Object) getscancallbackintent.activities) && this.feedVersion == getscancallbackintent.feedVersion && Intrinsics.areEqual((Object) this.groupedActivities, (Object) getscancallbackintent.groupedActivities) && Intrinsics.areEqual((Object) this.minId, (Object) getscancallbackintent.minId) && this.fromCache == getscancallbackintent.fromCache;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialFeed(hasMore=");
        sb.append(this.hasMore);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", activities=");
        sb.append(this.activities);
        sb.append(", feedVersion=");
        sb.append(this.feedVersion);
        sb.append(", groupedActivities=");
        sb.append(this.groupedActivities);
        sb.append(", minId=");
        sb.append(this.minId);
        sb.append(", fromCache=");
        sb.append(this.fromCache);
        sb.append(")");
        return sb.toString();
    }

    public getScanCallbackIntent(boolean z, @NotNull String str, @NotNull List<RssiFilter> list, int i, @NotNull List<onCycleEnd> list2, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "maxId");
        Intrinsics.checkNotNullParameter(list, "activities");
        Intrinsics.checkNotNullParameter(list2, "groupedActivities");
        Intrinsics.checkNotNullParameter(str2, "minId");
        this.hasMore = z;
        this.maxId = str;
        this.activities = list;
        this.feedVersion = i;
        this.groupedActivities = list2;
        this.minId = str2;
        this.fromCache = z2;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @NotNull
    public final String getMaxId() {
        return this.maxId;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ getScanCallbackIntent(boolean r7, java.lang.String r8, java.util.List r9, int r10, java.util.List r11, java.lang.String r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = 0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x0010
            r2 = r1
            goto L_0x0011
        L_0x0010:
            r2 = r8
        L_0x0011:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0019
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0019:
            r3 = r9
            r7 = r14 & 8
            if (r7 == 0) goto L_0x0020
            r4 = 0
            goto L_0x0021
        L_0x0020:
            r4 = r10
        L_0x0021:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0029
            java.util.List r11 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0029:
            r5 = r11
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = r12
        L_0x0030:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0036
            r14 = 0
            goto L_0x0037
        L_0x0036:
            r14 = r13
        L_0x0037:
            r7 = r6
            r8 = r15
            r9 = r2
            r10 = r3
            r11 = r4
            r12 = r5
            r13 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getScanCallbackIntent.<init>(boolean, java.lang.String, java.util.List, int, java.util.List, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<RssiFilter> getActivities() {
        return this.activities;
    }

    public final void setActivities(@NotNull List<RssiFilter> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.activities = list;
    }

    public final int getFeedVersion() {
        return this.feedVersion;
    }

    @NotNull
    public final List<onCycleEnd> getGroupedActivities() {
        return this.groupedActivities;
    }

    public final void setGroupedActivities(@NotNull List<onCycleEnd> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.groupedActivities = list;
    }

    @NotNull
    public final String getMinId() {
        return this.minId;
    }

    public final void setMinId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minId = str;
    }

    public final boolean getFromCache() {
        return this.fromCache;
    }

    public final void setFromCache(boolean z) {
        this.fromCache = z;
    }

    public final boolean isFeedNotVersionTwo() {
        return this.feedVersion > 2;
    }

    public final boolean hasActivities() {
        return (this.activities.isEmpty() ^ true) || (this.groupedActivities.isEmpty() ^ true);
    }

    public final int hashCode() {
        boolean z = this.hasMore;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.maxId;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<RssiFilter> list = this.activities;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + Integer.valueOf(this.feedVersion).hashCode()) * 31;
        List<onCycleEnd> list2 = this.groupedActivities;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.minId;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z3 = this.fromCache;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }
}
