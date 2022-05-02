package o;

import android.app.RecoverableSecurityException;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001qB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ@\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020+2\u0006\u0010H\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020JH\u0002J$\u0010K\u001a\u00020?2\u0006\u0010L\u001a\u00020E2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010I\u001a\u00020JH\u0007J3\u0010O\u001a\u00020?2\u0006\u0010D\u001a\u00020E2\u0006\u0010I\u001a\u00020J2\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020?0QH\bJ4\u0010R\u001a\u0004\u0018\u00010E2\u0006\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u000b2\u0006\u0010U\u001a\u00020V2\u0006\u0010I\u001a\u00020JH\u0002J\u0006\u0010W\u001a\u00020\u001aJ\u0013\u0010X\u001a\u00020\u001a2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u000bH\u0002J\u0010\u0010]\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u000bH\u0002J\u0012\u0010^\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\\\u001a\u00020\u000bH\u0002J \u0010_\u001a\u00020`2\u0006\u0010L\u001a\u00020E2\u0006\u0010T\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020JH\u0002J\u001c\u0010a\u001a\u00020?2\u0006\u0010b\u001a\u00020c2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010JH\u0002J\b\u0010d\u001a\u00020[H\u0016J$\u0010e\u001a\u00020?2\u0006\u0010L\u001a\u00020E2\n\b\u0002\u0010M\u001a\u0004\u0018\u00010N2\u0006\u0010I\u001a\u00020JH\u0007J\u0010\u0010e\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u000bH\u0007J\u0010\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u000bH\u0007J\n\u0010i\u001a\u0004\u0018\u00010AH\u0007J\u0014\u0010j\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010k\u001a\u00020\u001aH\u0007J\u000e\u0010l\u001a\u00020\u001a2\u0006\u0010m\u001a\u00020\u000bJ\b\u0010n\u001a\u0004\u0018\u00010EJ\n\u0010o\u001a\u0004\u0018\u00010\u0005H\u0007J\b\u0010p\u001a\u00020\u000bH\u0016R\u0011\u0010\n\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\rR\u0016\u0010\u0002\u001a\n \u0018*\u0004\u0018\u00010\u00030\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0011\u0010\u001f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010\rR\u0011\u0010!\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0011\u0010#\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b#\u0010\u001cR\u0011\u0010$\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001cR$\u0010&\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u001a8G@GX\u000e¢\u0006\f\u001a\u0004\b&\u0010\u001c\"\u0004\b'\u0010(R\u0011\u0010)\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001cR\u0011\u0010*\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b,\u0010-R$\u0010.\u001a\u00020+2\u0006\u0010%\u001a\u00020+8F@FX\u000e¢\u0006\f\u001a\u0004\b/\u0010-\"\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b3\u0010\rR\u0013\u00104\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010\rR\u0013\u00106\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b7\u0010\rR\u0011\u00108\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b9\u0010\rR\u0013\u0010:\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b;\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=¨\u0006r"}, d2 = {"Lcom/anggrayudi/storage/media/MediaFile;", "", "context", "Landroid/content/Context;", "rawFile", "Ljava/io/File;", "(Landroid/content/Context;Ljava/io/File;)V", "uri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", "absolutePath", "", "getAbsolutePath", "()Ljava/lang/String;", "accessCallback", "Lcom/anggrayudi/storage/media/MediaFile$AccessCallback;", "getAccessCallback", "()Lcom/anggrayudi/storage/media/MediaFile$AccessCallback;", "setAccessCallback", "(Lcom/anggrayudi/storage/media/MediaFile$AccessCallback;)V", "baseName", "getBaseName", "basePath", "getBasePath", "kotlin.jvm.PlatformType", "exists", "", "getExists", "()Z", "extension", "getExtension", "formattedSize", "getFormattedSize", "fullName", "getFullName", "isEmpty", "isMine", "value", "isPending", "setPending", "(Z)V", "isRawFile", "lastModified", "", "getLastModified", "()J", "length", "getLength", "setLength", "(J)V", "mimeType", "getMimeType", "name", "getName", "owner", "getOwner", "relativePath", "getRelativePath", "type", "getType", "getUri", "()Landroid/net/Uri;", "copyFileStream", "", "inputStream", "Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "targetFile", "Landroidx/documentfile/provider/DocumentFile;", "watchProgress", "reportInterval", "deleteSourceFileWhenComplete", "callback", "Lcom/anggrayudi/storage/callback/FileCallback;", "copyTo", "targetFolder", "fileDescription", "Lcom/anggrayudi/storage/media/FileDescription;", "createFileStreams", "onStreamsReady", "Lkotlin/Function2;", "createTargetFile", "targetDirectory", "fileName", "mode", "Lcom/anggrayudi/storage/file/CreateMode;", "delete", "equals", "other", "getColumnInfoInt", "", "column", "getColumnInfoLong", "getColumnInfoString", "handleFileConflict", "Lcom/anggrayudi/storage/callback/FileCallback$ConflictResolution;", "handleSecurityException", "e", "Ljava/lang/SecurityException;", "hashCode", "moveTo", "openFileIntent", "Landroid/content/Intent;", "authority", "openInputStream", "openOutputStream", "append", "renameTo", "newName", "toDocumentFile", "toRawFile", "toString", "AccessCallback", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setContentInsetEndWithActions {
    @NotNull
    public final Uri length;
    @Nullable
    private length setMax;
    private final Context setMin;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/anggrayudi/storage/media/MediaFile$AccessCallback;", "", "onWriteAccessDenied", "", "mediaFile", "Lcom/anggrayudi/storage/media/MediaFile;", "sender", "Landroid/content/IntentSender;", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface length {
    }

    public setContentInsetEndWithActions(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.length = uri;
        this.setMin = context.getApplicationContext();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setContentInsetEndWithActions(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull java.io.File r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "rawFile"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            java.lang.String r0 = "fromFile(rawFile)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            r1.<init>((android.content.Context) r2, (android.net.Uri) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.<init>(android.content.Context, java.io.File):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean setMin() {
        /*
            r7 = this;
            android.content.Context r0 = r7.setMin
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r2 = r7.length
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r0
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x002b }
            int r2 = r2.getCount()     // Catch:{ all -> 0x002b }
            if (r2 <= 0) goto L_0x0026
            boolean r2 = r7.length()     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0026
            r1 = 1
        L_0x0026:
            r2 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r2)
            return r1
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r2 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.setMin():boolean");
    }

    public final boolean setMax() {
        return getContentInsetRight.length(this.length);
    }

    @RequiresApi(29)
    public final void toFloatRange() {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("is_pending", Integer.valueOf(Intrinsics.areEqual((Object) Boolean.FALSE, (Object) Boolean.TRUE) ? 1 : 0));
        try {
            this.setMin.getContentResolver().update(this.length, contentValues, (String) null, (String[]) null);
        } catch (SecurityException e) {
            getMin(e);
        }
    }

    private final void getMin(SecurityException securityException) {
        if (Build.VERSION.SDK_INT >= 29 && (securityException instanceof RecoverableSecurityException) && this.setMax != null) {
            Intrinsics.checkNotNullExpressionValue(((RecoverableSecurityException) securityException).getUserAction().getActionIntent().getIntentSender(), "e.userAction.actionIntent.intentSender");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String setMin(java.lang.String r8) {
        /*
            r7 = this;
            android.content.Context r0 = r7.setMin
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri r2 = r7.length
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r8
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)
            r1 = 0
            if (r0 == 0) goto L_0x003f
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r0
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x0038 }
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0032
            int r8 = r2.getColumnIndex(r8)     // Catch:{ all -> 0x0038 }
            r3 = -1
            if (r8 == r3) goto L_0x0032
            java.lang.String r8 = r2.getString(r8)     // Catch:{ all -> 0x0038 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            return r8
        L_0x0032:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0038 }
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            goto L_0x003f
        L_0x0038:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r8)
            throw r1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.setMin(java.lang.String):java.lang.String");
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof setContentInsetEndWithActions) && Intrinsics.areEqual((Object) ((setContentInsetEndWithActions) obj).length, (Object) this.length);
        }
        return true;
    }

    public final int hashCode() {
        return this.length.hashCode();
    }

    @NotNull
    public final String toString() {
        String obj = this.length.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "uri.toString()");
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r4.length.getPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean length() {
        /*
            r4 = this;
            boolean r0 = r4.setMax()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.net.Uri r0 = r4.length
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0015
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 != 0) goto L_0x001a
            r0 = r1
            goto L_0x0022
        L_0x001a:
            boolean r0 = r2.exists()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0022:
            if (r0 != 0) goto L_0x003c
            android.net.Uri r0 = r4.length
            android.content.Context r2 = r4.setMin
            java.lang.String r3 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.io.InputStream r0 = o.getContentInsetRight.getMin(r0, r2)
            if (r0 != 0) goto L_0x0035
            r0 = 0
            return r0
        L_0x0035:
            java.io.Closeable r0 = (java.io.Closeable) r0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            r0 = 1
            return r0
        L_0x003c:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.length():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r2 = r1.length.getPath();
     */
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint({"InlinedApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMax() {
        /*
            r19 = this;
            r1 = r19
            java.lang.String r0 = "_data"
            boolean r2 = r19.setMax()
            r3 = 0
            if (r2 == 0) goto L_0x0019
            android.net.Uri r2 = r1.length
            java.lang.String r2 = r2.getPath()
            if (r2 == 0) goto L_0x0019
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            goto L_0x001a
        L_0x0019:
            r4 = r3
        L_0x001a:
            java.lang.String r2 = "/"
            r5 = 0
            r6 = 1
            java.lang.String r7 = "<this>"
            java.lang.String r8 = "getExternalStorageDirectory().absolutePath"
            r9 = 2
            r10 = 47
            if (r4 == 0) goto L_0x005b
            java.lang.String r0 = r4.getPath()
            java.lang.String r4 = "file.path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.String r11 = kotlin.text.StringsKt.substringBeforeLast$default((java.lang.String) r0, (char) r10, (java.lang.String) r3, (int) r9, (java.lang.Object) r3)
            o.setContentInsetsRelative$setMax r0 = o.setContentInsetsRelative.length
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r12 = r0.getAbsolutePath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r8)
            r14 = 0
            r15 = 4
            r16 = 0
            java.lang.String r13 = ""
            java.lang.String r0 = kotlin.text.StringsKt.replaceFirst$default((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (boolean) r14, (int) r15, (java.lang.Object) r16)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
            char[] r3 = new char[r6]
            r3[r5] = r10
            java.lang.String r0 = kotlin.text.StringsKt.trim((java.lang.String) r0, (char[]) r3)
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)
            return r0
        L_0x005b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r11 = 29
            java.lang.String r12 = ""
            if (r4 >= r11) goto L_0x00d5
            android.content.Context r4 = r1.setMin     // Catch:{ Exception -> 0x00d4 }
            android.content.ContentResolver r13 = r4.getContentResolver()     // Catch:{ Exception -> 0x00d4 }
            android.net.Uri r14 = r1.length     // Catch:{ Exception -> 0x00d4 }
            java.lang.String[] r15 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x00d4 }
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r4 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x00d4 }
            if (r4 != 0) goto L_0x007c
            goto L_0x00c6
        L_0x007c:
            java.io.Closeable r4 = (java.io.Closeable) r4     // Catch:{ Exception -> 0x00d4 }
            r11 = r4
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ all -> 0x00cb }
            boolean r13 = r11.moveToFirst()     // Catch:{ all -> 0x00cb }
            if (r13 == 0) goto L_0x00c1
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r11 = "cursor.getString(cursor.getColumnIndex(MediaStore.MediaColumns.DATA))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r11)     // Catch:{ all -> 0x00cb }
            java.lang.String r13 = kotlin.text.StringsKt.substringBeforeLast$default((java.lang.String) r0, (char) r10, (java.lang.String) r3, (int) r9, (java.lang.Object) r3)     // Catch:{ all -> 0x00cb }
            o.setContentInsetsRelative$setMax r0 = o.setContentInsetsRelative.length     // Catch:{ all -> 0x00cb }
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00cb }
            java.lang.String r14 = r0.getAbsolutePath()     // Catch:{ all -> 0x00cb }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r8)     // Catch:{ all -> 0x00cb }
            java.lang.String r15 = ""
            r16 = 0
            r17 = 4
            r18 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replaceFirst$default((java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (boolean) r16, (int) r17, (java.lang.Object) r18)     // Catch:{ all -> 0x00cb }
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch:{ all -> 0x00cb }
            char[] r6 = new char[r6]     // Catch:{ all -> 0x00cb }
            r6[r5] = r10     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = kotlin.text.StringsKt.trim((java.lang.String) r0, (char[]) r6)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r2)     // Catch:{ all -> 0x00cb }
            goto L_0x00c2
        L_0x00c1:
            r0 = r12
        L_0x00c2:
            kotlin.io.CloseableKt.closeFinally(r4, r3)     // Catch:{ Exception -> 0x00d4 }
            r3 = r0
        L_0x00c6:
            if (r3 != 0) goto L_0x00c9
            goto L_0x00d4
        L_0x00c9:
            r12 = r3
            goto L_0x00d4
        L_0x00cb:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            r3 = r0
            kotlin.io.CloseableKt.closeFinally(r4, r2)     // Catch:{ Exception -> 0x00d4 }
            throw r3     // Catch:{ Exception -> 0x00d4 }
        L_0x00d4:
            return r12
        L_0x00d5:
            java.lang.String r0 = "relative_path"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            android.content.Context r2 = r1.setMin
            android.content.ContentResolver r4 = r2.getContentResolver()
            android.net.Uri r5 = r1.length
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)
            if (r2 != 0) goto L_0x00ed
            goto L_0x0106
        L_0x00ed:
            java.io.Closeable r2 = (java.io.Closeable) r2
            r4 = r2
            android.database.Cursor r4 = (android.database.Cursor) r4     // Catch:{ all -> 0x010b }
            boolean r5 = r4.moveToFirst()     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x0101
            int r0 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x010b }
            java.lang.String r0 = r4.getString(r0)     // Catch:{ all -> 0x010b }
            goto L_0x0102
        L_0x0101:
            r0 = r12
        L_0x0102:
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            r3 = r0
        L_0x0106:
            if (r3 != 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r12 = r3
        L_0x010a:
            return r12
        L_0x010b:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            r4 = r0
            kotlin.io.CloseableKt.closeFinally(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.getMax():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r5.length.getPath();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean getMin() {
        /*
            r5 = this;
            boolean r0 = r5.setMax()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            android.net.Uri r0 = r5.length
            java.lang.String r0 = r0.getPath()
            if (r0 == 0) goto L_0x0015
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            r0 = 1
            r3 = 0
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.delete()
            if (r1 != 0) goto L_0x0028
            boolean r1 = r2.exists()
            if (r1 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            return r3
        L_0x0028:
            return r0
        L_0x0029:
            android.content.Context r2 = r5.setMin     // Catch:{ SecurityException -> 0x003b }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ SecurityException -> 0x003b }
            android.net.Uri r4 = r5.length     // Catch:{ SecurityException -> 0x003b }
            int r1 = r2.delete(r4, r1, r1)     // Catch:{ SecurityException -> 0x003b }
            if (r1 <= 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            r3 = r0
            goto L_0x003f
        L_0x003b:
            r0 = move-exception
            r5.getMin(r0)
        L_0x003f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.getMin():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        r1 = r3.length.getPath();
     */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream isInside() {
        /*
            r3 = this;
            r0 = 0
            boolean r1 = r3.setMax()     // Catch:{ IOException -> 0x002d }
            if (r1 == 0) goto L_0x0015
            android.net.Uri r1 = r3.length     // Catch:{ IOException -> 0x002d }
            java.lang.String r1 = r1.getPath()     // Catch:{ IOException -> 0x002d }
            if (r1 == 0) goto L_0x0015
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x002d }
            r2.<init>(r1)     // Catch:{ IOException -> 0x002d }
            goto L_0x0016
        L_0x0015:
            r2 = r0
        L_0x0016:
            if (r2 == 0) goto L_0x0021
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x002d }
            r1.<init>(r2)     // Catch:{ IOException -> 0x002d }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ IOException -> 0x002d }
            r0 = r1
            goto L_0x002d
        L_0x0021:
            android.content.Context r1 = r3.setMin     // Catch:{ IOException -> 0x002d }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x002d }
            android.net.Uri r2 = r3.length     // Catch:{ IOException -> 0x002d }
            java.io.InputStream r0 = r1.openInputStream(r2)     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setContentInsetEndWithActions.isInside():java.io.InputStream");
    }
}
