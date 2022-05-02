package o;

import id.dana.di.modules.GContainerModule;
import o.b;

public final class process implements getAdapterPosition<disableItems> {
    private final b.C0007b<showTwoWheelDialog> IsOverlapping;
    private final b.C0007b<forceFlush> getMax;
    private final b.C0007b<onNonBeaconLeScan> getMin;
    private final b.C0007b<setUpdateNotifier> length;
    private final b.C0007b<crashDetected> setMax;
    private final GContainerModule setMin;

    private process(GContainerModule gContainerModule, b.C0007b<onNonBeaconLeScan> bVar, b.C0007b<crashDetected> bVar2, b.C0007b<forceFlush> bVar3, b.C0007b<setUpdateNotifier> bVar4, b.C0007b<showTwoWheelDialog> bVar5) {
        this.setMin = gContainerModule;
        this.getMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
        this.IsOverlapping = bVar5;
    }

    public static process setMin(GContainerModule gContainerModule, b.C0007b<onNonBeaconLeScan> bVar, b.C0007b<crashDetected> bVar2, b.C0007b<forceFlush> bVar3, b.C0007b<setUpdateNotifier> bVar4, b.C0007b<showTwoWheelDialog> bVar5) {
        return new process(gContainerModule, bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        disableItems length2 = this.setMin.length(this.getMin.get(), this.setMax.get(), this.getMax.get(), this.length.get(), this.IsOverlapping.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
