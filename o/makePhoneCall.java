package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.C;
import id.dana.notification.DanaFirebaseMessagingService;
import id.dana.notification.NotificationData;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\r"}, d2 = {"Lid/dana/notification/TwilioChallengeDirector;", "Lid/dana/notification/NotificationDirector;", "context", "Landroid/content/Context;", "notificationData", "Lid/dana/notification/NotificationData;", "(Landroid/content/Context;Lid/dana/notification/NotificationData;)V", "setInAppNotification", "", "setOutAppNotification", "activity", "Landroid/app/Activity;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class makePhoneCall extends isNfcEnable {
    @NotNull
    public static final length getMin = new length((byte) 0);
    /* access modifiers changed from: private */
    public static boolean setMin;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public makePhoneCall(@NotNull Context context, @NotNull NotificationData notificationData) {
        super(context, notificationData);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(notificationData, "notificationData");
    }

    public final void setMax() {
        Intent intent = new Intent(this.getMax, TwilioIdentityVerificationActivity.class);
        intent.setFlags(C.ENCODING_PCM_A_LAW);
        intent.putExtra(DanaFirebaseMessagingService.MESSAGE_DATA, this.length);
        PendingIntent activity = PendingIntent.getActivity(this.getMax, 0, intent, 268435456);
        if (setMin) {
            onInput oninput = onInput.getDefault();
            NotificationData notificationData = this.length;
            Intrinsics.checkNotNullExpressionValue(notificationData, "notificationData");
            String str = notificationData.toString;
            Intrinsics.checkNotNullExpressionValue(str, "notificationData.twilioFactorSid");
            NotificationData notificationData2 = this.length;
            Intrinsics.checkNotNullExpressionValue(notificationData2, "notificationData");
            String str2 = notificationData2.toDoubleRange;
            Intrinsics.checkNotNullExpressionValue(str2, "notificationData.twilioChallengeSid");
            oninput.post(new shouldBeVisible(str, str2));
            return;
        }
        Context context = this.getMax;
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        NotificationData notificationData3 = this.length;
        Intrinsics.checkNotNullExpressionValue(notificationData3, "notificationData");
        Intrinsics.checkNotNullExpressionValue(activity, "resultPendingIntent");
        ChoosePhoneContactBridgeExtension.setMax(context, notificationData3, activity, false);
    }

    public final void setMax(@Nullable Activity activity) {
        Intent intent = new Intent(activity, TwilioIdentityVerificationActivity.class);
        intent.putExtra(DanaFirebaseMessagingService.MESSAGE_DATA, this.length);
        if (activity != null) {
            activity.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/notification/TwilioChallengeDirector$Companion;", "", "()V", "isChangePinFromPostLogin", "", "()Z", "setChangePinFromPostLogin", "(Z)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
