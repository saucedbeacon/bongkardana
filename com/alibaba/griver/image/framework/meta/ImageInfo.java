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

public class ImageInfo {
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
    private static Set<String> f10478a = Collections.synchronizedSet(new HashSet());
    public static boolean sDecodeUnknownImageInfo = true;
    public static final Pattern sExcludePathPattern = Pattern.compile("(multimedia/[0-9a-z]{32})|(tencent)", 2);
    public static boolean sParseExifWhileDecodeError = false;
    private ImageInfo b;
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

    public static ImageInfo getImageInfo(Bitmap bitmap, int i) {
        ImageInfo imageInfo = new ImageInfo();
        if (bitmap != null) {
            imageInfo.width = bitmap.getWidth();
            imageInfo.height = bitmap.getHeight();
        }
        imageInfo.rotation = i;
        imageInfo.a();
        return imageInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        if (sParseExifWhileDecodeError != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        if (sParseExifWhileDecodeError != false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.image.framework.meta.ImageInfo getImageInfo(java.lang.String r13) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = com.alibaba.griver.image.framework.utils.FileUtils.checkFile((java.lang.String) r13)
            r3 = 6
            java.lang.String r4 = "ImageInfo"
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x00a0
            int r2 = com.alibaba.griver.image.framework.meta.ImageFileType.detectImageFileType((java.lang.String) r13)
            java.lang.String r7 = ", error: "
            if (r2 != r3) goto L_0x005a
            boolean r3 = sDecodeUnknownImageInfo
            if (r3 == 0) goto L_0x005a
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            r3.inJustDecodeBounds = r5     // Catch:{ all -> 0x003f }
            android.graphics.BitmapFactory.decodeFile(r13, r3)     // Catch:{ all -> 0x003f }
            int r8 = r3.outWidth     // Catch:{ all -> 0x003f }
            int r3 = r3.outHeight     // Catch:{ all -> 0x003c }
            if (r8 <= 0) goto L_0x002d
            if (r3 > 0) goto L_0x0031
        L_0x002d:
            boolean r9 = sParseExifWhileDecodeError     // Catch:{ all -> 0x003a }
            if (r9 == 0) goto L_0x0078
        L_0x0031:
            int r5 = com.alibaba.griver.image.framework.utils.Exif.getOrientation((java.lang.String) r13)     // Catch:{ all -> 0x003a }
            int r6 = getImageRotation(r5)     // Catch:{ all -> 0x003a }
            goto L_0x0078
        L_0x003a:
            r9 = move-exception
            goto L_0x0042
        L_0x003c:
            r9 = move-exception
            r3 = 0
            goto L_0x0042
        L_0x003f:
            r9 = move-exception
            r3 = 0
            r8 = 0
        L_0x0042:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getImageInfo unknown image: "
            r10.<init>(r11)
            r10.append(r13)
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r4, r7)
            goto L_0x009a
        L_0x005a:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0080 }
            r3.<init>()     // Catch:{ all -> 0x0080 }
            r3.inJustDecodeBounds = r5     // Catch:{ all -> 0x0080 }
            android.graphics.BitmapFactory.decodeFile(r13, r3)     // Catch:{ all -> 0x0080 }
            int r8 = r3.outWidth     // Catch:{ all -> 0x0080 }
            int r3 = r3.outHeight     // Catch:{ all -> 0x007d }
            if (r8 <= 0) goto L_0x006c
            if (r3 > 0) goto L_0x0070
        L_0x006c:
            boolean r9 = sParseExifWhileDecodeError     // Catch:{ all -> 0x007b }
            if (r9 == 0) goto L_0x0078
        L_0x0070:
            int r5 = com.alibaba.griver.image.framework.utils.Exif.getOrientation((java.lang.String) r13)     // Catch:{ all -> 0x007b }
            int r6 = getImageRotation(r5)     // Catch:{ all -> 0x007b }
        L_0x0078:
            r7 = r6
            r6 = r8
            goto L_0x009c
        L_0x007b:
            r9 = move-exception
            goto L_0x0083
        L_0x007d:
            r9 = move-exception
            r3 = 0
            goto L_0x0083
        L_0x0080:
            r9 = move-exception
            r3 = 0
            r8 = 0
        L_0x0083:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "getImageInfo image: "
            r10.<init>(r11)
            r10.append(r13)
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r4, r7)
        L_0x009a:
            r6 = r8
            r7 = 0
        L_0x009c:
            r12 = r3
            r3 = r2
            r2 = r12
            goto L_0x00a2
        L_0x00a0:
            r2 = 0
            r7 = 0
        L_0x00a2:
            com.alibaba.griver.image.framework.meta.ImageInfo r8 = new com.alibaba.griver.image.framework.meta.ImageInfo
            r8.<init>()
            r8.width = r6
            r8.height = r2
            r8.rotation = r7
            r8.orientation = r5
            r2 = -1
            r8.version = r2
            r8.a()
            r8.path = r13
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r8.format = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getImageInfo from file, cost: "
            r2.<init>(r3)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r2.append(r5)
            java.lang.String r0 = ", file: "
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = ", info: "
            r2.append(r13)
            r2.append(r8)
            java.lang.String r13 = r2.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.framework.meta.ImageInfo.getImageInfo(java.lang.String):com.alibaba.griver.image.framework.meta.ImageInfo");
    }

    public static ImageInfo getImageInfo(byte[] bArr) {
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
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.width = options.outWidth;
        imageInfo.height = options.outHeight;
        imageInfo.rotation = getImageRotation(orientation2);
        imageInfo.orientation = orientation2;
        imageInfo.a();
        imageInfo.data = bArr;
        StringBuilder sb2 = new StringBuilder("getImageInfo from byte[], cost: ");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(", info: ");
        sb2.append(imageInfo);
        RVLogger.d("ImageInfo", sb2.toString());
        return imageInfo;
    }

    public ImageInfo getThumbnailInfo() {
        if (this.b == null && !TextUtils.isEmpty(this.path) && !f10478a.contains(this.path) && !sExcludePathPattern.matcher(this.path).find() && matchFormat(0)) {
            try {
                byte[] thumbnail = new ExifInterface(this.path).getThumbnail();
                if (thumbnail != null) {
                    this.b = getImageInfo(thumbnail);
                }
            } catch (Exception unused) {
                f10478a.add(this.path);
            }
        }
        return this.b;
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
