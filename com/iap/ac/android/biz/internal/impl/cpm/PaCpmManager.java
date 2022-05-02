package com.iap.ac.android.biz.internal.impl.cpm;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.alipay.ac.pa.SCPMGenCodeService;
import com.alipay.ac.pa.SCPMInitService;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayCompositePaymentCodeView;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.callback.IPaymentCodeListener;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.biz.cpm.CpmManager;
import com.iap.ac.android.biz.cpm.CpmOption;
import com.iap.ac.android.common.log.ACLog;

public class PaCpmManager implements CpmManager, SCPMGenCodeService.IAPConnectPaymentCodeListener {
    public IPaymentCodeListener iPaymentCodeListener;
    public SCPMGenCodeService scpmGenCodeService;
    public SCPMInitService scpmInitService;

    public PaCpmManager() {
        if (Utils.checkClassExist(Constants.PACKAGE_NAME_PA_CORE_MANAGER)) {
            ACLog.i(Constants.TAG, "PaCpmManager initialize SCPMInitService and SCPMGenCodeService");
            this.scpmInitService = SCPMInitService.getInstance();
            SCPMGenCodeService sCPMGenCodeService = new SCPMGenCodeService();
            this.scpmGenCodeService = sCPMGenCodeService;
            sCPMGenCodeService.setPaymentCodeListener(this);
        }
    }

    public F2FPayCompositePaymentCodeView buildCompositePaymentCodeView(@NonNull Activity activity) {
        return null;
    }

    public void getPaymentCode() {
        SCPMGenCodeService sCPMGenCodeService = this.scpmGenCodeService;
        if (sCPMGenCodeService != null) {
            try {
                sCPMGenCodeService.getPaymentCode();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("getPaymentCode exception: ");
                sb.append(th);
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", sb.toString());
            }
        } else {
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", "getPaymentCode error: scpmGenCodeService is null");
        }
    }

    public void onPaymentCodeUpdateFailed(String str, String str2) {
        IPaymentCodeListener iPaymentCodeListener2 = this.iPaymentCodeListener;
        if (iPaymentCodeListener2 != null) {
            iPaymentCodeListener2.onPaymentCodeUpdateFailed(str, str2);
        }
    }

    public void onPaymentCodeUpdated(String str) {
        IPaymentCodeListener iPaymentCodeListener2 = this.iPaymentCodeListener;
        if (iPaymentCodeListener2 != null) {
            iPaymentCodeListener2.onPaymentCodeUpdated(str);
        }
    }

    public void startRefreshPaymentCode() {
        SCPMGenCodeService sCPMGenCodeService = this.scpmGenCodeService;
        if (sCPMGenCodeService != null) {
            try {
                sCPMGenCodeService.startRefreshPaymentCode();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("startRefreshPaymentCode exception: ");
                sb.append(th);
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", sb.toString());
            }
        } else {
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", "startRefreshPaymentCode error: scpmGenCodeService is null");
        }
    }

    public void stopRefreshPaymentCode() {
        SCPMGenCodeService sCPMGenCodeService = this.scpmGenCodeService;
        if (sCPMGenCodeService != null) {
            try {
                sCPMGenCodeService.stopRefreshCode();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("stopRefreshPaymentCode exception: ");
                sb.append(th);
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", sb.toString());
            }
        } else {
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_pa_call_fail", "stopRefreshPaymentCode error: scpmGenCodeService is null");
        }
    }

    public void updateOption(CpmOption cpmOption) {
        if (cpmOption != null) {
            this.iPaymentCodeListener = cpmOption.listener;
            SCPMInitService sCPMInitService = this.scpmInitService;
            if (sCPMInitService != null) {
                sCPMInitService.setupWithInstitutionId(cpmOption.institutionId, cpmOption.extendInfo);
            }
        }
    }
}
