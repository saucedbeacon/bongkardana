package o;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import com.j256.ormlite.field.FieldType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.AlertController$RecycleListView;
import o.PlaybackStateCompat;

public final class Experimental {
    private static final Comparator<byte[]> getMin = new Comparator<byte[]>() {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* bridge */ /* synthetic */ int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                if (r0 == r1) goto L_0x000c
                int r5 = r5.length
                int r6 = r6.length
            L_0x000a:
                int r5 = r5 - r6
                return r5
            L_0x000c:
                r0 = 0
                r1 = 0
            L_0x000e:
                int r2 = r5.length
                if (r1 >= r2) goto L_0x001f
                byte r2 = r5[r1]
                byte r3 = r6[r1]
                if (r2 == r3) goto L_0x001c
                byte r5 = r5[r1]
                byte r6 = r6[r1]
                goto L_0x000a
            L_0x001c:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x001f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Experimental.AnonymousClass2.compare(java.lang.Object, java.lang.Object):int");
        }
    };

    @NonNull
    public static FontsContractCompat.length getMin(@NonNull Context context, @NonNull UseExperimental useExperimental, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        List<List<byte[]>> list;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = useExperimental.getMin;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(String.valueOf(str)));
        } else if (resolveContentProvider.packageName.equals(useExperimental.length)) {
            List<byte[]> min = setMin(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(min, getMin);
            if (useExperimental.setMin != null) {
                list = useExperimental.setMin;
            } else {
                list = FontResourcesParserCompat.getMin(resources, useExperimental.setMax);
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    resolveContentProvider = null;
                    break;
                }
                ArrayList arrayList = new ArrayList(list.get(i));
                Collections.sort(arrayList, getMin);
                if (setMax(min, arrayList)) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return FontsContractCompat.length.setMax(1, (FontsContractCompat.setMin[]) null);
            }
            return FontsContractCompat.length.setMax(0, length(context, useExperimental, resolveContentProvider.authority, cancellationSignal));
        } else {
            StringBuilder sb = new StringBuilder("Found content provider ");
            sb.append(str);
            sb.append(", but package was not ");
            sb.append(useExperimental.length);
            throw new PackageManager.NameNotFoundException(sb.toString());
        }
    }

    public final class Level {
        static final PlaybackStateCompat.ErrorCode<String, Typeface> getMax = new PlaybackStateCompat.ErrorCode<>(16);
        private static final ExecutorService getMin;
        static final Object length = new Object();
        @GuardedBy("LOCK")
        static final PlaybackStateCompat.RepeatMode<String, ArrayList<setIcon<setMin>>> setMin = new PlaybackStateCompat.RepeatMode<>();

        static {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new AlertController$RecycleListView.getMax("fonts-androidx"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            getMin = threadPoolExecutor;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
        @androidx.annotation.NonNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static o.Experimental.Level.setMin getMin(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.NonNull o.UseExperimental r9, int r10) {
            /*
                o.PlaybackStateCompat$ErrorCode<java.lang.String, android.graphics.Typeface> r0 = getMax
                java.lang.Object r0 = r0.get(r7)
                android.graphics.Typeface r0 = (android.graphics.Typeface) r0
                if (r0 == 0) goto L_0x0010
                o.Experimental$Level$setMin r7 = new o.Experimental$Level$setMin
                r7.<init>((android.graphics.Typeface) r0)
                return r7
            L_0x0010:
                r0 = 0
                androidx.core.provider.FontsContractCompat$length r9 = o.Experimental.getMin(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x006a }
                int r1 = r9.setMin()
                r2 = 0
                r3 = -3
                r4 = 1
                if (r1 == 0) goto L_0x0028
                int r1 = r9.setMin()
                if (r1 == r4) goto L_0x0026
            L_0x0024:
                r2 = -3
                goto L_0x0047
            L_0x0026:
                r2 = -2
                goto L_0x0047
            L_0x0028:
                androidx.core.provider.FontsContractCompat$setMin[] r1 = r9.length()
                if (r1 == 0) goto L_0x0046
                int r5 = r1.length
                if (r5 != 0) goto L_0x0032
                goto L_0x0046
            L_0x0032:
                int r4 = r1.length
                r5 = 0
            L_0x0034:
                if (r5 >= r4) goto L_0x0047
                r6 = r1[r5]
                int r6 = r6.setMin()
                if (r6 == 0) goto L_0x0043
                if (r6 >= 0) goto L_0x0041
                goto L_0x0024
            L_0x0041:
                r2 = r6
                goto L_0x0047
            L_0x0043:
                int r5 = r5 + 1
                goto L_0x0034
            L_0x0046:
                r2 = 1
            L_0x0047:
                if (r2 == 0) goto L_0x004f
                o.Experimental$Level$setMin r7 = new o.Experimental$Level$setMin
                r7.<init>((int) r2)
                return r7
            L_0x004f:
                androidx.core.provider.FontsContractCompat$setMin[] r9 = r9.length()
                android.graphics.Typeface r8 = o.RequiresApi.getMax(r8, r0, r9, r10)
                if (r8 == 0) goto L_0x0064
                o.PlaybackStateCompat$ErrorCode<java.lang.String, android.graphics.Typeface> r9 = getMax
                r9.put(r7, r8)
                o.Experimental$Level$setMin r7 = new o.Experimental$Level$setMin
                r7.<init>((android.graphics.Typeface) r8)
                return r7
            L_0x0064:
                o.Experimental$Level$setMin r7 = new o.Experimental$Level$setMin
                r7.<init>((int) r3)
                return r7
            L_0x006a:
                o.Experimental$Level$setMin r7 = new o.Experimental$Level$setMin
                r8 = -1
                r7.<init>((int) r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Experimental.Level.getMin(java.lang.String, android.content.Context, o.UseExperimental, int):o.Experimental$Level$setMin");
        }

        static final class setMin {
            final int length;
            final Typeface setMin;

            setMin(int i) {
                this.setMin = null;
                this.length = i;
            }

            @SuppressLint({"WrongConstant"})
            setMin(@NonNull Typeface typeface) {
                this.setMin = typeface;
                this.length = 0;
            }

            /* access modifiers changed from: package-private */
            @SuppressLint({"WrongConstant"})
            public final boolean setMax() {
                return this.length == 0;
            }
        }

        public static Typeface setMin(@NonNull final Context context, @NonNull final UseExperimental useExperimental, @NonNull XmlRes xmlRes, final int i, int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(useExperimental.isInside);
            sb.append("-");
            sb.append(i);
            final String obj = sb.toString();
            Typeface typeface = getMax.get(obj);
            if (typeface != null) {
                xmlRes.setMax(new setMin(typeface));
                return typeface;
            } else if (i2 == -1) {
                setMin min = getMin(obj, context, useExperimental, i);
                xmlRes.setMax(min);
                return min.setMin;
            } else {
                try {
                    setMin setmin = (setMin) AlertController$RecycleListView.setMax(getMin, new Callable<setMin>() {
                        public final /* synthetic */ Object call() throws Exception {
                            return Level.getMin(obj, context, useExperimental, i);
                        }
                    }, i2);
                    xmlRes.setMax(setmin);
                    return setmin.setMin;
                } catch (InterruptedException unused) {
                    xmlRes.setMax(new setMin(-3));
                    return null;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            r7 = new o.Experimental.Level.AnonymousClass5();
            r4 = getMin;
            r5 = new o.Experimental.Level.AnonymousClass2();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
            if (android.os.Looper.myLooper() != null) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
            r6 = new android.os.Handler(android.os.Looper.getMainLooper());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
            r6 = new android.os.Handler();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
            r4.execute(new o.AlertController$RecycleListView.getMin(r6, r7, r5));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.graphics.Typeface setMin(@androidx.annotation.NonNull final android.content.Context r4, @androidx.annotation.NonNull final o.UseExperimental r5, final int r6, @androidx.annotation.NonNull final o.XmlRes r7) {
            /*
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r5.isInside
                r0.append(r1)
                java.lang.String r1 = "-"
                r0.append(r1)
                r0.append(r6)
                java.lang.String r0 = r0.toString()
                o.PlaybackStateCompat$ErrorCode<java.lang.String, android.graphics.Typeface> r1 = getMax
                java.lang.Object r1 = r1.get(r0)
                android.graphics.Typeface r1 = (android.graphics.Typeface) r1
                if (r1 == 0) goto L_0x0029
                o.Experimental$Level$setMin r4 = new o.Experimental$Level$setMin
                r4.<init>((android.graphics.Typeface) r1)
                r7.setMax(r4)
                return r1
            L_0x0029:
                o.Experimental$Level$1 r1 = new o.Experimental$Level$1
                r1.<init>()
                java.lang.Object r7 = length
                monitor-enter(r7)
                o.PlaybackStateCompat$RepeatMode<java.lang.String, java.util.ArrayList<o.setIcon<o.Experimental$Level$setMin>>> r2 = setMin     // Catch:{ all -> 0x0079 }
                java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0079 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0079 }
                r3 = 0
                if (r2 == 0) goto L_0x0041
                r2.add(r1)     // Catch:{ all -> 0x0079 }
                monitor-exit(r7)     // Catch:{ all -> 0x0079 }
                return r3
            L_0x0041:
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0079 }
                r2.<init>()     // Catch:{ all -> 0x0079 }
                r2.add(r1)     // Catch:{ all -> 0x0079 }
                o.PlaybackStateCompat$RepeatMode<java.lang.String, java.util.ArrayList<o.setIcon<o.Experimental$Level$setMin>>> r1 = setMin     // Catch:{ all -> 0x0079 }
                r1.put(r0, r2)     // Catch:{ all -> 0x0079 }
                monitor-exit(r7)     // Catch:{ all -> 0x0079 }
                o.Experimental$Level$5 r7 = new o.Experimental$Level$5
                r7.<init>(r0, r4, r5, r6)
                java.util.concurrent.ExecutorService r4 = getMin
                o.Experimental$Level$2 r5 = new o.Experimental$Level$2
                r5.<init>(r0)
                android.os.Looper r6 = android.os.Looper.myLooper()
                if (r6 != 0) goto L_0x006b
                android.os.Handler r6 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r6.<init>(r0)
                goto L_0x0070
            L_0x006b:
                android.os.Handler r6 = new android.os.Handler
                r6.<init>()
            L_0x0070:
                o.AlertController$RecycleListView$getMin r0 = new o.AlertController$RecycleListView$getMin
                r0.<init>(r6, r7, r5)
                r4.execute(r0)
                return r3
            L_0x0079:
                r4 = move-exception
                monitor-exit(r7)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Experimental.Level.setMin(android.content.Context, o.UseExperimental, int, o.XmlRes):android.graphics.Typeface");
        }
    }

    @VisibleForTesting
    @NonNull
    private static FontsContractCompat.setMin[] length(Context context, UseExperimental useExperimental, String str, CancellationSignal cancellationSignal) {
        Cursor cursor;
        int i;
        Uri uri;
        UseExperimental useExperimental2 = useExperimental;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor2 = null;
        try {
            String[] strArr = {FieldType.FOREIGN_ID_FIELD_SUFFIX, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{useExperimental2.getMax}, (String) null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{useExperimental2.getMax}, (String) null);
            }
            cursor2 = cursor;
            if (cursor2 != null && cursor2.getCount() > 0) {
                int columnIndex = cursor2.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor2.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX);
                int columnIndex3 = cursor2.getColumnIndex("file_id");
                int columnIndex4 = cursor2.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor2.getColumnIndex("font_weight");
                int columnIndex6 = cursor2.getColumnIndex("font_italic");
                while (cursor2.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursor2.getInt(columnIndex) : 0;
                    int i3 = columnIndex4 != -1 ? cursor2.getInt(columnIndex4) : 0;
                    if (columnIndex3 == -1) {
                        i = i3;
                        uri = ContentUris.withAppendedId(build, cursor2.getLong(columnIndex2));
                    } else {
                        i = i3;
                        uri = ContentUris.withAppendedId(build2, cursor2.getLong(columnIndex3));
                    }
                    arrayList.add(FontsContractCompat.setMin.setMax(uri, i, columnIndex5 != -1 ? cursor2.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor2.getInt(columnIndex6) == 1, i2));
                }
            }
            return (FontsContractCompat.setMin[]) arrayList.toArray(new FontsContractCompat.setMin[0]);
        } finally {
            if (cursor2 != null) {
                cursor2.close();
            }
        }
    }

    private static boolean setMax(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static List<byte[]> setMin(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }
}
