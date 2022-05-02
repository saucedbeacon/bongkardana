package o;

import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import o.remover;

public final class defaultReturn implements getAdapterPosition<remover.setMax> {
    private final FaceAuthPopUpConsultationModule getMax;

    private defaultReturn(FaceAuthPopUpConsultationModule faceAuthPopUpConsultationModule) {
        this.getMax = faceAuthPopUpConsultationModule;
    }

    public static defaultReturn getMax(FaceAuthPopUpConsultationModule faceAuthPopUpConsultationModule) {
        return new defaultReturn(faceAuthPopUpConsultationModule);
    }

    public final /* synthetic */ Object get() {
        remover.setMax min = this.getMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
