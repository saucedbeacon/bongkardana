package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.ui.adapter.PhoneRegionListAdapter;
import com.iap.ac.android.acs.plugin.ui.utils.MultiLanguageUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginActionBar;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginSearchBar;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.biz.common.callback.MultiLanguageCallback;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.MobilePhoneRegion;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionsGroupByInitial;
import com.iap.ac.android.biz.common.multilanguage.MultiLanguageManager;
import com.iap.ac.android.common.log.ACLog;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class PhoneRegionActivity extends Activity {
    public static final int getMax = 73;
    public static final byte[] setMin = {124, -124, 44, -103, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    /* access modifiers changed from: private */
    public ACPluginActionBar mActionBar;
    /* access modifiers changed from: private */
    public TextView mListEmptyHintText;
    /* access modifiers changed from: private */
    public PhoneRegionListAdapter mPhoneRegionAdapter;
    /* access modifiers changed from: private */
    public ListView mPhoneRegionList;
    /* access modifiers changed from: private */
    public ACPluginSearchBar mSearchBar;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, short r7, int r8) {
        /*
            byte[] r0 = setMin
            int r7 = r7 * 45
            int r7 = r7 + 56
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r7
            r4 = 0
            r7 = r6
            goto L_0x002c
        L_0x0017:
            r3 = 0
        L_0x0018:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            byte r3 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x002c:
            int r6 = r6 + r3
            int r6 = r6 + -2
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.PhoneRegionActivity.getMax(byte, short, int):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMin;
        String max = getMax((byte) bArr[8], (byte) bArr[85], (short) bArr[96]);
        byte[] bArr2 = setMin;
        byte b = (byte) bArr2[8];
        String max2 = getMax((byte) bArr2[85], b, (short) (b | 174));
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1440485983, oncanceled);
            onCancelLoad.getMin(1440485983, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1440485983, oncanceled2);
            onCancelLoad.getMin(1440485983, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1440485983, oncanceled3);
            onCancelLoad.getMin(1440485983, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_phone_region);
        initView();
    }

    private void initView() {
        this.mActionBar = (ACPluginActionBar) findViewById(R.id.action_bar);
        this.mSearchBar = (ACPluginSearchBar) findViewById(R.id.search_bar);
        this.mPhoneRegionList = (ListView) findViewById(R.id.phone_region_list);
        TextView textView = (TextView) findViewById(R.id.list_empty_hint_text);
        this.mListEmptyHintText = textView;
        this.mPhoneRegionList.setEmptyView(textView);
        this.mPhoneRegionList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (PhoneRegionActivity.this.mPhoneRegionAdapter == null) {
                    ACLog.e(Constants.TAG, "PhoneRegionActivity#onItemClick, list adapter is null");
                    return;
                }
                Object item = PhoneRegionActivity.this.mPhoneRegionAdapter.getItem(i);
                if (!(item instanceof MobilePhoneRegion)) {
                    ACLog.e(Constants.TAG, "PhoneRegionActivity#onItemClick, list item data illegal");
                    return;
                }
                MobilePhoneRegion mobilePhoneRegion = (MobilePhoneRegion) item;
                PhoneRegionActivity.this.finishActivity(mobilePhoneRegion.regionName, mobilePhoneRegion.mobilePhoneRegionCode);
            }
        });
        fillText();
        initSearchBar();
        initPhoneRegionList();
    }

    private void fillText() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-1173327998, oncanceled);
            onCancelLoad.getMin(-1173327998, oncanceled);
        }
        this.mActionBar.setTitle(getString(R.string.acplugin_choose_region));
        this.mSearchBar.setHint(getString(R.string.acplugin_search_region));
        this.mListEmptyHintText.setText(getString(R.string.acplugin_no_result));
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                PhoneRegionActivity.this.mActionBar.setTitle(map.get("ChooseRegion"));
                PhoneRegionActivity.this.mSearchBar.setHint(map.get("SearchRegion"));
                PhoneRegionActivity.this.mListEmptyHintText.setText(map.get("NoResult"));
            }
        });
    }

    private void initSearchBar() {
        this.mSearchBar.setOnSearchListener(new ACPluginSearchBar.OnSearchListener() {
            public void onSearch(CharSequence charSequence) {
                if (PhoneRegionActivity.this.mPhoneRegionAdapter != null) {
                    PhoneRegionActivity.this.mPhoneRegionAdapter.filter(charSequence);
                }
            }
        });
    }

    private void initPhoneRegionList() {
        MultiLanguageManager.queryRegionCode(MultiLanguageUtils.locale, new MultiLanguageCallback<List<RegionsGroupByInitial>>() {
            public void onResult(@NonNull List<RegionsGroupByInitial> list) {
                if (list.isEmpty()) {
                    ACLog.e(Constants.TAG, "PhoneRegionActivity#initPhoneRegionList, phone region list is empty");
                    MonitorUtil.monitorError("getMobilePhoneRegionCodes empty");
                } else if (UIUtils.isActivityDisabled(PhoneRegionActivity.this)) {
                    ACLog.e(Constants.TAG, "PhoneRegionActivity#initPhoneRegionList, activity disabled");
                } else {
                    ACLog.d(Constants.TAG, "PhoneRegionActivity#initPhoneRegionList, data legal, start to refresh UI");
                    PhoneRegionListAdapter unused = PhoneRegionActivity.this.mPhoneRegionAdapter = new PhoneRegionListAdapter(PhoneRegionActivity.this, list);
                    PhoneRegionActivity.this.mPhoneRegionList.setAdapter(PhoneRegionActivity.this.mPhoneRegionAdapter);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void finishActivity(String str, String str2) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1286828314, oncanceled);
            onCancelLoad.getMin(1286828314, oncanceled);
        }
        StringBuilder sb = new StringBuilder("PhoneRegionActivity#finishActivity, region: ");
        sb.append(str);
        sb.append(", phonePrefix: ");
        sb.append(str2);
        ACLog.d(Constants.TAG, sb.toString());
        Intent intent = new Intent();
        intent.putExtra("region", str);
        intent.putExtra(UIConstants.KEY_PHONE_PREFIX, str2);
        setResult(-1, intent);
        finish();
    }
}
