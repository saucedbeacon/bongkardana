package o;

import id.dana.di.modules.SendMoneyConfirmationModule;
import o.FalconFacade;
import o.b;
import o.makeTakenPicturePath;

public final class GriverInterceptUrlEvent implements getAdapterPosition<makeTakenPicturePath.setMax> {
    private final b.C0007b<FalconFacade.FalconInterface> getMax;
    private final SendMoneyConfirmationModule setMin;

    private GriverInterceptUrlEvent(SendMoneyConfirmationModule sendMoneyConfirmationModule, b.C0007b<FalconFacade.FalconInterface> bVar) {
        this.setMin = sendMoneyConfirmationModule;
        this.getMax = bVar;
    }

    public static GriverInterceptUrlEvent setMax(SendMoneyConfirmationModule sendMoneyConfirmationModule, b.C0007b<FalconFacade.FalconInterface> bVar) {
        return new GriverInterceptUrlEvent(sendMoneyConfirmationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        makeTakenPicturePath.setMax length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
