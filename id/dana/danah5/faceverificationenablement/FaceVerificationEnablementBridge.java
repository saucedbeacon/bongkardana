package id.dana.danah5.faceverificationenablement;

import android.app.Activity;
import android.app.Application;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.griver.base.common.env.GriverEnv;
import id.dana.DanaApplication;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.modules.GContainerModule;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.negativeButton;
import o.saveSnapshot;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "eventName", "", "faceVerificationEnablementManager", "Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager;", "getFaceVerificationEnablementManager", "()Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager;", "setFaceVerificationEnablementManager", "(Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementManager;)V", "faceVerificationEnablement", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "onInitialized", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class FaceVerificationEnablementBridge extends BaseBridge {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String EVENT_NAME_ENABLE_FACE_AUTH_SWITCH = "enableFaceAuthSwitch";
    @NotNull
    public static final String EVENT_NAME_ENROLL_FACE_AUTH = "enrollFaceAuth";
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private String eventName;
    @Inject
    public negativeButton.Cdefault faceVerificationEnablementManager;

    @NotNull
    public final negativeButton.Cdefault getFaceVerificationEnablementManager() {
        negativeButton.Cdefault defaultR = this.faceVerificationEnablementManager;
        if (defaultR == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceVerificationEnablementManager");
        }
        return defaultR;
    }

    public final void setFaceVerificationEnablementManager(@NotNull negativeButton.Cdefault defaultR) {
        Intrinsics.checkNotNullParameter(defaultR, "<set-?>");
        this.faceVerificationEnablementManager = defaultR;
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
                getmax.getMin().length(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void faceVerificationEnablement(@NotNull @BindingParam(name = {"event"}) String str, @NotNull @BindingCallback BridgeCallback bridgeCallback2, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(str, IpcMessageConstants.EXTRA_EVENT);
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            this.eventName = str;
            if (Intrinsics.areEqual((Object) str, (Object) EVENT_NAME_ENABLE_FACE_AUTH_SWITCH) || Intrinsics.areEqual((Object) str, (Object) EVENT_NAME_ENROLL_FACE_AUTH)) {
                negativeButton.Cdefault defaultR = this.faceVerificationEnablementManager;
                if (defaultR == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("faceVerificationEnablementManager");
                }
                Activity activity3 = this.activity;
                if (activity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                defaultR.switchFaceAuth(activity3, bridgeCallback2, str);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/danah5/faceverificationenablement/FaceVerificationEnablementBridge$Companion;", "", "()V", "EVENT_NAME_ENABLE_FACE_AUTH_SWITCH", "", "EVENT_NAME_ENROLL_FACE_AUTH", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceiveActivityResult(@org.jetbrains.annotations.NotNull id.dana.lib.gcontainer.app.bridge.core.BaseBridge.setMin r5) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.getMax
            r1 = 1002(0x3ea, float:1.404E-42)
            if (r0 != r1) goto L_0x006e
            int r0 = r5.getMin
            r1 = -1
            java.lang.String r2 = "bridgeCallback"
            if (r0 == r1) goto L_0x0062
            if (r0 == 0) goto L_0x0015
            goto L_0x006e
        L_0x0015:
            android.content.Intent r0 = r5.length
            if (r0 == 0) goto L_0x0026
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0026
            java.lang.String r1 = "cancel_reason"
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 != 0) goto L_0x002a
            goto L_0x004f
        L_0x002a:
            int r1 = r0.hashCode()
            r3 = -109866462(0xfffffffff9739222, float:-7.9043254E34)
            if (r1 == r3) goto L_0x0034
            goto L_0x004f
        L_0x0034:
            java.lang.String r1 = "pin_temporary_locked"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004f
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r4.bridgeCallback
            if (r0 != 0) goto L_0x0043
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0043:
            o.neutralButton r1 = o.neutralButton.INSTANCE
            r2 = 13
            com.alibaba.fastjson.JSONObject r1 = r1.getError(r2)
            r0.sendJSONResponse(r1)
            goto L_0x006e
        L_0x004f:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r4.bridgeCallback
            if (r0 != 0) goto L_0x0056
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0056:
            o.neutralButton r1 = o.neutralButton.INSTANCE
            r2 = 11
            com.alibaba.fastjson.JSONObject r1 = r1.getError(r2)
            r0.sendJSONResponse(r1)
            goto L_0x006e
        L_0x0062:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r4.bridgeCallback
            if (r0 != 0) goto L_0x0069
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0069:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r1 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.SUCCESS
            r0.sendBridgeResponse(r1)
        L_0x006e:
            super.onReceiveActivityResult(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.faceverificationenablement.FaceVerificationEnablementBridge.onReceiveActivityResult(id.dana.lib.gcontainer.app.bridge.core.BaseBridge$setMin):void");
    }
}
