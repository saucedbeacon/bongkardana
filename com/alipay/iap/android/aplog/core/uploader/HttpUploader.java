package com.alipay.iap.android.aplog.core.uploader;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.Uploader;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.filter.LogCustomizeControl;
import com.alipay.iap.android.aplog.core.filter.LogUploadInfo;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.filter.UploadResultInfo;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import java.io.File;

public class HttpUploader extends BaseUploader implements Uploader {
    public static final String TAG = "HttpUploader";

    public HttpUploader(File file, Context context) {
        super(file, context);
    }

    public void upload(String str, String str2, Bundle bundle) {
        String str3;
        String str4;
        String str5 = str;
        Bundle bundle2 = bundle;
        String str6 = "event";
        try {
            cleanExpiresFile();
        } catch (Throwable unused) {
        }
        LogCustomizeControl logCustomizeControl = LoggerFactory.getLogContext().getLogCustomizeControl();
        File[] listFiles = this.mUploadFileDir.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            TraceLogger innerTraceLogger = LoggerFactory.getInnerTraceLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(" do not need upload HttpUploader");
            innerTraceLogger.info(TAG, sb.toString());
            return;
        }
        TraceLogger innerTraceLogger2 = LoggerFactory.getInnerTraceLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str5);
        sb2.append(" will upload, count of all mdap files: ");
        sb2.append(listFiles.length);
        innerTraceLogger2.info(TAG, sb2.toString());
        String str7 = null;
        String str8 = str2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < listFiles.length) {
            File file = listFiles[i];
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    str4 = StrategyManager.getInstance().isLogSend(name, str5);
                    if (str4 != null) {
                        String str9 = "default";
                        if (bundle2 != null) {
                            try {
                                if (!TextUtils.isEmpty(bundle2.getString(str6))) {
                                    str9 = bundle2.getString(str6);
                                }
                            } catch (Throwable th) {
                                th = th;
                                str3 = str6;
                                i3++;
                                String obj = th.toString();
                                TraceLogger innerTraceLogger3 = LoggerFactory.getInnerTraceLogger();
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str4);
                                sb3.append(" upload failed: ");
                                sb3.append(name);
                                sb3.append(" at ");
                                sb3.append(obj);
                                innerTraceLogger3.error(TAG, sb3.toString());
                                LoggerFactory.getInnerTraceLogger().error(TAG, "uploadLog", th);
                                str7 = obj;
                                i++;
                                bundle2 = bundle;
                                str6 = str3;
                            }
                        }
                        UploadResultInfo uploadControlResult = getUploadControlResult(file, str4, logCustomizeControl);
                        if (uploadControlResult != null) {
                            str3 = str6;
                            try {
                                if (!uploadControlResult.isUpload) {
                                    i++;
                                    bundle2 = bundle;
                                    str6 = str3;
                                } else {
                                    str8 = uploadControlResult.uploadUrl;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                i3++;
                                String obj2 = th.toString();
                                TraceLogger innerTraceLogger32 = LoggerFactory.getInnerTraceLogger();
                                StringBuilder sb32 = new StringBuilder();
                                sb32.append(str4);
                                sb32.append(" upload failed: ");
                                sb32.append(name);
                                sb32.append(" at ");
                                sb32.append(obj2);
                                innerTraceLogger32.error(TAG, sb32.toString());
                                if (i3 == 1 && ((th instanceof NullPointerException) || (th.getCause() != null && (th.getCause() instanceof NullPointerException)))) {
                                    LoggerFactory.getInnerTraceLogger().error(TAG, "uploadLog", th);
                                }
                                str7 = obj2;
                                i++;
                                bundle2 = bundle;
                                str6 = str3;
                            }
                        } else {
                            str3 = str6;
                        }
                        uploadFileByHttp(file, str4, str8, str9);
                        TraceLogger innerTraceLogger4 = LoggerFactory.getInnerTraceLogger();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        sb4.append(" HttpUploader upload success: ");
                        sb4.append(name);
                        sb4.append(" event = ");
                        sb4.append(str9);
                        sb4.append(" uploadUrl= ");
                        sb4.append(str8);
                        innerTraceLogger4.info(TAG, sb4.toString());
                        i2++;
                        str4.equals(str5);
                        i++;
                        bundle2 = bundle;
                        str6 = str3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str3 = str6;
                    str4 = str5;
                    i3++;
                    String obj22 = th.toString();
                    TraceLogger innerTraceLogger322 = LoggerFactory.getInnerTraceLogger();
                    StringBuilder sb322 = new StringBuilder();
                    sb322.append(str4);
                    sb322.append(" upload failed: ");
                    sb322.append(name);
                    sb322.append(" at ");
                    sb322.append(obj22);
                    innerTraceLogger322.error(TAG, sb322.toString());
                    LoggerFactory.getInnerTraceLogger().error(TAG, "uploadLog", th);
                    str7 = obj22;
                    i++;
                    bundle2 = bundle;
                    str6 = str3;
                }
            }
            str3 = str6;
            i++;
            bundle2 = bundle;
            str6 = str3;
        }
        LoggerFactory.getInnerTraceLogger().info(TAG, "uploadLog end, realUploadCount: ".concat(String.valueOf(i2)));
        if (i2 == 0 && i3 > 0) {
            TraceLogger innerTraceLogger5 = LoggerFactory.getInnerTraceLogger();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(i3);
            sb5.append(" errorUploadCount, all the uploading are failed ! lastErrorMessage: ");
            sb5.append(str7);
            innerTraceLogger5.warn(TAG, sb5.toString());
        }
    }

    private UploadResultInfo getUploadControlResult(File file, String str, LogCustomizeControl logCustomizeControl) {
        if (logCustomizeControl == null) {
            return null;
        }
        LogUploadInfo logUploadInfo = new LogUploadInfo();
        logUploadInfo.logCategory = str;
        logUploadInfo.logFile = file;
        return logCustomizeControl.isLogUpload(logUploadInfo);
    }
}
