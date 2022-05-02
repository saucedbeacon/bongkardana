package o;

import o.PhotoContext;
import o.b;
import o.parameters;

public final class onPreShow implements getAdapterPosition<getThemeRes> {
    private final b.C0007b<PhotoContext.AnonymousClass2> getMax;
    private final b.C0007b<GVViewFactory> getMin;
    private final b.C0007b<getBluetoothServices> length;
    private final b.C0007b<parameters.getMin> setMax;
    private final b.C0007b<readData> setMin;
    private final b.C0007b<interceptH5OptionMenuClick> toIntRange;

    private onPreShow(b.C0007b<parameters.getMin> bVar, b.C0007b<getBluetoothServices> bVar2, b.C0007b<readData> bVar3, b.C0007b<PhotoContext.AnonymousClass2> bVar4, b.C0007b<GVViewFactory> bVar5, b.C0007b<interceptH5OptionMenuClick> bVar6) {
        this.setMax = bVar;
        this.length = bVar2;
        this.setMin = bVar3;
        this.getMax = bVar4;
        this.getMin = bVar5;
        this.toIntRange = bVar6;
    }

    public static onPreShow length(b.C0007b<parameters.getMin> bVar, b.C0007b<getBluetoothServices> bVar2, b.C0007b<readData> bVar3, b.C0007b<PhotoContext.AnonymousClass2> bVar4, b.C0007b<GVViewFactory> bVar5, b.C0007b<interceptH5OptionMenuClick> bVar6) {
        return new onPreShow(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final /* synthetic */ Object get() {
        return new getThemeRes(this.setMax.get(), this.length.get(), this.setMin.get(), this.getMax.get(), this.getMin.get(), this.toIntRange.get());
    }
}
