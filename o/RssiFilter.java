package o;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b*\b\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\t\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u0018HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J-\u0010:\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000eHÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010HÆ\u0003JÓ\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010=\u001a\u00020\t2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010?\u001a\u00020\u0003J\t\u0010@\u001a\u00020\u0018HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R5\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u0001`\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001b¨\u0006B"}, d2 = {"Lid/dana/domain/social/model/ActivityResponse;", "", "id", "", "iconUrl", "content", "redirectType", "redirectValue", "read", "", "createdTime", "", "extendInfo", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "reactionCounts", "", "Lid/dana/domain/social/model/ReactionCount;", "ownReactions", "Lid/dana/domain/social/model/OwnReaction;", "contentType", "activityId", "ownActivity", "commentCounts", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLjava/util/HashMap;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZI)V", "getActivityId", "()Ljava/lang/String;", "getCommentCounts", "()I", "getContent", "getContentType", "getCreatedTime", "()J", "getExtendInfo", "()Ljava/util/HashMap;", "getIconUrl", "getId", "getOwnActivity", "()Z", "getOwnReactions", "()Ljava/util/List;", "getReactionCounts", "getRead", "getRedirectType", "getRedirectValue", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getUserId", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RssiFilter {
    @Nullable
    private final String activityId;
    private final int commentCounts;
    @Nullable
    private final String content;
    @Nullable
    private final String contentType;
    private final long createdTime;
    @Nullable
    private final HashMap<String, String> extendInfo;
    @Nullable
    private final String iconUrl;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private final String f9916id;
    private final boolean ownActivity;
    @NotNull
    private final List<getRangedRegionState> ownReactions;
    @NotNull
    private final List<stopAndroidOBackgroundScan> reactionCounts;
    private final boolean read;
    @Nullable
    private final String redirectType;
    @Nullable
    private final String redirectValue;

    public RssiFilter() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, 0, (HashMap) null, (List) null, (List) null, (String) null, (String) null, false, 0, 16383, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RssiFilter copy$default(RssiFilter rssiFilter, String str, String str2, String str3, String str4, String str5, boolean z, long j, HashMap hashMap, List list, List list2, String str6, String str7, boolean z2, int i, int i2, Object obj) {
        RssiFilter rssiFilter2 = rssiFilter;
        int i3 = i2;
        return rssiFilter.copy((i3 & 1) != 0 ? rssiFilter2.f9916id : str, (i3 & 2) != 0 ? rssiFilter2.iconUrl : str2, (i3 & 4) != 0 ? rssiFilter2.content : str3, (i3 & 8) != 0 ? rssiFilter2.redirectType : str4, (i3 & 16) != 0 ? rssiFilter2.redirectValue : str5, (i3 & 32) != 0 ? rssiFilter2.read : z, (i3 & 64) != 0 ? rssiFilter2.createdTime : j, (i3 & 128) != 0 ? rssiFilter2.extendInfo : hashMap, (i3 & 256) != 0 ? rssiFilter2.reactionCounts : list, (i3 & 512) != 0 ? rssiFilter2.ownReactions : list2, (i3 & 1024) != 0 ? rssiFilter2.contentType : str6, (i3 & 2048) != 0 ? rssiFilter2.activityId : str7, (i3 & 4096) != 0 ? rssiFilter2.ownActivity : z2, (i3 & 8192) != 0 ? rssiFilter2.commentCounts : i);
    }

    @Nullable
    public final String component1() {
        return this.f9916id;
    }

    @NotNull
    public final List<getRangedRegionState> component10() {
        return this.ownReactions;
    }

    @Nullable
    public final String component11() {
        return this.contentType;
    }

    @Nullable
    public final String component12() {
        return this.activityId;
    }

    public final boolean component13() {
        return this.ownActivity;
    }

    public final int component14() {
        return this.commentCounts;
    }

    @Nullable
    public final String component2() {
        return this.iconUrl;
    }

    @Nullable
    public final String component3() {
        return this.content;
    }

    @Nullable
    public final String component4() {
        return this.redirectType;
    }

    @Nullable
    public final String component5() {
        return this.redirectValue;
    }

    public final boolean component6() {
        return this.read;
    }

    public final long component7() {
        return this.createdTime;
    }

    @Nullable
    public final HashMap<String, String> component8() {
        return this.extendInfo;
    }

    @NotNull
    public final List<stopAndroidOBackgroundScan> component9() {
        return this.reactionCounts;
    }

    @NotNull
    public final RssiFilter copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, long j, @Nullable HashMap<String, String> hashMap, @NotNull List<stopAndroidOBackgroundScan> list, @NotNull List<getRangedRegionState> list2, @Nullable String str6, @Nullable String str7, boolean z2, int i) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2017498264, oncanceled);
            onCancelLoad.getMin(2017498264, oncanceled);
        }
        List<stopAndroidOBackgroundScan> list3 = list;
        Intrinsics.checkNotNullParameter(list3, "reactionCounts");
        List<getRangedRegionState> list4 = list2;
        Intrinsics.checkNotNullParameter(list4, "ownReactions");
        return new RssiFilter(str, str2, str3, str4, str5, z, j, hashMap, list3, list4, str6, str7, z2, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RssiFilter)) {
            return false;
        }
        RssiFilter rssiFilter = (RssiFilter) obj;
        return Intrinsics.areEqual((Object) this.f9916id, (Object) rssiFilter.f9916id) && Intrinsics.areEqual((Object) this.iconUrl, (Object) rssiFilter.iconUrl) && Intrinsics.areEqual((Object) this.content, (Object) rssiFilter.content) && Intrinsics.areEqual((Object) this.redirectType, (Object) rssiFilter.redirectType) && Intrinsics.areEqual((Object) this.redirectValue, (Object) rssiFilter.redirectValue) && this.read == rssiFilter.read && this.createdTime == rssiFilter.createdTime && Intrinsics.areEqual((Object) this.extendInfo, (Object) rssiFilter.extendInfo) && Intrinsics.areEqual((Object) this.reactionCounts, (Object) rssiFilter.reactionCounts) && Intrinsics.areEqual((Object) this.ownReactions, (Object) rssiFilter.ownReactions) && Intrinsics.areEqual((Object) this.contentType, (Object) rssiFilter.contentType) && Intrinsics.areEqual((Object) this.activityId, (Object) rssiFilter.activityId) && this.ownActivity == rssiFilter.ownActivity && this.commentCounts == rssiFilter.commentCounts;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResponse(id=");
        sb.append(this.f9916id);
        sb.append(", iconUrl=");
        sb.append(this.iconUrl);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", redirectType=");
        sb.append(this.redirectType);
        sb.append(", redirectValue=");
        sb.append(this.redirectValue);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append(", reactionCounts=");
        sb.append(this.reactionCounts);
        sb.append(", ownReactions=");
        sb.append(this.ownReactions);
        sb.append(", contentType=");
        sb.append(this.contentType);
        sb.append(", activityId=");
        sb.append(this.activityId);
        sb.append(", ownActivity=");
        sb.append(this.ownActivity);
        sb.append(", commentCounts=");
        sb.append(this.commentCounts);
        sb.append(")");
        return sb.toString();
    }

    public RssiFilter(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, long j, @Nullable HashMap<String, String> hashMap, @NotNull List<stopAndroidOBackgroundScan> list, @NotNull List<getRangedRegionState> list2, @Nullable String str6, @Nullable String str7, boolean z2, int i) {
        List<getRangedRegionState> list3 = list2;
        Intrinsics.checkNotNullParameter(list, "reactionCounts");
        Intrinsics.checkNotNullParameter(list3, "ownReactions");
        this.f9916id = str;
        this.iconUrl = str2;
        this.content = str3;
        this.redirectType = str4;
        this.redirectValue = str5;
        this.read = z;
        this.createdTime = j;
        this.extendInfo = hashMap;
        this.reactionCounts = list;
        this.ownReactions = list3;
        this.contentType = str6;
        this.activityId = str7;
        this.ownActivity = z2;
        this.commentCounts = i;
    }

    @Nullable
    public final String getId() {
        return this.f9916id;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getRedirectType() {
        return this.redirectType;
    }

    @Nullable
    public final String getRedirectValue() {
        return this.redirectValue;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final long getCreatedTime() {
        return this.createdTime;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ RssiFilter(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, long r23, java.util.HashMap r25, java.util.List r26, java.util.List r27, java.lang.String r28, java.lang.String r29, boolean r30, int r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000c
        L_0x000a:
            r1 = r17
        L_0x000c:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0012
            r3 = r2
            goto L_0x0014
        L_0x0012:
            r3 = r18
        L_0x0014:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001a
            r4 = r2
            goto L_0x001c
        L_0x001a:
            r4 = r19
        L_0x001c:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            r5 = r2
            goto L_0x0024
        L_0x0022:
            r5 = r20
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002a
            r6 = r2
            goto L_0x002c
        L_0x002a:
            r6 = r21
        L_0x002c:
            r7 = r0 & 32
            r8 = 0
            if (r7 == 0) goto L_0x0033
            r7 = 0
            goto L_0x0035
        L_0x0033:
            r7 = r22
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003c
            r9 = 0
            goto L_0x003e
        L_0x003c:
            r9 = r23
        L_0x003e:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0048
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            goto L_0x004a
        L_0x0048:
            r11 = r25
        L_0x004a:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0053
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0055
        L_0x0053:
            r12 = r26
        L_0x0055:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x005e
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0060
        L_0x005e:
            r13 = r27
        L_0x0060:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0066
            r14 = r2
            goto L_0x0068
        L_0x0066:
            r14 = r28
        L_0x0068:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r2 = r29
        L_0x006f:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0075
            r15 = 0
            goto L_0x0077
        L_0x0075:
            r15 = r30
        L_0x0077:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r8 = r31
        L_0x007e:
            r17 = r16
            r18 = r1
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r9
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r14
            r30 = r2
            r31 = r15
            r32 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RssiFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, long, java.util.HashMap, java.util.List, java.util.List, java.lang.String, java.lang.String, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Nullable
    public final HashMap<String, String> getExtendInfo() {
        return this.extendInfo;
    }

    @NotNull
    public final List<stopAndroidOBackgroundScan> getReactionCounts() {
        return this.reactionCounts;
    }

    @NotNull
    public final List<getRangedRegionState> getOwnReactions() {
        return this.ownReactions;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    public final boolean getOwnActivity() {
        return this.ownActivity;
    }

    public final int getCommentCounts() {
        return this.commentCounts;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = o.setBuildNumber.getUserId(r0);
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getUserId() {
        /*
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r1.extendInfo
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = o.setBuildNumber.getUserId(r0)
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RssiFilter.getUserId():java.lang.String");
    }

    public final int hashCode() {
        String str = this.f9916id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.iconUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.content;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.redirectType;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.redirectValue;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.read;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode6 = (((hashCode5 + (z ? 1 : 0)) * 31) + Long.valueOf(this.createdTime).hashCode()) * 31;
        HashMap<String, String> hashMap = this.extendInfo;
        int hashCode7 = (hashCode6 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<stopAndroidOBackgroundScan> list = this.reactionCounts;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        List<getRangedRegionState> list2 = this.ownReactions;
        int hashCode9 = (hashCode8 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str6 = this.contentType;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.activityId;
        if (str7 != null) {
            i = str7.hashCode();
        }
        int i2 = (hashCode10 + i) * 31;
        boolean z3 = this.ownActivity;
        if (!z3) {
            z2 = z3;
        }
        return ((i2 + (z2 ? 1 : 0)) * 31) + Integer.valueOf(this.commentCounts).hashCode();
    }
}
