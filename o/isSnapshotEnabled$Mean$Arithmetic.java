package o;

import o.PrepareException;
import o.RenderLoadingStatusChangePoint;
import o.b;

class isSnapshotEnabled$Mean$Arithmetic implements b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> {
    private final PrepareException.AnonymousClass1 length;

    isSnapshotEnabled$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        RenderLoadingStatusChangePoint.LoadingStatusChangeListener sendMediaButton = this.length.sendMediaButton();
        if (sendMediaButton != null) {
            return sendMediaButton;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
