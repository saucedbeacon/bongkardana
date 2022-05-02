package o;

import java.util.List;
import javax.inject.Inject;
import o.ScanJob;
import o.TitleBarRightButtonView;

public class onPreExecute extends parseFailed<List<String>, Void> {
    ScanJob.AnonymousClass1 socialShareRepository;

    @Inject
    public onPreExecute(appxLoadFailed appxloadfailed, getScheme getscheme, ScanJob.AnonymousClass1 r3) {
        super(appxloadfailed, getscheme);
        this.socialShareRepository = r3;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<String>> buildUseCaseObservable(Void voidR) {
        return this.socialShareRepository.getSocialMediaCategoryShare();
    }
}
