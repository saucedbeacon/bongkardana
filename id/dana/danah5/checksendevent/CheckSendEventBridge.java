package id.dana.danah5.checksendevent;

import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DatePickerBridgeExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lid/dana/danah5/checksendevent/CheckSendEventBridge;", "Lid/dana/lib/gcontainer/app/bridge/sendevent/CheckSendEventBridge;", "()V", "isEventValid", "", "context", "Landroid/content/Context;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class CheckSendEventBridge extends id.dana.lib.gcontainer.app.bridge.sendevent.CheckSendEventBridge {
    public final boolean isEventValid(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        return DatePickerBridgeExtension.AnonymousClass8.length(new Intent("android.intent.action.PICK", ContactsContract.CommonDataKinds.Phone.CONTENT_URI), context);
    }
}
