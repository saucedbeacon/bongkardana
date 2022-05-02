package o;

import o.PrepareException;
import o.RenderLoadingStatusChangePoint;
import o.b;

class getInputStream$FastBitmap$CoordinateSystem implements b.C0007b<RenderLoadingStatusChangePoint.LoadingStatusChangeListener> {
    private final PrepareException.AnonymousClass1 getMax;

    getInputStream$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        RenderLoadingStatusChangePoint.LoadingStatusChangeListener sendMediaButton = this.getMax.sendMediaButton();
        if (sendMediaButton != null) {
            return sendMediaButton;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
