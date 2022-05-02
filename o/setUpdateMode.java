package o;

import o.b;

public final class setUpdateMode implements getAdapterPosition<AppxNgRuntimeChecker> {
    private final b.C0007b<DialogLayout> getMin;
    private final b.C0007b<AbstractResource> length;

    private setUpdateMode(b.C0007b<AbstractResource> bVar, b.C0007b<DialogLayout> bVar2) {
        this.length = bVar;
        this.getMin = bVar2;
    }

    public static setUpdateMode getMax(b.C0007b<AbstractResource> bVar, b.C0007b<DialogLayout> bVar2) {
        return new setUpdateMode(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new AppxNgRuntimeChecker(this.length.get(), this.getMin.get());
    }
}
