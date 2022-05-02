package o;

import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import o.ListenerClass;
import o.b;
import o.remover;

public final class callbacks implements getAdapterPosition<remover.getMin> {
    private final b.C0007b<ListenerClass.NONE> getMax;
    private final FaceAuthPopUpConsultationModule setMax;

    private callbacks(FaceAuthPopUpConsultationModule faceAuthPopUpConsultationModule, b.C0007b<ListenerClass.NONE> bVar) {
        this.setMax = faceAuthPopUpConsultationModule;
        this.getMax = bVar;
    }

    public static callbacks setMin(FaceAuthPopUpConsultationModule faceAuthPopUpConsultationModule, b.C0007b<ListenerClass.NONE> bVar) {
        return new callbacks(faceAuthPopUpConsultationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        remover.getMin min = this.setMax.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
