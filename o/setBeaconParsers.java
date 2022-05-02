package o;

import id.dana.domain.social.InitStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ScanDataProcessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\r\u0010\u0018\u001a\u00060\u0007j\u0002`\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0002J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lid/dana/domain/social/model/InitFeed;", "", "status", "Lid/dana/domain/social/InitStatus;", "initProgress", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hasRestrictedContact", "", "(Lid/dana/domain/social/InitStatus;ILjava/lang/Exception;Z)V", "getError", "()Ljava/lang/Exception;", "getHasRestrictedContact", "()Z", "setHasRestrictedContact", "(Z)V", "getInitProgress", "()I", "getStatus", "()Lid/dana/domain/social/InitStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "isError", "isFinished", "toFeedInit", "Lid/dana/domain/social/model/FeedInit;", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class setBeaconParsers {
    @NotNull
    private final Exception error;
    private boolean hasRestrictedContact;
    private final int initProgress;
    @NotNull
    private final InitStatus status;

    public static /* synthetic */ setBeaconParsers copy$default(setBeaconParsers setbeaconparsers, InitStatus initStatus, int i, Exception exc, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            initStatus = setbeaconparsers.status;
        }
        if ((i2 & 2) != 0) {
            i = setbeaconparsers.initProgress;
        }
        if ((i2 & 4) != 0) {
            exc = setbeaconparsers.error;
        }
        if ((i2 & 8) != 0) {
            z = setbeaconparsers.hasRestrictedContact;
        }
        return setbeaconparsers.copy(initStatus, i, exc, z);
    }

    @NotNull
    public final InitStatus component1() {
        return this.status;
    }

    public final int component2() {
        return this.initProgress;
    }

    @NotNull
    public final Exception component3() {
        return this.error;
    }

    public final boolean component4() {
        return this.hasRestrictedContact;
    }

    @NotNull
    public final setBeaconParsers copy(@NotNull InitStatus initStatus, int i, @NotNull Exception exc, boolean z) {
        Intrinsics.checkNotNullParameter(initStatus, "status");
        Intrinsics.checkNotNullParameter(exc, "error");
        return new setBeaconParsers(initStatus, i, exc, z);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("InitFeed(status=");
        sb.append(this.status);
        sb.append(", initProgress=");
        sb.append(this.initProgress);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", hasRestrictedContact=");
        sb.append(this.hasRestrictedContact);
        sb.append(")");
        return sb.toString();
    }

    public setBeaconParsers(@NotNull InitStatus initStatus, int i, @NotNull Exception exc, boolean z) {
        Intrinsics.checkNotNullParameter(initStatus, "status");
        Intrinsics.checkNotNullParameter(exc, "error");
        this.status = initStatus;
        this.initProgress = i;
        this.error = exc;
        this.hasRestrictedContact = z;
    }

    @NotNull
    public final InitStatus getStatus() {
        return this.status;
    }

    public final int getInitProgress() {
        return this.initProgress;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setBeaconParsers(InitStatus initStatus, int i, Exception exc, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(initStatus, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new Exception() : exc, (i2 & 8) != 0 ? false : z);
    }

    @NotNull
    public final Exception getError() {
        return this.error;
    }

    public final boolean getHasRestrictedContact() {
        return this.hasRestrictedContact;
    }

    public final void setHasRestrictedContact(boolean z) {
        this.hasRestrictedContact = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof setBeaconParsers)) {
            return false;
        }
        setBeaconParsers setbeaconparsers = (setBeaconParsers) obj;
        if (this.status == setbeaconparsers.status && this.initProgress == setbeaconparsers.initProgress) {
            return true;
        }
        return false;
    }

    public final boolean isFinished() {
        return this.status == InitStatus.FINISH;
    }

    @NotNull
    public final ScanDataProcessor.ScanData toFeedInit() {
        return new ScanDataProcessor.ScanData(this.initProgress, this.status);
    }

    public final boolean isError() {
        return this.status == InitStatus.ERROR;
    }

    public final int hashCode() {
        InitStatus initStatus = this.status;
        int i = 0;
        int hashCode = (((initStatus != null ? initStatus.hashCode() : 0) * 31) + Integer.valueOf(this.initProgress).hashCode()) * 31;
        Exception exc = this.error;
        if (exc != null) {
            i = exc.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.hasRestrictedContact;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
