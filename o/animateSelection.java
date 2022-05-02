package o;

import android.content.Context;
import o.BeaconManager;
import o.PhotoResolver;
import o.SaveImageToAlbumBridgeExtension;
import o.b;
import o.setProxy;

public final class animateSelection implements getAdapterPosition<getPhotoPreview> {
    private final b.C0007b<setMaxTrackingAge> IsOverlapping;
    private final b.C0007b<isAnyConsumerBound> equals;
    private final b.C0007b<SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1> getMax;
    private final b.C0007b<PhotoResolver.AnonymousClass1> getMin;
    private final b.C0007b<BeaconManager.ConsumerInfo> hashCode;
    private final b.C0007b<getBackgroundMode> isInside;
    private final b.C0007b<getAppByUrl> length;
    private final b.C0007b<BeaconManager.BeaconServiceConnection> setMax;
    private final b.C0007b<Context> setMin;
    private final b.C0007b<requestStateForRegion> toDoubleRange;
    private final b.C0007b<setProxy.setMax> toFloatRange;
    private final b.C0007b<canGoBack> toIntRange;

    private animateSelection(b.C0007b<Context> bVar, b.C0007b<BeaconManager.BeaconServiceConnection> bVar2, b.C0007b<PhotoResolver.AnonymousClass1> bVar3, b.C0007b<SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1> bVar4, b.C0007b<getAppByUrl> bVar5, b.C0007b<setProxy.setMax> bVar6, b.C0007b<getBackgroundMode> bVar7, b.C0007b<isAnyConsumerBound> bVar8, b.C0007b<setMaxTrackingAge> bVar9, b.C0007b<canGoBack> bVar10, b.C0007b<requestStateForRegion> bVar11, b.C0007b<BeaconManager.ConsumerInfo> bVar12) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMin = bVar3;
        this.getMax = bVar4;
        this.length = bVar5;
        this.toFloatRange = bVar6;
        this.isInside = bVar7;
        this.equals = bVar8;
        this.IsOverlapping = bVar9;
        this.toIntRange = bVar10;
        this.toDoubleRange = bVar11;
        this.hashCode = bVar12;
    }

    public static animateSelection getMin(b.C0007b<Context> bVar, b.C0007b<BeaconManager.BeaconServiceConnection> bVar2, b.C0007b<PhotoResolver.AnonymousClass1> bVar3, b.C0007b<SaveImageToAlbumBridgeExtension.ImageSaveRunner.AnonymousClass1> bVar4, b.C0007b<getAppByUrl> bVar5, b.C0007b<setProxy.setMax> bVar6, b.C0007b<getBackgroundMode> bVar7, b.C0007b<isAnyConsumerBound> bVar8, b.C0007b<setMaxTrackingAge> bVar9, b.C0007b<canGoBack> bVar10, b.C0007b<requestStateForRegion> bVar11, b.C0007b<BeaconManager.ConsumerInfo> bVar12) {
        return new animateSelection(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12);
    }

    public final /* synthetic */ Object get() {
        return new getPhotoPreview(this.setMin.get(), this.setMax.get(), this.getMin.get(), this.getMax.get(), this.length.get(), this.toFloatRange.get(), this.isInside.get(), this.equals.get(), this.IsOverlapping.get(), this.toIntRange.get(), this.toDoubleRange.get(), this.hashCode.get());
    }
}
