package com.iap.ac.android.biz.common.rpc.ssl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.rpc.ssl.SSLPinningManager;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;

public class IAPSslPinner {
    public static final IAPSslPinner INSTANCE = new IAPSslPinner();
    public static final String TAG = "IAPSslPinner";
    public SSLPinningManager pinningManager;

    private void parseCertBase64(List<String> list, List<String> list2) {
        if (list != null) {
            for (String next : list) {
                if (!TextUtils.isEmpty(next)) {
                    String str = new String(Base64.decode(next, 2));
                    if (!list2.contains(str)) {
                        list2.add(str);
                    }
                }
            }
        }
    }

    public void addCertificates(List<String> list) {
        if (list != null && list.size() != 0 && this.pinningManager != null) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String next : list) {
                    if (!TextUtils.isEmpty(next)) {
                        String str = new String(Base64.decode(next, 2));
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                }
                this.pinningManager.addCertificates(arrayList);
            } catch (Exception e) {
                ACLog.e(TAG, "Add certificates error!", e);
                disableSslPinning();
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_sslpinning_add_certs_fail", "Add remote certificates fail!");
            }
        }
    }

    public void disableSslPinning() {
        if (this.pinningManager != null) {
            ACLog.i(TAG, "disableSslPinning...");
            this.pinningManager.setPinningMode(0);
        }
    }

    public void enableSslPinning() {
        if (this.pinningManager != null) {
            ACLog.i(TAG, "enableSslPinning...");
            this.pinningManager.setPinningMode(1);
        }
    }

    public void init(@NonNull Context context) {
        this.pinningManager = new SSLPinningManager(context);
        if (ConfigCenter.INSTANCE.getSslPinningToggle()) {
            this.pinningManager.setPinningMode(1);
            ACLog.d(Constants.TAG, "IAPSslPinner.init: PINNING_MODE_CERTIFICATE");
            try {
                ArrayList arrayList = new ArrayList();
                List<String> sslCertList = ACManager.getInstance().getSslCertList();
                List<String> acCertificates = ConfigCenter.INSTANCE.getAcCertificates();
                parseCertBase64(sslCertList, arrayList);
                parseCertBase64(acCertificates, arrayList);
                this.pinningManager.addCertificates(arrayList);
                if (arrayList.size() == 0) {
                    ACLog.w(TAG, "Cannot find certificatest. Disable ssl pinning.");
                    disableSslPinning();
                }
            } catch (Exception e) {
                ACLog.e(TAG, "Add preset certificates error!", e);
                disableSslPinning();
                ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_sslpinning_add_certs_fail", "Add preset certificates fail!");
            }
        } else {
            this.pinningManager.setPinningMode(0);
            ACLog.d(Constants.TAG, "IAPSslPinner.init: PINNING_MODE_NONE");
        }
    }

    public void verifyConnection(HttpsURLConnection httpsURLConnection) throws SSLException {
        SSLPinningManager sSLPinningManager = this.pinningManager;
        if (sSLPinningManager != null) {
            sSLPinningManager.validateCertificates(httpsURLConnection);
        }
    }
}
