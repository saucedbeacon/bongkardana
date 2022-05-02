package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"ENC_SUFFIX", "", "VERIFY_SUFFIX", "storagePreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "verify_release"}, k = 2, mv = {1, 1, 16})
public final class canRestoreState {
    public static final SharedPreferences getMax(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, HummerConstants.CONTEXT);
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(".verify");
        return context.getSharedPreferences(sb.toString(), 0);
    }
}
