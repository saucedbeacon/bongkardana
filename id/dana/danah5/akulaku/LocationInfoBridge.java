package id.dana.danah5.akulaku;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5Event;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import id.dana.utils.permission.ManifestPermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FontRes;
import o.WindowBridgeExtension;
import o.handlePushWindow;
import o.setCornerRadius$core;
import o.setStateOn;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0002J\u001c\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/danah5/akulaku/LocationInfoBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "lbsErrorToLocationError", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "assembleGpsInfo", "Lid/dana/danah5/akulaku/model/DeviceInfo$Gps;", "context", "Landroid/content/Context;", "getGpsErrorCode", "lbsLocation", "Lcom/alipay/iap/android/lbs/LBSLocation;", "getLocationInfo", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "page", "Lcom/alibaba/ariver/app/api/Page;", "isPermissionGranted", "", "requestPermission", "sendCallbackError", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LocationInfoBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    @NotNull
    public static final String GPS_PERMISSION_ERROR = "user doesn't have GPS permission";
    private final HashMap<Integer, Integer> lbsErrorToLocationError;

    public LocationInfoBridge() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Map map = hashMap;
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorSuccess.getErrorCode()), 0);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorExpired.getErrorCode()), 0);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorNoAuthorization.getErrorCode()), 11);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorPositionDisabled.getErrorCode()), 11);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorParamInvalid.getErrorCode()), 13);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorSystem.getErrorCode()), 13);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorCancelled.getErrorCode()), 13);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorNullLocation.getErrorCode()), 12);
        map.put(Integer.valueOf(LBSLocationErrorCode.LocationErrorTimeout.getErrorCode()), 14);
        Unit unit = Unit.INSTANCE;
        this.lbsErrorToLocationError = hashMap;
    }

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void getLocationInfo(@NotNull @BindingCallback BridgeCallback bridgeCallback, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        try {
            if (!isPermissionGranted(WindowBridgeExtension.AnonymousClass1.getMax())) {
                requestPermission(page);
                sendCallbackError(bridgeCallback);
                return;
            }
            Object json = JSON.toJSON(assembleGpsInfo(WindowBridgeExtension.AnonymousClass1.getMax()));
            if (json != null) {
                bridgeCallback.sendJSONResponse((JSONObject) json);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
        } catch (Exception unused) {
            sendCallbackError(bridgeCallback);
        }
    }

    private final setCornerRadius$core.toFloatRange assembleGpsInfo(Context context) {
        setCornerRadius$core.toFloatRange tofloatrange = new setCornerRadius$core.toFloatRange();
        try {
            LBSLocation latestLocation = handlePushWindow.getLatestLocation(context);
            Intrinsics.checkNotNullExpressionValue(latestLocation, "lbsLocation");
            tofloatrange.latitude = String.valueOf(latestLocation.getLatitude());
            tofloatrange.longitude = String.valueOf(latestLocation.getLongitude());
            tofloatrange.time = latestLocation.getTime();
            tofloatrange.error = getGpsErrorCode(latestLocation);
        } catch (Exception unused) {
        }
        return tofloatrange;
    }

    private final int getGpsErrorCode(LBSLocation lBSLocation) {
        Integer num = this.lbsErrorToLocationError.get(Integer.valueOf(lBSLocation.getErrorCode()));
        if (num == null) {
            num = 13;
        }
        Intrinsics.checkNotNullExpressionValue(num, "lbsErrorToLocationError[…tionError.LOCATION_FAILED");
        return num.intValue();
    }

    private final boolean isPermissionGranted(Context context) {
        return setStateOn.getMin(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    private final void requestPermission(Page page) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add(ManifestPermission.ACCESS_COARSE_LOCATION);
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        Intrinsics.checkNotNull(activity);
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            FontRes.getMin(activity, (String[]) array, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/akulaku/LocationInfoBridge$Companion;", "", "()V", "GPS_PERMISSION_ERROR", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void sendCallbackError(BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("message", GPS_PERMISSION_ERROR);
        map.put("error", H5Event.Error.UNKNOWN_ERROR);
        Unit unit = Unit.INSTANCE;
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
