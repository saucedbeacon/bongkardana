package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lid/dana/requestmoney/model/RequestMoneyInfoModel;", "", "minAmount", "", "maxAmount", "(II)V", "getMaxAmount", "()I", "setMaxAmount", "(I)V", "getMinAmount", "setMinAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2900 {
    public int getMin;
    public int length;

    public access$2900() {
        this((byte) 0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2900)) {
            return false;
        }
        access$2900 access_2900 = (access$2900) obj;
        return this.length == access_2900.length && this.getMin == access_2900.getMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestMoneyInfoModel(minAmount=");
        sb.append(this.length);
        sb.append(", maxAmount=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public access$2900(int i, int i2) {
        this.length = i;
        this.getMin = i2;
    }

    private /* synthetic */ access$2900(byte b) {
        this(0, 0);
    }

    public final int hashCode() {
        return (Integer.valueOf(this.length).hashCode() * 31) + Integer.valueOf(this.getMin).hashCode();
    }
}
