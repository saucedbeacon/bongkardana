package o;

import o.ViewPager2;
import o.b;

public final class ArrayCreatingInputMerger implements getAdapterPosition<ViewPager2.SavedState> {
    private final b.C0007b<ViewPager2.OffscreenPageLimit.setMin> getMax;
    private final b.C0007b<GriverWebviewSetting> length;
    private final b.C0007b<dumpDir> setMin;

    private ArrayCreatingInputMerger(b.C0007b<ViewPager2.OffscreenPageLimit.setMin> bVar, b.C0007b<dumpDir> bVar2, b.C0007b<GriverWebviewSetting> bVar3) {
        this.getMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
    }

    public static ArrayCreatingInputMerger setMax(b.C0007b<ViewPager2.OffscreenPageLimit.setMin> bVar, b.C0007b<dumpDir> bVar2, b.C0007b<GriverWebviewSetting> bVar3) {
        return new ArrayCreatingInputMerger(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new ViewPager2.SavedState(this.getMax.get(), this.setMin.get(), this.length.get());
    }
}
