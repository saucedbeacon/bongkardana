package o;

import android.app.Activity;
import android.content.Intent;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.di.PerActivity;
import id.dana.scanner.ScannerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DecodeWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¨\u0006\f"}, d2 = {"Lid/dana/contract/deeplink/path/FeatureScanQR;", "", "()V", "openScanQR", "", "activity", "Landroid/app/Activity;", "sourceQrType", "", "isNeedToCloseAfterScan", "", "scene", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class isTransitionRequired {
    public static void length(@NotNull Activity activity, @Nullable String str, boolean z, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        DecodeWrapper.getMin(str);
        Intent intent = new Intent(activity, ScannerActivity.class);
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("scene", str2);
        intent.putExtra(ScannerActivity.CLOSE_AFTER_SCAN, z);
        activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
    }
}
