package com.alipay.iap.android.aplog.core.uploader;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.monitor.analysis.diagnose.UploadTaskStatusCallback;
import com.alipay.iap.android.aplog.rpc.TaskInstanceRpcFacade;
import com.alipay.iap.android.aplog.rpc.TaskReportRpcRequest;
import com.alipay.iap.android.aplog.util.APMTimer;
import com.alipay.iap.android.aplog.util.CommonUtils;
import com.alipay.iap.android.aplog.util.NetUtil;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import java.util.List;

public class UserDiagnostician {
    @SuppressLint({"StaticFieldLeak"})
    private static UserDiagnostician INSTANCE = null;
    private static final String MAX_FILE_SIZE_KEY = "maxFileSize";
    private static final long MAX_UPLOAD_SIZE = 10485760;
    private static final String TAG = "UserDiagnostician";
    private String appId;
    private Context mContext;

    public static final class DiagnoseTask {
        String fileName;
        long fromTime;
        boolean isForceUpload;
        boolean isPositive;
        long maxFileSize;
        String networkCondition;
        String retrieveFilePath;
        String submitId;
        String taskID;
        String taskType;
        long toTime;
        String userID;
        long zippedLenLimit;

        public final String toString() {
            return CommonUtils.concatArray(",", this.userID, this.taskID, this.submitId, this.taskType, this.fileName, this.networkCondition, Boolean.valueOf(this.isForceUpload), Long.valueOf(this.fromTime), Long.valueOf(this.toTime), Long.valueOf(this.maxFileSize), this.retrieveFilePath, Boolean.valueOf(this.isPositive), Long.valueOf(this.zippedLenLimit));
        }
    }

