package com.alibaba.griver.core.ui.activity;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AndroidVersionUtils;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.core.R;
import com.alibaba.griver.file.jsapi.ChooseFileBridgeExtension;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.restorePresenterStates;

public class GriverFileChooserActivity extends GriverBaseFragmentActivity {
    public static final int FILE_CHOOSER_REQUEST_CODE = 1;
    public static final String TAG = "GriverFileChooserActivity";
    public static final byte[] getMin = {115, 122, 83, 7, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f10364a;
    String[] acceptType;
    private Uri b;
    String capture;
    boolean multiple;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r6, byte r7, int r8) {
        /*
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r8 = r8 + 4
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r0 = getMin
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L_0x0016
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x002f
        L_0x0016:
            r3 = 0
        L_0x0017:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L_0x0024
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0024:
            int r8 = r8 + 1
            byte r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverFileChooserActivity.getMax(short, byte, int):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMin;
        String max2 = getMax((byte) setMax, (byte) bArr[8], (short) bArr[85]);
        String max3 = getMax((byte) getMin[8], (byte) setMax, 174);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(-1823437544, oncanceled);
            onCancelLoad.getMin(-1823437544, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1823437544 == (max = dispatchOnCancelled.getMax(applicationContext2, -1823437544)))) {
            onCanceled oncanceled2 = new onCanceled(-1823437544, max, 512);
            onCancelLoad.setMax(-1823437544, oncanceled2);
            onCancelLoad.getMin(-1823437544, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1823437544, oncanceled3);
            onCancelLoad.getMin(-1823437544, oncanceled3);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.acceptType = intent.getStringArrayExtra("acceptType");
        this.capture = intent.getStringExtra("capture");
        this.multiple = intent.getBooleanExtra("multiple", false);
        try {
            b();
        } catch (Exception e) {
            GriverLogger.e(TAG, "choose file failed", e);
        }
    }

    private boolean a() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(786796400, oncanceled);
            onCancelLoad.getMin(786796400, oncanceled);
        }
        String[] strArr = this.acceptType;
        if (strArr == null || strArr.length == 0) {
            return true;
        }
        for (String str : strArr) {
            if (TextUtils.equals(str, "*/*") || str.contains(H5ResourceHandlerUtil.IMAGE) || str.contains("video")) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        boolean z = !TextUtils.isEmpty(this.capture) && a();
        if (PermissionUtils.hasPermission("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE") || !z) {
            GriverLogger.d(TAG, "get CAMERA permission success!");
            try {
                startActivityForResult(a((Context) this), 1);
            } catch (Exception e) {
                GriverLogger.e(TAG, "exception detail", e);
            }
        } else {
            PermissionUtils.requestPermissions(new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, 1, new IPermissionRequestCallback() {
                public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                    if (PermissionUtils.positivePermissionsResult(iArr)) {
                        GriverLogger.d(GriverFileChooserActivity.TAG, "get CAMERA permission success!");
                        try {
                            GriverFileChooserActivity.this.startActivityForResult(GriverFileChooserActivity.this.a((Context) GriverFileChooserActivity.this), 1);
                        } catch (Exception e) {
                            GriverLogger.e(GriverFileChooserActivity.TAG, "exception detail", e);
                        }
                    } else {
                        GriverFileChooserActivity.this.showDeniedForCamera();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void showDeniedForCamera() {
        Intent intent = new Intent();
        intent.setAction("FILE_CHOOSER_RESULT");
        intent.putExtra(ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY, Uri.parse(""));
        Context applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = getApplicationContext();
        }
        if (applicationContext != null) {
            restorePresenterStates.length(applicationContext).getMax(intent);
        }
        finish();
    }

    /* access modifiers changed from: private */
    public Intent a(Context context) {
        Intent intent;
        if (TextUtils.isEmpty(this.capture)) {
            intent = a(context, new Intent[0]);
        } else {
            intent = a(context, g());
        }
        intent.putExtra("android.intent.extra.INTENT", c());
        return intent;
    }

    private Intent c() {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 19) {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
        }
        intent.addCategory("android.intent.category.OPENABLE");
        String[] strArr = this.acceptType;
        String str = "*/*";
        if (strArr != null && strArr.length > 0) {
            String str2 = "";
            for (String str3 : strArr) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str3);
                    sb.append("|");
                    str2 = sb.toString();
                }
            }
            if (!TextUtils.isEmpty(str2) && str2.length() > 0) {
                str = str2.substring(0, str2.length() - 1);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                String[] strArr2 = this.acceptType;
                if (strArr2.length > 1) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", strArr2);
                }
            }
        }
        if (this.multiple && Build.VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.setType(str);
        return intent;
    }

