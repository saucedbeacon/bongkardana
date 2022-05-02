package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.multilevel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.AUSegment;
import com.alibaba.griver.ui.ant.AUTitleBar;
import com.alibaba.griver.ui.ant.helper.ItemCategory;
import com.alibaba.griver.ui.ant.layout.AULinearLayout;
import com.alibaba.griver.ui.ant.listview.AUListView;
import com.google.common.base.Ascii;
import id.dana.usereducation.constant.BottomSheetType;
import java.util.ArrayList;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class MultilevelSelectActivity extends FragmentActivity {
    public static final byte[] getMax = {116, -13, -63, -110, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static volatile MultilevelSelectCallBack multilevelSelectCallBack;
    public static final int setMax = 88;

    /* renamed from: a  reason: collision with root package name */
    private String f9109a;
    /* access modifiers changed from: private */
    public String b;
    /* access modifiers changed from: private */
    public JSONArray c;
    /* access modifiers changed from: private */
    public JSONArray d;
    /* access modifiers changed from: private */
    public JSONArray e = new JSONArray();
    /* access modifiers changed from: private */
    public int f;
    protected AULinearLayout mContainer;
    protected AUListView mListView;
    protected AUSegment mSegemnt;
    protected AUTitleBar mTitleBar;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(byte r5, int r6, byte r7) {
        /*
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r0 = getMax
            int r6 = r6 + 4
            int r5 = r5 * 165
            int r5 = 176 - r5
            byte[] r1 = new byte[r5]
            r2 = -1
            int r5 = r5 + r2
            if (r0 != 0) goto L_0x0016
            r3 = r7
            r7 = r6
            r6 = r5
            goto L_0x002c
        L_0x0016:
            int r2 = r2 + 1
            int r6 = r6 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L_0x0026
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0026:
            byte r3 = r0[r6]
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L_0x002c:
            int r5 = r5 + r3
            int r5 = r5 + -2
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r4
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.multilevel.MultilevelSelectActivity.setMin(byte, int, byte):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMax;
        String min2 = setMin((byte) bArr[8], (short) bArr[96], (byte) bArr[8]);
        byte[] bArr2 = getMax;
        String min3 = setMin((byte) bArr2[85], 174, (byte) bArr2[85]);
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
            onCancelLoad.setMax(-1349476957, oncanceled);
            onCancelLoad.getMin(-1349476957, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1349476957 == (max = dispatchOnCancelled.getMax(applicationContext2, -1349476957)))) {
            onCanceled oncanceled2 = new onCanceled(-1349476957, max, 512);
            onCancelLoad.setMax(-1349476957, oncanceled2);
            onCancelLoad.getMin(-1349476957, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1349476957, oncanceled3);
            onCancelLoad.getMin(-1349476957, oncanceled3);
        }
        super.onCreate(bundle);
        try {
            setRequestedOrientation(1);
        } catch (Exception unused) {
        }
        setContentView(R.layout.griver_ui_activity_multilevel_select);
        init();
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.mSegemnt = (AUSegment) findViewById(R.id.segment);
        this.mTitleBar = (AUTitleBar) findViewById(R.id.title_bar);
        this.mListView = (AUListView) findViewById(R.id.listview);
        this.mContainer = (AULinearLayout) findViewById(R.id.container);
        b();
        if (this.c == null || this.d == null) {
            a();
            return;
        }
        this.mTitleBar.toIOSStyle(this.f9109a);
        this.mTitleBar.setBackButtonGone();
        this.mTitleBar.getLeftButton().setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MultilevelSelectActivity.this.a();
            }
        });
        ArrayList arrayList = new ArrayList();
        if (!this.e.isEmpty()) {
            int size = this.e.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(a(i, this.e.getJSONObject(i).getString("name")));
            }
            JSONArray jSONArray = this.e;
            JSONArray jSONArray2 = jSONArray.getJSONObject(jSONArray.size() - 1).getJSONArray("subList");
            if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                arrayList.add(a(this.e.size(), this.b));
            }
        } else {
            arrayList.add(a(0, this.b));
        }
        this.mSegemnt.setDivideAutoSize(false);
        this.mSegemnt.init(arrayList);
        this.mListView.setAdapter(new MultilevelSelectAdapter(this.d, this));
        this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                JSONObject jSONObject = MultilevelSelectActivity.this.d.getJSONObject(i);
                while (MultilevelSelectActivity.this.e.size() > MultilevelSelectActivity.this.f) {
                    MultilevelSelectActivity.this.e.remove(MultilevelSelectActivity.this.e.size() - 1);
                }
                MultilevelSelectActivity.this.e.add(jSONObject);
                JSONArray jSONArray = jSONObject.getJSONArray("subList");
                if (jSONArray == null || jSONArray.isEmpty()) {
                    if (MultilevelSelectActivity.multilevelSelectCallBack != null) {
                        MultilevelSelectActivity.multilevelSelectCallBack.onSuccess(MultilevelSelectActivity.this.e);
                    }
                    MultilevelSelectActivity.this.finish();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < MultilevelSelectActivity.this.e.size(); i2++) {
                    arrayList.add(MultilevelSelectActivity.this.a(i2, MultilevelSelectActivity.this.e.getJSONObject(i2).getString("name")));
                }
                MultilevelSelectActivity multilevelSelectActivity = MultilevelSelectActivity.this;
                arrayList.add(multilevelSelectActivity.a(multilevelSelectActivity.e.size(), MultilevelSelectActivity.this.b));
                MultilevelSelectActivity.this.mSegemnt.init(arrayList);
                MultilevelSelectActivity.this.a(arrayList.size() - 1, jSONArray);
            }
        });
        if (this.e.isEmpty()) {
            return;
        }
        if (this.e.size() > 1) {
            JSONArray jSONArray3 = this.e;
            JSONArray jSONArray4 = jSONArray3.getJSONObject(jSONArray3.size() - 2).getJSONArray("subList");
            if (jSONArray4 != null && !jSONArray4.isEmpty()) {
                arrayList.add(a(this.e.size(), this.b));
            }
            a(this.e.size() - 1, jSONArray4);
            return;
        }
        a(0, this.c);
    }

    /* access modifiers changed from: private */
    public void a(int i, JSONArray jSONArray) {
        this.f = i;
        this.mSegemnt.setCurrentSelTab(i);
        this.mListView.setAdapter(new MultilevelSelectAdapter(jSONArray, this));
        this.d = jSONArray;
        this.mSegemnt.setTabSwitchListener(new AUSegment.TabSwitchListener() {
            public void onTabClick(int i, View view) {
                if (i > 0) {
                    MultilevelSelectActivity.this.a(i, MultilevelSelectActivity.this.e.getJSONObject(i - 1).getJSONArray("subList"));
                    return;
                }
                MultilevelSelectActivity multilevelSelectActivity = MultilevelSelectActivity.this;
                multilevelSelectActivity.a(i, multilevelSelectActivity.c);
            }
        });
    }

    /* access modifiers changed from: private */
    @NonNull
    public ItemCategory a(int i, String str) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.getMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 32);
            onCancelLoad.setMax(1173458185, oncanceled);
            onCancelLoad.getMin(1173458185, oncanceled);
        }
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.categoryname = str;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(str);
        itemCategory.categoryId = sb.toString();
        return itemCategory;
    }

    /* access modifiers changed from: private */
    public void a() {
        finish();
        if (multilevelSelectCallBack != null) {
            multilevelSelectCallBack.onCancel();
        }
    }

    public void onBackPressed() {
        a();
    }

    private void b() {
        JSONArray jSONArray;
        Intent intent = getIntent();
        this.f9109a = intent.getStringExtra("title");
        String stringExtra = intent.getStringExtra("defaultSegmentName");
        this.b = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.b = getString(R.string.griver_please_select);
        }
        try {
            JSONArray parseArray = JSON.parseArray(intent.getStringExtra(BottomSheetType.LIST));
            this.c = parseArray;
            this.d = parseArray;
        } catch (Throwable th) {
            GriverLogger.e("MultilevelSelectActivity", "error", th);
        }
        String stringExtra2 = intent.getStringExtra("result");
        if (!TextUtils.isEmpty(stringExtra2) && (jSONArray = this.c) != null && !jSONArray.isEmpty()) {
            try {
                a(this.c, JSON.parseArray(stringExtra2), 0);
            } catch (Throwable th2) {
                GriverLogger.e("MultilevelSelectActivity", "error", th2);
            }
        }
    }

    private void a(JSONArray jSONArray, JSONArray jSONArray2, int i) {
        if (jSONArray != null && jSONArray2 != null && i < jSONArray2.size()) {
            int size = jSONArray.size();
            JSONObject jSONObject = jSONArray2.getJSONObject(i);
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                if (TextUtils.equals(jSONObject2.getString("name"), jSONObject.getString("name"))) {
                    this.e.add(jSONObject2);
                    i++;
                    a(jSONObject2.getJSONArray("subList"), jSONArray2, i);
                }
            }
        }
    }
}
