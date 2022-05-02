package com.ap.zoloz.hummer.h5;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Base64;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.security.AESEncrypt;
import com.alipay.mobile.security.bio.security.RSAEncrypt;
import com.alipay.mobile.security.bio.security.RandomHelper;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.ScreenUtil;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.alipay.zoloz.hardware.camera.CameraData;
import com.alipay.zoloz.hardware.camera.ICameraCallback;
import com.alipay.zoloz.hardware.camera.widget.PermissionCameraSurfaceView;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.alipay.zoloz.toyger.h5.ToygerH5Service;
import com.ap.zoloz.hummer.api.BaseFacade;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.common.AlertManager;
import com.ap.zoloz.hummer.common.IAlertCallback;
import com.ap.zoloz.hummer.common.RecordManager;
import com.ap.zoloz.hummer.rpc.IRpcCallback;
import com.ap.zoloz.hummer.rpc.RpcManager;
import com.ap.zoloz.hummer.rpc.RpcResponse;
import com.iap.ac.android.acs.plugin.biz.region.foundation.RegionFoundationProxy;
import com.zoloz.zhub.common.factor.facade.HummerGWFacade;
import com.zoloz.zhub.common.factor.facade.HummerH5Facade;
import com.zoloz.zhub.common.factor.model.FactorNextResponse;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

public class ZolozFoundationHandler {
    public static final String TAG = "ZolozFoundationHandler";
    private static final String ZIM_IDENTIFY_ACTION = "action";
    private static final String ZIM_IDENTIFY_GET_META_INFO = "getMetaInfo";
    private static final String ZLZ_FOUNDATION_GET_BLOB = "getImgBlob";
    private static final String ZLZ_FOUNDATION_HIDE_LOADING_DIALOG = "hideLoadingDialog";
    private static final String ZLZ_FOUNDATION_INIT = "init";
    private static final String ZLZ_FOUNDATION_LOGGING = "logging";
    private static final String ZLZ_FOUNDATION_LOG_MESS = "logMessage";
    private static final String ZLZ_FOUNDATION_LOG_SEED_ID = "logSeedID";
    private static final String ZLZ_FOUNDATION_MESSAGE = "message";
    private static final String ZLZ_FOUNDATION_NEGATIVE = "negative";
    private static final String ZLZ_FOUNDATION_POSITIVE = "positive";
    private static final String ZLZ_FOUNDATION_RELEASE = "release";
    private static final String ZLZ_FOUNDATION_SCREEN_BRIGHTNESS = "setScreenBrightness";
    private static final String ZLZ_FOUNDATION_SEND_RPC = "sendRpc";
    private static final String ZLZ_FOUNDATION_SHOW_ALERT = "showAlert";
    private static final String ZLZ_FOUNDATION_SHOW_LOADING_DIALOG = "showLoadingDialog";
    private static final String ZLZ_FOUNDATION_TITLE = "title";
    /* access modifiers changed from: private */
    public PermissionCameraSurfaceView cameraSurfaceView = null;
    private ICameraCallback iCameraCallback = null;
    /* access modifiers changed from: private */
    public IH5HandlerCallback mIH5HandlerCallback;
    private int mImgHeight = 0;
    private int mImgWidth = 0;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    /* access modifiers changed from: private */
    public byte[] mYuvData = null;
    /* access modifiers changed from: private */
    public boolean needCallback = false;

