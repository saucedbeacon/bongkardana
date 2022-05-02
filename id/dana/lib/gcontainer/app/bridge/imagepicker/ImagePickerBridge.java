package id.dana.lib.gcontainer.app.bridge.imagepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
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
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.core.BaseBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.FontRes;
import o.setClipboard;
import o.setLeftSelectedIndex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0002J2\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006!"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/imagepicker/ImagePickerBridge;", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "()V", "activity", "Landroid/app/Activity;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "eventName", "", "handPicked", "Lid/dana/lib/gcontainer/util/handpicked/HandPicked;", "imageEntity", "Lid/dana/lib/gcontainer/app/bridge/imagepicker/ImagePickerEntity;", "isCamera", "", "()Z", "isDialog", "isGallery", "hasCameraPermission", "hasStoragePermission", "imagePicker", "", "page", "Lcom/alibaba/ariver/app/api/Page;", "event", "info", "Lcom/alibaba/fastjson/JSONObject;", "onReceiveActivityResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "onReceivePermissionResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$PermissionResultMessageEvent;", "pickImage", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class ImagePickerBridge extends BaseBridge {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    private static final int MINIMUM_STORAGE_AVAILABLE = 100;
    public static final int REQUEST_CODE_PERMISSION = 202;
    public static final int REQUEST_CODE_PICK_IMAGE = 203;
    private static final String TAG;
    private Activity activity;
    private BridgeCallback bridgeCallback;
    private String eventName;
    private setClipboard handPicked;
    private ImagePickerEntity imageEntity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/JSONExtKt$toObject$1", "Lcom/alibaba/fastjson/TypeReference;", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends TypeReference<ImagePickerEntity> {
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter(canOverride = false)
    public final void imagePicker(@NotNull @BindingNode(Page.class) Page page, @Nullable @BindingParam(name = {"event"}) String str, @NotNull @BindingParam(name = {"info"}) JSONObject jSONObject, @NotNull @BindingCallback BridgeCallback bridgeCallback2) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(jSONObject, "info");
        Intrinsics.checkNotNullParameter(bridgeCallback2, "bridgeCallback");
        if (setLeftSelectedIndex.length() <= 100) {
            bridgeCallback2.sendJSONResponse(getMin.setMax("GENERAL_ERROR"));
            return;
        }
        Intrinsics.checkNotNullParameter(page, "$this$activity");
        PageContext pageContext = page.getPageContext();
        Object obj = null;
        Activity activity2 = pageContext != null ? pageContext.getActivity() : null;
        if (activity2 != null) {
            this.activity = activity2;
            try {
                obj = JSONObject.parseObject(jSONObject.toJSONString(), new setMin(), new Feature[0]);
            } catch (JSONException | NullPointerException unused) {
            }
            ImagePickerEntity imagePickerEntity = (ImagePickerEntity) obj;
            if (imagePickerEntity != null) {
                this.imageEntity = imagePickerEntity;
                this.bridgeCallback = bridgeCallback2;
                this.eventName = str;
                String[] strArr = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};
                Activity activity3 = this.activity;
                if (activity3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                if (arePermissionsGranted(activity3, strArr)) {
                    pickImage();
                    return;
                }
                Activity activity4 = this.activity;
                if (activity4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
                }
                FontRes.getMin(activity4, strArr, 202);
            }
        }
    }

    private final void pickImage() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        ImagePickerEntity imagePickerEntity = this.imageEntity;
        if (imagePickerEntity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageEntity");
        }
        setClipboard setclipboard = new setClipboard(activity2, imagePickerEntity.getDialogTitle(), hasCameraPermission(), hasStoragePermission());
        this.handPicked = setclipboard;
        if (setclipboard != null) {
            List arrayList = new ArrayList();
            if (setclipboard.getMin) {
                setclipboard.getMax(arrayList, setClipboard.setMin());
            }
            if (setclipboard.getMax) {
                setclipboard.getMax(arrayList, setclipboard.length());
            }
            Collection collection = arrayList;
            if (!collection.isEmpty()) {
                Activity activity3 = setclipboard.length;
                Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), setclipboard.setMax);
                Object[] array = collection.toArray(new Intent[0]);
                if (array != null) {
                    Intent putExtra = createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) array);
                    Intrinsics.checkNotNullExpressionValue(putExtra, "Intent.createChooser(int…, intents.toTypedArray())");
                    Intrinsics.checkNotNullParameter(activity3, "$this$startActivityForResultSafely");
                    Intrinsics.checkNotNullParameter(putExtra, IpcMessageConstants.EXTRA_INTENT);
                    if (DatePickerBridgeExtension.AnonymousClass8.length(putExtra, activity3)) {
                        activity3.startActivityForResult(putExtra, 203);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
    }

    private final boolean hasStoragePermission() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        boolean arePermissionsGranted = arePermissionsGranted(activity2, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        if (!arePermissionsGranted && isGallery()) {
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            bridgeCallback2.sendJSONResponse(getMin.setMax(ImagePickerResultType.GALLERY_PERMISSION_NOT_GRANTED));
            return false;
        } else if ((isGallery() || isDialog()) && arePermissionsGranted) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean hasCameraPermission() {
        Activity activity2 = this.activity;
        if (activity2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(AkuEventParamsKey.KEY_ACTIVITY);
        }
        boolean arePermissionsGranted = arePermissionsGranted(activity2, new String[]{"android.permission.CAMERA"});
        if (!arePermissionsGranted && isCamera()) {
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            bridgeCallback2.sendJSONResponse(getMin.setMax(ImagePickerResultType.CAMERA_PERMISSION_NOT_GRANTED));
            return false;
        } else if ((isCamera() || isDialog()) && arePermissionsGranted) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean isGallery() {
        return Intrinsics.areEqual((Object) this.eventName, (Object) ImagePickerEvent.GALLERY);
    }

    private final boolean isDialog() {
        CharSequence charSequence = this.eventName;
        return charSequence == null || charSequence.length() == 0;
    }

    private final boolean isCamera() {
        return Intrinsics.areEqual((Object) this.eventName, (Object) ImagePickerEvent.CAMERA);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/imagepicker/ImagePickerBridge$Companion;", "", "()V", "MINIMUM_STORAGE_AVAILABLE", "", "REQUEST_CODE_PERMISSION", "REQUEST_CODE_PICK_IMAGE", "TAG", "", "getErrorResult", "Lcom/alibaba/fastjson/JSONObject;", "errorType", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            if (r5.equals(r3) != false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            if (r5.equals("004") != false) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
            r3 = "004";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
            if (r5.equals(id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerResultType.FAILED_COMPRESS_IMAGE) != false) goto L_0x005f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
            r3 = "001";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
            r1.put("error", r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
            if (r5.equals(id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerResultType.FAILED_CREATING_IMAGE) != false) goto L_0x0047;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.alibaba.fastjson.JSONObject setMax(@org.jetbrains.annotations.Nullable java.lang.String r5) {
            /*
                com.alibaba.fastjson.JSONObject r0 = new com.alibaba.fastjson.JSONObject
                r0.<init>()
                r1 = r0
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                java.lang.String r3 = "success"
                r1.put(r3, r2)
                int r2 = r5.hashCode()
                java.lang.String r3 = "006"
                java.lang.String r4 = "004"
                switch(r2) {
                    case -1928266010: goto L_0x0054;
                    case -398546049: goto L_0x0049;
                    case 47668: goto L_0x0041;
                    case 47670: goto L_0x003a;
                    case 421160189: goto L_0x0031;
                    case 848626822: goto L_0x0026;
                    case 1822982328: goto L_0x001b;
                    default: goto L_0x001a;
                }
            L_0x001a:
                goto L_0x005d
            L_0x001b:
                java.lang.String r2 = "ERR_FAILED_RESIZE_IMAGE"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x005d
                java.lang.String r3 = "005"
                goto L_0x005f
            L_0x0026:
                java.lang.String r2 = "ERR_GALLERY_PERMISSION_NOT_GRANTED"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x005d
                java.lang.String r3 = "003"
                goto L_0x005f
            L_0x0031:
                java.lang.String r2 = "ERR_FAILED_CREATING_IMAGE"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x005d
                goto L_0x0047
            L_0x003a:
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x005d
                goto L_0x005f
            L_0x0041:
                boolean r5 = r5.equals(r4)
                if (r5 == 0) goto L_0x005d
            L_0x0047:
                r3 = r4
                goto L_0x005f
            L_0x0049:
                java.lang.String r2 = "ERR_CAMERA_PERMISSION_NOT_GRANTED"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x005d
                java.lang.String r3 = "002"
                goto L_0x005f
            L_0x0054:
                java.lang.String r2 = "ERR_FAILED_COMPRESS_IMAGE"
                boolean r5 = r5.equals(r2)
                if (r5 == 0) goto L_0x005d
                goto L_0x005f
            L_0x005d:
                java.lang.String r3 = "001"
            L_0x005f:
                java.lang.String r5 = "error"
                r1.put(r5, r3)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge.getMin.setMax(java.lang.String):com.alibaba.fastjson.JSONObject");
        }
    }

    static {
        String simpleName = ImagePickerBridge.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "ImagePickerBridge::class.java.simpleName");
        TAG = simpleName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r1.equals("android.permission.WRITE_EXTERNAL_STORAGE") == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r1.equals("android.permission.READ_EXTERNAL_STORAGE") != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceivePermissionResult(@org.jetbrains.annotations.NotNull id.dana.lib.gcontainer.app.bridge.core.BaseBridge.getMin r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.getMin
            r1 = 202(0xca, float:2.83E-43)
            if (r0 == r1) goto L_0x000c
            return
        L_0x000c:
            java.util.List<o.pushWindow> r4 = r4.length
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r4.next()
            r2 = r0
            o.pushWindow r2 = (o.pushWindow) r2
            boolean r2 = r2.setMax()
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0014
            goto L_0x002c
        L_0x002b:
            r0 = r1
        L_0x002c:
            o.pushWindow r0 = (o.pushWindow) r0
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = r0.length
        L_0x0032:
            if (r1 != 0) goto L_0x0035
            goto L_0x0086
        L_0x0035:
            int r4 = r1.hashCode()
            r0 = -406040016(0xffffffffe7cc5230, float:-1.9297577E24)
            java.lang.String r2 = "bridgeCallback"
            if (r4 == r0) goto L_0x006d
            r0 = 463403621(0x1b9efa65, float:2.630072E-22)
            if (r4 == r0) goto L_0x0054
            r0 = 1365911975(0x516a29a7, float:6.2857572E10)
            if (r4 == r0) goto L_0x004b
            goto L_0x0086
        L_0x004b:
            java.lang.String r4 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0086
            goto L_0x0075
        L_0x0054:
            java.lang.String r4 = "android.permission.CAMERA"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0086
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r4 = r3.bridgeCallback
            if (r4 != 0) goto L_0x0063
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0063:
            java.lang.String r0 = "ERR_CAMERA_PERMISSION_NOT_GRANTED"
            com.alibaba.fastjson.JSONObject r0 = id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge.getMin.setMax(r0)
            r4.sendJSONResponse(r0)
            return
        L_0x006d:
            java.lang.String r4 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x0086
        L_0x0075:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r4 = r3.bridgeCallback
            if (r4 != 0) goto L_0x007c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x007c:
            java.lang.String r0 = "ERR_GALLERY_PERMISSION_NOT_GRANTED"
            com.alibaba.fastjson.JSONObject r0 = id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge.getMin.setMax(r0)
            r4.sendJSONResponse(r0)
            return
        L_0x0086:
            r3.pickImage()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge.onReceivePermissionResult(id.dana.lib.gcontainer.app.bridge.core.BaseBridge$getMin):void");
    }

    public final void onReceiveActivityResult(@NotNull BaseBridge.setMin setmin) {
        setClipboard setclipboard;
        Intrinsics.checkNotNullParameter(setmin, "event");
        if (setmin.getMax == 203 && setmin.getMin == -1 && (setclipboard = this.handPicked) != null) {
            Intent intent = setmin.length;
            ImagePickerEntity imagePickerEntity = this.imageEntity;
            if (imagePickerEntity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageEntity");
            }
            BridgeCallback bridgeCallback2 = this.bridgeCallback;
            if (bridgeCallback2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bridgeCallback");
            }
            setclipboard.getMax(intent, imagePickerEntity, bridgeCallback2);
        }
    }
}
