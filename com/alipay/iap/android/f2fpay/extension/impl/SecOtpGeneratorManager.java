package com.alipay.iap.android.f2fpay.extension.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.secotp.SecOtpGenerator;
import java.io.File;

public class SecOtpGeneratorManager {

    /* renamed from: a  reason: collision with root package name */
    private static SecOtpGeneratorManager f9324a;
    private SecOtpGenerator b = SecOtpGenerator.getInstance();
    private boolean c;

    private SecOtpGeneratorManager() {
    }

    public static SecOtpGeneratorManager getInstance() {
        if (f9324a == null) {
            f9324a = new SecOtpGeneratorManager();
        }
        return f9324a;
    }

    @NonNull
    public SecOtpGenerator getGenerator() {
        return this.b;
    }

    public void initialize(Context context) {
        if (!this.c) {
            File file = new File(context.getFilesDir(), "otp_storage");
            if (!file.exists()) {
                try {
                    file.mkdirs();
                } catch (Exception e) {
                    LoggerWrapper.e(F2FPayConstants.TAG, "initialize", e);
                    return;
                }
            }
            boolean z = false;
            try {
                if (this.b.initialize(file.getAbsolutePath()) >= 0) {
                    z = true;
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("initialize failed with exception ");
                sb.append(e2.getMessage());
                LoggerWrapper.e(F2FPayConstants.TAG, sb.toString());
            }
            if (z) {
                this.c = true;
                LoggerWrapper.i(F2FPayConstants.TAG, "initialize final success ");
                return;
            }
            LoggerWrapper.w(F2FPayConstants.TAG, "initialize final failed ");
        }
    }
}
