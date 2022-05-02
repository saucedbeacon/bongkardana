package o;

import android.app.Activity;
import android.content.Intent;
import android.provider.ContactsContract;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.fastjson.JSONObject;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lid/dana/danah5/sendevent/ContactEventManager;", "", "()V", "REQUEST_CODE_CONTACTS_PICKER", "", "createFailResult", "Lcom/alibaba/fastjson/JSONObject;", "createSuccessResult", "data", "Landroid/content/Intent;", "onReceiveActivityResult", "", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "processEvent", "activity", "Landroid/app/Activity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class checkBoxPrompt {
    @NotNull
    public static final checkBoxPrompt INSTANCE = new checkBoxPrompt();
    public static final int REQUEST_CODE_CONTACTS_PICKER = 101;

    /* renamed from: o.checkBoxPrompt$default  reason: invalid class name */
    final class Cdefault implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
        private final onShow getMax;
        private final InputStream getMin;
        private final String length;

        public Cdefault(onShow onshow, InputStream inputStream, String str) {
            this.getMax = onshow;
            this.getMin = inputStream;
            this.length = str;
        }

        public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r4) {
            this.getMax.lambda$decodeResponse$1(this.getMin, this.length, r4);
        }
    }

    private checkBoxPrompt() {
    }

    public final void processEvent(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Intent intent = new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
        Intrinsics.checkNotNullParameter(activity, "$this$startActivityForResultSafely");
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        if (DatePickerBridgeExtension.AnonymousClass8.length(intent, activity)) {
            activity.startActivityForResult(intent, 101);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        kotlin.io.CloseableKt.closeFinally(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.alibaba.fastjson.JSONObject createSuccessResult(android.content.Intent r10) {
        /*
            r9 = this;
            com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.String r3 = "success"
            r1.put(r3, r2)
            o.PlaybackStateCompat r2 = new o.PlaybackStateCompat
            r2.<init>()
            if (r10 == 0) goto L_0x0066
            android.net.Uri r4 = r10.getData()
            if (r4 == 0) goto L_0x0066
            android.content.Context r10 = o.WindowBridgeExtension.AnonymousClass1.getMax()
            android.content.ContentResolver r3 = r10.getContentResolver()
            java.lang.String r10 = "data1"
            java.lang.String r5 = "display_name"
            java.lang.String[] r5 = new java.lang.String[]{r10, r5}
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)
            if (r10 == 0) goto L_0x0066
            r3 = r10
            java.io.Closeable r3 = (java.io.Closeable) r3
            boolean r4 = r10.moveToNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0058
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "mobile"
            r6 = 0
            java.lang.String r6 = r10.getString(r6)     // Catch:{ all -> 0x005f }
            r4.put(r5, r6)     // Catch:{ all -> 0x005f }
            r4 = r2
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ all -> 0x005f }
            java.lang.String r5 = "name"
            r6 = 1
            java.lang.String r10 = r10.getString(r6)     // Catch:{ all -> 0x005f }
            r4.put(r5, r10)     // Catch:{ all -> 0x005f }
        L_0x0058:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x005f }
            r10 = 0
            kotlin.io.CloseableKt.closeFinally(r3, r10)
            goto L_0x0066
        L_0x005f:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            kotlin.io.CloseableKt.closeFinally(r3, r10)
            throw r0
        L_0x0066:
            java.lang.String r10 = "info"
            r1.put(r10, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.checkBoxPrompt.createSuccessResult(android.content.Intent):com.alibaba.fastjson.JSONObject");
    }

    private final JSONObject createFailResult() {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("error", "Failed to retrieve contact");
        return jSONObject;
    }

    public final void onReceiveActivityResult(@NotNull BridgeCallback bridgeCallback, @NotNull BaseBridge.setMin setmin) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(bridgeCallback, "bridgeCallback");
        Intrinsics.checkNotNullParameter(setmin, "event");
        try {
            if (setmin.length == null || setmin.getMax != 101) {
                jSONObject = createFailResult();
            } else {
                jSONObject = createSuccessResult(setmin.length);
            }
        } catch (Exception unused) {
            jSONObject = createFailResult();
        }
        jSONObject.toJSONString();
        bridgeCallback.sendJSONResponse(jSONObject);
    }
}
