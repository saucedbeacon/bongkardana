package id.dana.onboarding.createprofile;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.OnClick;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.base.KeyBaseActivity;
import id.dana.onboarding.OnboardingActivity;
import id.dana.onboarding.createprofile.CreateProfileFragment;
import id.dana.tracker.TrackerKey;
import id.dana.tracker.mixpanel.RegistrationEvent;
import java.util.ArrayList;
import java.util.List;
import o.AUScreenUtils;
import o.GetBatteryInfoBridgeExtension;
import o.MultiInstanceInvalidationService;
import o.SensorBridgeExtension;
import o.TinyAppActionState;
import o.TinyAppActionStateController;
import o.checkApFlag;
import o.checkOppoConcave;
import o.convertDipToPx;
import o.convertSpToPx;
import o.evaluate;
import o.genTextSelector;
import o.getDeviceID;
import o.getDeviceInfo;
import o.registerSensor;
import o.setStateOn;
import o.setWhiteListAP;
import o.updateCornerMarking;

public class CreateProfileFragment extends MultiInstanceInvalidationService<OnboardingActivity, CreateProfileKey> {
    /* access modifiers changed from: private */
    public String IsOverlapping;
    /* access modifiers changed from: private */
    public String equals;
    private final int getMin = 3;
    private String isInside;
    @BindView(2131364275)
    ImageView profileAvatar;
    @BindView(2131364277)
    EditText profileName;
    /* access modifiers changed from: private */
    public SensorBridgeExtension setMax;
    /* access modifiers changed from: private */
    public setStateOn setMin;
    private String toFloatRange;
    /* access modifiers changed from: private */
    public final TinyAppActionState toIntRange;
    private setStateOn values;

    public final int setMin() {
        return R.layout.fragment_create_profile;
    }

