package o;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Patterns;
import androidx.core.app.NotificationCompat;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import id.dana.R;
import id.dana.notification.NotificationData;
import id.dana.notification.RedirectType;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.CornerMarkingDataProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0006H\u0002J\u001a\u0010\u001e\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0004H\u0007J\u001a\u0010 \u001a\u00020!2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0007J \u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0007J\u001a\u0010)\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0004H\u0002J0\u0010,\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#2\u0006\u00100\u001a\u000201H\u0002J\u0012\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u00103\u001a\u00020\u0004H\u0002J\u0006\u00104\u001a\u000205J4\u00104\u001a\u0002062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00042\u0006\u00108\u001a\u00020\u001cH\u0002J0\u00109\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u0006\u0010\"\u001a\u00020#2\u0006\u00100\u001a\u0002012\u0006\u00108\u001a\u00020\u001cH\u0002J(\u0010:\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\u0006\u0010;\u001a\u0002012\u0006\u00108\u001a\u00020\u001cH\u0007J\u001a\u0010<\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020#H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006="}, d2 = {"Lid/dana/notification/NotificationUtils;", "", "()V", "LOCAL_CHANNEL", "", "PERSISTENT_NOTIFICATION_ID", "", "PERSISTENT_NOTIFICATION_TAG", "PREFIX_NORMAL_NOTIFICATION", "notificationCreationTimeMillis", "", "getNotificationCreationTimeMillis", "()J", "notificationCreationTimeMillis$delegate", "Lkotlin/Lazy;", "pushNotifLogo", "getPushNotifLogo", "()I", "createBigIconBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "iconUrl", "createNotificationChannel", "", "channel", "name", "isImportance", "", "createNotificationId", "createPersistentNotificaionChannel", "title", "createPersistentNotification", "Landroid/app/Notification;", "notificationData", "Lid/dana/notification/NotificationData;", "createPersistentNotificationData", "intent", "Landroid/content/Intent;", "onGoing", "message", "getAlarmSound", "Landroid/net/Uri;", "soundUrl", "getBigNotification", "builder", "Landroidx/core/app/NotificationCompat$Builder;", "bitmap", "resultPendingIntent", "Landroid/app/PendingIntent;", "getBitmapFromURL", "strURL", "getNotificationManager", "Landroidx/core/app/NotificationManagerCompat;", "Landroid/app/NotificationManager;", "channelId", "showUpNotification", "getSmallNotification", "showNotificationMessage", "pendingIntent", "showPersistantNotification", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class ChoosePhoneContactBridgeExtension {
    @NotNull
    private static final Lazy setMax = LazyKt.lazy(length.INSTANCE);
    @NotNull
    public static final ChoosePhoneContactBridgeExtension setMin = new ChoosePhoneContactBridgeExtension();

    private ChoosePhoneContactBridgeExtension() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Long> {
        public static final length INSTANCE = new length();

        length() {
            super(0);
        }

        public final long invoke() {
            return System.currentTimeMillis();
        }
    }

    @JvmStatic
    @NotNull
    public static final Notification setMax(@Nullable Context context, @NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Intrinsics.checkNotNull(context);
        TelephonyInfoBridgeExtension telephonyInfoBridgeExtension = new TelephonyInfoBridgeExtension(context, "local_channel", Intrinsics.areEqual((Object) SummaryActivity.CHECKED, (Object) notificationData.FastBitmap$CoordinateSystem.get("onGoing")));
        String str = notificationData.setMax;
        Intrinsics.checkNotNullExpressionValue(str, "notificationData.notificationTitle");
        String str2 = notificationData.getMin;
        Intrinsics.checkNotNullExpressionValue(str2, "notificationData.notificationMessage");
        Notification min = new ContactAccount(new onAccountReturned(telephonyInfoBridgeExtension, str, str2), CornerMarkingDataProvider.toFloatRange() ? R.drawable.dana_logo_white : R.drawable.dana_logo_white_png).getMin.setMin();
        Intrinsics.checkNotNullExpressionValue(min, "decoratedBuilder.build()");
        return min;
    }

    private static NotificationManager getMax(Context context, String str, String str2, String str3, boolean z) {
        int max;
        Object obj = null;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-918902606, oncanceled);
            onCancelLoad.getMin(-918902606, oncanceled);
        }
        if (context != null) {
            obj = context.getSystemService("notification");
        }
        if (obj != null) {
            NotificationManager notificationManager = (NotificationManager) obj;
            if (Build.VERSION.SDK_INT >= 26) {
                int i = 3;
                if (z) {
                    i = 4;
                }
                AudioAttributes build = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
                NotificationChannel notificationChannel = new NotificationChannel(str2, str, i);
                notificationChannel.setDescription("msg");
                notificationChannel.enableLights(true);
                notificationChannel.enableVibration(true);
                notificationChannel.setSound(length(context, str3), build);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return notificationManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    private static Bitmap setMax(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length2 = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length2);
            if (length2 != min) {
                onCanceled oncanceled = new onCanceled(length2, min, 32);
                onCancelLoad.setMax(1526548839, oncanceled);
                onCancelLoad.getMin(1526548839, oncanceled);
            }
        }
        if (str != null) {
            return length(str);
        }
        return BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_dana_logo_white);
    }

    private static Uri length(Context context, String str) {
        int i = 0;
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-2015660190, oncanceled);
            onCancelLoad.getMin(-2015660190, oncanceled);
        }
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            if (str != null) {
                i = str.length();
            }
            int min = dispatchOnCancelled.setMin(applicationContext, i);
            if (i != min) {
                onCanceled oncanceled2 = new onCanceled(i, min, 8);
                onCancelLoad.setMax(-2015660190, oncanceled2);
                onCancelLoad.getMin(-2015660190, oncanceled2);
            }
        }
        Uri.Builder authority = new Uri.Builder().scheme("android.resource").authority(context.getPackageName());
        CornerMarkingDataProvider.AnonymousClass3 r1 = CornerMarkingDataProvider.AnonymousClass3.setMin;
        Uri build = authority.appendPath(String.valueOf(CornerMarkingDataProvider.AnonymousClass3.setMax(context, str))).build();
        Intrinsics.checkNotNullExpressionValue(build, "Uri.Builder()\n          …g())\n            .build()");
        return build;
    }

    private static Bitmap length(String str) {
        try {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection());
            if (uRLConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (IOException unused) {
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final NotificationData setMin(boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "message");
        NotificationData notificationData = new NotificationData();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("onGoing", String.valueOf(z));
        notificationData.getMax = RedirectType.OCR_RECEIPT;
        notificationData.setMax = str;
        notificationData.getMin = str2;
        notificationData.FastBitmap$CoordinateSystem = hashMap;
        return notificationData;
    }

    @JvmStatic
    public static final void getMax(@Nullable Context context, @NotNull NotificationData notificationData) {
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        String str = notificationData.setMax;
        Intrinsics.checkNotNullExpressionValue(str, "notificationData.notificationTitle");
        getMax(context, str, "local_channel", "", true).notify("persistant_notification", 100, setMax(context, notificationData));
    }

    @JvmStatic
    public static final void setMax(@NotNull Context context, @NotNull NotificationData notificationData, @NotNull PendingIntent pendingIntent, boolean z) {
        Bitmap length2;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
        Intrinsics.checkNotNullParameter(pendingIntent, BaseGmsClient.KEY_PENDING_INTENT);
        if (!TextUtils.isEmpty(notificationData.getMin)) {
            String string = context.getString(R.string.default_notification_channel_id);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…_notification_channel_id)");
            String str = notificationData.setMax;
            Intrinsics.checkNotNullExpressionValue(str, "notificationData.notificationTitle");
            NotificationManager max = getMax(context, str, string, notificationData.toIntRange, z);
            NotificationCompat.setMax setmax = new NotificationCompat.setMax(context, string);
            String str2 = notificationData.IsOverlapping;
            Bitmap max2 = setMax(context, notificationData.setMin);
            String str3 = notificationData.setMax;
            String str4 = notificationData.getMin;
            if (z) {
                setmax.length(3);
                setmax.getMax(2);
            }
            CharSequence charSequence = str3;
            NotificationCompat.setMax length3 = setmax.length(charSequence);
            boolean floatRange = CornerMarkingDataProvider.toFloatRange();
            int i = R.drawable.dana_logo_white;
            CharSequence charSequence2 = str4;
            Notification min = length3.getMin(floatRange ? R.drawable.dana_logo_white : R.drawable.dana_logo_white_png).setMin(charSequence).getMin(charSequence2).setMin(max2).setMax((NotificationCompat.getMax) new NotificationCompat.setMin().getMin(charSequence2).getMax(charSequence)).setMax(IntRange.setMax(context, R.color.f19022131099797)).setMin(pendingIntent).getMax(true).length(length(context, notificationData.toIntRange)).setMin();
            Intrinsics.checkNotNullExpressionValue(min, "builder\n            .set…rl))\n            .build()");
            if (!(str2 == null || !Patterns.WEB_URL.matcher(str2).matches() || (length2 = length(str2)) == null)) {
                Bitmap max3 = setMax(context, notificationData.setMin);
                String str5 = notificationData.setMax;
                String str6 = notificationData.getMin;
                NotificationCompat.length length4 = new NotificationCompat.length();
                CharSequence charSequence3 = str5;
                length4.getMax(charSequence3);
                length4.setMax(ActionBar$LayoutParams.length(str6, 0).toString());
                length4.setMin(length2);
                NotificationCompat.setMax max4 = setmax.length(charSequence3).getMax(true).setMin(charSequence3).setMin(pendingIntent).length(length(context, notificationData.toIntRange)).setMax((NotificationCompat.getMax) length4);
                if (!CornerMarkingDataProvider.toFloatRange()) {
                    i = R.drawable.dana_logo_white_png;
                }
                min = max4.getMin(i).setMax(IntRange.setMax(context, R.color.f19022131099797)).setMin(max3).getMin((CharSequence) str6).setMin();
                Intrinsics.checkNotNullExpressionValue(min, "builder\n            .set…age)\n            .build()");
            }
            StringBuilder sb = new StringBuilder("2");
            sb.append(CornerMarkingDataProvider.AnonymousClass2.setMax());
            max.notify(Integer.parseInt(sb.toString()), min);
        }
    }
}
