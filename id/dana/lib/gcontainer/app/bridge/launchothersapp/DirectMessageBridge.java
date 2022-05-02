package id.dana.lib.gcontainer.app.bridge.launchothersapp;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.lib.gcontainer.app.bridge.launchothersapp.constant.IntendedApplications;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.WindowBridgeExtension;
import o.onDateSet;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0013"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/launchothersapp/DirectMessageBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "directMessage", "", "info", "Lcom/alibaba/fastjson/JSONObject;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getErrorResult", "errorType", "", "isWhatsAppInstalled", "", "context", "Landroid/content/Context;", "targetWhatsapp", "directMessageEntity", "Lid/dana/lib/gcontainer/app/bridge/launchothersapp/DirectMessageEntity;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class DirectMessageBridge extends BaseBridge {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends TypeReference<DirectMessageEntity> {
    }

    private final void targetWhatsapp(Context context, DirectMessageEntity directMessageEntity, BridgeCallback bridgeCallback) {
        if (isWhatsAppInstalled(context)) {
            onDateSet ondateset = onDateSet.setMin;
            String id2 = directMessageEntity.getId();
            String str = "";
            if (id2 == null) {
                id2 = str;
            }
            String text = directMessageEntity.getText();
            if (text != null) {
                str = text;
            }
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            Intrinsics.checkNotNullParameter(id2, "targetPhoneNumber");
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
            String max = onDateSet.setMax(id2);
            Intent intent = new Intent("android.intent.action.VIEW").setFlags(268435456).setPackage("com.whatsapp");
            String obj = Uri.parse("https://wa.me/").buildUpon().appendPath(onDateSet.length(max)).appendQueryParameter("text", str).build().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "Uri.parse(\"https://wa.me…)\n            .toString()");
            Intent data = intent.setData(Uri.parse(obj));
            Intrinsics.checkNotNullExpressionValue(data, "Intent(Intent.ACTION_VIE…         )\n            ))");
            Intrinsics.checkNotNullParameter(context, "$this$startActivitySafely");
            Intrinsics.checkNotNullParameter(data, IpcMessageConstants.EXTRA_INTENT);
            if (DatePickerBridgeExtension.AnonymousClass8.length(data, context)) {
                context.startActivity(data);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
            return;
        }
        bridgeCallback.sendJSONResponse(getErrorResult("003"));
    }

    private final boolean isWhatsAppInstalled(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.whatsapp", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void directMessage(@NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Object obj;
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        boolean z = false;
        String str = null;
        try {
            obj = JSONObject.parseObject(jSONObject.toJSONString(), new getMax(), new Feature[0]);
        } catch (JSONException | NullPointerException unused) {
            obj = null;
        }
        DirectMessageEntity directMessageEntity = (DirectMessageEntity) obj;
        CharSequence id2 = directMessageEntity != null ? directMessageEntity.getId() : null;
        if (id2 == null || id2.length() == 0) {
            z = true;
        }
        if (!z) {
            if (directMessageEntity != null) {
                str = directMessageEntity.getApplication();
            }
            if (!(!Intrinsics.areEqual((Object) str, (Object) IntendedApplications.WHATSAPP))) {
                targetWhatsapp(WindowBridgeExtension.AnonymousClass1.getMax(), directMessageEntity, bridgeCallback);
                return;
            }
        }
        bridgeCallback.sendJSONResponse(getErrorResult("002"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r6.equals(r2) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.alibaba.fastjson.JSONObject getErrorResult(java.lang.String r6) {
        /*
            r5 = this;
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r3 = "success"
            r1.put(r3, r2)
            java.lang.String r2 = "003"
            java.lang.String r3 = "002"
            if (r6 != 0) goto L_0x0016
            goto L_0x002d
        L_0x0016:
            int r4 = r6.hashCode()
            switch(r4) {
                case 47666: goto L_0x0025;
                case 47667: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x002d
        L_0x001e:
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L_0x002d
            goto L_0x002f
        L_0x0025:
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x002d
            r2 = r3
            goto L_0x002f
        L_0x002d:
            java.lang.String r2 = "001"
        L_0x002f:
            java.lang.String r6 = "error"
            r1.put(r6, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.launchothersapp.DirectMessageBridge.getErrorResult(java.lang.String):com.alibaba.fastjson.JSONObject");
    }
}
