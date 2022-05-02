package o;

import android.os.Build;
import android.telephony.PhoneNumberUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/utils/DanaPhoneNumberUtil;", "", "()V", "INDONESIA_COUNTRY_ISO", "", "getFormattedPhoneNumber", "phoneNumber", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSubmitText {
    @NotNull
    public static final setSubmitText getMax = new setSubmitText();

    private setSubmitText() {
    }

    @JvmStatic
    @NotNull
    public static final String setMin(@NotNull String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        if (Build.VERSION.SDK_INT >= 21) {
            str2 = PhoneNumberUtils.formatNumber(str, "ID");
        } else {
            str2 = PhoneNumberUtils.formatNumber(str);
        }
        return str2 == null ? "" : str2;
    }
}
