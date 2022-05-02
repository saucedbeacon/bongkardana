package id.dana.twilio.identityverification;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.common.net.HttpHeaders;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.modules.TwilioIdentityVerificationModule;
import id.dana.notification.DanaFirebaseMessagingService;
import id.dana.notification.NotificationData;
import id.dana.richview.LogoProgressView;
import id.dana.twilio.trusteddevice.DeviceDetailView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverPageContainer;
import o.PrepareException;
import o.TinyAppBackHomeExtension;
import o.disableItems;
import o.dispatchOnCancelled;
import o.getProgressViewStartOffset;
import o.onCancelLoad;
import o.onCanceled;
import o.onInstallStart;
import o.resetInternal;
import o.showTwoWheelDialog;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0002J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u001bH\u0002J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J=\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042#\b\u0002\u0010,\u001a\u001d\u0012\u0013\u0012\u00110.¢\u0006\f\b/\u0012\b\b0\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020\u00190-H\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u001bH\u0002J \u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u00107\u001a\u00020\u0019H\u0002J\u0010\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u001bH\u0002J \u0010:\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u0004H\u0002J\f\u0010<\u001a\u00020=*\u00020\u0004H\u0002J\f\u0010>\u001a\u00020\u0004*\u00020=H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationActivity;", "Lid/dana/base/BaseActivity;", "()V", "challengeSid", "", "dateFormat", "Ljava/text/SimpleDateFormat;", "factorSid", "loginTime", "timeout", "twilioIdentityVerificationPresenter", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationPresenter;", "getTwilioIdentityVerificationPresenter", "()Lid/dana/twilio/identityverification/TwilioIdentityVerificationPresenter;", "setTwilioIdentityVerificationPresenter", "(Lid/dana/twilio/identityverification/TwilioIdentityVerificationPresenter;)V", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "getTwilioMixpanelTracker", "()Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "setTwilioMixpanelTracker", "(Lid/dana/twilio/tracker/TwilioMixpanelTracker;)V", "verificationType", "visibleDateFormat", "answerTwilioChallenge", "", "isApproved", "", "configToolbar", "getLayout", "", "getTwilioChallengeDetails", "init", "initInjector", "initViews", "isChallengeExpired", "onNewIntent", "intent", "Landroid/content/Intent;", "prepareBundleData", "showAcceptLoginFromOtherDeviceDialog", "showConfirmationDialog", "title", "message", "positiveAction", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "v", "showExpiredView", "isShow", "showOtherDeviceDetail", "deviceModel", "location", "showRejectLoginFromOtherDeviceDialog", "twilioMixpanelTrackerUpdateChallenge", "accept", "updateTwilioChallenge", "newStatus", "toLocalDate", "Ljava/util/Date;", "toStringFormat", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class TwilioIdentityVerificationActivity extends BaseActivity {
    @NotNull
    public static final String CHALLENGE_INFO_DEVICE = "device";
    @NotNull
    public static final String CHALLENGE_INFO_LOCATION = "location";
    @NotNull
    public static final String CHALLENGE_INFO_TIME = "time";
    @NotNull
    public static final String CHALLENGE_INFO_TIMEOUT = "timeout";
    @NotNull
    public static final String CHALLENGE_INFO_VERIFICATION_TYPE = "verificationType";
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    @NotNull
    public static final String VERIFICATION_TYPE_CHANGE_PIN = "change_pin";
    @NotNull
    public static final String VERIFICATION_TYPE_LOGIN = "login";
    /* access modifiers changed from: private */
    public String IsOverlapping;
    private HashMap equals;
    private String getMax;
    /* access modifiers changed from: private */
    public String getMin;
    /* access modifiers changed from: private */
    public String isInside;
    private String setMax;
    private final SimpleDateFormat toFloatRange = new SimpleDateFormat("d MMM yyyy HH:mm", Locale.ENGLISH);
    private final SimpleDateFormat toIntRange = new SimpleDateFormat(disableItems.DATE_FORMAT, Locale.ENGLISH);
    @Inject
    public TinyAppBackHomeExtension twilioIdentityVerificationPresenter;
    @Inject
    public showTwoWheelDialog twilioMixpanelTracker;

    public final void _$_clearFindViewByIdCache() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1117842485, oncanceled);
            onCancelLoad.getMin(1117842485, oncanceled);
        }
        HashMap hashMap = this.equals;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-1233297829, oncanceled);
            onCancelLoad.getMin(-1233297829, oncanceled);
        }
        if (this.equals == null) {
            this.equals = new HashMap();
        }
        View view = (View) this.equals.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.equals.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.activity_twilio_identity_verification;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TwilioIdentityVerificationActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            super(1);
            this.this$0 = twilioIdentityVerificationActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            TwilioIdentityVerificationActivity.access$answerTwilioChallenge(this.this$0, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<View, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ TwilioIdentityVerificationActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            super(1);
            this.this$0 = twilioIdentityVerificationActivity;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
            TwilioIdentityVerificationActivity.access$answerTwilioChallenge(this.this$0, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<View, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final void invoke(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((View) obj);
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ String access$getLoginTime$p(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        String str = twilioIdentityVerificationActivity.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginTime");
        }
        return str;
    }

    public static final /* synthetic */ String access$getTimeout$p(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        String str = twilioIdentityVerificationActivity.isInside;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CHALLENGE_INFO_TIMEOUT);
        }
        return str;
    }

    public static final /* synthetic */ String access$getVerificationType$p(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        String str = twilioIdentityVerificationActivity.getMin;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CHALLENGE_INFO_VERIFICATION_TYPE);
        }
        return str;
    }

    public static final /* synthetic */ void access$showAcceptLoginFromOtherDeviceDialog(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        int max;
        Context baseContext = twilioIdentityVerificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -1928373388 == (max = dispatchOnCancelled.getMax(applicationContext, -1928373388)))) {
            onCanceled oncanceled = new onCanceled(-1928373388, max, 512);
            onCancelLoad.setMax(-1928373388, oncanceled);
            onCancelLoad.getMin(-1928373388, oncanceled);
        }
        String string = twilioIdentityVerificationActivity.getString(R.string.want_to_use_in_other_device);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.want_to_use_in_other_device)");
        String string2 = twilioIdentityVerificationActivity.getString(R.string.twilio_dialog_login_from_other_device_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.twili…rom_other_device_message)");
        twilioIdentityVerificationActivity.getMax(string, string2, new isInside(twilioIdentityVerificationActivity));
    }

    public static final /* synthetic */ void access$showOtherDeviceDetail(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, String str, String str2, String str3) {
        int length2;
        int min;
        Context baseContext = twilioIdentityVerificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1279723974, oncanceled);
            onCancelLoad.getMin(1279723974, oncanceled);
        }
        DeviceDetailView deviceDetailView = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.DoNotInline);
        if (deviceDetailView != null) {
            deviceDetailView.setSubTitle(str);
        }
        DeviceDetailView deviceDetailView2 = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.FloatRange);
        if (deviceDetailView2 != null) {
            if (Intrinsics.areEqual((Object) str2, (Object) "unknown")) {
                String string = deviceDetailView2.getContext().getString(R.string.unknown);
                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.unknown)");
                deviceDetailView2.setSubTitle(string);
            } else {
                deviceDetailView2.setSubTitle(str2);
            }
        }
        DeviceDetailView deviceDetailView3 = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.to);
        if (deviceDetailView3 != null) {
            deviceDetailView3.setSubTitle(str3);
        }
    }

    public static final /* synthetic */ String access$toStringFormat(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, Date date) {
        int length2;
        int min;
        Context baseContext = twilioIdentityVerificationActivity.getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-617311638, oncanceled);
            onCancelLoad.getMin(-617311638, oncanceled);
        }
        String format = twilioIdentityVerificationActivity.toFloatRange.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "visibleDateFormat.format(this)");
        return format;
    }

    @NotNull
    public final TinyAppBackHomeExtension getTwilioIdentityVerificationPresenter() {
        TinyAppBackHomeExtension tinyAppBackHomeExtension = this.twilioIdentityVerificationPresenter;
        if (tinyAppBackHomeExtension == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIdentityVerificationPresenter");
        }
        return tinyAppBackHomeExtension;
    }

    public final void setTwilioIdentityVerificationPresenter(@NotNull TinyAppBackHomeExtension tinyAppBackHomeExtension) {
        Intrinsics.checkNotNullParameter(tinyAppBackHomeExtension, "<set-?>");
        this.twilioIdentityVerificationPresenter = tinyAppBackHomeExtension;
    }

    @NotNull
    public final showTwoWheelDialog getTwilioMixpanelTracker() {
        showTwoWheelDialog showtwowheeldialog = this.twilioMixpanelTracker;
        if (showtwowheeldialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
        }
        return showtwowheeldialog;
    }

    public final void setTwilioMixpanelTracker(@NotNull showTwoWheelDialog showtwowheeldialog) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1485184560, oncanceled);
            onCancelLoad.getMin(-1485184560, oncanceled);
        }
        Intrinsics.checkNotNullParameter(showtwowheeldialog, "<set-?>");
        this.twilioMixpanelTracker = showtwowheeldialog;
    }

    public final void configToolbar() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1855967957, oncanceled);
            onCancelLoad.getMin(-1855967957, oncanceled);
        }
        setTitle(getString(R.string.identity_verification_title));
        setMenuLeftButton((int) R.drawable.ic_close);
        setMenuLeftButtonOnClick(new getMax(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ TwilioIdentityVerificationActivity getMin;

        getMax(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.getMin = twilioIdentityVerificationActivity;
        }

        public final void onClick(View view) {
            TwilioIdentityVerificationActivity.access$showRejectLoginFromOtherDeviceDialog(this.getMin);
        }
    }

    public final void onNewIntent(@Nullable Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        init();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/twilio/identityverification/TwilioIdentityVerificationActivity$initInjector$1", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;", "dismissProgress", "", "onGetChallengeDetails", "challengeDetails", "", "", "onUpdateChallenge", "isSuccess", "", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements GriverPageContainer.H5CloseHandler.setMin {
        final /* synthetic */ TwilioIdentityVerificationActivity setMin;

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        length(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.setMin = twilioIdentityVerificationActivity;
        }

        public final void length(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "challengeDetails");
            this.setMin.IsOverlapping = String.valueOf(map.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME));
            this.setMin.isInside = String.valueOf(map.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT));
            this.setMin.getMin = String.valueOf(map.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_VERIFICATION_TYPE));
            if (this.setMin.getMin()) {
                this.setMin.getMin(true);
            } else {
                this.setMin.getMin(false);
                TwilioIdentityVerificationActivity twilioIdentityVerificationActivity = this.setMin;
                String valueOf = String.valueOf(map.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE));
                String valueOf2 = String.valueOf(map.get("location"));
                TwilioIdentityVerificationActivity twilioIdentityVerificationActivity2 = this.setMin;
                TwilioIdentityVerificationActivity.access$showOtherDeviceDetail(twilioIdentityVerificationActivity, valueOf, valueOf2, TwilioIdentityVerificationActivity.access$toStringFormat(twilioIdentityVerificationActivity2, twilioIdentityVerificationActivity2.setMin(String.valueOf(map.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME)))));
            }
            TwilioIdentityVerificationActivity.access$initViews(this.setMin);
        }

        public final void getMax(boolean z) {
            if (z) {
                this.setMin.finish();
            }
        }

        public final void showProgress() {
            FrameLayout frameLayout = (FrameLayout) this.setMin._$_findCachedViewById(resetInternal.setMax.RequiresPermission$Write);
            if (frameLayout != null) {
                View view = frameLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(0);
            }
            LogoProgressView logoProgressView = (LogoProgressView) this.setMin._$_findCachedViewById(resetInternal.setMax.setHeaderTitle);
            if (logoProgressView != null) {
                logoProgressView.startRefresh();
            }
        }

        public final void dismissProgress() {
            FrameLayout frameLayout = (FrameLayout) this.setMin._$_findCachedViewById(resetInternal.setMax.RequiresPermission$Write);
            if (frameLayout != null) {
                View view = frameLayout;
                Intrinsics.checkNotNullParameter(view, "<this>");
                view.setVisibility(8);
            }
            LogoProgressView logoProgressView = (LogoProgressView) this.setMin._$_findCachedViewById(resetInternal.setMax.setHeaderTitle);
            if (logoProgressView != null) {
                logoProgressView.stopRefresh();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/twilio/identityverification/TwilioIdentityVerificationActivity$initViews$5$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ TwilioIdentityVerificationActivity setMin;

        setMin(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.setMin = twilioIdentityVerificationActivity;
        }

        public final void onClick(View view) {
            TwilioIdentityVerificationActivity.access$twilioMixpanelTrackerUpdateChallenge(this.setMin, true);
            TwilioIdentityVerificationActivity.access$showAcceptLoginFromOtherDeviceDialog(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/twilio/identityverification/TwilioIdentityVerificationActivity$initViews$6$1"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ TwilioIdentityVerificationActivity getMax;

        getMin(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.getMax = twilioIdentityVerificationActivity;
        }

        public final void onClick(View view) {
            TwilioIdentityVerificationActivity.access$twilioMixpanelTrackerUpdateChallenge(this.getMax, false);
            TwilioIdentityVerificationActivity.access$showRejectLoginFromOtherDeviceDialog(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements View.OnClickListener {
        final /* synthetic */ TwilioIdentityVerificationActivity getMax;

        toIntRange(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.getMax = twilioIdentityVerificationActivity;
        }

        public final void onClick(View view) {
            this.getMax.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class equals implements View.OnClickListener {
        final /* synthetic */ TwilioIdentityVerificationActivity length;

        equals(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
            this.length = twilioIdentityVerificationActivity;
        }

        public final void onClick(View view) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.length._$_findCachedViewById(resetInternal.setMax.ParcelableVolumeInfo);
            if (constraintLayout == null || constraintLayout.getVisibility() != 0) {
                TwilioIdentityVerificationActivity.access$showRejectLoginFromOtherDeviceDialog(this.length);
            } else {
                this.length.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public final Date setMin(String str) {
        this.toIntRange.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date parse = this.toIntRange.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "dateFormat.parse(this)");
        this.toIntRange.setTimeZone(TimeZone.getDefault());
        String format = this.toIntRange.format(parse);
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(date)");
        Date parse2 = this.toIntRange.parse(format);
        Intrinsics.checkNotNullExpressionValue(parse2, "dateFormat.parse(formattedDate)");
        return parse2;
    }

    static /* synthetic */ void showConfirmationDialog$default(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = IsOverlapping.INSTANCE;
        }
        twilioIdentityVerificationActivity.getMax(str, str2, function1);
    }

    private final void getMax(String str, String str2, Function1<? super View, Unit> function1) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 22213726 == (max = dispatchOnCancelled.getMax(applicationContext, 22213726)))) {
            onCanceled oncanceled = new onCanceled(22213726, max, 512);
            onCancelLoad.setMax(22213726, oncanceled);
            onCancelLoad.getMin(22213726, oncanceled);
        }
        getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(this);
        getmax.toFloatRange = str;
        getProgressViewStartOffset.getMax getmax2 = getmax;
        getmax2.isInside = str2;
        getProgressViewStartOffset.getMax min = getmax2.setMax(false).IsOverlapping().getMax(getString(R.string.option_no), toFloatRange.INSTANCE).setMin(getString(R.string.option_yes), function1);
        new getProgressViewStartOffset(min.invoke, min.length, min, min.equals, (byte) 0).getMin().show();
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1874978129, oncanceled);
            onCancelLoad.getMin(-1874978129, oncanceled);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.setState);
        int i = 0;
        if (appCompatImageView != null) {
            View view = appCompatImageView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.measureVertical);
        if (textView != null) {
            View view2 = textView;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z3 ? 0 : 8);
        }
        DeviceDetailView deviceDetailView = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.DoNotInline);
        if (deviceDetailView != null) {
            View view3 = deviceDetailView;
            boolean z4 = !z;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            view3.setVisibility(z4 ? 0 : 8);
        }
        DeviceDetailView deviceDetailView2 = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.FloatRange);
        if (deviceDetailView2 != null) {
            View view4 = deviceDetailView2;
            boolean z5 = !z;
            Intrinsics.checkNotNullParameter(view4, "<this>");
            view4.setVisibility(z5 ? 0 : 8);
        }
        DeviceDetailView deviceDetailView3 = (DeviceDetailView) _$_findCachedViewById(resetInternal.setMax.to);
        if (deviceDetailView3 != null) {
            View view5 = deviceDetailView3;
            boolean z6 = !z;
            Intrinsics.checkNotNullParameter(view5, "<this>");
            view5.setVisibility(z6 ? 0 : 8);
        }
        TextView textView2 = (TextView) _$_findCachedViewById(resetInternal.setMax.setSwitchTypeface);
        if (textView2 != null) {
            View view6 = textView2;
            boolean z7 = !z;
            Intrinsics.checkNotNullParameter(view6, "<this>");
            view6.setVisibility(z7 ? 0 : 8);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) _$_findCachedViewById(resetInternal.setMax.onMessageChannelReady);
        if (danaButtonSecondaryView != null) {
            View view7 = danaButtonSecondaryView;
            boolean z8 = !z;
            Intrinsics.checkNotNullParameter(view7, "<this>");
            view7.setVisibility(z8 ? 0 : 8);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) _$_findCachedViewById(resetInternal.setMax.updateVisuals);
        if (danaButtonPrimaryView != null) {
            View view8 = danaButtonPrimaryView;
            boolean z9 = !z;
            Intrinsics.checkNotNullParameter(view8, "<this>");
            view8.setVisibility(z9 ? 0 : 8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.ParcelableVolumeInfo);
        if (constraintLayout != null) {
            View view9 = constraintLayout;
            Intrinsics.checkNotNullParameter(view9, "<this>");
            view9.setVisibility(z ? 0 : 8);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(resetInternal.setMax.MediaSessionCompat$MediaSessionImplApi21$ExtraSession);
        if (constraintLayout2 != null) {
            View view10 = constraintLayout2;
            boolean z10 = !z;
            Intrinsics.checkNotNullParameter(view10, "<this>");
            if (!z10) {
                i = 8;
            }
            view10.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    public final boolean getMin() {
        if (this.twilioIdentityVerificationPresenter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioIdentityVerificationPresenter");
        }
        String str = this.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginTime");
        }
        Date min = setMin(str);
        String str2 = this.isInside;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(CHALLENGE_INFO_TIMEOUT);
        }
        return TinyAppBackHomeExtension.getMax(min, Integer.parseInt(str2));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/twilio/identityverification/TwilioIdentityVerificationActivity$Companion;", "", "()V", "CHALLENGE_INFO_DEVICE", "", "CHALLENGE_INFO_LOCATION", "CHALLENGE_INFO_TIME", "CHALLENGE_INFO_TIMEOUT", "CHALLENGE_INFO_VERIFICATION_TYPE", "DATE_FORMAT", "LOCATION_UNKNOWN", "STATUS_APPROVED", "STATUS_DENIED", "VERIFICATION_TYPE_CHANGE_PIN", "VERIFICATION_TYPE_LOGIN", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void init() {
        NotificationData notificationData;
        onInstallStart.setMax setmax = new onInstallStart.setMax((byte) 0);
        PrepareException.AnonymousClass1 applicationComponent = getApplicationComponent();
        if (applicationComponent != null) {
            setmax.getMax = applicationComponent;
            setmax.setMax = new TwilioIdentityVerificationModule(new length(this));
            stopIgnoring.setMin(setmax.setMax, TwilioIdentityVerificationModule.class);
            stopIgnoring.setMin(setmax.getMax, PrepareException.AnonymousClass1.class);
            new onInstallStart(setmax.setMax, setmax.getMax, (byte) 0).getMin(this);
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, IpcMessageConstants.EXTRA_INTENT);
            Bundle extras = intent.getExtras();
            if (extras != null && (notificationData = (NotificationData) extras.getParcelable(DanaFirebaseMessagingService.MESSAGE_DATA)) != null) {
                String str = notificationData.toString;
                Intrinsics.checkNotNullExpressionValue(str, "it.twilioFactorSid");
                this.setMax = str;
                String str2 = notificationData.toDoubleRange;
                Intrinsics.checkNotNullExpressionValue(str2, "it.twilioChallengeSid");
                this.getMax = str2;
                String str3 = notificationData.toDoubleRange;
                Intrinsics.checkNotNullExpressionValue(str3, "it.twilioChallengeSid");
                String str4 = notificationData.toString;
                Intrinsics.checkNotNullExpressionValue(str4, "it.twilioFactorSid");
                TinyAppBackHomeExtension tinyAppBackHomeExtension = this.twilioIdentityVerificationPresenter;
                if (tinyAppBackHomeExtension == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("twilioIdentityVerificationPresenter");
                }
                Intrinsics.checkNotNullParameter(str3, "challengeSid");
                Intrinsics.checkNotNullParameter(str4, "factorSid");
                tinyAppBackHomeExtension.setMax.showProgress();
                tinyAppBackHomeExtension.setMin.execute(TinyAppBackHomeExtension.setMin(str3, str4), new TinyAppBackHomeExtension.setMin(tinyAppBackHomeExtension), new TinyAppBackHomeExtension.setMax(tinyAppBackHomeExtension));
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$showRejectLoginFromOtherDeviceDialog(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        String string = twilioIdentityVerificationActivity.getString(R.string.want_to_reject_login_from_other_device);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.want_…_login_from_other_device)");
        String string2 = twilioIdentityVerificationActivity.getString(R.string.twilio_dialog_reject_login_other_device_message);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.twili…gin_other_device_message)");
        twilioIdentityVerificationActivity.getMax(string, string2, new values(twilioIdentityVerificationActivity));
    }

    public static final /* synthetic */ void access$initViews(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity) {
        TextView textView = (TextView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.measureVertical);
        if (textView != null) {
            String str = twilioIdentityVerificationActivity.getMin;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException(CHALLENGE_INFO_VERIFICATION_TYPE);
            }
            if (Intrinsics.areEqual((Object) str, (Object) "login")) {
                textView.setText(twilioIdentityVerificationActivity.getString(R.string.twilio_identity_verification_login_other_device_confirmation));
            } else {
                String str2 = twilioIdentityVerificationActivity.getMin;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(CHALLENGE_INFO_VERIFICATION_TYPE);
                }
                if (Intrinsics.areEqual((Object) str2, (Object) VERIFICATION_TYPE_CHANGE_PIN)) {
                    textView.setText(twilioIdentityVerificationActivity.getString(R.string.twilio_identity_verification_change_pin_confirmation));
                }
            }
        }
        DeviceDetailView deviceDetailView = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.DoNotInline);
        if (deviceDetailView != null) {
            deviceDetailView.showTopDivider(true);
            deviceDetailView.setBottomDividerShortRight(true);
            String string = twilioIdentityVerificationActivity.getString(R.string.device_model);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.device_model)");
            deviceDetailView.setTitle(string);
        }
        DeviceDetailView deviceDetailView2 = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.FloatRange);
        if (deviceDetailView2 != null) {
            deviceDetailView2.setBottomDividerShortRight(true);
            String string2 = twilioIdentityVerificationActivity.getString(R.string.location);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.location)");
            deviceDetailView2.setTitle(string2);
        }
        DeviceDetailView deviceDetailView3 = (DeviceDetailView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.to);
        if (deviceDetailView3 != null) {
            String string3 = twilioIdentityVerificationActivity.getString(R.string.login_time);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.login_time)");
            deviceDetailView3.setTitle(string3);
        }
        TextView textView2 = (TextView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.setSwitchTypeface);
        if (textView2 != null) {
            View view = textView2;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.updateVisuals);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new setMin(twilioIdentityVerificationActivity));
            danaButtonPrimaryView.setVisibility(0);
        }
        DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.onMessageChannelReady);
        if (danaButtonSecondaryView != null) {
            danaButtonSecondaryView.setOnClickListener(new getMin(twilioIdentityVerificationActivity));
            danaButtonSecondaryView.setVisibility(0);
        }
        DanaButtonPrimaryView danaButtonPrimaryView2 = (DanaButtonPrimaryView) twilioIdentityVerificationActivity._$_findCachedViewById(resetInternal.setMax.onRelationshipValidationResult);
        if (danaButtonPrimaryView2 != null) {
            danaButtonPrimaryView2.setOnClickListener(new toIntRange(twilioIdentityVerificationActivity));
        }
        twilioIdentityVerificationActivity.setMenuLeftButtonOnClick(new equals(twilioIdentityVerificationActivity));
    }

    public static final /* synthetic */ void access$twilioMixpanelTrackerUpdateChallenge(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, boolean z) {
        String str = z ? HttpHeaders.ACCEPT : "Reject";
        showTwoWheelDialog showtwowheeldialog = twilioIdentityVerificationActivity.twilioMixpanelTracker;
        if (showtwowheeldialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
        }
        String str2 = twilioIdentityVerificationActivity.getMax;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("challengeSid");
        }
        showtwowheeldialog.length("Login", str2, str);
    }

    public static final /* synthetic */ void access$answerTwilioChallenge(TwilioIdentityVerificationActivity twilioIdentityVerificationActivity, boolean z) {
        if (!twilioIdentityVerificationActivity.getMin()) {
            String str = twilioIdentityVerificationActivity.setMax;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("factorSid");
            }
            String str2 = twilioIdentityVerificationActivity.getMax;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("challengeSid");
            }
            String str3 = z ? "approved" : DanaLogConstants.PushPermissionStatus.PUSH_DISABLED;
            TinyAppBackHomeExtension tinyAppBackHomeExtension = twilioIdentityVerificationActivity.twilioIdentityVerificationPresenter;
            if (tinyAppBackHomeExtension == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioIdentityVerificationPresenter");
            }
            Intrinsics.checkNotNullParameter(str, "factorSid");
            Intrinsics.checkNotNullParameter(str2, "challengeSid");
            Intrinsics.checkNotNullParameter(str3, "newStatus");
            tinyAppBackHomeExtension.setMax.showProgress();
            tinyAppBackHomeExtension.getMin.execute(TinyAppBackHomeExtension.setMin(str, str2, str3), new TinyAppBackHomeExtension.getMin(tinyAppBackHomeExtension), new TinyAppBackHomeExtension.getMax(tinyAppBackHomeExtension));
            return;
        }
        twilioIdentityVerificationActivity.getMin(true);
    }
}