    public void identify(JSONObject jSONObject, Context context, IH5HandlerCallback iH5HandlerCallback) {
        JSONObject jSONObject2 = jSONObject;
        Context context2 = context;
        final IH5HandlerCallback iH5HandlerCallback2 = iH5HandlerCallback;
        if (jSONObject2 != null && context2 != null) {
            this.mIH5HandlerCallback = iH5HandlerCallback2;
            StringBuilder sb = new StringBuilder(" jsapi");
            sb.append(jSONObject.toJSONString());
            HummerLogger.i(TAG, sb.toString());
            String string = jSONObject2.getString("action");
            if (!StringUtil.isNullorEmpty(string) && iH5HandlerCallback2 != null) {
                if ("logging".equals(string)) {
                    RecordManager.getInstance().record(jSONObject2.getString("logSeedID"), (Map) JSONObject.toJavaObject(jSONObject2.getJSONObject("logMessage"), Map.class), jSONObject2.getString(MessageConstants.KEY_PRODUCT_NAME));
                    iH5HandlerCallback2.onCompletion(new JSONObject());
                } else if ("sendRpc".equals(string)) {
                    RpcManager.getInstance().sendRpc(new IRpcCallback() {
                        public void onCompletion(RpcResponse rpcResponse) {
                            if (rpcResponse == null || HummerConstants.NETWOTK_EXCEPTION.equals(rpcResponse.exception)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("success", (Object) Boolean.FALSE);
                                iH5HandlerCallback2.onCompletion(jSONObject);
                                return;
                            }
                            FactorNextResponse factorNextResponse = rpcResponse.factorNextResponse;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("success", (Object) Boolean.TRUE);
                            jSONObject2.put(HummerConstants.NEXT_RESPONSE, (Object) factorNextResponse);
                            StringBuilder sb = new StringBuilder("ZolozFoundationHandler sendBridgeResult ");
                            sb.append(jSONObject2.toString());
                            HummerLogger.i(sb.toString());
                            iH5HandlerCallback2.onCompletion(jSONObject2);
                        }
                    }, RpcManager.getInstance().formatRequest(jSONObject2.getString("factorNextRequest")));
                } else if ("showAlert".equals(string)) {
                    AlertManager.getInstance().alert(jSONObject2.getString("title"), jSONObject2.getString("message"), jSONObject2.getString("positive"), jSONObject2.getString("negative"), new IAlertCallback() {
                        public void onPositive() {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("positive", (Object) Boolean.TRUE);
                            iH5HandlerCallback2.onCompletion(jSONObject);
                        }

                        public void onNegative() {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("positive", (Object) Boolean.FALSE);
                            iH5HandlerCallback2.onCompletion(jSONObject);
                        }
                    });
                } else if ("showLoadingDialog".equals(string)) {
                    AlertManager.getInstance().showProgressDialog("", false, new DialogInterface.OnCancelListener() {
                        public void onCancel(DialogInterface dialogInterface) {
                        }
                    }, true);
                } else if ("hideLoadingDialog".equals(string)) {
                    AlertManager.getInstance().dismissDialog();
                } else if ("init".equals(string)) {
                    String string2 = jSONObject2.getString(HummerConstants.HUMMER_ID);
                    String string3 = jSONObject2.getString(HummerConstants.GATEWAY_URL_KEY);
                    String string4 = jSONObject2.getString("WORKSPACE_ID");
                    String string5 = jSONObject2.getString("APP_ID");
                    JSONObject jSONObject3 = new JSONObject();
                    if (StringUtil.isNullorEmpty(string2) || StringUtil.isNullorEmpty(string3) || StringUtil.isNullorEmpty(string4) || StringUtil.isNullorEmpty(string5)) {
                        jSONObject3.put("success", (Object) Boolean.FALSE);
                        iH5HandlerCallback2.onCompletion(jSONObject3);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(HummerConstants.HUMMER_ID, string2);
                    RecordManager.getInstance().init(context.getApplicationContext(), hashMap);
                    BioRPCService bioRPCService = (BioRPCService) BioServiceManager.getLocalService(context.getApplicationContext(), BioRPCService.class);
                    bioRPCService.setRemoteUrl(string3);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("WORKSPACE_ID", string4);
                    hashMap2.put("APP_ID", string5);
                    bioRPCService.setExtProperties(hashMap2);
                    RpcManager.getInstance().init((HummerGWFacade) bioRPCService.getRpcProxy(HummerH5Facade.class));
                    AlertManager.getInstance().setContext(context2);
                    jSONObject3.put("success", (Object) Boolean.TRUE);
                    iH5HandlerCallback2.onCompletion(jSONObject3);
                } else if ("release".equals(string)) {
                    RpcManager.getInstance().release();
                    RecordManager.getInstance().release();
                    AlertManager.getInstance().release();
                    release();
                    iH5HandlerCallback2.onCompletion(new JSONObject());
                } else if (ZLZ_FOUNDATION_SCREEN_BRIGHTNESS.equals(string)) {
                    int intValue = jSONObject2.getInteger("brightness").intValue();
                    int screenBrightness = ScreenUtil.getScreenBrightness(context);
                    if (intValue > screenBrightness) {
                        ScreenUtil.setScreenBrightness((Activity) context2, intValue);
                    }
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("originalBrightness", (Object) Integer.valueOf(screenBrightness));
                    iH5HandlerCallback2.onCompletion(jSONObject4);
                } else if (ZLZ_FOUNDATION_GET_BLOB.equals(string)) {
                    try {
                        int cameraViewRotation = this.cameraSurfaceView != null ? 360 - this.cameraSurfaceView.getCameraInterface().getCameraViewRotation() : 0;
                        int intValue2 = jSONObject2.getInteger("desiredWidth").intValue();
                        int intValue3 = jSONObject2.getInteger("env").intValue();
                        HashMap<String, Object> generateH5Blob = ToygerH5Service.generateH5Blob(this.mImgHeight, this.mImgWidth, cameraViewRotation, intValue2, jSONObject2.getFloat("ratio").floatValue(), this.mYuvData, BaseFacade.getPublicKey(context.getApplicationContext(), intValue3));
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("content", (Object) new String((byte[]) generateH5Blob.get("content")));
                        jSONObject5.put("key", (Object) Base64.encodeToString((byte[]) generateH5Blob.get("key"), 10));
                        iH5HandlerCallback2.onCompletion(jSONObject5);
                    } catch (OutOfMemoryError e) {
                        HummerLogger.e(e.toString());
                        iH5HandlerCallback2.onCompletion(new JSONObject());
                    }
                } else if ("openCamera".equals(string)) {
                    this.needCallback = true;
                    this.mImgWidth = jSONObject2.getInteger("imgWidth").intValue();
                    this.mImgHeight = jSONObject2.getInteger("imgHeight").intValue();
                    PermissionCameraSurfaceView permissionCameraSurfaceView = new PermissionCameraSurfaceView(context2);
                    this.cameraSurfaceView = permissionCameraSurfaceView;
                    ((ViewGroup) ((Activity) context2).getWindow().getDecorView()).addView(permissionCameraSurfaceView, 0);
                    AnonymousClass4 r0 = new ICameraCallback() {
                        public void onSurfaceCreated() {
                        }

                        public void onSurfaceDestroyed() {
                        }

                        public void onSurfaceChanged(double d, double d2) {
                            if (ZolozFoundationHandler.this.cameraSurfaceView != null) {
                                ViewGroup.LayoutParams layoutParams = ZolozFoundationHandler.this.cameraSurfaceView.getLayoutParams();
                                int width = ZolozFoundationHandler.this.cameraSurfaceView.getWidth();
                                int height = ZolozFoundationHandler.this.cameraSurfaceView.getHeight();
                                double d3 = (double) width;
                                Double.isNaN(d3);
                                int i = (int) ((d3 / d) * d2);
                                if (i >= height) {
                                    layoutParams.height = i;
                                } else {
                                    double d4 = (double) height;
                                    Double.isNaN(d4);
                                    int i2 = (int) ((d4 / d2) * d);
                                    if (i2 >= width) {
                                        layoutParams.width = i2;
                                    }
                                }
                                ZolozFoundationHandler.this.cameraSurfaceView.setLayoutParams(layoutParams);
                            }
                        }

                        public void onError(int i) {
                            if (ZolozFoundationHandler.this.needCallback) {
                                boolean unused = ZolozFoundationHandler.this.needCallback = false;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("success", (Object) Boolean.FALSE);
                                iH5HandlerCallback2.onCompletion(jSONObject);
                            }
                        }

                        public void onPreviewFrame(CameraData cameraData) {
                            if (ZolozFoundationHandler.this.cameraSurfaceView != null) {
                                synchronized (ZolozFoundationHandler.this.mLock) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        byte[] unused = ZolozFoundationHandler.this.mYuvData = cameraData.getColorData().array();
                                        jSONObject.put("frame", (Object) Base64.encodeToString(BitmapHelper.rotateYUVImage(ZolozFoundationHandler.this.mYuvData, cameraData.getColorWidth(), cameraData.getColorHeight(), ZolozFoundationHandler.this.cameraSurfaceView.getCameraInterface().getCameraViewRotation(), 100), 0));
                                        ZolozFoundationHandler.this.mIH5HandlerCallback.onCompletion(jSONObject);
                                    } catch (OutOfMemoryError e) {
                                        HummerLogger.e(e.toString());
                                        ZolozFoundationHandler.this.mIH5HandlerCallback.onCompletion(new JSONObject());
                                    }
                                }
                            }
                        }

                        public void onSuccess() {
                            if (ZolozFoundationHandler.this.needCallback) {
                                boolean unused = ZolozFoundationHandler.this.needCallback = false;
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("success", (Object) Boolean.TRUE);
                                iH5HandlerCallback2.onCompletion(jSONObject);
                            }
                        }
                    };
                    this.iCameraCallback = r0;
                    this.cameraSurfaceView.init(this.mImgHeight, this.mImgWidth, true, r0);
                } else if ("getCameraFrame".equals(string)) {
                    PermissionCameraSurfaceView permissionCameraSurfaceView2 = this.cameraSurfaceView;
                    if (permissionCameraSurfaceView2 != null) {
                        permissionCameraSurfaceView2.getCameraInterface().setOntShotPreviewCallback();
                    }
                } else if ("pausePreview".equals(string)) {
                    PermissionCameraSurfaceView permissionCameraSurfaceView3 = this.cameraSurfaceView;
                    if (permissionCameraSurfaceView3 != null) {
                        permissionCameraSurfaceView3.getCameraInterface().stopPreview();
                    }
                } else if ("resumePreview".equals(string)) {
                    PermissionCameraSurfaceView permissionCameraSurfaceView4 = this.cameraSurfaceView;
                    if (permissionCameraSurfaceView4 != null) {
                        permissionCameraSurfaceView4.getCameraInterface().setCallback(this.iCameraCallback);
                        this.cameraSurfaceView.getCameraInterface().resumePreview();
                    }
                } else if ("encryptLog".equals(string)) {
                    int intValue4 = jSONObject2.getInteger("env").intValue();
                    String string6 = jSONObject2.getString(RegionFoundationProxy.COMPONENT_LOG);
                    try {
                        RSAPublicKey loadPublicKeyByStr = RSAEncrypt.loadPublicKeyByStr(BaseFacade.getPublicKey(context.getApplicationContext(), intValue4));
                        byte[] random = RandomHelper.random(16);
                        byte[] encrypt = RSAEncrypt.encrypt(loadPublicKeyByStr, random);
                        byte[] encrypt2 = AESEncrypt.encrypt(string6.getBytes(), random);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("behavLogSig", (Object) Base64.encodeToString(encrypt, 10));
                        jSONObject6.put("behavLog", (Object) Base64.encodeToString(encrypt2, 10));
                        iH5HandlerCallback2.onCompletion(jSONObject6);
                    } catch (Exception e2) {
                        HummerLogger.e(e2.toString());
                        iH5HandlerCallback2.onCompletion(new JSONObject());
                    }
                }
            }
        }
    }

    private void release() {
        PermissionCameraSurfaceView permissionCameraSurfaceView = this.cameraSurfaceView;
        if (permissionCameraSurfaceView != null) {
            permissionCameraSurfaceView.getCameraInterface().releaseCamera();
            this.cameraSurfaceView = null;
        }
        this.mYuvData = null;
        this.iCameraCallback = null;
        this.mIH5HandlerCallback = null;
    }
}
