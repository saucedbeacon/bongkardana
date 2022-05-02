package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setFixedFontFamily extends parseFailed<Boolean, getMax> {
    private final getSansSerifFontFamily exploreDanaRepository;

    @Inject
    public setFixedFontFamily(appxLoadFailed appxloadfailed, getScheme getscheme, getSansSerifFontFamily getsansseriffontfamily) {
        super(appxloadfailed, getscheme);
        this.exploreDanaRepository = getsansseriffontfamily;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMax getmax) {
        return this.exploreDanaRepository.setReadExploreDanaItem(getmax.key);
    }

    public static class getMax {
        String key;

        private getMax(String str) {
            this.key = str;
        }

        public static getMax forRead(String str) {
            return new getMax(str);
        }
    }
}
