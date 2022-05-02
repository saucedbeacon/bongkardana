package id.dana.domain.profilemenu.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lid/dana/domain/profilemenu/model/ProfileCompletion;", "Lid/dana/domain/profilemenu/model/SettingModel;", "currentTaskTitle", "", "taskCount", "", "completedTaskCount", "(Ljava/lang/String;II)V", "getCompletedTaskCount", "()I", "setCompletedTaskCount", "(I)V", "getCurrentTaskTitle", "()Ljava/lang/String;", "setCurrentTaskTitle", "(Ljava/lang/String;)V", "getTaskCount", "setTaskCount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class ProfileCompletion extends SettingModel {
    @NotNull
    public static final setMax Companion = new setMax((DefaultConstructorMarker) null);
    public static final int ITEM_COUNT = 5;
    private int completedTaskCount;
    @NotNull
    private String currentTaskTitle;
    private int taskCount;

    public ProfileCompletion() {
        this((String) null, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ProfileCompletion copy$default(ProfileCompletion profileCompletion, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = profileCompletion.currentTaskTitle;
        }
        if ((i3 & 2) != 0) {
            i = profileCompletion.taskCount;
        }
        if ((i3 & 4) != 0) {
            i2 = profileCompletion.completedTaskCount;
        }
        return profileCompletion.copy(str, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.currentTaskTitle;
    }

    public final int component2() {
        return this.taskCount;
    }

    public final int component3() {
        return this.completedTaskCount;
    }

    @NotNull
    public final ProfileCompletion copy(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "currentTaskTitle");
        return new ProfileCompletion(str, i, i2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCompletion)) {
            return false;
        }
        ProfileCompletion profileCompletion = (ProfileCompletion) obj;
        return Intrinsics.areEqual((Object) this.currentTaskTitle, (Object) profileCompletion.currentTaskTitle) && this.taskCount == profileCompletion.taskCount && this.completedTaskCount == profileCompletion.completedTaskCount;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileCompletion(currentTaskTitle=");
        sb.append(this.currentTaskTitle);
        sb.append(", taskCount=");
        sb.append(this.taskCount);
        sb.append(", completedTaskCount=");
        sb.append(this.completedTaskCount);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getCurrentTaskTitle() {
        return this.currentTaskTitle;
    }

    public final void setCurrentTaskTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentTaskTitle = str;
    }

    public final int getTaskCount() {
        return this.taskCount;
    }

    public final void setTaskCount(int i) {
        this.taskCount = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProfileCompletion(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final int getCompletedTaskCount() {
        return this.completedTaskCount;
    }

    public final void setCompletedTaskCount(int i) {
        this.completedTaskCount = i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/profilemenu/model/ProfileCompletion$Companion;", "", "()V", "ITEM_COUNT", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProfileCompletion(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "currentTaskTitle");
        this.currentTaskTitle = str;
        this.taskCount = i;
        this.completedTaskCount = i2;
    }

    public final int hashCode() {
        String str = this.currentTaskTitle;
        return ((((str != null ? str.hashCode() : 0) * 31) + Integer.valueOf(this.taskCount).hashCode()) * 31) + Integer.valueOf(this.completedTaskCount).hashCode();
    }
}
