package id.dana.lib.gcontainer.app.bridge.contact;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
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
import com.alibaba.fastjson.JSONObject;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import o.DatePickerBridgeExtension;
import o.LocationBridgeExtension;
import o.cy1;
import o.getNativeProp;
import o.initToken;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0013H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/contact/ContactBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "contact", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "event", "", "createFailResult", "Lcom/alibaba/fastjson/JSONObject;", "createSuccessResult", "uri", "Landroid/net/Uri;", "onReceiveActivityResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class ContactBridge extends BaseBridge {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    private static final String MOBILE = "mobile";
    private static final String NAME = "name";
    public static final int REQUEST_CODE = 101;
    private static final String TAG = "ContactBridge";
    private Activity activity;
    /* access modifiers changed from: private */
    public BridgeCallback bridgeCallback;

    public static final /* synthetic */ BridgeCallback access$getBridgeCallback$p(ContactBridge contactBridge) {
        BridgeCallback bridgeCallback2 = contactBridge.bridgeCallback;
        if (bridgeCallback2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
        }
        return bridgeCallback2;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void contact(@NotNull @BindingNode(Page.class) Page page, @Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            this.bridgeCallback = bridgeCallback2;
            Intent intent = new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
            if (Intrinsics.areEqual((Object) str, (Object) ContactEventType.CONTACT_GET)) {
                Activity activity3 = this.activity;
                if (activity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                Intrinsics.checkNotNullParameter(activity3, "$this$startActivityForResultSafely");
                Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
                if (DatePickerBridgeExtension.AnonymousClass8.length(intent, activity3)) {
                    activity3.startActivityForResult(intent, 101);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.lib.gcontainer.app.bridge.contact.ContactBridge$onReceiveActivityResult$1", f = "ContactBridge.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Uri $data;
        final /* synthetic */ BaseBridge.setMin $event;
        Object L$0;
        int label;
        final /* synthetic */ ContactBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ContactBridge contactBridge, BaseBridge.setMin setmin, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.this$0 = contactBridge;
            this.$event = setmin;
            this.$data = uri;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new setMax(this.this$0, this.$event, this.$data, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BridgeCallback bridgeCallback;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StringBuilder sb = new StringBuilder("data: ");
                sb.append(this.$event.length);
                LocationBridgeExtension.setMin(ContactBridge.TAG, sb.toString());
                BridgeCallback access$getBridgeCallback$p = ContactBridge.access$getBridgeCallback$p(this.this$0);
                JSONObject access$createSuccessResult = this.this$0.createSuccessResult(this.$data);
                this.L$0 = access$getBridgeCallback$p;
                this.label = 1;
                getNativeProp getnativeprop = new getNativeProp(IntrinsicsKt.intercepted(this), 1);
                getnativeprop.length();
                cy1 cy1 = getnativeprop;
                if (access$createSuccessResult != null) {
                    Result.Companion companion = Result.Companion;
                    cy1.resumeWith(Result.m1constructorimpl(access$createSuccessResult));
                } else {
                    Result.Companion companion2 = Result.Companion;
                    cy1.resumeWith(Result.m1constructorimpl(ResultKt.createFailure(new NullPointerException("Null return value"))));
                }
                Object min = getnativeprop.setMin();
                if (min == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
                if (min == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bridgeCallback = access$getBridgeCallback$p;
                obj = min;
            } else if (i == 1) {
                bridgeCallback = (BridgeCallback) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    LocationBridgeExtension.setMin(ContactBridge.TAG, "onReceiveMessageEvent", (Throwable) e);
                    ContactBridge.access$getBridgeCallback$p(this.this$0).sendJSONResponse(this.this$0.createFailResult());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bridgeCallback.sendJSONResponse((JSONObject) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/contact/ContactBridge$Companion;", "", "()V", "MOBILE", "", "NAME", "REQUEST_CODE", "", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        kotlin.io.CloseableKt.closeFinally(r13, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.alibaba.fastjson.JSONObject createSuccessResult(android.net.Uri r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            r2 = r1
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            java.lang.String r4 = "success"
            r2.put(r4, r3)
            o.PlaybackStateCompat r3 = new o.PlaybackStateCompat
            r3.<init>()
            android.app.Activity r4 = r12.activity
            if (r4 != 0) goto L_0x001f
            java.lang.String r5 = "activity"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x001f:
            android.content.ContentResolver r6 = r4.getContentResolver()
            java.lang.String r4 = "data1"
            java.lang.String r5 = "display_name"
            java.lang.String[] r8 = new java.lang.String[]{r4, r5}
            r9 = 0
            r10 = 0
            r11 = 0
            r7 = r13
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x0082
            java.io.Closeable r13 = (java.io.Closeable) r13
            r4 = r13
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch:{ all -> 0x007b }
        L_0x003a:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0074
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r6 = "cursor.getString(0)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch:{ Exception -> 0x0057 }
            r6 = 1
            java.lang.String r6 = r4.getString(r6)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r7 = "cursor.getString(1)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0063
        L_0x0055:
            r6 = move-exception
            goto L_0x0059
        L_0x0057:
            r6 = move-exception
            r5 = r0
        L_0x0059:
            java.lang.String r7 = "ContactBridge"
            java.lang.String r8 = "createSuccessResult"
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x007b }
            o.LocationBridgeExtension.setMin((java.lang.String) r7, (java.lang.String) r8, (java.lang.Throwable) r6)     // Catch:{ all -> 0x007b }
            r6 = r0
        L_0x0063:
            r7 = r3
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x007b }
            java.lang.String r8 = "mobile"
            r7.put(r8, r5)     // Catch:{ all -> 0x007b }
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ all -> 0x007b }
            java.lang.String r7 = "name"
            r5.put(r7, r6)     // Catch:{ all -> 0x007b }
            goto L_0x003a
        L_0x0074:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x007b }
            r0 = 0
            kotlin.io.CloseableKt.closeFinally(r13, r0)
            goto L_0x0082
        L_0x007b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x007d }
        L_0x007d:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r13, r0)
            throw r1
        L_0x0082:
            java.lang.String r13 = "info"
            r2.put(r13, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.contact.ContactBridge.createSuccessResult(android.net.Uri):com.alibaba.fastjson.JSONObject");
    }

    /* access modifiers changed from: private */
    public final JSONObject createFailResult() {
        JSONObject jSONObject = new JSONObject();
        Map map = jSONObject;
        map.put("success", Boolean.FALSE);
        map.put("error", "Failed to retrieve contact");
        return jSONObject;
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
        if (setmin.getMax == 101 && setmin.getMin == -1) {
            Intent intent = setmin.length;
            Uri data = intent != null ? intent.getData() : null;
            if (data == null) {
                BridgeCallback bridgeCallback2 = this.bridgeCallback;
                if (bridgeCallback2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
                }
                bridgeCallback2.sendJSONResponse(createFailResult());
                return;
            }
            xp4.getMin(getIoScope(), (CoroutineContext) null, (CoroutineStart) null, new setMax(this, setmin, data, (Continuation) null), 3);
        }
    }
}
