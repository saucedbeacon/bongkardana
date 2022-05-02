package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.anggrayudi.storage.file.CreateMode;
import com.anggrayudi.storage.media.ImageMediaDirectory;
import com.anggrayudi.storage.media.MediaType;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.j256.ormlite.field.FieldType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J$\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J.\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J2\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J.\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u001a2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007J\"\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0004H\u0007J\"\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J&\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\"\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0007J&\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u0004H\u0007J\"\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(H\u0007J\"\u0010&\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010'\u001a\u00020\u0004H\u0007J\u001e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u0004H\u0007J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020.H\u0007J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0004H\u0007J\"\u0010,\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0007J\u0012\u00100\u001a\u0004\u0018\u00010\u00172\u0006\u00101\u001a\u00020\u0004H\u0003R\u001a\u0010\u0003\u001a\u00020\u00048GX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u00062"}, d2 = {"Lcom/anggrayudi/storage/media/MediaStoreCompat;", "", "()V", "volumeName", "", "getVolumeName$annotations", "getVolumeName", "()Ljava/lang/String;", "createAudio", "Lcom/anggrayudi/storage/media/MediaFile;", "context", "Landroid/content/Context;", "file", "Lcom/anggrayudi/storage/media/FileDescription;", "relativeParentDirectory", "Lcom/anggrayudi/storage/media/AudioMediaDirectory;", "mode", "Lcom/anggrayudi/storage/file/CreateMode;", "createDownload", "createImage", "Lcom/anggrayudi/storage/media/ImageMediaDirectory;", "createMedia", "mediaType", "Lcom/anggrayudi/storage/media/MediaType;", "folderName", "createVideo", "Lcom/anggrayudi/storage/media/VideoMediaDirectory;", "fromBasePath", "basePath", "fromCursorToMediaFile", "cursor", "Landroid/database/Cursor;", "fromCursorToMediaFiles", "", "fromFileName", "name", "fromFileNameContains", "containsName", "fromMediaId", "id", "", "fromMediaType", "fromMimeType", "mimeType", "fromRelativePath", "publicDirectory", "Lcom/anggrayudi/storage/file/PublicDirectory;", "relativePath", "mediaTypeFromRelativePath", "cleanRelativePath", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentContentInsetLeft {
    @NotNull
    public static final getCurrentContentInsetLeft getMax = new getCurrentContentInsetLeft();

    @JvmStatic
    @Nullable
    @JvmOverloads
    public static final setContentInsetEndWithActions getMin(@NotNull Context context, @NotNull getCurrentContentInsetRight getcurrentcontentinsetright) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetright, "file");
        return setMin(context, getcurrentcontentinsetright);
    }

    private getCurrentContentInsetLeft() {
    }

    @NotNull
    @SuppressLint({"InlinedApi"})
    public static final String length() {
        return Build.VERSION.SDK_INT < 29 ? "external" : "external_primary";
    }

    public static /* synthetic */ setContentInsetEndWithActions setMin(Context context, getCurrentContentInsetRight getcurrentcontentinsetright) {
        CreateMode createMode = CreateMode.CREATE_NEW;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetright, "file");
        Intrinsics.checkNotNullParameter(createMode, "mode");
        MediaType mediaType = MediaType.DOWNLOADS;
        String str = Environment.DIRECTORY_DOWNLOADS;
        Intrinsics.checkNotNullExpressionValue(str, "DIRECTORY_DOWNLOADS");
        return getMax(context, mediaType, str, getcurrentcontentinsetright, createMode);
    }

    public static /* synthetic */ setContentInsetEndWithActions getMax(Context context, getCurrentContentInsetRight getcurrentcontentinsetright) {
        ImageMediaDirectory imageMediaDirectory = ImageMediaDirectory.PICTURES;
        CreateMode createMode = CreateMode.CREATE_NEW;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetright, "file");
        Intrinsics.checkNotNullParameter(imageMediaDirectory, "relativeParentDirectory");
        Intrinsics.checkNotNullParameter(createMode, "mode");
        return getMax(context, MediaType.IMAGE, imageMediaDirectory.getFolderName(), getcurrentcontentinsetright, createMode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01be, code lost:
        if (o.getContentInsetLeft.getMax().matches(r9) != false) goto L_0x01c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0263 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0191 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.setContentInsetEndWithActions getMax(android.content.Context r20, com.anggrayudi.storage.media.MediaType r21, java.lang.String r22, o.getCurrentContentInsetRight r23, com.anggrayudi.storage.file.CreateMode r24) {
        /*
            r0 = r20
            r1 = r21
            r2 = r23
            r3 = r24
            int r4 = android.os.Build.VERSION.SDK_INT
            java.lang.String r5 = "<this>"
            r6 = 47
            r7 = 0
            r8 = 29
            if (r4 < r8) goto L_0x02c6
            long r8 = java.lang.System.currentTimeMillis()
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r10 = r2.length
            java.lang.String r11 = "_display_name"
            r4.put(r11, r10)
            java.lang.String r10 = r2.getMin
            java.lang.String r12 = "mime_type"
            r4.put(r12, r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r8)
            java.lang.String r12 = "date_added"
            r4.put(r12, r10)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.String r9 = "date_modified"
            r4.put(r9, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r22
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = r2.setMax
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r5)
            r5 = 1
            char[] r9 = new char[r5]
            r10 = 0
            r9[r10] = r6
            java.lang.String r8 = kotlin.text.StringsKt.trim((java.lang.String) r8, (char[]) r9)
            java.lang.String r9 = r20.getPackageName()
            java.lang.String r12 = "owner_package_name"
            r4.put(r12, r9)
            r9 = r8
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r12 = kotlin.text.StringsKt.isBlank(r9)
            r12 = r12 ^ r5
            if (r12 == 0) goto L_0x0077
            java.lang.String r12 = "relative_path"
            r4.put(r12, r8)
        L_0x0077:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r8)
            r12.append(r6)
            java.lang.String r6 = r2.length
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            o.setContentInsetEndWithActions r6 = length(r0, r1, r6)
            if (r6 == 0) goto L_0x0099
            boolean r12 = r6.setMin()
            if (r12 != r5) goto L_0x0099
            r12 = 1
            goto L_0x009a
        L_0x0099:
            r12 = 0
        L_0x009a:
            if (r12 == 0) goto L_0x009d
            return r6
        L_0x009d:
            if (r6 == 0) goto L_0x00a7
            boolean r12 = r6.length()
            if (r12 != r5) goto L_0x00a7
            r12 = 1
            goto L_0x00a8
        L_0x00a7:
            r12 = 0
        L_0x00a8:
            if (r12 == 0) goto L_0x02ad
            com.anggrayudi.storage.file.CreateMode r12 = com.anggrayudi.storage.file.CreateMode.REUSE
            if (r3 != r12) goto L_0x00af
            return r6
        L_0x00af:
            com.anggrayudi.storage.file.CreateMode r12 = com.anggrayudi.storage.file.CreateMode.REPLACE
            if (r3 != r12) goto L_0x00ce
            r6.getMin()
            o.setContentInsetEndWithActions r2 = new o.setContentInsetEndWithActions
            android.content.ContentResolver r3 = r20.getContentResolver()
            android.net.Uri r1 = r21.getWriteUri()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.net.Uri r1 = r3.insert(r1, r4)
            if (r1 != 0) goto L_0x00ca
            return r7
        L_0x00ca:
            r2.<init>((android.content.Context) r0, (android.net.Uri) r1)
            return r2
        L_0x00ce:
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r6 = r2.getMin
            java.lang.String r3 = r3.getExtensionFromMimeType(r6)
            java.lang.String r6 = ""
            r12 = 46
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = r2.length
            java.lang.String r3 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r3, (char) r12, (java.lang.String) r6)
        L_0x00e4:
            java.lang.String r13 = "MimeTypeMap.getSingleton().getExtensionFromMimeType(file.mimeType) ?: file.name.substringAfterLast('.', \"\")"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r13)
            java.lang.String r2 = r2.length
            r13 = 2
            java.lang.String r2 = kotlin.text.StringsKt.substringBeforeLast$default((java.lang.String) r2, (char) r12, (java.lang.String) r7, (int) r13, (java.lang.Object) r7)
            java.lang.String r14 = " ("
            java.lang.String r15 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r14)
            java.util.List r16 = getMin((android.content.Context) r0, (com.anggrayudi.storage.media.MediaType) r1, (java.lang.String) r2)
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r12 = r17
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.Iterator r16 = r16.iterator()
        L_0x0109:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x013e
            java.lang.Object r5 = r16.next()
            r18 = r5
            o.setContentInsetEndWithActions r18 = (o.setContentInsetEndWithActions) r18
            boolean r19 = kotlin.text.StringsKt.isBlank(r9)
            if (r19 != 0) goto L_0x0134
            java.lang.String r7 = r18.getMax()
            java.lang.String r18 = "/"
            r10 = r18
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            java.lang.String r7 = kotlin.text.StringsKt.removeSuffix((java.lang.String) r7, (java.lang.CharSequence) r10)
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0132
            goto L_0x0134
        L_0x0132:
            r7 = 0
            goto L_0x0135
        L_0x0134:
            r7 = 1
        L_0x0135:
            if (r7 == 0) goto L_0x013a
            r12.add(r5)
        L_0x013a:
            r5 = 1
            r7 = 0
            r10 = 0
            goto L_0x0109
        L_0x013e:
            java.util.List r12 = (java.util.List) r12
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r7 = r12.iterator()
        L_0x014d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0182
            java.lang.Object r8 = r7.next()
            o.setContentInsetEndWithActions r8 = (o.setContentInsetEndWithActions) r8
            boolean r9 = r8.setMax()
            if (r9 == 0) goto L_0x016d
            android.net.Uri r9 = r8.length
            java.lang.String r9 = r9.getPath()
            if (r9 == 0) goto L_0x016d
            java.io.File r10 = new java.io.File
            r10.<init>(r9)
            goto L_0x016e
        L_0x016d:
            r10 = 0
        L_0x016e:
            if (r10 != 0) goto L_0x0172
            r9 = 0
            goto L_0x0176
        L_0x0172:
            java.lang.String r9 = r10.getName()
        L_0x0176:
            if (r9 != 0) goto L_0x017c
            java.lang.String r9 = r8.setMin(r11)
        L_0x017c:
            if (r9 == 0) goto L_0x014d
            r5.add(r9)
            goto L_0x014d
        L_0x0182:
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.Iterator r5 = r5.iterator()
        L_0x0191:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01c9
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            r12 = 0
            boolean r16 = kotlin.text.StringsKt.startsWith$default(r9, r15, r10, r13, r12)
            if (r16 == 0) goto L_0x01c2
            o.getContentInsetLeft r10 = o.getContentInsetLeft.setMin
            kotlin.text.Regex r10 = o.getContentInsetLeft.setMin()
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            boolean r10 = r10.matches(r9)
            if (r10 != 0) goto L_0x01c0
            o.getContentInsetLeft r10 = o.getContentInsetLeft.setMin
            kotlin.text.Regex r10 = o.getContentInsetLeft.getMax()
            boolean r9 = r10.matches(r9)
            if (r9 == 0) goto L_0x01c2
        L_0x01c0:
            r9 = 1
            goto L_0x01c3
        L_0x01c2:
            r9 = 0
        L_0x01c3:
            if (r9 == 0) goto L_0x0191
            r7.add(r8)
            goto L_0x0191
        L_0x01c9:
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r5 = r7.iterator()
            boolean r7 = r5.hasNext()
            if (r7 != 0) goto L_0x01d9
            r7 = 0
            goto L_0x01f7
        L_0x01d9:
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Comparable r7 = (java.lang.Comparable) r7
        L_0x01e1:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x01f7
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r9 = r7.compareTo(r8)
            if (r9 >= 0) goto L_0x01e1
            r7 = r8
            goto L_0x01e1
        L_0x01f7:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L_0x01fc
            r7 = r6
        L_0x01fc:
            r5 = 40
            java.lang.String r5 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r7, (char) r5, (java.lang.String) r6)
            r7 = 41
            java.lang.String r5 = kotlin.text.StringsKt.substringBefore((java.lang.String) r5, (char) r7, (java.lang.String) r6)
            java.lang.Integer r5 = kotlin.text.StringsKt.toIntOrNull(r5)
            if (r5 != 0) goto L_0x0210
            r10 = 0
            goto L_0x0215
        L_0x0210:
            int r5 = r5.intValue()
            r10 = r5
        L_0x0215:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r14)
            r5.append(r10)
            java.lang.String r6 = ")."
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r7 = 1
            char[] r8 = new char[r7]
            r7 = 46
            r9 = 0
            r8[r9] = r7
            java.lang.String r5 = kotlin.text.StringsKt.trimEnd((java.lang.String) r5, (char[]) r8)
            o.setContentInsetEndWithActions r5 = setMax(r0, r1, r5)
            if (r5 != 0) goto L_0x0244
        L_0x0241:
            r7 = 1
        L_0x0242:
            r8 = 0
            goto L_0x0261
        L_0x0244:
            java.io.InputStream r7 = r5.isInside()
            if (r7 != 0) goto L_0x024b
            goto L_0x0241
        L_0x024b:
            java.io.Closeable r7 = (java.io.Closeable) r7
            r8 = r7
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ all -> 0x02a4 }
            int r8 = r8.available()     // Catch:{ all -> 0x02a4 }
            if (r8 != 0) goto L_0x0258
            r8 = 1
            goto L_0x0259
        L_0x0258:
            r8 = 0
        L_0x0259:
            r9 = 0
            kotlin.io.CloseableKt.closeFinally(r7, r9)
            r7 = 1
            if (r8 != r7) goto L_0x0242
            r8 = 1
        L_0x0261:
            if (r8 == 0) goto L_0x0264
            return r5
        L_0x0264:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r14)
            int r10 = r10 + r7
            r5.append(r10)
            r5.append(r6)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            char[] r3 = new char[r7]
            r5 = 46
            r6 = 0
            r3[r6] = r5
            java.lang.String r2 = kotlin.text.StringsKt.trimEnd((java.lang.String) r2, (char[]) r3)
            r4.put(r11, r2)
            o.setContentInsetEndWithActions r2 = new o.setContentInsetEndWithActions
            android.content.ContentResolver r3 = r20.getContentResolver()
            android.net.Uri r1 = r21.getWriteUri()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.net.Uri r1 = r3.insert(r1, r4)
            if (r1 != 0) goto L_0x02a0
            r3 = 0
            return r3
        L_0x02a0:
            r2.<init>((android.content.Context) r0, (android.net.Uri) r1)
            return r2
        L_0x02a4:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch:{ all -> 0x02a7 }
        L_0x02a7:
            r0 = move-exception
            r2 = r0
            kotlin.io.CloseableKt.closeFinally(r7, r1)
            throw r2
        L_0x02ad:
            o.setContentInsetEndWithActions r2 = new o.setContentInsetEndWithActions
            android.content.ContentResolver r3 = r20.getContentResolver()
            android.net.Uri r1 = r21.getWriteUri()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            android.net.Uri r1 = r3.insert(r1, r4)
            if (r1 != 0) goto L_0x02c2
            r3 = 0
            return r3
        L_0x02c2:
            r2.<init>((android.content.Context) r0, (android.net.Uri) r1)
            return r2
        L_0x02c6:
            r9 = r22
            java.io.File r1 = android.os.Environment.getExternalStoragePublicDirectory(r22)
            java.lang.String r4 = "publicDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            boolean r4 = o.getContentInsetEndWithActions.getMax(r1, r0)
            if (r4 == 0) goto L_0x033d
            java.lang.String r4 = r2.length
            java.lang.String r7 = r2.getMin
            java.lang.String r4 = o.getCurrentContentInsetStart.getMax(r4, r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r1)
            r8.append(r6)
            java.lang.String r1 = r2.setMax
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            r7.<init>(r1, r4)
            java.io.File r1 = r7.getParentFile()
            if (r1 != 0) goto L_0x0300
            r2 = 0
            return r2
        L_0x0300:
            r1.mkdirs()
            boolean r2 = r7.exists()
            if (r2 == 0) goto L_0x031e
            com.anggrayudi.storage.file.CreateMode r2 = com.anggrayudi.storage.file.CreateMode.CREATE_NEW
            if (r3 != r2) goto L_0x031e
            java.lang.String r2 = o.getContentInsetEndWithActions.setMin((java.io.File) r1, (java.lang.String) r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r5)
            java.lang.String r4 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            java.io.File r7 = new java.io.File
            r7.<init>(r1, r2)
        L_0x031e:
            com.anggrayudi.storage.file.CreateMode r1 = com.anggrayudi.storage.file.CreateMode.REPLACE
            if (r3 != r1) goto L_0x032a
            boolean r1 = o.getContentInsetEndWithActions.setMax(r7)
            if (r1 != 0) goto L_0x032a
            r1 = 0
            return r1
        L_0x032a:
            r1 = 0
            boolean r2 = o.getContentInsetEndWithActions.getMax((java.io.File) r7)
            if (r2 == 0) goto L_0x033c
            boolean r2 = r7.canRead()
            if (r2 == 0) goto L_0x033c
            o.setContentInsetEndWithActions r1 = new o.setContentInsetEndWithActions
            r1.<init>((android.content.Context) r0, (java.io.File) r7)
        L_0x033c:
            return r1
        L_0x033d:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCurrentContentInsetLeft.getMax(android.content.Context, com.anggrayudi.storage.media.MediaType, java.lang.String, o.getCurrentContentInsetRight, com.anggrayudi.storage.file.CreateMode):o.setContentInsetEndWithActions");
    }

    @JvmStatic
    @Nullable
    private static setContentInsetEndWithActions setMin(@NotNull Context context, @NotNull MediaType mediaType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(str, "id");
        Uri writeUri = mediaType.getWriteUri();
        if (writeUri == null) {
            return null;
        }
        Uri build = writeUri.buildUpon().appendPath(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "it.buildUpon().appendPath(id).build()");
        return new setContentInsetEndWithActions(context, build);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        kotlin.io.CloseableKt.closeFinally(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        throw r9;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.setContentInsetEndWithActions setMax(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull com.anggrayudi.storage.media.MediaType r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 >= r2) goto L_0x0034
            java.io.File r9 = new java.io.File
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            r9.<init>(r0, r10)
            boolean r10 = r9.isFile()
            if (r10 == 0) goto L_0x0033
            boolean r10 = r9.canRead()
            if (r10 == 0) goto L_0x0033
            o.setContentInsetEndWithActions r10 = new o.setContentInsetEndWithActions
            r10.<init>((android.content.Context) r8, (java.io.File) r9)
            return r10
        L_0x0033:
            return r1
        L_0x0034:
            android.content.ContentResolver r2 = r8.getContentResolver()
            android.net.Uri r3 = r9.getReadUri()
            if (r3 != 0) goto L_0x003f
            return r1
        L_0x003f:
            java.lang.String r0 = "_id"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r10
            r7 = 0
            java.lang.String r5 = "_display_name = ?"
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)
            if (r10 != 0) goto L_0x0055
            return r1
        L_0x0055:
            java.io.Closeable r10 = (java.io.Closeable) r10
            r0 = r10
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ all -> 0x0062 }
            o.setContentInsetEndWithActions r8 = getMin((android.content.Context) r8, (com.anggrayudi.storage.media.MediaType) r9, (android.database.Cursor) r0)     // Catch:{ all -> 0x0062 }
            kotlin.io.CloseableKt.closeFinally(r10, r1)
            return r8
        L_0x0062:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCurrentContentInsetLeft.setMax(android.content.Context, com.anggrayudi.storage.media.MediaType, java.lang.String):o.setContentInsetEndWithActions");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        kotlin.io.CloseableKt.closeFinally(r14, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
        throw r13;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.setContentInsetEndWithActions length(@org.jetbrains.annotations.NotNull android.content.Context r12, @org.jetbrains.annotations.NotNull com.anggrayudi.storage.media.MediaType r13, @org.jetbrains.annotations.NotNull java.lang.String r14) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "basePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            o.getContentInsetLeft r0 = o.getContentInsetLeft.setMin
            java.lang.String r14 = o.getContentInsetLeft.setMax(r14)
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 47
            r3 = 0
            r1[r3] = r2
            java.lang.String r14 = kotlin.text.StringsKt.trim((java.lang.String) r14, (char[]) r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 29
            if (r1 >= r5) goto L_0x0049
            java.io.File r13 = new java.io.File
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            r13.<init>(r0, r14)
            boolean r14 = r13.isFile()
            if (r14 == 0) goto L_0x0048
            boolean r14 = r13.canRead()
            if (r14 == 0) goto L_0x0048
            o.setContentInsetEndWithActions r14 = new o.setContentInsetEndWithActions
            r14.<init>((android.content.Context) r12, (java.io.File) r13)
            return r14
        L_0x0048:
            return r4
        L_0x0049:
            java.lang.String r1 = ""
            java.lang.String r1 = kotlin.text.StringsKt.substringBeforeLast((java.lang.String) r14, (char) r2, (java.lang.String) r1)
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x005a
            r5 = 1
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x005e
            return r4
        L_0x005e:
            r5 = 2
            java.lang.String r14 = kotlin.text.StringsKt.substringAfterLast$default((java.lang.String) r14, (char) r2, (java.lang.String) r4, (int) r5, (java.lang.Object) r4)
            android.content.ContentResolver r6 = r12.getContentResolver()
            android.net.Uri r7 = r13.getReadUri()
            if (r7 != 0) goto L_0x006e
            return r4
        L_0x006e:
            java.lang.String r2 = "_id"
            java.lang.String[] r8 = new java.lang.String[]{r2}
            java.lang.String[] r10 = new java.lang.String[r5]
            r10[r3] = r14
            java.lang.String r14 = "/"
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r14)
            r10[r0] = r14
            r11 = 0
            java.lang.String r9 = "_display_name = ? AND relative_path = ?"
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)
            if (r14 != 0) goto L_0x008a
            return r4
        L_0x008a:
            java.io.Closeable r14 = (java.io.Closeable) r14
            r0 = r14
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch:{ all -> 0x0097 }
            o.setContentInsetEndWithActions r12 = getMin((android.content.Context) r12, (com.anggrayudi.storage.media.MediaType) r13, (android.database.Cursor) r0)     // Catch:{ all -> 0x0097 }
            kotlin.io.CloseableKt.closeFinally(r14, r4)
            return r12
        L_0x0097:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r13 = move-exception
            kotlin.io.CloseableKt.closeFinally(r14, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCurrentContentInsetLeft.length(android.content.Context, com.anggrayudi.storage.media.MediaType, java.lang.String):o.setContentInsetEndWithActions");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00f4, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f5, code lost:
        kotlin.io.CloseableKt.closeFinally(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        throw r9;
     */
    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<o.setContentInsetEndWithActions> getMin(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull com.anggrayudi.storage.media.MediaType r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "mediaType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "containsName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 >= r1) goto L_0x00ac
            java.util.List r0 = r9.getDirectories()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r3 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r2)
            r1.<init>(r3)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00a3
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "^.*"
            r5.<init>(r6)
            r5.append(r10)
            java.lang.String r6 = ".*$"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>((java.lang.String) r5)
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]
            r6 = 0
            java.lang.String r7 = r9.getMimeType()
            r5[r6] = r7
            o.superDispatchKeyEvent r3 = o.superDispatchKeyEvent.setMin(r3)
            java.lang.String r6 = "fromFile(directory)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r6)
            java.util.List r3 = o.setContentInsetStartWithNavigation.length(r3, r5, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r2)
            r4.<init>(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r3 = r3.iterator()
        L_0x0078:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x009d
            java.lang.Object r5 = r3.next()
            o.superDispatchKeyEvent r5 = (o.superDispatchKeyEvent) r5
            o.setContentInsetEndWithActions r6 = new o.setContentInsetEndWithActions
            java.io.File r7 = new java.io.File
            android.net.Uri r5 = r5.setMin()
            java.lang.String r5 = r5.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r7.<init>(r5)
            r6.<init>((android.content.Context) r8, (java.io.File) r7)
            r4.add(r6)
            goto L_0x0078
        L_0x009d:
            java.util.List r4 = (java.util.List) r4
            r1.add(r4)
            goto L_0x002c
        L_0x00a3:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r8 = kotlin.collections.CollectionsKt.flatten(r1)
            return r8
        L_0x00ac:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "_display_name LIKE '%"
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = "%'"
            r0.append(r10)
            java.lang.String r4 = r0.toString()
            android.content.ContentResolver r1 = r8.getContentResolver()
            android.net.Uri r2 = r9.getReadUri()
            if (r2 != 0) goto L_0x00ce
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            return r8
        L_0x00ce:
            java.lang.String r10 = "_id"
            java.lang.String[] r3 = new java.lang.String[]{r10}
            r5 = 0
            r6 = 0
            android.database.Cursor r10 = r1.query(r2, r3, r4, r5, r6)
            r0 = 0
            if (r10 != 0) goto L_0x00de
            goto L_0x00eb
        L_0x00de:
            java.io.Closeable r10 = (java.io.Closeable) r10
            r1 = r10
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch:{ all -> 0x00f2 }
            java.util.List r8 = getMax(r8, r9, r1)     // Catch:{ all -> 0x00f2 }
            kotlin.io.CloseableKt.closeFinally(r10, r0)
            r0 = r8
        L_0x00eb:
            if (r0 != 0) goto L_0x00f1
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00f1:
            return r0
        L_0x00f2:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r9 = move-exception
            kotlin.io.CloseableKt.closeFinally(r10, r8)
            goto L_0x00fa
        L_0x00f9:
            throw r9
        L_0x00fa:
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getCurrentContentInsetLeft.getMin(android.content.Context, com.anggrayudi.storage.media.MediaType, java.lang.String):java.util.List");
    }

    private static List<setContentInsetEndWithActions> getMax(Context context, MediaType mediaType, Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return CollectionsKt.emptyList();
        }
        int columnIndex = cursor.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX);
        ArrayList arrayList = new ArrayList(cursor.getCount());
        do {
            String string = cursor.getString(columnIndex);
            Intrinsics.checkNotNullExpressionValue(string, "mediaId");
            setContentInsetEndWithActions min = setMin(context, mediaType, string);
            if (min != null) {
                arrayList.add(min);
            }
        } while (cursor.moveToNext());
        return arrayList;
    }

    private static setContentInsetEndWithActions getMin(Context context, MediaType mediaType, Cursor cursor) {
        if (!cursor.moveToFirst()) {
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndex(FieldType.FOREIGN_ID_FIELD_SUFFIX));
        Intrinsics.checkNotNullExpressionValue(string, "mediaId");
        return setMin(context, mediaType, string);
    }
}
