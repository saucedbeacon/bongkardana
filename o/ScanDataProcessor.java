package o;

import id.dana.domain.social.InitStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lid/dana/domain/social/model/Comment;", "", "id", "", "user", "Lid/dana/domain/social/model/ActivityReactionsUser;", "content", "ownComment", "", "createdTime", "hasReport", "(Ljava/lang/String;Lid/dana/domain/social/model/ActivityReactionsUser;Ljava/lang/String;ZLjava/lang/String;Z)V", "getContent", "()Ljava/lang/String;", "getCreatedTime", "getHasReport", "()Z", "setHasReport", "(Z)V", "getId", "getOwnComment", "getUser", "()Lid/dana/domain/social/model/ActivityReactionsUser;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ScanDataProcessor {
    @NotNull
    private final String content;
    @NotNull
    private final String createdTime;
    private boolean hasReport;
    @NotNull

    /* renamed from: id  reason: collision with root package name */
    private final String f9918id;
    private final boolean ownComment;
    @NotNull
    private final markOutsideIfExpired user;

    public static /* synthetic */ ScanDataProcessor copy$default(ScanDataProcessor scanDataProcessor, String str, markOutsideIfExpired markoutsideifexpired, String str2, boolean z, String str3, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scanDataProcessor.f9918id;
        }
        if ((i & 2) != 0) {
            markoutsideifexpired = scanDataProcessor.user;
        }
        markOutsideIfExpired markoutsideifexpired2 = markoutsideifexpired;
        if ((i & 4) != 0) {
            str2 = scanDataProcessor.content;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z = scanDataProcessor.ownComment;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            str3 = scanDataProcessor.createdTime;
        }
        String str5 = str3;
        if ((i & 32) != 0) {
            z2 = scanDataProcessor.hasReport;
        }
        return scanDataProcessor.copy(str, markoutsideifexpired2, str4, z3, str5, z2);
    }

    @NotNull
    public final String component1() {
        return this.f9918id;
    }

    @NotNull
    public final markOutsideIfExpired component2() {
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
    public final ScanDataProcessor copy(@NotNull String str, @NotNull markOutsideIfExpired markoutsideifexpired, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(markoutsideifexpired, "user");
        Intrinsics.checkNotNullParameter(str2, "content");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        return new ScanDataProcessor(str, markoutsideifexpired, str2, z, str3, z2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanDataProcessor)) {
            return false;
        }
        ScanDataProcessor scanDataProcessor = (ScanDataProcessor) obj;
        return Intrinsics.areEqual((Object) this.f9918id, (Object) scanDataProcessor.f9918id) && Intrinsics.areEqual((Object) this.user, (Object) scanDataProcessor.user) && Intrinsics.areEqual((Object) this.content, (Object) scanDataProcessor.content) && this.ownComment == scanDataProcessor.ownComment && Intrinsics.areEqual((Object) this.createdTime, (Object) scanDataProcessor.createdTime) && this.hasReport == scanDataProcessor.hasReport;
    }

    public final int hashCode() {
        String str = this.f9918id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        markOutsideIfExpired markoutsideifexpired = this.user;
        int hashCode2 = (hashCode + (markoutsideifexpired != null ? markoutsideifexpired.hashCode() : 0)) * 31;
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
        StringBuilder sb = new StringBuilder("Comment(id=");
        sb.append(this.f9918id);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lid/dana/domain/social/model/FeedInit;", "", "initProgress", "", "status", "Lid/dana/domain/social/InitStatus;", "(ILid/dana/domain/social/InitStatus;)V", "getInitProgress", "()I", "getStatus", "()Lid/dana/domain/social/InitStatus;", "toInitFeed", "Lid/dana/domain/social/model/InitFeed;", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class ScanData {
        private final int initProgress;
        @NotNull
        private final InitStatus status;

        public ScanData() {
            this(0, (InitStatus) null, 3, (DefaultConstructorMarker) null);
        }

        public ScanData(int i, @NotNull InitStatus initStatus) {
            Intrinsics.checkNotNullParameter(initStatus, "status");
            this.initProgress = i;
            this.status = initStatus;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ScanData(int i, InitStatus initStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? InitStatus.INIT : initStatus);
        }

        public final int getInitProgress() {
            return this.initProgress;
        }

        @NotNull
        public final InitStatus getStatus() {
            return this.status;
        }

        @NotNull
        public final setBeaconParsers toInitFeed() {
            return new setBeaconParsers(this.status, this.initProgress, (Exception) null, false, 12, (DefaultConstructorMarker) null);
        }
    }

    public ScanDataProcessor(@NotNull String str, @NotNull markOutsideIfExpired markoutsideifexpired, @NotNull String str2, boolean z, @NotNull String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(markoutsideifexpired, "user");
        Intrinsics.checkNotNullParameter(str2, "content");
        Intrinsics.checkNotNullParameter(str3, "createdTime");
        this.f9918id = str;
        this.user = markoutsideifexpired;
        this.content = str2;
        this.ownComment = z;
        this.createdTime = str3;
        this.hasReport = z2;
    }

    @NotNull
    public final String getId() {
        return this.f9918id;
    }

    @NotNull
    public final markOutsideIfExpired getUser() {
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
    public /* synthetic */ ScanDataProcessor(String str, markOutsideIfExpired markoutsideifexpired, String str2, boolean z, String str3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, markoutsideifexpired, str2, z, str3, (i & 32) != 0 ? false : z2);
    }

    public final boolean getHasReport() {
        return this.hasReport;
    }

    public final void setHasReport(boolean z) {
        this.hasReport = z;
    }
}
