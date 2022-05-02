package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getBlockNetworkImage extends parseFailed<getSettings, getMax> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public getBlockNetworkImage(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<getSettings> buildUseCaseObservable(getMax getmax) {
        return this.featureConfigRepository.checkDeepLinkFeatureVisibility(getmax.name);
    }

    public static class getMax {
        /* access modifiers changed from: private */
        public String name;

        private getMax(String str) {
            this.name = str;
        }

        public static getMax forAction(String str) {
            return new getMax(str);
        }
    }
}
