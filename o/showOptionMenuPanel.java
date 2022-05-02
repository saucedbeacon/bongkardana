package o;

import java.io.File;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class showOptionMenuPanel extends parseFailed<String, getMin> {
    private final getCommonResources accountRepository;

    @Inject
    public showOptionMenuPanel(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        super(appxloadfailed, getscheme);
        this.accountRepository = getcommonresources;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(getMin getmin) {
        return this.accountRepository.uploadAvatar(getmin.avatarFile);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public File avatarFile;

        private getMin(File file) {
            this.avatarFile = file;
        }

        public static getMin forUploadAvatar(File file) {
            return new getMin(file);
        }
    }
}
