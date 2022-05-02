package com.iap.ac.android.biz.common.risk;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;

public class RiskControlManager {
    public static volatile RiskControlManager b;
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.t.a f9686a;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11036a;

        public a(String str) {
            this.f11036a = str;
        }

        public void run() {
            if (RiskControlManager.this.f9686a.a(this.f11036a)) {
                RiskControlManager.c = this.f11036a;
                ACLog.d(Constants.TAG, "upload apdidToken success");
                return;
            }
            ACLog.d(Constants.TAG, "upload apdidToken failed");
        }
    }

    public static RiskControlManager getInstance() {
        if (b == null) {
            synchronized (RiskControlManager.class) {
                if (b == null) {
                    b = new RiskControlManager();
                }
            }
        }
        return b;
    }

    public String getApdidTokenUploadMode() {
        return (String) ConfigCenter.INSTANCE.getKeyOrDefault("ac_apdidtoken_upload_mode", "from_psp");
    }

    public boolean getApdidTokenUploadToggle() {
        return ((Boolean) ConfigCenter.INSTANCE.getKeyOrDefault("toggle_apdidtoken_upload", Boolean.FALSE)).booleanValue();
    }

    public String getTokenId() {
        return c;
    }

    public void init() {
        this.f9686a = new com.iap.ac.android.t.a();
    }

    public void reportApdidToken() {
        if (!getApdidTokenUploadToggle()) {
            ACLog.d(Constants.TAG, "apdidToken upload toggle is closed");
            return;
        }
        String apdidTokenUploadMode = getApdidTokenUploadMode();
        if (!TextUtils.equals(apdidTokenUploadMode, "from_psp")) {
            ACLog.d(Constants.TAG, String.format("apdidToken upload mode is %s, no need to upload.", new Object[]{apdidTokenUploadMode}));
            return;
        }
        Context context = ACManager.getInstance().getContext();
        String str = null;
        try {
            if (Utils.checkClassExist("com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk")) {
                str = APSecuritySdk.getInstance(context).getApdidToken();
            }
        } catch (Throwable th) {
            com.iap.ac.android.a.a.a("tryGetSecuritySDKToken error: ", th, Constants.TAG);
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_apdidtoken_generate").addParams("result", TextUtils.isEmpty(str) ? "F" : DiskFormatter.TB).event();
        if (TextUtils.isEmpty(str)) {
            ACLog.d(Constants.TAG, "apdidToken is empty, abort upload");
        } else if (TextUtils.equals(c, str)) {
            StringBuilder a2 = com.iap.ac.android.a.a.a("apdidToken is already uploaded, skip it, token is ");
            a2.append(c);
            ACLog.d(Constants.TAG, a2.toString());
        } else {
            c = "";
            IAPAsyncTask.asyncTask((Runnable) new a(str));
        }
    }
}
