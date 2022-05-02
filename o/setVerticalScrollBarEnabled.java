package o;

import com.alibaba.fastjson.annotation.JSONCreator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J/\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "", "enable", "", "name", "", "permission", "", "(ZLjava/lang/String;Ljava/util/List;)V", "getEnable", "()Z", "setEnable", "(Z)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPermission", "()Ljava/util/List;", "setPermission", "(Ljava/util/List;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setVerticalScrollBarEnabled {
    private boolean enable;
    @NotNull
    private String name;
    @Nullable
    private List<String> permission;

    @JSONCreator
    public setVerticalScrollBarEnabled() {
        this(false, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setVerticalScrollBarEnabled copy$default(setVerticalScrollBarEnabled setverticalscrollbarenabled, boolean z, String str, List<String> list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = setverticalscrollbarenabled.enable;
        }
        if ((i & 2) != 0) {
            str = setverticalscrollbarenabled.name;
        }
        if ((i & 4) != 0) {
            list = setverticalscrollbarenabled.permission;
        }
        return setverticalscrollbarenabled.copy(z, str, list);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final List<String> component3() {
        return this.permission;
    }

    @NotNull
    public final setVerticalScrollBarEnabled copy(boolean z, @NotNull String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        return new setVerticalScrollBarEnabled(z, str, list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setVerticalScrollBarEnabled)) {
            return false;
        }
        setVerticalScrollBarEnabled setverticalscrollbarenabled = (setVerticalScrollBarEnabled) obj;
        return this.enable == setverticalscrollbarenabled.enable && Intrinsics.areEqual((Object) this.name, (Object) setverticalscrollbarenabled.name) && Intrinsics.areEqual((Object) this.permission, (Object) setverticalscrollbarenabled.permission);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.name;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.permission;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalSearchCategory(enable=");
        sb.append(this.enable);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", permission=");
        sb.append(this.permission);
        sb.append(")");
        return sb.toString();
    }

    @JSONCreator
    public setVerticalScrollBarEnabled(boolean z, @NotNull String str, @Nullable List<String> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        this.enable = z;
        this.name = str;
        this.permission = list;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setVerticalScrollBarEnabled(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    @Nullable
    public final List<String> getPermission() {
        return this.permission;
    }

    public final void setPermission(@Nullable List<String> list) {
        this.permission = list;
    }
}
