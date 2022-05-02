package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CaptureBtn;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/savings/model/SavingEmptyStateModel;", "", "mainEmptyStateModel", "Lid/dana/savings/model/MainEmptyStateModel;", "savingBenefitModel", "", "Lid/dana/savings/model/SavingBenefitModel;", "(Lid/dana/savings/model/MainEmptyStateModel;Ljava/util/List;)V", "getMainEmptyStateModel", "()Lid/dana/savings/model/MainEmptyStateModel;", "getSavingBenefitModel", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onSurfaceTextureSizeChanged {
    @NotNull
    public final List<CaptureBtn.AnonymousClass1> setMax;
    @NotNull
    public final CaptureBtn.Type setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onSurfaceTextureSizeChanged)) {
            return false;
        }
        onSurfaceTextureSizeChanged onsurfacetexturesizechanged = (onSurfaceTextureSizeChanged) obj;
        return Intrinsics.areEqual((Object) this.setMin, (Object) onsurfacetexturesizechanged.setMin) && Intrinsics.areEqual((Object) this.setMax, (Object) onsurfacetexturesizechanged.setMax);
    }

    public final int hashCode() {
        CaptureBtn.Type type = this.setMin;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        List<CaptureBtn.AnonymousClass1> list = this.setMax;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SavingEmptyStateModel(mainEmptyStateModel=");
        sb.append(this.setMin);
        sb.append(", savingBenefitModel=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    public onSurfaceTextureSizeChanged(@NotNull CaptureBtn.Type type, @NotNull List<CaptureBtn.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(type, "mainEmptyStateModel");
        Intrinsics.checkNotNullParameter(list, "savingBenefitModel");
        this.setMin = type;
        this.setMax = list;
    }
}
