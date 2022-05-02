package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class appendAll extends parseFailed<List<download>, Void> {
    private final workerType merchantCategoriesRepository;

    @Inject
    public appendAll(appxLoadFailed appxloadfailed, getScheme getscheme, workerType workertype) {
        super(appxloadfailed, getscheme);
        this.merchantCategoriesRepository = workertype;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<download>> buildUseCaseObservable(Void voidR) {
        return this.merchantCategoriesRepository.getMerchantSubcategories();
    }
}
