package com.alipay.iap.android.aplog.core.uploader;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogEncryptClient;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.appender.MdapFileLogAppender;
import com.alipay.iap.android.aplog.core.filter.StrategyManager;
import com.alipay.iap.android.aplog.core.logger.TraceLogger;
import com.alipay.iap.android.aplog.core.uploader.rpc.LogRpcResult;
import com.alipay.iap.android.aplog.core.uploader.rpc.RpcClient;
import com.alipay.iap.android.aplog.core.uploader.rpc.RpcLogData;
import com.alipay.iap.android.aplog.core.uploader.rpc.RpcLogRequestParam;
import com.alipay.iap.android.aplog.util.FileUtil;
import java.io.File;
import java.util.ArrayList;

public class RpcUploader extends BaseUploader {
    public static final String TAG = "RpcUploader";

    public RpcUploader(File file, Context context) {
        super(file, context);
    }

    public void upload(String str, String str2, Bundle bundle) {
        try {
            cleanExpiresFile();
        } catch (Throwable unused) {
        }
        File[] listFiles = this.mUploadFileDir.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            TraceLogger traceLogger = LoggerFactory.getTraceLogger();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" do not need upload RpcUploader");
            traceLogger.info(TAG, sb.toString());
            return;
        }
        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" will upload, count of all mdap files: ");
        sb2.append(listFiles.length);
        sb2.append(" isMerge = false");
        traceLogger2.info(TAG, sb2.toString());
        uploadByCategory(str, listFiles, bundle);
    }

    private void uploadByCategory(String str, File[] fileArr, Bundle bundle) {
        String str2;
        int i = 0;
        for (File file : fileArr) {
            if (file != null && file.exists() && file.isFile()) {
                String name = file.getName();
                try {
                    str2 = StrategyManager.getInstance().isLogSend(name, str);
                    if (str2 != null) {
                        String str3 = "default";
                        if (bundle != null) {
                            try {
                                if (!TextUtils.isEmpty(bundle.getString("event"))) {
                                    str3 = bundle.getString("event");
                                }
                            } catch (Throwable th) {
                                th = th;
                                String obj = th.toString();
                                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                StringBuilder sb = new StringBuilder();
                                sb.append(str2);
                                sb.append(" uploadByCategory failed: ");
                                sb.append(name);
                                sb.append(" at ");
                                sb.append(obj);
                                traceLogger.error(TAG, sb.toString());
                            }
                        }
                        uploadFile(file, str2, str3, bundle);
                        TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(" uploadByCategory upload success: ");
                        sb2.append(name);
                        sb2.append(" event = ");
                        sb2.append(str3);
                        traceLogger2.info(TAG, sb2.toString());
                        i++;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str2 = str;
                    String obj2 = th.toString();
                    TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(" uploadByCategory failed: ");
                    sb3.append(name);
                    sb3.append(" at ");
                    sb3.append(obj2);
                    traceLogger3.error(TAG, sb3.toString());
                }
            }
        }
        LoggerFactory.getTraceLogger().info(TAG, "uploadByCategory end, realUploadCount: ".concat(String.valueOf(i)));
    }

    private void uploadFile(File file, String str, String str2, Bundle bundle) throws IllegalStateException {
        if (file != null) {
            try {
                String readFile = FileUtil.readFile(file);
                if (!TextUtils.isEmpty(readFile)) {
                    RpcClient logUploadRpcClient = LoggerFactory.getLogContext().getLogUploadRpcClient();
                    if (logUploadRpcClient != null) {
                        try {
                            ArrayList arrayList = new ArrayList();
                            RpcLogData rpcLogData = new RpcLogData();
                            rpcLogData.bizCode = str;
                            ArrayList arrayList2 = new ArrayList();
                            for (String decryptItem : readFile.split(LoggerFactory.LOG_SPLITER)) {
                                arrayList2.add(decryptItem(decryptItem));
                            }
                            rpcLogData.log = arrayList2;
                            arrayList.add(rpcLogData);
                            RpcLogRequestParam rpcLogRequestParam = new RpcLogRequestParam();
                            rpcLogRequestParam.logs = arrayList;
                            LogRpcResult uploadLog = logUploadRpcClient.uploadLog(rpcLogRequestParam, str2, bundle);
                            if (uploadLog == null) {
                                LoggerFactory.getTraceLogger().info(TAG, "rpc upload fail result is null");
                                doDegradeUploadByLogCategory(bundle, str);
                            } else if (uploadLog.respCode == 1000) {
                                LoggerFactory.getTraceLogger().info(TAG, "rpc upload success category = ".concat(String.valueOf(str)));
                                try {
                                    file.delete();
                                } catch (Throwable th) {
                                    throw new IllegalStateException("delete file error: ".concat(String.valueOf(th)), th);
                                }
                            } else {
                                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                                StringBuilder sb = new StringBuilder("rpc upload fail respCode = ");
                                sb.append(uploadLog.respCode);
                                sb.append(" resp des = ");
                                sb.append(uploadLog.errorMsg);
                                traceLogger.info(TAG, sb.toString());
                                doDegradeUploadByLogCategory(bundle, str);
                            }
                        } catch (Throwable th2) {
                            LoggerFactory.getTraceLogger().error(TAG, "rpc upload error,do upload by http", th2);
                            doDegradeUploadByLogCategory(bundle, str);
                        }
                    } else {
                        doDegradeUploadByLogCategory(bundle, str);
                    }
                } else {
                    file.delete();
                    throw new IllegalStateException("file content is empty");
                }
            } catch (Throwable th3) {
                throw new IllegalStateException("read file error: ".concat(String.valueOf(th3)), th3);
            }
        } else {
            throw new IllegalStateException("file object is NULL");
        }
    }

    private String decryptItem(String str) {
        LogEncryptClient logEncryptClient;
        if (!TextUtils.isEmpty(str) && (logEncryptClient = LoggerFactory.getLogContext().getLogEncryptClient()) != null && str.startsWith(MdapFileLogAppender.ENCRYPT_SIGN)) {
            String decrypt = logEncryptClient.decrypt(str.substring(2));
            if (!TextUtils.isEmpty(decrypt)) {
                return decrypt;
            }
        }
        return str;
    }

    private void doDegradeUploadByLogCategory(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        LoggerFactory.getTraceLogger().info(TAG, "doDegradeUploadByLogCategory logCategory = ".concat(String.valueOf(str)));
        LoggerFactory.getLogContext().getUploader();
        new HttpUploader(this.mUploadFileDir, this.mContext).upload(str, (String) null, bundle);
    }
}
