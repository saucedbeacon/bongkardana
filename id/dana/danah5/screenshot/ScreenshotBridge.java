package id.dana.danah5.screenshot;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.app.api.permission.RVNativePermissionRequestProxy;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.ImageUtils;
import com.alibaba.griver.base.common.utils.ToastUtils;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineStart;
import o.FontRes;
import o.fromIndex;
import o.initToken;
import o.setContentInsetEndWithActions;
import o.setContentInsetsRelative;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J0\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J$\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J0\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J0\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J*\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001cH\u0002J(\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020$2\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lid/dana/danah5/screenshot/ScreenshotBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "imageUri", "Landroid/net/Uri;", "captureScreen", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "params", "Lid/dana/danah5/screenshot/ScreenshotBridgeModel;", "checkPermissionsBeforeProcess", "result", "Lcom/alibaba/fastjson/JSONObject;", "bitmap", "Landroid/graphics/Bitmap;", "createNewBitmap", "handleSave", "context", "Landroid/content/Context;", "bridgeContext", "handleSaveToGallery", "handleSnapshot", "noPermission", "notifyGallery", "removeInvalidCharacters", "", "fileName", "saveImageToGallery", "", "baseFileName", "format", "screenshot", "page", "Lcom/alibaba/ariver/app/api/Page;", "name", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class ScreenshotBridge extends BaseBridge {
    @NotNull
    public static final setMin Companion = new setMin((DefaultConstructorMarker) null);
    private static final String DATAURL = "dataURL";
    private static final String DEFAULT_SCREENSHOT_FORMAT = "jpg";
    private static final String FILEURL = "fileURL";
    private static final String INVALID_CHARACTER_REGEX = "[\\\\/:*?\"<>|]";
    @NotNull
    public static final String TAG = "SnapshotBridgeExtension";
    private static final String UNDERSCORE_REGEX = "_";
    private Uri imageUri;

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public final void screenshot(@NotNull @BindingNode(Page.class) Page page, @Nullable @BindingParam({"name"}) String str, @NotNull @BindingCallback BridgeCallback bridgeCallback) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(bridgeCallback, "callback");
        fromIndex fromindex = new fromIndex(str, -1, -1, true, FILEURL, "jpg", 75);
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Activity activity = pageContext != null ? pageContext.getActivity() : null;
        if (activity != null) {
            captureScreen(activity, bridgeCallback, fromindex);
        }
    }

    private final void handleSnapshot(Activity activity, BridgeCallback bridgeCallback, fromIndex fromindex, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            bridgeCallback.sendJSONResponse(ScreenshotPluginResultFactory.getResult("003"));
        } else {
            xp4.getMin(getIoScope(), (CoroutineContext) null, (CoroutineStart) null, new toIntRange(this, fromindex, bitmap, bridgeCallback, activity, (Continuation) null), 3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.danah5.screenshot.ScreenshotBridge$handleSnapshot$1", f = "ScreenshotBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class toIntRange extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ BridgeCallback $callback;
        final /* synthetic */ fromIndex $params;
        int label;
        final /* synthetic */ ScreenshotBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(ScreenshotBridge screenshotBridge, fromIndex fromindex, Bitmap bitmap, BridgeCallback bridgeCallback, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.this$0 = screenshotBridge;
            this.$params = fromindex;
            this.$bitmap = bitmap;
            this.$callback = bridgeCallback;
            this.$activity = activity;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new toIntRange(this.this$0, this.$params, this.$bitmap, this.$callback, this.$activity, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((toIntRange) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                fromIndex fromindex = this.$params;
                fromindex.setMaxWidth(fromindex.getMaxWidth() < 0 ? this.$bitmap.getWidth() : this.$params.getMaxWidth());
                fromIndex fromindex2 = this.$params;
                fromindex2.setMaxHeight(fromindex2.getMaxHeight() < 0 ? this.$bitmap.getHeight() : this.$params.getMaxHeight());
                final Bitmap access$createNewBitmap = this.this$0.createNewBitmap(this.$params, this.$bitmap, this.$callback);
                if (access$createNewBitmap == null) {
                    return Unit.INSTANCE;
                }
                final JSONObject jSONObject = new JSONObject();
                if (this.$params.isSaveToGallery()) {
                    xp4.getMin(this.this$0.getUiScope(), (CoroutineContext) null, (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                        int label;
                        final /* synthetic */ toIntRange this$0;

                        {
                            this.this$0 = r1;
                        }

                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            Intrinsics.checkNotNullParameter(continuation, "completion");
                            return 

                            /* access modifiers changed from: private */
                            public final Bitmap createNewBitmap(fromIndex fromindex, Bitmap bitmap, BridgeCallback bridgeCallback) {
                                if (bitmap == null) {
                                    return null;
                                }
                                if (!(fromindex.getMaxHeight() == bitmap.getHeight() && fromindex.getMaxWidth() == bitmap.getWidth())) {
                                    bitmap = ImageUtils.scaleBitmap(bitmap, fromindex.getMaxWidth(), fromindex.getMaxHeight());
                                }
                                if (!(bitmap == null || !Intrinsics.areEqual((Object) "jpg", (Object) fromindex.getImageFormat()) || fromindex.getQuality() == 100)) {
                                    bitmap = ImageUtils.imageQuality(bitmap, fromindex.getQuality());
                                }
                                if (bitmap == null) {
                                    bridgeCallback.sendJSONResponse(ScreenshotPluginResultFactory.getResult("003"));
                                }
                                return bitmap;
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
                            @DebugMetadata(c = "id.dana.danah5.screenshot.ScreenshotBridge$checkPermissionsBeforeProcess$1", f = "ScreenshotBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                            static final class length extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
                                final /* synthetic */ Activity $activity;
                                final /* synthetic */ Bitmap $bitmap;
                                final /* synthetic */ BridgeCallback $callback;
                                final /* synthetic */ fromIndex $params;
                                final /* synthetic */ JSONObject $result;
                                int label;
                                final /* synthetic */ ScreenshotBridge this$0;

                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                length(ScreenshotBridge screenshotBridge, Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject, fromIndex fromindex, Bitmap bitmap, Continuation continuation) {
                                    super(2, continuation);
                                    this.this$0 = screenshotBridge;
                                    this.$activity = activity;
                                    this.$callback = bridgeCallback;
                                    this.$result = jSONObject;
                                    this.$params = fromindex;
                                    this.$bitmap = bitmap;
                                }

                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    Intrinsics.checkNotNullParameter(continuation, "completion");
                                    return new length(this.this$0, this.$activity, this.$callback, this.$result, this.$params, this.$bitmap, continuation);
                                }

                                public final Object invoke(Object obj, Object obj2) {
                                    return ((length) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.this$0.handleSaveToGallery(this.$activity, this.$callback, this.$result, this.$params, this.$bitmap);
                                        return Unit.INSTANCE;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }

                            /* access modifiers changed from: private */
                            public final void checkPermissionsBeforeProcess(Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject, fromIndex fromindex, Bitmap bitmap) {
                                setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
                                if (setContentInsetsRelative.setMax.getMax(activity)) {
                                    xp4.getMin(getIoScope(), (CoroutineContext) null, (CoroutineStart) null, new length(this, activity, bridgeCallback, jSONObject, fromindex, bitmap, (Continuation) null), 3);
                                    return;
                                }
                                FontRes.getMin(activity, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 2002);
                                RVNativePermissionRequestProxy rVNativePermissionRequestProxy = (RVNativePermissionRequestProxy) RVProxy.get(RVNativePermissionRequestProxy.class);
                                if (rVNativePermissionRequestProxy != null) {
                                    rVNativePermissionRequestProxy.addPermRequstCallback(2002, new getMin(this, activity, bridgeCallback, jSONObject, fromindex, bitmap));
                                }
                            }

                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032,\u0010\u0004\u001a(\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u000e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "i", "", "<anonymous parameter 1>", "", "", "kotlin.jvm.PlatformType", "ints", "", "onRequestPermissionResult", "(I[Ljava/lang/String;[I)V"}, k = 3, mv = {1, 4, 2})
                            static final class getMin implements IPermissionRequestCallback {
                                final /* synthetic */ Activity $activity;
                                final /* synthetic */ Bitmap $bitmap;
                                final /* synthetic */ BridgeCallback $callback;
                                final /* synthetic */ fromIndex $params;
                                final /* synthetic */ JSONObject $result;
                                final /* synthetic */ ScreenshotBridge this$0;

                                getMin(ScreenshotBridge screenshotBridge, Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject, fromIndex fromindex, Bitmap bitmap) {
                                    this.this$0 = screenshotBridge;
                                    this.$activity = activity;
                                    this.$callback = bridgeCallback;
                                    this.$result = jSONObject;
                                    this.$params = fromindex;
                                    this.$bitmap = bitmap;
                                }

                                public final void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                                    if (i == 2002) {
                                        Intrinsics.checkNotNullExpressionValue(iArr, "ints");
                                        Integer firstOrNull = ArraysKt.firstOrNull(iArr);
                                        if (firstOrNull != null && firstOrNull.intValue() == 0) {
                                            xp4.getMin(this.this$0.getIoScope(), (CoroutineContext) null, (CoroutineStart) null, new Function2<initToken, Continuation<? super Unit>, Object>(this, (Continuation) null) {
                                                int label;
                                                final /* synthetic */ getMin this$0;

                                                {
                                                    this.this$0 = r1;
                                                }

                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    Intrinsics.checkNotNullParameter(continuation, "completion");
                                                    return 

                                                    /* access modifiers changed from: private */
                                                    public final void noPermission(BridgeCallback bridgeCallback) {
                                                        bridgeCallback.sendJSONResponse(ScreenshotPluginResultFactory.getResult("002"));
                                                    }

                                                    private final String removeInvalidCharacters(String str) {
                                                        return new Regex(INVALID_CHARACTER_REGEX).replace((CharSequence) str, "_");
                                                    }

                                                    /* access modifiers changed from: private */
                                                    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b3  */
                                                    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
                                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                                    public final void handleSave(android.content.Context r6, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r7, com.alibaba.fastjson.JSONObject r8, o.fromIndex r9, android.graphics.Bitmap r10) {
                                                        /*
                                                            r5 = this;
                                                            java.lang.String r0 = r9.getDataType()
                                                            java.lang.String r1 = "001"
                                                            if (r0 != 0) goto L_0x000a
                                                            goto L_0x00a6
                                                        L_0x000a:
                                                            int r2 = r0.hashCode()
                                                            r3 = -855010733(0xffffffffcd099253, float:-1.44254256E8)
                                                            if (r2 == r3) goto L_0x0034
                                                            r6 = 1443184997(0x56054165, float:3.6628978E13)
                                                            if (r2 == r6) goto L_0x001a
                                                            goto L_0x00a6
                                                        L_0x001a:
                                                            java.lang.String r6 = "dataURL"
                                                            boolean r6 = r0.equals(r6)
                                                            if (r6 == 0) goto L_0x00a6
                                                            com.alibaba.ariver.kernel.common.service.executor.ExecutorType r6 = com.alibaba.ariver.kernel.common.service.executor.ExecutorType.URGENT
                                                            java.util.concurrent.Executor r6 = com.alibaba.griver.base.common.executor.GriverExecutors.getExecutor(r6)
                                                            id.dana.danah5.screenshot.ScreenshotBridge$getMax r8 = new id.dana.danah5.screenshot.ScreenshotBridge$getMax
                                                            r8.<init>(r10, r9, r7)
                                                            java.lang.Runnable r8 = (java.lang.Runnable) r8
                                                            r6.execute(r8)
                                                            goto L_0x00ad
                                                        L_0x0034:
                                                            java.lang.String r2 = "fileURL"
                                                            boolean r0 = r0.equals(r2)
                                                            if (r0 == 0) goto L_0x00a6
                                                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                                            r0.<init>()
                                                            java.lang.String r3 = r9.getFilename()
                                                            r0.append(r3)
                                                            java.lang.String r3 = "_"
                                                            r0.append(r3)
                                                            long r3 = java.lang.System.currentTimeMillis()
                                                            r0.append(r3)
                                                            java.lang.String r0 = r0.toString()
                                                            java.lang.String r0 = r5.removeInvalidCharacters(r0)
                                                            java.lang.String r9 = r9.getImageFormat()
                                                            java.lang.String r3 = "params.imageFormat"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r3)
                                                            int r9 = r5.saveImageToGallery(r6, r10, r0, r9)
                                                            if (r9 != 0) goto L_0x006d
                                                            r9 = 1
                                                            goto L_0x006e
                                                        L_0x006d:
                                                            r9 = 0
                                                        L_0x006e:
                                                            r0 = r8
                                                            java.util.Map r0 = (java.util.Map) r0
                                                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
                                                            java.lang.String r4 = "success"
                                                            r0.put(r4, r3)
                                                            if (r9 == 0) goto L_0x007d
                                                            goto L_0x007f
                                                        L_0x007d:
                                                            java.lang.String r1 = "003"
                                                        L_0x007f:
                                                            java.lang.String r3 = "error"
                                                            r0.put(r3, r1)
                                                            if (r9 == 0) goto L_0x0097
                                                            android.net.Uri r6 = r5.imageUri
                                                            if (r6 != 0) goto L_0x008f
                                                            java.lang.String r9 = "imageUri"
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r9)
                                                        L_0x008f:
                                                            java.lang.String r6 = r6.toString()
                                                            r0.put(r2, r6)
                                                            goto L_0x00a2
                                                        L_0x0097:
                                                            int r9 = com.alibaba.griver.device.R.string.griver_save_pic_failed
                                                            java.lang.String r6 = r6.getString(r9)
                                                            java.lang.String r9 = "errorMessage"
                                                            r0.put(r9, r6)
                                                        L_0x00a2:
                                                            r7.sendJSONResponse(r8)
                                                            goto L_0x00ad
                                                        L_0x00a6:
                                                            com.alibaba.fastjson.JSONObject r6 = id.dana.danah5.screenshot.ScreenshotPluginResultFactory.getResult(r1)
                                                            r7.sendJSONResponse(r6)
                                                        L_0x00ad:
                                                            boolean r6 = r10.isRecycled()
                                                            if (r6 != 0) goto L_0x00b6
                                                            r10.recycle()
                                                        L_0x00b6:
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.screenshot.ScreenshotBridge.handleSave(android.content.Context, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, com.alibaba.fastjson.JSONObject, o.fromIndex, android.graphics.Bitmap):void");
                                                    }

                                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
                                                    static final class getMax implements Runnable {
                                                        final /* synthetic */ Bitmap $bitmap;
                                                        final /* synthetic */ BridgeCallback $bridgeContext;
                                                        final /* synthetic */ fromIndex $params;

                                                        getMax(Bitmap bitmap, fromIndex fromindex, BridgeCallback bridgeCallback) {
                                                            this.$bitmap = bitmap;
                                                            this.$params = fromindex;
                                                            this.$bridgeContext = bridgeCallback;
                                                        }

                                                        public final void run() {
                                                            String bitmapToString = ImageUtils.bitmapToString(this.$bitmap, this.$params.getImageFormat());
                                                            JSONObject jSONObject = new JSONObject();
                                                            Map map = jSONObject;
                                                            map.put(ScreenshotBridge.DATAURL, bitmapToString);
                                                            map.put("success", Boolean.TRUE);
                                                            map.put("error", "001");
                                                            this.$bridgeContext.sendJSONResponse(jSONObject);
                                                            this.$bitmap.recycle();
                                                        }
                                                    }

                                                    private final void notifyGallery(Context context, Uri uri) {
                                                        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                                                        if (Build.VERSION.SDK_INT > 28) {
                                                            new setContentInsetEndWithActions(context, uri).toFloatRange();
                                                        }
                                                    }

                                                    /* access modifiers changed from: private */
                                                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
                                                        if (r10 == null) goto L_0x0055;
                                                     */
                                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                                    public final void handleSaveToGallery(android.app.Activity r8, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r9, com.alibaba.fastjson.JSONObject r10, o.fromIndex r11, android.graphics.Bitmap r12) {
                                                        /*
                                                            r7 = this;
                                                            android.content.Context r0 = r8.getApplicationContext()
                                                            java.lang.String r1 = "activity.applicationContext"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                                                            long r2 = java.lang.System.currentTimeMillis()
                                                            java.lang.String r2 = java.lang.String.valueOf(r2)
                                                            java.lang.String r11 = r11.getImageFormat()
                                                            java.lang.String r3 = "params.imageFormat"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
                                                            int r11 = r7.saveImageToGallery(r0, r12, r2, r11)
                                                            r12 = 1
                                                            java.lang.String r0 = "error"
                                                            java.lang.String r2 = "success"
                                                            r3 = 0
                                                            if (r11 != 0) goto L_0x00ad
                                                            r10 = r8
                                                            android.content.Context r10 = (android.content.Context) r10
                                                            boolean r10 = o.setTopBackgroundColor.getMin(r10)
                                                            if (r10 == 0) goto L_0x0113
                                                            android.net.Uri r10 = r7.imageUri
                                                            java.lang.String r11 = "imageUri"
                                                            if (r10 != 0) goto L_0x0038
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
                                                        L_0x0038:
                                                            java.lang.String r10 = r10.getPath()
                                                            if (r10 == 0) goto L_0x0055
                                                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                                            java.lang.String r5 = "Downloads/"
                                                            r4.<init>(r5)
                                                            r5 = 47
                                                            r6 = 2
                                                            java.lang.String r10 = kotlin.text.StringsKt.substringAfterLast$default((java.lang.String) r10, (char) r5, (java.lang.String) r3, (int) r6, (java.lang.Object) r3)
                                                            r4.append(r10)
                                                            java.lang.String r10 = r4.toString()
                                                            if (r10 != 0) goto L_0x0057
                                                        L_0x0055:
                                                            java.lang.String r10 = "Downloads"
                                                        L_0x0057:
                                                            int r3 = com.alibaba.griver.device.R.string.griver_save_image_to
                                                            java.lang.Object[] r12 = new java.lang.Object[r12]
                                                            r4 = 0
                                                            r12[r4] = r10
                                                            java.lang.String r10 = r8.getString(r3, r12)
                                                            java.lang.String r12 = "activity.getString(R.str…_save_image_to, basePath)"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r12)
                                                            java.lang.String r10 = java.lang.String.valueOf(r10)
                                                            java.lang.String r12 = "save to gallery success: "
                                                            java.lang.String r10 = r12.concat(r10)
                                                            java.lang.String r12 = "SnapshotBridgeExtension"
                                                            com.alibaba.griver.base.common.logger.GriverLogger.d(r12, r10)
                                                            com.alibaba.fastjson.JSONObject r10 = new com.alibaba.fastjson.JSONObject
                                                            r10.<init>()
                                                            r12 = r10
                                                            java.util.Map r12 = (java.util.Map) r12
                                                            java.lang.Boolean r3 = java.lang.Boolean.TRUE
                                                            r12.put(r2, r3)
                                                            java.lang.String r2 = "001"
                                                            r12.put(r0, r2)
                                                            android.net.Uri r0 = r7.imageUri
                                                            if (r0 != 0) goto L_0x008f
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
                                                        L_0x008f:
                                                            java.lang.String r0 = r0.toString()
                                                            java.lang.String r2 = "fileURL"
                                                            r12.put(r2, r0)
                                                            r9.sendJSONResponse(r10)
                                                            android.content.Context r8 = r8.getApplicationContext()
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                                                            android.net.Uri r9 = r7.imageUri
                                                            if (r9 != 0) goto L_0x00a9
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r11)
                                                        L_0x00a9:
                                                            r7.notifyGallery(r8, r9)
                                                            return
                                                        L_0x00ad:
                                                            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                                                            r1.<init>()
                                                            int r4 = com.alibaba.griver.device.R.string.griver_save_image_failed
                                                            java.lang.String r4 = r8.getString(r4)
                                                            java.lang.String r5 = "activity.getString(R.str…griver_save_image_failed)"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                                                            r1.element = r4
                                                            r4 = r8
                                                            android.content.Context r4 = (android.content.Context) r4
                                                            boolean r4 = o.setTopBackgroundColor.getMin(r4)
                                                            if (r4 == 0) goto L_0x00fa
                                                            r4 = 3
                                                            if (r11 != r12) goto L_0x00d9
                                                            int r11 = com.alibaba.griver.device.R.string.griver_snap_sd_error
                                                            java.lang.String r11 = r8.getString(r11)
                                                            java.lang.String r12 = "activity.getString(R.string.griver_snap_sd_error)"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
                                                            r1.element = r11
                                                            goto L_0x00ec
                                                        L_0x00d9:
                                                            r12 = 10
                                                            if (r11 == r12) goto L_0x00df
                                                            if (r11 != r4) goto L_0x00ec
                                                        L_0x00df:
                                                            int r11 = com.alibaba.griver.device.R.string.h5_snap_error
                                                            java.lang.String r11 = r8.getString(r11)
                                                            java.lang.String r12 = "activity.getString(R.string.h5_snap_error)"
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r12)
                                                            r1.element = r11
                                                        L_0x00ec:
                                                            o.initToken r11 = r7.getUiScope()
                                                            id.dana.danah5.screenshot.ScreenshotBridge$setMax r12 = new id.dana.danah5.screenshot.ScreenshotBridge$setMax
                                                            r12.<init>(r8, r1, r3)
                                                            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
                                                            o.xp4.getMin(r11, r3, r3, r12, r4)
                                                        L_0x00fa:
                                                            r8 = r10
                                                            java.util.Map r8 = (java.util.Map) r8
                                                            java.lang.Boolean r11 = java.lang.Boolean.FALSE
                                                            r8.put(r2, r11)
                                                            java.lang.String r11 = "003"
                                                            r8.put(r0, r11)
                                                            T r11 = r1.element
                                                            java.lang.String r11 = (java.lang.String) r11
                                                            java.lang.String r12 = "errorMsg"
                                                            r8.put(r12, r11)
                                                            r9.sendJSONResponse(r10)
                                                        L_0x0113:
                                                            return
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.screenshot.ScreenshotBridge.handleSaveToGallery(android.app.Activity, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback, com.alibaba.fastjson.JSONObject, o.fromIndex, android.graphics.Bitmap):void");
                                                    }

                                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
                                                    @DebugMetadata(c = "id.dana.danah5.screenshot.ScreenshotBridge$handleSaveToGallery$1", f = "ScreenshotBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                                                    static final class setMax extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
                                                        final /* synthetic */ Activity $activity;
                                                        final /* synthetic */ Ref.ObjectRef $message;
                                                        int label;

                                                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                        setMax(Activity activity, Ref.ObjectRef objectRef, Continuation continuation) {
                                                            super(2, continuation);
                                                            this.$activity = activity;
                                                            this.$message = objectRef;
                                                        }

                                                        @NotNull
                                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                            Intrinsics.checkNotNullParameter(continuation, "completion");
                                                            return new setMax(this.$activity, this.$message, continuation);
                                                        }

                                                        public final Object invoke(Object obj, Object obj2) {
                                                            return ((setMax) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                                                        }

                                                        @Nullable
                                                        public final Object invokeSuspend(@NotNull Object obj) {
                                                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            if (this.label == 0) {
                                                                ResultKt.throwOnFailure(obj);
                                                                ToastUtils.showToast(this.$activity.getApplicationContext(), (String) this.$message.element, 0);
                                                                return Unit.INSTANCE;
                                                            }
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                    }

                                                    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0082, code lost:
                                                        r6 = move-exception;
                                                     */
                                                    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
                                                        kotlin.io.CloseableKt.closeFinally(r2, r5);
                                                     */
                                                    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
                                                        throw r6;
                                                     */
                                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                                    private final int saveImageToGallery(android.content.Context r5, android.graphics.Bitmap r6, java.lang.String r7, java.lang.String r8) {
                                                        /*
                                                            r4 = this;
                                                            java.lang.String r0 = android.os.Environment.getExternalStorageState()
                                                            java.lang.String r1 = "mounted"
                                                            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
                                                            r1 = 1
                                                            r0 = r0 ^ r1
                                                            if (r0 == 0) goto L_0x000f
                                                            return r1
                                                        L_0x000f:
                                                            o.getCurrentContentInsetRight r0 = new o.getCurrentContentInsetRight
                                                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                                            r1.<init>()
                                                            r1.append(r7)
                                                            r7 = 46
                                                            r1.append(r7)
                                                            r1.append(r8)
                                                            java.lang.String r7 = r1.toString()
                                                            java.lang.String r1 = java.lang.String.valueOf(r8)
                                                            java.lang.String r2 = "image/"
                                                            java.lang.String r1 = r2.concat(r1)
                                                            java.lang.String r2 = "DANA"
                                                            r0.<init>(r7, r2, r1)
                                                            o.setContentInsetEndWithActions r7 = o.getCurrentContentInsetLeft.setMin(r5, r0)
                                                            r0 = 3
                                                            if (r7 == 0) goto L_0x0091
                                                            android.net.Uri r7 = r7.length
                                                            if (r7 != 0) goto L_0x0040
                                                            goto L_0x0091
                                                        L_0x0040:
                                                            r4.imageUri = r7
                                                            java.lang.String r1 = "imageUri"
                                                            if (r7 != 0) goto L_0x0049
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
                                                        L_0x0049:
                                                            java.io.OutputStream r7 = o.getContentInsetRight.getMax(r7, r5)
                                                            if (r7 != 0) goto L_0x0050
                                                            return r0
                                                        L_0x0050:
                                                            r2 = r7
                                                            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ Exception -> 0x0087 }
                                                            java.lang.String r3 = "jpg"
                                                            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r8)     // Catch:{ all -> 0x0080 }
                                                            if (r8 == 0) goto L_0x005e
                                                            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0080 }
                                                            goto L_0x0060
                                                        L_0x005e:
                                                            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0080 }
                                                        L_0x0060:
                                                            r3 = 100
                                                            boolean r6 = r6.compress(r8, r3, r7)     // Catch:{ all -> 0x0080 }
                                                            r7 = 0
                                                            if (r6 == 0) goto L_0x007a
                                                            android.net.Uri r6 = r4.imageUri     // Catch:{ all -> 0x0080 }
                                                            if (r6 != 0) goto L_0x0070
                                                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)     // Catch:{ all -> 0x0080 }
                                                        L_0x0070:
                                                            r4.notifyGallery(r5, r6)     // Catch:{ all -> 0x0080 }
                                                            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0080 }
                                                            kotlin.io.CloseableKt.closeFinally(r2, r7)     // Catch:{ Exception -> 0x0087 }
                                                            r5 = 0
                                                            return r5
                                                        L_0x007a:
                                                            kotlin.io.CloseableKt.closeFinally(r2, r7)     // Catch:{ Exception -> 0x0087 }
                                                            r5 = 10
                                                            return r5
                                                        L_0x0080:
                                                            r5 = move-exception
                                                            throw r5     // Catch:{ all -> 0x0082 }
                                                        L_0x0082:
                                                            r6 = move-exception
                                                            kotlin.io.CloseableKt.closeFinally(r2, r5)     // Catch:{ Exception -> 0x0087 }
                                                            throw r6     // Catch:{ Exception -> 0x0087 }
                                                        L_0x0087:
                                                            r5 = move-exception
                                                            java.lang.Throwable r5 = (java.lang.Throwable) r5
                                                            java.lang.String r6 = "SnapshotBridgeExtension"
                                                            java.lang.String r7 = "saveImageToGallery exception."
                                                            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r6, r7, r5)
                                                        L_0x0091:
                                                            return r0
                                                        */
                                                        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.screenshot.ScreenshotBridge.saveImageToGallery(android.content.Context, android.graphics.Bitmap, java.lang.String, java.lang.String):int");
                                                    }

                                                    private final void captureScreen(Activity activity, BridgeCallback bridgeCallback, fromIndex fromindex) {
                                                        try {
                                                            Rect rect = new Rect();
                                                            int i = rect.top;
                                                            Window window = activity.getWindow();
                                                            Intrinsics.checkNotNullExpressionValue(window, "activity.window");
                                                            View decorView = window.getDecorView();
                                                            decorView.buildDrawingCache();
                                                            decorView.getWindowVisibleDisplayFrame(rect);
                                                            decorView.setDrawingCacheEnabled(true);
                                                            Intrinsics.checkNotNullExpressionValue(decorView, "activity.window.decorVie…bled = true\n            }");
                                                            Bitmap drawingCache = decorView.getDrawingCache();
                                                            Intrinsics.checkNotNullExpressionValue(drawingCache, "drawingCache");
                                                            Bitmap createBitmap = Bitmap.createBitmap(drawingCache, 0, i, drawingCache.getWidth(), drawingCache.getHeight() - i);
                                                            decorView.destroyDrawingCache();
                                                            handleSnapshot(activity, bridgeCallback, fromindex, createBitmap);
                                                        } catch (Exception e) {
                                                            RVLogger.e("SnapshotBridgeExtension", (Throwable) e);
                                                        }
                                                    }

                                                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/danah5/screenshot/ScreenshotBridge$Companion;", "", "()V", "DATAURL", "", "DEFAULT_SCREENSHOT_FORMAT", "FILEURL", "INVALID_CHARACTER_REGEX", "TAG", "UNDERSCORE_REGEX", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
                                                    public static final class setMin {
                                                        private setMin() {
                                                        }

                                                        public /* synthetic */ setMin(DefaultConstructorMarker defaultConstructorMarker) {
                                                            this();
                                                        }
                                                    }
                                                }
