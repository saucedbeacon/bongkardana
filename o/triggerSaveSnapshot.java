package o;

import o.b;

public final class triggerSaveSnapshot implements getAdapterPosition<getUserAgent> {
    private final b.C0007b<getEngine> getMax;
    private final b.C0007b<goBack> setMax;
    private final b.C0007b<runExit> setMin;

    private triggerSaveSnapshot(b.C0007b<goBack> bVar, b.C0007b<runExit> bVar2, b.C0007b<getEngine> bVar3) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
    }

    public static triggerSaveSnapshot setMax(b.C0007b<goBack> bVar, b.C0007b<runExit> bVar2, b.C0007b<getEngine> bVar3) {
        return new triggerSaveSnapshot(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new getUserAgent(this.setMax.get(), this.setMin.get(), this.getMax.get());
    }
}
