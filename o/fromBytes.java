package o;

import com.alibaba.ariver.kernel.RVParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/domain/sendmoney/x2l/model/SocialLink;", "", "title", "", "subTitle", "action", "icon", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getIcon", "getSubTitle", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class fromBytes {
    @NotNull
    private final String action;
    @NotNull
    private final String icon;
    @NotNull
    private final String subTitle;
    @NotNull
    private final String title;

    public static /* synthetic */ fromBytes copy$default(fromBytes frombytes, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frombytes.title;
        }
        if ((i & 2) != 0) {
            str2 = frombytes.subTitle;
        }
        if ((i & 4) != 0) {
            str3 = frombytes.action;
        }
        if ((i & 8) != 0) {
            str4 = frombytes.icon;
        }
        return frombytes.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.subTitle;
    }

    @NotNull
    public final String component3() {
        return this.action;
    }

    @NotNull
    public final String component4() {
        return this.icon;
    }

    @NotNull
    public final fromBytes copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, RVParams.LONG_SUB_TITLE);
        Intrinsics.checkNotNullParameter(str3, "action");
        Intrinsics.checkNotNullParameter(str4, "icon");
        return new fromBytes(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromBytes)) {
            return false;
        }
        fromBytes frombytes = (fromBytes) obj;
        return Intrinsics.areEqual((Object) this.title, (Object) frombytes.title) && Intrinsics.areEqual((Object) this.subTitle, (Object) frombytes.subTitle) && Intrinsics.areEqual((Object) this.action, (Object) frombytes.action) && Intrinsics.areEqual((Object) this.icon, (Object) frombytes.icon);
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subTitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.action;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.icon;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialLink(title=");
        sb.append(this.title);
        sb.append(", subTitle=");
        sb.append(this.subTitle);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(")");
        return sb.toString();
    }

    public fromBytes(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, RVParams.LONG_SUB_TITLE);
        Intrinsics.checkNotNullParameter(str3, "action");
        Intrinsics.checkNotNullParameter(str4, "icon");
        this.title = str;
        this.subTitle = str2;
        this.action = str3;
        this.icon = str4;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }
}
