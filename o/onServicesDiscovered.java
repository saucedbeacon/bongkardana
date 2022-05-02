package o;

import javax.inject.Inject;

public class onServicesDiscovered extends GriverAppUpdaterProxy<Void> {
    private final onDescriptorWrite userRepository;

    @Inject
    public onServicesDiscovered(onDescriptorWrite ondescriptorwrite) {
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public setFavoriteBtnVisibility buildCompletableUseCase(Void voidR) {
        return this.userRepository.getUserInfoWithUserPan().ignoreElements();
    }
}
