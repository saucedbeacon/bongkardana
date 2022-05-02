package id.dana.globalsearch.model;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Keep;
import id.dana.danah5.DanaH5;
import id.dana.scanner.ScannerActivity;
import id.dana.tracker.TrackerKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DecodeWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Lid/dana/globalsearch/model/PaysearchInfoActionMapper;", "", "()V", "handlePay", "", "activity", "Landroid/app/Activity;", "payType", "", "info", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Keep
public final class PaysearchInfoActionMapper {
    @NotNull
    public static final PaysearchInfoActionMapper INSTANCE = new PaysearchInfoActionMapper();

    private PaysearchInfoActionMapper() {
    }

    public static /* synthetic */ void handlePay$default(PaysearchInfoActionMapper paysearchInfoActionMapper, Activity activity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        paysearchInfoActionMapper.handlePay(activity, str, str2);
    }

    public final void handlePay(@Nullable Activity activity, @NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, "payType");
        if (str.hashCode() == 66944 && str.equals("CPM")) {
            Intent intent = new Intent(activity, ScannerActivity.class);
            intent.putExtra("source", TrackerKey.SourceType.GLOBAL_SEARCH);
            if (activity != null) {
                activity.startActivityForResult(intent, DecodeWrapper.AnonymousClass2.length);
            }
        } else if (str2 != null) {
            DanaH5.startContainerFullUrl(str2);
        }
    }
}
