package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J]\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, d2 = {"Lid/dana/data/social/model/FetchFeedRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "targetUserId", "", "pageSize", "", "minId", "maxId", "feedType", "feedVersion", "activityIds", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getActivityIds", "()Ljava/util/List;", "getFeedType", "()Ljava/lang/String;", "getFeedVersion", "()I", "getMaxId", "getMinId", "getPageSize", "getTargetUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AppPermissionInitExtension extends BaseRpcRequest {
    @NotNull
    private final List<String> activityIds;
    @Nullable
    private final String feedType;
    private final int feedVersion;
    @Nullable
    private final String maxId;
    @Nullable
    private final String minId;
    private final int pageSize;
    @Nullable
    private final String targetUserId;

    public static /* synthetic */ AppPermissionInitExtension copy$default(AppPermissionInitExtension appPermissionInitExtension, String str, int i, String str2, String str3, String str4, int i2, List<String> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = appPermissionInitExtension.targetUserId;
        }
        if ((i3 & 2) != 0) {
            i = appPermissionInitExtension.pageSize;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = appPermissionInitExtension.minId;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            str3 = appPermissionInitExtension.maxId;
        }
        String str6 = str3;
        if ((i3 & 16) != 0) {
            str4 = appPermissionInitExtension.feedType;
        }
        String str7 = str4;
        if ((i3 & 32) != 0) {
            i2 = appPermissionInitExtension.feedVersion;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            list = appPermissionInitExtension.activityIds;
        }
        return appPermissionInitExtension.copy(str, i4, str5, str6, str7, i5, list);
    }

    @Nullable
    public final String component1() {
        return this.targetUserId;
    }

    public final int component2() {
        return this.pageSize;
    }

    @Nullable
    public final String component3() {
        return this.minId;
    }

    @Nullable
    public final String component4() {
        return this.maxId;
    }

    @Nullable
    public final String component5() {
        return this.feedType;
    }

    public final int component6() {
        return this.feedVersion;
    }

    @NotNull
    public final List<String> component7() {
        return this.activityIds;
    }

    @NotNull
    public final AppPermissionInitExtension copy(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @NotNull List<String> list) {
        List<String> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "activityIds");
        return new AppPermissionInitExtension(str, i, str2, str3, str4, i2, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppPermissionInitExtension)) {
            return false;
        }
        AppPermissionInitExtension appPermissionInitExtension = (AppPermissionInitExtension) obj;
        return Intrinsics.areEqual((Object) this.targetUserId, (Object) appPermissionInitExtension.targetUserId) && this.pageSize == appPermissionInitExtension.pageSize && Intrinsics.areEqual((Object) this.minId, (Object) appPermissionInitExtension.minId) && Intrinsics.areEqual((Object) this.maxId, (Object) appPermissionInitExtension.maxId) && Intrinsics.areEqual((Object) this.feedType, (Object) appPermissionInitExtension.feedType) && this.feedVersion == appPermissionInitExtension.feedVersion && Intrinsics.areEqual((Object) this.activityIds, (Object) appPermissionInitExtension.activityIds);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchFeedRequest(targetUserId=");
        sb.append(this.targetUserId);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", minId=");
        sb.append(this.minId);
        sb.append(", maxId=");
        sb.append(this.maxId);
        sb.append(", feedType=");
        sb.append(this.feedType);
        sb.append(", feedVersion=");
        sb.append(this.feedVersion);
        sb.append(", activityIds=");
        sb.append(this.activityIds);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getMaxId() {
        return this.maxId;
    }

    @Nullable
    public final String getMinId() {
        return this.minId;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppPermissionInitExtension(String str, int i, String str2, String str3, String str4, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, (i3 & 32) != 0 ? 2 : i2, (i3 & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<String> getActivityIds() {
        return this.activityIds;
    }

    @Nullable
    public final String getFeedType() {
        return this.feedType;
    }

    public final int getFeedVersion() {
        return this.feedVersion;
    }

    public AppPermissionInitExtension(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "activityIds");
        this.targetUserId = str;
        this.pageSize = i;
        this.minId = str2;
        this.maxId = str3;
        this.feedType = str4;
        this.feedVersion = i2;
        this.activityIds = list;
    }

    public final int hashCode() {
        String str = this.targetUserId;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.pageSize).hashCode()) * 31;
        String str2 = this.minId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.maxId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.feedType;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.valueOf(this.feedVersion).hashCode()) * 31;
        List<String> list = this.activityIds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }
}
