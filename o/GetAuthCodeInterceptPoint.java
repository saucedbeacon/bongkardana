package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lid/dana/data/social/model/GroupedActivityResult;", "", "id", "", "group", "activityCount", "", "actorCount", "activities", "", "Lid/dana/data/social/model/ActivityResult;", "read", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/util/List;Z)V", "getActivities", "()Ljava/util/List;", "getActivityCount", "()I", "getActorCount", "getGroup", "()Ljava/lang/String;", "getId", "getRead", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toGroupedActivity", "Lid/dana/domain/social/model/GroupedActivity;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GetAuthCodeInterceptPoint {
    @NotNull
    private final List<onUserAuthClick> activities;
    private final int activityCount;
    private final int actorCount;
    @NotNull
    private final String group;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9909id;
    private final boolean read;

    public static /* synthetic */ GetAuthCodeInterceptPoint copy$default(GetAuthCodeInterceptPoint getAuthCodeInterceptPoint, String str, String str2, int i, int i2, List<onUserAuthClick> list, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = getAuthCodeInterceptPoint.f9909id;
        }
        if ((i3 & 2) != 0) {
            str2 = getAuthCodeInterceptPoint.group;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = getAuthCodeInterceptPoint.activityCount;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = getAuthCodeInterceptPoint.actorCount;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            list = getAuthCodeInterceptPoint.activities;
        }
        List<onUserAuthClick> list2 = list;
        if ((i3 & 32) != 0) {
            z = getAuthCodeInterceptPoint.read;
        }
        return getAuthCodeInterceptPoint.copy(str, str3, i4, i5, list2, z);
    }

    @NotNull
    public final String component1() {
        return this.f9909id;
    }

    @NotNull
    public final String component2() {
        return this.group;
    }

    public final int component3() {
        return this.activityCount;
    }

    public final int component4() {
        return this.actorCount;
    }

    @NotNull
    public final List<onUserAuthClick> component5() {
        return this.activities;
    }

    public final boolean component6() {
        return this.read;
    }

    @NotNull
    public final GetAuthCodeInterceptPoint copy(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<onUserAuthClick> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "group");
        Intrinsics.checkNotNullParameter(list, "activities");
        return new GetAuthCodeInterceptPoint(str, str2, i, i2, list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAuthCodeInterceptPoint)) {
            return false;
        }
        GetAuthCodeInterceptPoint getAuthCodeInterceptPoint = (GetAuthCodeInterceptPoint) obj;
        return Intrinsics.areEqual((Object) this.f9909id, (Object) getAuthCodeInterceptPoint.f9909id) && Intrinsics.areEqual((Object) this.group, (Object) getAuthCodeInterceptPoint.group) && this.activityCount == getAuthCodeInterceptPoint.activityCount && this.actorCount == getAuthCodeInterceptPoint.actorCount && Intrinsics.areEqual((Object) this.activities, (Object) getAuthCodeInterceptPoint.activities) && this.read == getAuthCodeInterceptPoint.read;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedActivityResult(id=");
        sb.append(this.f9909id);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", activityCount=");
        sb.append(this.activityCount);
        sb.append(", actorCount=");
        sb.append(this.actorCount);
        sb.append(", activities=");
        sb.append(this.activities);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public GetAuthCodeInterceptPoint(@NotNull String str, @NotNull String str2, int i, int i2, @NotNull List<onUserAuthClick> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "group");
        Intrinsics.checkNotNullParameter(list, "activities");
        this.f9909id = str;
        this.group = str2;
        this.activityCount = i;
        this.actorCount = i2;
        this.activities = list;
        this.read = z;
    }

    @NotNull
    public final String getId() {
        return this.f9909id;
    }

    @NotNull
    public final String getGroup() {
        return this.group;
    }

    public final int getActivityCount() {
        return this.activityCount;
    }

    public final int getActorCount() {
        return this.actorCount;
    }

    @NotNull
    public final List<onUserAuthClick> getActivities() {
        return this.activities;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetAuthCodeInterceptPoint(String str, String str2, int i, int i2, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, list, (i3 & 32) != 0 ? false : z);
    }

    public final boolean getRead() {
        return this.read;
    }

    @NotNull
    public final onCycleEnd toGroupedActivity() {
        return new onCycleEnd(this.f9909id, this.group, this.activityCount, this.actorCount, addOpenAuthHelper.toNotificationsResponse(this.activities), this.read);
    }

    public final int hashCode() {
        String str = this.f9909id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.group;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.valueOf(this.activityCount).hashCode()) * 31) + Integer.valueOf(this.actorCount).hashCode()) * 31;
        List<onUserAuthClick> list = this.activities;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.read;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
