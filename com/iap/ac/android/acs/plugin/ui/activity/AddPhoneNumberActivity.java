package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.model.MobilePhoneInfo;
import com.iap.ac.android.acs.plugin.ui.utils.MultiLanguageUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginActionBar;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginDialog;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class AddPhoneNumberActivity extends Activity implements View.OnClickListener {
    public static final int getMax = 115;
    public static final byte[] length = {Ascii.DLE, 63, 74, -97, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    /* access modifiers changed from: private */
    public ACPluginActionBar mActionBar;
    /* access modifiers changed from: private */
    public String mCancelText;
    /* access modifiers changed from: private */
    public String mConfirmDialogDesc;
    /* access modifiers changed from: private */
    public String mConfirmText;
    /* access modifiers changed from: private */
    public String mDefaultRegionFormat;
    /* access modifiers changed from: private */
    public Button mNextStepButton;
    /* access modifiers changed from: private */
    public TextView mOTPDescText;
    /* access modifiers changed from: private */
    public MobilePhoneInfo mPhoneInfo = new MobilePhoneInfo();
    private ArrayList<MobilePhoneInfo> mPhoneInfoList;
    /* access modifiers changed from: private */
    public EditText mPhoneNumEditText;
    /* access modifiers changed from: private */
    public TextView mRegionText;
    /* access modifiers changed from: private */
    public CheckBox mSavePhoneNumCheck;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r5, short r6, short r7) {
        /*
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r0 = length
            int r5 = r5 * 175
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x0018
            r3 = r7
            r7 = r6
            r6 = r5
            goto L_0x002c
        L_0x0018:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L_0x0026
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0026:
            byte r3 = r0[r5]
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L_0x002c:
            int r5 = r5 + r3
            int r5 = r5 + -2
            int r6 = r6 + 1
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.AddPhoneNumberActivity.length(short, short, short):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte[] bArr = length;
        String length4 = length((byte) bArr[8], (byte) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = length;
        String length5 = length((byte) bArr2[85], (byte) bArr2[8], (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length4, length5);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length6 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length6) {
            onCanceled oncanceled = new onCanceled(nextInt, length6, 1);
            onCancelLoad.setMax(1835963379, oncanceled);
            onCancelLoad.getMin(1835963379, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(1835963379, oncanceled2);
            onCancelLoad.getMin(1835963379, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(1835963379, oncanceled3);
            onCancelLoad.getMin(1835963379, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_add_phone_num);
        initData();
        initView();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder("AddPhoneNumberActivity#onActivityResult, requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        ACLog.d(Constants.TAG, sb.toString());
        if (i == 122 && i2 == -1) {
            String stringExtra = intent.getStringExtra("region");
            String stringExtra2 = intent.getStringExtra(UIConstants.KEY_PHONE_PREFIX);
            StringBuilder sb2 = new StringBuilder("AddPhoneNumberActivity#onActivityResult, get result region: ");
            sb2.append(stringExtra);
            sb2.append(", phonePrefix: ");
            sb2.append(stringExtra2);
            ACLog.d(Constants.TAG, sb2.toString());
            this.mRegionText.setText(String.format(this.mDefaultRegionFormat, new Object[]{stringExtra, stringExtra2}));
            this.mPhoneInfo.mobilePhoneRegionCode = stringExtra2;
        } else if (i == 123 && i2 == -1) {
            ACLog.d(Constants.TAG, "AddPhoneNumberActivity#onActivityResult, verify code successfully, finish");
            finishActivity();
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.region_layout) {
            ACLog.d(Constants.TAG, "AddPhoneNumberActivity#onClick, click region layout");
            startPhoneRegionActivity();
        } else if (view.getId() == R.id.next_step_button) {
            ACLog.d(Constants.TAG, "AddPhoneNumberActivity#onClick, click next step button");
            triggerNextStep();
        }
    }

    private void initData() {
        CommonConfig commonConfig = ACManager.getInstance().getCommonConfig();
        if (commonConfig != null) {
            this.mPhoneInfo.region = commonConfig.defaultRegion;
            this.mPhoneInfo.mobilePhoneRegionCode = commonConfig.defaultMobilePhoneRegionCode;
            StringBuilder sb = new StringBuilder("AddPhoneNumberActivity#initData, region: ");
            sb.append(this.mPhoneInfo.region);
            sb.append(", code: ");
            sb.append(this.mPhoneInfo.mobilePhoneRegionCode);
            ACLog.d(Constants.TAG, sb.toString());
        }
        this.mPhoneInfoList = getIntent().getParcelableArrayListExtra(UIConstants.KEY_PHONE_INFO_LIST);
        StringBuilder sb2 = new StringBuilder("AddPhoneNumberActivity#initData, phone info list: ");
        sb2.append(this.mPhoneInfoList);
        ACLog.d(Constants.TAG, sb2.toString());
    }

    private void initView() {
        int length2;
        int min;
        int length3;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length3 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(1027186545, oncanceled);
            onCancelLoad.getMin(1027186545, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1027186545, oncanceled2);
            onCancelLoad.getMin(1027186545, oncanceled2);
        }
        this.mActionBar = (ACPluginActionBar) findViewById(R.id.action_bar);
        findViewById(R.id.region_layout).setOnClickListener(this);
        this.mRegionText = (TextView) findViewById(R.id.region_text);
        this.mPhoneNumEditText = (EditText) findViewById(R.id.phone_num_edit_text);
        this.mOTPDescText = (TextView) findViewById(R.id.otp_desc_text);
        this.mSavePhoneNumCheck = (CheckBox) findViewById(R.id.save_phone_num_check);
        Button button = (Button) findViewById(R.id.next_step_button);
        this.mNextStepButton = button;
        button.setOnClickListener(this);
        fillText();
        initSavePhoneNumCheck();
        initPhoneNumEditText();
    }

    private void fillText() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-609780066, oncanceled);
            onCancelLoad.getMin(-609780066, oncanceled);
        }
        this.mActionBar.setTitle(getString(R.string.acplugin_set_phone));
        this.mConfirmDialogDesc = getString(R.string.acplugin_phone_exist_desc);
        this.mCancelText = getString(R.string.acplugin_cancel);
        this.mConfirmText = getString(R.string.acplugin_confirm);
        this.mDefaultRegionFormat = getString(R.string.acplugin_default_region_format);
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                AddPhoneNumberActivity.this.mActionBar.setTitle(map.get("SetPhone"));
                AddPhoneNumberActivity.this.mPhoneNumEditText.setHint(map.get("EnterPhone"));
                AddPhoneNumberActivity.this.mOTPDescText.setText(map.get("VerificationCodeDesc"));
                AddPhoneNumberActivity.this.mSavePhoneNumCheck.setText(map.get("SavePhone"));
                AddPhoneNumberActivity.this.mNextStepButton.setText(map.get("Next"));
                String unused = AddPhoneNumberActivity.this.mConfirmDialogDesc = map.get("PhoneExistDesc");
                String unused2 = AddPhoneNumberActivity.this.mCancelText = map.get("Cancel");
                String unused3 = AddPhoneNumberActivity.this.mConfirmText = map.get("Confirm");
                if (!TextUtils.isEmpty(map.get("DefaultRegionFormat"))) {
                    String unused4 = AddPhoneNumberActivity.this.mDefaultRegionFormat = map.get("DefaultRegionFormat");
                }
                if (TextUtils.isEmpty(AddPhoneNumberActivity.this.mPhoneInfo.region) || TextUtils.isEmpty(AddPhoneNumberActivity.this.mPhoneInfo.mobilePhoneRegionCode) || TextUtils.isEmpty(map.get(AddPhoneNumberActivity.this.mPhoneInfo.region))) {
                    AddPhoneNumberActivity.this.mRegionText.setText(map.get("ChooseRegion"));
                    return;
                }
                AddPhoneNumberActivity.this.mRegionText.setText(String.format(AddPhoneNumberActivity.this.mDefaultRegionFormat, new Object[]{map.get(AddPhoneNumberActivity.this.mPhoneInfo.region), AddPhoneNumberActivity.this.mPhoneInfo.mobilePhoneRegionCode}));
            }
        });
    }

    private void initSavePhoneNumCheck() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2032807997, oncanceled);
            onCancelLoad.getMin(2032807997, oncanceled);
        }
        Drawable drawable = getResources().getDrawable(R.drawable.acplugin_checkbox);
        int dp2px = UIUtils.dp2px(this, 19);
        drawable.setBounds(0, 0, dp2px, dp2px);
        this.mSavePhoneNumCheck.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private void initPhoneNumEditText() {
        this.mPhoneNumEditText.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence != null) {
                    AddPhoneNumberActivity.this.mNextStepButton.setEnabled(charSequence.length() >= 7);
                }
            }
        });
        this.mPhoneNumEditText.requestFocus();
        UIUtils.showSoftInput(this, this.mPhoneNumEditText);
    }

    private void triggerNextStep() {
        this.mPhoneInfo.mobilePhoneNumber = this.mPhoneNumEditText.getText().toString();
        if (isPhoneNumberExist()) {
            ACLog.d(Constants.TAG, "AddPhoneNumberActivity#triggerNextStep, phone number existed, show dialog to remind");
            showPhoneNumberExistDialog();
            return;
        }
        startVerificationCodeActivity();
    }

    private boolean isPhoneNumberExist() {
        ArrayList<MobilePhoneInfo> arrayList = this.mPhoneInfoList;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<MobilePhoneInfo> it = this.mPhoneInfoList.iterator();
            while (it.hasNext()) {
                MobilePhoneInfo next = it.next();
                if (TextUtils.equals(this.mPhoneInfo.mobilePhoneNumber, next.mobilePhoneNumber) && TextUtils.equals(this.mPhoneInfo.mobilePhoneRegionCode, next.mobilePhoneRegionCode)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void showPhoneNumberExistDialog() {
        if (UIUtils.isActivityDisabled(this)) {
            ACLog.e(Constants.TAG, "AddPhoneNumberActivity#showPhoneNumberExistDialog, activity disabled");
            return;
        }
        ACPluginDialog aCPluginDialog = new ACPluginDialog(this, this.mConfirmDialogDesc, this.mCancelText, this.mConfirmText);
        aCPluginDialog.setConfirmListener(new ACPluginDialog.OnConfirmListener() {
            public void onConfirm() {
                ACLog.d(Constants.TAG, "AddPhoneNumberActivity#onConfirm, confirm to use old phone number");
                AddPhoneNumberActivity.this.finishActivity();
            }
        });
        aCPluginDialog.show();
    }

    /* access modifiers changed from: private */
    public void finishActivity() {
        StringBuilder sb = new StringBuilder("AddPhoneNumberActivity#finishActivity, phone info: ");
        sb.append(this.mPhoneInfo);
        ACLog.d(Constants.TAG, sb.toString());
        Intent intent = new Intent();
        intent.putExtra(UIConstants.KEY_PHONE_INFO, this.mPhoneInfo);
        setResult(-1, intent);
        finish();
    }

    private void startPhoneRegionActivity() {
        ACLog.d(Constants.TAG, "AddPhoneNumberActivity#startPhoneRegionActivity");
        startActivityForResult(new Intent(this, PhoneRegionActivity.class), 122);
    }

    private void startVerificationCodeActivity() {
        StringBuilder sb = new StringBuilder("AddPhoneNumberActivity#startVerificationCodeActivity, phone info: ");
        sb.append(this.mPhoneInfo);
        ACLog.d(Constants.TAG, sb.toString());
        Intent intent = new Intent(this, VerificationCodeActivity.class);
        intent.putExtra(UIConstants.KEY_PHONE_INFO, this.mPhoneInfo);
        intent.putExtra(UIConstants.KEY_SAVE_PHONE_INFO, this.mSavePhoneNumCheck.isChecked());
        startActivityForResult(intent, 123);
    }
}
