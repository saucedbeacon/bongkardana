package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lid/dana/data/social/repository/source/network/response/AddActivityCommentResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "id", "", "userId", "activityId", "content", "createdTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getContent", "getCreatedTime", "getId", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAppName extends BaseRpcResult {
    @Nullable
    private final String activityId;
    @Nullable
    private final String content;
    @Nullable
    private final String createdTime;
    @Nullable

    /* renamed from: id  reason: collision with root package name */
    private final String f9941id;
    @Nullable
    private final String userId;

    public static /* synthetic */ setAppName copy$default(setAppName setappname, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setappname.f9941id;
        }
        if ((i & 2) != 0) {
            str2 = setappname.userId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = setappname.activityId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = setappname.content;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = setappname.createdTime;
        }
        return setappname.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.f9941id;
    }

    @Nullable
    public final String component2() {
        return this.userId;
    }

    @Nullable
    public final String component3() {
        return this.activityId;
    }

    @Nullable
    public final String component4() {
        return this.content;
    }

    @Nullable
    public final String component5() {
        return this.createdTime;
    }

    @NotNull
    public final setAppName copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new setAppName(str, str2, str3, str4, str5);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setAppName)) {
            return false;
        }
        setAppName setappname = (setAppName) obj;
        return Intrinsics.areEqual((Object) this.f9941id, (Object) setappname.f9941id) && Intrinsics.areEqual((Object) this.userId, (Object) setappname.userId) && Intrinsics.areEqual((Object) this.activityId, (Object) setappname.activityId) && Intrinsics.areEqual((Object) this.content, (Object) setappname.content) && Intrinsics.areEqual((Object) this.createdTime, (Object) setappname.createdTime);
    }

    public final int hashCode() {
        String str = this.f9941id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.activityId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.content;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.createdTime;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AddActivityCommentResponse(id=");
        sb.append(this.f9941id);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", activityId=");
        sb.append(this.activityId);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final String getId() {
        return this.f9941id;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getCreatedTime() {
        return this.createdTime;
    }

    public setAppName(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f9941id = str;
        this.userId = str2;
        this.activityId = str3;
        this.content = str4;
        this.createdTime = str5;
    }
}
