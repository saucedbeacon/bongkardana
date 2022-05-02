package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0018"}, d2 = {"Lid/dana/common/model/OptionModel;", "", "name", "", "data", "enabled", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getData", "()Ljava/lang/String;", "getEnabled", "()Z", "setEnabled", "(Z)V", "getName", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isLayoutRtlSupport {
    public boolean getMax = false;
    @NotNull
    public final String setMax;
    @NotNull
    public final String setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isLayoutRtlSupport)) {
            return false;
        }
        isLayoutRtlSupport islayoutrtlsupport = (isLayoutRtlSupport) obj;
        return Intrinsics.areEqual((Object) this.setMax, (Object) islayoutrtlsupport.setMax) && Intrinsics.areEqual((Object) this.setMin, (Object) islayoutrtlsupport.setMin) && this.getMax == islayoutrtlsupport.getMax;
    }

    public final int hashCode() {
        String str = this.setMax;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.setMin;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.getMax;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionModel(name=");
        sb.append(this.setMax);
        sb.append(", data=");
        sb.append(this.setMin);
        sb.append(", enabled=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public isLayoutRtlSupport(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "data");
        this.setMax = str;
        this.setMin = str2;
    }

    public final boolean setMin() {
        return this.getMax;
    }
}
