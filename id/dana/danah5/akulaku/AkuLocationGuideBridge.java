package id.dana.danah5.akulaku;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.H5Event;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import id.dana.dialog.DialogPermission;
import id.dana.utils.permission.ManifestPermission;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.FontRes;
import o.IntRange;
import o.handlePushWindow;
import o.setAcParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J(\u0010\u0017\u001a\u00020\u00102\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0002J(\u0010!\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0013H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/danah5/akulaku/AkuLocationGuideBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "Lid/dana/danah5/akulaku/AkuEventSyncResult;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "dialogPermission", "Lid/dana/dialog/DialogPermission;", "errorCode", "", "status", "assembleLocationStatus", "Lcom/alibaba/fastjson/JSONObject;", "checkLBSLocation", "", "handerLBSLocationStatus", "failTitle", "", "failMessage", "isLBSLocationSuccess", "", "locationPermissionGuide", "info", "page", "Lcom/alibaba/ariver/app/api/Page;", "openLocationDialog", "requestPermission", "sendBridgeResult", "sendFailEvent", "title", "message", "sendGuideEvent", "action", "syncAkuEventResult", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AkuLocationGuideBridge extends SimpleBridgeExtension {
    @NotNull
    public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
    private static final int RESULT_ERRORCODE_TIMEOUT = 1100;
    private Activity activity;
    private BridgeCallback bridgeCallback;
    /* access modifiers changed from: private */
    public DialogPermission dialogPermission;
    private int errorCode = 1100;
    private int status = 1;

    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter(canOverride = false)
    public final void locationPermissionGuide(@Nullable @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2, @NotNull @BindingNode(Page.class) Page page) {
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        String str = null;
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            String string = jSONObject != null ? jSONObject.getString(LocationGuideParamsKey.KEY_FAIL_TITLE) : null;
            String str2 = "";
            if (string == null) {
                string = str2;
            }
            String string2 = jSONObject != null ? jSONObject.getString(LocationGuideParamsKey.KEY_FAIL_MESSAGE) : null;
            if (string2 == null) {
                string2 = str2;
            }
            String string3 = jSONObject != null ? jSONObject.getString(LocationGuideParamsKey.KEY_GUIDE_TITLE) : null;
            if (string3 == null) {
                string3 = str2;
            }
            String string4 = jSONObject != null ? jSONObject.getString(LocationGuideParamsKey.KEY_GUIDE_MESSAGE) : null;
            if (string4 == null) {
                string4 = str2;
            }
            if (jSONObject != null) {
                str = jSONObject.getString("action");
            }
            if (str != null) {
                str2 = str;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                Activity activity3 = this.activity;
                if (activity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                if (IntRange.length((Context) activity3, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    checkLBSLocation();
                    Activity activity4 = this.activity;
                    if (activity4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                    }
                    handerLBSLocationStatus(activity4, string, string2);
                    return;
                }
                openLocationDialog(page);
                Activity activity5 = this.activity;
                if (activity5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                sendGuideEvent(activity5, string3, string4, str2);
                return;
            }
            checkLBSLocation();
            Activity activity6 = this.activity;
            if (activity6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            handerLBSLocationStatus(activity6, string, string2);
        }
    }

    private final void checkLBSLocation() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        LBSLocation latestLocation = handlePushWindow.getLatestLocation(activity2);
        Intrinsics.checkNotNullExpressionValue(latestLocation, "lbsLocation");
        this.errorCode = latestLocation.getErrorCode();
        this.status = isLBSLocationSuccess() ^ true ? 1 : 0;
    }

    private final boolean isLBSLocationSuccess() {
        return this.errorCode == LBSLocationErrorCode.LocationErrorSuccess.getErrorCode() || this.errorCode == LBSLocationErrorCode.LocationErrorExpired.getErrorCode();
    }

    private final void handerLBSLocationStatus(Activity activity2, String str, String str2) {
        if (this.status == 0 || !(!StringsKt.isBlank(str)) || !(!StringsKt.isBlank(str2))) {
            sendBridgeResult();
        } else {
            sendFailEvent(activity2, str, str2);
        }
    }

    private final void sendBridgeResult() {
        try {
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            bridgeCallback2.sendJSONResponse(assembleLocationStatus(this.status, this.errorCode));
        } catch (JSONException unused) {
            BridgeCallback bridgeCallback3 = this.bridgeCallback;
            if (bridgeCallback3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.FALSE);
            map.put("message", AkuDeviceInfoBridge.UNKNOWN_ERROR);
            map.put("error", H5Event.Error.UNKNOWN_ERROR);
            Unit unit = Unit.INSTANCE;
            bridgeCallback3.sendJSONResponse(jSONObject);
        }
    }

    private final void sendFailEvent(Activity activity2, String str, String str2) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("title", str);
        linkedHashMap.put("message", str2);
        linkedHashMap.put(AkuEventParamsKey.KEY_ACTIVITY, activity2);
        linkedHashMap.put(AkuEventParamsKey.KEY_AKUEVENT_SYNC_RESULT, this);
    }

    private final JSONObject assembleLocationStatus(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) Integer.valueOf(i));
        jSONObject.put("errorCode", (Object) Integer.valueOf(i2));
        return jSONObject;
    }

    private final void sendGuideEvent(Activity activity2, String str, String str2, String str3) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("title", str);
        linkedHashMap.put("message", str2);
        linkedHashMap.put("action", str3);
        linkedHashMap.put(AkuEventParamsKey.KEY_ACTIVITY, activity2);
        linkedHashMap.put(AkuEventParamsKey.KEY_AKUEVENT_SYNC_RESULT, this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements Runnable {
        final /* synthetic */ Page $page;
        final /* synthetic */ AkuLocationGuideBridge this$0;

        setMin(AkuLocationGuideBridge akuLocationGuideBridge, Page page) {
            this.this$0 = akuLocationGuideBridge;
            this.$page = page;
        }

        public final void run() {
            AkuLocationGuideBridge akuLocationGuideBridge = this.this$0;
            Page page = this.$page;
            Intrinsics.checkNotNullParameter(page, "$this$activity");
            PageContext pageContext = page.getPageContext();
            akuLocationGuideBridge.dialogPermission = setAcParams.getMax(pageContext != null ? pageContext.getActivity() : null, "location", new DialogPermission.length(this) {
                final /* synthetic */ setMin this$0;

                public final void onDialogDismissed() {
                }

                {
                    this.this$0 = r1;
                }

                public final void onPositiveButtonClicked() {
                    this.this$0.this$0.requestPermission(this.this$0.$page);
                    DialogPermission access$getDialogPermission$p = this.this$0.this$0.dialogPermission;
                    if (access$getDialogPermission$p != null) {
                        access$getDialogPermission$p.setMax();
                    }
                }

                public final void onNegativeButtonClicked() {
                    DialogPermission access$getDialogPermission$p = this.this$0.this$0.dialogPermission;
                    if (access$getDialogPermission$p != null) {
                        access$getDialogPermission$p.setMax();
                    }
                }
            });
            DialogPermission access$getDialogPermission$p = this.this$0.dialogPermission;
            if (access$getDialogPermission$p != null) {
                access$getDialogPermission$p.setMin();
            }
        }
    }

    private final void openLocationDialog(Page page) {
        new Handler(Looper.getMainLooper()).post(new setMin(this, page));
    }

    /* access modifiers changed from: private */
    public final void requestPermission(Page page) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        arrayList.add(ManifestPermission.ACCESS_COARSE_LOCATION);
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        Intrinsics.checkNotNull(activity2);
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            FontRes.getMin(activity2, (String[]) array, 1);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void syncAkuEventResult(int i) {
        this.status = i;
        if (i == 0) {
            checkLBSLocation();
        }
        sendBridgeResult();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/danah5/akulaku/AkuLocationGuideBridge$Companion;", "", "()V", "RESULT_ERRORCODE_TIMEOUT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
