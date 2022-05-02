package id.dana.challenge.verifypush;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import id.dana.data.tracker.TrackerDataKey;
import id.dana.di.modules.VerifyPushChallengeModule;
import id.dana.dialog.DialogWithImage;
import id.dana.lib.gcontainer.app.bridge.imagepicker.ImagePickerEvent;
import id.dana.onboarding.verify.VerifyNumberFragment;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import o.BlurProcess;
import o.CornerMarkingDataProvider;
import o.FtsOptions$Order;
import o.IRedDotManager;
import o.PrepareException;
import o.WheelView;
import o.beginTransaction;
import o.checkMainPackage;
import o.click;
import o.convertDipToPx;
import o.convertSpToPx;
import o.disableItems;
import o.genTextSelector;
import o.isSlideable;
import o.onDelete;
import o.onPanelDragged;
import o.onReceivedIcon;
import o.resetInternal;
import o.setShadowDrawable;
import o.setStateOn;
import o.showTwoWheelDialog;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\r*\u0001\u0006\u0018\u0000 `2\u00020\u0001:\u0001`B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001203H\u0002J\u0010\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0012H\u0002J\b\u00109\u001a\u00020\u000fH\u0014J\n\u0010:\u001a\u0004\u0018\u00010;H\u0002J\b\u0010<\u001a\u000205H\u0002J\b\u0010=\u001a\u00020\u0012H\u0002J\b\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u000205H\u0014J\b\u0010A\u001a\u000205H\u0002J\b\u0010B\u001a\u000205H\u0002J\b\u0010C\u001a\u000205H\u0002J\b\u0010D\u001a\u000205H\u0002J\b\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020FH\u0002J\u0010\u0010H\u001a\u0002052\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u000205H\u0016J\u0010\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0010\u0010N\u001a\u0002052\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0012\u0010O\u001a\u0002052\b\u00106\u001a\u0004\u0018\u000107H\u0002J\b\u0010P\u001a\u000205H\u0002J\b\u0010Q\u001a\u000205H\u0002J\u0016\u0010R\u001a\u00020F2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120TH\u0002J\u0010\u0010U\u001a\u0002052\u0006\u0010V\u001a\u00020\u000fH\u0002J\b\u0010W\u001a\u000205H\u0002J\b\u0010X\u001a\u000205H\u0002J\u0010\u0010Y\u001a\u0002052\u0006\u0010M\u001a\u00020\u0012H\u0002J\u0010\u0010Z\u001a\u0002052\u0006\u0010M\u001a\u00020\u0012H\u0002J\b\u0010[\u001a\u000205H\u0002J\b\u0010\\\u001a\u000205H\u0002J\u0010\u0010]\u001a\u0002052\u0006\u0010^\u001a\u00020\u0012H\u0002J\b\u0010_\u001a\u000205H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R#\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001b\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u0006a"}, d2 = {"Lid/dana/challenge/verifypush/VerifyPushChallengeFragment;", "Lid/dana/base/BaseFragment;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "countDownDialogCS", "id/dana/challenge/verifypush/VerifyPushChallengeFragment$countDownDialogCS$2$1", "getCountDownDialogCS", "()Lid/dana/challenge/verifypush/VerifyPushChallengeFragment$countDownDialogCS$2$1;", "countDownDialogCS$delegate", "Lkotlin/Lazy;", "countDownTimer", "Landroid/os/CountDownTimer;", "countDownUserInactiveTimeout", "counter", "", "counterDialogCS", "currentAddress", "", "geocoder", "Landroid/location/Geocoder;", "locationPermission", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "getLocationPermission", "()Lid/dana/utils/permission/Permission;", "locationPermission$delegate", "phonePermission", "getPhonePermission", "phonePermission$delegate", "retryCount", "scenario", "", "scenarioListener", "Lid/dana/challenge/ChallengeScenarioListener;", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "getTwilioMixpanelTracker", "()Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "setTwilioMixpanelTracker", "(Lid/dana/twilio/tracker/TwilioMixpanelTracker;)V", "twilioTrackerStartTime", "Ljava/util/Date;", "userInactiveTimeout", "verifyPushLoginPresenter", "Lid/dana/challenge/verifypush/VerifyPushLoginPresenter;", "getVerifyPushLoginPresenter", "()Lid/dana/challenge/verifypush/VerifyPushLoginPresenter;", "setVerifyPushLoginPresenter", "(Lid/dana/challenge/verifypush/VerifyPushLoginPresenter;)V", "createChallengeInfo", "", "getAddress", "", "location", "Landroid/location/Location;", "getDeviceModel", "getLayout", "getRiskRejectDialogListener", "Landroid/content/DialogInterface$OnClickListener;", "getTwilioTimeoutConfig", "getUTCTime", "getVerifyPushChallengeModule", "Lid/dana/di/modules/VerifyPushChallengeModule;", "init", "initChallengeScenario", "initInjector", "initPermission", "initResendButton", "isHaveLocationPermission", "", "isTwilioHasFallback", "onAttach", "context", "Landroid/content/Context;", "onDestroyView", "onFinishCounter", "challengeSid", "onFinishUserInactiveTimeoutCounter", "onLocationUpdate", "onVerifyPushExpire", "onVerifyPushFailed", "removeTwilioChallengeScenario", "scenarioList", "", "setRemainingTime", "countdown", "showCountDown", "showDialogCS", "startMainTimer", "startUserInactiveTimer", "stopCounterDialogCS", "stopTimer", "trackDisplayedErrorLogin", "errorMessage", "updateLocation", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class VerifyPushChallengeFragment extends FtsOptions$Order {
    @NotNull
    public static final getMax setMin = new getMax((byte) 0);
    /* access modifiers changed from: private */
    public int FastBitmap$CoordinateSystem;
    /* access modifiers changed from: private */
    public List<String> Grayscale$Algorithm = new ArrayList();
    private final Lazy IsOverlapping = LazyKt.lazy(new getMin(this));
    /* access modifiers changed from: private */
    public Date Mean$Arithmetic;
    private CountDownTimer equals;
    private Geocoder getMin;
    /* access modifiers changed from: private */
    public int hashCode = 20;
    private String invoke = "unknown";
    private final Lazy isInside = LazyKt.lazy(new IsOverlapping(this));
    private beginTransaction setMax;
    /* access modifiers changed from: private */
    public int toDoubleRange = 10;
    private IRedDotManager toFloatRange;
    private CountDownTimer toIntRange;
    private final Lazy toString = LazyKt.lazy(new equals(this));
    @Inject
    public showTwoWheelDialog twilioMixpanelTracker;
    private HashMap valueOf;
    /* access modifiers changed from: private */
    public int values = 3;
    @Inject
    public onPanelDragged verifyPushLoginPresenter;

    private View setMin(int i) {
        if (this.valueOf == null) {
            this.valueOf = new HashMap();
        }
        View view = (View) this.valueOf.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.valueOf.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int setMin() {
        return R.layout.fragment_verify_push_challenge;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Landroid/location/Location;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function1<Location, Unit> {
        isInside(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            super(1, verifyPushChallengeFragment, VerifyPushChallengeFragment.class, "onLocationUpdate", "onLocationUpdate(Landroid/location/Location;)V", 0);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Location) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Location location) {
            VerifyPushChallengeFragment.length((VerifyPushChallengeFragment) this.receiver, location);
        }
    }

    public VerifyPushChallengeFragment() {
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        Date time = instance.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "Calendar.getInstance().time");
        this.Mean$Arithmetic = time;
    }

    public static final /* synthetic */ beginTransaction toFloatRange(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        beginTransaction begintransaction = verifyPushChallengeFragment.setMax;
        if (begintransaction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
        }
        return begintransaction;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/challenge/verifypush/VerifyPushChallengeFragment$countDownDialogCS$2$1", "invoke", "()Lid/dana/challenge/verifypush/VerifyPushChallengeFragment$countDownDialogCS$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<AnonymousClass1> {
        final /* synthetic */ VerifyPushChallengeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            super(0);
            this.this$0 = verifyPushChallengeFragment;
        }

        @NotNull
        public final AnonymousClass1 invoke() {
            VerifyPushChallengeFragment.values(this.this$0);
            return new CountDownTimer(this, TimeUnit.SECONDS.toMillis((long) this.this$0.values), TimeUnit.SECONDS.toMillis(1)) {
                final /* synthetic */ getMin getMin;

                {
                    this.getMin = r1;
                }

                public final void onTick(long j) {
                    VerifyPushChallengeFragment verifyPushChallengeFragment = this.getMin.this$0;
                    verifyPushChallengeFragment.values = verifyPushChallengeFragment.values - 1;
                    VerifyPushChallengeFragment verifyPushChallengeFragment2 = this.getMin.this$0;
                    String string = this.getMin.this$0.getResources().getString(R.string.face_login_failed_cs);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.face_login_failed_cs)");
                    BlurProcess.getMin(verifyPushChallengeFragment2.getContext(), TrackerDataKey.NetworkErrorOperationTypeProperty.LOGIN, "", string, "Login");
                }

                public final void onFinish() {
                    ((AnonymousClass1) this.getMin.this$0.IsOverlapping.getValue()).cancel();
                    VerifyNumberFragment.getMax getmax = VerifyNumberFragment.setMax;
                    new VerifyNumberFragment();
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ VerifyPushChallengeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            super(0);
            this.this$0 = verifyPushChallengeFragment;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Fragment) this.this$0);
            getmin.length.add("android.permission.ACCESS_FINE_LOCATION");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ IsOverlapping length;

                {
                    this.length = r1;
                }

                public final void getMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    VerifyPushChallengeFragment.invokeSuspend(this.length.this$0);
                }

                public final void setMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    VerifyPushChallengeFragment.invokeSuspend(this.length.this$0);
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lid/dana/utils/permission/Permission;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function0<setStateOn> {
        final /* synthetic */ VerifyPushChallengeFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            super(0);
            this.this$0 = verifyPushChallengeFragment;
        }

        public final setStateOn invoke() {
            setStateOn.getMin getmin = new setStateOn.getMin((Fragment) this.this$0);
            getmin.length.add("android.permission.CALL_PHONE");
            getmin.getMax = new setStateOn.length(this) {
                final /* synthetic */ equals getMax;

                public final void setMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                }

                {
                    this.getMax = r1;
                }

                public final void getMin(@NotNull setStateOn.setMin setmin) {
                    Intrinsics.checkNotNullParameter(setmin, "report");
                    click.getMin(this.getMax.this$0.getMax, "1500445", setmin.setMax());
                }
            };
            return new setStateOn(getmin, (byte) 0);
        }
    }

    public final void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        super.onAttach(context);
        try {
            BaseActivity baseActivity = this.getMax;
            if (baseActivity != null) {
                beginTransaction begintransaction = (beginTransaction) baseActivity;
                this.setMax = begintransaction;
                if (begintransaction == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
                }
                begintransaction.hideClose();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.challenge.ChallengeScenarioListener");
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.toString());
            sb.append("must implement ChallengeScenarioListener");
            throw new ClassCastException(sb.toString());
        }
    }

    public final void onDestroyView() {
        equals();
        super.onDestroyView();
        HashMap hashMap = this.valueOf;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0011"}, d2 = {"id/dana/challenge/verifypush/VerifyPushChallengeFragment$getVerifyPushChallengeModule$1", "Lid/dana/challenge/verifypush/VerifyPushContract$View;", "onFailedVerifyPushLogin", "", "errorMessage", "", "challengeSid", "onGetTwilioConfig", "timeOut", "", "counter", "onRejectVerifyPushLogin", "onRequestChallenge", "timer", "success", "", "onSuccessVerifyPushLogin", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements setShadowDrawable.setMin {
        final /* synthetic */ VerifyPushChallengeFragment setMin;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            this.setMin = verifyPushChallengeFragment;
        }

        public final void setMin(int i, int i2) {
            this.setMin.hashCode = i2;
            this.setMin.toDoubleRange = i;
            showTwoWheelDialog showtwowheeldialog = this.setMin.twilioMixpanelTracker;
            if (showtwowheeldialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
            }
            Intrinsics.checkNotNullParameter("Login", "source");
            convertDipToPx.length min = convertDipToPx.length.setMin(showtwowheeldialog.setMin);
            Intrinsics.checkNotNullExpressionValue(min, "builder");
            new showTwoWheelDialog.length("Login").invoke(min);
            min.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(min, (byte) 0);
            List length = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length.toArray(new convertSpToPx[length.size()]));
            onPanelDragged onpaneldragged = this.setMin.verifyPushLoginPresenter;
            if (onpaneldragged == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPushLoginPresenter");
            }
            onpaneldragged.length("LOGIN_FROM_NEW_DEVICE", VerifyPushChallengeFragment.length(this.setMin));
            VerifyPushChallengeFragment verifyPushChallengeFragment = this.setMin;
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            Date time = instance.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "Calendar.getInstance().time");
            verifyPushChallengeFragment.Mean$Arithmetic = time;
        }

        public final void length(@NotNull String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "challengeSid");
            showTwoWheelDialog showtwowheeldialog = this.setMin.twilioMixpanelTracker;
            if (showtwowheeldialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
            }
            showtwowheeldialog.setMax("Login", this.setMin.Mean$Arithmetic, (String) null, str, z);
            VerifyPushChallengeFragment.getMax(this.setMin);
            VerifyPushChallengeFragment.getMin(this.setMin, str);
            VerifyPushChallengeFragment verifyPushChallengeFragment = this.setMin;
            Calendar instance = Calendar.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
            Date time = instance.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "Calendar.getInstance().time");
            verifyPushChallengeFragment.Mean$Arithmetic = time;
        }

        public final void length(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "challengeSid");
            showTwoWheelDialog showtwowheeldialog = this.setMin.twilioMixpanelTracker;
            if (showtwowheeldialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
            }
            showtwowheeldialog.setMax("Login", this.setMin.Mean$Arithmetic, (String) null, str);
            VerifyPushChallengeFragment.toFloatRange(this.setMin).onNext((List<String>) null);
        }

        public final void setMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "challengeSid");
            showTwoWheelDialog showtwowheeldialog = this.setMin.twilioMixpanelTracker;
            if (showtwowheeldialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
            }
            showtwowheeldialog.setMin("Login", this.setMin.Mean$Arithmetic, (String) null, str, "User Reject");
            this.setMin.equals();
            VerifyPushChallengeFragment.isInside(this.setMin).start();
        }

        public final void getMax(@Nullable String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "challengeSid");
            showTwoWheelDialog showtwowheeldialog = this.setMin.twilioMixpanelTracker;
            if (showtwowheeldialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
            }
            Date max = this.setMin.Mean$Arithmetic;
            if (str == null) {
                str = "";
            }
            showtwowheeldialog.setMin("Login", max, (String) null, str2, str);
            if (this.setMin.getMax() && this.setMin.FastBitmap$CoordinateSystem > 1) {
                VerifyPushChallengeFragment.toFloatRange(this.setMin).onNext(this.setMin.Grayscale$Algorithm);
            } else if (this.setMin.FastBitmap$CoordinateSystem > 1) {
                VerifyPushChallengeFragment.isInside(this.setMin).start();
            }
        }
    }

    private static boolean getMax(List<String> list) {
        return list.size() > 1;
    }

    /* access modifiers changed from: private */
    public final boolean getMax() {
        return Intrinsics.areEqual((Object) this.Grayscale$Algorithm, (Object) CollectionsKt.emptyList()) ^ true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/challenge/verifypush/VerifyPushChallengeFragment$startMainTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "l", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends CountDownTimer {
        final /* synthetic */ Ref.IntRef length;
        final /* synthetic */ String setMax;
        final /* synthetic */ VerifyPushChallengeFragment setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(VerifyPushChallengeFragment verifyPushChallengeFragment, Ref.IntRef intRef, String str, long j, long j2) {
            super(j, j2);
            this.setMin = verifyPushChallengeFragment;
            this.length = intRef;
            this.setMax = str;
        }

        public final void onTick(long j) {
            Ref.IntRef intRef = this.length;
            intRef.element--;
            VerifyPushChallengeFragment.getMin(this.setMin, this.length.element);
        }

        public final void onFinish() {
            if (this.setMin.FastBitmap$CoordinateSystem <= 0) {
                VerifyPushChallengeFragment.toDoubleRange(this.setMin);
                VerifyPushChallengeFragment.setMax(this.setMin, this.setMax);
            } else {
                VerifyPushChallengeFragment.getMax(this.setMin, this.setMax);
            }
            this.length.element = this.setMin.hashCode;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"id/dana/challenge/verifypush/VerifyPushChallengeFragment$startUserInactiveTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "l", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange extends CountDownTimer {
        final /* synthetic */ String getMax;
        final /* synthetic */ VerifyPushChallengeFragment setMax;
        final /* synthetic */ Ref.IntRef setMin;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(VerifyPushChallengeFragment verifyPushChallengeFragment, Ref.IntRef intRef, String str, long j, long j2) {
            super(j, j2);
            this.setMax = verifyPushChallengeFragment;
            this.setMin = intRef;
            this.getMax = str;
        }

        public final void onTick(long j) {
            Ref.IntRef intRef = this.setMin;
            intRef.element--;
        }

        public final void onFinish() {
            VerifyPushChallengeFragment.setMin(this.setMax, this.getMax);
            this.setMin.element = this.setMax.toDoubleRange;
        }
    }

    /* access modifiers changed from: private */
    public final void equals() {
        CountDownTimer countDownTimer = this.toIntRange;
        if (!(countDownTimer == null || countDownTimer == null)) {
            countDownTimer.cancel();
        }
        CountDownTimer countDownTimer2 = this.equals;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ VerifyPushChallengeFragment getMin;

        setMax(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            this.getMin = verifyPushChallengeFragment;
        }

        public final void onClick(View view) {
            this.getMin.equals();
            onPanelDragged onpaneldragged = this.getMin.verifyPushLoginPresenter;
            if (onpaneldragged == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPushLoginPresenter");
            }
            onpaneldragged.length("LOGIN_FROM_NEW_DEVICE", VerifyPushChallengeFragment.length(this.getMin));
            VerifyPushChallengeFragment verifyPushChallengeFragment = this.getMin;
            verifyPushChallengeFragment.FastBitmap$CoordinateSystem = verifyPushChallengeFragment.FastBitmap$CoordinateSystem + 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "which", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnClickListener {
        final /* synthetic */ VerifyPushChallengeFragment length;

        setMin(VerifyPushChallengeFragment verifyPushChallengeFragment) {
            this.length = verifyPushChallengeFragment;
        }

        public final void onClick(@NotNull DialogInterface dialogInterface, int i) {
            Intrinsics.checkNotNullParameter(dialogInterface, ImagePickerEvent.DIALOG);
            if (-1 == i) {
                setStateOn FastBitmap$CoordinateSystem = VerifyPushChallengeFragment.FastBitmap$CoordinateSystem(this.length);
                if (FastBitmap$CoordinateSystem != null) {
                    FastBitmap$CoordinateSystem.setMin();
                }
                dialogInterface.dismiss();
            }
        }
    }

    private final boolean toDoubleRange() {
        return CornerMarkingDataProvider.IsOverlapping() && setStateOn.getMin(this.getMax, "android.permission.ACCESS_FINE_LOCATION");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/challenge/verifypush/VerifyPushChallengeFragment$Companion;", "", "()V", "COUNTER_DIALOG_CS", "", "DEFAULT_ADDRESS", "", "SCENE", "create", "Lid/dana/challenge/verifypush/VerifyPushChallengeFragment;", "data", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r2;
        checkMainPackage.length length2 = new checkMainPackage.length((byte) 0);
        if (this.getMax != null) {
            r2 = this.getMax.getApplicationComponent();
        } else {
            r2 = null;
        }
        if (r2 != null) {
            length2.getMax = r2;
            length2.getMin = new VerifyPushChallengeModule(new length(this));
            stopIgnoring.setMin(length2.getMin, VerifyPushChallengeModule.class);
            stopIgnoring.setMin(length2.getMax, PrepareException.AnonymousClass1.class);
            new checkMainPackage(length2.getMin, length2.getMax, (byte) 0).length(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            onPanelDragged onpaneldragged = this.verifyPushLoginPresenter;
            if (onpaneldragged == null) {
                Intrinsics.throwUninitializedPropertyAccessException("verifyPushLoginPresenter");
            }
            getminArr[0] = onpaneldragged;
            getMin(getminArr);
            Bundle arguments = getArguments();
            if (arguments != null) {
                List stringArrayList = arguments.getStringArrayList(ChallengePinWithFaceActivity.CHALLENGE_METHOD_LIST);
                if (stringArrayList == null) {
                    stringArrayList = CollectionsKt.emptyList();
                }
                if (getMax((List<String>) stringArrayList)) {
                    List<String> mutableList = CollectionsKt.toMutableList(stringArrayList);
                    mutableList.remove(0);
                    Unit unit = Unit.INSTANCE;
                    this.Grayscale$Algorithm = mutableList;
                }
            }
            ((setStateOn) this.isInside.getValue()).setMin();
            if (toDoubleRange()) {
                IRedDotManager iRedDotManager = new IRedDotManager();
                this.toFloatRange = iRedDotManager;
                if (iRedDotManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("compositeDisposable");
                }
                iRedDotManager.getMin(new WheelView.ScrollerTask.getMax(this.getMax).getMin().subscribe(new isSlideable(new isInside(this))));
            }
            DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) setMin(resetInternal.setMax.cancelAll);
            if (danaButtonPrimaryView != null) {
                danaButtonPrimaryView.setOnClickListener(new setMax(this));
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ Map length(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(disableItems.DATE_FORMAT, Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("gmt"));
        String format = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "dateFormat.format(Date())");
        return MapsKt.mapOf(TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_DEVICE, sb.toString()), TuplesKt.to("location", verifyPushChallengeFragment.invoke), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIME, format), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT, String.valueOf(verifyPushChallengeFragment.hashCode)), TuplesKt.to(TwilioIdentityVerificationActivity.CHALLENGE_INFO_VERIFICATION_TYPE, "login"));
    }

    public static final /* synthetic */ void getMax(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        LinearLayout linearLayout = (LinearLayout) verifyPushChallengeFragment.setMin(resetInternal.setMax.clearHeader);
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.setThumbTintList);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
        }
    }

    public static final /* synthetic */ void getMin(VerifyPushChallengeFragment verifyPushChallengeFragment, String str) {
        if (verifyPushChallengeFragment.toIntRange == null) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = verifyPushChallengeFragment.hashCode;
            verifyPushChallengeFragment.toIntRange = new toIntRange(verifyPushChallengeFragment, intRef, str, TimeUnit.SECONDS.toMillis((long) intRef.element), TimeUnit.SECONDS.toMillis(1));
        }
        CountDownTimer countDownTimer = verifyPushChallengeFragment.toIntRange;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    public static final /* synthetic */ getMin.AnonymousClass1 isInside(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        return (getMin.AnonymousClass1) verifyPushChallengeFragment.IsOverlapping.getValue();
    }

    public static final /* synthetic */ void getMin(VerifyPushChallengeFragment verifyPushChallengeFragment, int i) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.setThumbTintList);
        if (appCompatTextView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = verifyPushChallengeFragment.getString(R.string.twilio_bottomsheet_countdown_timer);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.twili…tomsheet_countdown_timer)");
            String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            appCompatTextView.setText(format);
        }
    }

    public static final /* synthetic */ void toDoubleRange(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.setThumbTintList);
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) verifyPushChallengeFragment.setMin(resetInternal.setMax.clearHeader);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.hasExpandedActionView);
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(verifyPushChallengeFragment.getString(R.string.twilio_bottomsheet_left_attempt));
        }
    }

    public static final /* synthetic */ void setMax(VerifyPushChallengeFragment verifyPushChallengeFragment, String str) {
        if (verifyPushChallengeFragment.equals == null) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = verifyPushChallengeFragment.toDoubleRange;
            verifyPushChallengeFragment.equals = new toFloatRange(verifyPushChallengeFragment, intRef, str, TimeUnit.SECONDS.toMillis((long) intRef.element), TimeUnit.SECONDS.toMillis(1));
        }
        CountDownTimer countDownTimer = verifyPushChallengeFragment.equals;
        if (countDownTimer != null) {
            countDownTimer.start();
        }
    }

    public static final /* synthetic */ void getMax(VerifyPushChallengeFragment verifyPushChallengeFragment, String str) {
        showTwoWheelDialog showtwowheeldialog = verifyPushChallengeFragment.twilioMixpanelTracker;
        if (showtwowheeldialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
        }
        showtwowheeldialog.setMin("Login", verifyPushChallengeFragment.Mean$Arithmetic, (String) null, str, "Client Session Expired");
        if (verifyPushChallengeFragment.getMax() && verifyPushChallengeFragment.FastBitmap$CoordinateSystem == 0) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.setThumbTintList);
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            LinearLayout linearLayout = (LinearLayout) verifyPushChallengeFragment.setMin(resetInternal.setMax.clearHeader);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) verifyPushChallengeFragment.setMin(resetInternal.setMax.hasExpandedActionView);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
        } else if (verifyPushChallengeFragment.getMax() && verifyPushChallengeFragment.FastBitmap$CoordinateSystem > 0) {
            beginTransaction begintransaction = verifyPushChallengeFragment.setMax;
            if (begintransaction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
            }
            begintransaction.onNext(verifyPushChallengeFragment.Grayscale$Algorithm);
        } else if (verifyPushChallengeFragment.FastBitmap$CoordinateSystem > 0) {
            ((getMin.AnonymousClass1) verifyPushChallengeFragment.IsOverlapping.getValue()).start();
        }
    }

    public static final /* synthetic */ void setMin(VerifyPushChallengeFragment verifyPushChallengeFragment, String str) {
        showTwoWheelDialog showtwowheeldialog = verifyPushChallengeFragment.twilioMixpanelTracker;
        if (showtwowheeldialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("twilioMixpanelTracker");
        }
        showtwowheeldialog.setMin("Login", verifyPushChallengeFragment.Mean$Arithmetic, (String) null, str, "Client Session Expired");
        if (verifyPushChallengeFragment.getMax()) {
            beginTransaction begintransaction = verifyPushChallengeFragment.setMax;
            if (begintransaction == null) {
                Intrinsics.throwUninitializedPropertyAccessException("scenarioListener");
            }
            begintransaction.onNext(verifyPushChallengeFragment.Grayscale$Algorithm);
            return;
        }
        ((getMin.AnonymousClass1) verifyPushChallengeFragment.IsOverlapping.getValue()).start();
    }

    public static final /* synthetic */ setStateOn FastBitmap$CoordinateSystem(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        return (setStateOn) verifyPushChallengeFragment.toString.getValue();
    }

    public static final /* synthetic */ void length(VerifyPushChallengeFragment verifyPushChallengeFragment, Location location) {
        if (location != null) {
            Geocoder geocoder = new Geocoder(verifyPushChallengeFragment.getMax, Locale.getDefault());
            verifyPushChallengeFragment.getMin = geocoder;
            if (geocoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("geocoder");
            }
            Address address = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1).get(0);
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(address, "selectedAddress");
            sb.append(address.getLocality());
            sb.append(", ");
            sb.append(address.getSubAdminArea());
            sb.append(", ");
            sb.append(address.getAdminArea());
            verifyPushChallengeFragment.invoke = sb.toString();
            IRedDotManager iRedDotManager = verifyPushChallengeFragment.toFloatRange;
            if (iRedDotManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("compositeDisposable");
            }
            iRedDotManager.dispose();
        }
    }

    public static final /* synthetic */ void values(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        DialogWithImage.getMin getmin = new DialogWithImage.getMin();
        getmin.length = new setMin(verifyPushChallengeFragment);
        getmin.toFloatRange = R.drawable.ic_customer_service_png;
        getmin.getMax = verifyPushChallengeFragment.getResources().getString(R.string.risk_reject_dialog_title);
        getmin.setMin = verifyPushChallengeFragment.getResources().getString(R.string.face_login_failed_cs);
        getmin.getMin = verifyPushChallengeFragment.getResources().getString(R.string.risk_reject_positive_button_msg);
        DialogWithImage.getMin max = getmin.setMax(false).getMax(false);
        new DialogWithImage(verifyPushChallengeFragment.getMax, max.setMax, max, (byte) 0).setMin();
    }

    public static final /* synthetic */ void invokeSuspend(VerifyPushChallengeFragment verifyPushChallengeFragment) {
        onPanelDragged onpaneldragged = verifyPushChallengeFragment.verifyPushLoginPresenter;
        if (onpaneldragged == null) {
            Intrinsics.throwUninitializedPropertyAccessException("verifyPushLoginPresenter");
        }
        onpaneldragged.setMin.execute(onReceivedIcon.INSTANCE, new onPanelDragged.setMax(onpaneldragged), new onPanelDragged.getMax(onpaneldragged));
    }
}
