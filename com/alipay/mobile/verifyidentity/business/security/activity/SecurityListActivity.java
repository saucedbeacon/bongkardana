package com.alipay.mobile.verifyidentity.business.security.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.alipay.iap.android.common.errorcode.IAPError;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCommand;
import com.alipay.iap.android.common.task.async.IAPAsyncTask;
import com.alipay.mobile.verifyidentity.RpcSettings;
import com.alipay.mobile.verifyidentity.base.OnClickUrl;
import com.alipay.mobile.verifyidentity.base.adapter.ListViewAdapter;
import com.alipay.mobile.verifyidentity.base.adapter.ViewHolder;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterface;
import com.alipay.mobile.verifyidentity.business.activity.ActivityInterfaceManager;
import com.alipay.mobile.verifyidentity.business.activity.BaseActivity;
import com.alipay.mobile.verifyidentity.business.activity.ClientLogKitManager;
import com.alipay.mobile.verifyidentity.business.security.R;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.MenuItem;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngineUtils;
import com.alipay.mobile.verifyidentity.uitools.ColorUtils;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcRequest;
import com.alipay.mobileiclib.common.service.facade.solution.dto.MICRpcResponse;
import com.google.common.base.Ascii;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SecurityListActivity extends BaseActivity implements View.OnClickListener {
    public static final byte[] getMax = {86, -114, 84, 8, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 191;
    /* access modifiers changed from: private */
    public String action;
    /* access modifiers changed from: private */
    public SecurityListAdapter adapter;
    boolean isFirstResume = true;
    private ListView lv_content;
    private List<MenuItem> menuItemList = new ArrayList();
    private String menuTitle;
    private Message message;
    /* access modifiers changed from: private */
    public boolean mshowMenu;
    /* access modifiers changed from: private */
    public String productCode;
    private View rl_title;
    /* access modifiers changed from: private */
    public String sceneId;
    private String secData;
    /* access modifiers changed from: private */
    public String tntInstId;
    private TextView tv_title;
    /* access modifiers changed from: private */
    public String userId;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, byte r8, int r9) {
        /*
            byte[] r0 = getMax
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r9 = r9 * 45
            int r9 = r9 + 56
            int r8 = r8 * 175
            int r8 = 178 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r9
            r4 = 0
            r9 = r8
            goto L_0x002c
        L_0x0017:
            r3 = 0
        L_0x0018:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L_0x0027
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0027:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L_0x002c:
            int r8 = r8 + r3
            int r8 = r8 + -2
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.security.activity.SecurityListActivity.setMin(int, byte, int):java.lang.String");
    }

    public void initData() {
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte b = (byte) getMax[85];
        byte b2 = (byte) b;
        String min2 = setMin(b, b2, (byte) b2);
        byte b3 = (byte) getMax[8];
        byte b4 = (byte) b3;
        String min3 = setMin(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(1356531902, oncanceled);
            onCancelLoad.getMin(1356531902, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1356531902, oncanceled2);
            onCancelLoad.getMin(1356531902, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1356531902, oncanceled3);
            onCancelLoad.getMin(1356531902, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.activity_security_list);
        findViewById(R.id.ll_back).setOnClickListener(this);
        this.lv_content = (ListView) findViewById(R.id.lv_content);
        SecurityListAdapter securityListAdapter = new SecurityListAdapter(this, this.menuItemList, R.layout.security_item);
        this.adapter = securityListAdapter;
        this.lv_content.setAdapter(securityListAdapter);
        this.tv_title = (TextView) findViewById(R.id.tv_title);
        this.rl_title = findViewById(R.id.rl_title);
        initListData();
    }

    private void processIntent() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(302640006, oncanceled);
            onCancelLoad.getMin(302640006, oncanceled);
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.userId = intent.getStringExtra("userId");
            this.sceneId = intent.getStringExtra("sceneId");
            this.tntInstId = intent.getStringExtra(RequestConstants.SecVIKeyTntInstId);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        processIntent();
    }

    /* access modifiers changed from: protected */
    public void initListData() {
        Message message2 = (Message) getIntent().getSerializableExtra("message");
        this.message = message2;
        if (message2 != null) {
            this.sceneId = message2.getSceneId();
            this.userId = this.message.getUserId();
            this.tntInstId = this.message.getTntInstId();
            String data = this.message.getData();
            this.secData = this.message.getSecData();
            this.action = this.message.getAction();
            this.productCode = this.message.getProductCode();
            parceJsonResult(data);
        }
        if (this.mshowMenu) {
            this.adapter.notifyDataSetChanged();
        }
        this.tv_title.setText(this.menuTitle);
    }

    public void onResume() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 840422373 == (max = dispatchOnCancelled.getMax(applicationContext, 840422373)))) {
            onCanceled oncanceled = new onCanceled(840422373, max, 512);
            onCancelLoad.setMax(840422373, oncanceled);
            onCancelLoad.getMin(840422373, oncanceled);
        }
        super.onResume();
        if (!this.isFirstResume) {
            refleshList();
        }
        this.isFirstResume = false;
    }

    private void refleshList() {
        IAPAsyncTask.asyncTask(new IAPAsyncTask.Runner<MICRpcResponse>() {
            public void onFailure(IAPError iAPError) {
            }

            public MICRpcResponse execute() throws Exception {
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                mICRpcRequest.action = SecurityListActivity.this.action;
                mICRpcRequest.envData = new JSONObject(VIEngineUtils.getEnvData(SecurityListActivity.this)).toString();
                mICRpcRequest.module = SecurityListActivity.this.productCode;
                mICRpcRequest.prodmngId = "query";
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", SecurityListActivity.this.userId);
                jSONObject.put("sceneId", SecurityListActivity.this.sceneId);
                jSONObject.put(RequestConstants.SecVIKeyTntInstId, SecurityListActivity.this.tntInstId);
                mICRpcRequest.data = jSONObject.toString();
                try {
                    return RpcSettings.retrieveRpcService().dispatch(mICRpcRequest);
                } catch (Throwable unused) {
                    return null;
                }
            }

            public void onSuccess(MICRpcResponse mICRpcResponse) {
                if (mICRpcResponse != null) {
                    SecurityListActivity.this.parceJsonResult(mICRpcResponse.data);
                    if (SecurityListActivity.this.mshowMenu) {
                        SecurityListActivity.this.adapter.notifyDataSetChanged();
                    }
                }
            }
        });
    }

    public void onDestroy() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(2141315240, oncanceled);
            onCancelLoad.getMin(2141315240, oncanceled);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    public void parceJsonResult(String str) {
        this.menuItemList.clear();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject(SecurityConstants.KEY_MENU_DATA);
            this.mshowMenu = jSONObject.getBoolean(SecurityConstants.KEY_SHOW_MENU);
            this.menuTitle = jSONObject.getString(SecurityConstants.KEY_MENU_TITLE);
            JSONArray jSONArray = jSONObject2.getJSONArray(SecurityConstants.KEY_MENUGROUPS);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = ((JSONObject) jSONArray.get(i)).getJSONArray(SecurityConstants.KEY_MENUITEMS);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i2);
                    MenuItem menuItem = new MenuItem();
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("extInfo");
                    menuItem.setDesc(jSONObject3.getString(SecurityConstants.KEY_DESC));
                    menuItem.setRedDot(jSONObject4.getString("redDot"));
                    menuItem.setStatus(jSONObject4.getString("status"));
                    menuItem.setType(jSONObject4.getString("type"));
                    menuItem.setTitle(jSONObject3.getString("title"));
                    Map<String, String> parseRequestParam = parseRequestParam(jSONObject3.getString("url"));
                    String str2 = parseRequestParam.get("productCode");
                    menuItem.setProductCode(str2);
                    menuItem.setProductId(parseRequestParam.get("productId"));
                    String parceSecData = parceSecData(str2);
                    if (!TextUtils.isEmpty(parceSecData)) {
                        menuItem.setUrl(parceSecData);
                    } else {
                        menuItem.setUrl(jSONObject3.getString("url"));
                    }
                    this.menuItemList.add(menuItem);
                }
                this.menuItemList.get(this.menuItemList.size() - 1).setNeedLine(true);
            }
        } catch (Exception unused) {
        }
    }

    private String parceSecData(String str) {
        if (TextUtils.isEmpty(this.secData)) {
            return "";
        }
        try {
            return new JSONObject(this.secData).getJSONObject(str).getString("url");
        } catch (Exception unused) {
            return "";
        }
    }

    public void modifyViewFromOutside() {
        ActivityInterface commonActivityInterface = ActivityInterfaceManager.getCommonActivityInterface();
        if (!TextUtils.isEmpty(commonActivityInterface.navBigColor())) {
            int parseColor = ColorUtils.parseColor(commonActivityInterface.navBigColor());
            if (!ColorUtils.isColorInvalid(parseColor)) {
                this.rl_title.setBackgroundColor(parseColor);
            }
        }
    }

    class SecurityListAdapter extends ListViewAdapter<MenuItem> {
        public SecurityListAdapter(Context context, List<MenuItem> list, int i) {
            super(context, list, i);
        }

        public void convert(ViewHolder viewHolder, final MenuItem menuItem, int i) {
            ((TextView) viewHolder.getView(R.id.tv_left)).setText(menuItem.getTitle());
            ((TextView) viewHolder.getView(R.id.tv_status)).setText(menuItem.getDesc());
            viewHolder.getView(R.id.red_point).setVisibility(menuItem.getRedDot().equals("TRUE") ? 0 : 4);
            viewHolder.getView(R.id.rl_item).setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (!TextUtils.isEmpty(menuItem.getProductCode())) {
                        String productCode = menuItem.getProductCode();
                        if (productCode.equals("email")) {
                            OnClickUrl onClickUrl = VIEngine.getOnClickUrl();
                            if (onClickUrl != null) {
                                onClickUrl.onClickHttpUrl(SecurityListActivity.this, menuItem.getUrl());
                            }
                        } else if (productCode.equals("kyc")) {
                            OnClickUrl onClickUrl2 = VIEngine.getOnClickUrl();
                            if (onClickUrl2 != null) {
                                onClickUrl2.onClickHttpUrl(SecurityListActivity.this, menuItem.getUrl());
                            }
                        } else if (productCode.equals(SecurityConstants.KEY_SQ)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("sceneId", SecurityListActivity.this.sceneId);
                            hashMap.put("userId", SecurityListActivity.this.userId);
                            hashMap.put(RequestConstants.SecVIKeyTntInstId, SecurityListActivity.this.tntInstId);
                            hashMap.put("bizId", UUID.randomUUID().toString());
                            hashMap.put("action", RequestConstants.QUERY_BIO_STATUS);
                            hashMap.put("productCode", productCode);
                            hashMap.put(RequestConstants.SecVIKeyProductMngId, IAPSyncCommand.COMMAND_INIT);
                            hashMap.put("productId", menuItem.getProductId());
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("module", productCode);
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("userId", SecurityListActivity.this.userId);
                                jSONObject.put("sceneId", SecurityListActivity.this.sceneId);
                                jSONObject.put(RequestConstants.SecVIKeyTntInstId, SecurityListActivity.this.tntInstId);
                                jSONObject.put("productType", menuItem.getProductId());
                                hashMap2.put("data", jSONObject.toString());
                            } catch (JSONException unused) {
                            }
                            ClientLogKitManager.getClientLogKit().log("event", new String[]{"a5.b1.c1", "0", ""}, hashMap2, "", "SecVI_Seed_SecQuestion_QueryStatus", "", "", false);
                            VIEngine.startProduct(SecurityListActivity.this, hashMap, (Map<String, String>) null, new VIEngine.OnQueryResult() {
                                public void onFail() {
                                }

                                public void onSuccess() {
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    public Map<String, String> parseRequestParam(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (str.contains("?")) {
            String[] split = str.split("\\?", 2);
            if (split.length < 2) {
                return null;
            }
            str = split[1];
        }
        if (str.contains("&")) {
            for (String parseBasicParam : str.split("&")) {
                parseBasicParam(hashMap, parseBasicParam);
            }
            return hashMap;
        }
        parseBasicParam(hashMap, str);
        return hashMap;
    }

    private void parseBasicParam(Map<String, String> map, String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(840516406, oncanceled);
            onCancelLoad.getMin(840516406, oncanceled);
        }
        String[] split = str.split(SimpleComparison.EQUAL_TO_OPERATION);
        if (split.length >= 2) {
            map.put(split[0], split[1]);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }

    public void onClick(View view) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1206779280, oncanceled);
            onCancelLoad.getMin(1206779280, oncanceled);
        }
        finish();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int min;
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(-258415642, oncanceled);
            onCancelLoad.getMin(-258415642, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(-258415642, oncanceled2);
            onCancelLoad.getMin(-258415642, oncanceled2);
        }
        return super.onKeyDown(i, keyEvent);
    }
}
