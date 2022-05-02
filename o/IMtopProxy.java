package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.f2fpay.client.F2FPayDefaultClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPaySwitchOnVerifier;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipay.iap.android.f2fpay.extension.impl.AesCipherOtpInitializeInterceptor;
import com.alipayplus.mobile.component.f2fpay.service.result.F2fpayCheckOpenResult;
import o.TitleBarRightButtonView;
import o.addStage2Performance;

public class IMtopProxy extends F2FPayDefaultClient implements IF2FPaySwitchOnVerifier {
    private String publicKey;

    public interface Callback {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureNonAMCS(String str);
    }

    @Nullable
    public IF2FPayOpenComponent createOpenComponent() {
        return null;
    }

    public IMtopProxy(String str) {
        this.publicKey = str;
    }

    public synchronized void initializeComponents() {
        super.initializeComponents();
        getComponent(IF2FPayOpenComponent.class);
        ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).setInitializeInterceptor(new AesCipherOtpInitializeInterceptor(this.publicKey, "f2fpayalipayplus"));
    }

    public void verifySwitchOnF2FPay(@Nullable F2fpayCheckOpenResult f2fpayCheckOpenResult, @NonNull IF2FPaySwitchOnVerifier.Callback callback) {
        addStage2Performance.setWaitOpenEnv(new addStage2Performance.setMax(f2fpayCheckOpenResult, callback));
    }
}
