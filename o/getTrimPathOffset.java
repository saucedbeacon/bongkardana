package o;

import o.TakePictureProcessor;
import o.b;
import o.getTrimPathStart;

public final class getTrimPathOffset implements getAdapterPosition<setFillAlpha> {
    private final b.C0007b<getTrimPathStart.length> getMax;
    private final b.C0007b<TakePictureProcessor.AnonymousClass2> getMin;
    private final b.C0007b<getFixedFontFamily> length;
    private final b.C0007b<getStandardFontFamily> setMax;
    private final b.C0007b<setFixedFontFamily> setMin;

    private getTrimPathOffset(b.C0007b<getTrimPathStart.length> bVar, b.C0007b<getStandardFontFamily> bVar2, b.C0007b<setFixedFontFamily> bVar3, b.C0007b<getFixedFontFamily> bVar4, b.C0007b<TakePictureProcessor.AnonymousClass2> bVar5) {
        this.getMax = bVar;
        this.setMax = bVar2;
        this.setMin = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
    }

    public static getTrimPathOffset getMin(b.C0007b<getTrimPathStart.length> bVar, b.C0007b<getStandardFontFamily> bVar2, b.C0007b<setFixedFontFamily> bVar3, b.C0007b<getFixedFontFamily> bVar4, b.C0007b<TakePictureProcessor.AnonymousClass2> bVar5) {
        return new getTrimPathOffset(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new setFillAlpha(this.getMax.get(), this.setMax.get(), this.setMin.get(), this.length.get(), this.getMin.get());
    }
}
