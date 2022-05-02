package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setDatabasePath extends parseFailed<Boolean, length> {
    private final setDefaultFontSize featureConfigRepository;

    @Inject
    public setDatabasePath(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        super(appxloadfailed, getscheme);
        this.featureConfigRepository = setdefaultfontsize;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(length length2) {
        return this.featureConfigRepository.isKnowledgeBasedAuthEnable(length2.type);
    }

    public static class length {
        /* access modifiers changed from: private */
        public String type;

        private length(String str) {
            this.type = str;
        }

        public static length forParams(String str) {
            return new length(str);
        }
    }
}
