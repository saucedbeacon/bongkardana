package com.zoloz.rpc;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.zoloz.rpccommon.NetResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Typography;
import o.onActivityPreCreated;

public class NormalRequest {
    private static String TAG = "NormalRequest";
    private static long getMax = 0;
    private static int setMax = 0;
    private static int setMin = 1;

    static void setMax() {
        getMax = -7933896566753696355L;
    }

    static {
        setMax();
        int i = setMin + 29;
        setMax = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = null;
            int length = objArr.length;
        }
    }

    public static NetResponse doRequest(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("AppId", RpcConfig.getInstance().getAppId());
        hashMap.put(HeaderConstant.HEADER_KEY_WORKSPACE_ID, RpcConfig.getInstance().getWorkspaceId());
        hashMap.put(HttpHeaders.CONNECTION, "Keep-Alive");
        hashMap.put("Charset", getMax(new char[]{28688, 28741, 9765, 42992, 35459, 17388, 27788, 47737, 58972}).intern());
        hashMap.put("Content-type", "application/json");
        NetResponse doRequest = doRequest(str, hashMap, str2.getBytes());
        int i = setMax + 79;
        setMin = i % 128;
        if ((i % 2 == 0 ? 20 : ';') == ';') {
            return doRequest;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return doRequest;
    }

    public static NetResponse doRequest(String str, Map<String, String> map, byte[] bArr) throws ZolozRpcException {
        InputStream inputStream;
        NetResponse netResponse = new NetResponse();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            httpURLConnection.setReadTimeout(RpcConfig.getInstance().getReadTimeout());
            httpURLConnection.setConnectTimeout(RpcConfig.getInstance().getConnectTimeout());
            httpURLConnection.setRequestMethod("POST");
            boolean z = true;
            httpURLConnection.setDoOutput(true);
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    int i = setMin + 41;
                    try {
                        setMax = i % 128;
                        if (i % 2 != 0) {
                            Map.Entry next = it.next();
                            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
                            int i2 = 61 / 0;
                        } else {
                            Map.Entry next2 = it.next();
                            httpURLConnection.setRequestProperty((String) next2.getKey(), (String) next2.getValue());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            outputStream.close();
            httpURLConnection.connect();
            if ((httpURLConnection != null ? Typography.amp : 'c') == '&') {
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        z = false;
                    }
                    if (z) {
                        inputStream = httpURLConnection.getInputStream();
                        int i3 = setMin + 7;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        inputStream = httpURLConnection.getErrorStream();
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[PhotoParam.DEFAULT_MIN_PHOTO_SIZE];
                    while (true) {
                        int read = inputStream.read(bArr2);
                        if (read <= 0) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, read);
                    }
                    netResponse.responseBody = byteArrayOutputStream.toByteArray();
                    netResponse.rpcCode = responseCode;
                    int i5 = setMin + 37;
                    setMax = i5 % 128;
                    int i6 = i5 % 2;
                } catch (IOException unused) {
                    netResponse.rpcCode = 4;
                }
            }
            return netResponse;
        } catch (IOException unused2) {
            throw new ZolozRpcException((Integer) 2, GriverMonitorConstants.MESSAGE_HTTP_REQUEST_NETWORK_ERROR);
        }
    }

    private static String getMax(char[] cArr) {
        char[] length = onActivityPreCreated.length(getMax, cArr);
        int i = setMin + 37;
        setMax = i % 128;
        int i2 = i % 2;
        int i3 = 4;
        while (true) {
            if ((i3 < length.length ? Typography.quote : 31) != '\"') {
                return new String(length, 4, length.length - 4);
            }
            int i4 = setMin + 73;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            length[i3] = (char) ((int) (((long) (length[i3] ^ length[i3 % 4])) ^ (((long) (i3 - 4)) * getMax)));
            i3++;
        }
    }
}
