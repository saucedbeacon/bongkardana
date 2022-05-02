package o;

import android.text.TextUtils;
import id.dana.data.util.download.DownloadUtil;
import javax.inject.Inject;
import o.TitleBarRightButtonView;
import o.b;

public final class PrepareController implements RedDotDrawable {
    private final String getMax;

    public PrepareController(String str) {
        this.getMax = str;
    }

    public class Status extends setMinProgress implements getBluetoothState {
        private final getBeginTime verifyTokenEntityDataFactory;

        @Inject
        public Status(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getBeginTime getbegintime) {
            super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
            this.verifyTokenEntityDataFactory = getbegintime;
        }

        public TitleBarRightButtonView.AnonymousClass1<String> getPinWithVerifiedToken(String str, String str2, String str3) {
            return getVerifyToken(str3, isOriginHasAppInfo.getClearPhoneNumber(str2)).onErrorReturnItem(new setInstallTime()).map(new moveToError(this, str));
        }

        private TitleBarRightButtonView.AnonymousClass1<setInstallTime> getVerifyToken(String str, String str2) {
            if ("LOGIN".equals(str)) {
                return createVerifyTokenEntityData().getVerifyToken(str, str2);
            }
            return authenticatedRequest(createVerifyTokenEntityData().getVerifyToken(str, str2));
        }

        /* access modifiers changed from: private */
        /* renamed from: getPinWithTOTP */
        public String lambda$getPinWithVerifiedToken$0(setInstallTime setinstalltime, String str) {
            canContinue verifyToken = setinstalltime.getVerifyToken();
            if (verifyToken == null || !isTokenAndSeparatorExist(verifyToken)) {
                return str;
            }
            StringBuilder sb = new StringBuilder(verifyToken.getToken());
            sb.append(verifyToken.getSeparator());
            sb.append(str);
            sb.append(verifyToken.getSeparator());
            sb.append(verifyToken.getToken());
            return sb.toString();
        }

        private boolean isTokenAndSeparatorExist(canContinue cancontinue) {
            return !TextUtils.isEmpty(cancontinue.getSeparator()) && !TextUtils.isEmpty(cancontinue.getToken());
        }

        private setBeginTime createVerifyTokenEntityData() {
            return this.verifyTokenEntityDataFactory.createData("network");
        }
    }

    public final Object apply(Object obj) {
        return DownloadUtil.createTemporaryFile((getAppenderManager) obj, this.getMax);
    }
}
