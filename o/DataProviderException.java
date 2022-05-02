package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class DataProviderException extends parseFailed<String, getMax> {
    private final AndroidModel shortenerRepository;

    @Inject
    public DataProviderException(appxLoadFailed appxloadfailed, getScheme getscheme, AndroidModel androidModel) {
        super(appxloadfailed, getscheme);
        this.shortenerRepository = androidModel;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(getMax getmax) {
        return this.shortenerRepository.restore(getmax.shortCode);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String shortCode;

        private getMax(String str) {
            this.shortCode = str;
        }

        public static getMax forRestoreUrl(String str) {
            return new getMax(str);
        }
    }
}
