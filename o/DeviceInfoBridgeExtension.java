package o;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.BaseKey;
import id.dana.base.KeyBaseActivity;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.confirmpin.ConfirmPinKey;
import id.dana.onboarding.createpin.CreatePinKey;
import id.dana.richview.PinEntryEditText;
import id.dana.tracker.TrackerKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUScreenUtils;
import o.convertDipToPx;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lid/dana/onboarding/createpin/CreatePinFragment;", "Lid/dana/base/KeyBaseFragment;", "Lid/dana/onboarding/OnboardingActivity;", "Lid/dana/onboarding/createpin/CreatePinKey;", "()V", "avatarUri", "", "nickname", "onboardingNavigationManager", "Lid/dana/onboarding/OnboardingNavigationManager;", "phoneNumber", "referralCode", "confirm", "", "createInputValidator", "Lid/dana/textbehavior/validate/Validator;", "createOnInputValidatedListener", "Lid/dana/textbehavior/OnValidatedListener;", "getLayout", "", "init", "onBackPressed", "", "onPinCreated", "onStart", "setCreatePinTitleText", "trackRegistrationPinCreateEvent", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DeviceInfoBridgeExtension extends MultiInstanceInvalidationService<OnboardingActivity, CreatePinKey> {
    @NotNull
    public static final setMax setMax = new setMax((byte) 0);
    private String IsOverlapping;
    /* access modifiers changed from: private */
    public SensorBridgeExtension equals;
    private String getMin;
    private String isInside;
    private String setMin;
    private HashMap toFloatRange;

    public final View getMax(int i) {
        if (this.toFloatRange == null) {
            this.toFloatRange = new HashMap();
        }
        View view = (View) this.toFloatRange.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.toFloatRange.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void getMax() {
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.fragment_create_pin;
    }

    public final void onStart() {
        super.onStart();
        PinEntryEditText pinEntryEditText = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
        if (pinEntryEditText != null) {
            pinEntryEditText.requestFocus();
        }
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        setOnWheelViewListener.setMin(baseActivity);
    }

    public final boolean n_() {
        equals();
        return true;
    }

    public final void setMax() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("phoneNumber");
            String str = "";
            if (string == null) {
                string = str;
            }
            this.IsOverlapping = string;
            String string2 = arguments.getString("nickname");
            if (string2 == null) {
                string2 = str;
            }
            this.getMin = string2;
            String string3 = arguments.getString("avatarUri");
            if (string3 == null) {
                string3 = str;
            }
            this.setMin = string3;
            String string4 = arguments.getString("referralCode");
            if (string4 != null) {
                str = string4;
            }
            this.isInside = str;
        }
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.equals = sensorBridgeExtension;
            if (sensorBridgeExtension != null) {
                sensorBridgeExtension.length.setMenuLeftButton((int) R.drawable.ic_left_white);
                sensorBridgeExtension.setMin = new toIntRange(this);
                sensorBridgeExtension.length.setMenuRightButton((String) null);
            }
            TextView textView = (TextView) getMax(resetInternal.setMax.StyleableRes);
            if (textView != null) {
                textView.setText(setH5MenuList.getMin(getString(R.string.create_pin_title), getString(R.string.pin_code)));
            }
            AUScreenUtils.setMin setmin = new AUScreenUtils.setMin((PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon), (byte) 0);
            checkOppoConcave checkhuaweiconcave = new checkHuaweiConcave();
            if (setmin.setMin == null) {
                setmin.setMin = new ArrayList();
            }
            setmin.setMin.add(checkhuaweiconcave);
            checkOppoConcave concaveUtils = new ConcaveUtils();
            if (setmin.setMin == null) {
                setmin.setMin = new ArrayList();
            }
            setmin.setMin.add(concaveUtils);
            checkOppoConcave checkxiaomiconcave = new checkXiaomiConcave();
            if (setmin.setMin == null) {
                setmin.setMin = new ArrayList();
            }
            setmin.setMin.add(checkxiaomiconcave);
            checkOppoConcave length2 = new length(this);
            if (setmin.setMin == null) {
                setmin.setMin = new ArrayList();
            }
            setmin.setMin.add(length2);
            setmin.getMin = new getMin(this);
            setmin.setMax();
            PinEntryEditText pinEntryEditText = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText != null) {
                pinEntryEditText.focus();
            }
            PinEntryEditText pinEntryEditText2 = (PinEntryEditText) getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText2 != null) {
                pinEntryEditText2.setOnEditorActionListener(new IsOverlapping(this));
            }
            BaseActivity baseActivity2 = this.getMax;
            Intrinsics.checkNotNullExpressionValue(baseActivity2, "baseActivity");
            setOnWheelViewListener.setMax((Context) baseActivity2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onClick", "id/dana/onboarding/createpin/CreatePinFragment$init$2$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements MultiInstanceInvalidationClient$1 {
        final /* synthetic */ DeviceInfoBridgeExtension setMin;

        toIntRange(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.setMin = deviceInfoBridgeExtension;
        }

        public final void getMax() {
            this.setMin.equals();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "i", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements TextView.OnEditorActionListener {
        final /* synthetic */ DeviceInfoBridgeExtension getMin;

        IsOverlapping(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.getMin = deviceInfoBridgeExtension;
        }

        public final boolean onEditorAction(@Nullable TextView textView, int i, @Nullable KeyEvent keyEvent) {
            Integer.valueOf(i);
            if (i != 6) {
                return false;
            }
            PinEntryEditText pinEntryEditText = (PinEntryEditText) this.getMin.getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (String.valueOf(pinEntryEditText != null ? pinEntryEditText.getText() : null).length() >= 6) {
                DeviceInfoBridgeExtension.length(this.getMin);
                return true;
            }
            PinEntryEditText pinEntryEditText2 = (PinEntryEditText) this.getMin.getMax(resetInternal.setMax.setNegativeButtonIcon);
            if (pinEntryEditText2 != null) {
                pinEntryEditText2.setText("");
            }
            DeviceInfoBridgeExtension deviceInfoBridgeExtension = this.getMin;
            Toast.makeText(deviceInfoBridgeExtension.getActivity(), deviceInfoBridgeExtension.getString(R.string.msg_pin_less_than6_error), 0).show();
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/onboarding/createpin/CreatePinFragment$createOnInputValidatedListener$1", "Lid/dana/textbehavior/OnValidatedListener;", "onInvalid", "", "s", "", "list", "", "Lid/dana/textbehavior/InvalidReason;", "onValid", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements checkApFlag {
        final /* synthetic */ DeviceInfoBridgeExtension length;

        getMin(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.length = deviceInfoBridgeExtension;
        }

        public final void getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
            SensorBridgeExtension min = this.length.equals;
            if (min != null) {
                min.length.setMenuRightButtonEnabled(true);
            }
            DeviceInfoBridgeExtension.length(this.length);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
            if (r3.equals("Text cannot use ascending sequence character") == false) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
            if (r3.equals("Text cannot use descending sequence number") != false) goto L_0x0062;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void getMin(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.util.List<? extends o.setWhiteListAP> r8) {
            /*
                r6 = this;
                java.lang.String r0 = "s"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                java.lang.String r0 = "list"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                int r7 = r7.length()
                r0 = 0
                r1 = 6
                if (r7 < r1) goto L_0x0088
                r7 = r8
                java.util.Collection r7 = (java.util.Collection) r7
                int r7 = r7.size()
                r1 = 0
                r2 = 0
            L_0x001b:
                if (r1 >= r7) goto L_0x0088
                java.lang.Object r3 = r8.get(r1)
                o.setWhiteListAP r3 = (o.setWhiteListAP) r3
                o.checkOppoConcave r3 = r3.length
                java.lang.String r4 = "list[i].validator"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                java.lang.String r3 = r3.getMax()
                if (r3 != 0) goto L_0x0031
                goto L_0x0065
            L_0x0031:
                int r4 = r3.hashCode()
                r5 = -390363197(0xffffffffe8bb87c3, float:-7.084695E24)
                if (r4 == r5) goto L_0x005a
                r5 = 66515302(0x3f6f166, float:1.4514003E-36)
                if (r4 == r5) goto L_0x004e
                r5 = 742963061(0x2c48b775, float:2.8523549E-12)
                if (r4 == r5) goto L_0x0045
                goto L_0x0065
            L_0x0045:
                java.lang.String r4 = "Text cannot use ascending sequence character"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0065
                goto L_0x0062
            L_0x004e:
                java.lang.String r4 = "Text cannot use repeated character"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0065
                r2 = 2131886196(0x7f120074, float:1.9406964E38)
                goto L_0x0065
            L_0x005a:
                java.lang.String r4 = "Text cannot use descending sequence number"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0065
            L_0x0062:
                r2 = 2131886705(0x7f120271, float:1.9407996E38)
            L_0x0065:
                o.DeviceInfoBridgeExtension r3 = r6.length
                int r4 = o.resetInternal.setMax.setNegativeButtonIcon
                android.view.View r3 = r3.getMax(r4)
                id.dana.richview.PinEntryEditText r3 = (id.dana.richview.PinEntryEditText) r3
                if (r3 == 0) goto L_0x0078
                java.lang.String r4 = ""
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
            L_0x0078:
                o.DeviceInfoBridgeExtension r3 = r6.length
                id.dana.base.BaseActivity r3 = r3.getMax
                o.DeviceInfoBridgeExtension r4 = r6.length
                java.lang.String r4 = r4.getString(r2)
                r3.showWarningDialog(r4)
                int r1 = r1 + 1
                goto L_0x001b
            L_0x0088:
                o.DeviceInfoBridgeExtension r7 = r6.length
                o.SensorBridgeExtension r7 = r7.equals
                if (r7 == 0) goto L_0x0095
                o.parentColumn r7 = r7.length
                r7.setMenuRightButtonEnabled(r0)
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DeviceInfoBridgeExtension.getMin.getMin(java.lang.String, java.util.List):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"id/dana/onboarding/createpin/CreatePinFragment$createInputValidator$1", "Lid/dana/textbehavior/validate/Validator;", "getErrorMessage", "", "isValid", "", "s", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements checkOppoConcave {
        final /* synthetic */ DeviceInfoBridgeExtension length;

        length(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.length = deviceInfoBridgeExtension;
        }

        public final boolean getMax(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "s");
            return str.length() >= 6;
        }

        @NotNull
        public final String getMax() {
            String string = this.length.getString(R.string.msg_pin_less_than6_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.msg_pin_less_than6_error)");
            return string;
        }
    }

    /* access modifiers changed from: private */
    public final void equals() {
        new AlertDialog.Builder(getContext()).setTitle(R.string.cancel_process_question).setPositiveButton(R.string.option_register, new getMax(this)).setNegativeButton(R.string.option_cancel, new setMin(this)).create().show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements DialogInterface.OnClickListener {
        final /* synthetic */ DeviceInfoBridgeExtension setMax;

        getMax(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.setMax = deviceInfoBridgeExtension;
        }

        public final void onClick(@Nullable DialogInterface dialogInterface, int i) {
            DeviceInfoBridgeExtension deviceInfoBridgeExtension = this.setMax;
            if (deviceInfoBridgeExtension.length != null && !deviceInfoBridgeExtension.length.isDisposed()) {
                deviceInfoBridgeExtension.length.dispose();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements DialogInterface.OnClickListener {
        final /* synthetic */ DeviceInfoBridgeExtension getMin;

        setMin(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
            this.getMin = deviceInfoBridgeExtension;
        }

        public final void onClick(@Nullable DialogInterface dialogInterface, int i) {
            SensorBridgeExtension min = this.getMin.equals;
            if (min != null) {
                min.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/onboarding/createpin/CreatePinFragment$Companion;", "", "()V", "INVALID_MSG_ASCENDING_SEQ_CHARS", "", "INVALID_MSG_DESCENDING_SEQ_NUMBER", "INVALID_MSG_REPEATED_CHARS", "PIN_LENGTH", "", "newInstance", "Lid/dana/onboarding/createpin/CreatePinFragment;", "phoneNumber", "nickname", "avatarUri", "referralCode", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(DeviceInfoBridgeExtension deviceInfoBridgeExtension) {
        PinEntryEditText pinEntryEditText = (PinEntryEditText) deviceInfoBridgeExtension.getMax(resetInternal.setMax.setNegativeButtonIcon);
        String valueOf = String.valueOf(pinEntryEditText != null ? pinEntryEditText.getText() : null);
        PinEntryEditText pinEntryEditText2 = (PinEntryEditText) deviceInfoBridgeExtension.getMax(resetInternal.setMax.setNegativeButtonIcon);
        if (pinEntryEditText2 != null) {
            pinEntryEditText2.setText("");
        }
        convertDipToPx.length length2 = new convertDipToPx.length(deviceInfoBridgeExtension.getContext());
        length2.getMax = TrackerKey.Event.REGISTRATION_PIN_CREATE;
        length2.setMin();
        convertDipToPx convertdiptopx = new convertDipToPx(length2, (byte) 0);
        List length3 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
        genTextSelector.setMax((convertSpToPx[]) length3.toArray(new convertSpToPx[length3.size()]));
        SensorBridgeExtension sensorBridgeExtension = deviceInfoBridgeExtension.equals;
        if (sensorBridgeExtension != null) {
            String str = deviceInfoBridgeExtension.IsOverlapping;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("phoneNumber");
            }
            String str2 = deviceInfoBridgeExtension.getMin;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nickname");
            }
            String str3 = deviceInfoBridgeExtension.setMin;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("avatarUri");
            }
            String str4 = deviceInfoBridgeExtension.isInside;
            if (str4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("referralCode");
            }
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str2, "nickname");
            Intrinsics.checkNotNullParameter(valueOf, "pin");
            ConfirmPinKey.length length4 = ConfirmPinKey.setMin;
            Intrinsics.checkNotNullParameter(str, "phoneNumber");
            Intrinsics.checkNotNullParameter(str2, "nickname");
            Intrinsics.checkNotNullParameter(valueOf, "pin");
            BaseKey confirmPinKey = new ConfirmPinKey(str, str2, str3, valueOf, str4);
            Intrinsics.checkNotNullParameter(confirmPinKey, "key");
            sensorBridgeExtension.getMin.getBackstack().goTo(confirmPinKey);
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.toFloatRange;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
