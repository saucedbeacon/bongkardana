package com.alipay.mobile.verifyidentity.http;

import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICInitRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.json.JSONObject;

public class HttpTaskUtil {
    private static String TAG = "HttpTaskUtil";
    private static String initUrl = "http://ifcsupergw.insandbox.dl.alipaydev.com/alipayplus/risk/identify/doInit.htm";
    private static String verifyUrl = "http://ifcsupergw.insandbox.dl.alipaydev.com/alipayplus/risk/identify/doVerify.htm";
    private static String viewUrl = "http://ifcsupergw.insandbox.dl.alipaydev.com/alipayplus/risk/identify/doView.htm";

    public static MICRpcResponse getHttpResponse(MICRpcRequest mICRpcRequest) {
        if (mICRpcRequest instanceof MICInitRequest) {
            return requestPost(HttpRequestJson.buildInitReQuestJson(mICRpcRequest), initUrl, mICRpcRequest);
        }
        if (mICRpcRequest.action.equals(RequestConstants.VIEW)) {
            return requestPost(HttpRequestJson.buildInitReQuestJson(mICRpcRequest), viewUrl, mICRpcRequest);
        }
        if (mICRpcRequest.action.equals(RequestConstants.VERIFY)) {
            return requestPost(HttpRequestJson.buildVerifyRequestJson(mICRpcRequest), verifyUrl, mICRpcRequest);
        }
        return null;
    }

    private static MICRpcResponse requestPost(String str, String str2, MICRpcRequest mICRpcRequest) {
        try {
            byte[] bytes = str.getBytes();
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str2).openConnection()));
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bytes);
            dataOutputStream.flush();
            dataOutputStream.close();
            MICRpcResponse parseJson = httpURLConnection.getResponseCode() == 200 ? parseJson(streamToString(httpURLConnection.getInputStream()), mICRpcRequest) : null;
            httpURLConnection.disconnect();
            return parseJson;
        } catch (Exception unused) {
            return null;
        }
    }

    private static MICRpcResponse parseJson(String str, MICRpcRequest mICRpcRequest) {
        MICRpcResponse mICRpcResponse = new MICRpcResponse();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("response").optJSONObject(TtmlNode.TAG_BODY);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("resultInfo");
            mICRpcResponse.success = true;
            mICRpcResponse.sysErrCode = optJSONObject2.optString("resultCode");
            mICRpcResponse.verifyCode = optJSONObject2.optString("resultCode");
            mICRpcResponse.verifyMessage = optJSONObject2.optString("resultCode");
            mICRpcResponse.verifySuccess = "S".equals(optJSONObject2.optString("resultStatus"));
            mICRpcResponse.finishCode = "00000000".equals(optJSONObject2.optString(optJSONObject2.getString("resultCodeId"))) ? Result.ERROR_CODE_UNKNOWN_ERROR : "1001";
            if (optJSONObject.has("verifyId")) {
                mICRpcResponse.verifyId = optJSONObject.optString("verifyId");
            }
            if (optJSONObject.has(FirebaseAnalytics.Param.METHOD)) {
                mICRpcResponse.nextStep = optJSONObject.optString(FirebaseAnalytics.Param.METHOD);
            } else if (optJSONObject.has("nextMethod")) {
                mICRpcResponse.nextStep = optJSONObject.optString("nextMethod");
            }
            if (optJSONObject.has("renderData")) {
                mICRpcResponse.data = optJSONObject.optJSONObject("renderData").toString();
            }
            if (optJSONObject.has("isFinish")) {
                mICRpcResponse.finish = optJSONObject.optBoolean("isFinish");
            }
        } catch (Exception unused) {
        }
        return mICRpcResponse;
    }

    private static String streamToString(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
