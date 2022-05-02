package o;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.anggrayudi.storage.file.CreateMode;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.promocenter.model.PromoActionType;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.setContentInsetsRelative;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0012\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000b\u001a\u0012\u0010\u0014\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a$\u0010\u0016\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u000b\u001a\n\u0010\u001b\u001a\u00020\u0006*\u00020\u0001\u001a\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0016\u0010\u001d\u001a\u00020\u0006*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\u001f\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010 \u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a \u0010!\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0012\u0010\"\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020%*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u001a\u0010'\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0001\u001a\u0012\u0010)\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010*\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010+\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010,\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a4\u0010-\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010/\u001a\u000200H\u0007\u001a(\u00101\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u000200H\u0007\u001a4\u00102\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u00012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00105\u001a\u000206H\u0007\u001a4\u00102\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000b2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00105\u001a\u000206H\u0007\u001a\n\u00107\u001a\u00020\u0006*\u00020\u0001\u001a\u001c\u00108\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u001e\u00109\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0014\u0010:\u001a\u0004\u0018\u00010;*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a\n\u0010<\u001a\u00020\u0006*\u00020\u0001\u001a\u0012\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00010>*\u00020\u0001H\u0002\u001a\u001c\u0010?\u001a\u00020@*\u00020\u00012\u0006\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000bH\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\b\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006C"}, d2 = {"dataDirectory", "Ljava/io/File;", "Landroid/content/Context;", "getDataDirectory", "(Landroid/content/Context;)Ljava/io/File;", "inPrimaryStorage", "", "getInPrimaryStorage", "(Ljava/io/File;)Z", "isEmpty", "mimeType", "", "getMimeType", "(Ljava/io/File;)Ljava/lang/String;", "writableDirs", "", "getWritableDirs", "(Landroid/content/Context;)Ljava/util/Set;", "autoIncrementFileName", "filename", "canModify", "context", "checkRequirements", "requiresWriteAccess", "considerRawFile", "child", "path", "createNewFileIfPossible", "deleteEmptyFolders", "forceDelete", "childrenOnly", "getBasePath", "getRootPath", "getRootRawFile", "getSimplePath", "getStorageId", "getStorageType", "Lcom/anggrayudi/storage/file/StorageType;", "inDataStorage", "inSameMountPointWith", "file", "inSdCardStorage", "isExternalStorageManager", "isReadOnly", "isWritable", "makeFile", "name", "mode", "Lcom/anggrayudi/storage/file/CreateMode;", "makeFolder", "moveTo", "targetFolder", "newFileNameInTarget", "conflictResolution", "Lcom/anggrayudi/storage/callback/FileCallback$ConflictResolution;", "recreateFile", "shouldWritable", "takeIfWritable", "toDocumentFile", "Landroidx/documentfile/provider/DocumentFile;", "tryCreateNewFile", "walkFileTreeAndDeleteEmptyFolders", "", "walkFileTreeForMove", "", "srcPath", "destFolderPath", "storage_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "FileUtils")
public final class getContentInsetEndWithActions {
    @NotNull
    public static final String length(@NotNull File file, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getExternalStorageDirectory().absolutePath");
        if (StringsKt.startsWith$default(path, absolutePath, false, 2, (Object) null)) {
            return PromoActionType.PRIMARY;
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "path");
        String path3 = getMax(context).getPath();
        Intrinsics.checkNotNullExpressionValue(path3, "context.dataDirectory.path");
        if (StringsKt.startsWith$default(path2, path3, false, 2, (Object) null)) {
            return "data";
        }
        String path4 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path4, "path");
        return StringsKt.substringBefore$default(StringsKt.substringAfter(path4, "/storage/", ""), '/', (String) null, 2, (Object) null);
    }

    @NotNull
    public static final File getMax(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT > 23) {
            File dataDir = context.getDataDir();
            Intrinsics.checkNotNullExpressionValue(dataDir, "dataDir");
            return dataDir;
        }
        File parentFile = context.getFilesDir().getParentFile();
        Intrinsics.checkNotNull(parentFile);
        return parentFile;
    }

    @NotNull
    public static final String setMin(@NotNull File file, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getExternalStorageDirectory().absolutePath");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "path");
        if (StringsKt.startsWith$default(path, absolutePath, false, 2, (Object) null)) {
            String path2 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path2, "path");
            String substringAfter = StringsKt.substringAfter(path2, absolutePath, "");
            Intrinsics.checkNotNullParameter(substringAfter, "<this>");
            return StringsKt.trim(substringAfter, '/');
        }
        String path3 = getMax(context).getPath();
        String path4 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path4, "path");
        Intrinsics.checkNotNullExpressionValue(path3, "dataDir");
        if (StringsKt.startsWith$default(path4, path3, false, 2, (Object) null)) {
            String path5 = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path5, "path");
            String substringAfter2 = StringsKt.substringAfter(path5, path3, "");
            Intrinsics.checkNotNullParameter(substringAfter2, "<this>");
            return StringsKt.trim(substringAfter2, '/');
        }
        String length = length(file, context);
        String path6 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path6, "path");
        String substringAfter3 = StringsKt.substringAfter(path6, Intrinsics.stringPlus("/storage/", length), "");
        Intrinsics.checkNotNullParameter(substringAfter3, "<this>");
        return StringsKt.trim(substringAfter3, '/');
    }

    public static final boolean getMax(@NotNull File file, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return file.canRead() && setMax(file, context);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean getMin(@NotNull File file, @NotNull Context context, boolean z) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return (z && setMax(file, context)) || !z;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final boolean setMax(@NotNull File file, @NotNull Context context, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (file.canRead()) {
            return (z2 || getMin(file, context)) && getMin(file, context, z);
        }
        return false;
    }

    public static final boolean getMax(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            return file.isFile() || file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static final boolean setMax(@NotNull File file, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (file.canWrite()) {
            return file.isFile() || getMin(file, context);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        if (o.setContentInsetsRelative.setMax.getMax(r11) == false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean getMin(@org.jetbrains.annotations.NotNull java.io.File r10, @org.jetbrains.annotations.NotNull android.content.Context r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            r3 = 1
            if (r1 <= r2) goto L_0x0017
            boolean r1 = android.os.Environment.isExternalStorageManager(r10)
            if (r1 != 0) goto L_0x00d2
        L_0x0017:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 2
            java.lang.String r5 = "path"
            r6 = 0
            r7 = 0
            if (r1 >= r2) goto L_0x0044
            java.lang.String r1 = r10.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            o.setContentInsetsRelative$setMax r2 = o.setContentInsetsRelative.length
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r8 = "getExternalStorageDirectory().absolutePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r2, r7, r4, r6)
            if (r1 == 0) goto L_0x0044
            o.setContentInsetsRelative$setMax r1 = o.setContentInsetsRelative.length
            boolean r1 = o.setContentInsetsRelative.setMax.getMax(r11)
            if (r1 != 0) goto L_0x00d2
        L_0x0044:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.io.File[] r0 = new java.io.File[r3]
            java.io.File r1 = getMax((android.content.Context) r11)
            r0[r7] = r1
            java.util.Set r0 = kotlin.collections.SetsKt.mutableSetOf(r0)
            java.io.File[] r1 = o.IntRange.length(r11)
            java.lang.String r2 = "getObbDirs(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.util.List r1 = kotlin.collections.ArraysKt.filterNotNull(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            java.io.File[] r11 = o.IntRange.getMin((android.content.Context) r11, (java.lang.String) r6)
            java.lang.String r1 = "getExternalFilesDirs(this, null)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r11.length
            r8 = 0
        L_0x007b:
            if (r8 >= r2) goto L_0x0091
            r9 = r11[r8]
            java.io.File r9 = (java.io.File) r9
            if (r9 != 0) goto L_0x0085
            r9 = r6
            goto L_0x0089
        L_0x0085:
            java.io.File r9 = r9.getParentFile()
        L_0x0089:
            if (r9 == 0) goto L_0x008e
            r1.add(r9)
        L_0x008e:
            int r8 = r8 + 1
            goto L_0x007b
        L_0x0091:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r11 = r0 instanceof java.util.Collection
            if (r11 == 0) goto L_0x00a7
            r11 = r0
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L_0x00cf
        L_0x00a7:
            java.util.Iterator r11 = r0.iterator()
        L_0x00ab:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.lang.Object r0 = r11.next()
            java.io.File r0 = (java.io.File) r0
            java.lang.String r1 = r10.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.String r0 = r0.getPath()
            java.lang.String r2 = "it.path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r1, r0, r7, r4, r6)
            if (r0 == 0) goto L_0x00ab
            r10 = 1
            goto L_0x00d0
        L_0x00cf:
            r10 = 0
        L_0x00d0:
            if (r10 == 0) goto L_0x00d3
        L_0x00d2:
            return r3
        L_0x00d3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContentInsetEndWithActions.getMin(java.io.File, android.content.Context):boolean");
    }

    @WorkerThread
    @Nullable
    @JvmOverloads
    public static final File getMax(@NotNull File file, @NotNull Context context, @NotNull String str, @Nullable String str2, @NotNull CreateMode createMode) {
        File file2;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(createMode, "mode");
        if (!file.isDirectory() || !setMax(file, context)) {
            return null;
        }
        getContentInsetLeft getcontentinsetleft = getContentInsetLeft.setMin;
        String max = getContentInsetLeft.setMax(str);
        Intrinsics.checkNotNullParameter(max, "<this>");
        String trim = StringsKt.trim(max, '/');
        String substringBeforeLast = StringsKt.substringBeforeLast(trim, '/', "");
        if (substringBeforeLast.length() == 0) {
            file2 = file;
        } else {
            file2 = new File(file, substringBeforeLast);
            file2.mkdirs();
        }
        String substringAfterLast$default = StringsKt.substringAfterLast$default(trim, '/', (String) null, 2, (Object) null);
        String substringAfterLast = StringsKt.substringAfterLast(trim, '.', "");
        if (!(substringAfterLast.length() > 0) || (str2 != null && !Intrinsics.areEqual((Object) str2, (Object) "*/*") && !Intrinsics.areEqual((Object) str2, (Object) "application/octet-stream"))) {
            substringAfterLast = getCurrentContentInsetStart.getMin(str2, trim);
        }
        String removeSuffix = StringsKt.removeSuffix(substringAfterLast$default, (CharSequence) Intrinsics.stringPlus(".", substringAfterLast));
        StringBuilder sb = new StringBuilder();
        sb.append(removeSuffix);
        sb.append('.');
        sb.append(substringAfterLast);
        String trimEnd = StringsKt.trimEnd(sb.toString(), '.');
        if (createMode != CreateMode.CREATE_NEW) {
            File file3 = new File(file2, trimEnd);
            if (file3.exists()) {
                if (createMode == CreateMode.REPLACE) {
                    if (setMax(file3)) {
                        return file3;
                    }
                    return null;
                } else if (file3.isFile()) {
                    return file3;
                } else {
                    return null;
                }
            }
        }
        try {
            File file4 = new File(file2, setMin(file, trimEnd));
            if (file4.createNewFile()) {
                return file4;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[RETURN] */
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean setMax(@org.jetbrains.annotations.NotNull java.io.File r3, boolean r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isDirectory()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0033
            boolean r0 = kotlin.io.FilesKt.deleteRecursively(r3)
            if (r4 == 0) goto L_0x0032
            r3.mkdir()
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L_0x0031
            java.lang.String[] r3 = r3.list()
            if (r3 == 0) goto L_0x002d
            int r3 = r3.length
            if (r3 != 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            if (r3 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r3 = 0
            goto L_0x002e
        L_0x002d:
            r3 = 1
        L_0x002e:
            if (r3 == 0) goto L_0x0031
            return r2
        L_0x0031:
            return r1
        L_0x0032:
            return r0
        L_0x0033:
            boolean r4 = r3.delete()
            if (r4 != 0) goto L_0x0041
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            return r1
        L_0x0041:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContentInsetEndWithActions.setMax(java.io.File, boolean):boolean");
    }

    public static final boolean setMax(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        boolean unused = setMax(file, false);
        return getMin(file);
    }

    private static boolean getMin(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0070, code lost:
        if (o.getContentInsetLeft.getMax().matches(r2) != false) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String setMin(@org.jetbrains.annotations.NotNull java.io.File r16, @org.jetbrains.annotations.NotNull java.lang.String r17) {
        /*
            r0 = r16
            r1 = r17
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r3 = "filename"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            java.lang.String r2 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r2 = r2.exists()
            if (r2 == 0) goto L_0x00eb
            r2 = 2
            r3 = 46
            r4 = 0
            java.lang.String r5 = kotlin.text.StringsKt.substringBeforeLast$default((java.lang.String) r1, (char) r3, (java.lang.String) r4, (int) r2, (java.lang.Object) r4)
            java.lang.String r6 = ""
            java.lang.String r1 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r1, (char) r3, (java.lang.String) r6)
            java.lang.String r7 = " ("
            java.lang.String r8 = kotlin.jvm.internal.Intrinsics.stringPlus(r5, r7)
            java.lang.String[] r0 = r16.list()
            r9 = 0
            if (r0 != 0) goto L_0x003e
            java.lang.String[] r0 = new java.lang.String[r9]
        L_0x003e:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            int r11 = r0.length
            r12 = 0
        L_0x0047:
            r13 = 1
            if (r12 >= r11) goto L_0x007d
            r14 = r0[r12]
            java.lang.String r15 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            boolean r15 = kotlin.text.StringsKt.startsWith$default(r14, r8, r9, r2, r4)
            if (r15 == 0) goto L_0x0073
            o.getContentInsetLeft r15 = o.getContentInsetLeft.setMin
            kotlin.text.Regex r15 = o.getContentInsetLeft.setMin()
            r2 = r14
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r15 = r15.matches(r2)
            if (r15 != 0) goto L_0x0074
            o.getContentInsetLeft r15 = o.getContentInsetLeft.setMin
            kotlin.text.Regex r15 = o.getContentInsetLeft.getMax()
            boolean r2 = r15.matches(r2)
            if (r2 == 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r13 = 0
        L_0x0074:
            if (r13 == 0) goto L_0x0079
            r10.add(r14)
        L_0x0079:
            int r12 = r12 + 1
            r2 = 2
            goto L_0x0047
        L_0x007d:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r0 = r10.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L_0x008c
            goto L_0x00aa
        L_0x008c:
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x0094:
            r4 = r2
        L_0x0095:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00aa
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r8 = r4.compareTo(r2)
            if (r8 >= 0) goto L_0x0095
            goto L_0x0094
        L_0x00aa:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00af
            r4 = r6
        L_0x00af:
            r0 = 40
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast((java.lang.String) r4, (char) r0, (java.lang.String) r6)
            r2 = 41
            java.lang.String r0 = kotlin.text.StringsKt.substringBefore((java.lang.String) r0, (char) r2, (java.lang.String) r6)
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
            if (r0 != 0) goto L_0x00c3
            r0 = 0
            goto L_0x00c7
        L_0x00c3:
            int r0 = r0.intValue()
        L_0x00c7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r7)
            int r0 = r0 + r13
            r2.append(r0)
            java.lang.String r0 = ")."
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            char[] r1 = new char[r13]
            r1[r9] = r3
            java.lang.String r0 = kotlin.text.StringsKt.trimEnd((java.lang.String) r0, (char[]) r1)
            return r0
        L_0x00eb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getContentInsetEndWithActions.setMin(java.io.File, java.lang.String):java.lang.String");
    }
}
