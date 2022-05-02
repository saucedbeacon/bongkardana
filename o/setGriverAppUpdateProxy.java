package o;

import javax.inject.Inject;
import o.GriverAppXInterceptor;

public class setGriverAppUpdateProxy extends GriverAppUpdaterProxy<String> {
    private final GriverAppXInterceptor.AnonymousClass1 promotionRepository;

    @Inject
    public setGriverAppUpdateProxy(GriverAppXInterceptor.AnonymousClass1 r1) {
        this.promotionRepository = r1;
    }

    /* access modifiers changed from: protected */
    public setFavoriteBtnVisibility buildCompletableUseCase(String str) {
        return this.promotionRepository.decrementFreeTransferCount(str);
    }
}
