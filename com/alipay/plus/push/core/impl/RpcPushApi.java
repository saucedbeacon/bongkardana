package com.alipay.plus.push.core.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.plus.push.core.ICallback;
import com.alipay.plus.push.core.PushConfig;
import com.alipay.plus.push.core.rpc.ResultPbPB;
import com.alipay.plus.push.core.rpc.bind.PushBindFacade;
import com.alipay.plus.push.core.rpc.bind.pb.BindInfoReqPbPB;
import com.alipay.plus.push.core.rpc.bind.pb.UnbindReqPbPB;
import com.alipay.plus.push.core.rpc.report.DeviceReportFacade;
import com.alipay.plus.push.core.rpc.report.pb.DeviceInfoReqPbPB;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;

public class RpcPushApi {
    private static String TAG = RpcPushApi.class.getSimpleName();

    public static void bind(final String str, final String str2, final ICallback iCallback) {
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<ResultPbPB>() {
            public final void onSuccess(@Nullable ResultPbPB resultPbPB) {
                iCallback.onSuccess(resultPbPB);
            }

            public final void onFailure(IAPError iAPError) {
                iCallback.onFailed((String) null, (String) null);
            }

            @Nullable
            public final ResultPbPB execute() throws Exception {
                PushBindFacade pushBindFacade = (PushBindFacade) RPCProxyHost.getInterfaceProxy(PushBindFacade.class);
                if (pushBindFacade == null) {
                    return null;
                }
                BindInfoReqPbPB bindInfoReqPbPB = new BindInfoReqPbPB();
                bindInfoReqPbPB.userId = str;
                bindInfoReqPbPB.deliveryToken = str2;
                bindInfoReqPbPB.osType = 1;
                bindInfoReqPbPB.workspaceId = PushConfig.workSpaceId;
                bindInfoReqPbPB.appId = PushConfig.appId;
                ResultPbPB bind = pushBindFacade.bind(bindInfoReqPbPB);
                if (bind.success.booleanValue()) {
                    iCallback.onSuccess(bind);
                } else {
                    iCallback.onFailed(bind.code, bind.message);
                }
                return bind;
            }
        });
    }

    public static void unbind(final String str, final String str2, final ICallback iCallback) {
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<ResultPbPB>() {
            public final void onSuccess(@Nullable ResultPbPB resultPbPB) {
                iCallback.onSuccess(resultPbPB);
            }

            public final void onFailure(IAPError iAPError) {
                iCallback.onFailed((String) null, (String) null);
            }

            @Nullable
            public final ResultPbPB execute() throws Exception {
                PushBindFacade pushBindFacade = (PushBindFacade) RPCProxyHost.getInterfaceProxy(PushBindFacade.class);
                if (pushBindFacade == null) {
                    return null;
                }
                UnbindReqPbPB unbindReqPbPB = new UnbindReqPbPB();
                unbindReqPbPB.userId = str;
                unbindReqPbPB.deliveryToken = str2;
                unbindReqPbPB.workspaceId = PushConfig.workSpaceId;
                unbindReqPbPB.appId = PushConfig.appId;
                ResultPbPB unbind = pushBindFacade.unbind(unbindReqPbPB);
                if (unbind.success.booleanValue()) {
                    iCallback.onSuccess(unbind);
                } else {
                    iCallback.onFailed(unbind.code, unbind.message);
                }
                return unbind;
            }
        });
    }

    public static void report(String str, String str2, String str3, Integer num, ICallback iCallback) {
        final ICallback iCallback2 = iCallback;
        final String str4 = str2;
        final String str5 = str;
        final Integer num2 = num;
        final String str6 = str3;
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<ResultPbPB>() {
            public final void onSuccess(@Nullable ResultPbPB resultPbPB) {
                iCallback2.onSuccess(resultPbPB);
            }

            public final void onFailure(IAPError iAPError) {
                iCallback2.onFailed((String) null, (String) null);
            }

            @Nullable
            public final ResultPbPB execute() throws Exception {
                DeviceReportFacade deviceReportFacade = (DeviceReportFacade) RPCProxyHost.getInterfaceProxy(DeviceReportFacade.class);
                if (deviceReportFacade == null) {
                    return null;
                }
                DeviceInfoReqPbPB deviceInfoReqPbPB = new DeviceInfoReqPbPB();
                deviceInfoReqPbPB.appVersion = "1";
                if (!TextUtils.isEmpty(str4)) {
                    deviceInfoReqPbPB.channel = str4;
                }
                deviceInfoReqPbPB.workspaceId = PushConfig.workSpaceId;
                deviceInfoReqPbPB.connectType = "WIFI";
                deviceInfoReqPbPB.deliveryToken = str5;
                Integer num = num2;
                if (num != null) {
                    deviceInfoReqPbPB.thirdChannel = num;
                }
                deviceInfoReqPbPB.thirdChannelDeviceToken = str6;
                deviceInfoReqPbPB.imsi = "imsi";
                deviceInfoReqPbPB.imei = "imei";
                deviceInfoReqPbPB.model = H5GetLogInfoBridge.RESULT_MODEL;
                deviceInfoReqPbPB.osType = 1;
                deviceInfoReqPbPB.appId = PushConfig.appId;
                ResultPbPB report = deviceReportFacade.report(deviceInfoReqPbPB);
                if (report.success.booleanValue()) {
                    iCallback2.onSuccess(report);
                } else {
                    iCallback2.onFailed(report.code, report.message);
                }
                return report;
            }
        });
    }
}
