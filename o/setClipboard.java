package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.MediaStore;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.content.FileProvider;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerBridge;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEntity;
import id.dana.util.media.MimeType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ \u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00162\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\n\u0010 \u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020#H\u0003J \u0010$\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006-"}, d2 = {"Lid/dana/lib/gcontainer/util/handpicked/HandPicked;", "", "activity", "Landroid/app/Activity;", "dialogTitle", "", "hasCameraPermission", "", "hasStoragePermission", "(Landroid/app/Activity;Ljava/lang/String;ZZ)V", "photoUri", "Landroid/net/Uri;", "providerAuthority", "getProviderAuthority", "()Ljava/lang/String;", "appendIntentList", "", "intents", "", "Landroid/content/Intent;", "addedIntent", "compressAndRotateImage", "Lio/reactivex/Observable;", "imageUri", "imageSpec", "Lid/dana/lib/gcontainer/app/bridge/imagepicker/ImagePickerEntity;", "compressImage", "", "angle", "", "convertToBase64String", "byteArray", "createCameraIntent", "createGalleryIntent", "createImageFile", "Ljava/io/File;", "onActivityResult", "data", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "pick", "requestCode", "", "rotateImage", "Companion", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class setClipboard {
    private static int FastBitmap$CoordinateSystem = 0;
    private static int IsOverlapping = 0;
    private static final String isInside;
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);
    private static int toDoubleRange = 1;
    private static int toFloatRange;
    private static int toIntRange;
    private static short[] toString;
    private static byte[] values;
    private Uri equals;
    public final boolean getMax;
    public final boolean getMin;
    public final Activity length;
    public final String setMax;

    static void getMin() {
        IsOverlapping = 717046733;
        toIntRange = 1474129170;
        values = new byte[]{-116, 42, 70, 83, 94};
        toFloatRange = 121;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0015\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\t¨\u0006\n¸\u0006\u0000"}, d2 = {"id/dana/lib/gcontainer/extension/RxJavaExtKt$subscribeWithAutoDispose$1", "Lio/reactivex/observers/DisposableObserver;", "onComplete", "", "onError", "e", "", "onNext", "t", "(Ljava/lang/Object;)V", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax extends setGlobalUserData<String> {
        final /* synthetic */ BridgeCallback length;
        final /* synthetic */ BridgeCallback setMax;

        public setMax(BridgeCallback bridgeCallback, BridgeCallback bridgeCallback2) {
            this.setMax = bridgeCallback;
            this.length = bridgeCallback2;
        }

        public final void onComplete() {
            dispose();
        }

        public final void onNext(String str) {
            BridgeCallback bridgeCallback = this.setMax;
            JSONObject jSONObject = new JSONObject();
            Map map = jSONObject;
            map.put("success", Boolean.TRUE);
            map.put("data", str);
            Unit unit = Unit.INSTANCE;
            bridgeCallback.sendJSONResponse(jSONObject);
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            String str = th instanceof FileNotFoundException ? "007" : "001";
            String max = setClipboard.setMax();
            if (!TextUtils.isEmpty(max)) {
                if (LogCustomizeControl.getMin() > 0) {
                    LogCustomizeControl.length(max).getMin(th);
                }
                LoggerWrapper.w(max, th);
            }
            BridgeCallback bridgeCallback = this.length;
            ImagePickerBridge.getMin getmin = ImagePickerBridge.Companion;
            bridgeCallback.sendJSONResponse(ImagePickerBridge.getMin.setMax(str));
            dispose();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "angle", "", "apply", "(Ljava/lang/Float;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Float, TitleBarRightButtonView.AnonymousClass4<? extends byte[]>> {
        final /* synthetic */ setClipboard getMax;
        final /* synthetic */ ImagePickerEntity length;
        final /* synthetic */ Uri setMin;

        getMin(setClipboard setclipboard, Uri uri, ImagePickerEntity imagePickerEntity) {
            this.getMax = setclipboard;
            this.setMin = uri;
            this.length = imagePickerEntity;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Float f = (Float) obj;
            Intrinsics.checkNotNullParameter(f, "angle");
            return setClipboard.setMax(this.getMax, f.floatValue(), this.setMin, this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<byte[], TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ setClipboard setMin;

        setMin(setClipboard setclipboard) {
            this.setMin = setclipboard;
        }

        public final /* synthetic */ Object apply(Object obj) {
            byte[] bArr = (byte[]) obj;
            Intrinsics.checkNotNullParameter(bArr, "it");
            return setClipboard.setMin(bArr);
        }
    }

    public setClipboard(@NotNull Activity activity, @Nullable String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        this.length = activity;
        this.setMax = str;
        this.getMax = z;
        this.getMin = z2;
    }

    public static final /* synthetic */ float length(setClipboard setclipboard, Uri uri) {
        int i = FastBitmap$CoordinateSystem + 85;
        toDoubleRange = i % 128;
        int i2 = i % 2;
        float min = setclipboard.setMin(uri);
        try {
            int i3 = FastBitmap$CoordinateSystem + 41;
            toDoubleRange = i3 % 128;
            int i4 = i3 % 2;
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    public static final /* synthetic */ String setMax() {
        String str;
        int i = toDoubleRange + 79;
        FastBitmap$CoordinateSystem = i % 128;
        boolean z = false;
        if ((i % 2 != 0 ? 'X' : 'c') != 'c') {
            str = isInside;
            int i2 = 63 / 0;
        } else {
            str = isInside;
        }
        int i3 = FastBitmap$CoordinateSystem + 65;
        toDoubleRange = i3 % 128;
        if (i3 % 2 == 0) {
            z = true;
        }
        if (!z) {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMax(setClipboard setclipboard, float f, Uri uri, ImagePickerEntity imagePickerEntity) {
        try {
            int i = toDoubleRange + 47;
            FastBitmap$CoordinateSystem = i % 128;
            boolean z = i % 2 == 0;
            TitleBarRightButtonView.AnonymousClass1<byte[]> min = setclipboard.getMin(f, uri, imagePickerEntity);
            if (!z) {
                int i2 = 1 / 0;
            }
            return min;
        } catch (Exception e) {
            throw e;
        }
    }

    public static Intent setMin() {
        try {
            try {
                Intent type = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI).setType(MimeType.IMAGE_ALL);
                Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…     .setType(IMAGE_TYPE)");
                int i = FastBitmap$CoordinateSystem + 87;
                toDoubleRange = i % 128;
                int i2 = i % 2;
                return type;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final Intent length() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (DatePickerBridgeExtension.AnonymousClass8.length(intent, this.length)) {
            try {
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                StringBuilder sb = new StringBuilder("JPEG_");
                sb.append(format);
                sb.append("_");
                File createTempFile = File.createTempFile(sb.toString(), ".jpg", setLeftSelectedIndex.length((Context) this.length));
                Intrinsics.checkNotNullExpressionValue(createTempFile, "File.createTempFile(imag…Name, \".jpg\", storageDir)");
                try {
                    int i = FastBitmap$CoordinateSystem + 43;
                    try {
                        toDoubleRange = i % 128;
                        int i2 = i % 2;
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.length.getPackageName());
                            sb2.append(".provider");
                            this.equals = FileProvider.getUriForFile(this.length, sb2.toString(), createTempFile);
                            return intent.putExtra("return-date", true).putExtra(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, this.equals);
                        } catch (Exception e) {
                            LocationBridgeExtension.setMin(isInside, "createCameraIntent", (Throwable) e);
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            } catch (IOException e4) {
                LocationBridgeExtension.setMin(isInside, "createCameraIntent", (Throwable) e4);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0024, code lost:
        if (r3 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMax(@org.jetbrains.annotations.Nullable android.content.Intent r3, @org.jetbrains.annotations.NotNull id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEntity r4, @org.jetbrains.annotations.NotNull com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r5) {
        /*
            r2 = this;
            int r0 = FastBitmap$CoordinateSystem
            int r0 = r0 + 83
            int r1 = r0 % 128
            toDoubleRange = r1
            int r0 = r0 % 2
            java.lang.String r0 = "imageSpec"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "bridgeCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r3 == 0) goto L_0x0026
            int r0 = toDoubleRange
            int r0 = r0 + 105
            int r1 = r0 % 128
            FastBitmap$CoordinateSystem = r1
            int r0 = r0 % 2
            android.net.Uri r3 = r3.getData()
            if (r3 != 0) goto L_0x0028
        L_0x0026:
            android.net.Uri r3 = r2.equals
        L_0x0028:
            r0 = 73
            if (r3 != 0) goto L_0x002f
            r1 = 40
            goto L_0x0031
        L_0x002f:
            r1 = 73
        L_0x0031:
            if (r1 == r0) goto L_0x004f
            int r3 = toDoubleRange
            int r3 = r3 + 75
            int r4 = r3 % 128
            FastBitmap$CoordinateSystem = r4
            int r3 = r3 % 2
            r4 = 67
            if (r3 == 0) goto L_0x0044
            r3 = 67
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            if (r3 == r4) goto L_0x0048
            goto L_0x004c
        L_0x0048:
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x004d }
        L_0x004c:
            return
        L_0x004d:
            r3 = move-exception
            throw r3
        L_0x004f:
            o.setClipboard$length r0 = new o.setClipboard$length
            r0.<init>(r2, r3)
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0
            o.TitleBarRightButtonView$1 r0 = o.TitleBarRightButtonView.AnonymousClass1.fromCallable(r0)
            o.setClipboard$getMin r1 = new o.setClipboard$getMin
            r1.<init>(r2, r3, r4)
            o.RedDotDrawable r1 = (o.RedDotDrawable) r1
            o.TitleBarRightButtonView$1 r3 = r0.flatMap(r1)
            o.setClipboard$setMin r4 = new o.setClipboard$setMin
            r4.<init>(r2)
            o.RedDotDrawable r4 = (o.RedDotDrawable) r4
            o.TitleBarRightButtonView$1 r3 = r3.flatMap(r4)
            o.hasCornerMarking r4 = o.getSecureSignatureComp.length()
            o.TitleBarRightButtonView$1 r3 = r3.observeOn(r4)
            o.hasCornerMarking r4 = o.getSecureSignatureComp.setMin()
            o.TitleBarRightButtonView$1 r3 = r3.subscribeOn(r4)
            java.lang.String r4 = "Observable.fromCallable …scribeOn(Schedulers.io())"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            o.setClipboard$setMax r4 = new o.setClipboard$setMax
            r4.<init>(r5, r5)
            o.GriverProgressBar r4 = (o.GriverProgressBar) r4
            r3.subscribe(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setClipboard.getMax(android.content.Intent, id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEntity, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005a, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float setMin(android.net.Uri r5) {
        /*
            r4 = this;
            int r0 = FastBitmap$CoordinateSystem
            int r0 = r0 + 75
            int r1 = r0 % 128
            toDoubleRange = r1
            int r0 = r0 % 2
            android.app.Activity r0 = r4.length     // Catch:{ Exception -> 0x005e }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ Exception -> 0x005e }
            java.io.InputStream r0 = o.ClipboardBridgeExtension.getMin(r5, r0)     // Catch:{ Exception -> 0x005e }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x005e }
            r1 = r0
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ all -> 0x0057 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0057 }
            r3 = 24
            if (r2 < r3) goto L_0x0023
            android.media.ExifInterface r5 = new android.media.ExifInterface     // Catch:{ all -> 0x0057 }
            r5.<init>(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x002d
        L_0x0023:
            android.media.ExifInterface r1 = new android.media.ExifInterface     // Catch:{ all -> 0x0057 }
            java.lang.String r5 = r5.getPath()     // Catch:{ all -> 0x0057 }
            r1.<init>(r5)     // Catch:{ all -> 0x0057 }
            r5 = r1
        L_0x002d:
            java.lang.String r1 = "Orientation"
            r2 = 1
            int r5 = r5.getAttributeInt(r1, r2)     // Catch:{ all -> 0x0057 }
            r1 = 3
            if (r5 == r1) goto L_0x0050
            r1 = 6
            if (r5 == r1) goto L_0x004d
            r1 = 8
            if (r5 == r1) goto L_0x004a
            r5 = 0
            int r1 = toDoubleRange
            int r1 = r1 + 55
            int r2 = r1 % 128
            FastBitmap$CoordinateSystem = r2
            int r1 = r1 % 2
            goto L_0x0052
        L_0x004a:
            r5 = 1132920832(0x43870000, float:270.0)
            goto L_0x0052
        L_0x004d:
            r5 = 1119092736(0x42b40000, float:90.0)
            goto L_0x0052
        L_0x0050:
            r5 = 1127481344(0x43340000, float:180.0)
        L_0x0052:
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)     // Catch:{ Exception -> 0x005e }
            return r5
        L_0x0057:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r5)
            throw r1
        L_0x005e:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setClipboard.setMin(android.net.Uri):float");
    }

    private final TitleBarRightButtonView.AnonymousClass1<byte[]> getMin(float f, Uri uri, ImagePickerEntity imagePickerEntity) {
        ByteArrayOutputStream byteArrayOutputStream;
        int width;
        int i;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(ClipboardBridgeExtension.getMin(uri, this.length));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Matrix matrix = new Matrix();
                matrix.postRotate(f);
                boolean z = false;
                if ((imagePickerEntity.getWidth() > 0 ? '0' : 'H') != '0') {
                    Intrinsics.checkNotNullExpressionValue(decodeStream, "bitmap");
                    width = decodeStream.getWidth();
                } else {
                    int i2 = FastBitmap$CoordinateSystem + 33;
                    toDoubleRange = i2 % 128;
                    if (i2 % 2 == 0) {
                        width = imagePickerEntity.getWidth();
                        int i3 = 23 / 0;
                    } else {
                        width = imagePickerEntity.getWidth();
                    }
                }
                int i4 = width;
                if ((imagePickerEntity.getHeight() > 0 ? 'R' : '0') != '0') {
                    i = imagePickerEntity.getHeight();
                    int i5 = toDoubleRange + 47;
                    FastBitmap$CoordinateSystem = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    Intrinsics.checkNotNullExpressionValue(decodeStream, "bitmap");
                    i = decodeStream.getHeight();
                }
                decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, i4, i, matrix, true);
                decodeStream.compress(Bitmap.CompressFormat.JPEG, imagePickerEntity.getQualityLevel(), byteArrayOutputStream);
                TitleBarRightButtonView.AnonymousClass1<byte[]> just = TitleBarRightButtonView.AnonymousClass1.just(byteArrayOutputStream.toByteArray());
                decodeStream.recycle();
                byteArrayOutputStream.close();
                Intrinsics.checkNotNullExpressionValue(just, "try {\n                Ob…put.close()\n            }");
                if (decodeStream == null) {
                    z = true;
                }
                if (!z) {
                    decodeStream.recycle();
                }
                return just;
            } catch (Throwable th) {
                if (decodeStream == null) {
                    int i7 = toDoubleRange + 49;
                    FastBitmap$CoordinateSystem = i7 % 128;
                    int i8 = i7 % 2;
                } else {
                    decodeStream.recycle();
                }
                throw th;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/lib/gcontainer/util/handpicked/HandPicked$Companion;", "", "()V", "IMAGE_TYPE", "", "PROVIDER_SUFFIX", "TAG", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    static {
        getMin();
        String simpleName = setClipboard.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "HandPicked::class.java.simpleName");
        isInside = simpleName;
        int i = toDoubleRange + 41;
        FastBitmap$CoordinateSystem = i % 128;
        if ((i % 2 != 0 ? '8' : '/') == '8') {
            Object obj = null;
            super.hashCode();
        }
    }

    public final void getMax(List<Intent> list, Intent intent) {
        int i = toDoubleRange + 35;
        FastBitmap$CoordinateSystem = i % 128;
        int i2 = i % 2;
        if (intent != null) {
            try {
                int i3 = FastBitmap$CoordinateSystem + 27;
                toDoubleRange = i3 % 128;
                List<ResolveInfo> queryIntentActivities = (i3 % 2 == 0 ? 'X' : 'K') != 'X' ? this.length.getPackageManager().queryIntentActivities(intent, 0) : this.length.getPackageManager().queryIntentActivities(intent, 1);
                Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "activity.packageManager.…ctivities(addedIntent, 0)");
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent(intent).setPackage(resolveInfo.activityInfo.packageName);
                    Intrinsics.checkNotNullExpressionValue(intent2, "Intent(addedIntent)\n    …activityInfo.packageName)");
                    list.add(intent2);
                }
            } catch (Exception e) {
                throw e;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Float;"}, k = 3, mv = {1, 4, 2})
    static final class length<V> implements Callable<Float> {
        final /* synthetic */ setClipboard length;
        final /* synthetic */ Uri setMax;

        length(setClipboard setclipboard, Uri uri) {
            this.length = setclipboard;
            this.setMax = uri;
        }

        public final /* synthetic */ Object call() {
            return Float.valueOf(setClipboard.length(this.length, this.setMax));
        }
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(byte[] bArr) {
        byte[] encode = Base64.encode(bArr, 0);
        Intrinsics.checkNotNullExpressionValue(encode, "encodedBytes");
        Charset forName = Charset.forName(setMin(TextUtils.getCapsMode("", 0, 0) - 122, (byte) (97 - (ViewConfiguration.getTapTimeout() >> 16)), PhoneNumberUtils.toaFromString("") - 1474129299, -717046648 - ExpandableListView.getPackedPositionGroup(0), (short) (64 - TextUtils.indexOf("", "", 0))).intern());
        Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(\"UTF-8\")");
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(new String(encode, forName));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(String(e…harset.forName(\"UTF-8\")))");
        try {
            int i = FastBitmap$CoordinateSystem + 53;
            try {
                toDoubleRange = i % 128;
                int i2 = i % 2;
                return just;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r7 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        if (values != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r7 = (short) (toString[toIntRange + r9] + toFloatRange);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r5 = toDoubleRange + 105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        FastBitmap$CoordinateSystem = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0050, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r2 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0071, code lost:
        if (r2 != false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a9, code lost:
        if ((r1 != null ? kotlin.text.Typography.dollar : '-') != '-') goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00b9, code lost:
        if ((values != null ? ']' : 25) != ']') goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c9, code lost:
        r2 = r9 - 1;
        r9 = (byte) (values[r9] + r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, byte r8, int r9, int r10, short r11) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = toFloatRange
            int r7 = r7 + r1
            r1 = 0
            r2 = -1
            r3 = 1
            if (r7 != r2) goto L_0x000f
            r2 = 1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            r4 = 0
            if (r2 == 0) goto L_0x0053
            int r7 = FastBitmap$CoordinateSystem     // Catch:{ Exception -> 0x0051 }
            int r7 = r7 + 3
            int r5 = r7 % 128
            toDoubleRange = r5     // Catch:{ Exception -> 0x0051 }
            int r7 = r7 % 2
            if (r7 != 0) goto L_0x0029
            byte[] r7 = values
            super.hashCode()     // Catch:{ all -> 0x0027 }
            if (r7 == 0) goto L_0x0039
            goto L_0x002d
        L_0x0027:
            r7 = move-exception
            throw r7
        L_0x0029:
            byte[] r7 = values     // Catch:{ Exception -> 0x0051 }
            if (r7 == 0) goto L_0x0039
        L_0x002d:
            byte[] r7 = values
            int r5 = toIntRange
            int r5 = r5 + r9
            byte r7 = r7[r5]
            int r5 = toFloatRange
            int r7 = r7 + r5
            byte r7 = (byte) r7
            goto L_0x0053
        L_0x0039:
            short[] r7 = toString
            int r5 = toIntRange
            int r5 = r5 + r9
            short r7 = r7[r5]
            int r5 = toFloatRange
            int r7 = r7 + r5
            short r7 = (short) r7
            int r5 = toDoubleRange     // Catch:{ Exception -> 0x004f }
            int r5 = r5 + 105
            int r6 = r5 % 128
            FastBitmap$CoordinateSystem = r6     // Catch:{ Exception -> 0x0051 }
            int r5 = r5 % 2
            goto L_0x0053
        L_0x004f:
            r7 = move-exception
            throw r7
        L_0x0051:
            r7 = move-exception
            throw r7
        L_0x0053:
            if (r7 <= 0) goto L_0x00d8
            int r5 = FastBitmap$CoordinateSystem
            int r5 = r5 + 59
            int r6 = r5 % 128
            toDoubleRange = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x006b
            int r9 = r9 * r7
            int r9 = r9 % 3
            int r5 = toIntRange
            int r9 = r9 - r5
            if (r2 == 0) goto L_0x0074
            goto L_0x0073
        L_0x006b:
            int r9 = r9 + r7
            int r9 = r9 + -2
            int r5 = toIntRange
            int r9 = r9 + r5
            if (r2 == 0) goto L_0x0074
        L_0x0073:
            r1 = 1
        L_0x0074:
            int r9 = r9 + r1
            int r1 = IsOverlapping
            int r10 = r10 + r1
            char r10 = (char) r10
            r0.append(r10)
            int r1 = FastBitmap$CoordinateSystem
            int r1 = r1 + 59
            int r2 = r1 % 128
            toDoubleRange = r2
            int r1 = r1 % 2
        L_0x0086:
            r1 = 30
            if (r3 >= r7) goto L_0x008d
            r2 = 91
            goto L_0x008f
        L_0x008d:
            r2 = 30
        L_0x008f:
            if (r2 == r1) goto L_0x00d8
            int r1 = toDoubleRange
            int r1 = r1 + 61
            int r2 = r1 % 128
            FastBitmap$CoordinateSystem = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x00ae
            byte[] r1 = values
            int r2 = r4.length     // Catch:{ all -> 0x00ac }
            r2 = 45
            if (r1 == 0) goto L_0x00a7
            r1 = 36
            goto L_0x00a9
        L_0x00a7:
            r1 = 45
        L_0x00a9:
            if (r1 == r2) goto L_0x00bb
            goto L_0x00c9
        L_0x00ac:
            r7 = move-exception
            throw r7
        L_0x00ae:
            byte[] r1 = values
            r2 = 93
            if (r1 == 0) goto L_0x00b7
            r1 = 93
            goto L_0x00b9
        L_0x00b7:
            r1 = 25
        L_0x00b9:
            if (r1 == r2) goto L_0x00c9
        L_0x00bb:
            short[] r1 = toString
            int r2 = r9 + -1
            short r9 = r1[r9]
            int r9 = r9 + r11
            short r9 = (short) r9
        L_0x00c3:
            r9 = r9 ^ r8
            int r10 = r10 + r9
            char r9 = (char) r10
            r10 = r9
            r9 = r2
            goto L_0x00d2
        L_0x00c9:
            byte[] r1 = values
            int r2 = r9 + -1
            byte r9 = r1[r9]
            int r9 = r9 + r11
            byte r9 = (byte) r9
            goto L_0x00c3
        L_0x00d2:
            r0.append(r10)
            int r3 = r3 + 1
            goto L_0x0086
        L_0x00d8:
            java.lang.String r7 = r0.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setClipboard.setMin(int, byte, int, int, short):java.lang.String");
    }
}
