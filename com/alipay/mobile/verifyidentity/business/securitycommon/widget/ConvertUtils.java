package com.alipay.mobile.verifyidentity.business.securitycommon.widget;

import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import com.alibaba.griver.base.common.utils.H5ResourceHandlerUtil;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import id.dana.promocenter.model.PromoActionType;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import o.getTabbarModel;

public class ConvertUtils {
    public static final long GB = 1073741824;
    public static final long KB = 1024;
    public static final long MB = 1048576;

    public static int toShort(byte b, byte b2) {
        return (b << 8) + (b2 & 255);
    }

    public static int toInt(Object obj) {
        try {
            return Integer.parseInt(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int toInt(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i += (bArr[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public static long toLong(Object obj) {
        try {
            return Long.parseLong(obj.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static float toFloat(Object obj) {
        try {
            return Float.parseFloat(obj.toString());
        } catch (NumberFormatException unused) {
            return -1.0f;
        }
    }

    public static byte[] toByteArray(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    public static byte[] toByteArray(String str, boolean z) {
        if (str == null || str.equals("")) {
            return null;
        }
        if (!z) {
            return str.getBytes();
        }
        String replaceAll = str.replaceAll("\\s+", "");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(replaceAll.length() / 2);
        for (int i = 0; i < replaceAll.length(); i += 2) {
            byteArrayOutputStream.write(("0123456789ABCDEF".indexOf(replaceAll.charAt(i)) << 4) | "0123456789ABCDEF".indexOf(replaceAll.charAt(i + 1)));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public static String toHexString(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : str.getBytes()) {
            sb.append(Integer.toHexString(b & 255));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String toHexString(byte... r7) {
        /*
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r1 = r7.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
        L_0x000e:
            int r4 = r7.length
            if (r2 >= r4) goto L_0x002f
            byte r4 = r7[r2]
            if (r4 >= 0) goto L_0x001a
            byte r4 = r7[r2]
            int r4 = r4 + 256
            goto L_0x001c
        L_0x001a:
            byte r4 = r7[r2]
        L_0x001c:
            int r5 = r3 + 1
            int r6 = r4 >>> 4
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            r4 = r4 & 15
            char r4 = r0[r4]
            r1[r5] = r4
            int r2 = r2 + 1
            goto L_0x000e
        L_0x002f:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils.toHexString(byte[]):java.lang.String");
    }

    public static String toHexString(int i) {
        return Integer.toHexString(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String toBinaryString(byte... r7) {
        /*
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            int r1 = r7.length
            int r1 = r1 * 8
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 0
        L_0x000e:
            int r4 = r7.length
            if (r2 >= r4) goto L_0x006d
            byte r4 = r7[r2]
            if (r4 >= 0) goto L_0x001a
            byte r4 = r7[r2]
            int r4 = r4 + 256
            goto L_0x001c
        L_0x001a:
            byte r4 = r7[r2]
        L_0x001c:
            int r5 = r3 + 1
            int r6 = r4 >>> 7
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 6
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 5
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 4
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 3
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            int r6 = r4 >>> 2
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r5] = r6
            int r5 = r3 + 1
            int r6 = r4 >>> 1
            r6 = r6 & 1
            char r6 = r0[r6]
            r1[r3] = r6
            int r3 = r5 + 1
            r4 = r4 & 1
            char r4 = r0[r4]
            r1[r5] = r4
            int r2 = r2 + 1
            goto L_0x000e
        L_0x006d:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils.toBinaryString(byte[]):java.lang.String");
    }

    public static String toBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    public static String toSlashString(String str) {
        String str2 = "";
        for (char c : str.toCharArray()) {
            if (c == '\"' || c == '\'' || c == '\\') {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("\\");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(c);
            str2 = sb2.toString();
        }
        return str2;
    }

    public static <T> T[] toArray(List<T> list) {
        return list.toArray();
    }

    public static <T> List<T> toList(T[] tArr) {
        return Arrays.asList(tArr);
    }

    public static String toString(Object[] objArr) {
        return Arrays.deepToString(objArr);
    }

    public static String toString(Object[] objArr, String str) {
        StringBuilder sb = new StringBuilder();
        for (Object append : objArr) {
            sb.append(append);
            sb.append(str);
        }
        return sb.toString();
    }

    public static byte[] toByteArray(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[100];
            while (true) {
                int read = inputStream.read(bArr, 0, 100);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return byteArray;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] toByteArray(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArray;
    }

    public static Bitmap toBitmap(byte[] bArr, int i, int i2) {
        if (bArr.length == 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inDither = false;
            options.inPreferredConfig = null;
            if (i > 0 && i2 > 0) {
                options.outWidth = i;
                options.outHeight = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            decodeByteArray.setDensity(96);
            return decodeByteArray;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Bitmap toBitmap(byte[] bArr) {
        return toBitmap(bArr, -1, -1);
    }

    public static Bitmap toBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof ColorDrawable) {
            Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(((ColorDrawable) drawable).getColor());
            return createBitmap;
        } else if (!(drawable instanceof NinePatchDrawable)) {
            return null;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return createBitmap2;
        }
    }

    @TargetApi(19)
    public static String toPath(Context context, Uri uri) {
        if (uri == null) {
            return "";
        }
        String path = uri.getPath();
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String[] split = documentId.split(":");
            String str = split[0];
            char c = 65535;
            int hashCode = authority.hashCode();
            if (hashCode != 320699453) {
                if (hashCode != 596745902) {
                    if (hashCode == 1734583286 && authority.equals("com.android.providers.media.documents")) {
                        c = 2;
                    }
                } else if (authority.equals("com.android.externalstorage.documents")) {
                    c = 0;
                }
            } else if (authority.equals("com.android.providers.downloads.documents")) {
                c = 1;
            }
            if (c != 0) {
                if (c == 1) {
                    return _queryPathFromMediaStore(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                }
                if (c == 2) {
                    if (H5ResourceHandlerUtil.IMAGE.equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return _queryPathFromMediaStore(context, uri2, "_id=?", new String[]{split[1]});
                }
            } else if (PromoActionType.PRIMARY.equalsIgnoreCase(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory());
                sb.append("/");
                sb.append(split[1]);
                return sb.toString();
            }
        } else if ("content".equalsIgnoreCase(scheme)) {
            if (authority.equals("com.google.android.apps.photos.content")) {
                return uri.getLastPathSegment();
            }
            return _queryPathFromMediaStore(context, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(scheme)) {
            return uri.getPath();
        }
        return path;
    }

    private static String _queryPathFromMediaStore(Context context, Uri uri, String str, String[] strArr) {
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, (String) null);
            if (query == null) {
                return null;
            }
            int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
            query.moveToFirst();
            String string = query.getString(columnIndexOrThrow);
            query.close();
            return string;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap toBitmap(android.view.View r7) {
        /*
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            boolean r2 = r7 instanceof android.widget.ListView
            r3 = 0
            if (r2 == 0) goto L_0x0024
            r1 = r7
            android.widget.ListView r1 = (android.widget.ListView) r1
            r2 = 0
            r4 = 0
        L_0x0012:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L_0x003f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0024:
            boolean r2 = r7 instanceof android.widget.ScrollView
            if (r2 == 0) goto L_0x0040
            r1 = r7
            android.widget.ScrollView r1 = (android.widget.ScrollView) r1
            r2 = 0
            r4 = 0
        L_0x002d:
            int r5 = r1.getChildCount()
            if (r4 >= r5) goto L_0x003f
            android.view.View r5 = r1.getChildAt(r4)
            int r5 = r5.getHeight()
            int r2 = r2 + r5
            int r4 = r4 + 1
            goto L_0x002d
        L_0x003f:
            r1 = r2
        L_0x0040:
            r2 = 1
            r7.setDrawingCacheEnabled(r2)
            r7.clearFocus()
            r7.setPressed(r3)
            boolean r2 = r7.willNotCacheDrawing()
            r7.setWillNotCacheDrawing(r3)
            int r3 = r7.getDrawingCacheBackgroundColor()
            r4 = -1
            r7.setDrawingCacheBackgroundColor(r4)
            if (r3 == r4) goto L_0x005e
            r7.destroyDrawingCache()
        L_0x005e:
            r7.buildDrawingCache()
            android.graphics.Bitmap r4 = r7.getDrawingCache()
            r5 = 0
            if (r4 != 0) goto L_0x0069
            return r5
        L_0x0069:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r6)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r6 = 0
            r1.drawBitmap(r4, r6, r6, r5)
            r1.save()
            r1.restore()
            boolean r1 = r0.isRecycled()
            if (r1 != 0) goto L_0x0087
            r0.recycle()
        L_0x0087:
            r7.destroyDrawingCache()
            r7.setWillNotCacheDrawing(r2)
            r7.setDrawingCacheBackgroundColor(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.securitycommon.widget.ConvertUtils.toBitmap(android.view.View):android.graphics.Bitmap");
    }

    public static Drawable toDrawable(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(Resources.getSystem(), bitmap);
    }

    public static byte[] toByteArray(Drawable drawable) {
        return toByteArray(toBitmap(drawable));
    }

    public static Drawable toDrawable(byte[] bArr) {
        return toDrawable(toBitmap(bArr));
    }

    public static int toPx(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int toDp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int toSp(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static String toGbk(String str) {
        try {
            return new String(str.getBytes(getTabbarModel.ENC), "gbk");
        } catch (UnsupportedEncodingException unused) {
            return str;
        }
    }

    public static String toFileSizeString(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        if (j < KB) {
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(DiskFormatter.B);
            return sb.toString();
        } else if (j < MB) {
            StringBuilder sb2 = new StringBuilder();
            double d = (double) j;
            Double.isNaN(d);
            sb2.append(decimalFormat.format(d / 1024.0d));
            sb2.append(DiskFormatter.KB);
            return sb2.toString();
        } else if (j < GB) {
            StringBuilder sb3 = new StringBuilder();
            double d2 = (double) j;
            Double.isNaN(d2);
            sb3.append(decimalFormat.format(d2 / 1048576.0d));
            sb3.append(DiskFormatter.MB);
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            double d3 = (double) j;
            Double.isNaN(d3);
            sb4.append(decimalFormat.format(d3 / 1.073741824E9d));
            sb4.append(DiskFormatter.GB);
            return sb4.toString();
        }
    }

    public static String toString(InputStream inputStream, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            bufferedReader.close();
            inputStream.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static String toString(InputStream inputStream) {
        return toString(inputStream, getTabbarModel.ENC);
    }

    public static int toDarkenColor(@ColorInt int i) {
        return toDarkenColor(i, 0.8f);
    }

    public static int toDarkenColor(@ColorInt int i, @FloatRange(from = 0.0d, to = 1.0d) float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    public static String toColorString(@ColorInt int i) {
        return toColorString(i, false);
    }

    public static String toColorString(@ColorInt int i, boolean z) {
        String hexString = Integer.toHexString(Color.alpha(i));
        String hexString2 = Integer.toHexString(Color.red(i));
        String hexString3 = Integer.toHexString(Color.green(i));
        String hexString4 = Integer.toHexString(Color.blue(i));
        if (hexString.length() == 1) {
            hexString = "0".concat(String.valueOf(hexString));
        }
        if (hexString2.length() == 1) {
            hexString2 = "0".concat(String.valueOf(hexString2));
        }
        if (hexString3.length() == 1) {
            hexString3 = "0".concat(String.valueOf(hexString3));
        }
        if (hexString4.length() == 1) {
            hexString4 = "0".concat(String.valueOf(hexString4));
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(hexString);
            sb.append(hexString2);
            sb.append(hexString3);
            sb.append(hexString4);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(hexString2);
        sb2.append(hexString3);
        sb2.append(hexString4);
        return sb2.toString();
    }

    public static ColorStateList toColorStateList(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        int[] iArr = {i2, i3, i, i3, i4, i};
        return new ColorStateList(new int[][]{new int[]{16842919, 16842910}, new int[]{16842910, 16842908}, new int[]{16842910}, new int[]{16842908}, new int[]{16842909}, new int[0]}, iArr);
    }

    public static ColorStateList toColorStateList(@ColorInt int i, @ColorInt int i2) {
        return toColorStateList(i, i2, i2, i);
    }
}
