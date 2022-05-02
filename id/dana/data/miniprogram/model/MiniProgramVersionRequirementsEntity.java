package id.dana.data.miniprogram.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lid/dana/data/miniprogram/model/MiniProgramVersionRequirementsEntity;", "", "minAppVersion", "", "minAndroidVersion", "(Ljava/lang/String;Ljava/lang/String;)V", "getMinAndroidVersion", "()Ljava/lang/String;", "setMinAndroidVersion", "(Ljava/lang/String;)V", "getMinAppVersion", "setMinAppVersion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class MiniProgramVersionRequirementsEntity {
    @NotNull
    private String minAndroidVersion;
    @NotNull
    private String minAppVersion;

    public MiniProgramVersionRequirementsEntity() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public MiniProgramVersionRequirementsEntity(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "minAppVersion");
        Intrinsics.checkNotNullParameter(str2, "minAndroidVersion");
        this.minAppVersion = str;
        this.minAndroidVersion = str2;
    }

    @NotNull
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final void setMinAppVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minAppVersion = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiniProgramVersionRequirementsEntity(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final String getMinAndroidVersion() {
        return this.minAndroidVersion;
    }

    public final void setMinAndroidVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minAndroidVersion = str;
    }
}
