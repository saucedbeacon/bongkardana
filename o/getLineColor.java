package o;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.util.media.MimeType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\u0015"}, d2 = {"Lid/dana/utils/IntentUtil;", "", "()V", "composeEmail", "", "context", "Landroid/content/Context;", "addresses", "", "", "subject", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)V", "getImageIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "getTextIntent", "text", "isIntentPackageAvailable", "", "packageName", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getLineColor {
    @NotNull
    public static final getLineColor setMin = new getLineColor();

    private getLineColor() {
    }

    @JvmStatic
    @NotNull
    public static final Intent setMax(@Nullable Uri uri) {
        Intent addFlags = new Intent("android.intent.action.SEND").putExtra("android.intent.extra.STREAM", uri).setType(MimeType.IMAGE_ALL).addFlags(1);
        Intrinsics.checkNotNullExpressionValue(addFlags, "Intent(Intent.ACTION_SEN…RANT_READ_URI_PERMISSION)");
        return addFlags;
    }

    @JvmStatic
    @NotNull
    public static final Intent getMin(@Nullable String str) {
        Intent putExtra = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_SEN…(Intent.EXTRA_TEXT, text)");
        return putExtra;
    }

    @JvmStatic
    public static final boolean getMax(@NotNull Context context, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            return false;
        }
    }

    public static /* synthetic */ void length(Context context, String[] strArr) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(strArr, "addresses");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }
}
