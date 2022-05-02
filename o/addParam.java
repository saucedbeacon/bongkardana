package o;

import javax.inject.Inject;

public class addParam extends GriverAppUpdaterProxy<Void> {
    private final GriverWhiteScreenStageMonitor recentRecipientRepository;

    @Inject
    public addParam(GriverWhiteScreenStageMonitor griverWhiteScreenStageMonitor) {
        this.recentRecipientRepository = griverWhiteScreenStageMonitor;
    }

    /* access modifiers changed from: protected */
    public setFavoriteBtnVisibility buildCompletableUseCase(Void voidR) {
        return this.recentRecipientRepository.migrateRoomToUserConfig();
    }
}
