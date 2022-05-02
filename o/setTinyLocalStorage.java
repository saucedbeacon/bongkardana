package o;

import android.net.Uri;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/mapper/ProfileServicesUrlMapper;", "", "()V", "SUBSCRIPTION_SERVICES", "", "mapUrl", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setTinyLocalStorage {
    @NotNull
    public static final setTinyLocalStorage getMax = new setTinyLocalStorage();

    private setTinyLocalStorage() {
    }

    @JvmStatic
    @NotNull
    public static final String getMax(@Nullable String str) {
        if (str == null) {
            return "";
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "lifestyle-subscription-list", false, 2, (Object) null)) {
            return str;
        }
        String obj = buildUpon.appendQueryParameter(UrlTag.ENTRY_POINT, "profilepage").build().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "urlBuilder.appendQueryPa…page\").build().toString()");
        return obj;
    }
}
