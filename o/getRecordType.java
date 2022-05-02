package o;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lid/dana/richview/statement/model/PointModel;", "", "iconArrow", "", "iconBackground", "label", "", "(IILjava/lang/String;)V", "getIconArrow", "()I", "getIconBackground", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRecordType {
    @NotNull
    public final String getMax;
    public final int length;
    public final int setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getRecordType)) {
            return false;
        }
        getRecordType getrecordtype = (getRecordType) obj;
        return this.setMin == getrecordtype.setMin && this.length == getrecordtype.length && Intrinsics.areEqual((Object) this.getMax, (Object) getrecordtype.getMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PointModel(iconArrow=");
        sb.append(this.setMin);
        sb.append(", iconBackground=");
        sb.append(this.length);
        sb.append(", label=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public getRecordType(int i, int i2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_LABEL);
        this.setMin = i;
        this.length = i2;
        this.getMax = str;
    }

    public final int hashCode() {
        int hashCode = ((Integer.valueOf(this.setMin).hashCode() * 31) + Integer.valueOf(this.length).hashCode()) * 31;
        String str = this.getMax;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
