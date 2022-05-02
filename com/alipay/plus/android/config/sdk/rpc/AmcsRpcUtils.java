package com.alipay.plus.android.config.sdk.rpc;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.multigateway.sdk.GatewayController;
import com.alipay.multigateway.sdk.adapter.network.quake.QuakeGatewayControllerFactory;
import com.alipay.plus.android.config.sdk.a.e;

public class AmcsRpcUtils {
    public static final String DEFAULT_NODE_AMCS_LITE_SERVICE = "amcsLiteService";
    public static final String DEFAULT_NODE_GRAYSCALE_SERVICE = "grayScaleService";
    public static final String DEFAULT_NODE_MDS_SERVICE = "mdsService";

    /* renamed from: a  reason: collision with root package name */
    private static final String f10760a = e.a("AmcsRpcUtils");
    @Nullable
    private static GatewayController b;

    public static void initializeQuakeRpcGateway(@NonNull Context context, @NonNull RpcProfile rpcProfile) {
        initializeRpcGateway(QuakeGatewayControllerFactory.createController(context), rpcProfile);
    }

    public static void initializeRpcGateway(@NonNull GatewayController gatewayController, @NonNull RpcProfile rpcProfile) {
        initializeRpcGateway(gatewayController, rpcProfile, DEFAULT_NODE_MDS_SERVICE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initializeRpcGateway(@androidx.annotation.NonNull com.alipay.multigateway.sdk.GatewayController r6, @androidx.annotation.NonNull com.alipay.iap.android.common.securityprofiles.profile.RpcProfile r7, @androidx.annotation.NonNull java.lang.String r8) {
        /*
            b = r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = isMdsService(r8)
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ap.mobileamcs.cloud.fetch.config.by.keys"
            java.lang.String r5 = "ap.mobileamcs.cloud.fetch.config"
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "com.alipayintl.imobileprod.imcs.config.fetch"
            r0.add(r1)
            java.lang.String r1 = "ap.mobileprod.amcs.config.fetch"
        L_0x001a:
            r0.add(r1)
        L_0x001d:
            r0.add(r5)
            r0.add(r4)
            goto L_0x0039
        L_0x0024:
            boolean r1 = isGrayscaleService(r8)
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = "ap.mobileprod.amcs.config.local.fetch"
            r0.add(r1)
            java.lang.String r1 = "ap.mobileprod.amcs.config.fetch.by.keys"
            goto L_0x001a
        L_0x0032:
            boolean r1 = isAmcsLiteService(r8)
            if (r1 == 0) goto L_0x00bc
            goto L_0x001d
        L_0x0039:
            com.alipay.multigateway.sdk.Rule r1 = new com.alipay.multigateway.sdk.Rule
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r8
            java.lang.String r8 = "AMCS-Rpc-Gateway-%s"
            java.lang.String r8 = java.lang.String.format(r8, r3)
            r2 = 100
            r1.<init>(r8, r2)
            com.alipay.multigateway.sdk.decision.condition.Condition r8 = com.alipay.multigateway.sdk.decision.condition.Condition.operationTypeIn(r0)
            r1.addCondition(r8)
            com.alipay.multigateway.sdk.GatewayInfo$SignInfo r8 = new com.alipay.multigateway.sdk.GatewayInfo$SignInfo
            r8.<init>()
            java.lang.String r0 = ""
            r8.headerName = r0
            java.lang.String r0 = "wireless_sg"
            r8.type = r0
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.extra
            java.lang.String r2 = r7.appKey
            java.lang.String r3 = "appKey"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.extra
            java.lang.String r2 = r7.authCode
            java.lang.String r3 = "authCode"
            r0.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r8.extra
            java.lang.String r2 = "requestType"
            java.lang.String r3 = "4"
            r0.put(r2, r3)
            com.alipay.multigateway.sdk.GatewayInfo r0 = new com.alipay.multigateway.sdk.GatewayInfo
            r0.<init>()
            r0.signInfo = r8
            java.lang.String r8 = r7.gatewayUrl
            r0.targetUrl = r8
            java.lang.String r8 = r7.appId
            java.lang.String r2 = "AppId"
            r0.addHeader(r2, r8)
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.headers
            if (r8 == 0) goto L_0x00b5
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.headers
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x0099:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b5
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r2 = r8.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r0.addHeader(r2, r8)
            goto L_0x0099
        L_0x00b5:
            r1.setGatewayInfo(r0)
            r6.addRule(r1)
            return
        L_0x00bc:
            java.lang.String r6 = f10760a
            java.lang.Object[] r7 = new java.lang.Object[r3]
            r7[r2] = r8
            java.lang.String r8 = "Can not parse rpc type [%s]"
            java.lang.String r7 = java.lang.String.format(r8, r7)
            com.alipay.iap.android.common.log.LoggerWrapper.d(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.rpc.AmcsRpcUtils.initializeRpcGateway(com.alipay.multigateway.sdk.GatewayController, com.alipay.iap.android.common.securityprofiles.profile.RpcProfile, java.lang.String):void");
    }

    public static boolean isAmcsLiteService(String str) {
        return DEFAULT_NODE_AMCS_LITE_SERVICE.equals(str);
    }

    public static boolean isGrayscaleService(String str) {
        return DEFAULT_NODE_GRAYSCALE_SERVICE.equals(str);
    }

    public static boolean isMdsService(String str) {
        return DEFAULT_NODE_MDS_SERVICE.equals(str);
    }

    public static void updateRpcGateway(@NonNull RpcProfile rpcProfile, @NonNull String str) {
        GatewayController gatewayController = b;
        if (gatewayController == null) {
            LoggerWrapper.e(f10760a, "** Cannot initializeRpcGateway. mGatewayController is null!");
        } else {
            initializeRpcGateway(gatewayController, rpcProfile, str);
        }
    }
}
