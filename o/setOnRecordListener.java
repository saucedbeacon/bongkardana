package o;

import o.CameraView;
import o.b;

public final class setOnRecordListener implements getAdapterPosition<setActivityOrFragment> {
    private final b.C0007b<CameraView.length> getMax;
    private final b.C0007b<access$2108> getMin;
    private final b.C0007b<PrepareContextUitls> setMin;

    private setOnRecordListener(b.C0007b<CameraView.length> bVar, b.C0007b<PrepareContextUitls> bVar2, b.C0007b<access$2108> bVar3) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
    }

    public static setOnRecordListener setMax(b.C0007b<CameraView.length> bVar, b.C0007b<PrepareContextUitls> bVar2, b.C0007b<access$2108> bVar3) {
        return new setOnRecordListener(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setActivityOrFragment(this.getMax.get(), this.setMin.get(), this.getMin.get());
    }
}
