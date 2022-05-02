package com.alibaba.griver.image.framework.meta;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.utils.Exif;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class APImageInfo {
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 180;
    public static final int ROTATION_270 = 270;
    public static final int ROTATION_90 = 90;

    /* renamed from: a  reason: collision with root package name */
    private static Set<String> f10473a = Collections.synchronizedSet(new HashSet());
    public static boolean sDecodeUnknownImageInfo = true;
    public static final Pattern sExcludePathPattern = Pattern.compile("(multimedia/[0-9a-z]{32})|(tencent)", 2);
    public static boolean sParseExifWhileDecodeError = false;
    private APImageInfo b;
    public int correctHeight;
    public int correctWidth;
    public byte[] data;
    public Integer format = null;
    public int height;
    public int orientation = 1;
    public String path;
    public int rotation;
    public int version = -1;
    public int width;

    public static int getImageRotation(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public APImageInfo(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.orientation = i3;
        this.rotation = getImageRotation(i3);
        a();
    }

    public APImageInfo() {
    }

    public static APImageInfo getImageInfo(Bitmap bitmap, int i) {
        APImageInfo aPImageInfo = new APImageInfo();
        if (bitmap != null) {
            aPImageInfo.width = bitmap.getWidth();
            aPImageInfo.height = bitmap.getHeight();
        }
        aPImageInfo.rotation = i;
        aPImageInfo.a();
        return aPImageInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (sParseExifWhileDecodeError != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (sParseExifWhileDecodeError != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.image.framework.meta.APImageInfo getImageInfo(java.lang.String r12) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            int r2 = com.alibaba.griver.image.framework.meta.ImageFileType.detectImageFileType((java.lang.String) r12)
            java.lang.String r3 = ", error: "
            java.lang.String r4 = "ImageInfo"
            r5 = 1
            r6 = 0
            r7 = 6
            if (r2 != r7) goto L_0x0055
            boolean r7 = sDecodeUnknownImageInfo
            if (r7 == 0) goto L_0x0055
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x003a }
            r7.<init>()     // Catch:{ all -> 0x003a }
            r7.inJustDecodeBounds = r5     // Catch:{ all -> 0x003a }
            android.graphics.BitmapFactory.decodeFile(r12, r7)     // Catch:{ all -> 0x003a }
            int r8 = r7.outWidth     // Catch:{ all -> 0x003a }
            int r7 = r7.outHeight     // Catch:{ all -> 0x0037 }
            if (r8 <= 0) goto L_0x0027
            if (r7 > 0) goto L_0x002b
        L_0x0027:
            boolean r9 = sParseExifWhileDecodeError     // Catch:{ all -> 0x0035 }
            if (r9 == 0) goto L_0x0093
        L_0x002b:
            int r5 = com.alibaba.griver.image.framework.utils.Exif.getOrientation((java.lang.String) r12)     // Catch:{ all -> 0x0035 }
            int r3 = getImageRotation(r5)     // Catch:{ all -> 0x0035 }
            r6 = r3
            goto L_0x0093
        L_0x0035:
            r9 = move-exception
            goto L_0x003d
        L_0x0037:
            r9 = move-exception
            r7 = 0
            goto L_0x003d
        L_0x003a:
            r9 = move-exception
            r7 = 0
            r8 = 0
        L_0x003d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getImageInfo unknown image: "
            r10.<init>(r11)
            r10.append(r12)
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = r10.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r4, r3)
            goto L_0x0093
        L_0x0055:
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0079 }
            r7.<init>()     // Catch:{ all -> 0x0079 }
            r7.inJustDecodeBounds = r5     // Catch:{ all -> 0x0079 }
            android.graphics.BitmapFactory.decodeFile(r12, r7)     // Catch:{ all -> 0x0079 }
            int r8 = r7.outWidth     // Catch:{ all -> 0x0079 }
            int r7 = r7.outHeight     // Catch:{ all -> 0x0076 }
            if (r8 <= 0) goto L_0x0067
            if (r7 > 0) goto L_0x006b
        L_0x0067:
            boolean r9 = sParseExifWhileDecodeError     // Catch:{ all -> 0x0074 }
            if (r9 == 0) goto L_0x0093
        L_0x006b:
            int r5 = com.alibaba.griver.image.framework.utils.Exif.getOrientation((java.lang.String) r12)     // Catch:{ all -> 0x0074 }
            int r6 = getImageRotation(r5)     // Catch:{ all -> 0x0074 }
            goto L_0x0093
        L_0x0074:
            r9 = move-exception
            goto L_0x007c
        L_0x0076:
            r9 = move-exception
            r7 = 0
            goto L_0x007c
        L_0x0079:
            r9 = move-exception
            r7 = 0
            r8 = 0
        L_0x007c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getImageInfo image: "
            r10.<init>(r11)
            r10.append(r12)
            r10.append(r3)
            r10.append(r9)
            java.lang.String r3 = r10.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r4, r3)
        L_0x0093:
            com.alibaba.griver.image.framework.meta.APImageInfo r3 = new com.alibaba.griver.image.framework.meta.APImageInfo
            r3.<init>()
            r3.width = r8
            r3.height = r7
            r3.rotation = r6
            r3.orientation = r5
            r5 = -1
            r3.version = r5
            r3.a()
            r3.path = r12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.format = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "getImageInfo from file, cost: "
            r2.<init>(r5)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r2.append(r5)
            java.lang.String r0 = ", file: "
            r2.append(r0)
            r2.append(r12)
            java.lang.String r12 = ", info: "
            r2.append(r12)
            r2.append(r3)
            java.lang.String r12 = r2.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.meta.APImageInfo.getImageInfo(java.lang.String):com.alibaba.griver.image.framework.meta.APImageInfo");
    }

    private void a() {
        int i = this.orientation;
        if (i == 6 || i == 8) {
            this.correctWidth = this.height;
            this.correctHeight = this.width;
            return;
        }
        this.correctWidth = this.width;
        this.correctHeight = this.height;
    }

    public static APImageInfo getImageInfo(byte[] bArr) {
        long currentTimeMillis = System.currentTimeMillis();
        int orientation2 = Exif.getOrientation(bArr);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (bArr != null) {
            try {
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("getImageInfo image: ");
                sb.append(bArr);
                sb.append(", error: ");
                sb.append(th);
                RVLogger.w("ImageInfo", sb.toString());
            }
        }
        APImageInfo aPImageInfo = new APImageInfo();
        aPImageInfo.width = options.outWidth;
        aPImageInfo.height = options.outHeight;
        aPImageInfo.rotation = getImageRotation(orientation2);
        aPImageInfo.orientation = orientation2;
        aPImageInfo.a();
        aPImageInfo.data = bArr;
        StringBuilder sb2 = new StringBuilder("getImageInfo from byte[], cost: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(", info: ");
        sb2.append(aPImageInfo);
        RVLogger.d("ImageInfo", sb2.toString());
        return aPImageInfo;
    }

    public APImageInfo getThumbnailInfo() {
        if (this.b == null && !TextUtils.isEmpty(this.path) && !f10473a.contains(this.path) && !sExcludePathPattern.matcher(this.path).find() && matchFormat(0)) {
            try {
                byte[] thumbnail = new ExifInterface(this.path).getThumbnail();
                if (thumbnail != null) {
                    this.b = getImageInfo(thumbnail);
                }
            } catch (Exception unused) {
                f10473a.add(this.path);
            }
        }
        return this.b;
    }

    public int getFormat() {
        int i;
        if (this.format == null) {
            byte[] bArr = this.data;
            if (bArr == null) {
                i = ImageFileType.detectImageFileType(this.path);
            } else {
                i = ImageFileType.detectImageDataType(bArr);
            }
            this.format = Integer.valueOf(i);
        }
        return this.format.intValue();
    }

    public boolean matchFormat(int i) {
        return i == getFormat();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImageInfo{path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", rotation=");
        sb.append(this.rotation);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", correctWidth=");
        sb.append(this.correctWidth);
        sb.append(", correctHeight=");
        sb.append(this.correctHeight);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", mThumbnailInfo=");
        sb.append(this.b);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", version=");
        sb.append(this.version);
        sb.append('}');
        return sb.toString();
    }
}
