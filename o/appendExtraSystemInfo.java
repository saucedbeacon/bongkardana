package o;

import android.net.Uri;
import id.dana.danah5.DanaH5;
import id.dana.data.constant.UrlTag;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0003J$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007J\f\u0010\u000b\u001a\u00020\f*\u00020\u0004H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/mapper/ThirdPartyServicesUrlMapper;", "", "()V", "ALL_SERVICES_QUERY_PARAM", "", "SUBSCRIPTION_SERVICES", "mapReactUrl", "url", "authCode", "requestId", "mapUrl", "isReactUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class appendExtraSystemInfo {
    @NotNull
    public static final appendExtraSystemInfo getMax = new appendExtraSystemInfo();

    private appendExtraSystemInfo() {
    }

    @JvmStatic
    @NotNull
    public static final String getMax(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "url");
        if (length(str)) {
            StringBuilder sb = new StringBuilder(str);
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lifestyle-subscription-list", false, 2, (Object) null)) {
                sb.append("?entryPoint=allservices");
            }
            if (str2 != null) {
                sb.append("?authCode=".concat(String.valueOf(str2)));
            }
            if (str3 != null) {
                sb.append("?requestId=".concat(String.valueOf(str3)));
            }
            String obj = sb.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "urlBuilder.toString()");
            return DanaH5.correctedUrl(obj);
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "lifestyle-subscription-list", false, 2, (Object) null)) {
            buildUpon.appendQueryParameter(UrlTag.ENTRY_POINT, "allservices");
        }
        if (str2 != null) {
            buildUpon.appendQueryParameter("authCode", str2);
        }
        if (str3 != null) {
            buildUpon.appendQueryParameter("requestId", str3);
        }
        String obj2 = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(obj2, "urlBuilder.build().toString()");
        return obj2;
    }

    @JvmStatic
    private static final boolean length(String str) {
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "/#/", false, 2, (Object) null);
    }
}
