package id.dana.lib.gcontainer.app.bridge.logging;

import android.content.Context;
import android.os.Build;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.aplog.api.LogContext;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.common.utils.NetworkUtils;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.LocationBridgeExtension;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/logging/H5GetLogInfoBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "assembleLogInfo", "Lcom/alibaba/fastjson/JSONObject;", "context", "Landroid/content/Context;", "getLogInfo", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class H5GetLogInfoBridge extends SimpleBridgeExtension {
    private static final String COMBINATION_DIVIDE = "^";
    private static final String COMBINATION_EQUALS = "=";
    @NotNull
    public static final length Companion = new length((byte) 0);
    @NotNull
    public static final String RESULT_BRAND = "brand";
    @NotNull
    public static final String RESULT_BUNDLE_VERSION = "bundleVersion";
    @NotNull
    public static final String RESULT_DEVICE_ID = "deviceId";
    @NotNull
    public static final String RESULT_MODEL = "model";
    @NotNull
    public static final String RESULT_NETWORK = "network";
    @NotNull
    public static final String RESULT_OS = "os";
    @NotNull
    public static final String RESULT_SESSION_ID = "sessionId";
    @NotNull
    public static final String RESULT_TIMEZONE = "TimeZone";
    @NotNull
    public static final String TAG = "H5GetMonitorInfo";

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void getLogInfo(@NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        JSONObject assembleLogInfo = assembleLogInfo(WindowBridgeExtension.AnonymousClass1.getMax());
        if (assembleLogInfo != null) {
            bridgeCallback.sendJSONResponse(assembleLogInfo);
            return;
        }
        BridgeResponse bridgeResponse = BridgeResponse.UNKNOWN_ERROR;
        JSONObject jSONObject = bridgeResponse.get();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "it.get()");
        jSONObject.put("success", Boolean.FALSE);
        Unit unit = Unit.INSTANCE;
        bridgeCallback.sendBridgeResponse(bridgeResponse);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/logging/H5GetLogInfoBridge$Companion;", "", "()V", "COMBINATION_DIVIDE", "", "COMBINATION_EQUALS", "RESULT_BRAND", "RESULT_BUNDLE_VERSION", "RESULT_DEVICE_ID", "RESULT_MODEL", "RESULT_NETWORK", "RESULT_OS", "RESULT_SESSION_ID", "RESULT_TIMEZONE", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    private final JSONObject assembleLogInfo(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            LogContext logContext = LoggerFactory.getLogContext();
            Intrinsics.checkNotNullExpressionValue(logContext, "LoggerFactory.getLogContext()");
            jSONObject.put("deviceId", logContext.getDeviceID());
            LogContext logContext2 = LoggerFactory.getLogContext();
            Intrinsics.checkNotNullExpressionValue(logContext2, "LoggerFactory.getLogContext()");
            jSONObject.put("sessionId", logContext2.getSessionID());
            jSONObject.put(RESULT_MODEL, Build.MODEL);
            jSONObject.put(RESULT_OS, Build.VERSION.RELEASE);
            jSONObject.put("network", NetworkUtils.getNetworkTypeString(context));
            StringBuilder sb = new StringBuilder("TimeZone=");
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkNotNullExpressionValue(timeZone, "TimeZone.getDefault()");
            sb.append(timeZone.getID());
            sb.append("^brand=");
            sb.append(Build.BRAND);
            Intrinsics.checkNotNullExpressionValue(sb, "StringBuilder()\n        …     .append(Build.BRAND)");
            jSONObject.put(RESULT_BUNDLE_VERSION, sb.toString());
            return jSONObject;
        } catch (Exception e) {
            LocationBridgeExtension.setMin(TAG, "assembleLogInfo", (Throwable) e);
            return null;
        }
    }
}
