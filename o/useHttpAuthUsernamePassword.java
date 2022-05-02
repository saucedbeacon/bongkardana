package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class useHttpAuthUsernamePassword extends parseFailed<Boolean, getMax> {
    private final confirm cardRepository;

    @Inject
    public useHttpAuthUsernamePassword(appxLoadFailed appxloadfailed, getScheme getscheme, confirm confirm) {
        super(appxloadfailed, getscheme);
        this.cardRepository = confirm;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMax getmax) {
        return this.cardRepository.saveLastCardUsed(getmax.cardIndexNo);
    }

    public static class getMax {
        String cardIndexNo;

        private getMax(String str) {
            this.cardIndexNo = str;
        }

        public static getMax forDefaultCard(String str) {
            return new getMax(str);
        }
    }
}
