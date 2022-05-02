package o;

import android.content.Context;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.tracker.TrackerKey;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import o.convertDipToPx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\u0007\u001a\u00020\b2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\b\fH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J2\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0016J*\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0016J<\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0016J \u0010 \u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0013H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006$"}, d2 = {"Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "Lid/dana/twilio/tracker/TwilioAnalyticTracker;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "execute", "", "composeEvent", "Lkotlin/Function1;", "Lid/dana/tracker/EventTrackerModel$Builder;", "Lkotlin/ExtensionFunctionType;", "getDiffInSeconds", "", "diffTime", "", "getTimeDiff", "firstTime", "Ljava/util/Date;", "secondTime", "trackTwilioCreateChallenge", "source", "trackTwilioPushChallengeFailed", "startTime", "factorSid", "challengeSid", "failReason", "trackTwilioPushChallengeSuccess", "trackTwilioReturnCreateChallenge", "success", "", "trackTwilioUpdateChallenge", "userUpdateResult", "twilioTrackerDuration", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class showTwoWheelDialog implements onOptionPicked {
    @NotNull
    public static final setMax length = new setMax((byte) 0);
    @NotNull
    public final Context setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $challengeSid;
        final /* synthetic */ String $factorSid;
        final /* synthetic */ String $failReason;
        final /* synthetic */ String $source;
        final /* synthetic */ Date $startTime;
        final /* synthetic */ showTwoWheelDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(showTwoWheelDialog showtwowheeldialog, String str, Date date, String str2, String str3, String str4) {
            super(1);
            this.this$0 = showtwowheeldialog;
            this.$source = str;
            this.$startTime = date;
            this.$factorSid = str2;
            this.$challengeSid = str3;
            this.$failReason = str4;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.PUSH_VERIFY_COMPLETED;
            length.setMax("Source", this.$source);
            length.setMax(TrackerKey.Property.DURATION, showTwoWheelDialog.length(this.$startTime));
            String str = this.$factorSid;
            if (str != null) {
                length.setMax(TrackerKey.Property.FACTOR_SID, str);
            }
            length.setMax(TrackerKey.Property.CHALLENGE_SID, this.$challengeSid);
            length.setMin(TrackerKey.Property.IS_SUCCESS, false);
            length.setMax(TrackerKey.Property.FAIL_REASON, this.$failReason);
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
            length.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", locale, "Asia/Jakarta"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $challengeSid;
        final /* synthetic */ String $factorSid;
        final /* synthetic */ String $source;
        final /* synthetic */ Date $startTime;
        final /* synthetic */ showTwoWheelDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(showTwoWheelDialog showtwowheeldialog, String str, Date date, String str2, String str3) {
            super(1);
            this.this$0 = showtwowheeldialog;
            this.$source = str;
            this.$startTime = date;
            this.$factorSid = str2;
            this.$challengeSid = str3;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.PUSH_VERIFY_COMPLETED;
            length.setMax("Source", this.$source);
            length.setMax(TrackerKey.Property.DURATION, showTwoWheelDialog.length(this.$startTime));
            String str = this.$factorSid;
            if (str != null) {
                length.setMax(TrackerKey.Property.FACTOR_SID, str);
            }
            length.setMax(TrackerKey.Property.CHALLENGE_SID, this.$challengeSid);
            length.setMin(TrackerKey.Property.IS_SUCCESS, true);
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
            length.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", locale, "Asia/Jakarta"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $challengeSid;
        final /* synthetic */ String $source;
        final /* synthetic */ String $userUpdateResult;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(String str, String str2, String str3) {
            super(1);
            this.$source = str;
            this.$challengeSid = str2;
            this.$userUpdateResult = str3;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.PUSH_VERIFY_UPDATE_CHALLENGE;
            length.setMax("Source", this.$source);
            length.setMax(TrackerKey.Property.CHALLENGE_SID, this.$challengeSid);
            length.setMax(TrackerKey.Property.USER_UPDATE_RESULT, this.$userUpdateResult);
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
            length.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", locale, "Asia/Jakarta"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $source;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(String str) {
            super(1);
            this.$source = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.PUSH_VERIFY_CREATE_CHALLENGE;
            length.setMax("Source", this.$source);
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
            length.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", locale, "Asia/Jakarta"));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lid/dana/tracker/EventTrackerModel$Builder;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<convertDipToPx.length, Unit> {
        final /* synthetic */ String $challengeSid;
        final /* synthetic */ String $factorSid;
        final /* synthetic */ String $failReason;
        final /* synthetic */ String $source;
        final /* synthetic */ Date $startTime;
        final /* synthetic */ boolean $success;
        final /* synthetic */ showTwoWheelDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(showTwoWheelDialog showtwowheeldialog, String str, Date date, String str2, String str3, boolean z, String str4) {
            super(1);
            this.this$0 = showtwowheeldialog;
            this.$source = str;
            this.$startTime = date;
            this.$factorSid = str2;
            this.$challengeSid = str3;
            this.$success = z;
            this.$failReason = str4;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((convertDipToPx.length) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull convertDipToPx.length length) {
            Intrinsics.checkNotNullParameter(length, "$receiver");
            length.getMax = TrackerKey.Event.PUSH_VERIFY_RETURN_CREATE_CHALLENGE;
            length.setMax("Source", this.$source);
            length.setMax(TrackerKey.Property.DURATION, showTwoWheelDialog.length(this.$startTime));
            String str = this.$factorSid;
            if (str != null) {
                length.setMax(TrackerKey.Property.FACTOR_SID, str);
            }
            length.setMax(TrackerKey.Property.CHALLENGE_SID, this.$challengeSid);
            length.setMin(TrackerKey.Property.IS_SUCCESS, this.$success);
            String str2 = this.$failReason;
            if (str2 == null) {
                str2 = " ";
            }
            length.setMax(TrackerKey.Property.FAIL_REASON, str2);
            Locale locale = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
            length.setMax(TrackerKey.Property.TIME, startBluetoothDevicesDiscovery.getDateTime("HH:mm:ss, d, MMM, yyyy", locale, "Asia/Jakarta"));
        }
    }

    @Inject
    public showTwoWheelDialog(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.setMin = context;
    }

    public final void setMax(@NotNull String str, @NotNull Date date, @Nullable String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(str3, "challengeSid");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.setMin);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new setMin(this, str, date, str2, str3, z, (String) null).invoke(min);
        min.setMin();
        genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
    }

    public final void length(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(str2, "challengeSid");
        Intrinsics.checkNotNullParameter(str3, "userUpdateResult");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.setMin);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new isInside(str, str2, str3).invoke(min);
        min.setMin();
        genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
    }

    public final void setMax(@NotNull String str, @NotNull Date date, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(str3, "challengeSid");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.setMin);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new getMin(this, str, date, str2, str3).invoke(min);
        min.setMin();
        genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
    }

    public final void setMin(@NotNull String str, @NotNull Date date, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        int length2 = str.length();
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-927666059, oncanceled);
            onCancelLoad.getMin(-927666059, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str, "source");
        Intrinsics.checkNotNullParameter(date, "startTime");
        Intrinsics.checkNotNullParameter(str3, "challengeSid");
        Intrinsics.checkNotNullParameter(str4, "failReason");
        convertDipToPx.length min = convertDipToPx.length.setMin(this.setMin);
        Intrinsics.checkNotNullExpressionValue(min, "builder");
        new getMax(this, str, date, str2, str3, str4).invoke(min);
        min.setMin();
        genTextSelector.getMax(new convertDipToPx(min, (byte) 0));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/twilio/tracker/TwilioMixpanelTracker$Companion;", "", "()V", "DATE_FORMAT_TIME_PROPERTY", "", "FAIL_REASON_CLIENT_SESSION_EXPIRED", "FAIL_REASON_USER_REJECT", "JAKARTA_TIME_ZONE", "USER_UPDATE_RESULT_ACCEPT", "USER_UPDATE_RESULT_EXPIRED", "USER_UPDATE_RESULT_REJECT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ String length(Date date) {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "endTime");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf((double) ((Math.abs(date.getTime() - time.getTime()) / 1000) % 60))}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }
}
