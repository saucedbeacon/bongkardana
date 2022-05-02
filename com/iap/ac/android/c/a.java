package com.iap.ac.android.c;

import android.content.Context;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;

public class a {
    public static boolean b = false;

    /* renamed from: a  reason: collision with root package name */
    public Context f9691a;

    public a(Context context) {
        boolean z;
        if (!Utils.checkClassExist(SecurityConstants.SG_CLASS) || !Utils.checkClassExist("com.alibaba.wireless.security.open.dynamicdataencrypt.IDynamicDataEncryptComponent")) {
            ACLog.e(Constants.TAG, "encrypt powered by securityGuard does not exist");
            z = false;
        } else {
            ACLog.i(Constants.TAG, "encrypt powered by securityGuard exist");
            z = true;
        }
        b = z;
        this.f9691a = context;
    }

    public synchronized String a(String str) {
        String str2 = "check security guard not exist";
        if (b) {
            try {
                SecurityGuardManager instance = SecurityGuardManager.getInstance(this.f9691a);
                if (instance != null) {
                    IDynamicDataEncryptComponent dynamicDataEncryptComp = instance.getDynamicDataEncryptComp();
                    if (dynamicDataEncryptComp == null) {
                        ACLog.e(Constants.TAG, "decrypt ddp string failed ddeComp is null");
                        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_decrypt_fail", "decrypt ddp string failed ddeComp is null");
                        return null;
                    }
                    String dynamicDecryptDDp = dynamicDataEncryptComp.dynamicDecryptDDp(str);
                    if (dynamicDecryptDDp != null) {
                        return dynamicDecryptDDp;
                    }
                    str2 = "decrypt return null string with sourceStr: ".concat(String.valueOf(str));
                }
            } catch (Exception e) {
                StringBuilder a2 = com.iap.ac.android.a.a.a("decrypt ddp string failed with error msg:");
                a2.append(Utils.formatSecurityGuardException(e));
                str2 = a2.toString();
                ACLog.e(Constants.TAG, str2);
            }
        }
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_decrypt_fail", str2);
        return null;
    }

    public synchronized String b(String str) {
        String str2 = "check security guard not exist";
        if (b) {
            try {
                SecurityGuardManager instance = SecurityGuardManager.getInstance(this.f9691a);
                if (instance != null) {
                    IDynamicDataEncryptComponent dynamicDataEncryptComp = instance.getDynamicDataEncryptComp();
                    if (dynamicDataEncryptComp == null) {
                        ACLog.e(Constants.TAG, "encrypt ddp string failed ddeComp is null");
                        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_encrypt_fail", "encrypt ddp string failed ddeComp is null");
                        return null;
                    }
                    String dynamicEncryptDDp = dynamicDataEncryptComp.dynamicEncryptDDp(str);
                    if (dynamicEncryptDDp != null) {
                        return dynamicEncryptDDp;
                    }
                    str2 = "encrypt return null string with sourceStr: ".concat(String.valueOf(str));
                }
            } catch (Throwable th) {
                StringBuilder a2 = com.iap.ac.android.a.a.a("encrypt ddp string failed with error msg:");
                a2.append(Utils.formatSecurityGuardException(th));
                str2 = a2.toString();
                ACLog.e(Constants.TAG, str2);
            }
        }
        ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_encrypt_fail", str2);
        return null;
    }
}
