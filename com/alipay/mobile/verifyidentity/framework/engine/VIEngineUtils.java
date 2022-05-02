package com.alipay.mobile.verifyidentity.framework.engine;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;
import com.alipay.mobile.verifyidentity.base.product.ProductAssembly;
import com.alipay.mobile.verifyidentity.base.product.ProductAssemblyManager;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.module.VIModule;
import com.ap.zoloz.hummer.connect.api.ConnectFacade;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class VIEngineUtils {
    private static String apdid = "";
    private static String apdidToken = "";
    private static String clientKey = "";
    private static Map<String, String> envData = new HashMap();
    private static Locale locale;
    private static SoftReference<VIEngine.VIListener> softReference;
    private static String umidToken = "";

    public static void initVIEngine() {
        ProductAssembly productAssembly = new ProductAssembly();
        productAssembly.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("password", productAssembly);
        ProductAssembly productAssembly2 = new ProductAssembly();
        productAssembly2.addProduct("com.alipay.mobile.verifyidentity.business.menu.product.MenuModule");
        ProductAssemblyManager.addProductAssembly(RequestConstants.MENU, productAssembly2);
        ProductAssembly productAssembly3 = new ProductAssembly();
        productAssembly3.addProduct("com.alipay.mobile.verifyidentity.business.security.product.SecurityModule");
        ProductAssemblyManager.addProductAssembly("APP_SETTING_NATIVE", productAssembly3);
        ProductAssembly productAssembly4 = new ProductAssembly();
        productAssembly4.addProduct("com.alipay.mobile.verifyidentity.business.security.product.SecurityModule");
        ProductAssemblyManager.addProductAssembly(SecurityConstants.KEY_SQ, productAssembly4);
        ProductAssembly productAssembly5 = new ProductAssembly();
        productAssembly5.addProduct("com.alipay.mobile.verifyidentity.business.security_verification.product.SecurityVerifyModule");
        ProductAssemblyManager.addProductAssembly("SQ", productAssembly5);
        ProductAssembly productAssembly6 = new ProductAssembly();
        productAssembly6.addProduct("com.alipay.mobile.verifyidentity.business.security_verification.product.SecurityVerifyModule");
        ProductAssemblyManager.addProductAssembly("PRIVACY_SHIELD", productAssembly6);
        ProductAssembly productAssembly7 = new ProductAssembly();
        productAssembly7.addProduct("com.alipay.mobile.verifyidentity.business.alert.product.AlertModule");
        ProductAssemblyManager.addProductAssembly(RequestConstants.ALERT, productAssembly7);
        ProductAssembly productAssembly8 = new ProductAssembly();
        productAssembly8.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("pin", productAssembly8);
        ProductAssembly productAssembly9 = new ProductAssembly();
        productAssembly9.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly(RequestConstants.PASSCODE, productAssembly9);
        ProductAssembly productAssembly10 = new ProductAssembly();
        productAssembly10.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("PASSWORD", productAssembly10);
        ProductAssembly productAssembly11 = new ProductAssembly();
        productAssembly11.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("PAYMENT_PASSWORD", productAssembly11);
        ProductAssembly productAssembly12 = new ProductAssembly();
        productAssembly12.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("paymentPassword", productAssembly12);
        ProductAssembly productAssembly13 = new ProductAssembly();
        productAssembly13.addProduct("com.alipay.mobile.verifyidentity.business.pin.product.PinModule");
        ProductAssemblyManager.addProductAssembly("NATIVE_PAYMENT_PASSWORD", productAssembly13);
        ProductAssembly productAssembly14 = new ProductAssembly();
        productAssembly14.addProduct("com.alipay.mobile.verifyidentity.business.otp.product.OtpModule");
        ProductAssemblyManager.addProductAssembly("otpSms", productAssembly14);
        ProductAssembly productAssembly15 = new ProductAssembly();
        productAssembly15.addProduct("com.alipay.mobile.verifyidentity.business.otp.product.OtpModule");
        ProductAssemblyManager.addProductAssembly("OTP_SMS", productAssembly15);
        ProductAssembly productAssembly16 = new ProductAssembly();
        productAssembly16.addProduct("com.alipay.mobile.verifyidentity.business.otp.product.OtpModule");
        ProductAssemblyManager.addProductAssembly("ACCOUNT_BINDING_SMS", productAssembly16);
        ProductAssembly productAssembly17 = new ProductAssembly();
        productAssembly17.addProduct("com.alipay.mobile.verifyidentity.business.otp.product.OtpModule");
        ProductAssemblyManager.addProductAssembly("sms", productAssembly17);
        ProductAssembly productAssembly18 = new ProductAssembly();
        productAssembly18.addProduct("com.alipay.mobile.verifyidentity.business.finger.product.BicProductSetting");
        ProductAssemblyManager.addProductAssembly(RequestConstants.BIC, productAssembly18);
        ProductAssembly productAssembly19 = new ProductAssembly();
        productAssembly19.addProduct("com.alipay.mobile.verifyidentity.business.finger.product.BicModule");
        ProductAssemblyManager.addProductAssembly("PAYMENT_PASSWORD_PLUS", productAssembly19);
        ProductAssembly productAssembly20 = new ProductAssembly();
        productAssembly20.addProduct("com.alipay.mobile.verifyidentity.business.finger.product.BicModule");
        ProductAssemblyManager.addProductAssembly("LOCAL_BIO", productAssembly20);
        ProductAssembly productAssembly21 = new ProductAssembly();
        productAssembly21.addProduct("com.alipay.mobile.verifyidentity.business.finger.product.BicModule");
        ProductAssemblyManager.addProductAssembly("paymentPassword_plus", productAssembly21);
        ProductAssembly productAssembly22 = new ProductAssembly();
        productAssembly22.addProduct("com.alipay.mobile.verifyidentity.business.certificate.product.CertificateModule");
        ProductAssemblyManager.addProductAssembly("CERTIFICATE_MANUAL", productAssembly22);
        ProductAssembly productAssembly23 = new ProductAssembly();
        productAssembly23.addProduct("com.alipay.mobile.verifyidentity.business.face.product.FaceModule");
        ProductAssemblyManager.addProductAssembly("face", productAssembly23);
        try {
            Class.forName("com.alipay.mobile.verifyidentity.business.finger.product.BicModule");
        } catch (Throwable unused) {
        }
    }

    public static VIResult buildResult(VIRespone vIRespone) {
        VIResult vIResult = new VIResult(1001);
        if (vIRespone != null) {
            if (vIRespone.getResult() != 1000) {
                vIResult.setVerifyId(vIRespone.getVerifyId());
                vIResult.setResult(vIRespone.getResult());
            } else {
                Message message = vIRespone.getMessage();
                vIResult.setResult(vIRespone.getResult());
                vIResult.setVerifyId(vIRespone.getVerifyId());
                if (message != null) {
                    vIResult.setMessage(message.getVerifyMessage());
                    vIResult.setBizResponseData(message.getData());
                }
            }
        }
        return vIResult;
    }

    public static Map<String, String> getEnvData(Context context) {
        checkApdidtoken(context);
        envData.put("sdkVersion", "1.0.0");
        envData.put("deviceType", "android");
        envData.put("deviceModel", DeviceInfo.getMobileModel());
        envData.put("appVersion", getVerName(context));
        envData.put("osVersion", Build.VERSION.RELEASE);
        envData.put("apdid", apdid);
        envData.put("language", getLanguage());
        envData.put("apdidToken", apdidToken);
        envData.put("umidToken", umidToken);
        envData.put("clientKey", clientKey);
        return envData;
    }

    public static String getEnvData(Context context, String str, String str2) {
        VIModule create = new VIModule.Builder().create(context, str);
        return create != null ? create.getEnvInfo(str2) : "";
    }

    private static String getLanguge() {
        if (Build.VERSION.SDK_INT >= 24) {
            locale = LocaleList.getDefault().get(0);
        } else {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("-");
        sb.append(locale.getCountry());
        return sb.toString();
    }

    public static String getLanguage() {
        return Locale.getDefault().toString().endsWith("ID") ? "in-ID" : "en_US";
    }

    private static void checkApdidtoken(Context context) {
        try {
            Class.forName("com.alipay.alipaysecuritysdk.apdid.face.APSecuritySdk");
            APSecuritySdk.TokenResult tokenResult = APSecuritySdk.getInstance(context).getTokenResult();
            if (tokenResult != null) {
                apdidToken = tokenResult.apdidToken;
                apdid = tokenResult.apdid;
                umidToken = tokenResult.umidToken;
            }
        } catch (Throwable unused) {
        }
    }

    private static String getVerName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void setVIListener(VIEngine.VIListener vIListener) {
        SoftReference<VIEngine.VIListener> softReference2;
        if (vIListener == null && (softReference2 = softReference) != null) {
            softReference2.clear();
        }
        softReference = new SoftReference<>(vIListener);
    }

    public static VIEngine.VIListener getVIListener() {
        return softReference.get();
    }

    public static String getZolozFaceData(Context context) {
        try {
            Class.forName("com.ap.zoloz.hummer.connect.api.ConnectFacade");
            return ConnectFacade.getMetaInfo(context);
        } catch (Exception unused) {
            return "";
        }
    }
}