    private Intent a(Context context, Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        intent.putExtra("android.intent.extra.TITLE", context.getString(R.string.griver_core_file_chooser));
        return intent;
    }

    private Intent d() {
        Uri uri;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (AndroidVersionUtils.isQAndAbove()) {
            ContentResolver contentResolver = GriverEnv.getApplicationContext().getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("mime_type", "image/jpeg");
            contentValues.put("relative_path", "DCIM/browser-photos");
            uri = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            this.b = uri;
            GriverLogger.d(TAG, "choose file from camera, file uri: ".concat(String.valueOf(uri)));
        } else {
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
            StringBuilder sb = new StringBuilder();
            sb.append(externalStoragePublicDirectory.getAbsolutePath());
            sb.append(File.separator);
            sb.append("browser-photos");
            File file = new File(sb.toString());
            file.mkdirs();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.getAbsolutePath());
            sb2.append(File.separator);
            sb2.append(System.currentTimeMillis());
            sb2.append(".jpg");
            this.f10364a = sb2.toString();
            uri = Uri.fromFile(new File(this.f10364a));
        }
        intent.putExtra(TinyAppLogUtil.TINY_APP_STANDARD_OUTPUT, uri);
        return intent;
    }

    private Intent e() {
        return new Intent("android.media.action.VIDEO_CAPTURE");
    }

    private Intent f() {
        return new Intent("android.provider.MediaStore.RECORD_SOUND");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.Intent[] g() {
        /*
            r10 = this;
            android.content.Context r0 = r10.getBaseContext()
            if (r0 == 0) goto L_0x000b
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0024
            r1 = -487991592(0xffffffffe2e9d6d8, float:-2.1567862E21)
            int r0 = o.dispatchOnCancelled.getMax(r0, r1)
            if (r1 == r0) goto L_0x0024
            o.onCanceled r2 = new o.onCanceled
            r3 = 512(0x200, float:7.175E-43)
            r2.<init>(r1, r0, r3)
            o.onCancelLoad.setMax(r1, r2)
            o.onCancelLoad.getMin(r1, r2)
        L_0x0024:
            java.lang.String[] r0 = r10.acceptType
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0068
            int r3 = r0.length
            if (r3 != 0) goto L_0x002e
            goto L_0x0068
        L_0x002e:
            int r3 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0033:
            if (r4 >= r3) goto L_0x0066
            r8 = r0[r4]
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0063
            java.lang.String r9 = "*/*"
            boolean r9 = android.text.TextUtils.equals(r8, r9)
            if (r9 == 0) goto L_0x0046
            goto L_0x0068
        L_0x0046:
            java.lang.String r9 = "image"
            boolean r9 = r8.contains(r9)
            if (r9 == 0) goto L_0x0050
            r5 = 1
            goto L_0x0063
        L_0x0050:
            java.lang.String r9 = "video"
            boolean r9 = r8.contains(r9)
            if (r9 == 0) goto L_0x005a
            r6 = 1
            goto L_0x0063
        L_0x005a:
            java.lang.String r9 = "audio"
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x0063
            r7 = 1
        L_0x0063:
            int r4 = r4 + 1
            goto L_0x0033
        L_0x0066:
            r2 = r5
            goto L_0x006a
        L_0x0068:
            r6 = 1
            r7 = 1
        L_0x006a:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            if (r2 == 0) goto L_0x0078
            android.content.Intent r2 = r10.d()
            r0.add(r2)
        L_0x0078:
            if (r6 == 0) goto L_0x0081
            android.content.Intent r2 = r10.e()
            r0.add(r2)
        L_0x0081:
            if (r7 == 0) goto L_0x008a
            android.content.Intent r2 = r10.f()
            r0.add(r2)
        L_0x008a:
            android.content.Intent[] r1 = new android.content.Intent[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverFileChooserActivity.g():android.content.Intent[]");
    }

    public void onDestroy() {
        GriverLogger.d(TAG, "EditAvatarModActivity onDestroy");
        super.onDestroy();
    }

    private void h() {
        if (AndroidVersionUtils.isQAndAbove() && this.b != null) {
            try {
                getContentResolver().openInputStream(this.b);
            } catch (FileNotFoundException unused) {
                GriverLogger.w(TAG, "Camera file not exist, delete temp file");
                getContentResolver().delete(this.b, (String) null, (String[]) null);
                this.b = null;
            } catch (Exception e) {
                GriverLogger.w(TAG, "read file exception", e);
                getContentResolver().delete(this.b, (String) null, (String[]) null);
                this.b = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ Exception -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0075 A[Catch:{ Exception -> 0x00cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            r5.h()
            r0 = -1
            java.lang.String r1 = "GriverFileChooserActivity"
            r2 = 0
            if (r7 != r0) goto L_0x00c9
            r7 = 1
            if (r6 == r7) goto L_0x000e
            goto L_0x00c9
        L_0x000e:
            if (r8 != 0) goto L_0x0012
            r6 = r2
            goto L_0x0016
        L_0x0012:
            android.net.Uri r6 = r8.getData()     // Catch:{ Exception -> 0x00cd }
        L_0x0016:
            java.lang.String r0 = "result: "
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00cd }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x00cd }
            com.alibaba.griver.base.common.logger.GriverLogger.d(r1, r0)     // Catch:{ Exception -> 0x00cd }
            r0 = 0
            if (r6 == 0) goto L_0x0038
            boolean r8 = com.alibaba.griver.base.common.utils.AndroidVersionUtils.isRAndAbove()     // Catch:{ Exception -> 0x00cd }
            if (r8 == 0) goto L_0x0030
            android.net.Uri r6 = r5.a((android.net.Uri) r6)     // Catch:{ Exception -> 0x00cd }
        L_0x0030:
            android.net.Uri[] r7 = new android.net.Uri[r7]     // Catch:{ Exception -> 0x00cd }
            r7[r0] = r6     // Catch:{ Exception -> 0x00cd }
            r5.a((android.net.Uri[]) r7)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x0038:
            boolean r3 = com.alibaba.griver.base.common.utils.AndroidVersionUtils.isQAndAbove()     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x004e
            android.net.Uri r6 = r5.b     // Catch:{ Exception -> 0x00cd }
            if (r6 == 0) goto L_0x007d
            android.net.Uri[] r6 = new android.net.Uri[r7]     // Catch:{ Exception -> 0x00cd }
            android.net.Uri r7 = r5.b     // Catch:{ Exception -> 0x00cd }
            r6[r0] = r7     // Catch:{ Exception -> 0x00cd }
            r5.a((android.net.Uri[]) r6)     // Catch:{ Exception -> 0x00cd }
            r5.b = r2     // Catch:{ Exception -> 0x00cd }
            return
        L_0x004e:
            java.lang.String r3 = r5.f10364a     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x0061
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = r5.f10364a     // Catch:{ Exception -> 0x00cd }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00cd }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00cd }
            if (r4 == 0) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0061:
            r3 = r2
        L_0x0062:
            r4 = 0
        L_0x0063:
            if (r4 == 0) goto L_0x0073
            android.net.Uri r6 = android.net.Uri.fromFile(r3)     // Catch:{ Exception -> 0x00cd }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ Exception -> 0x00cd }
            java.lang.String r4 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x00cd }
            r5.sendBroadcast(r3)     // Catch:{ Exception -> 0x00cd }
        L_0x0073:
            if (r6 == 0) goto L_0x007d
            android.net.Uri[] r7 = new android.net.Uri[r7]     // Catch:{ Exception -> 0x00cd }
            r7[r0] = r6     // Catch:{ Exception -> 0x00cd }
            r5.a((android.net.Uri[]) r7)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x007d:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00cd }
            r7 = 16
            if (r6 < r7) goto L_0x00c5
            if (r8 == 0) goto L_0x00c5
            android.content.ClipData r6 = r8.getClipData()     // Catch:{ Exception -> 0x00cd }
            if (r6 == 0) goto L_0x00c5
            android.content.ClipData r6 = r8.getClipData()     // Catch:{ Exception -> 0x00cd }
            int r6 = r6.getItemCount()     // Catch:{ Exception -> 0x00cd }
            android.net.Uri[] r7 = new android.net.Uri[r6]     // Catch:{ Exception -> 0x00cd }
        L_0x0095:
            if (r0 >= r6) goto L_0x00c1
            boolean r3 = com.alibaba.griver.base.common.utils.AndroidVersionUtils.isRAndAbove()     // Catch:{ Exception -> 0x00cd }
            if (r3 == 0) goto L_0x00b0
            android.content.ClipData r3 = r8.getClipData()     // Catch:{ Exception -> 0x00cd }
            android.content.ClipData$Item r3 = r3.getItemAt(r0)     // Catch:{ Exception -> 0x00cd }
            android.net.Uri r3 = r3.getUri()     // Catch:{ Exception -> 0x00cd }
            android.net.Uri r3 = r5.a((android.net.Uri) r3)     // Catch:{ Exception -> 0x00cd }
            r7[r0] = r3     // Catch:{ Exception -> 0x00cd }
            goto L_0x00be
        L_0x00b0:
            android.content.ClipData r3 = r8.getClipData()     // Catch:{ Exception -> 0x00cd }
            android.content.ClipData$Item r3 = r3.getItemAt(r0)     // Catch:{ Exception -> 0x00cd }
            android.net.Uri r3 = r3.getUri()     // Catch:{ Exception -> 0x00cd }
            r7[r0] = r3     // Catch:{ Exception -> 0x00cd }
        L_0x00be:
            int r0 = r0 + 1
            goto L_0x0095
        L_0x00c1:
            r5.a((android.net.Uri[]) r7)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x00c5:
            r5.a((android.net.Uri[]) r2)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x00c9:
            r5.a((android.net.Uri[]) r2)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x00cd:
            r6 = move-exception
            java.lang.String r7 = "handle result failed"
            com.alibaba.griver.base.common.logger.GriverLogger.e(r1, r7, r6)
            r5.a((android.net.Uri[]) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverFileChooserActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    private Uri a(Uri uri) {
        String decode = Uri.decode(uri.toString());
        if (!decode.startsWith("content://com.android.providers.media.documents/document/image")) {
            return uri;
        }
        Uri parse = Uri.parse("content://media/external/images/media/".concat(String.valueOf(decode.substring(decode.lastIndexOf(":") + 1))));
        GriverLogger.d(TAG, "new result: ".concat(String.valueOf(parse)));
        return parse;
    }

    private void a(Uri[] uriArr) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-806041952, oncanceled);
            onCancelLoad.getMin(-806041952, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-806041952, oncanceled2);
            onCancelLoad.getMin(-806041952, oncanceled2);
        }
        Intent intent = new Intent();
        intent.setAction("FILE_CHOOSER_RESULT");
        intent.putExtra(ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY, uriArr);
        Context applicationContext2 = GriverEnv.getApplicationContext();
        if (applicationContext2 == null) {
            applicationContext2 = getApplicationContext();
        }
        if (applicationContext2 != null) {
            restorePresenterStates.length(applicationContext2).getMax(intent);
        }
        GriverLogger.d(TAG, "onActivityResult finish");
        finish();
    }
}
