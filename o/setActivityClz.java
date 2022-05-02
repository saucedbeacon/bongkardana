package o;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lid/dana/data/profilemenu/model/ChangeUsernameEntity;", "Ljava/io/Serializable;", "title", "", "action", "enable", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getAction", "()Ljava/lang/String;", "getEnable", "()Z", "getTitle", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toSettingEntity", "Lid/dana/data/profilemenu/model/SettingEntity;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setActivityClz implements Serializable {
    @NotNull
    private final String action;
    private final boolean enable;
    @NotNull
    private final String title;

    public setActivityClz() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setActivityClz copy$default(setActivityClz setactivityclz, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setactivityclz.title;
        }
        if ((i & 2) != 0) {
            str2 = setactivityclz.action;
        }
        if ((i & 4) != 0) {
            z = setactivityclz.enable;
        }
        return setactivityclz.copy(str, str2, z);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.action;
    }

    public final boolean component3() {
        return this.enable;
    }

    @NotNull
    public final setActivityClz copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "action");
        return new setActivityClz(str, str2, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setActivityClz)) {
            return false;
        }
        setActivityClz setactivityclz = (setActivityClz) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) setactivityclz.title) && Intrinsics.areEqual((Object) this.action, (Object) setactivityclz.action) && this.enable == setactivityclz.enable;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeUsernameEntity(title=");
        sb.append(this.title);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", enable=");
        sb.append(this.enable);
        sb.append(")");
        return sb.toString();
    }

    public setActivityClz(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "action");
        this.title = str;
        this.action = str2;
        this.enable = z;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setActivityClz(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final getActivityClz toSettingEntity() {
        getActivityClz getactivityclz = new getActivityClz();
        getactivityclz.setTitle(this.title);
        getactivityclz.setAction(this.action);
        getactivityclz.setEnable(this.enable);
        return getactivityclz;
    }
}
