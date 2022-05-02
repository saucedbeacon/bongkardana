package o;

import id.dana.di.modules.SendMoneyConfirmationModule;
import o.makeTakenPicturePath;

public final class GriverAppEvent implements getAdapterPosition<makeTakenPicturePath.setMin> {
    private final SendMoneyConfirmationModule length;

    private GriverAppEvent(SendMoneyConfirmationModule sendMoneyConfirmationModule) {
        this.length = sendMoneyConfirmationModule;
    }

    public static GriverAppEvent length(SendMoneyConfirmationModule sendMoneyConfirmationModule) {
        return new GriverAppEvent(sendMoneyConfirmationModule);
    }

    public final /* synthetic */ Object get() {
        makeTakenPicturePath.setMin min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
