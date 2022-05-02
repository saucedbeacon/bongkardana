package id.dana.lib.gcontainer.app.bridge.requestpermissions;

import android.app.Activity;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsCategories;
import id.dana.util.permission.ManifestPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.FontRes;
import o.getLeftSelectedOption;
import o.pushWindow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J \u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J$\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000fH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u001bH\u0016J \u0010\u001c\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J2\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\u001e\u001a\u00020\u001f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010 \u001a\u00020\u00162\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010!\u001a\u00020\rH\u0002J\u001e\u0010\"\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0019\u001a\u00020\tH\u0002J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/requestpermissions/RequestPermissionsBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "invalidCategories", "", "", "permissionsMapper", "Lid/dana/lib/gcontainer/app/bridge/requestpermissions/RequestPermissionsMapper;", "checkPermissions", "", "eligiblePermissions", "", "executePlugin", "event", "permissionCategories", "explodeRequestedPermissions", "permissions", "getErrorResult", "Lcom/alibaba/fastjson/JSONObject;", "errorType", "nonePermissionsAreValid", "errorStatus", "onReceivePermissionResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$PermissionResultMessageEvent;", "permissionProcessor", "requestPermissions", "page", "Lcom/alibaba/ariver/app/api/Page;", "info", "sendGeneralError", "unGrantedResponseProcessor", "ungrantedPermissions", "validAndroidRequestPermission", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class RequestPermissionsBridge extends BaseBridge {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    public static final int REQUEST_CODE_PERMISSION = 203;
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private List<String> invalidCategories;
    private DatePickerBridgeExtension.AnonymousClass5 permissionsMapper;

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void requestPermissions(@NotNull @BindingNode(Page.class) Page page, @Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            try {
                JSONArray jSONArray = jSONObject.getJSONArray(RequestPermission.PERMISSIONS);
                Intrinsics.checkNotNullExpressionValue(jSONArray, "info.getJSONArray(\"permissions\")");
                List arrayList = new ArrayList();
                int i = 0;
                int size = jSONArray.size();
                while (i < size) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        arrayList.add((String) obj);
                        i++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                }
                if (arrayList.isEmpty()) {
                    sendGeneralError();
                } else {
                    executePlugin(str, arrayList);
                }
            } catch (JSONException unused) {
                sendGeneralError();
            }
        }
    }

    private final void executePlugin(String str, List<String> list) {
        this.invalidCategories = new ArrayList();
        this.permissionsMapper = new Object() {
            public final List<Map<String, List<String>>> length = CollectionsKt.listOf(MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.CALENDAR, CollectionsKt.listOf(ManifestPermission.WRITE_CALENDAR))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.CAMERA, CollectionsKt.listOf("android.permission.CAMERA"))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.CONTACT, CollectionsKt.listOf("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"))), MapsKt.mapOf(TuplesKt.to("LOCATION", CollectionsKt.listOf("android.permission.ACCESS_FINE_LOCATION"))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.PHONE, CollectionsKt.listOf("android.permission.CALL_PHONE"))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.PHONE_STATE, CollectionsKt.listOf("android.permission.READ_PHONE_STATE"))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.STORAGE, CollectionsKt.listOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.NOTIFICATION, CollectionsKt.listOf(""))), MapsKt.mapOf(TuplesKt.to(RequestPermissionsCategories.MICROPHONE, CollectionsKt.listOf(ManifestPermission.RECORD_AUDIO))));

            public static List<String> getMax() {
                return CollectionsKt.listOf(ManifestPermission.RECORD_AUDIO);
            }

            public static List<String> setMin() {
                return CollectionsKt.listOf(ManifestPermission.WRITE_CALENDAR);
            }

            public static List<String> length() {
                return CollectionsKt.listOf("android.permission.CAMERA");
            }

            public static List<String> getMin() {
                return CollectionsKt.listOf("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
            }

            public static List<String> setMax() {
                return CollectionsKt.listOf("android.permission.ACCESS_FINE_LOCATION");
            }

            public static List<String> isInside() {
                return CollectionsKt.listOf("android.permission.CALL_PHONE");
            }

            public static List<String> toIntRange() {
                return CollectionsKt.listOf("android.permission.READ_PHONE_STATE");
            }

            public static List<String> equals() {
                return CollectionsKt.listOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE");
            }

            /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[EDGE_INSN: B:31:0x0060->B:23:0x0060 ?: BREAK  , SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static java.util.List<java.lang.String> length(java.lang.String r6, java.util.List<java.lang.String> r7, java.util.List<java.lang.String> r8) {
                /*
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x000d:
                    boolean r1 = r7.hasNext()
                    if (r1 == 0) goto L_0x0066
                    java.lang.Object r1 = r7.next()
                    java.lang.String r1 = (java.lang.String) r1
                    r2 = r0
                    java.util.Collection r2 = (java.util.Collection) r2
                    boolean r2 = r2.isEmpty()
                    r3 = 1
                    r2 = r2 ^ r3
                    if (r2 != 0) goto L_0x000d
                    r2 = r8
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    boolean r4 = r2 instanceof java.util.Collection
                    r5 = 0
                    if (r4 == 0) goto L_0x0035
                    r4 = r2
                    java.util.Collection r4 = (java.util.Collection) r4
                    boolean r4 = r4.isEmpty()
                    if (r4 != 0) goto L_0x005f
                L_0x0035:
                    java.util.Iterator r2 = r2.iterator()
                L_0x0039:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x005f
                    java.lang.Object r4 = r2.next()
                    java.lang.String r4 = (java.lang.String) r4
                    boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
                    if (r4 == 0) goto L_0x005b
                    r4 = r1
                    java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                    int r4 = r4.length()
                    if (r4 <= 0) goto L_0x0056
                    r4 = 1
                    goto L_0x0057
                L_0x0056:
                    r4 = 0
                L_0x0057:
                    if (r4 == 0) goto L_0x005b
                    r4 = 1
                    goto L_0x005c
                L_0x005b:
                    r4 = 0
                L_0x005c:
                    if (r4 == 0) goto L_0x0039
                    goto L_0x0060
                L_0x005f:
                    r3 = 0
                L_0x0060:
                    if (r3 == 0) goto L_0x000d
                    r0.add(r6)
                    goto L_0x000d
                L_0x0066:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: o.DatePickerBridgeExtension.AnonymousClass5.length(java.lang.String, java.util.List, java.util.List):java.util.List");
            }

            public final boolean setMax(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "key");
                for (Map keySet : this.length) {
                    Iterator it = keySet.keySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (Intrinsics.areEqual((Object) str, (Object) (String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        };
        List<String> explodeRequestedPermissions = explodeRequestedPermissions(validAndroidRequestPermission(list));
        if (explodeRequestedPermissions.isEmpty()) {
            sendGeneralError();
        } else {
            permissionProcessor(str, explodeRequestedPermissions);
        }
    }

    private final void sendGeneralError() {
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(getErrorResult$default(this, "001", (List) null, 2, (Object) null));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> explodeRequestedPermissions(java.util.List<java.lang.String> r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            o.DatePickerBridgeExtension$5 r2 = r3.permissionsMapper
            if (r2 != 0) goto L_0x0022
            java.lang.String r2 = "permissionsMapper"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0022:
            if (r1 != 0) goto L_0x0026
            goto L_0x0097
        L_0x0026:
            int r2 = r1.hashCode()
            switch(r2) {
                case -1933786560: goto L_0x008a;
                case -1611296843: goto L_0x007d;
                case -1166291365: goto L_0x0070;
                case 76105038: goto L_0x0063;
                case 604302142: goto L_0x0056;
                case 1669509120: goto L_0x0049;
                case 1856013610: goto L_0x003c;
                case 1980544805: goto L_0x002f;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0097
        L_0x002f:
            java.lang.String r2 = "CAMERA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.length()
            goto L_0x009b
        L_0x003c:
            java.lang.String r2 = "MICROPHONE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.getMax()
            goto L_0x009b
        L_0x0049:
            java.lang.String r2 = "CONTACT"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.getMin()
            goto L_0x009b
        L_0x0056:
            java.lang.String r2 = "CALENDAR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.setMin()
            goto L_0x009b
        L_0x0063:
            java.lang.String r2 = "PHONE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.isInside()
            goto L_0x009b
        L_0x0070:
            java.lang.String r2 = "STORAGE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.equals()
            goto L_0x009b
        L_0x007d:
            java.lang.String r2 = "LOCATION"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.setMax()
            goto L_0x009b
        L_0x008a:
            java.lang.String r2 = "PHONE_STATE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0097
            java.util.List r1 = o.DatePickerBridgeExtension.AnonymousClass5.toIntRange()
            goto L_0x009b
        L_0x0097:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x009b:
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            goto L_0x000d
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsBridge.explodeRequestedPermissions(java.util.List):java.util.List");
    }

    private final List<String> validAndroidRequestPermission(List<String> list) {
        List<String> arrayList = new ArrayList<>();
        for (String str : list) {
            DatePickerBridgeExtension.AnonymousClass5 r2 = this.permissionsMapper;
            if (r2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("permissionsMapper");
            }
            if (r2.setMax(str)) {
                arrayList.add(str);
            } else {
                List<String> list2 = this.invalidCategories;
                if (list2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("invalidCategories");
                }
                list2.add(str);
            }
        }
        return arrayList;
    }

    private final void permissionProcessor(String str, List<String> list) {
        if (Intrinsics.areEqual((Object) str, (Object) RequestPermissionsEvent.REQUEST)) {
            if (list.isEmpty()) {
                nonePermissionsAreValid("002");
                return;
            }
            Activity activity2 = this.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                FontRes.getMin(activity2, (String[]) array, 203);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (list.isEmpty()) {
            nonePermissionsAreValid("003");
        } else {
            checkPermissions(list);
        }
    }

    private final void nonePermissionsAreValid(String str) {
        List<String> list = this.invalidCategories;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invalidCategories");
        }
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(getErrorResult(str, list));
    }

    private final void checkPermissions(List<String> list) {
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            String str = (String) next;
            Activity activity2 = this.activity;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
            }
            if (!getLeftSelectedOption.getMax(activity2, str)) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        List<String> list3 = this.invalidCategories;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invalidCategories");
        }
        if (!list3.isEmpty() || !list2.isEmpty()) {
            unGrantedResponseProcessor(list2, list.size() == list2.size() ? "003" : "005");
            return;
        }
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", Boolean.TRUE);
        Unit unit = Unit.INSTANCE;
        bridgeCallback2.sendJSONResponse(jSONObject);
    }

    private final void unGrantedResponseProcessor(List<String> list, String str) {
        DatePickerBridgeExtension.AnonymousClass5 r0 = this.permissionsMapper;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionsMapper");
        }
        Intrinsics.checkNotNullParameter(list, "ungrantedPermissions");
        List arrayList = new ArrayList();
        for (Map entrySet : r0.length) {
            for (Map.Entry entry : entrySet.entrySet()) {
                arrayList.addAll(DatePickerBridgeExtension.AnonymousClass5.length((String) entry.getKey(), (List) entry.getValue(), list));
            }
        }
        List<String> list2 = this.invalidCategories;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("invalidCategories");
        }
        arrayList.addAll(list2);
        BridgeCallback bridgeCallback2 = this.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        bridgeCallback2.sendJSONResponse(getErrorResult(str, arrayList));
    }

    static /* synthetic */ JSONObject getErrorResult$default(RequestPermissionsBridge requestPermissionsBridge, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        return requestPermissionsBridge.getErrorResult(str, list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/requestpermissions/RequestPermissionsBridge$Companion;", "", "()V", "REQUEST_CODE_PERMISSION", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    private final JSONObject getErrorResult(String str, List<String> list) {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("data", list);
        if (str == null) {
            str = "001";
        }
        map.put("error", str);
        return jSONObject;
    }

    public final void onReceivePermissionResult(@NotNull BaseBridge.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "event");
        if (getmin.getMin == 203) {
            Collection arrayList = new ArrayList();
            for (Object next : getmin.length) {
                if (!((pushWindow) next).setMax()) {
                    arrayList.add(next);
                }
            }
            Iterable<pushWindow> iterable = (List) arrayList;
            Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (pushWindow pushwindow : iterable) {
                arrayList2.add(pushwindow.length);
            }
            List list = (List) arrayList2;
            List<String> list2 = this.invalidCategories;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("invalidCategories");
            }
            if (!list2.isEmpty() || !list.isEmpty()) {
                unGrantedResponseProcessor(list, getmin.length.size() == list.size() ? "002" : "004");
                return;
            }
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", Boolean.TRUE);
            Unit unit = Unit.INSTANCE;
            bridgeCallback2.sendJSONResponse(jSONObject);
        }
    }
}
