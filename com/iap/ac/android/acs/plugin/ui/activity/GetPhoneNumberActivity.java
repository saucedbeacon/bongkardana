package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.PhoneNumberFacade;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.model.MobilePhoneInfo;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.result.UserPhoneQueryResult;
import com.iap.ac.android.acs.plugin.ui.adapter.PhoneNumberListAdapter;
import com.iap.ac.android.acs.plugin.ui.utils.MultiLanguageUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ConstraintHeightListView;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GetPhoneNumberActivity extends Activity implements View.OnClickListener {
    public static final int getMax = 194;
    public static final byte[] getMin = {42, -41, 105, 98, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    /* access modifiers changed from: private */
    public TextView mAddPhoneNumText;
    private LinearLayout mAddPhoneNumView;
    /* access modifiers changed from: private */
    public Button mAgreeButton;
    /* access modifiers changed from: private */
    public Button mCancelButton;
    /* access modifiers changed from: private */
    public String mCancelText;
    /* access modifiers changed from: private */
    public String mConfirmDeleteText;
    /* access modifiers changed from: private */
    public String mDeleteDialogDesc;
    /* access modifiers changed from: private */
    public String mDeleteText;
    /* access modifiers changed from: private */
    public TextView mDescText;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public String mMiniProgramName;
    /* access modifiers changed from: private */
    public MobilePhoneInfo mPhoneInfo;
    private ArrayList<MobilePhoneInfo> mPhoneInfoList;
    /* access modifiers changed from: private */
    public PhoneNumberListAdapter mPhoneNumAdapter;
    /* access modifiers changed from: private */
    public ConstraintHeightListView mPhoneNumList;
    /* access modifiers changed from: private */
    public int mPhoneNumListMaxHeight;
    /* access modifiers changed from: private */
    public LinearLayout mRootView;
    /* access modifiers changed from: private */
    public TextView mUseOtherPhoneNumText;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(byte r7, int r8, short r9) {
        /*
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r8 = r8 + 4
            int r9 = r9 * 165
            int r9 = 176 - r9
            byte[] r0 = getMin
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            goto L_0x0030
        L_0x0017:
            r3 = 0
        L_0x0018:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r5
            if (r4 != r9) goto L_0x0027
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0027:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0030:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + -2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.GetPhoneNumberActivity.setMin(byte, int, short):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        int max2;
        byte[] bArr = getMin;
        String min2 = setMin((byte) bArr[96], (short) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = getMin;
        byte b = (byte) bArr2[8];
        String min3 = setMin(b, (short) (b | 174), (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(1458666902, oncanceled);
            onCancelLoad.getMin(1458666902, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (max2 = dispatchOnCancelled.setMax(applicationContext2, 0, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, max2, 2);
            onCancelLoad.setMax(1458666902, oncanceled2);
            onCancelLoad.getMin(1458666902, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || 1458666902 == (max = dispatchOnCancelled.getMax(applicationContext3, 1458666902)))) {
            onCanceled oncanceled3 = new onCanceled(1458666902, max, 512);
            onCancelLoad.setMax(1458666902, oncanceled3);
            onCancelLoad.getMin(1458666902, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1458666902, oncanceled4);
            onCancelLoad.getMin(1458666902, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_get_phone_num);
        initWindow();
        initData();
        initView();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1308310821, oncanceled);
            onCancelLoad.getMin(-1308310821, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-1308310821, oncanceled2);
            onCancelLoad.getMin(-1308310821, oncanceled2);
        }
        super.onActivityResult(i, i2, intent);
        StringBuilder sb = new StringBuilder("GetPhoneNumberActivity#onActivityResult, requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        ACLog.d(Constants.TAG, sb.toString());
        if (i == 121 && i2 == -1) {
            this.mPhoneInfo = (MobilePhoneInfo) intent.getParcelableExtra(UIConstants.KEY_PHONE_INFO);
            StringBuilder sb2 = new StringBuilder("GetPhoneNumberActivity#onActivityResult, get result phone info: ");
            sb2.append(this.mPhoneInfo);
            ACLog.d(Constants.TAG, sb2.toString());
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(974082720, oncanceled);
            onCancelLoad.getMin(974082720, oncanceled);
        }
        StringBuilder sb = new StringBuilder("GetPhoneNumberActivity#onDestroy, phone info: ");
        sb.append(this.mPhoneInfo);
        ACLog.d(Constants.TAG, sb.toString());
        if (this.mPhoneInfo != null) {
            refreshUsagePhoneInfo();
        }
        Intent intent = new Intent(Constants.ACTION_GET_PHONE_NUMBER);
        MobilePhoneInfo mobilePhoneInfo = this.mPhoneInfo;
        if (mobilePhoneInfo != null) {
            intent.putExtra(Constants.KEY_REGION_CODE, mobilePhoneInfo.mobilePhoneRegionCode);
            intent.putExtra("phoneNumber", this.mPhoneInfo.mobilePhoneNumber);
        }
        sendBroadcast(intent);
        MultiLanguageUtils.clear();
        super.onDestroy();
    }

    public void onClick(View view) {
        if (view.getId() == R.id.agree_button) {
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#onClick, click agree button");
            PhoneNumberListAdapter phoneNumberListAdapter = this.mPhoneNumAdapter;
            if (phoneNumberListAdapter != null) {
                this.mPhoneInfo = phoneNumberListAdapter.getSelectedPhoneInfo();
            }
            finish();
        } else if (view.getId() == R.id.cancel_button) {
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#onClick, click cancel button");
            finish();
        } else if (view.getId() == R.id.use_other_phone_num_text) {
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#onClick, click use other phone number text");
            startAddPhoneNumberActivity();
        } else if (view.getId() == R.id.add_phone_num_view) {
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#onClick, click add phone number view");
            startAddPhoneNumberActivity();
        }
    }

    private void initWindow() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    private void initData() {
        String stringExtra = getIntent().getStringExtra("locale");
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#initData, locale from JS parameter: ".concat(String.valueOf(stringExtra)));
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = UIUtils.getLocale(this);
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#initData, local from JS parameter is empty, get system locale: ".concat(String.valueOf(stringExtra)));
        }
        MultiLanguageUtils.locale = stringExtra;
        this.mMiniProgramName = getIntent().getStringExtra(UIConstants.KEY_MINI_PROGRAM_NAME);
    }

    private void initView() {
        this.mRootView = (LinearLayout) findViewById(R.id.root_view);
        this.mDescText = (TextView) findViewById(R.id.desc_text);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.add_phone_num_view);
        this.mAddPhoneNumView = linearLayout;
        linearLayout.setOnClickListener(this);
        this.mAddPhoneNumText = (TextView) findViewById(R.id.add_phone_num_text);
        this.mPhoneNumList = (ConstraintHeightListView) findViewById(R.id.phone_num_list);
        TextView textView = (TextView) findViewById(R.id.use_other_phone_num_text);
        this.mUseOtherPhoneNumText = textView;
        textView.setOnClickListener(this);
        Button button = (Button) findViewById(R.id.agree_button);
        this.mAgreeButton = button;
        button.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.cancel_button);
        this.mCancelButton = button2;
        button2.setOnClickListener(this);
        calculatePhoneNumListMaxHeight();
        fillText();
    }

    private void calculatePhoneNumListMaxHeight() {
        this.mRootView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                int height = GetPhoneNumberActivity.this.mRootView.getHeight();
                int screenHeight = UIUtils.getScreenHeight(GetPhoneNumberActivity.this);
                GetPhoneNumberActivity getPhoneNumberActivity = GetPhoneNumberActivity.this;
                int unused = getPhoneNumberActivity.mPhoneNumListMaxHeight = (((screenHeight * 3) / 4) - height) + UIUtils.dp2px(getPhoneNumberActivity, 25);
                StringBuilder sb = new StringBuilder("GetPhoneNumberActivity#calculatePhoneNumListMaxHeight: ");
                sb.append(GetPhoneNumberActivity.this.mPhoneNumListMaxHeight);
                ACLog.d(Constants.TAG, sb.toString());
                GetPhoneNumberActivity.this.mRootView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }
        });
    }

    private void fillText() {
        this.mDescText.setText(String.format("%s %s\n%s", new Object[]{this.mMiniProgramName, getString(R.string.acplugin_require), getString(R.string.acplugin_get_phone_desc)}));
        this.mDeleteText = getString(R.string.acplugin_delete);
        this.mDeleteDialogDesc = getString(R.string.acplugin_confirm_delete_desc);
        this.mCancelText = getString(R.string.acplugin_cancel);
        this.mConfirmDeleteText = getString(R.string.acplugin_confirm_delete);
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                GetPhoneNumberActivity.this.mDescText.setText(String.format("%s %s\n%s", new Object[]{GetPhoneNumberActivity.this.mMiniProgramName, map.get("Require"), map.get("GetPhoneDesc")}));
                GetPhoneNumberActivity.this.mAddPhoneNumText.setText(map.get("AddPhone"));
                GetPhoneNumberActivity.this.mUseOtherPhoneNumText.setText(map.get("UseOtherPhone"));
                GetPhoneNumberActivity.this.mCancelButton.setText(map.get("Cancel"));
                GetPhoneNumberActivity.this.mAgreeButton.setText(map.get(HttpHeaders.ALLOW));
                String unused = GetPhoneNumberActivity.this.mDeleteText = map.get("Delete");
                String unused2 = GetPhoneNumberActivity.this.mDeleteDialogDesc = map.get("ConfirmDeleteDesc");
                String unused3 = GetPhoneNumberActivity.this.mCancelText = map.get("Cancel");
                String unused4 = GetPhoneNumberActivity.this.mConfirmDeleteText = map.get("ConfirmDelete");
                GetPhoneNumberActivity.this.initPhoneNumberList();
            }
        });
    }

    /* access modifiers changed from: private */
    public void initPhoneNumberList() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-943557814, oncanceled);
            onCancelLoad.getMin(-943557814, oncanceled);
        }
        this.mPhoneNumList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (GetPhoneNumberActivity.this.mPhoneNumAdapter != null) {
                    GetPhoneNumberActivity.this.mPhoneNumAdapter.onItemClick(i);
                }
            }
        });
        this.mPhoneNumList.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (GetPhoneNumberActivity.this.mPhoneNumAdapter != null) {
                    return GetPhoneNumberActivity.this.mPhoneNumAdapter.onItemLongClick(view);
                }
                return false;
            }
        });
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                if (!GetPhoneNumberActivity.this.getPhoneNumber()) {
                    ACLog.e(Constants.TAG, "GetPhoneNumberActivity#initPhoneNumberList, rpc result false, do not show list view");
                } else {
                    GetPhoneNumberActivity.this.refreshPhoneNumberList();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void refreshPhoneNumberList() {
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#refreshPhoneNumberList");
        this.mMainHandler.post(new Runnable() {
            public void run() {
                if (UIUtils.isActivityDisabled(GetPhoneNumberActivity.this)) {
                    ACLog.e(Constants.TAG, "GetPhoneNumberActivity#refreshPhoneNumberList, activity disabled");
                    return;
                }
                GetPhoneNumberActivity.this.initPhoneNumberAdapter();
                GetPhoneNumberActivity.this.mPhoneNumList.setMaxHeight(GetPhoneNumberActivity.this.mPhoneNumListMaxHeight);
                GetPhoneNumberActivity.this.mPhoneNumList.setAdapter(GetPhoneNumberActivity.this.mPhoneNumAdapter);
                GetPhoneNumberActivity.this.showPhoneNumberList();
            }
        });
    }

    /* access modifiers changed from: private */
    public void initPhoneNumberAdapter() {
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#initPhoneNumberAdapter");
        PhoneNumberListAdapter phoneNumberListAdapter = new PhoneNumberListAdapter(this, this.mPhoneInfoList);
        this.mPhoneNumAdapter = phoneNumberListAdapter;
        phoneNumberListAdapter.setMultiLanguageText(this.mDeleteText, this.mDeleteDialogDesc, this.mCancelText, this.mConfirmDeleteText);
        this.mPhoneNumAdapter.setOnDeleteAllListener(new PhoneNumberListAdapter.OnDeleteAllListener() {
            public void onDeleteAll() {
                GetPhoneNumberActivity.this.hidePhoneNumberList();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showPhoneNumberList() {
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#showPhoneNumList");
        this.mAddPhoneNumView.setVisibility(8);
        this.mPhoneNumList.setVisibility(0);
        this.mUseOtherPhoneNumText.setVisibility(0);
        this.mAgreeButton.setEnabled(true);
    }

    /* access modifiers changed from: private */
    public void hidePhoneNumberList() {
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#hidePhoneNumList");
        this.mAddPhoneNumView.setVisibility(0);
        this.mPhoneNumList.setVisibility(8);
        this.mUseOtherPhoneNumText.setVisibility(8);
        this.mAgreeButton.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public boolean getPhoneNumber() {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1184281660, oncanceled);
            onCancelLoad.getMin(-1184281660, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1184281660, oncanceled2);
            onCancelLoad.getMin(-1184281660, oncanceled2);
        }
        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#getPhoneNumber");
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            UserPhoneQueryResult query = ((PhoneNumberFacade) RPCProxyHost.getInterfaceProxy(PhoneNumberFacade.class, "ac_biz")).query(new BaseRpcRequest());
            MonitorUtil.monitorRPC(PhoneNumberFacade.OPERATION_TYPE_QUERY, SystemClock.elapsedRealtime() - elapsedRealtime, query);
            if (query == null || !query.success) {
                ACLog.e(Constants.TAG, "GetPhoneNumberActivity#getPhoneNumber, rpc result is null or fail");
                return false;
            }
            List<MobilePhoneInfo> list = query.mobilePhoneInfoList;
            if (list == null || list.isEmpty()) {
                ACLog.e(Constants.TAG, "GetPhoneNumberActivity#getPhoneNumber, rpc phone number list is empty");
                return false;
            }
            ACLog.d(Constants.TAG, "GetPhoneNumberActivity#getPhoneNumber, rpc phone number list: ".concat(String.valueOf(list)));
            filterPhoneInfoList(list);
            return true;
        } catch (Throwable th) {
            ACLog.e(Constants.TAG, "GetPhoneNumberActivity#getPhoneNumber, rpc error: ".concat(String.valueOf(th)));
            return false;
        }
    }

    private void filterPhoneInfoList(@NonNull List<MobilePhoneInfo> list) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1629273214, oncanceled);
            onCancelLoad.getMin(1629273214, oncanceled);
        }
        this.mPhoneInfoList = new ArrayList<>(list.size());
        for (MobilePhoneInfo next : list) {
            if (next == null || TextUtils.isEmpty(next.mobilePhoneRegionCode) || TextUtils.isEmpty(next.mobilePhoneNumber) || TextUtils.isEmpty(next.formattedMobilePhoneNumber)) {
                ACLog.e(Constants.TAG, "GetPhoneNumberActivity#filterPhoneInfoList, phone info illegal".concat(String.valueOf(next)));
            } else {
                this.mPhoneInfoList.add(next);
            }
        }
    }

    private void refreshUsagePhoneInfo() {
        StringBuilder sb = new StringBuilder("GetPhoneNumberActivity#refreshUsagePhoneInfo, prefix: ");
        sb.append(this.mPhoneInfo.mobilePhoneRegionCode);
        sb.append(", phone number: ");
        sb.append(UIUtils.encryptPhoneNumber(this.mPhoneInfo.mobilePhoneNumber));
        ACLog.d(Constants.TAG, sb.toString());
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    UserPhoneRequest userPhoneRequest = new UserPhoneRequest();
                    userPhoneRequest.mobilePhoneNumber = GetPhoneNumberActivity.this.mPhoneInfo.mobilePhoneNumber;
                    userPhoneRequest.mobilePhoneRegionCode = GetPhoneNumberActivity.this.mPhoneInfo.mobilePhoneRegionCode;
                    BaseRpcResult refreshUsage = ((PhoneNumberFacade) RPCProxyHost.getInterfaceProxy(PhoneNumberFacade.class, "ac_biz")).refreshUsage(userPhoneRequest);
                    MonitorUtil.monitorRPC(PhoneNumberFacade.OPERATION_TYPE_REFRESH_USAGE, SystemClock.elapsedRealtime() - elapsedRealtime, refreshUsage);
                    if (refreshUsage == null) {
                        ACLog.e(Constants.TAG, "GetPhoneNumberActivity#refreshUsagePhoneInfo, rpc result is null");
                    } else if (!refreshUsage.success) {
                        StringBuilder sb = new StringBuilder("GetPhoneNumberActivity#refreshUsagePhoneInfo, rpc result fail, error: ");
                        sb.append(refreshUsage.errorCode);
                        sb.append(", errorMessage: ");
                        sb.append(refreshUsage.errorMessage);
                        ACLog.e(Constants.TAG, sb.toString());
                    } else {
                        ACLog.d(Constants.TAG, "GetPhoneNumberActivity#refreshUsagePhoneInfo, rpc result success");
                    }
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, "GetPhoneNumberActivity#refreshUsagePhoneInfo, rpc error: ".concat(String.valueOf(th)));
                }
            }
        });
    }

    private void startAddPhoneNumberActivity() {
        Intent intent = new Intent(this, AddPhoneNumberActivity.class);
        intent.putParcelableArrayListExtra(UIConstants.KEY_PHONE_INFO_LIST, this.mPhoneInfoList);
        startActivityForResult(intent, 121);
    }
}
