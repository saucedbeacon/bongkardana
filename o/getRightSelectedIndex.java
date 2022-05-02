package o;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J2\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/util/MediaStoreUtil;", "", "()V", "DANA_DIRECTORY", "", "deleteMedia", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "saveBitmapToMediaStore", "", "fileName", "format", "bitmap", "Landroid/graphics/Bitmap;", "folderName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getRightSelectedIndex {
    @NotNull
    public static final getRightSelectedIndex setMax = new getRightSelectedIndex();

    private getRightSelectedIndex() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.io.CloseableKt.closeFinally(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        throw r8;
     */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean length(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull android.graphics.Bitmap r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "folderName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r8
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0026
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 == 0) goto L_0x002c
            java.lang.String r8 = "DANA"
            goto L_0x0036
        L_0x002c:
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "DANA/"
            java.lang.String r8 = r0.concat(r8)
        L_0x0036:
            o.getCurrentContentInsetRight r0 = new o.getCurrentContentInsetRight
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r5 = 46
            r3.append(r5)
            r3.append(r6)
            java.lang.String r5 = r3.toString()
            char[] r1 = new char[r1]
            r3 = 47
            r1[r2] = r3
            java.lang.String r8 = kotlin.text.StringsKt.trimEnd((java.lang.String) r8, (char[]) r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "image/"
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r5, r8, r6)
            android.net.Uri r5 = o.getContentInsetLeft.length(r4, r0)
            if (r5 != 0) goto L_0x006a
            return r2
        L_0x006a:
            java.io.OutputStream r6 = o.getContentInsetRight.getMax(r5, r4)     // Catch:{ Exception -> 0x009b }
            if (r6 == 0) goto L_0x0097
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch:{ Exception -> 0x009b }
            r8 = r6
            java.io.OutputStream r8 = (java.io.OutputStream) r8     // Catch:{ all -> 0x0090 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0090 }
            r1 = 100
            boolean r7 = r7.compress(r0, r1, r8)     // Catch:{ all -> 0x0090 }
            boolean r8 = o.getContentInsetRight.setMin(r5)     // Catch:{ all -> 0x0090 }
            if (r8 == 0) goto L_0x008b
            o.setContentInsetEndWithActions r8 = new o.setContentInsetEndWithActions     // Catch:{ all -> 0x0090 }
            r8.<init>((android.content.Context) r4, (android.net.Uri) r5)     // Catch:{ all -> 0x0090 }
            r8.toFloatRange()     // Catch:{ all -> 0x0090 }
        L_0x008b:
            r8 = 0
            kotlin.io.CloseableKt.closeFinally(r6, r8)     // Catch:{ Exception -> 0x009b }
            return r7
        L_0x0090:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r6, r7)     // Catch:{ Exception -> 0x009b }
            throw r8     // Catch:{ Exception -> 0x009b }
        L_0x0097:
            length(r4, r5)     // Catch:{ Exception -> 0x009b }
            goto L_0x009e
        L_0x009b:
            length(r4, r5)
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getRightSelectedIndex.length(android.content.Context, java.lang.String, java.lang.String, android.graphics.Bitmap, java.lang.String):boolean");
    }

    private static void length(Context context, Uri uri) {
        if (getContentInsetRight.setMin(uri)) {
            new setContentInsetEndWithActions(context, uri).getMin();
            return;
        }
        superDispatchKeyEvent min = getContentInsetLeft.setMin(context, uri);
        if (min != null) {
            min.equals();
        }
    }
}
