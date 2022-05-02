package o;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/domain/twilio/model/TwilioDialogParam;", "", "dismissCount", "", "dateTimestamp", "", "(IJ)V", "getDateTimestamp", "()J", "getDismissCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class openBluetoothAdapter {
    private final long dateTimestamp;
    private final int dismissCount;

    public static /* synthetic */ openBluetoothAdapter copy$default(openBluetoothAdapter openbluetoothadapter, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = openbluetoothadapter.dismissCount;
        }
        if ((i2 & 2) != 0) {
            j = openbluetoothadapter.dateTimestamp;
        }
        return openbluetoothadapter.copy(i, j);
    }

    public final int component1() {
        return this.dismissCount;
    }

    public final long component2() {
        return this.dateTimestamp;
    }

    @NotNull
    public final openBluetoothAdapter copy(int i, long j) {
        return new openBluetoothAdapter(i, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof openBluetoothAdapter)) {
            return false;
        }
        openBluetoothAdapter openbluetoothadapter = (openBluetoothAdapter) obj;
        return this.dismissCount == openbluetoothadapter.dismissCount && this.dateTimestamp == openbluetoothadapter.dateTimestamp;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TwilioDialogParam(dismissCount=");
        sb.append(this.dismissCount);
        sb.append(", dateTimestamp=");
        sb.append(this.dateTimestamp);
        sb.append(")");
        return sb.toString();
    }

    public openBluetoothAdapter(int i, long j) {
        this.dismissCount = i;
        this.dateTimestamp = j;
    }

    public final long getDateTimestamp() {
        return this.dateTimestamp;
    }

    public final int getDismissCount() {
        return this.dismissCount;
    }

    public final int hashCode() {
        return (Integer.valueOf(this.dismissCount).hashCode() * 31) + Long.valueOf(this.dateTimestamp).hashCode();
    }
}
