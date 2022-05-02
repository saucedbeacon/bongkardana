package o;

import java.util.List;
import javax.inject.Inject;
import o.GriverRVTransortServiceImpl;
import o.TitleBarRightButtonView;

public class deployVersion extends parseFailed<List<GriverRVTransortServiceImpl.AnonymousClass1>, Void> {
    private final workerType merchantCategoriesRepository;

    @Inject
    public deployVersion(appxLoadFailed appxloadfailed, getScheme getscheme, workerType workertype) {
        super(appxloadfailed, getscheme);
        this.merchantCategoriesRepository = workertype;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<GriverRVTransortServiceImpl.AnonymousClass1>> buildUseCaseObservable(Void voidR) {
        return this.merchantCategoriesRepository.getMerchantCategories();
    }
}
