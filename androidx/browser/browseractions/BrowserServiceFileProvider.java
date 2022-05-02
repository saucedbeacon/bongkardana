package androidx.browser.browseractions;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.core.content.FileProvider;
import com.google.common.util.concurrent.ListenableFuture;
import id.dana.data.constant.BranchLinkConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.IResultReceiver;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class BrowserServiceFileProvider extends FileProvider {
    static Object sFileCleanupLock = new Object();

    static class getMin extends AsyncTask<Void, Void, Void> {
        private static final long getMax = TimeUnit.DAYS.toMillis(7);
        private static final long getMin = TimeUnit.DAYS.toMillis(7);
        private static final long setMin = TimeUnit.DAYS.toMillis(1);
        private final Context length;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return length();
        }

        getMin(Context context) {
            this.length = context.getApplicationContext();
        }

        private Void length() {
            long j;
            Context context = this.length;
            StringBuilder sb = new StringBuilder();
            sb.append(this.length.getPackageName());
            sb.append(".image_provider");
            SharedPreferences sharedPreferences = context.getSharedPreferences(sb.toString(), 0);
            if (!setMin(sharedPreferences)) {
                return null;
            }
            synchronized (BrowserServiceFileProvider.sFileCleanupLock) {
                File file = new File(this.length.getFilesDir(), "image_provider");
                if (!file.exists()) {
                    return null;
                }
                File[] listFiles = file.listFiles();
                long currentTimeMillis = System.currentTimeMillis() - getMin;
                boolean z = true;
                for (File file2 : listFiles) {
                    if (length(file2) && file2.lastModified() < currentTimeMillis && !file2.delete()) {
                        file2.getAbsoluteFile();
                        z = false;
                    }
                }
                if (z) {
                    j = System.currentTimeMillis();
                } else {
                    j = (System.currentTimeMillis() - getMax) + setMin;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong("last_cleanup_time", j);
                edit.apply();
                return null;
            }
        }

        private static boolean length(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean setMin(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong("last_cleanup_time", System.currentTimeMillis()) + getMax;
        }
    }

    static class getMax extends AsyncTask<String, Void, Void> {
        private final Uri getMax;
        private final IResultReceiver<Uri> getMin;
        private final Context length;
        private final String setMax;
        private final Bitmap setMin;

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return length();
        }

        getMax(Context context, String str, Bitmap bitmap, Uri uri, IResultReceiver<Uri> iResultReceiver) {
            this.length = context.getApplicationContext();
            this.setMax = str;
            this.setMin = bitmap;
            this.getMax = uri;
            this.getMin = iResultReceiver;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(6:31|32|33|34|35|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|21|22|23|(1:25)|26) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0097 */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007d A[Catch:{ IOException -> 0x008b }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0091 A[SYNTHETIC, Splitter:B:31:0x0091] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.Void length() {
            /*
                r8 = this;
                java.io.File r0 = new java.io.File
                android.content.Context r1 = r8.length
                java.io.File r1 = r1.getFilesDir()
                java.lang.String r2 = "image_provider"
                r0.<init>(r1, r2)
                java.lang.Object r1 = androidx.browser.browseractions.BrowserServiceFileProvider.sFileCleanupLock
                monitor-enter(r1)
                boolean r2 = r0.exists()     // Catch:{ all -> 0x00c8 }
                r3 = 0
                if (r2 != 0) goto L_0x002c
                boolean r2 = r0.mkdir()     // Catch:{ all -> 0x00c8 }
                if (r2 != 0) goto L_0x002c
                o.IResultReceiver<android.net.Uri> r0 = r8.getMin     // Catch:{ all -> 0x00c8 }
                java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00c8 }
                java.lang.String r4 = "Could not create file directory."
                r2.<init>(r4)     // Catch:{ all -> 0x00c8 }
                r0.getMax(r2)     // Catch:{ all -> 0x00c8 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
                goto L_0x00c7
            L_0x002c:
                java.io.File r2 = new java.io.File     // Catch:{ all -> 0x00c8 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c8 }
                r4.<init>()     // Catch:{ all -> 0x00c8 }
                java.lang.String r5 = r8.setMax     // Catch:{ all -> 0x00c8 }
                r4.append(r5)     // Catch:{ all -> 0x00c8 }
                java.lang.String r5 = ".png"
                r4.append(r5)     // Catch:{ all -> 0x00c8 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x00c8 }
                r2.<init>(r0, r4)     // Catch:{ all -> 0x00c8 }
                boolean r0 = r2.exists()     // Catch:{ all -> 0x00c8 }
                if (r0 == 0) goto L_0x0052
                o.IResultReceiver<android.net.Uri> r0 = r8.getMin     // Catch:{ all -> 0x00c8 }
                android.net.Uri r4 = r8.getMax     // Catch:{ all -> 0x00c8 }
                r0.setMin(r4)     // Catch:{ all -> 0x00c8 }
                goto L_0x00bf
            L_0x0052:
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c8 }
                r4 = 22
                r5 = 100
                if (r0 < r4) goto L_0x00a2
                o.setMessage r0 = new o.setMessage     // Catch:{ all -> 0x00c8 }
                r0.<init>(r2)     // Catch:{ all -> 0x00c8 }
                java.io.FileOutputStream r4 = r0.getMin()     // Catch:{ IOException -> 0x008d }
                android.graphics.Bitmap r6 = r8.setMin     // Catch:{ IOException -> 0x008b }
                android.graphics.Bitmap$CompressFormat r7 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x008b }
                r6.compress(r7, r5, r4)     // Catch:{ IOException -> 0x008b }
                r4.close()     // Catch:{ IOException -> 0x008b }
                o.setMessage.length(r4)     // Catch:{ IOException -> 0x008b }
                r4.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                java.io.File r5 = r0.length     // Catch:{ IOException -> 0x008b }
                java.io.File r6 = r0.setMax     // Catch:{ IOException -> 0x008b }
                boolean r7 = r6.isDirectory()     // Catch:{ IOException -> 0x008b }
                if (r7 == 0) goto L_0x0080
                r6.delete()     // Catch:{ IOException -> 0x008b }
            L_0x0080:
                r5.renameTo(r6)     // Catch:{ IOException -> 0x008b }
                o.IResultReceiver<android.net.Uri> r5 = r8.getMin     // Catch:{ IOException -> 0x008b }
                android.net.Uri r6 = r8.getMax     // Catch:{ IOException -> 0x008b }
                r5.setMin(r6)     // Catch:{ IOException -> 0x008b }
                goto L_0x00bf
            L_0x008b:
                r5 = move-exception
                goto L_0x008f
            L_0x008d:
                r5 = move-exception
                r4 = r3
            L_0x008f:
                if (r4 == 0) goto L_0x009c
                o.setMessage.length(r4)     // Catch:{ all -> 0x00c8 }
                r4.close()     // Catch:{ IOException -> 0x0097 }
            L_0x0097:
                java.io.File r0 = r0.length     // Catch:{ all -> 0x00c8 }
                r0.delete()     // Catch:{ all -> 0x00c8 }
            L_0x009c:
                o.IResultReceiver<android.net.Uri> r0 = r8.getMin     // Catch:{ all -> 0x00c8 }
                r0.getMax(r5)     // Catch:{ all -> 0x00c8 }
                goto L_0x00bf
            L_0x00a2:
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b9 }
                r0.<init>(r2)     // Catch:{ IOException -> 0x00b9 }
                android.graphics.Bitmap r4 = r8.setMin     // Catch:{ IOException -> 0x00b9 }
                android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x00b9 }
                r4.compress(r6, r5, r0)     // Catch:{ IOException -> 0x00b9 }
                r0.close()     // Catch:{ IOException -> 0x00b9 }
                o.IResultReceiver<android.net.Uri> r0 = r8.getMin     // Catch:{ IOException -> 0x00b9 }
                android.net.Uri r4 = r8.getMax     // Catch:{ IOException -> 0x00b9 }
                r0.setMin(r4)     // Catch:{ IOException -> 0x00b9 }
                goto L_0x00bf
            L_0x00b9:
                r0 = move-exception
                o.IResultReceiver<android.net.Uri> r4 = r8.getMin     // Catch:{ all -> 0x00c8 }
                r4.getMax(r0)     // Catch:{ all -> 0x00c8 }
            L_0x00bf:
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c8 }
                r2.setLastModified(r4)     // Catch:{ all -> 0x00c8 }
                monitor-exit(r1)     // Catch:{ all -> 0x00c8 }
            L_0x00c7:
                return r3
            L_0x00c8:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.browser.browseractions.BrowserServiceFileProvider.getMax.length():java.lang.Void");
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void onPostExecute(Object obj) {
            new getMin(this.length).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    @UiThread
    @NonNull
    public static IResultReceiver<Uri> saveBitmap(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(Integer.toString(i));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("image_provider_images/");
        sb2.append(obj);
        sb2.append(".png");
        String obj2 = sb2.toString();
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getPackageName());
        sb3.append(".image_provider");
        Uri build = scheme.authority(sb3.toString()).path(obj2).build();
        IResultReceiver<Uri> max = IResultReceiver.getMax();
        new getMax(context, obj, bitmap, build, max).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return max;
    }

    public static void grantReadPermission(@NonNull Intent intent, @Nullable List<Uri> list, @NonNull Context context) {
        if (list != null && list.size() != 0) {
            ContentResolver contentResolver = context.getContentResolver();
            intent.addFlags(1);
            ClipData newUri = ClipData.newUri(contentResolver, "image_provider_uris", list.get(0));
            for (int i = 1; i < list.size(); i++) {
                newUri.addItem(new ClipData.Item(list.get(i)));
            }
            intent.setClipData(newUri);
        }
    }

    @NonNull
    public static ListenableFuture<Bitmap> loadBitmap(@NonNull final ContentResolver contentResolver, @NonNull final Uri uri) {
        final IResultReceiver max = IResultReceiver.getMax();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {
            public final void run() {
                try {
                    ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, BranchLinkConstant.PayloadKey.REFERRAL);
                    if (openFileDescriptor == null) {
                        max.getMax(new FileNotFoundException());
                        return;
                    }
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                    openFileDescriptor.close();
                    if (decodeFileDescriptor == null) {
                        max.getMax(new IOException("File could not be decoded."));
                    } else {
                        max.setMin(decodeFileDescriptor);
                    }
                } catch (IOException e) {
                    max.getMax(e);
                }
            }
        });
        return max;
    }
}
