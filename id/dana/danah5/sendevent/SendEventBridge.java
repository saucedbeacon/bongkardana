package id.dana.danah5.sendevent;

import android.app.Application;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultEmbedViewManager;
import o.GriverOptionMenuEvent;
import o.PrepareException;
import o.UpdateAppCallback;
import o.checkBoxPrompt;
import o.getStatus;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J2\u0010\u001c\u001a\u00020\u00182\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010 2\b\b\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010!\u001a\u00020\"H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lid/dana/danah5/sendevent/SendEventBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "remoteGnPaymentEntityData", "Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;", "getRemoteGnPaymentEntityData", "()Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;", "setRemoteGnPaymentEntityData", "(Lid/dana/data/globalnetwork/source/remote/RemoteGnPaymentEntityData;)V", "saveLastTransaction", "Lid/dana/domain/account/interactor/SaveLastTransaction;", "getSaveLastTransaction", "()Lid/dana/domain/account/interactor/SaveLastTransaction;", "setSaveLastTransaction", "(Lid/dana/domain/account/interactor/SaveLastTransaction;)V", "splitFacade", "Lid/dana/data/toggle/SplitFacade;", "getSplitFacade", "()Lid/dana/data/toggle/SplitFacade;", "setSplitFacade", "(Lid/dana/data/toggle/SplitFacade;)V", "onInitialized", "", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "sendEvent", "eventName", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "page", "Lcom/alibaba/ariver/app/api/Page;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SendEventBridge extends BaseBridge {
    private BridgeCallback bridgeCallback;
    @Inject
    public DefaultEmbedViewManager remoteGnPaymentEntityData;
    @Inject
    public GriverOptionMenuEvent saveLastTransaction;
    @Inject
    public UpdateAppCallback splitFacade;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<getStatus> {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends TypeReference<JSONObject> {
    }

    @NotNull
    public final DefaultEmbedViewManager getRemoteGnPaymentEntityData() {
        DefaultEmbedViewManager defaultEmbedViewManager = this.remoteGnPaymentEntityData;
        if (defaultEmbedViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("remoteGnPaymentEntityData");
        }
        return defaultEmbedViewManager;
    }

    public final void setRemoteGnPaymentEntityData(@NotNull DefaultEmbedViewManager defaultEmbedViewManager) {
        Intrinsics.checkNotNullParameter(defaultEmbedViewManager, "<set-?>");
        this.remoteGnPaymentEntityData = defaultEmbedViewManager;
    }

    @NotNull
    public final UpdateAppCallback getSplitFacade() {
        UpdateAppCallback updateAppCallback = this.splitFacade;
        if (updateAppCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("splitFacade");
        }
        return updateAppCallback;
    }

    public final void setSplitFacade(@NotNull UpdateAppCallback updateAppCallback) {
        Intrinsics.checkNotNullParameter(updateAppCallback, "<set-?>");
        this.splitFacade = updateAppCallback;
    }

    @NotNull
    public final GriverOptionMenuEvent getSaveLastTransaction() {
        GriverOptionMenuEvent griverOptionMenuEvent = this.saveLastTransaction;
        if (griverOptionMenuEvent == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveLastTransaction");
        }
        return griverOptionMenuEvent;
    }

    public final void setSaveLastTransaction(@NotNull GriverOptionMenuEvent griverOptionMenuEvent) {
        Intrinsics.checkNotNullParameter(griverOptionMenuEvent, "<set-?>");
        this.saveLastTransaction = griverOptionMenuEvent;
    }

    public final void onInitialized() {
        super.onInitialized();
        saveSnapshot.getMax getmax = new saveSnapshot.getMax((byte) 0);
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            if (applicationComponent != null) {
                getmax.setMin = applicationComponent;
                getmax.getMin = new GContainerModule();
                getmax.getMin().setMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: o.getStatus} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v3, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r4 = r4.getActivity();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00fb  */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.NORMAL)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter(canOverride = false)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendEvent(@org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"event"}) java.lang.String r4, @org.jetbrains.annotations.Nullable @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"info"}) com.alibaba.fastjson.JSONObject r5, @org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r6, @org.jetbrains.annotations.NotNull @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r7) {
        /*
            r3 = this;
            java.lang.String r0 = "eventName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "bridgeCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "page"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r3.bridgeCallback = r6
            int r6 = r4.hashCode()
            r0 = -1939354664(0xffffffff8c67cbd8, float:-1.7856935E-31)
            r1 = 0
            r2 = 0
            if (r6 == r0) goto L_0x006a
            r0 = -901986576(0xffffffffca3cc6f0, float:-3092924.0)
            if (r6 == r0) goto L_0x004a
            r7 = 790572537(0x2f1f2df9, float:1.4477299E-10)
            if (r6 == r7) goto L_0x0028
            goto L_0x012c
        L_0x0028:
            java.lang.String r6 = "ChangePhoneNumberFinished"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x012c
            if (r5 == 0) goto L_0x0045
            java.lang.String r4 = r5.toJSONString()     // Catch:{ JSONException | NullPointerException -> 0x0043 }
            id.dana.danah5.sendevent.SendEventBridge$getMax r5 = new id.dana.danah5.sendevent.SendEventBridge$getMax     // Catch:{ JSONException | NullPointerException -> 0x0043 }
            r5.<init>()     // Catch:{ JSONException | NullPointerException -> 0x0043 }
            com.alibaba.fastjson.TypeReference r5 = (com.alibaba.fastjson.TypeReference) r5     // Catch:{ JSONException | NullPointerException -> 0x0043 }
            com.alibaba.fastjson.parser.Feature[] r6 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch:{ JSONException | NullPointerException -> 0x0043 }
            java.lang.Object r2 = com.alibaba.fastjson.JSONObject.parseObject((java.lang.String) r4, r5, (com.alibaba.fastjson.parser.Feature[]) r6)     // Catch:{ JSONException | NullPointerException -> 0x0043 }
        L_0x0043:
            o.getStatus r2 = (o.getStatus) r2
        L_0x0045:
            o.SwitchTabPoint.processEvent(r2)
            goto L_0x012c
        L_0x004a:
            java.lang.String r5 = "DanaContact"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x012c
            o.checkBoxPrompt r4 = o.checkBoxPrompt.INSTANCE
            java.lang.String r5 = "$this$activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r5)
            com.alibaba.ariver.app.api.PageContext r5 = r7.getPageContext()
            if (r5 == 0) goto L_0x0063
            android.app.Activity r2 = r5.getActivity()
        L_0x0063:
            if (r2 != 0) goto L_0x0066
            return
        L_0x0066:
            r4.processEvent(r2)
            return
        L_0x006a:
            java.lang.String r6 = "checkoutFinished"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x012c
            java.lang.String r4 = "$this$context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)
            com.alibaba.ariver.app.api.PageContext r4 = r7.getPageContext()
            if (r4 == 0) goto L_0x0088
            android.app.Activity r4 = r4.getActivity()
            if (r4 == 0) goto L_0x0088
            android.content.Context r4 = r4.getApplicationContext()
            goto L_0x0089
        L_0x0088:
            r4 = r2
        L_0x0089:
            if (r4 == 0) goto L_0x012c
            if (r5 == 0) goto L_0x00a3
            java.lang.String r6 = r5.toJSONString()     // Catch:{ JSONException | NullPointerException -> 0x009f }
            id.dana.danah5.sendevent.SendEventBridge$setMax r7 = new id.dana.danah5.sendevent.SendEventBridge$setMax     // Catch:{ JSONException | NullPointerException -> 0x009f }
            r7.<init>()     // Catch:{ JSONException | NullPointerException -> 0x009f }
            com.alibaba.fastjson.TypeReference r7 = (com.alibaba.fastjson.TypeReference) r7     // Catch:{ JSONException | NullPointerException -> 0x009f }
            com.alibaba.fastjson.parser.Feature[] r0 = new com.alibaba.fastjson.parser.Feature[r1]     // Catch:{ JSONException | NullPointerException -> 0x009f }
            java.lang.Object r6 = com.alibaba.fastjson.JSONObject.parseObject((java.lang.String) r6, r7, (com.alibaba.fastjson.parser.Feature[]) r0)     // Catch:{ JSONException | NullPointerException -> 0x009f }
            goto L_0x00a0
        L_0x009f:
            r6 = r2
        L_0x00a0:
            com.alibaba.fastjson.JSONObject r6 = (com.alibaba.fastjson.JSONObject) r6
            goto L_0x00a4
        L_0x00a3:
            r6 = r2
        L_0x00a4:
            o.UpdateAppCallback r7 = r3.splitFacade
            if (r7 != 0) goto L_0x00ad
            java.lang.String r0 = "splitFacade"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
        L_0x00ad:
            o.GriverOptionMenuEvent r0 = r3.saveLastTransaction
            if (r0 != 0) goto L_0x00b6
            java.lang.String r1 = "saveLastTransaction"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00b6:
            o.getIndexByPage.processEvent(r4, r6, r7, r0)
            o.cornerRadius r4 = new o.cornerRadius
            o.DefaultEmbedViewManager r6 = r3.remoteGnPaymentEntityData
            if (r6 != 0) goto L_0x00c4
            java.lang.String r7 = "remoteGnPaymentEntityData"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)
        L_0x00c4:
            r4.<init>(r6)
            if (r5 == 0) goto L_0x00ce
            java.lang.String r5 = r5.toJSONString()
            goto L_0x00cf
        L_0x00ce:
            r5 = r2
        L_0x00cf:
            if (r5 != 0) goto L_0x00d3
        L_0x00d1:
            r5 = r2
            goto L_0x00e7
        L_0x00d3:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x00d1 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x00d1 }
            com.google.gson.Gson r5 = new com.google.gson.Gson     // Catch:{ Exception -> 0x00d1 }
            r5.<init>()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00d1 }
            java.lang.Class<id.dana.data.h5event.sendmoney.CheckoutFinishEntity> r7 = id.dana.data.h5event.sendmoney.CheckoutFinishEntity.class
            java.lang.Object r5 = r5.fromJson((java.lang.String) r6, r7)     // Catch:{ Exception -> 0x00d1 }
        L_0x00e7:
            id.dana.data.h5event.sendmoney.CheckoutFinishEntity r5 = (id.dana.data.h5event.sendmoney.CheckoutFinishEntity) r5
            if (r5 == 0) goto L_0x00fb
            boolean r6 = r4.isGnScenario(r5)
            if (r6 == 0) goto L_0x00fb
            boolean r6 = r4.isAcCashierGnScenario(r5)
            if (r6 != 0) goto L_0x00fb
            r4.sendCallbackResult(r5)
            return
        L_0x00fb:
            if (r5 == 0) goto L_0x0107
            boolean r6 = r4.isAcCashierGnScenario(r5)
            if (r6 == 0) goto L_0x0107
            r4.sendCallbackResultWithoutCallback(r5)
            return
        L_0x0107:
            com.alipay.iap.android.wallet.acl.payment.PaymentResult r6 = new com.alipay.iap.android.wallet.acl.payment.PaymentResult
            r6.<init>()
            if (r5 == 0) goto L_0x0112
            java.lang.String r2 = r5.getProcessingStatus()
        L_0x0112:
            r6.setResultMessage(r2)
            java.lang.String r5 = r6.getResultMessage()
            java.lang.String r4 = r4.getPayStatus$app_productionRelease(r5)
            r6.setResultCode(r4)
            o.onInput r4 = o.onInput.getDefault()
            o.ColorSchemeModelTemplate$1$getMax r5 = new o.ColorSchemeModelTemplate$1$getMax
            r5.<init>(r6)
            r4.post(r5)
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.sendevent.SendEventBridge.sendEvent(java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, com.alibaba.ariver.app.api.Page):void");
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        if (setmin.getMin == -1 && setmin.getMax == 101) {
            checkBoxPrompt checkboxprompt = checkBoxPrompt.INSTANCE;
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            checkboxprompt.onReceiveActivityResult(bridgeCallback2, setmin);
        }
    }
}
