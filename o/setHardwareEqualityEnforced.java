package o;

import java.io.File;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setHardwareEqualityEnforced extends parseFailed<Boolean, getMin> {
    private final setDistanceCalculator registrationRepository;

    @Inject
    public setHardwareEqualityEnforced(appxLoadFailed appxloadfailed, getScheme getscheme, setDistanceCalculator setdistancecalculator) {
        super(appxloadfailed, getscheme);
        this.registrationRepository = setdistancecalculator;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(getMin getmin) {
        return this.registrationRepository.register(getmin.phoneNumber, getmin.pin, getmin.nickname, getmin.avatarFile, getmin.referralCode);
    }

    public static class getMin {
        /* access modifiers changed from: private */
        public File avatarFile;
        /* access modifiers changed from: private */
        public String nickname;
        /* access modifiers changed from: private */
        public String phoneNumber;
        /* access modifiers changed from: private */
        public String pin;
        /* access modifiers changed from: private */
        public String referralCode;

        private getMin(String str, String str2, String str3, File file, String str4) {
            this.phoneNumber = str;
            this.pin = str2;
            this.nickname = str3;
            this.avatarFile = file;
            this.referralCode = str4;
        }

        public static getMin forCreateProfile(String str, String str2, String str3, File file, String str4) {
            return new getMin(str, str2, str3, file, str4);
        }
    }
}
