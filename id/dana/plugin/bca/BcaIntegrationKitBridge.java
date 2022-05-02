package id.dana.plugin.bca;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.plugin.bca.oneklik.BcaOneKlikEntity;
import id.dana.plugin.bca.oneklik.registration.RegistrationBcaOneKlikActivity;
import id.dana.plugin.bca.oneklik.registration.model.RegistrationBcaXCOModel;
import id.dana.plugin.bca.oneklik.updatelimit.UpdateLimitBcaOneKlikActivity;
import id.dana.plugin.bca.oneklik.updatelimit.model.UpdateLimitBcaXCOModel;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.FontRes;
import o.LocationBridgeExtension;
import o.PdfViewerActivity;
import o.TwoWheelOptionPickerDialog;
import o.ZoomRecyclerView;
import o.getLeftSelectedOption;
import o.isEnableScale;
import o.setEnableScale;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002JB\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017J\b\u0010\u0012\u001a\u00020\fH&J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J \u0010\u0016\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/plugin/bca/BcaIntegrationKitBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "registrationBcaOneKlikManager", "Lid/dana/plugin/bca/oneklik/registration/RegistrationBcaOneKlikManager;", "updateLimitBcaOneKlikManager", "Lid/dana/plugin/bca/oneklik/updatelimit/UpdateLimitBcaOneKlikManager;", "BCAOneKlik", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "params", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getEnvironment", "handleBcaInformationEvent", "activity", "Landroid/app/Activity;", "handleRegistrationEvent", "Lid/dana/plugin/bca/oneklik/BcaOneKlikEntity;", "handleUpdateLimitEvent", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "Companion", "bca-sdk_release"}, k = 1, mv = {1, 1, 16})
public abstract class BcaIntegrationKitBridge extends BaseBridge {
    public static final getMax Companion = new getMax((byte) 0);
    private static final String TAG;
    private PdfViewerActivity.PageAdapter.AnonymousClass2 registrationBcaOneKlikManager;
    private isEnableScale updateLimitBcaOneKlikManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/plugin/bca/BcaIntegrationKitBridge$Companion;", "", "()V", "TAG", "", "bca-sdk_release"}, k = 1, mv = {1, 1, 16})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 16})
    static final class getMin implements Runnable {
        final /* synthetic */ BridgeCallback getMax;
        final /* synthetic */ Activity length;

        getMin(BridgeCallback bridgeCallback, Activity activity) {
            this.getMax = bridgeCallback;
            this.length = activity;
        }

        public final void run() {
            setEnableScale setenablescale = new setEnableScale(this.getMax, this.length);
            LocationBridgeExtension.setMin(setenablescale.getMin, "execute request permision");
            getLeftSelectedOption.setMax setmax = new getLeftSelectedOption.setMax(setenablescale.getMax);
            setmax.setMax.add("android.permission.READ_PHONE_STATE");
            setmax.getMin = new ZoomRecyclerView(setenablescale);
            setenablescale.setMax = new getLeftSelectedOption(setmax, (byte) 0);
            getLeftSelectedOption getleftselectedoption = setenablescale.setMax;
            if (getleftselectedoption.toFloatRange != null) {
                getleftselectedoption.toFloatRange.clear();
                getleftselectedoption.toFloatRange = null;
            }
            HashSet hashSet = new HashSet(getleftselectedoption.getMax.size());
            for (String next : getleftselectedoption.getMax) {
                getLeftSelectedOption.setMin setmin = new getLeftSelectedOption.setMin(next, FontRes.length((Context) getleftselectedoption.getMin.setMin(), next));
                if (setmin.setMin()) {
                    if (getleftselectedoption.toFloatRange == null) {
                        getleftselectedoption.toFloatRange = new HashSet();
                    }
                    getleftselectedoption.toFloatRange.add(setmin);
                } else {
                    hashSet.add(next);
                }
            }
            if (!hashSet.isEmpty() && !TwoWheelOptionPickerDialog.setMax(getLeftSelectedOption.setMax, getleftselectedoption.getMax)) {
                getLeftSelectedOption.setMax.addAll(getleftselectedoption.getMax);
                getleftselectedoption.getMin.getMax((String[]) hashSet.toArray(new String[0]), getleftselectedoption.setMin);
            } else if (getleftselectedoption.length != null && !TwoWheelOptionPickerDialog.setMax(getleftselectedoption.toFloatRange)) {
                getleftselectedoption.length.setMin(getleftselectedoption.toFloatRange);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 1, 16})
    public static final class length extends TypeReference<BcaOneKlikEntity> {
    }

