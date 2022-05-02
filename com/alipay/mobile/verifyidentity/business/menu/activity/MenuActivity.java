package com.alipay.mobile.verifyidentity.business.menu.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.base.adapter.ListViewAdapter;
import com.alipay.mobile.verifyidentity.base.adapter.ViewHolder;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.BaseActivity;
import com.alipay.mobile.verifyidentity.business.menu.R;
import com.alipay.mobile.verifyidentity.framework.engine.VIAction;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIResult;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONArray;
import org.json.JSONObject;

public class MenuActivity extends BaseActivity {
    public static final String VERIFY_SUCCESS = "verify_success";
    public static final int getMax = 168;
    public static final byte[] setMin = {Ascii.DLE, 63, 74, -97, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private String center_title;
    private ListView listView;
    private List<RadioBean> radioList = new ArrayList();
    private ProductCreateReceiver receiver;
    /* access modifiers changed from: private */
    public int seletItemPosition = 0;
    private TextView tv_center_title;
    private View tv_confirm;
    private TextView tv_title;
    /* access modifiers changed from: private */
    public String verifyId;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(int r7, int r8, short r9) {
        /*
            int r9 = r9 * 175
            int r9 = r9 + 4
            int r8 = r8 * 165
            int r8 = 176 - r8
            int r7 = r7 * 45
            int r7 = r7 + 56
            byte[] r0 = setMin
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r9
            goto L_0x002d
        L_0x0018:
            r3 = 0
        L_0x0019:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L_0x0026
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0026:
            byte r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r6
        L_0x002d:
            int r7 = r7 + r9
            int r9 = r0 + 1
            int r7 = r7 + -2
            r0 = r1
            r1 = r3
            r3 = r5
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.menu.activity.MenuActivity.getMax(int, int, short):java.lang.String");
    }

    public void modifyViewFromOutside() {
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMin;
        byte b = (byte) bArr[8];
        String max = getMax((byte) bArr[85], b, (byte) b);
        byte[] bArr2 = setMin;
        byte b2 = (byte) bArr2[85];
        String max2 = getMax((byte) bArr2[8], b2, (byte) b2);
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
            onCancelLoad.setMax(-872826378, oncanceled);
            onCancelLoad.getMin(-872826378, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-872826378, oncanceled2);
            onCancelLoad.getMin(-872826378, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-872826378, oncanceled3);
            onCancelLoad.getMin(-872826378, oncanceled3);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.activity_menu);
        initView();
    }

    private void initView() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-270432094, oncanceled);
            onCancelLoad.getMin(-270432094, oncanceled);
        }
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.listView = (ListView) findViewById(R.id.listView);
        this.tv_confirm = findViewById(R.id.tv_confirm);
        this.tv_center_title = (TextView) findViewById(R.id.tv_center_title);
        findViewById(R.id.ll_back).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MenuActivity.this.finish();
            }
        });
        findViewById(R.id.tv_confirm).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MenuActivity.this.confirm();
            }
        });
        setConfirmState(true);
    }

    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("renderData");
            this.verifyId = intent.getStringExtra("verifyId");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    JSONObject jSONObject = new JSONObject(stringExtra);
                    String optString = jSONObject.optString("head_title");
                    this.center_title = jSONObject.optString("form_title");
                    this.tv_title.setText(optString);
                    JSONArray optJSONArray = jSONObject.optJSONArray(RequestConstants.Menu.METHODS);
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        this.radioList.add(new RadioBean(jSONObject2.optString("name"), jSONObject2.optString("code")));
                    }
                } catch (Exception unused) {
                }
            }
            this.tv_center_title.setText(this.center_title);
            registerReceiver();
            this.listView.setAdapter(new MenuAdapter(this, this.radioList, R.layout.adapter_menu));
        }
    }

    class MenuAdapter extends ListViewAdapter<RadioBean> {
        public MenuAdapter(Context context, List<RadioBean> list, int i) {
            super(context, list, i);
        }

        public void convert(ViewHolder viewHolder, RadioBean radioBean, final int i) {
            if (i == MenuActivity.this.seletItemPosition) {
                viewHolder.getView(R.id.iv_icon).setBackgroundResource(R.drawable.menu_radio_on);
            } else {
                viewHolder.getView(R.id.iv_icon).setBackgroundResource(R.drawable.menu_radio_off);
            }
            ((TextView) viewHolder.getView(R.id.tv_title)).setText(radioBean.name);
            viewHolder.getView(R.id.rl_select).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int unused = MenuActivity.this.seletItemPosition = i;
                    MenuActivity.this.setConfirmState(true);
                    MenuAdapter.this.notifyDataSetChanged();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void confirm() {
        if (this.radioList.size() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("verifyId", this.verifyId);
            hashMap.put("verifyType", "1");
            hashMap.put("module", this.radioList.get(this.seletItemPosition).code);
            VIEngine.startVerify(this, RequestConstants.VerifyProductVerify, hashMap, (Map<String, String>) null, new VIEngine.VIListener() {
                public void onVerifyAction(VIAction vIAction) {
                }

                public void onVerifyResult(VIResult vIResult) {
                    if (vIResult.getResult() == 1000) {
                        Intent intent = new Intent();
                        intent.setAction(MenuActivity.VERIFY_SUCCESS);
                        intent.putExtra("verifyId", MenuActivity.this.verifyId);
                        MenuActivity.this.sendBroadcast(intent);
                    }
                }
            }, (VIEngine.OnQueryResult) null);
        }
    }

    /* access modifiers changed from: private */
    public void setConfirmState(boolean z) {
        int length;
        int min;
        int length2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1344834932, oncanceled);
            onCancelLoad.getMin(1344834932, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1344834932, oncanceled2);
            onCancelLoad.getMin(1344834932, oncanceled2);
        }
        if (z) {
            this.tv_confirm.setClickable(true);
            this.tv_confirm.setBackgroundResource(R.drawable.bnt_sure);
        } else {
            this.tv_confirm.setClickable(false);
            this.tv_confirm.setBackgroundResource(R.drawable.confirm_unselected);
        }
        this.tv_confirm.setVisibility(0);
    }

    class ProductCreateReceiver extends BroadcastReceiver {
        private ProductCreateReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!MenuActivity.this.isFinishing()) {
                MenuActivity.this.finish();
            }
        }
    }

    private void registerReceiver() {
        this.receiver = new ProductCreateReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(this.verifyId);
        registerReceiver(this.receiver, intentFilter);
    }

    private void unrigisterReceiver() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(2020554678, oncanceled);
            onCancelLoad.getMin(2020554678, oncanceled);
        }
        unregisterReceiver(this.receiver);
    }

    public void onDestroy() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1446142720, oncanceled);
            onCancelLoad.getMin(-1446142720, oncanceled);
        }
        super.onDestroy();
        unrigisterReceiver();
    }

    class RadioBean {
        public String code;
        public String name;

        public RadioBean(String str, String str2) {
            this.name = str;
            this.code = str2;
        }
    }
}
