package o;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a \u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\u001a\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003¨\u0006\u0016"}, d2 = {"isDownloadsDocument", "", "Landroid/net/Uri;", "(Landroid/net/Uri;)Z", "isExternalStorageDocument", "isMediaDocument", "isMediaFile", "isRawFile", "isTreeDocumentFile", "getStorageId", "", "context", "Landroid/content/Context;", "openInputStream", "Ljava/io/InputStream;", "openOutputStream", "Ljava/io/OutputStream;", "append", "toDocumentFile", "Landroidx/documentfile/provider/DocumentFile;", "toMediaFile", "Lcom/anggrayudi/storage/media/MediaFile;", "storage_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "UriUtils")
public final class getContentInsetRight {
    public static final boolean setMax(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String path = uri.getPath();
        return path != null && StringsKt.startsWith$default(path, "/tree/", false, 2, (Object) null);
    }

    public static final boolean getMax(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual((Object) uri.getAuthority(), (Object) "com.android.externalstorage.documents");
    }

    public static final boolean getMin(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual((Object) uri.getAuthority(), (Object) "com.android.providers.downloads.documents");
    }

    public static final boolean length(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual((Object) uri.getScheme(), (Object) "file");
    }

    public static final boolean setMin(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        return Intrinsics.areEqual((Object) uri.getAuthority(), (Object) "media");
    }

    @WorkerThread
    @Nullable
    @JvmOverloads
    public static final OutputStream getMax(@NotNull Uri uri, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            if (length(uri)) {
                String path = uri.getPath();
                if (path == null) {
                    return null;
                }
                return new FileOutputStream(new File(path), true);
            }
            return context.getContentResolver().openOutputStream(uri, setMax(uri) ? "wa" : "w");
        } catch (IOException unused) {
            return null;
        }
    }

    @WorkerThread
    @Nullable
    public static final InputStream getMin(@NotNull Uri uri, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            if (!length(uri)) {
                return context.getContentResolver().openInputStream(uri);
            }
            String path = uri.getPath();
            if (path == null) {
                return null;
            }
            return new FileInputStream(new File(path));
        } catch (IOException unused) {
            return null;
        }
    }
}
