package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class getTopDecorationHeight extends AsyncTask<Void, Void, length> {
    private final layoutDecorated equals;
    private Uri getMax;
    private final Context getMin;
    private final int length;
    private Uri setMax;
    private final int setMin;

    /* access modifiers changed from: protected */
    @NonNull
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return setMin();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(@NonNull Object obj) {
        length length2 = (length) obj;
        if (length2.length == null) {
            layoutDecorated layoutdecorated = this.equals;
            Bitmap bitmap = length2.setMax;
            getDecoratedRight getdecoratedright = length2.getMax;
            String path = this.getMax.getPath();
            Uri uri = this.setMax;
            layoutdecorated.getMax(bitmap, getdecoratedright, path, uri == null ? null : uri.getPath());
            return;
        }
        this.equals.getMax(length2.length);
    }

    public static class length {
        getDecoratedRight getMax;
        Exception length;
        Bitmap setMax;

        public length(@NonNull Bitmap bitmap, @NonNull getDecoratedRight getdecoratedright) {
            this.setMax = bitmap;
            this.getMax = getdecoratedright;
        }

        public length(@NonNull Exception exc) {
            this.length = exc;
        }
    }

    public getTopDecorationHeight(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, layoutDecorated layoutdecorated) {
        this.getMin = context;
        this.getMax = uri;
        this.setMax = uri2;
        this.setMin = i;
        this.length = i2;
        this.equals = layoutdecorated;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0251, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0253, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x023f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x00e5 */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x021e A[SYNTHETIC, Splitter:B:138:0x021e] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0229 A[SYNTHETIC, Splitter:B:145:0x0229] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0234 A[SYNTHETIC, Splitter:B:152:0x0234] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0253 A[ExcHandler: NullPointerException (e java.lang.NullPointerException), Splitter:B:31:0x0088] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00da A[SYNTHETIC, Splitter:B:57:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0100  */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private o.getTopDecorationHeight.length setMin() {
        /*
            r13 = this;
            android.net.Uri r0 = r13.getMax
            if (r0 != 0) goto L_0x0011
            o.getTopDecorationHeight$length r0 = new o.getTopDecorationHeight$length
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Input Uri cannot be null"
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
        L_0x0011:
            java.lang.String r0 = r0.getScheme()     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            r2 = 0
            if (r1 != 0) goto L_0x0088
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0088
        L_0x0027:
            java.lang.String r1 = "content"
            boolean r1 = r1.equals(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r1 == 0) goto L_0x006e
            android.content.Context r0 = r13.getMin     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            int r0 = o.IntRange.length((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r0 != 0) goto L_0x0042
            android.content.Context r0 = r13.getMin     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            android.net.Uri r1 = r13.getMax     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            java.lang.String r0 = o.isViewPartiallyVisible.setMax(r0, r1)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r1 != 0) goto L_0x0061
            java.io.File r1 = new java.io.File     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            boolean r1 = r1.exists()     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r1 == 0) goto L_0x0061
            java.io.File r1 = new java.io.File     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            android.net.Uri r0 = android.net.Uri.fromFile(r1)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            r13.getMax = r0     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            goto L_0x00ee
        L_0x0061:
            android.net.Uri r0 = r13.getMax     // Catch:{ NullPointerException -> 0x006c, IOException -> 0x006a }
            android.net.Uri r1 = r13.setMax     // Catch:{ NullPointerException -> 0x006c, IOException -> 0x006a }
            r13.getMin(r0, r1)     // Catch:{ NullPointerException -> 0x006c, IOException -> 0x006a }
            goto L_0x00ee
        L_0x006a:
            r0 = move-exception
            goto L_0x006d
        L_0x006c:
            r0 = move-exception
        L_0x006d:
            throw r0     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
        L_0x006e:
            java.lang.String r1 = "file"
            boolean r1 = r1.equals(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            if (r1 == 0) goto L_0x0078
            goto L_0x00ee
        L_0x0078:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            java.lang.String r2 = "Invalid Uri scheme"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            java.lang.String r0 = r2.concat(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            r1.<init>(r0)     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
            throw r1     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
        L_0x0088:
            android.net.Uri r0 = r13.getMax     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            android.net.Uri r1 = r13.setMax     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r1 == 0) goto L_0x0249
            o.generateKey r3 = new o.generateKey     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            r3.<init>()     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            o.InvalidDataException$getMin r4 = new o.InvalidDataException$getMin     // Catch:{ all -> 0x0217 }
            r4.<init>()     // Catch:{ all -> 0x0217 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0217 }
            o.InvalidDataException$getMin r0 = r4.setMax(r0)     // Catch:{ all -> 0x0217 }
            o.Draft_76 r4 = r0.getMin     // Catch:{ all -> 0x0217 }
            if (r4 == 0) goto L_0x020f
            o.InvalidDataException r4 = new o.InvalidDataException     // Catch:{ all -> 0x0217 }
            r4.<init>(r0)     // Catch:{ all -> 0x0217 }
            o.IncompleteHandshakeException r0 = o.IncompleteHandshakeException.setMax(r3, r4)     // Catch:{ all -> 0x0217 }
            o.InvalidHandshakeException r0 = com.google.firebase.perf.network.FirebasePerfOkHttpClient.execute(r0)     // Catch:{ all -> 0x0217 }
            o.NotSendableException r4 = r0.toFloatRange     // Catch:{ all -> 0x020a }
            o.schedule r4 = r4.getMax()     // Catch:{ all -> 0x020a }
            android.content.Context r5 = r13.getMin     // Catch:{ all -> 0x0205 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x0205 }
            java.io.OutputStream r1 = r5.openOutputStream(r1)     // Catch:{ all -> 0x0205 }
            if (r1 == 0) goto L_0x01fd
            o.recordDnsTime r1 = o.recordMonitorOfSndMsg.length(r1)     // Catch:{ all -> 0x0205 }
            r4.getMax((o.recordDnsTime) r1)     // Catch:{ all -> 0x01fb }
            if (r4 == 0) goto L_0x00d3
            boolean r5 = r4 instanceof java.io.Closeable     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r5 == 0) goto L_0x00d3
            r4.close()     // Catch:{ IOException -> 0x00d3, NullPointerException -> 0x0253 }
        L_0x00d3:
            r1.close()     // Catch:{ IOException -> 0x00d7, NullPointerException -> 0x0253 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            if (r0 == 0) goto L_0x00e5
            o.NotSendableException r0 = r0.toFloatRange     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r0 == 0) goto L_0x00e5
            boolean r1 = r0 instanceof java.io.Closeable     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r1 == 0) goto L_0x00e5
            r0.close()     // Catch:{ IOException -> 0x00e5, NullPointerException -> 0x0253 }
        L_0x00e5:
            o.Draft_17 r0 = r3.setMin     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            r0.setMax()     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            android.net.Uri r0 = r13.setMax     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            r13.getMax = r0     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
        L_0x00ee:
            android.content.Context r0 = r13.getMin     // Catch:{ FileNotFoundException -> 0x01f4 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x01f4 }
            android.net.Uri r1 = r13.getMax     // Catch:{ FileNotFoundException -> 0x01f4 }
            java.lang.String r3 = "r"
            android.os.ParcelFileDescriptor r0 = r0.openFileDescriptor(r1, r3)     // Catch:{ FileNotFoundException -> 0x01f4 }
            java.lang.String r1 = "]"
            if (r0 == 0) goto L_0x01d6
            java.io.FileDescriptor r3 = r0.getFileDescriptor()
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r5 = 1
            r4.inJustDecodeBounds = r5
            android.graphics.BitmapFactory.decodeFileDescriptor(r3, r2, r4)
            int r6 = r4.outWidth
            r7 = -1
            if (r6 == r7) goto L_0x01b8
            int r6 = r4.outHeight
            if (r6 != r7) goto L_0x011a
            goto L_0x01b8
        L_0x011a:
            int r6 = r13.setMin
            int r8 = r13.length
            int r6 = o.getLeftDecorationWidth.setMax(r4, r6, r8)
            r4.inSampleSize = r6
            r6 = 0
            r4.inJustDecodeBounds = r6
            r9 = r2
            r8 = 0
        L_0x0129:
            r10 = 2
            if (r8 != 0) goto L_0x0139
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeFileDescriptor(r3, r2, r4)     // Catch:{ OutOfMemoryError -> 0x0132 }
            r8 = 1
            goto L_0x0129
        L_0x0132:
            int r11 = r4.inSampleSize
            int r11 = r11 * 2
            r4.inSampleSize = r11
            goto L_0x0129
        L_0x0139:
            if (r9 != 0) goto L_0x0159
            o.getTopDecorationHeight$length r0 = new o.getTopDecorationHeight$length
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bitmap could not be decoded from the Uri: ["
            r3.<init>(r4)
            android.net.Uri r4 = r13.getMax
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r0.<init>(r2)
            return r0
        L_0x0159:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 16
            if (r1 < r2) goto L_0x016a
            if (r0 == 0) goto L_0x016a
            boolean r1 = r0 instanceof java.io.Closeable
            if (r1 == 0) goto L_0x016a
            r0.close()     // Catch:{ IOException -> 0x0169 }
            goto L_0x016a
        L_0x0169:
        L_0x016a:
            android.content.Context r0 = r13.getMin
            android.net.Uri r1 = r13.getMax
            int r0 = o.getLeftDecorationWidth.length((android.content.Context) r0, (android.net.Uri) r1)
            switch(r0) {
                case 3: goto L_0x017c;
                case 4: goto L_0x017c;
                case 5: goto L_0x0179;
                case 6: goto L_0x0179;
                case 7: goto L_0x0176;
                case 8: goto L_0x0176;
                default: goto L_0x0175;
            }
        L_0x0175:
            goto L_0x017e
        L_0x0176:
            r6 = 270(0x10e, float:3.78E-43)
            goto L_0x017e
        L_0x0179:
            r6 = 90
            goto L_0x017e
        L_0x017c:
            r6 = 180(0xb4, float:2.52E-43)
        L_0x017e:
            if (r0 == r10) goto L_0x018a
            r1 = 7
            if (r0 == r1) goto L_0x018a
            r1 = 4
            if (r0 == r1) goto L_0x018a
            r1 = 5
            if (r0 == r1) goto L_0x018a
            r7 = 1
        L_0x018a:
            o.getDecoratedRight r1 = new o.getDecoratedRight
            r1.<init>(r0, r6, r7)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r6 == 0) goto L_0x019a
            float r2 = (float) r6
            r0.preRotate(r2)
        L_0x019a:
            if (r7 == r5) goto L_0x01a2
            float r2 = (float) r7
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r3)
        L_0x01a2:
            boolean r2 = r0.isIdentity()
            if (r2 != 0) goto L_0x01b2
            o.getTopDecorationHeight$length r2 = new o.getTopDecorationHeight$length
            android.graphics.Bitmap r0 = o.getLeftDecorationWidth.length((android.graphics.Bitmap) r9, (android.graphics.Matrix) r0)
            r2.<init>(r0, r1)
            return r2
        L_0x01b2:
            o.getTopDecorationHeight$length r0 = new o.getTopDecorationHeight$length
            r0.<init>(r9, r1)
            return r0
        L_0x01b8:
            o.getTopDecorationHeight$length r0 = new o.getTopDecorationHeight$length
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bounds for bitmap could not be retrieved from the Uri: ["
            r3.<init>(r4)
            android.net.Uri r4 = r13.getMax
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r0.<init>(r2)
            return r0
        L_0x01d6:
            o.getTopDecorationHeight$length r0 = new o.getTopDecorationHeight$length
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ParcelFileDescriptor was null for given Uri: ["
            r3.<init>(r4)
            android.net.Uri r4 = r13.getMax
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            r0.<init>(r2)
            return r0
        L_0x01f4:
            r0 = move-exception
            o.getTopDecorationHeight$length r1 = new o.getTopDecorationHeight$length
            r1.<init>(r0)
            return r1
        L_0x01fb:
            r2 = move-exception
            goto L_0x021c
        L_0x01fd:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0205 }
            java.lang.String r5 = "OutputStream for given output Uri is null"
            r1.<init>(r5)     // Catch:{ all -> 0x0205 }
            throw r1     // Catch:{ all -> 0x0205 }
        L_0x0205:
            r1 = move-exception
            r12 = r2
            r2 = r1
            r1 = r12
            goto L_0x021c
        L_0x020a:
            r1 = move-exception
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x021c
        L_0x020f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0217 }
            java.lang.String r1 = "url == null"
            r0.<init>(r1)     // Catch:{ all -> 0x0217 }
            throw r0     // Catch:{ all -> 0x0217 }
        L_0x0217:
            r0 = move-exception
            r1 = r2
            r4 = r1
            r2 = r0
            r0 = r4
        L_0x021c:
            if (r4 == 0) goto L_0x0227
            boolean r5 = r4 instanceof java.io.Closeable     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r5 == 0) goto L_0x0227
            r4.close()     // Catch:{ IOException -> 0x0226, NullPointerException -> 0x0253 }
            goto L_0x0227
        L_0x0226:
        L_0x0227:
            if (r1 == 0) goto L_0x0232
            boolean r4 = r1 instanceof java.io.Closeable     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r4 == 0) goto L_0x0232
            r1.close()     // Catch:{ IOException -> 0x0231, NullPointerException -> 0x0253 }
            goto L_0x0232
        L_0x0231:
        L_0x0232:
            if (r0 == 0) goto L_0x023f
            o.NotSendableException r0 = r0.toFloatRange     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r0 == 0) goto L_0x023f
            boolean r1 = r0 instanceof java.io.Closeable     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            if (r1 == 0) goto L_0x023f
            r0.close()     // Catch:{ IOException -> 0x023f, NullPointerException -> 0x0253 }
        L_0x023f:
            o.Draft_17 r0 = r3.setMin     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            r0.setMax()     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            android.net.Uri r0 = r13.setMax     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            r13.getMax = r0     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            throw r2     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
        L_0x0249:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            java.lang.String r1 = "Output Uri is null - cannot download image"
            r0.<init>(r1)     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
            throw r0     // Catch:{ NullPointerException -> 0x0253, IOException -> 0x0251 }
        L_0x0251:
            r0 = move-exception
            goto L_0x0254
        L_0x0253:
            r0 = move-exception
        L_0x0254:
            throw r0     // Catch:{ NullPointerException -> 0x0257, IOException -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            goto L_0x0258
        L_0x0257:
            r0 = move-exception
        L_0x0258:
            o.getTopDecorationHeight$length r1 = new o.getTopDecorationHeight$length
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getTopDecorationHeight.setMin():o.getTopDecorationHeight$length");
    }

    private void getMin(@NonNull Uri uri, @Nullable Uri uri2) throws NullPointerException, IOException {
        InputStream inputStream;
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.getMin.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    if (inputStream != null) {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    try {
                                        break;
                                    } catch (IOException unused) {
                                    }
                                }
                            }
                            fileOutputStream2.close();
                            if (inputStream != null && (inputStream instanceof Closeable)) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            this.getMax = this.setMax;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                            this.getMax = this.setMax;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null && (fileOutputStream instanceof Closeable)) {
                        fileOutputStream.close();
                    }
                    if (inputStream != null && (inputStream instanceof Closeable)) {
                        inputStream.close();
                    }
                    this.getMax = this.setMax;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                fileOutputStream.close();
                inputStream.close();
                this.getMax = this.setMax;
                throw th;
            }
        } else {
            throw new NullPointerException("Output Uri is null - cannot copy image");
        }
    }
}
