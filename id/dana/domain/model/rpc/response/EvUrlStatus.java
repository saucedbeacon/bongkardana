package id.dana.domain.model.rpc.response;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.richview.CurrencyTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006#"}, d2 = {"Lid/dana/domain/model/rpc/response/EvUrlStatus;", "Landroid/os/Parcelable;", "callTime", "", "called", "", "complete", "(JZZ)V", "getCallTime", "()J", "setCallTime", "(J)V", "getCalled", "()Z", "setCalled", "(Z)V", "getComplete", "setComplete", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "domain_release"}, k = 1, mv = {1, 4, 2})
@Parcelize
public final class EvUrlStatus implements Parcelable {
    public static final Parcelable.Creator<EvUrlStatus> CREATOR = new setMin();
    private long callTime;
    private boolean called;
    private boolean complete;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public static class setMin implements Parcelable.Creator<EvUrlStatus> {
        @NotNull
        public final EvUrlStatus createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
            long readLong = parcel.readLong();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new EvUrlStatus(readLong, z2, z);
        }

        @NotNull
        public final EvUrlStatus[] newArray(int i) {
            return new EvUrlStatus[i];
        }
    }

    public static /* synthetic */ EvUrlStatus copy$default(EvUrlStatus evUrlStatus, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = evUrlStatus.callTime;
        }
        if ((i & 2) != 0) {
            z = evUrlStatus.called;
        }
        if ((i & 4) != 0) {
            z2 = evUrlStatus.complete;
        }
        return evUrlStatus.copy(j, z, z2);
    }

    public final long component1() {
        return this.callTime;
    }

    public final boolean component2() {
        return this.called;
    }

    public final boolean component3() {
        return this.complete;
    }

    @NotNull
    public final EvUrlStatus copy(long j, boolean z, boolean z2) {
        return new EvUrlStatus(j, z, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvUrlStatus)) {
            return false;
        }
        EvUrlStatus evUrlStatus = (EvUrlStatus) obj;
        return this.callTime == evUrlStatus.callTime && this.called == evUrlStatus.called && this.complete == evUrlStatus.complete;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EvUrlStatus(callTime=");
        sb.append(this.callTime);
        sb.append(", called=");
        sb.append(this.called);
        sb.append(", complete=");
        sb.append(this.complete);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.callTime);
        parcel.writeInt(this.called ? 1 : 0);
        parcel.writeInt(this.complete ? 1 : 0);
    }

    public EvUrlStatus(long j, boolean z, boolean z2) {
        this.callTime = j;
        this.called = z;
        this.complete = z2;
    }

    public final long getCallTime() {
        return this.callTime;
    }

    public final void setCallTime(long j) {
        this.callTime = j;
    }

    public final boolean getCalled() {
        return this.called;
    }

    public final void setCalled(boolean z) {
        this.called = z;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final void setComplete(boolean z) {
        this.complete = z;
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.callTime).hashCode() * 31;
        boolean z = this.called;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.complete;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }
}