    public CreateProfileFragment() {
        TinyAppActionState.getMax getmax = new TinyAppActionState.getMax((Fragment) this);
        getmax.setMin = GriverEnv.getApplicationContext().getString(R.string.pick_profile_photo_title);
        getmax.length = new TinyAppActionStateController() {
            public final void length(Exception exc) {
            }

            public final void length(Uri uri, String str) {
                String unused = CreateProfileFragment.this.equals = uri.toString();
                String unused2 = CreateProfileFragment.this.IsOverlapping = str;
                ((updateCornerMarking) Glide.getMax((Fragment) CreateProfileFragment.this)).setMax(CreateProfileFragment.this.equals).setMax((int) R.drawable.ic_empty_profile).setMax(evaluate.length).onPostMessage().setMin((int) R.drawable.ic_empty_profile).onRelationshipValidationResult().length(CreateProfileFragment.this.profileAvatar);
            }
        };
        getmax.toIntRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.CAMERA");
        getmax.toFloatRange = setStateOn.getMin(GriverEnv.getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE");
        this.toIntRange = new TinyAppActionState(getmax, (byte) 0);
    }

    public static CreateProfileFragment setMax(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("phoneNumber", str);
        bundle.putString("referralCode", str2);
        CreateProfileFragment createProfileFragment = new CreateProfileFragment();
        createProfileFragment.setArguments(bundle);
        return createProfileFragment;
    }

    public final boolean n_() {
        values();
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean setMin(int i) {
        Integer.valueOf(i);
        if (i != 6) {
            return false;
        }
        if (this.profileName.getText().toString().length() >= 3) {
            equals();
            return true;
        }
        Toast.makeText(getActivity(), getString(R.string.msg_empty_nickname_error), 0).show();
        return false;
    }

    /* access modifiers changed from: private */
    public void values() {
        new AlertDialog.Builder(getContext()).setTitle(R.string.cancel_process_question).setPositiveButton(R.string.option_register, new registerSensor(this)).setNegativeButton(R.string.option_cancel, new DialogInterface.OnClickListener(this) {
            private final CreateProfileFragment setMax;

            {
                this.setMax = r1;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                this.setMax.setMax.setMin();
            }
        }).create().show();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (!length(i, strArr, iArr) && !setMax(i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    private boolean length(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.setMin;
        return setstateon != null && setstateon.getMin(i, strArr, iArr);
    }

    private boolean setMax(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        setStateOn setstateon = this.values;
        return setstateon != null && setstateon.getMin(i, strArr, iArr);
    }

    @OnClick({2131364275})
    public void onClickProfile() {
        this.values.setMin();
    }

    public final void setMax() {
        setStateOn.getMin getmin = new setStateOn.getMin((Fragment) this);
        getmin.length.add("android.permission.CAMERA");
        getmin.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                CreateProfileFragment.this.toIntRange.length();
            }
        };
        this.setMin = new setStateOn(getmin, (byte) 0);
        setStateOn.getMin getmin2 = new setStateOn.getMin((Fragment) this);
        getmin2.length.add("android.permission.WRITE_EXTERNAL_STORAGE");
        getmin2.getMax = new setStateOn.length() {
            public final void setMin(setStateOn.setMin setmin) {
            }

            public final void getMin(setStateOn.setMin setmin) {
                CreateProfileFragment.this.setMin.setMin();
            }
        };
        this.values = new setStateOn(getmin2, (byte) 0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.isInside = arguments.getString("phoneNumber");
            this.toFloatRange = arguments.getString("referralCode");
        }
        BaseActivity baseActivity = this.getMax;
        if (baseActivity != null) {
            SensorBridgeExtension sensorBridgeExtension = (SensorBridgeExtension) ((OnboardingActivity) ((KeyBaseActivity) baseActivity)).getNavigationManager();
            this.setMax = sensorBridgeExtension;
            sensorBridgeExtension.length.setMenuLeftButton(getString(R.string.option_cancel));
            this.setMax.setMin = new GetBatteryInfoBridgeExtension(this);
            SensorBridgeExtension sensorBridgeExtension2 = this.setMax;
            sensorBridgeExtension2.length.setMenuRightButton(getString(R.string.create_profile_right_menu));
            this.setMax.length.setMenuRightButtonEnabled(false);
            this.setMax.setMax = new getDeviceID(this);
            AUScreenUtils.setMin setmin = new AUScreenUtils.setMin(this.profileName, (byte) 0);
            AnonymousClass1 r0 = new checkOppoConcave() {
                public final boolean getMax(String str) {
                    return str.length() >= 3;
                }

                public final String getMax() {
                    return CreateProfileFragment.this.getString(R.string.msg_empty_nickname_error);
                }
            };
            if (setmin.setMin == null) {
                setmin.setMin = new ArrayList();
            }
            setmin.setMin.add(r0);
            setmin.getMin = new checkApFlag() {
                public final void getMax(String str) {
                    CreateProfileFragment.this.setMax.length.setMenuRightButtonEnabled(true);
                }

                public final void getMin(String str, List<setWhiteListAP> list) {
                    CreateProfileFragment.this.setMax.length.setMenuRightButtonEnabled(false);
                }
            };
            setmin.setMax();
            this.profileName.requestFocus();
            this.profileName.setOnEditorActionListener(new getDeviceInfo(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type T");
    }

    /* access modifiers changed from: private */
    public void equals() {
        if (getContext() != null) {
            if (TextUtils.isEmpty(this.IsOverlapping)) {
                this.IsOverlapping = RegistrationEvent.ProfilePhotoSource.NO_ANSWER;
            }
            String obj = this.profileName.getText().toString();
            convertDipToPx.length length = new convertDipToPx.length(getContext().getApplicationContext());
            length.getMax = TrackerKey.Event.REGISTRATION_PROFILE_CREATE;
            convertDipToPx.length max = length.setMax(RegistrationEvent.Property.NICKNAME, obj).setMax(RegistrationEvent.Property.PROFILE_PHOTO_SOURCE, this.IsOverlapping);
            max.setMin();
            convertDipToPx convertdiptopx = new convertDipToPx(max, (byte) 0);
            List length2 = convertdiptopx.length != null ? convertdiptopx.length.length : new ArrayList();
            genTextSelector.setMax((convertSpToPx[]) length2.toArray(new convertSpToPx[length2.size()]));
        }
        this.setMax.setMax(this.isInside, this.profileName.getText().toString(), this.equals, this.toFloatRange);
    }

    public static /* synthetic */ void toFloatRange(CreateProfileFragment createProfileFragment) {
        if (createProfileFragment.length != null && !createProfileFragment.length.isDisposed()) {
            createProfileFragment.length.dispose();
        }
    }
}
