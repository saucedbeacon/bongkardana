package id.dana.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/notification/OCRReceiptBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "onOCRReceiptBroadcastReceiver", "Lid/dana/notification/OCRReceiptBroadcastReceiver$OnOCRReceiptBroadcastReceiver;", "(Lid/dana/notification/OCRReceiptBroadcastReceiver$OnOCRReceiptBroadcastReceiver;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "OnOCRReceiptBroadcastReceiver", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRReceiptBroadcastReceiver extends BroadcastReceiver {
    private final length length;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/notification/OCRReceiptBroadcastReceiver$OnOCRReceiptBroadcastReceiver;", "", "onReceive", "", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length {
    }

    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
    }

    public OCRReceiptBroadcastReceiver(@NotNull length length2) {
        Intrinsics.checkNotNullParameter(length2, "onOCRReceiptBroadcastReceiver");
        this.length = length2;
    }
}