    private UserDiagnostician(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static synchronized UserDiagnostician createInstance(Context context) {
        UserDiagnostician userDiagnostician;
        synchronized (UserDiagnostician.class) {
            if (INSTANCE == null) {
                UserDiagnostician userDiagnostician2 = new UserDiagnostician(context);
                INSTANCE = userDiagnostician2;
                userDiagnostician2.appId = UploadConstants.getAppId();
            }
            userDiagnostician = INSTANCE;
        }
        return userDiagnostician;
    }

    public static synchronized UserDiagnostician createInstance(Context context, String str) {
        UserDiagnostician userDiagnostician;
        synchronized (UserDiagnostician.class) {
            if (INSTANCE == null) {
                UserDiagnostician userDiagnostician2 = new UserDiagnostician(context);
                INSTANCE = userDiagnostician2;
                userDiagnostician2.appId = str;
            }
            userDiagnostician = INSTANCE;
        }
        return userDiagnostician;
    }

    public static UserDiagnostician getInstance() {
        UserDiagnostician userDiagnostician = INSTANCE;
        if (userDiagnostician != null) {
            return userDiagnostician;
        }
        throw new IllegalStateException("need createInstance befor use");
    }

    public void processPushMsgInWorkThread(final String str) {
        APMTimer.getInstance().post(new Runnable() {
            public void run() {
                LoggerFactory.getLogContext().flush(true);
                UserDiagnostician.this.processPushMsg(str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void processPushMsg(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "maxFileSize"
            java.lang.String r1 = "applog"
            com.alipay.iap.android.aplog.core.logger.TraceLogger r2 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r3 = java.lang.String.valueOf(r14)
            java.lang.String r4 = "processPushMsg"
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "UserDiagnostician"
            r2.debug(r4, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0023 }
            r5.<init>(r14)     // Catch:{ all -> 0x0023 }
            goto L_0x002c
        L_0x0023:
            r14 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r5 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            r5.error((java.lang.String) r4, (java.lang.Throwable) r14)
            r5 = r3
        L_0x002c:
            if (r5 != 0) goto L_0x002f
            return
        L_0x002f:
            java.lang.String r14 = "appPlatform"
            java.lang.String r14 = r5.optString(r14)
            java.lang.String r6 = "ANDROID"
            boolean r14 = r6.equalsIgnoreCase(r14)
            if (r14 != 0) goto L_0x003e
            return
        L_0x003e:
            java.lang.String r14 = "appUserId"
            java.lang.String r14 = r5.getString(r14)     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "taskId"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ all -> 0x0053 }
            java.lang.String r7 = "submitId"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ all -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r7 = move-exception
            goto L_0x0059
        L_0x0053:
            r7 = move-exception
            r6 = r3
            goto L_0x0059
        L_0x0056:
            r7 = move-exception
            r14 = r3
            r6 = r14
        L_0x0059:
            com.alipay.iap.android.aplog.core.logger.TraceLogger r8 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            r8.error((java.lang.String) r4, (java.lang.Throwable) r7)
            r7 = r3
        L_0x0061:
            java.lang.String r8 = "appLogTypes"
            java.lang.String r8 = r5.getString(r8)     // Catch:{ all -> 0x006e }
            java.lang.String r9 = ","
            java.lang.String[] r3 = r8.split(r9)     // Catch:{ all -> 0x006e }
            goto L_0x0076
        L_0x006e:
            r8 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r9 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            r9.error((java.lang.String) r4, (java.lang.Throwable) r8)
        L_0x0076:
            if (r3 == 0) goto L_0x00f0
            int r8 = r3.length
            if (r8 <= 0) goto L_0x00f0
            int r8 = r3.length
            r9 = 0
        L_0x007d:
            if (r9 >= r8) goto L_0x00f0
            r10 = r3[r9]
            boolean r10 = r1.equalsIgnoreCase(r10)     // Catch:{ all -> 0x00e5 }
            if (r10 == 0) goto L_0x00ed
            com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask r10 = new com.alipay.iap.android.aplog.core.uploader.UserDiagnostician$DiagnoseTask     // Catch:{ all -> 0x00e5 }
            r10.<init>()     // Catch:{ all -> 0x00e5 }
            r10.userID = r14     // Catch:{ all -> 0x00e5 }
            r10.taskID = r6     // Catch:{ all -> 0x00e5 }
            r10.submitId = r7     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e5 }
            r11.<init>()     // Catch:{ all -> 0x00e5 }
            java.lang.String r12 = r10.taskID     // Catch:{ all -> 0x00e5 }
            r11.append(r12)     // Catch:{ all -> 0x00e5 }
            java.lang.String r12 = "_applog"
            r11.append(r12)     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00e5 }
            r10.fileName = r11     // Catch:{ all -> 0x00e5 }
            r10.taskType = r1     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = "appNetwork"
            java.lang.String r11 = r5.getString(r11)     // Catch:{ all -> 0x00e5 }
            r10.networkCondition = r11     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = r10.networkCondition     // Catch:{ all -> 0x00e5 }
            boolean r11 = r13.isForceUpload(r11)     // Catch:{ all -> 0x00e5 }
            r10.isForceUpload = r11     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = "startTime"
            long r11 = r5.getLong(r11)     // Catch:{ all -> 0x00e5 }
            r10.fromTime = r11     // Catch:{ all -> 0x00e5 }
            java.lang.String r11 = "endTime"
            long r11 = r5.getLong(r11)     // Catch:{ all -> 0x00e5 }
            r10.toTime = r11     // Catch:{ all -> 0x00e5 }
            r11 = 10485760(0xa00000, double:5.180654E-317)
            r10.maxFileSize = r11     // Catch:{ all -> 0x00e5 }
            boolean r11 = r5.has(r0)     // Catch:{ all -> 0x00e5 }
            if (r11 == 0) goto L_0x00e1
            int r11 = r5.getInt(r0)     // Catch:{ all -> 0x00e5 }
            if (r11 <= 0) goto L_0x00e1
            int r11 = r11 * 1024
            int r11 = r11 * 1024
            long r11 = (long) r11     // Catch:{ all -> 0x00e5 }
            r10.maxFileSize = r11     // Catch:{ all -> 0x00e5 }
        L_0x00e1:
            r2.add(r10)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ed
        L_0x00e5:
            r10 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r11 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            r11.error((java.lang.String) r4, (java.lang.Throwable) r10)
        L_0x00ed:
            int r9 = r9 + 1
            goto L_0x007d
        L_0x00f0:
            r13.startDiagnose(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.uploader.UserDiagnostician.processPushMsg(java.lang.String):void");
    }

    private boolean isForceUpload(String str) {
        return TextUtils.isEmpty(str) || UploadTaskStatusCallback.NETWORK_MOBILE.equalsIgnoreCase(str) || UploadTaskStatusCallback.NETWORK_ANY.equalsIgnoreCase(str);
    }

    private void startDiagnose(List<DiagnoseTask> list) {
        int size = list.size();
        if (size != 0) {
            for (DiagnoseTask next : list) {
                try {
                    asyncAckResult(next, UploadTaskStatusCallback.UploadStatus.CLIENT_SUBMIT_RECEIVED, "tasks count: ".concat(String.valueOf(size)));
                    if ("applog".equalsIgnoreCase(next.taskType)) {
                        uploadLog(next, new UploadTaskStatusCallback() {
                            public void onSuccess(String str) {
                                LoggerFactory.getInnerTraceLogger().info(UserDiagnostician.TAG, "upload success,".concat(String.valueOf(str)));
                            }

                            public void onFail(UploadTaskStatusCallback.Code code, String str) {
                                LoggerFactory.getInnerTraceLogger().info(UserDiagnostician.TAG, "upload fail,".concat(String.valueOf(str)));
                            }
                        });
                    }
                } catch (Throwable th) {
                    LoggerFactory.getTraceLogger().error(TAG, "startDiagnose", th);
                    asyncAckResult(next, UploadTaskStatusCallback.UploadStatus.CLIENT_SUBMIT_UPLOAD_FAIL, "[UserDiagnostician.startDiagnose] ".concat(String.valueOf(th)));
                }
            }
            list.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public void asyncAckResult(final DiagnoseTask diagnoseTask, final UploadTaskStatusCallback.UploadStatus uploadStatus, final String str) {
        if (Thread.currentThread().getName().equals("APMTimer")) {
            ackResult(diagnoseTask, uploadStatus, str);
        } else {
            APMTimer.getInstance().post(new Runnable() {
                public void run() {
                    UserDiagnostician.this.ackResult(diagnoseTask, uploadStatus, str);
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void ackResult(DiagnoseTask diagnoseTask, UploadTaskStatusCallback.UploadStatus uploadStatus, String str) {
        if (diagnoseTask == null) {
            LoggerFactory.getTraceLogger().error(TAG, "ackResult: ".concat("diagnoseTask is null"));
            return;
        }
        String name = uploadStatus.name();
        String networkType = NetUtil.getNetworkType();
        String productVersion = LoggerFactory.getLogContext().getProductVersion();
        String processAlias = LoggerFactory.getProcessInfo().getProcessAlias();
        StringBuilder sb = new StringBuilder();
        sb.append("type: ");
        sb.append(diagnoseTask.taskType);
        sb.append(", process: ");
        sb.append(processAlias);
        sb.append(", network: ");
        sb.append(networkType);
        sb.append(", product: ");
        sb.append(productVersion);
        sb.append(", status: ");
        sb.append(name);
        sb.append(" # ");
        sb.append(str);
        String obj = sb.toString();
        sb.setLength(0);
        sb.append("diagnoseStatus: ");
        sb.append(name);
        sb.append(", diagnoseMsg: ");
        sb.append(obj);
        sb.append(", diagnoseTask: ");
        sb.append(diagnoseTask);
        String obj2 = sb.toString();
        LoggerFactory.getTraceLogger().info(TAG, "ackResult: ".concat(String.valueOf(obj2)));
        try {
            TaskInstanceRpcFacade taskInstanceRpcFacade = (TaskInstanceRpcFacade) RPCProxyHost.getInterfaceProxy(TaskInstanceRpcFacade.class);
            if (taskInstanceRpcFacade != null) {
                TaskReportRpcRequest taskReportRpcRequest = new TaskReportRpcRequest();
                taskReportRpcRequest.taskId = diagnoseTask.taskID;
                taskReportRpcRequest.submitId = diagnoseTask.submitId;
                taskReportRpcRequest.submitStatus = uploadStatus.name();
                taskReportRpcRequest.submitStatusMsg = obj2;
                taskReportRpcRequest.appId = this.appId;
                if (taskInstanceRpcFacade.report(taskReportRpcRequest).success) {
                    LoggerFactory.getInnerTraceLogger().info(TAG, "report success");
                }
            }
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().error(TAG, (Throwable) e);
        }
    }

    private void uploadLog(final DiagnoseTask diagnoseTask, final UploadTaskStatusCallback uploadTaskStatusCallback) {
        AnonymousClass4 r0 = new UploadTaskStatusCallback() {
            public void onSuccess(String str) {
                UserDiagnostician.this.asyncAckResult(diagnoseTask, UploadTaskStatusCallback.UploadStatus.CLIENT_SUBMIT_UPLOAD_SUCCESS, str);
                UploadTaskStatusCallback uploadTaskStatusCallback = uploadTaskStatusCallback;
                if (uploadTaskStatusCallback != null) {
                    try {
                        uploadTaskStatusCallback.onSuccess(str);
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().error(UserDiagnostician.TAG, th);
                    }
                }
            }

            public void onFail(UploadTaskStatusCallback.Code code, String str) {
                UserDiagnostician.this.asyncAckResult(diagnoseTask, UploadTaskStatusCallback.UploadStatus.CLIENT_SUBMIT_UPLOAD_FAIL, str);
                UploadTaskStatusCallback uploadTaskStatusCallback = uploadTaskStatusCallback;
                if (uploadTaskStatusCallback != null) {
                    try {
                        uploadTaskStatusCallback.onFail(code, str);
                    } catch (Throwable th) {
                        LoggerFactory.getTraceLogger().error(UserDiagnostician.TAG, th);
                    }
                }
            }
        };
        IAPLogUploader iAPLogUploader = new IAPLogUploader(this.mContext, diagnoseTask);
        iAPLogUploader.setUploadTaskStatus(r0);
        iAPLogUploader.uploadLog();
    }

    /* access modifiers changed from: package-private */
    public String getAppId() {
        return this.appId;
    }
}