    static {
        String name = BcaIntegrationKitBridge.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "BcaIntegrationKitBridge::class.java.name");
        TAG = name;
    }

    private final void handleBcaInformationEvent(BridgeCallback bridgeCallback, Activity activity) {
        activity.runOnUiThread(new getMin(bridgeCallback, activity));
    }

    private final void handleRegistrationEvent(BridgeCallback bridgeCallback, Activity activity, BcaOneKlikEntity bcaOneKlikEntity) {
        PdfViewerActivity.PageAdapter.AnonymousClass2 r0 = new Object(bridgeCallback, activity, getEnvironment()) {
            public static final String setMax = AnonymousClass2.class.getSimpleName();
            public static final int setMin = setRightSelectedIndex.getMax();
            public BridgeCallback getMax;
            public Activity getMin;
            public String length;

            {
                this.getMax = r1;
                this.getMin = r2;
                this.length = r3;
            }

            public final void setMax() {
                BridgeCallback bridgeCallback = this.getMax;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("success", (Object) Boolean.FALSE);
                jSONObject.put("error", (Object) "001");
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        };
        this.registrationBcaOneKlikManager = r0;
        if (r0 != null) {
            LocationBridgeExtension.setMin(PdfViewerActivity.PageAdapter.AnonymousClass2.setMax, "execute registration bca one klik");
            if (bcaOneKlikEntity != null) {
                String accessToken = bcaOneKlikEntity.getAccessToken();
                String apiKey = bcaOneKlikEntity.getApiKey();
                String apiSecret = bcaOneKlikEntity.getApiSecret();
                String customerIdMerchant = bcaOneKlikEntity.getCustomerIdMerchant();
                String merchantId = bcaOneKlikEntity.getMerchantId();
                LocationBridgeExtension.setMin(PdfViewerActivity.PageAdapter.AnonymousClass2.setMax, "openRegistrationPage");
                if (TextUtils.isEmpty(merchantId)) {
                    merchantId = "69000";
                }
                RegistrationBcaXCOModel registrationBcaXCOModel = new RegistrationBcaXCOModel();
                registrationBcaXCOModel.isInside = r0.length;
                registrationBcaXCOModel.getMax = accessToken;
                if (TextUtils.isEmpty(apiKey)) {
                    apiKey = "f333e9e6-4de0-46ec-aa6f-5683afd56bc0";
                }
                registrationBcaXCOModel.setMax = apiKey;
                if (TextUtils.isEmpty(apiSecret)) {
                    apiSecret = "7a272369-4c29-44a6-ab84-94b120298a35";
                }
                registrationBcaXCOModel.getMin = apiSecret;
                registrationBcaXCOModel.setMin = customerIdMerchant;
                registrationBcaXCOModel.length = merchantId;
                Activity activity2 = r0.getMin;
                activity2.startActivityForResult(RegistrationBcaOneKlikActivity.generateIntent(activity2, registrationBcaXCOModel), PdfViewerActivity.PageAdapter.AnonymousClass2.setMin);
                return;
            }
            BridgeCallback bridgeCallback2 = r0.getMax;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSONObject.put("error", (Object) "001");
            bridgeCallback2.sendJSONResponse(jSONObject);
        }
    }

    private final void handleUpdateLimitEvent(BridgeCallback bridgeCallback, Activity activity, BcaOneKlikEntity bcaOneKlikEntity) {
        isEnableScale isenablescale = new isEnableScale(bridgeCallback, activity, getEnvironment());
        this.updateLimitBcaOneKlikManager = isenablescale;
        if (isenablescale != null) {
            LocationBridgeExtension.setMin(isEnableScale.getMax, "execute update limit bca one klik");
            if (bcaOneKlikEntity != null) {
                String accessToken = bcaOneKlikEntity.getAccessToken();
                String apiKey = bcaOneKlikEntity.getApiKey();
                String apiSecret = bcaOneKlikEntity.getApiSecret();
                String customerIdMerchant = bcaOneKlikEntity.getCustomerIdMerchant();
                String xcoId = bcaOneKlikEntity.getXcoId();
                String merchantId = bcaOneKlikEntity.getMerchantId();
                LocationBridgeExtension.setMin(isEnableScale.getMax, "openUpdateLimitPage");
                if (TextUtils.isEmpty(merchantId)) {
                    merchantId = "69000";
                }
                UpdateLimitBcaXCOModel updateLimitBcaXCOModel = new UpdateLimitBcaXCOModel();
                updateLimitBcaXCOModel.equals = isenablescale.getMin;
                updateLimitBcaXCOModel.setMin = accessToken;
                if (TextUtils.isEmpty(apiKey)) {
                    apiKey = "f333e9e6-4de0-46ec-aa6f-5683afd56bc0";
                }
                updateLimitBcaXCOModel.getMax = apiKey;
                if (TextUtils.isEmpty(apiSecret)) {
                    apiSecret = "7a272369-4c29-44a6-ab84-94b120298a35";
                }
                updateLimitBcaXCOModel.getMin = apiSecret;
                updateLimitBcaXCOModel.length = customerIdMerchant;
                updateLimitBcaXCOModel.setMax = merchantId;
                updateLimitBcaXCOModel.toFloatRange = xcoId;
                Activity activity2 = isenablescale.setMin;
                activity2.startActivityForResult(UpdateLimitBcaOneKlikActivity.generateIntent(activity2, updateLimitBcaXCOModel), isEnableScale.setMax);
                return;
            }
            BridgeCallback bridgeCallback2 = isenablescale.length;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSONObject.put("error", (Object) "001");
            bridgeCallback2.sendJSONResponse(jSONObject);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: id.dana.plugin.bca.oneklik.BcaOneKlikEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: id.dana.plugin.bca.oneklik.BcaOneKlikEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: id.dana.plugin.bca.oneklik.BcaOneKlikEntity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: id.dana.plugin.bca.oneklik.BcaOneKlikEntity} */
    /* JADX WARNING: Multi-variable type inference failed */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NORMAL)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BCAOneKlik(@org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r3, @org.jetbrains.annotations.Nullable @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"event"}) java.lang.String r4, @org.jetbrains.annotations.Nullable @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"info"}) com.alibaba.fastjson.JSONObject r5, @org.jetbrains.annotations.Nullable @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest com.alibaba.fastjson.JSONObject r6, @org.jetbrains.annotations.Nullable @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r7) {
        /*
            r2 = this;
            java.lang.String r6 = "page"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r6)
            r6 = 0
            if (r5 == 0) goto L_0x001a
            java.lang.String r5 = r5.toJSONString()     // Catch:{ JSONException | NullPointerException -> 0x0018 }
            id.dana.plugin.bca.BcaIntegrationKitBridge$length r0 = new id.dana.plugin.bca.BcaIntegrationKitBridge$length     // Catch:{ JSONException | NullPointerException -> 0x0018 }
            r0.<init>()     // Catch:{ JSONException | NullPointerException -> 0x0018 }
            r1 = 0
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch:{ JSONException | NullPointerException -> 0x0018 }
            java.lang.Object r6 = com.alibaba.fastjson.JSONObject.parseObject((java.lang.String) r5, r0, (com.alibaba.fastjson.parser.Feature[]) r1)     // Catch:{ JSONException | NullPointerException -> 0x0018 }
        L_0x0018:
            id.dana.plugin.bca.oneklik.BcaOneKlikEntity r6 = (id.dana.plugin.bca.oneklik.BcaOneKlikEntity) r6
        L_0x001a:
            com.alibaba.ariver.app.api.PageContext r3 = r3.getPageContext()
            if (r3 == 0) goto L_0x0089
            android.app.Activity r3 = r3.getActivity()
            if (r3 == 0) goto L_0x0089
            if (r4 == 0) goto L_0x0089
            int r5 = r4.hashCode()
            r0 = -1350309703(0xffffffffaf83e8b9, float:-2.399412E-10)
            if (r5 == r0) goto L_0x006d
            r0 = -591316878(0xffffffffdcc13872, float:-4.35093862E17)
            if (r5 == r0) goto L_0x0050
            r6 = 1968600364(0x7556752c, float:2.7185744E32)
            if (r5 != r6) goto L_0x0089
            java.lang.String r5 = "information"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = TAG
            java.lang.String r5 = "BcaOneKlikEvent.INFORMATION"
            o.LocationBridgeExtension.setMin(r4, r5)
            if (r7 == 0) goto L_0x004f
            r2.handleBcaInformationEvent(r7, r3)
        L_0x004f:
            return
        L_0x0050:
            java.lang.String r5 = "updateLimit"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            boolean r4 = o.PdfViewerActivity.PageAdapter.PageImageHolder.getMax(r3)
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = TAG
            java.lang.String r5 = "BcaOneKlikEvent.UPDATELIMIT"
            o.LocationBridgeExtension.setMin(r4, r5)
            if (r6 == 0) goto L_0x0089
            if (r7 == 0) goto L_0x006c
            r2.handleUpdateLimitEvent(r7, r3, r6)
        L_0x006c:
            return
        L_0x006d:
            java.lang.String r5 = "registration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0089
            boolean r4 = o.PdfViewerActivity.PageAdapter.PageImageHolder.setMax(r3)
            if (r4 == 0) goto L_0x0089
            java.lang.String r4 = TAG
            java.lang.String r5 = "BcaOneKlikEvent.REGISTRATION"
            o.LocationBridgeExtension.setMin(r4, r5)
            if (r6 == 0) goto L_0x0089
            if (r7 == 0) goto L_0x0089
            r2.handleRegistrationEvent(r7, r3, r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.plugin.bca.BcaIntegrationKitBridge.BCAOneKlik(com.alibaba.ariver.app.api.Page, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    @NotNull
    public abstract String getEnvironment();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceiveActivityResult(@org.jetbrains.annotations.NotNull id.dana.lib.gcontainer.app.bridge.core.BaseBridge.setMin r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            int r2 = r1.getMax
            int r3 = o.PdfViewerActivity.PageAdapter.AnonymousClass2.setMin
            java.lang.String r5 = "onGetResult result Canceled"
            java.lang.String r6 = "onGetResult result OK"
            java.lang.String r7 = "001"
            java.lang.String r8 = "tokenStatus"
            java.lang.String r10 = "004"
            java.lang.String r11 = "003"
            java.lang.String r12 = "002"
            java.lang.String r13 = "maxLimit"
            java.lang.String r14 = "credentialNo"
            java.lang.String r15 = "credentialType"
            java.lang.String r9 = "xcoId"
            java.lang.String r4 = "userAgent"
            r16 = r8
            java.lang.String r8 = "deviceId"
            r17 = r12
            java.lang.String r12 = "success"
            r18 = r11
            java.lang.String r11 = "error"
            if (r2 != r3) goto L_0x0183
            o.PdfViewerActivity$PageAdapter$2 r2 = r0.registrationBcaOneKlikManager
            if (r2 == 0) goto L_0x029d
            int r3 = r1.getMax
            int r0 = r1.getMin
            android.content.Intent r1 = r1.length
            r19 = r10
            int r10 = o.PdfViewerActivity.PageAdapter.AnonymousClass2.setMin
            if (r3 != r10) goto L_0x0182
            if (r1 != 0) goto L_0x005a
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r2.getMax
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r12, (java.lang.Object) r2)
            r1.put((java.lang.String) r11, (java.lang.Object) r7)
            r0.sendJSONResponse(r1)
            return
        L_0x005a:
            r3 = -1
            if (r0 != r3) goto L_0x00d5
            java.lang.String r0 = o.PdfViewerActivity.PageAdapter.AnonymousClass2.setMax
            o.LocationBridgeExtension.setMin(r0, r6)
            java.lang.String r0 = "hasBeenRegistered"
            boolean r3 = r1.hasExtra(r0)
            if (r3 == 0) goto L_0x009b
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r2 = r2.getMax
            r3 = 1
            boolean r3 = r1.getBooleanExtra(r0, r3)
            java.lang.String r5 = r1.getStringExtra(r9)
            java.lang.String r6 = r1.getStringExtra(r8)
            java.lang.String r1 = r1.getStringExtra(r4)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r7.put((java.lang.String) r12, (java.lang.Object) r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r7.put((java.lang.String) r0, (java.lang.Object) r3)
            r7.put((java.lang.String) r9, (java.lang.Object) r5)
            r7.put((java.lang.String) r8, (java.lang.Object) r6)
            r7.put((java.lang.String) r4, (java.lang.Object) r1)
            r2.sendJSONResponse(r7)
            return
        L_0x009b:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r2.getMax
            java.lang.String r2 = r1.getStringExtra(r9)
            java.lang.String r3 = r1.getStringExtra(r15)
            java.lang.String r5 = r1.getStringExtra(r14)
            java.lang.String r6 = r1.getStringExtra(r13)
            java.lang.String r7 = r1.getStringExtra(r8)
            java.lang.String r1 = r1.getStringExtra(r4)
            com.alibaba.fastjson.JSONObject r10 = new com.alibaba.fastjson.JSONObject
            r10.<init>()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.put((java.lang.String) r12, (java.lang.Object) r11)
            r10.put((java.lang.String) r9, (java.lang.Object) r2)
            r10.put((java.lang.String) r15, (java.lang.Object) r3)
            r10.put((java.lang.String) r14, (java.lang.Object) r5)
            r10.put((java.lang.String) r13, (java.lang.Object) r6)
            r10.put((java.lang.String) r8, (java.lang.Object) r7)
            r10.put((java.lang.String) r4, (java.lang.Object) r1)
            r0.sendJSONResponse(r10)
            return
        L_0x00d5:
            if (r0 != 0) goto L_0x0182
            java.lang.String r0 = o.PdfViewerActivity.PageAdapter.AnonymousClass2.setMax
            o.LocationBridgeExtension.setMin(r0, r5)
            java.lang.String r0 = r1.getStringExtra(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ea
            r2.setMax()
            return
        L_0x00ea:
            java.lang.String r0 = r1.getStringExtra(r11)
            int r3 = r0.hashCode()
            switch(r3) {
                case 47666: goto L_0x0118;
                case 47667: goto L_0x010a;
                case 47668: goto L_0x00fc;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            r5 = r17
            r10 = r18
            r3 = r19
            goto L_0x0126
        L_0x00fc:
            r3 = r19
            boolean r0 = r0.equals(r3)
            r5 = r17
            r10 = r18
            if (r0 == 0) goto L_0x0126
            r0 = 2
            goto L_0x0127
        L_0x010a:
            r10 = r18
            r3 = r19
            boolean r0 = r0.equals(r10)
            r5 = r17
            if (r0 == 0) goto L_0x0126
            r0 = 1
            goto L_0x0127
        L_0x0118:
            r5 = r17
            r10 = r18
            r3 = r19
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0126
            r0 = 0
            goto L_0x0127
        L_0x0126:
            r0 = -1
        L_0x0127:
            if (r0 == 0) goto L_0x0159
            r6 = 1
            if (r0 == r6) goto L_0x0146
            r1 = 2
            if (r0 == r1) goto L_0x0133
            r2.setMax()
            return
        L_0x0133:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r2.getMax
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r12, (java.lang.Object) r2)
            r1.put((java.lang.String) r11, (java.lang.Object) r3)
            r0.sendJSONResponse(r1)
            return
        L_0x0146:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r2.getMax
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r12, (java.lang.Object) r2)
            r1.put((java.lang.String) r11, (java.lang.Object) r10)
            r0.sendJSONResponse(r1)
            return
        L_0x0159:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r2.getMax
            r2 = r16
            java.lang.String r3 = r1.getStringExtra(r2)
            java.lang.String r6 = r1.getStringExtra(r8)
            java.lang.String r1 = r1.getStringExtra(r4)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r7.put((java.lang.String) r12, (java.lang.Object) r9)
            r7.put((java.lang.String) r11, (java.lang.Object) r5)
            r7.put((java.lang.String) r2, (java.lang.Object) r3)
            r7.put((java.lang.String) r8, (java.lang.Object) r6)
            r7.put((java.lang.String) r4, (java.lang.Object) r1)
            r0.sendJSONResponse(r7)
        L_0x0182:
            return
        L_0x0183:
            r3 = r10
            r0 = r17
            r10 = r18
            int r2 = r1.getMax
            r17 = r7
            int r7 = o.isEnableScale.setMax
            if (r2 != r7) goto L_0x029d
            r2 = r20
            o.isEnableScale r7 = r2.updateLimitBcaOneKlikManager
            if (r7 == 0) goto L_0x029d
            int r2 = r1.getMax
            r18 = r0
            int r0 = r1.getMin
            android.content.Intent r1 = r1.length
            r19 = r10
            int r10 = o.isEnableScale.setMax
            if (r2 != r10) goto L_0x029d
            if (r1 == 0) goto L_0x029a
            r2 = -1
            if (r0 != r2) goto L_0x01e8
            java.lang.String r0 = o.isEnableScale.getMax
            o.LocationBridgeExtension.setMin(r0, r6)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r7.length
            java.lang.String r2 = r1.getStringExtra(r9)
            java.lang.String r3 = r1.getStringExtra(r15)
            java.lang.String r5 = r1.getStringExtra(r14)
            java.lang.String r6 = r1.getStringExtra(r13)
            java.lang.String r7 = r1.getStringExtra(r8)
            java.lang.String r1 = r1.getStringExtra(r4)
            com.alibaba.fastjson.JSONObject r10 = new com.alibaba.fastjson.JSONObject
            r10.<init>()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r10.put((java.lang.String) r12, (java.lang.Object) r11)
            r10.put((java.lang.String) r9, (java.lang.Object) r2)
            r10.put((java.lang.String) r15, (java.lang.Object) r3)
            r10.put((java.lang.String) r14, (java.lang.Object) r5)
            r10.put((java.lang.String) r13, (java.lang.Object) r6)
            r10.put((java.lang.String) r8, (java.lang.Object) r7)
            r10.put((java.lang.String) r4, (java.lang.Object) r1)
            r0.sendJSONResponse(r10)
            return
        L_0x01e8:
            if (r0 != 0) goto L_0x029d
            java.lang.String r0 = o.isEnableScale.getMax
            o.LocationBridgeExtension.setMin(r0, r5)
            java.lang.String r0 = r1.getStringExtra(r11)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x029a
            java.lang.String r0 = r1.getStringExtra(r11)
            int r5 = r0.hashCode()
            r6 = 3
            switch(r5) {
                case 47665: goto L_0x022f;
                case 47666: goto L_0x0223;
                case 47667: goto L_0x0217;
                case 47668: goto L_0x0206;
                default: goto L_0x0205;
            }
        L_0x0205:
            goto L_0x0212
        L_0x0206:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0212
            r9 = r18
            r5 = r19
            r2 = 3
            goto L_0x023c
        L_0x0212:
            r9 = r18
            r5 = r19
            goto L_0x023c
        L_0x0217:
            r5 = r19
            boolean r0 = r0.equals(r5)
            r9 = r18
            if (r0 == 0) goto L_0x023c
            r2 = 2
            goto L_0x023c
        L_0x0223:
            r9 = r18
            r5 = r19
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x023c
            r2 = 1
            goto L_0x023c
        L_0x022f:
            r10 = r17
            r9 = r18
            r5 = r19
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x023c
            r2 = 0
        L_0x023c:
            if (r2 == 0) goto L_0x029a
            r0 = 1
            if (r2 == r0) goto L_0x0270
            r0 = 2
            if (r2 == r0) goto L_0x025d
            if (r2 == r6) goto L_0x024a
            r7.setMin()
            return
        L_0x024a:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r7.length
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r12, (java.lang.Object) r2)
            r1.put((java.lang.String) r11, (java.lang.Object) r3)
            r0.sendJSONResponse(r1)
            return
        L_0x025d:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r7.length
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put((java.lang.String) r12, (java.lang.Object) r2)
            r1.put((java.lang.String) r11, (java.lang.Object) r5)
            r0.sendJSONResponse(r1)
            return
        L_0x0270:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r7.length
            r2 = r16
            java.lang.String r3 = r1.getStringExtra(r2)
            java.lang.String r5 = r1.getStringExtra(r8)
            java.lang.String r1 = r1.getStringExtra(r4)
            com.alibaba.fastjson.JSONObject r6 = new com.alibaba.fastjson.JSONObject
            r6.<init>()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.put((java.lang.String) r12, (java.lang.Object) r7)
            r6.put((java.lang.String) r11, (java.lang.Object) r9)
            r6.put((java.lang.String) r2, (java.lang.Object) r3)
            r6.put((java.lang.String) r8, (java.lang.Object) r5)
            r6.put((java.lang.String) r4, (java.lang.Object) r1)
            r0.sendJSONResponse(r6)
            return
        L_0x029a:
            r7.setMin()
        L_0x029d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.plugin.bca.BcaIntegrationKitBridge.onReceiveActivityResult(id.dana.lib.gcontainer.app.bridge.core.BaseBridge$setMin):void");
    }
}
