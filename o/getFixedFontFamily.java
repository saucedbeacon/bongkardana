package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getFixedFontFamily extends parseFailed<Boolean, setMin> {
    private final getSansSerifFontFamily exploreDanaRepository;

    @Inject
    public getFixedFontFamily(appxLoadFailed appxloadfailed, getScheme getscheme, getSansSerifFontFamily getsansseriffontfamily) {
        super(appxloadfailed, getscheme);
        this.exploreDanaRepository = getsansseriffontfamily;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMin setmin) {
        return this.exploreDanaRepository.setDismissAll(setmin.contentIds);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public List<String> contentIds;

        private setMin(List<String> list) {
            this.contentIds = list;
        }

        public static setMin forDismiss(List<String> list) {
            return new setMin(list);
        }
    }
}
