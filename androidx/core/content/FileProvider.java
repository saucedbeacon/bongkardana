package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.setBuildNumber;

public class FileProvider extends ContentProvider {
    private static final String[] getMax = {"_display_name", "_size"};
    @GuardedBy("sCache")
    private static HashMap<String, setMax> length = new HashMap<>();
    private static final File setMin = new File("/");
    private setMax getMin;

    interface setMax {
        File setMax(Uri uri);

        Uri setMin(File file);
    }

    public boolean onCreate() {
        return true;
    }

    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.getMin = length(context, providerInfo.authority.split(";")[0]);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        return length(context, str).setMin(file);
    }

    @SuppressLint({"StreamFiles"})
    @NonNull
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(setBuildNumber.DISPLAY_NAME_KEY, str2).build();
    }

    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i;
        File max = this.getMin.setMax(uri);
        String queryParameter = uri.getQueryParameter(setBuildNumber.DISPLAY_NAME_KEY);
        if (strArr == null) {
            strArr = getMax;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? max.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(max.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(@androidx.annotation.NonNull android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$setMax r0 = r2.getMin
            java.io.File r3 = r0.setMax(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public int update(@NonNull Uri uri, ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return this.getMin.setMax(uri).delete() ? 1 : 0;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        int i;
        File max = this.getMin.setMax(uri);
        if (BranchLinkConstant.PayloadKey.REFERRAL.equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
        }
        return ParcelFileDescriptor.open(max, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        length.put(r12, r1);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0105, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105 A[ExcHandler: XmlPullParserException (r11v3 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.core.content.FileProvider.setMax length(android.content.Context r11, java.lang.String r12) {
        /*
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$setMax> r0 = length
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$setMax> r1 = length     // Catch:{ all -> 0x0119 }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x0119 }
            androidx.core.content.FileProvider$setMax r1 = (androidx.core.content.FileProvider.setMax) r1     // Catch:{ all -> 0x0119 }
            if (r1 != 0) goto L_0x0117
            androidx.core.content.FileProvider$setMin r1 = new androidx.core.content.FileProvider$setMin     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r1.<init>(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            android.content.pm.PackageManager r2 = r11.getPackageManager()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r12, r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r2 == 0) goto L_0x00f5
            android.content.pm.PackageManager r3 = r11.getPackageManager()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r4 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r2 = r2.loadXmlMetaData(r3, r4)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r2 == 0) goto L_0x00ed
        L_0x002a:
            int r3 = r2.next()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r4 = 1
            if (r3 == r4) goto L_0x00e7
            r5 = 2
            if (r3 != r5) goto L_0x002a
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r5 = "name"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r7 = "path"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r8 = "root-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r9 = 0
            if (r8 == 0) goto L_0x0051
            java.io.File r6 = setMin     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x0051:
            java.lang.String r8 = "files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 == 0) goto L_0x005e
            java.io.File r6 = r11.getFilesDir()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x005e:
            java.lang.String r8 = "cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 == 0) goto L_0x006b
            java.io.File r6 = r11.getCacheDir()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x006b:
            java.lang.String r8 = "external-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 == 0) goto L_0x0078
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x0078:
            java.lang.String r8 = "external-files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 == 0) goto L_0x008a
            java.io.File[] r3 = o.IntRange.getMin((android.content.Context) r11, (java.lang.String) r6)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 <= 0) goto L_0x00b3
            r6 = r3[r9]     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x008a:
            java.lang.String r8 = "external-cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 == 0) goto L_0x009c
            java.io.File[] r3 = o.IntRange.getMax(r11)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 <= 0) goto L_0x00b3
            r6 = r3[r9]     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x00b3
        L_0x009c:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r10 = 21
            if (r8 < r10) goto L_0x00b3
            java.lang.String r8 = "external-media-path"
            boolean r3 = r8.equals(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r3 == 0) goto L_0x00b3
            java.io.File[] r3 = r11.getExternalMediaDirs()     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            int r8 = r3.length     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r8 <= 0) goto L_0x00b3
            r6 = r3[r9]     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
        L_0x00b3:
            if (r6 == 0) goto L_0x002a
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r3[r9] = r7     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.io.File r3 = length((java.io.File) r6, (java.lang.String[]) r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            if (r4 != 0) goto L_0x00df
            java.io.File r3 = r3.getCanonicalFile()     // Catch:{ IOException -> 0x00ce, XmlPullParserException -> 0x0105 }
            java.util.HashMap<java.lang.String, java.io.File> r4 = r1.getMax     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r4.put(r5, r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            goto L_0x002a
        L_0x00ce:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r1 = "Failed to resolve canonical path for "
            java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r12.<init>(r1, r11)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            throw r12     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
        L_0x00df:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r12 = "Name must not be empty"
            r11.<init>(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            throw r11     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
        L_0x00e7:
            java.util.HashMap<java.lang.String, androidx.core.content.FileProvider$setMax> r11 = length     // Catch:{ all -> 0x0119 }
            r11.put(r12, r1)     // Catch:{ all -> 0x0119 }
            goto L_0x0117
        L_0x00ed:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r12 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            throw r11     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
        L_0x00f5:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r1 = "Couldn't find meta-data for provider with authority "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            java.lang.String r12 = r1.concat(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            r11.<init>(r12)     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
            throw r11     // Catch:{ IOException -> 0x010e, XmlPullParserException -> 0x0105 }
        L_0x0105:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r12.<init>(r1, r11)     // Catch:{ all -> 0x0119 }
            throw r12     // Catch:{ all -> 0x0119 }
        L_0x010e:
            r11 = move-exception
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0119 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r12.<init>(r1, r11)     // Catch:{ all -> 0x0119 }
            throw r12     // Catch:{ all -> 0x0119 }
        L_0x0117:
            monitor-exit(r0)     // Catch:{ all -> 0x0119 }
            return r1
        L_0x0119:
            r11 = move-exception
            monitor-exit(r0)
            goto L_0x011d
        L_0x011c:
            throw r11
        L_0x011d:
            goto L_0x011c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.length(android.content.Context, java.lang.String):androidx.core.content.FileProvider$setMax");
    }

    static class setMin implements setMax {
        final HashMap<String, File> getMax = new HashMap<>();
        private final String getMin;

        setMin(String str) {
            this.getMin = str;
        }

        public final Uri setMin(File file) {
            String str;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.getMax.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    if (path2.endsWith("/")) {
                        str = canonicalPath.substring(path2.length());
                    } else {
                        str = canonicalPath.substring(path2.length() + 1);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode((String) entry.getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(str, "/"));
                    return new Uri.Builder().scheme("content").authority(this.getMin).encodedPath(sb.toString()).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file)));
            }
        }

        public final File setMax(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.getMax.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(file2)));
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
            }
        }
    }

    private static File length(File file, String... strArr) {
        for (int i = 0; i <= 0; i++) {
            String str = strArr[0];
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }
}
