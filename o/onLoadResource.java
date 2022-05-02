package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lid/dana/domain/featureconfig/model/SplashAnimationConfig;", "", "enable", "", "animationFile", "", "(ZLjava/lang/String;)V", "getAnimationFile", "()Ljava/lang/String;", "getEnable", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onLoadResource {
    @NotNull
    private final String animationFile;
    private final boolean enable;

    public static /* synthetic */ onLoadResource copy$default(onLoadResource onloadresource, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = onloadresource.enable;
        }
        if ((i & 2) != 0) {
            str = onloadresource.animationFile;
        }
        return onloadresource.copy(z, str);
    }

    public final boolean component1() {
        return this.enable;
    }

    @NotNull
    public final String component2() {
        return this.animationFile;
    }

    @NotNull
    public final onLoadResource copy(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "animationFile");
        return new onLoadResource(z, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onLoadResource)) {
            return false;
        }
        onLoadResource onloadresource = (onLoadResource) obj;
        return this.enable == onloadresource.enable && Intrinsics.areEqual((Object) this.animationFile, (Object) onloadresource.animationFile);
    }

    public final int hashCode() {
        boolean z = this.enable;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.animationFile;
        return i + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SplashAnimationConfig(enable=");
        sb.append(this.enable);
        sb.append(", animationFile=");
        sb.append(this.animationFile);
        sb.append(")");
        return sb.toString();
    }

    public onLoadResource(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "animationFile");
        this.enable = z;
        this.animationFile = str;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getAnimationFile() {
        return this.animationFile;
    }
}
