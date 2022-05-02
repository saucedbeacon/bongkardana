package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0003J`\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u000bHÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006'"}, d2 = {"Lid/dana/data/social/model/FeedResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "hasMore", "", "maxId", "", "minId", "activities", "", "Lid/dana/data/social/model/ActivityResult;", "feedVersion", "", "groupedActivities", "Lid/dana/data/social/model/GroupedActivityResult;", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)V", "getActivities", "()Ljava/util/List;", "getFeedVersion", "()I", "getGroupedActivities", "getHasMore", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMaxId", "()Ljava/lang/String;", "getMinId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILjava/util/List;)Lid/dana/data/social/model/FeedResult;", "equals", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getExtendScope extends BaseRpcResult {
    @Nullable
    private final List<onUserAuthClick> activities;
    private final int feedVersion;
    @Nullable
    private final List<GetAuthCodeInterceptPoint> groupedActivities;
    @Nullable
    private final Boolean hasMore;
    @Nullable
    private final String maxId;
    @Nullable
    private final String minId;

    public static /* synthetic */ getExtendScope copy$default(getExtendScope getextendscope, Boolean bool, String str, String str2, List<onUserAuthClick> list, int i, List<GetAuthCodeInterceptPoint> list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = getextendscope.hasMore;
        }
        if ((i2 & 2) != 0) {
            str = getextendscope.maxId;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = getextendscope.minId;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = getextendscope.activities;
        }
        List<onUserAuthClick> list3 = list;
        if ((i2 & 16) != 0) {
            i = getextendscope.feedVersion;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            list2 = getextendscope.groupedActivities;
        }
        return getextendscope.copy(bool, str3, str4, list3, i3, list2);
    }

    @Nullable
    public final Boolean component1() {
        return this.hasMore;
    }

    @Nullable
    public final String component2() {
        return this.maxId;
    }

    @Nullable
    public final String component3() {
        return this.minId;
    }

    @Nullable
    public final List<onUserAuthClick> component4() {
        return this.activities;
    }

    public final int component5() {
        return this.feedVersion;
    }

    @Nullable
    public final List<GetAuthCodeInterceptPoint> component6() {
        return this.groupedActivities;
    }

    @NotNull
    public final getExtendScope copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable List<onUserAuthClick> list, int i, @Nullable List<GetAuthCodeInterceptPoint> list2) {
        return new getExtendScope(bool, str, str2, list, i, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getExtendScope)) {
            return false;
        }
        getExtendScope getextendscope = (getExtendScope) obj;
        return Intrinsics.areEqual((Object) this.hasMore, (Object) getextendscope.hasMore) && Intrinsics.areEqual((Object) this.maxId, (Object) getextendscope.maxId) && Intrinsics.areEqual((Object) this.minId, (Object) getextendscope.minId) && Intrinsics.areEqual((Object) this.activities, (Object) getextendscope.activities) && this.feedVersion == getextendscope.feedVersion && Intrinsics.areEqual((Object) this.groupedActivities, (Object) getextendscope.groupedActivities);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedResult(hasMore=");
        sb.append(this.hasMore);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", minId=");
        sb.append(this.minId);
        sb.append(", activities=");
        sb.append(this.activities);
        sb.append(", feedVersion=");
        sb.append(this.feedVersion);
        sb.append(", groupedActivities=");
        sb.append(this.groupedActivities);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getExtendScope(Boolean bool, String str, String str2, List list, int i, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Boolean.FALSE : bool, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list, i, (i2 & 32) != 0 ? CollectionsKt.emptyList() : list2);
    }

    @Nullable
    public final Boolean getHasMore() {
        return this.hasMore;
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    @Nullable
    public final String getMinId() {
        return this.minId;
    }

    @Nullable
    public final List<onUserAuthClick> getActivities() {
        return this.activities;
    }

    public final int getFeedVersion() {
        return this.feedVersion;
    }

    @Nullable
    public final List<GetAuthCodeInterceptPoint> getGroupedActivities() {
        return this.groupedActivities;
    }

    public getExtendScope(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable List<onUserAuthClick> list, int i, @Nullable List<GetAuthCodeInterceptPoint> list2) {
        this.hasMore = bool;
        this.maxId = str;
        this.minId = str2;
        this.activities = list;
        this.feedVersion = i;
        this.groupedActivities = list2;
    }

    public final int hashCode() {
        Boolean bool = this.hasMore;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.maxId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.minId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<onUserAuthClick> list = this.activities;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + Integer.valueOf(this.feedVersion).hashCode()) * 31;
        List<GetAuthCodeInterceptPoint> list2 = this.groupedActivities;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }
}
