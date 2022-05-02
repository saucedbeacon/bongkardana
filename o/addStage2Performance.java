package o;

import com.alipay.iap.android.f2fpay.client.callback.IF2FPaySwitchOnVerifier;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fpayCheckOpenResult;

public final class addStage2Performance {
    private static setMax waitOpenEnv;

    public static setMax getWaitOpenEnv() {
        return waitOpenEnv;
    }

    static void setWaitOpenEnv(setMax setmax) {
        waitOpenEnv = setmax;
    }

    static class setMax {
        F2fpayCheckOpenResult length;
        IF2FPaySwitchOnVerifier.Callback setMax;

        setMax(F2fpayCheckOpenResult f2fpayCheckOpenResult, IF2FPaySwitchOnVerifier.Callback callback) {
            this.length = f2fpayCheckOpenResult;
            this.setMax = callback;
        }
    }
}
