package o;

import android.webkit.MimeTypeMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/anggrayudi/storage/file/MimeType;", "", "()V", "APPLICATION", "", "AUDIO", "BINARY_FILE", "CHEMICAL", "FONT", "IMAGE", "MODEL", "TEXT", "UNKNOWN", "VIDEO", "getExtensionFromMimeType", "mimeType", "getExtensionFromMimeTypeOrFileName", "filename", "getFullFileName", "name", "getMimeTypeFromExtension", "fileExtension", "storage_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentContentInsetStart {
    @NotNull
    public static final getCurrentContentInsetStart setMin = new getCurrentContentInsetStart();

    private getCurrentContentInsetStart() {
    }

    @JvmStatic
    @NotNull
    public static final String getMax(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        String length = length(str2);
        if ((length.length() == 0) || StringsKt.endsWith$default(str, Intrinsics.stringPlus(".", length), false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        sb.append(length);
        return StringsKt.trimEnd(sb.toString(), '.');
    }

    @JvmStatic
    @NotNull
    private static String length(@Nullable String str) {
        String extensionFromMimeType = str == null ? null : Intrinsics.areEqual((Object) str, (Object) "application/octet-stream") ? "bin" : MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        return extensionFromMimeType == null ? "" : extensionFromMimeType;
    }

    @JvmStatic
    @NotNull
    public static final String getMin(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, "filename");
        return (str == null || Intrinsics.areEqual((Object) str, (Object) "*/*")) ? StringsKt.substringAfterLast(str2, '.', "") : length(str);
    }

    @JvmStatic
    @NotNull
    public static final String setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "fileExtension");
        if (Intrinsics.areEqual((Object) str, (Object) "bin")) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        return mimeTypeFromExtension == null ? "*/*" : mimeTypeFromExtension;
    }
}
