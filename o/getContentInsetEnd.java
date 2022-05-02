package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import com.alibaba.griver.file.jsapi.ChooseFileBridgeExtension;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\u0014\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0002\u001a\u001a\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b\u001a\u0012\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000b\u001a\u0014\u0010\u0014\u001a\u00020\u000e*\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¨\u0006\u0017"}, d2 = {"fromSingleUri", "Landroidx/documentfile/provider/DocumentFile;", "Landroid/content/Context;", "fileUri", "Landroid/net/Uri;", "fromTreeUri", "getAppDirectory", "", "type", "hasActivityHandler", "", "Landroid/content/Intent;", "context", "startActivityForResultSafely", "", "Landroid/app/Activity;", "requestCode", "", "intent", "startActivitySafely", "unregisterReceiverSafely", "receiver", "Landroid/content/BroadcastReceiver;", "storage_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@JvmName(name = "ContextUtils")
public final class getContentInsetEnd {
    public static final void getMax(@NotNull Context context, @Nullable BroadcastReceiver broadcastReceiver) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (broadcastReceiver != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Nullable
    public static final superDispatchKeyEvent getMin(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY);
        try {
            return superDispatchKeyEvent.setMax(context, uri);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static final superDispatchKeyEvent getMax(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(uri, ChooseFileBridgeExtension.CHOOSE_FILE_RESULT_DATA_KEY);
        try {
            return superDispatchKeyEvent.getMin(context, uri);
        } catch (Exception unused) {
            return null;
        }
    }
}
