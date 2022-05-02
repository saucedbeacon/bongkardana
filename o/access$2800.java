package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lid/dana/requestmoney/model/QrUserBankModel;", "", "qrCode", "", "expireTimeInSecond", "", "expireDateTimestamp", "(Ljava/lang/String;JJ)V", "getExpireDateTimestamp", "()J", "getExpireTimeInSecond", "formattedExpiryDateTime", "getFormattedExpiryDateTime", "()Ljava/lang/String;", "getQrCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2800 {
    public final long getMax;
    @NotNull
    public final String length;
    public final long setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2800)) {
            return false;
        }
        access$2800 access_2800 = (access$2800) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) access_2800.length) && this.setMin == access_2800.setMin && this.getMax == access_2800.getMax;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("QrUserBankModel(qrCode=");
        sb.append(this.length);
        sb.append(", expireTimeInSecond=");
        sb.append(this.setMin);
        sb.append(", expireDateTimestamp=");
        sb.append(this.getMax);
        sb.append(")");
        return sb.toString();
    }

    public access$2800(@NotNull String str, long j, long j2) {
        Intrinsics.checkNotNullParameter(str, "qrCode");
        this.length = str;
        this.setMin = j;
        this.getMax = j2;
    }

    public final int hashCode() {
        String str = this.length;
        return ((((str != null ? str.hashCode() : 0) * 31) + Long.valueOf(this.setMin).hashCode()) * 31) + Long.valueOf(this.getMax).hashCode();
    }
}
