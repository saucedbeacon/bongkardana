package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.anggrayudi.storage.file.CreateMode;
import com.anggrayudi.storage.file.DocumentFileType;
import com.anggrayudi.storage.file.PublicDirectory;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.promocenter.model.PromoActionType;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import o.setContentInsetsRelative;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u001dH\u0007J8\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J\u001a\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u001dH\u0007J\u0018\u0010#\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0007J\u0018\u0010%\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0007J:\u0010&\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0017H\u0002J$\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+H\u0007J$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u0007J$\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040/H\u0007J8\u00101\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J8\u00102\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J8\u00103\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00104\u001a\u0002052\b\b\u0002\u00106\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007JD\u00107\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J\u001a\u00108\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u001bH\u0007J.\u0010:\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0007J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010=\u001a\u00020\u0004H\u0000¢\u0006\u0002\b>J\u001a\u0010?\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010@\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0007J\u0018\u0010C\u001a\u00020D2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0012\u0010E\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002J.\u0010F\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J$\u0010G\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u0017H\u0007J\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010I\u001a\u00020D2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010J\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0007J\u0016\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010L\u001a\u00020D2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0018\u0010M\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0007J\u0010\u0010N\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010O\u001a\u00020\u00172\u0006\u00109\u001a\u00020\u001bH\u0007J\"\u0010P\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0007J.\u0010Q\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J?\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0R2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+2\b\b\u0002\u0010)\u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010SJ*\u0010T\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0017H\u0002J8\u0010U\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u0017H\u0007J\u0011\u0010V\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0002\bWR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006X"}, d2 = {"Lcom/anggrayudi/storage/file/DocumentFileCompat;", "", "()V", "DOWNLOADS_FOLDER_AUTHORITY", "", "DOWNLOADS_TREE_URI", "EXTERNAL_STORAGE_AUTHORITY", "FILE_NAME_DUPLICATION_REGEX_WITHOUT_EXTENSION", "Lkotlin/text/Regex;", "getFILE_NAME_DUPLICATION_REGEX_WITHOUT_EXTENSION", "()Lkotlin/text/Regex;", "FILE_NAME_DUPLICATION_REGEX_WITH_EXTENSION", "getFILE_NAME_DUPLICATION_REGEX_WITH_EXTENSION", "MEDIA_FOLDER_AUTHORITY", "buildAbsolutePath", "context", "Landroid/content/Context;", "simplePath", "storageId", "basePath", "buildSimplePath", "absolutePath", "create", "", "file", "Ljava/io/File;", "createDocumentUri", "Landroid/net/Uri;", "createDownloadWithMediaStoreFallback", "Lcom/anggrayudi/storage/media/FileDescription;", "createFile", "Landroidx/documentfile/provider/DocumentFile;", "mimeType", "considerRawFile", "createPictureWithMediaStoreFallback", "delete", "fullPath", "doesExist", "exploreFile", "documentType", "Lcom/anggrayudi/storage/file/DocumentFileType;", "requiresWriteAccess", "findInaccessibleStorageLocations", "", "fullPaths", "findUniqueDeepestSubFolders", "folderFullPaths", "", "findUniqueParents", "fromFile", "fromFullPath", "fromPublicFolder", "type", "Lcom/anggrayudi/storage/file/PublicDirectory;", "subFile", "fromSimplePath", "fromUri", "uri", "getAccessibleRootDocumentFile", "getBasePath", "getDirectorySequence", "path", "getDirectorySequence$storage_release", "getDocumentFileForStorageInfo", "getFileNameFromPath", "getFileNameFromUrl", "url", "getFreeSpace", "", "getParentPath", "getRootDocumentFile", "getRootRawFile", "getSdCardIds", "getStorageCapacity", "getStorageId", "getStorageIds", "getUsedSpace", "isAccessGranted", "isDownloadsUriPermissionGranted", "isRootUri", "isStorageUriPermissionGranted", "mkdirs", "", "(Landroid/content/Context;Ljava/util/List;ZZ)[Landroidx/documentfile/provider/DocumentFile;", "mkdirsParentDirectory", "recreate", "removeForbiddenCharsFromFilename", "removeForbiddenCharsFromFilename$storage_release", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getContentInsetLeft {
    @NotNull
    private static final Regex getMax = new Regex("(.*?) \\(\\d+\\)\\.[a-zA-Z0-9]+");
    @NotNull
    private static final Regex setMax = new Regex("(.*?) \\(\\d+\\)");
    @NotNull
    public static final getContentInsetLeft setMin = new getContentInsetLeft();

    private getContentInsetLeft() {
    }

    @NotNull
    public static Regex setMin() {
        return getMax;
    }

    @NotNull
    public static Regex getMax() {
        return setMax;
    }

    @JvmStatic
    @Nullable
    public static final superDispatchKeyEvent setMin(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (getContentInsetRight.length(uri)) {
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            File file = new File(path);
            if (file.canRead()) {
                return superDispatchKeyEvent.setMin(file);
            }
            return null;
        } else if (!getContentInsetRight.setMax(uri)) {
            return getContentInsetEnd.getMax(context, uri);
        } else {
            superDispatchKeyEvent min = getContentInsetEnd.getMin(context, uri);
            if (min == null) {
                return null;
            }
            return setContentInsetStartWithNavigation.getMax(min) ? setContentInsetStartWithNavigation.setMax(min, context) : min;
        }
    }

    @JvmStatic
    @Nullable
    @JvmOverloads
    private static superDispatchKeyEvent setMin(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull DocumentFileType documentFileType) {
        superDispatchKeyEvent min;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "storageId");
        Intrinsics.checkNotNullParameter(str2, "basePath");
        Intrinsics.checkNotNullParameter(documentFileType, "documentType");
        if (Intrinsics.areEqual((Object) str, (Object) "data")) {
            File max = getContentInsetEndWithActions.getMax(context);
            Intrinsics.checkNotNullParameter(max, "<this>");
            Intrinsics.checkNotNullParameter(str2, "path");
            return superDispatchKeyEvent.setMin(new File(max, str2));
        }
        boolean z = true;
        if (str2.length() == 0) {
            return setMax(context, str);
        }
        superDispatchKeyEvent max2 = setMax(context, str, str2, documentFileType);
        if (max2 == null) {
            String str3 = Environment.DIRECTORY_DOWNLOADS;
            Intrinsics.checkNotNullExpressionValue(str3, "DIRECTORY_DOWNLOADS");
            if (StringsKt.startsWith$default(str2, str3, false, 2, (Object) null) && Intrinsics.areEqual((Object) str, (Object) PromoActionType.PRIMARY)) {
                Uri parse = Uri.parse("content://com.android.providers.downloads.documents/tree/downloads");
                Intrinsics.checkNotNullExpressionValue(parse, "parse(DOWNLOADS_TREE_URI)");
                superDispatchKeyEvent min2 = getContentInsetEnd.getMin(context, parse);
                if (min2 == null || !min2.IsOverlapping()) {
                    min2 = null;
                }
                if (min2 == null || (min = setContentInsetStartWithNavigation.getMax(min2, context, StringsKt.substringAfter(str2, '/', ""), false)) == null) {
                    return null;
                }
                if (documentFileType != DocumentFileType.ANY && ((documentFileType != DocumentFileType.FILE || !min.toFloatRange()) && (documentFileType != DocumentFileType.FOLDER || !min.setMax()))) {
                    z = false;
                }
                if (z) {
                    return min;
                }
                return null;
            }
        }
        return max2;
    }

    private static /* synthetic */ superDispatchKeyEvent setMin(Context context, String str) {
        DocumentFileType documentFileType = DocumentFileType.ANY;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "fullPath");
        Intrinsics.checkNotNullParameter(documentFileType, "documentType");
        if (!StringsKt.startsWith$default((CharSequence) str, '/', false, 2, (Object) null)) {
            return setMin(context, StringsKt.substringBefore$default(str, ':', (String) null, 2, (Object) null), StringsKt.substringAfter$default(str, ':', (String) null, 2, (Object) null), documentFileType);
        }
        File file = new File(str);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(documentFileType, "documentType");
        if (!getContentInsetEndWithActions.setMax(file, context, false, false)) {
            String max = setMax(getContentInsetEndWithActions.setMin(file, context));
            Intrinsics.checkNotNullParameter(max, "<this>");
            String trim = StringsKt.trim(max, '/');
            superDispatchKeyEvent max2 = setMax(context, getContentInsetEndWithActions.length(file, context), trim, documentFileType);
            return max2 == null ? setMin(context, getContentInsetEndWithActions.length(file, context), trim, documentFileType) : max2;
        } else if ((documentFileType != DocumentFileType.FILE || file.isFile()) && (documentFileType != DocumentFileType.FOLDER || file.isDirectory())) {
            return superDispatchKeyEvent.setMin(file);
        } else {
            return null;
        }
    }

    public static /* synthetic */ superDispatchKeyEvent getMax(Context context, PublicDirectory publicDirectory, String str, boolean z, boolean z2, int i) {
        superDispatchKeyEvent superdispatchkeyevent;
        if ((i & 4) != 0) {
            str = "";
        }
        boolean z3 = false;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = true;
        }
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(publicDirectory, "type");
        Intrinsics.checkNotNullParameter(str, "subFile");
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(publicDirectory.getFolderName());
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(externalStoragePublicDirectory);
            sb.append('/');
            sb.append(str);
            externalStoragePublicDirectory = new File(StringsKt.trimEnd(sb.toString(), '/'));
        }
        Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "rawFile");
        if (getContentInsetEndWithActions.setMax(externalStoragePublicDirectory, context, z, z2)) {
            return superDispatchKeyEvent.setMin(externalStoragePublicDirectory);
        }
        if (publicDirectory == PublicDirectory.DOWNLOADS) {
            Uri parse = Uri.parse("content://com.android.providers.downloads.documents/tree/downloads");
            Intrinsics.checkNotNullExpressionValue(parse, "parse(DOWNLOADS_TREE_URI)");
            superDispatchKeyEvent min = getContentInsetEnd.getMin(context, parse);
            if (min != null && min.IsOverlapping()) {
                superdispatchkeyevent = setContentInsetStartWithNavigation.getMax(min, context, str, z);
            } else {
                String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "rawFile.absolutePath");
                superdispatchkeyevent = setMin(context, absolutePath);
            }
        } else {
            String absolutePath2 = externalStoragePublicDirectory.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath2, "rawFile.absolutePath");
            superdispatchkeyevent = setMin(context, absolutePath2);
        }
        if (superdispatchkeyevent == null) {
            return null;
        }
        if (superdispatchkeyevent.IsOverlapping() && ((z && setContentInsetStartWithNavigation.getMax(superdispatchkeyevent, context)) || !z)) {
            z3 = true;
        }
        if (z3) {
            return superdispatchkeyevent;
        }
        return null;
    }

    @JvmStatic
    @Nullable
    @JvmOverloads
    private static superDispatchKeyEvent setMax(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str, "storageId");
        if (Intrinsics.areEqual((Object) str, (Object) "data")) {
            return superDispatchKeyEvent.setMin(getContentInsetEndWithActions.getMax(context));
        }
        superDispatchKeyEvent min = getContentInsetEnd.getMin(context, setMax(str, ""));
        if (min == null || !min.IsOverlapping()) {
            return null;
        }
        return min;
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    private static Uri setMax(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "storageId");
        Intrinsics.checkNotNullParameter(str2, "basePath");
        StringBuilder sb = new StringBuilder("content://com.android.externalstorage.documents/tree/");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(str2);
        sb.append(Uri.encode(sb2.toString()));
        Uri parse = Uri.parse(sb.toString());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(\"content://$EXTERNAL_STORAGE_AUTHORITY/tree/\" + Uri.encode(\"$storageId:$basePath\"))");
        return parse;
    }

    @JvmStatic
    @Nullable
    public static final Uri getMax(@NotNull Context context, @NotNull getCurrentContentInsetRight getcurrentcontentinsetright) {
        superDispatchKeyEvent min;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetright, "file");
        superDispatchKeyEvent max = getMax(context, PublicDirectory.DOWNLOADS, (String) null, true, false, 20);
        if (max == null && Build.VERSION.SDK_INT > 28) {
            setContentInsetEndWithActions min2 = getCurrentContentInsetLeft.setMin(context, getcurrentcontentinsetright);
            if (min2 == null) {
                return null;
            }
            return min2.length;
        } else if (max == null || (min = setContentInsetStartWithNavigation.setMin(max, context, getcurrentcontentinsetright.length, getcurrentcontentinsetright.getMin, CreateMode.CREATE_NEW)) == null) {
            return null;
        } else {
            return min.setMin();
        }
    }

    @JvmStatic
    @Nullable
    public static final Uri length(@NotNull Context context, @NotNull getCurrentContentInsetRight getcurrentcontentinsetright) {
        superDispatchKeyEvent min;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(getcurrentcontentinsetright, "file");
        superDispatchKeyEvent max = getMax(context, PublicDirectory.PICTURES, (String) null, true, false, 20);
        if (max == null && Build.VERSION.SDK_INT > 28) {
            setContentInsetEndWithActions max2 = getCurrentContentInsetLeft.getMax(context, getcurrentcontentinsetright);
            if (max2 == null) {
                return null;
            }
            return max2.length;
        } else if (max == null || (min = setContentInsetStartWithNavigation.setMin(max, context, getcurrentcontentinsetright.length, getcurrentcontentinsetright.getMin, CreateMode.CREATE_NEW)) == null) {
            return null;
        } else {
            return min.setMin();
        }
    }

    @NotNull
    public static String setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return getContentInsetStartWithNavigation.setMin(StringsKt.replace$default(str, ":", "_", false, 4, (Object) null), "//", "/");
    }

    private static superDispatchKeyEvent setMax(Context context, String str, String str2, DocumentFileType documentFileType) {
        String str3;
        superDispatchKeyEvent superdispatchkeyevent;
        Context context2 = context;
        String str4 = str;
        String str5 = str2;
        DocumentFileType documentFileType2 = documentFileType;
        Context applicationContext = context2 != null ? context.getApplicationContext() : null;
        boolean z = false;
        if (applicationContext != null) {
            int length = str4 != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-2119855300, oncanceled);
                onCancelLoad.getMin(-2119855300, oncanceled);
            }
        }
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(str4, "storageId");
        Intrinsics.checkNotNullParameter(str5, "basePath");
        String max = setMax(str2);
        if (Intrinsics.areEqual((Object) str4, (Object) PromoActionType.PRIMARY)) {
            setContentInsetsRelative.setMax setmax = setContentInsetsRelative.length;
            str3 = Environment.getExternalStorageDirectory().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(str3, "getExternalStorageDirectory().absolutePath");
        } else {
            str3 = Intrinsics.areEqual((Object) str4, (Object) "data") ? getContentInsetEndWithActions.getMax(context).getPath() : Intrinsics.stringPlus("/storage/", str4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append('/');
        sb.append(max);
        File file = new File(StringsKt.trimEnd(sb.toString(), '/'));
        if (!Intrinsics.areEqual((Object) str4, (Object) "data") || !file.canRead() || !getContentInsetEndWithActions.getMin(file, context2, false)) {
            if (Build.VERSION.SDK_INT < 30) {
                superDispatchKeyEvent max2 = setMax(context, str);
                superdispatchkeyevent = max2 == null ? null : setContentInsetStartWithNavigation.getMax(max2, context2, str5, false);
                if (superdispatchkeyevent == null) {
                    return null;
                }
            } else {
                List mutableList = CollectionsKt.toMutableList(getMax(str2));
                ArrayList arrayList = new ArrayList(mutableList.size());
                superDispatchKeyEvent superdispatchkeyevent2 = null;
                while (!mutableList.isEmpty()) {
                    arrayList.add(CollectionsKt.removeFirst(mutableList));
                    try {
                        superdispatchkeyevent2 = getContentInsetEnd.getMin(context2, setMax(str4, CollectionsKt.joinToString$default(arrayList, "/", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null)));
                        if (superdispatchkeyevent2 != null && superdispatchkeyevent2.IsOverlapping()) {
                            break;
                        }
                    } catch (SecurityException unused) {
                    }
                }
                if (superdispatchkeyevent2 == null || mutableList.isEmpty()) {
                    superdispatchkeyevent = superdispatchkeyevent2;
                } else {
                    Uri parse = Uri.parse(Intrinsics.stringPlus(superdispatchkeyevent2.setMin().toString(), Uri.encode(CollectionsKt.joinToString$default(mutableList, "/", "/", (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null))));
                    Intrinsics.checkNotNullExpressionValue(parse, "parse(grantedFile.uri.toString() + Uri.encode(fileTree))");
                    superdispatchkeyevent = getContentInsetEnd.getMin(context2, parse);
                }
            }
            if (superdispatchkeyevent != null) {
                if (superdispatchkeyevent.IsOverlapping() && (documentFileType2 == DocumentFileType.ANY || ((documentFileType2 == DocumentFileType.FILE && superdispatchkeyevent.toFloatRange()) || (documentFileType2 == DocumentFileType.FOLDER && superdispatchkeyevent.setMax())))) {
                    z = true;
                }
                if (z) {
                    return superdispatchkeyevent;
                }
            }
            return null;
        } else if (documentFileType2 == DocumentFileType.ANY || ((documentFileType2 == DocumentFileType.FILE && file.isFile()) || (documentFileType2 == DocumentFileType.FOLDER && file.isDirectory()))) {
            return superDispatchKeyEvent.setMin(file);
        } else {
            return null;
        }
    }

    @NotNull
    public static List<String> getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "path");
        Collection arrayList = new ArrayList();
        for (Object next : StringsKt.split$default((CharSequence) str, new char[]{'/'}, false, 0, 6, (Object) null)) {
            if (!StringsKt.isBlank((String) next)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
