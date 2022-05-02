package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lid/dana/data/social/model/UsernameCheck;", "", "username", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "getUsername", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class j {
    @NotNull
    private String errorMessage;
    @NotNull
    private final String username;

    public static /* synthetic */ j copy$default(j jVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jVar.username;
        }
        if ((i & 2) != 0) {
            str2 = jVar.errorMessage;
        }
        return jVar.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.username;
    }

    @NotNull
    public final String component2() {
        return this.errorMessage;
    }

    @NotNull
    public final j copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        return new j(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual((Object) this.username, (Object) jVar.username) && Intrinsics.areEqual((Object) this.errorMessage, (Object) jVar.errorMessage);
    }

    public final int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.errorMessage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UsernameCheck(username=");
        sb.append(this.username);
        sb.append(", errorMessage=");
        sb.append(this.errorMessage);
        sb.append(")");
        return sb.toString();
    }

    public j(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.USERNAME_KEY);
        Intrinsics.checkNotNullParameter(str2, "errorMessage");
        this.username = str;
        this.errorMessage = str2;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    @NotNull
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMessage = str;
    }
}
