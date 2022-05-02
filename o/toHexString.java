package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class toHexString extends parseFailed<List<String>, Void> {
    private final toUuidString servicesRepository;

    @Inject
    public toHexString(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        super(appxloadfailed, getscheme);
        this.servicesRepository = touuidstring;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<String>> buildUseCaseObservable(Void voidR) {
        return this.servicesRepository.getAllCategories();
    }
}
