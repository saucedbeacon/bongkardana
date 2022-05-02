package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lid/dana/domain/social/model/DeleteReactionResult;", "", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RunningAverageRssiFilter {
    @NotNull
    private final String msg;

    public static /* synthetic */ RunningAverageRssiFilter copy$default(RunningAverageRssiFilter runningAverageRssiFilter, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runningAverageRssiFilter.msg;
        }
        return runningAverageRssiFilter.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.msg;
    }

    @NotNull
    public final RunningAverageRssiFilter copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        return new RunningAverageRssiFilter(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof RunningAverageRssiFilter) && Intrinsics.areEqual((Object) this.msg, (Object) ((RunningAverageRssiFilter) obj).msg);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.msg;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteReactionResult(msg=");
        sb.append(this.msg);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lid/dana/domain/social/model/AddActivityCommentInfo;", "", "id", "", "userId", "activityId", "content", "createdTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getContent", "getCreatedTime", "getId", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.RunningAverageRssiFilter$1  reason: invalid class name */
    public final class AnonymousClass1 {
        @NotNull
        private final String activityId;
        @NotNull
        private final String content;
        @NotNull
        private final String createdTime;
        @NotNull

        /* renamed from: id  reason: collision with root package name */
        private final String f9917id;
        @NotNull
        private final String userId;

        public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r3, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r3.f9917id;
            }
            if ((i & 2) != 0) {
                str2 = r3.userId;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = r3.activityId;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = r3.content;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = r3.createdTime;
            }
            return r3.copy(str, str6, str7, str8, str5);
        }

        @NotNull
        public final String component1() {
            return this.f9917id;
        }

        @NotNull
        public final String component2() {
            return this.userId;
        }

        @NotNull
        public final String component3() {
            return this.activityId;
        }

        @NotNull
        public final String component4() {
            return this.content;
        }

        @NotNull
        public final String component5() {
            return this.createdTime;
        }

        @NotNull
        public final AnonymousClass1 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "id");
            Intrinsics.checkNotNullParameter(str2, "userId");
            Intrinsics.checkNotNullParameter(str3, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(str4, "content");
            Intrinsics.checkNotNullParameter(str5, "createdTime");
            return new AnonymousClass1(str, str2, str3, str4, str5);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass1)) {
                return false;
            }
            AnonymousClass1 r3 = (AnonymousClass1) obj;
            return Intrinsics.areEqual((Object) this.f9917id, (Object) r3.f9917id) && Intrinsics.areEqual((Object) this.userId, (Object) r3.userId) && Intrinsics.areEqual((Object) this.activityId, (Object) r3.activityId) && Intrinsics.areEqual((Object) this.content, (Object) r3.content) && Intrinsics.areEqual((Object) this.createdTime, (Object) r3.createdTime);
        }

        public final int hashCode() {
            String str = this.f9917id;
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
            StringBuilder sb = new StringBuilder("AddActivityCommentInfo(id=");
            sb.append(this.f9917id);
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

        {
            Intrinsics.checkNotNullParameter(r2, "id");
            Intrinsics.checkNotNullParameter(r3, "userId");
            Intrinsics.checkNotNullParameter(r4, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
            Intrinsics.checkNotNullParameter(r5, "content");
            Intrinsics.checkNotNullParameter(r6, "createdTime");
            this.f9917id = r2;
            this.userId = r3;
            this.activityId = r4;
            this.content = r5;
            this.createdTime = r6;
        }

        @NotNull
        public final String getId() {
            return this.f9917id;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getActivityId() {
            return this.activityId;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getCreatedTime() {
            return this.createdTime;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lid/dana/domain/social/model/FeedCommentResult;", "", "comments", "", "Lid/dana/domain/social/model/Comment;", "maxId", "", "hasNext", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getComments", "()Ljava/util/List;", "setComments", "(Ljava/util/List;)V", "getHasNext", "()Z", "getMaxId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
    public final class Measurement {
        @NotNull
        private List<ScanDataProcessor> comments;
        private final boolean hasNext;
        @NotNull
        private final String maxId;

        public static /* synthetic */ Measurement copy$default(Measurement measurement, List<ScanDataProcessor> list, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = measurement.comments;
            }
            if ((i & 2) != 0) {
                str = measurement.maxId;
            }
            if ((i & 4) != 0) {
                z = measurement.hasNext;
            }
            return measurement.copy(list, str, z);
        }

        @NotNull
        public final List<ScanDataProcessor> component1() {
            return this.comments;
        }

        @NotNull
        public final String component2() {
            return this.maxId;
        }

        public final boolean component3() {
            return this.hasNext;
        }

        @NotNull
        public final Measurement copy(@NotNull List<ScanDataProcessor> list, @NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "comments");
            Intrinsics.checkNotNullParameter(str, "maxId");
            return new Measurement(list, str, z);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Measurement)) {
                return false;
            }
            Measurement measurement = (Measurement) obj;
            return Intrinsics.areEqual((Object) this.comments, (Object) measurement.comments) && Intrinsics.areEqual((Object) this.maxId, (Object) measurement.maxId) && this.hasNext == measurement.hasNext;
        }

        public final int hashCode() {
            List<ScanDataProcessor> list = this.comments;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.maxId;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.hasNext;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedCommentResult(comments=");
            sb.append(this.comments);
            sb.append(", maxId=");
            sb.append(this.maxId);
            sb.append(", hasNext=");
            sb.append(this.hasNext);
            sb.append(")");
            return sb.toString();
        }

        public Measurement(@NotNull List<ScanDataProcessor> list, @NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "comments");
            Intrinsics.checkNotNullParameter(str, "maxId");
            this.comments = list;
            this.maxId = str;
            this.hasNext = z;
        }

        @NotNull
        public final List<ScanDataProcessor> getComments() {
            return this.comments;
        }

        public final void setComments(@NotNull List<ScanDataProcessor> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.comments = list;
        }

        @NotNull
        public final String getMaxId() {
            return this.maxId;
        }

        public final boolean getHasNext() {
            return this.hasNext;
        }
    }

    public RunningAverageRssiFilter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "msg");
        this.msg = str;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }
}
