package o;

import android.content.Context;
import o.GriverRVAppUpdaterImpl;
import o.MovableFrameLayout;
import o.ScanBridgeExtension;
import o.b;
import o.onAction;

public final class IRecordListener implements getAdapterPosition<CaptureListener> {
    private final b.C0007b<onAction.length> IsOverlapping;
    private final b.C0007b<StorageBridgeExtension> equals;
    private final b.C0007b<MovableFrameLayout.AnonymousClass1> getMax;
    private final b.C0007b<GriverRVAppUpdaterImpl.AnonymousClass1> getMin;
    private final b.C0007b<GriverRVAppInfoManagerImpl> isInside;
    private final b.C0007b<BluetoothManifest> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<ScanBridgeExtension.AnonymousClass1> setMin;
    private final b.C0007b<getTotalSize> toFloatRange;

    private IRecordListener(b.C0007b<Context> bVar, b.C0007b<ScanBridgeExtension.AnonymousClass1> bVar2, b.C0007b<BluetoothManifest> bVar3, b.C0007b<MovableFrameLayout.AnonymousClass1> bVar4, b.C0007b<GriverRVAppUpdaterImpl.AnonymousClass1> bVar5, b.C0007b<GriverRVAppInfoManagerImpl> bVar6, b.C0007b<StorageBridgeExtension> bVar7, b.C0007b<getTotalSize> bVar8, b.C0007b<onAction.length> bVar9) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
        this.getMax = bVar4;
        this.getMin = bVar5;
        this.isInside = bVar6;
        this.equals = bVar7;
        this.toFloatRange = bVar8;
        this.IsOverlapping = bVar9;
    }

    public static IRecordListener setMin(b.C0007b<Context> bVar, b.C0007b<ScanBridgeExtension.AnonymousClass1> bVar2, b.C0007b<BluetoothManifest> bVar3, b.C0007b<MovableFrameLayout.AnonymousClass1> bVar4, b.C0007b<GriverRVAppUpdaterImpl.AnonymousClass1> bVar5, b.C0007b<GriverRVAppInfoManagerImpl> bVar6, b.C0007b<StorageBridgeExtension> bVar7, b.C0007b<getTotalSize> bVar8, b.C0007b<onAction.length> bVar9) {
        return new IRecordListener(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public final /* synthetic */ Object get() {
        return new CaptureListener(this.setMax.get(), this.setMin.get(), this.length.get(), this.getMax.get(), this.getMin.get(), this.isInside.get(), this.equals.get(), this.toFloatRange.get(), this.IsOverlapping.get());
    }
}
