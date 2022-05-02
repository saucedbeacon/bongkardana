package o;

import o.AUTextView;
import o.b;

public final class getInstence implements getAdapterPosition<AUDefaultTheme> {
    private final b.C0007b<setLongScanForcingEnabled> getMax;
    private final b.C0007b<setLoggingEnabled> getMin;
    private final b.C0007b<setSampleIntervalMillis> length;
    private final b.C0007b<clearSamples> setMax;
    private final b.C0007b<AUTextView.OnVisibilityChangeListener.getMax> setMin;
    private final b.C0007b<getCallbackPackageName> toFloatRange;
    private final b.C0007b<getBetweenScanPeriod> toIntRange;

    private getInstence(b.C0007b<AUTextView.OnVisibilityChangeListener.getMax> bVar, b.C0007b<setSampleIntervalMillis> bVar2, b.C0007b<clearSamples> bVar3, b.C0007b<setLoggingEnabled> bVar4, b.C0007b<setLongScanForcingEnabled> bVar5, b.C0007b<getCallbackPackageName> bVar6, b.C0007b<getBetweenScanPeriod> bVar7) {
        this.setMin = bVar;
        this.length = bVar2;
        this.setMax = bVar3;
        this.getMin = bVar4;
        this.getMax = bVar5;
        this.toFloatRange = bVar6;
        this.toIntRange = bVar7;
    }

    public static getInstence getMax(b.C0007b<AUTextView.OnVisibilityChangeListener.getMax> bVar, b.C0007b<setSampleIntervalMillis> bVar2, b.C0007b<clearSamples> bVar3, b.C0007b<setLoggingEnabled> bVar4, b.C0007b<setLongScanForcingEnabled> bVar5, b.C0007b<getCallbackPackageName> bVar6, b.C0007b<getBetweenScanPeriod> bVar7) {
        return new getInstence(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        return new AUDefaultTheme(this.setMin.get(), this.length.get(), this.setMax.get(), this.getMin.get(), this.getMax.get(), this.toFloatRange.get(), this.toIntRange.get());
    }
}
