package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.core.content.FileProvider;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.io.File;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.ConfirmPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u0006H\b¢\u0006\u0002\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t\u001a(\u0010\r\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\tH\u0007\u001a\u001a\u0010\u0013\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u001a\u0012\u0010\u0017\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0010\u001a\u001e\u0010\u0019\u001a\u00020\u000e*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0010H\u0007\u001a\n\u0010\u001b\u001a\u00020\u000e*\u00020\u0006\u001a*\u0010\u001c\u001a\u00020\u001d*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010\u001a\u001e\u0010\"\u001a\u00020#*\u00020\u00022\u0006\u0010!\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u0010H\u0007\u001a*\u0010$\u001a\u00020\u001d*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010¨\u0006%"}, d2 = {"getPhotoUri", "Landroid/net/Uri;", "Landroid/content/Context;", "getRootLayout", "T", "Landroid/view/View;", "Landroid/app/Activity;", "(Landroid/app/Activity;)Landroid/view/View;", "getSupportColor", "", "resId", "getSupportDrawable", "Landroid/graphics/drawable/Drawable;", "launchDeepLink", "", "url", "", "action", "flags", "launchGoogleMapsForDirection", "latitude", "", "longitude", "launchPhoneCall", "phone", "launchWhatsApp", "text", "lockPortraitOrientationForNonOreo", "ongoingNotification", "Landroidx/core/app/NotificationCompat$Builder;", "channelId", "groupKey", "title", "message", "startSendIntentChooser", "Landroid/content/Intent;", "stopNotification", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class startBeaconDiscovery {
    public static final void setMin(@NotNull Context context, double d, double d2) {
        Intrinsics.checkNotNullParameter(context, "$this$launchGoogleMapsForDirection");
        StringBuilder sb = new StringBuilder("google.navigation:q=");
        sb.append(d);
        sb.append(',');
        sb.append(d2);
        setMax(context, sb.toString(), "android.intent.action.VIEW");
    }

    public static final void getMin(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "$this$launchPhoneCall");
        Intrinsics.checkNotNullParameter(str, "phone");
        setMax(context, "tel:".concat(String.valueOf(str)), "android.intent.action.DIAL");
    }

    @JvmOverloads
    private static void setMax(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "$this$launchDeepLink");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "action");
        try {
            Intent flags = new Intent(str2, Uri.parse(str)).setFlags(0);
            Intrinsics.checkNotNullExpressionValue(flags, "Intent(action, Uri.parse(url)).setFlags(flags)");
            context.startActivity(flags);
        } catch (Throwable th) {
            updateActionSheetContent.e(DanaLogConstants.TAG.DEEPLINK_TAG, context.getClass().getName(), th);
        }
    }

    @NotNull
    public static final Uri getMin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "$this$getPhotoUri");
        String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        StringBuilder sb = new StringBuilder("image_");
        sb.append(format);
        sb.append('_');
        File createTempFile = File.createTempFile(sb.toString(), ".jpg", ConfirmPopup.AnonymousClass2.getMin(context));
        if (CornerMarkingDataProvider.equals()) {
            Uri uriForFile = FileProvider.getUriForFile(context, "id.dana.provider", createTempFile);
            Intrinsics.checkNotNullExpressionValue(uriForFile, "FileProvider.getUriForFi…TION_ID}.provider\", file)");
            return uriForFile;
        }
        Uri fromFile = Uri.fromFile(createTempFile);
        Intrinsics.checkNotNullExpressionValue(fromFile, "Uri.fromFile(file)");
        return fromFile;
    }

    public static /* synthetic */ Intent length(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "$this$startSendIntentChooser");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter("", "title");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        context.startActivity(Intent.createChooser(intent, ""));
        return intent;
    }

    public static final void length(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$lockPortraitOrientationForNonOreo");
        activity.setRequestedOrientation(CornerMarkingDataProvider.toDoubleRange() ? -1 : 1);
    }

    @Nullable
    public static final Drawable getMax(@NotNull Context context, @DrawableRes int i) {
        Intrinsics.checkNotNullParameter(context, "$this$getSupportDrawable");
        return cancelAll.getMin(context, i);
    }

    @JvmOverloads
    public static final void getMin(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "$this$launchWhatsApp");
        Intrinsics.checkNotNullParameter(str, "phone");
        Intrinsics.checkNotNullParameter(str2, "text");
        String indoPhoneNumber = isOriginHasAppInfo.getIndoPhoneNumber(str.replaceAll("[^\\d.]", ""));
        String obj = URLEncoder.encode(str2, Charsets.UTF_8.toString()).toString();
        StringBuilder sb = new StringBuilder("https://wa.me/");
        sb.append(indoPhoneNumber);
        sb.append("?text=");
        sb.append(obj);
        setMax(context, sb.toString(), "android.intent.action.VIEW");
    }
}
