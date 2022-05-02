package o;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020#J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lid/dana/data/social/repository/source/network/response/CommentResponse;", "", "id", "", "user", "Lid/dana/data/social/model/ActivityReactionsUserResult;", "content", "ownComment", "", "createdTime", "hasReport", "(Ljava/lang/String;Lid/dana/data/social/model/ActivityReactionsUserResult;Ljava/lang/String;ZLjava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getCreatedTime", "getHasReport", "()Z", "setHasReport", "(Z)V", "getId", "getOwnComment", "getUser", "()Lid/dana/data/social/model/ActivityReactionsUserResult;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toComment", "Lid/dana/domain/social/model/Comment;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAppLogoLink {
    @NotNull
    private final String content;
    @NotNull
    private final String createdTime;
    private boolean hasReport;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9923id;
    private final boolean ownComment;
    @NotNull
    private final getExtendDescriptionInSetting user;

    public static /* synthetic */ getAppLogoLink copy$default(getAppLogoLink getapplogolink, String str, getExtendDescriptionInSetting getextenddescriptioninsetting, String str2, boolean z, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getapplogolink.f9923id;
        }
        if ((i & 2) != 0) {
            getextenddescriptioninsetting = getapplogolink.user;
        }
        getExtendDescriptionInSetting getextenddescriptioninsetting2 = getextenddescriptioninsetting;
        if ((i & 4) != 0) {
            str2 = getapplogolink.content;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = getapplogolink.ownComment;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str3 = getapplogolink.createdTime;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z2 = getapplogolink.hasReport;
        }
        return getapplogolink.copy(str, getextenddescriptioninsetting2, str4, z3, str5, z2);
    }

    @NotNull
    public final String component1() {
        return this.f9923id;
    }

    @NotNull
    public final getExtendDescriptionInSetting component2() {
        return this.user;
    }

    @NotNull
    public final String component3() {
        return this.content;
    }

    public final boolean component4() {
        return this.ownComment;
    }

    @NotNull
    public final String component5() {
        return this.createdTime;
    }

    public final boolean component6() {
        return this.hasReport;
    }

    @NotNull
    public final getAppLogoLink copy(@NotNull String str, @NotNull getExtendDescriptionInSetting getextenddescriptioninsetting, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(getextenddescriptioninsetting, "user");
        Intrinsics.checkNotNullParameter(str2, "content");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        return new getAppLogoLink(str, getextenddescriptioninsetting, str2, z, str3, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAppLogoLink)) {
            return false;
        }
        getAppLogoLink getapplogolink = (getAppLogoLink) obj;
        return Intrinsics.areEqual((Object) this.f9923id, (Object) getapplogolink.f9923id) && Intrinsics.areEqual((Object) this.user, (Object) getapplogolink.user) && Intrinsics.areEqual((Object) this.content, (Object) getapplogolink.content) && this.ownComment == getapplogolink.ownComment && Intrinsics.areEqual((Object) this.createdTime, (Object) getapplogolink.createdTime) && this.hasReport == getapplogolink.hasReport;
    }

    public final int hashCode() {
        String str = this.f9923id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        getExtendDescriptionInSetting getextenddescriptioninsetting = this.user;
        int hashCode2 = (hashCode + (getextenddescriptioninsetting != null ? getextenddescriptioninsetting.hashCode() : 0)) * 31;
        String str2 = this.content;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.ownComment;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str3 = this.createdTime;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z3 = this.hasReport;
        if (!z3) {
            z2 = z3;
        }
        return i3 + (z2 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentResponse(id=");
        sb.append(this.f9923id);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", ownComment=");
        sb.append(this.ownComment);
        sb.append(", createdTime=");
        sb.append(this.createdTime);
        sb.append(", hasReport=");
        sb.append(this.hasReport);
        sb.append(")");
        return sb.toString();
    }

    public getAppLogoLink(@NotNull String str, @NotNull getExtendDescriptionInSetting getextenddescriptioninsetting, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(getextenddescriptioninsetting, "user");
        Intrinsics.checkNotNullParameter(str2, "content");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        this.f9923id = str;
        this.user = getextenddescriptioninsetting;
        this.content = str2;
        this.ownComment = z;
        this.createdTime = str3;
        this.hasReport = z2;
    }

    @NotNull
    public final String getId() {
        return this.f9923id;
    }

    @NotNull
    public final getExtendDescriptionInSetting getUser() {
        return this.user;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getOwnComment() {
        return this.ownComment;
    }

    @NotNull
    public final String getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getAppLogoLink(String str, getExtendDescriptionInSetting getextenddescriptioninsetting, String str2, boolean z, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, getextenddescriptioninsetting, str2, z, str3, (i & 32) != 0 ? false : z2);
    }

    public final boolean getHasReport() {
        return this.hasReport;
    }

    public final void setHasReport(boolean z) {
        this.hasReport = z;
    }

    @NotNull
    public final ScanDataProcessor toComment() {
        return new ScanDataProcessor(this.f9923id, this.user.toActivityReactiosUser(), this.content, this.ownComment, this.createdTime, false, 32, (DefaultConstructorMarker) null);
    }
}
