package com.alibaba.griver.device.jsapi.wifi;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.image.framework.meta.BaseReq;
import java.lang.reflect.InvocationTargetException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendUPDMessageExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9090a = SendUPDMessageExtension.class.getSimpleName();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private static InetAddress a(Context context) {
        if (b(context).booleanValue()) {
            return InetAddress.getByName("192.168.43.255");
        }
        DhcpInfo dhcpInfo = ((WifiManager) context.getSystemService("wifi")).getDhcpInfo();
        if (dhcpInfo == null) {
            return InetAddress.getByName("255.255.255.255");
        }
        int i = (dhcpInfo.netmask ^ -1) | (dhcpInfo.ipAddress & dhcpInfo.netmask);
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & 255);
        }
        return InetAddress.getByAddress(bArr);
    }

    private static Boolean b(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            return (Boolean) wifiManager.getClass().getMethod("isWifiApEnabled", new Class[0]).invoke(wifiManager, new Object[0]);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return Boolean.FALSE;
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public BridgeResponse sendUdpMessage(@BindingParam({"ip"}) String str, @BindingParam({"port"}) int i, @BindingParam({"data"}) String str2, @BindingParam({"broadcast"}) String str3, @BindingApiContext ApiContext apiContext) {
        boolean z = !str3.isEmpty() && WifiUtils.parseInt(str3) > 0;
        String str4 = f9090a;
        StringBuilder sb = new StringBuilder("sendUdpMessage before ip:");
        sb.append(str);
        sb.append(",port:");
        sb.append(i);
        sb.append(",data:");
        sb.append(str2);
        sb.append(",broadcast:");
        sb.append(str3);
        RVLogger.e(str4, sb.toString());
        if (str == null || i == 0 || str2 == null) {
            RVLogger.e(f9090a, "sendUdpMessage param is empty");
            return new BridgeResponse.Error(12, "param is empty");
        }
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                InetAddress byName = InetAddress.getByName(str);
                if (z) {
                    datagramSocket.setBroadcast(true);
                    byName = a(apiContext.getActivity().getApplication());
                }
                byte[] decode = Base64.decode(str2.getBytes(), 2);
                String str5 = f9090a;
                StringBuilder sb2 = new StringBuilder("sendUdpMessage after ip:");
                sb2.append(str);
                sb2.append(",port:");
                sb2.append(i);
                sb2.append(",data:");
                sb2.append(decode);
                RVLogger.e(str5, sb2.toString());
                datagramSocket.send(new DatagramPacket(decode, decode.length, byName, i));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message", (Object) "");
                datagramSocket.close();
                return new BridgeResponse(jSONObject);
            } catch (Throwable th) {
                datagramSocket.close();
                RVLogger.e(f9090a, String.format("sendSocketMessage error : %s", new Object[]{th.toString()}), th);
                StringBuilder sb3 = new StringBuilder("exception: ");
                sb3.append(th.getMessage());
                return new BridgeResponse.Error(12, sb3.toString());
            }
        } catch (SocketException e) {
            RVLogger.e(f9090a, String.format("sendUdpMessage error : %s", new Object[]{e.toString()}), e);
            StringBuilder sb4 = new StringBuilder("exception: ");
            sb4.append(e.getMessage());
            return new BridgeResponse.Error(12, sb4.toString());
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.IO)
    @ActionFilter
    public BridgeResponse getSSID(@BindingApiContext ApiContext apiContext) {
        WifiManager wifiManager = (WifiManager) apiContext.getActivity().getApplicationContext().getSystemService("wifi");
        String str = "";
        String ssid = wifiManager.isWifiEnabled() ? wifiManager.getConnectionInfo().getSSID() : str;
        if (!TextUtils.isEmpty(ssid)) {
            str = ssid;
        }
        if (Build.VERSION.SDK_INT >= 17 && str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(BaseReq.KEY_SSID, (Object) str);
        return new BridgeResponse(jSONObject);
    }
}
