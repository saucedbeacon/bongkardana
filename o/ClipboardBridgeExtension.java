package o;

import android.content.Context;
import android.net.Uri;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"openInputStream", "Ljava/io/InputStream;", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "gcontainer_release"}, k = 2, mv = {1, 4, 2})
public final class ClipboardBridgeExtension {
    @NotNull
    public static final InputStream getMin(@NotNull Uri uri, @NotNull Context context) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(uri, "$this$openInputStream");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            Intrinsics.checkNotNullExpressionValue(openInputStream, "context.contentResolver.…(\"File not found: $path\")");
            return openInputStream;
        }
        StringBuilder sb = new StringBuilder("File not found: ");
        sb.append(uri.getPath());
        throw new FileNotFoundException(sb.toString());
    }
}
