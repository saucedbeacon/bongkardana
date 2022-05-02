package id.dana.lib.gcontainer.app.bridge.deviceinfo;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import id.dana.lib.gcontainer.app.bridge.deviceinfo.DeviceInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.WindowBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInformationBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "getDeviceInfo", "", "location", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "getSuccessResult", "Lcom/alibaba/fastjson/JSONObject;", "successResult", "handleAllInformation", "deviceManager", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInformationManager;", "handleLocationInformation", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class DeviceInformationBridge extends SimpleBridgeExtension {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    /* access modifiers changed from: private */
    @Nullable
    public static ILocationListener locationListener;

    @ThreadType(ExecutorType.IO)
    @ActionFilter(canOverride = false)
    public final void getDeviceInfo(@Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        DatePickerBridgeExtension datePickerBridgeExtension = new DatePickerBridgeExtension(WindowBridgeExtension.AnonymousClass1.getMax(), locationListener);
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 96673) {
                if (hashCode == 1901043637 && str.equals("location")) {
                    handleLocationInformation(datePickerBridgeExtension, bridgeCallback);
                }
            } else if (str.equals("all")) {
                handleAllInformation(datePickerBridgeExtension, bridgeCallback);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/deviceinfo/DeviceInformationBridge$Companion;", "", "()V", "locationListener", "Lid/dana/lib/gcontainer/app/bridge/deviceinfo/ILocationListener;", "getLocationListener", "()Lid/dana/lib/gcontainer/app/bridge/deviceinfo/ILocationListener;", "setLocationListener", "(Lid/dana/lib/gcontainer/app/bridge/deviceinfo/ILocationListener;)V", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }

        public static void setMax(@Nullable ILocationListener iLocationListener) {
            DeviceInformationBridge.locationListener = iLocationListener;
        }
    }

    private final JSONObject getSuccessResult(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Map map = jSONObject2;
        map.put("success", Boolean.TRUE);
        map.put("data", jSONObject);
        return jSONObject2;
    }

    private final void handleAllInformation(DatePickerBridgeExtension datePickerBridgeExtension, BridgeCallback bridgeCallback) {
        DatePickerBridgeExtension datePickerBridgeExtension2 = datePickerBridgeExtension;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        try {
            DeviceInfo deviceInfo = new DeviceInfo((DeviceInfo.IPAddress) null, (DeviceInfo.SysFeature) null, (List) null, (DeviceInfo.Cpu) null, (DeviceInfo.Device) null, (DeviceInfo.Display) null, (DeviceInfo.ExternalStorage) null, (DeviceInfo.Gps) null, (DeviceInfo.Memory) null, (List) null, 1023, (DefaultConstructorMarker) null);
            datePickerBridgeExtension2.length(datePickerBridgeExtension2.getMin, deviceInfo);
            datePickerBridgeExtension2.getMin(datePickerBridgeExtension2.getMin, deviceInfo);
            DatePickerBridgeExtension.getMax(deviceInfo);
            DatePickerBridgeExtension.getMax(datePickerBridgeExtension2.getMin, deviceInfo);
            DatePickerBridgeExtension.length(deviceInfo);
            DatePickerBridgeExtension.setMax(datePickerBridgeExtension2.getMin, deviceInfo);
            DatePickerBridgeExtension.setMax(deviceInfo);
            DatePickerBridgeExtension.setMin(datePickerBridgeExtension2.getMin, deviceInfo);
            DatePickerBridgeExtension.toFloatRange(datePickerBridgeExtension2.getMin, deviceInfo);
            DatePickerBridgeExtension.getMin(deviceInfo);
            Object json = JSON.toJSON(deviceInfo);
            if (json != null) {
                try {
                    bridgeCallback2.sendJSONResponse(getSuccessResult((JSONObject) json));
                } catch (Exception unused) {
                    BridgeResponse bridgeResponse = BridgeResponse.UNKNOWN_ERROR;
                    JSONObject jSONObject = bridgeResponse.get();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "it.get()");
                    jSONObject.put("success", Boolean.FALSE);
                    Unit unit = Unit.INSTANCE;
                    bridgeCallback2.sendBridgeResponse(bridgeResponse);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        } catch (Exception unused2) {
            BridgeResponse bridgeResponse2 = BridgeResponse.UNKNOWN_ERROR;
            JSONObject jSONObject2 = bridgeResponse2.get();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.get()");
            jSONObject2.put("success", Boolean.FALSE);
            Unit unit2 = Unit.INSTANCE;
            bridgeCallback2.sendBridgeResponse(bridgeResponse2);
        }
    }

    private final void handleLocationInformation(DatePickerBridgeExtension datePickerBridgeExtension, BridgeCallback bridgeCallback) {
        DatePickerBridgeExtension datePickerBridgeExtension2 = datePickerBridgeExtension;
        BridgeCallback bridgeCallback2 = bridgeCallback;
        try {
            DeviceInfo deviceInfo = new DeviceInfo((DeviceInfo.IPAddress) null, (DeviceInfo.SysFeature) null, (List) null, (DeviceInfo.Cpu) null, (DeviceInfo.Device) null, (DeviceInfo.Display) null, (DeviceInfo.ExternalStorage) null, (DeviceInfo.Gps) null, (DeviceInfo.Memory) null, (List) null, 1023, (DefaultConstructorMarker) null);
            datePickerBridgeExtension2.length(datePickerBridgeExtension2.getMin, deviceInfo);
            Object json = JSON.toJSON(deviceInfo);
            if (json != null) {
                try {
                    bridgeCallback2.sendJSONResponse(getSuccessResult((JSONObject) json));
                } catch (Exception unused) {
                    BridgeResponse bridgeResponse = BridgeResponse.UNKNOWN_ERROR;
                    JSONObject jSONObject = bridgeResponse.get();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "it.get()");
                    jSONObject.put("success", Boolean.FALSE);
                    Unit unit = Unit.INSTANCE;
                    bridgeCallback2.sendBridgeResponse(bridgeResponse);
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
            }
        } catch (Exception unused2) {
            BridgeResponse bridgeResponse2 = BridgeResponse.UNKNOWN_ERROR;
            JSONObject jSONObject2 = bridgeResponse2.get();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "it.get()");
            jSONObject2.put("success", Boolean.FALSE);
            Unit unit2 = Unit.INSTANCE;
            bridgeCallback2.sendBridgeResponse(bridgeResponse2);
        }
    }
}
