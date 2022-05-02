package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

final class setInterpolatedProgress {
    private static final loadLayoutDescription length = new loadLayoutDescription();
    private final animateTo getMax;
    private final ContentResolver getMin;
    private final List<ImageHeaderParser> isInside;
    private final setOnHide setMax;
    private final loadLayoutDescription setMin;

    setInterpolatedProgress(List<ImageHeaderParser> list, animateTo animateto, setOnHide setonhide, ContentResolver contentResolver) {
        this(list, length, animateto, setonhide, contentResolver);
    }

    private setInterpolatedProgress(List<ImageHeaderParser> list, loadLayoutDescription loadlayoutdescription, animateTo animateto, setOnHide setonhide, ContentResolver contentResolver) {
        this.setMin = loadlayoutdescription;
        this.getMax = animateto;
        this.setMax = setonhide;
        this.getMin = contentResolver;
        this.isInside = list;
    }

    /* access modifiers changed from: package-private */
    public final int getMin(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.getMin.openInputStream(uri);
            int length2 = setScaleY.length(this.isInside, openInputStream, this.setMax);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return length2;
        } catch (IOException | NullPointerException unused2) {
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public final InputStream length(Uri uri) throws FileNotFoundException {
        String max = setMax(uri);
        if (TextUtils.isEmpty(max)) {
            return null;
        }
        File file = new File(max);
        if (!getMax(file)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        try {
            return this.getMin.openInputStream(fromFile);
        } catch (NullPointerException e) {
            StringBuilder sb = new StringBuilder("NPE opening uri: ");
            sb.append(uri);
            sb.append(" -> ");
            sb.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0031  */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String setMax(@androidx.annotation.NonNull android.net.Uri r4) {
        /*
            r3 = this;
            r0 = 0
            o.animateTo r1 = r3.getMax     // Catch:{ SecurityException -> 0x002e, all -> 0x0024 }
            android.database.Cursor r4 = r1.setMin(r4)     // Catch:{ SecurityException -> 0x002e, all -> 0x0024 }
            if (r4 == 0) goto L_0x001e
            boolean r1 = r4.moveToFirst()     // Catch:{ SecurityException -> 0x001c, all -> 0x001a }
            if (r1 == 0) goto L_0x001e
            r1 = 0
            java.lang.String r0 = r4.getString(r1)     // Catch:{ SecurityException -> 0x001c, all -> 0x001a }
            if (r4 == 0) goto L_0x0019
            r4.close()
        L_0x0019:
            return r0
        L_0x001a:
            r0 = move-exception
            goto L_0x0028
        L_0x001c:
            goto L_0x002f
        L_0x001e:
            if (r4 == 0) goto L_0x0023
            r4.close()
        L_0x0023:
            return r0
        L_0x0024:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
        L_0x0028:
            if (r4 == 0) goto L_0x002d
            r4.close()
        L_0x002d:
            throw r0
        L_0x002e:
            r4 = r0
        L_0x002f:
            if (r4 == 0) goto L_0x0034
            r4.close()
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setInterpolatedProgress.setMax(android.net.Uri):java.lang.String");
    }

    private static boolean getMax(File file) {
        return loadLayoutDescription.setMin(file) && 0 < file.length();
    }
}
