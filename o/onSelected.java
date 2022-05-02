package o;

import o.b;
import o.getSelectedIndex;

public final class onSelected implements getAdapterPosition<setOnOptionPickListener> {
    private final b.C0007b<getSelectedIndex.setMax> getMax;
    private final b.C0007b<onStopBleScan> getMin;
    private final b.C0007b<BLETraceMonitor> length;

    private onSelected(b.C0007b<getSelectedIndex.setMax> bVar, b.C0007b<BLETraceMonitor> bVar2, b.C0007b<onStopBleScan> bVar3) {
        this.getMax = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
    }

    public static onSelected setMin(b.C0007b<getSelectedIndex.setMax> bVar, b.C0007b<BLETraceMonitor> bVar2, b.C0007b<onStopBleScan> bVar3) {
        return new onSelected(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setOnOptionPickListener(this.getMax.get(), this.length.get(), this.getMin.get());
    }
}
