package o;

import o.MediaInfo;
import o.b;

public final class isConvertPicture implements getAdapterPosition<CaptureParam> {
    private final b.C0007b<getIconDrawable> getMax;
    private final b.C0007b<MediaInfo.getMin> getMin;
    private final b.C0007b<enableCloseButton> setMax;

    private isConvertPicture(b.C0007b<MediaInfo.getMin> bVar, b.C0007b<getIconDrawable> bVar2, b.C0007b<enableCloseButton> bVar3) {
        this.getMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
    }

    public static isConvertPicture length(b.C0007b<MediaInfo.getMin> bVar, b.C0007b<getIconDrawable> bVar2, b.C0007b<enableCloseButton> bVar3) {
        return new isConvertPicture(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new CaptureParam(this.getMin.get(), this.getMax.get(), this.setMax.get());
    }
}
