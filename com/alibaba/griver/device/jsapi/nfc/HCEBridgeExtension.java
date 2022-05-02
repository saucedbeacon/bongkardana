package com.alibaba.griver.device.jsapi.nfc;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.BridgeUtils;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.jsapi.nfc.service.TinyAppHostApduService;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.ArrayList;

public class HCEBridgeExtension implements BridgeExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9078a = HCEBridgeExtension.class.getSimpleName();
    private ResultReceiver b;
    /* access modifiers changed from: private */
    public ResultReceiver c;
    private CardEmulation d;
    /* access modifiers changed from: private */
    public boolean e = false;
    /* access modifiers changed from: private */
    public BridgeCallback f;

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void startHCE(@BindingApiContext ApiContext apiContext, @BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        JSONArray jSONArray;
        String str = H5ResourceHandlerUtil.OTHER;
        if (BridgeUtils.contextIsValid(bridgeCallback)) {
            Application applicationContext = GriverEnv.getApplicationContext();
            int a2 = a();
            this.f = bridgeCallback;
            if (a2 != 0 || Build.VERSION.SDK_INT < 21) {
                a(a2, bridgeCallback);
                return;
            }
            if (jSONObject != null) {
                try {
                    jSONArray = jSONObject.getJSONArray("aidList");
                } catch (Exception unused) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13006, applicationContext.getString(R.string.griver_register_aid_failed)));
                    return;
                }
            } else {
                jSONArray = null;
            }
            if (jSONArray == null || jSONArray.size() <= 0) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13003, applicationContext.getString(R.string.griver_aid_column_format_error)));
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            String appId = apiContext.getAppId();
            String string = CommonUtils.getString(jSONObject, "category");
            if (TextUtils.equals(string, str) || TextUtils.equals(string, "payment")) {
                str = string;
            }
            ComponentName componentName = new ComponentName(apiContext.getActivity(), TinyAppHostApduService.class);
            CardEmulation instance = CardEmulation.getInstance(NfcAdapter.getDefaultAdapter(apiContext.getActivity()));
            this.d = instance;
            this.e = instance.registerAidsForService(componentName, str, arrayList);
            Intent intent = new Intent(apiContext.getActivity(), TinyAppHostApduService.class);
            intent.putExtra(TinyAppConstants.KEY_RESULT_RECEIVER, a(page));
            intent.putExtra(TinyAppConstants.KEY_APP_ID, appId);
            intent.putExtra("key_time_limit", 10000);
            intent.putStringArrayListExtra(TinyAppConstants.KEY_AID_LIST, arrayList);
            apiContext.getActivity().startService(intent);
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse stopHCE(@BindingApiContext ApiContext apiContext) {
        return a((Context) apiContext.getActivity());
    }

    private BridgeResponse a(Context context) {
        if (context == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (!this.e) {
            return new BridgeResponse.Error(13007, context.getString(R.string.griver_call_startHCE_first));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.e = !this.d.removeAidsForService(new ComponentName(context, TinyAppHostApduService.class), H5ResourceHandlerUtil.OTHER);
            return BridgeResponse.SUCCESS;
        }
        String str = f9078a;
        StringBuilder sb = new StringBuilder("stopHCE... Build.VERSION.SDK_INT = ");
        sb.append(Build.VERSION.SDK_INT);
        RVLogger.d(str, sb.toString());
        return new BridgeResponse.Error(13002, context.getString(R.string.griver_hce_not_support));
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void sendHCEMessage(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        String str;
        if (BridgeUtils.contextIsValid(bridgeCallback)) {
            Application applicationContext = GriverEnv.getApplicationContext();
            this.f = bridgeCallback;
            if (!this.e) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13007, applicationContext.getString(R.string.griver_call_startHCE_first)));
            }
            if (jSONObject != null) {
                try {
                    str = jSONObject.getString("data");
                } catch (Exception e2) {
                    RVLogger.e(f9078a, "sendHCEMessage fail", e2);
                    this.f.sendBridgeResponse(new BridgeResponse.Error(13008, applicationContext.getString(R.string.griver_unknown_error)));
                    return;
                }
            } else {
                str = "";
            }
            RVLogger.d(f9078a, "sendHCEMessage... ".concat(String.valueOf(str)));
            byte[] hexStringToByteArray = NFCUtils.hexStringToByteArray(str);
            if (hexStringToByteArray == null) {
                this.f.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
            }
            if (this.c != null) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(TinyAppConstants.KEY_APDU_COMMAND, hexStringToByteArray);
                this.c.send(10000, bundle);
                return;
            }
            this.f.sendBridgeResponse(new BridgeResponse.Error(13008, applicationContext.getString(R.string.griver_unknown_error)));
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getHCEState(@BindingCallback BridgeCallback bridgeCallback) {
        a(a(), bridgeCallback);
    }

    private void a(int i, BridgeCallback bridgeCallback) {
        if (BridgeUtils.contextIsValid(bridgeCallback)) {
            Application applicationContext = GriverEnv.getApplicationContext();
            if (i == 1) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13000, applicationContext.getString(R.string.griver_nfc_not_support)));
            } else if (i == 2) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13002, applicationContext.getString(R.string.griver_hce_not_support)));
            } else if (i == 3) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13001, applicationContext.getString(R.string.griver_nfc_not_enabled)));
            } else if (i == 0) {
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }
    }

    private int a() {
        Application applicationContext = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext();
        boolean hasFeatureNfc = NFCUtils.hasFeatureNfc(applicationContext);
        boolean hasFeatureHCE = NFCUtils.hasFeatureHCE(applicationContext);
        boolean isNfcEnable = NFCUtils.isNfcEnable(applicationContext);
        String str = f9078a;
        StringBuilder sb = new StringBuilder("getHCEState... isNfcFeature = ");
        sb.append(hasFeatureNfc);
        sb.append(" isNfcEnable = ");
        sb.append(isNfcEnable);
        sb.append(" isSystemFeatureHCE = ");
        sb.append(hasFeatureHCE);
        RVLogger.d(str, sb.toString());
        if (!hasFeatureNfc) {
            return 1;
        }
        if (!hasFeatureHCE) {
            return 2;
        }
        return !isNfcEnable ? 3 : 0;
    }

    private ResultReceiver a(final Page page) {
        if (this.b == null) {
            this.b = new ResultReceiver(new Handler(Looper.getMainLooper())) {
                /* access modifiers changed from: protected */
                public void onReceiveResult(int i, Bundle bundle) {
                    if (BridgeUtils.contextIsValid(HCEBridgeExtension.this.f)) {
                        Application applicationContext = GriverEnv.getApplicationContext();
                        RVLogger.d(HCEBridgeExtension.f9078a, "onReceiveResult... resultCode = ".concat(String.valueOf(i)));
                        if (i == 10000) {
                            HCEBridgeExtension hCEBridgeExtension = HCEBridgeExtension.this;
                            hCEBridgeExtension.a(bundle, hCEBridgeExtension.f, page);
                        } else if (i == 10002) {
                            HCEBridgeExtension hCEBridgeExtension2 = HCEBridgeExtension.this;
                            hCEBridgeExtension2.b(bundle, hCEBridgeExtension2.f, page);
                        } else if (i == 13005) {
                            HCEBridgeExtension.this.f.sendBridgeResponse(new BridgeResponse.Error(13005, applicationContext.getString(R.string.griver_invalid_instruction)));
                        } else if (i == 10019) {
                            bundle.setClassLoader(getClass().getClassLoader());
                            ResultReceiver unused = HCEBridgeExtension.this.c = (ResultReceiver) bundle.getParcelable(TinyAppConstants.KEY_RESULT_RECEIVER);
                            if (!HCEBridgeExtension.this.e || HCEBridgeExtension.this.c == null) {
                                HCEBridgeExtension.this.f.sendBridgeResponse(new BridgeResponse.Error(13006, applicationContext.getString(R.string.griver_register_aid_failed)));
                                return;
                            }
                            RVLogger.d(HCEBridgeExtension.f9078a, "onReceiveResult... service send receiver connected!!");
                            HCEBridgeExtension.this.f.sendBridgeResponse(BridgeResponse.SUCCESS);
                        } else if (i == 10020) {
                            ResultReceiver unused2 = HCEBridgeExtension.this.c = null;
                            RVLogger.d(HCEBridgeExtension.f9078a, "onReceiveResult... service destroy");
                        }
                    }
                }
            };
        }
        return this.b;
    }

    /* access modifiers changed from: private */
    public void a(Bundle bundle, BridgeCallback bridgeCallback, Page page) {
        if (BridgeUtils.contextIsValid(bridgeCallback)) {
            Application applicationContext = GriverEnv.getApplicationContext();
            try {
                byte[] byteArray = bundle.getByteArray(TinyAppConstants.KEY_APDU_COMMAND);
                if (byteArray != null) {
                    if (byteArray.length > 0) {
                        String byteArrayToHexString = NFCUtils.byteArrayToHexString(byteArray);
                        RVLogger.d(f9078a, "onApduMessage... ".concat(String.valueOf(byteArrayToHexString)));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("messageType", (Object) 1);
                        jSONObject.put("data", (Object) byteArrayToHexString);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", (Object) jSONObject);
                        EngineUtils.sendToRender(page.getRender(), "hCEMessage", jSONObject2, (SendToRenderCallback) null);
                        return;
                    }
                }
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13005, applicationContext.getString(R.string.griver_register_aid_failed)));
            } catch (Exception unused) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13008, applicationContext.getString(R.string.griver_unknown_error)));
            }
        }
    }

    /* access modifiers changed from: private */
    public void b(Bundle bundle, BridgeCallback bridgeCallback, Page page) {
        if (BridgeUtils.contextIsValid(bridgeCallback)) {
            Application applicationContext = GriverEnv.getApplicationContext();
            try {
                int i = bundle.getInt(TinyAppConstants.KEY_DEACTIVATED_REASON, 0);
                RVLogger.d(f9078a, "onDeactivateMessage... reason = ".concat(String.valueOf(i)));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("messageType", (Object) 2);
                jSONObject.put(ZdocRecordService.REASON, (Object) Integer.valueOf(i));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("data", (Object) jSONObject);
                EngineUtils.sendToRender(page.getRender(), "hCEMessage", jSONObject2, (SendToRenderCallback) null);
            } catch (Exception unused) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(13008, applicationContext.getString(R.string.griver_unknown_error)));
            }
        }
    }

    public void onFinalized() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            a((Context) rVEnvironmentService.getApplicationContext());
        }
    }
}
