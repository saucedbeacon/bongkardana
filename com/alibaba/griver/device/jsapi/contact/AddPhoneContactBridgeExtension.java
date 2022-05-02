package com.alibaba.griver.device.jsapi.contact;

import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.alibaba.ariver.app.api.permission.IPermissionRequestCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.utils.PermissionUtils;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.proxy.RVCommonAbilityProxy;
import java.util.ArrayList;
import java.util.Arrays;

public class AddPhoneContactBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9077a = AddPhoneContactBridgeExtension.class.getSimpleName();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void addPhoneContact(@BindingApiContext ApiContext apiContext, @BindingCallback final BridgeCallback bridgeCallback, @BindingRequest final JSONObject jSONObject) {
        final Activity activity = apiContext.getActivity();
        if (activity != null) {
            if (!PermissionUtils.hasPermission("android.permission.WRITE_CONTACTS")) {
                PermissionUtils.requestPermission("android.permission.WRITE_CONTACTS", 3002, new IPermissionRequestCallback() {
                    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
                        if (PermissionUtils.positivePermissionResult(iArr)) {
                            AddPhoneContactBridgeExtension.this.a(activity, jSONObject, bridgeCallback);
                        } else {
                            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(3, activity.getString(R.string.griver_write_contacts_no_permission)));
                        }
                    }
                });
            } else {
                a(activity, jSONObject, bridgeCallback);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(final Activity activity, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        RVCommonAbilityProxy rVCommonAbilityProxy = (RVCommonAbilityProxy) RVProxy.get(RVCommonAbilityProxy.class);
        if (rVCommonAbilityProxy != null) {
            ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{activity.getString(R.string.griver_h5_add_contact_create), activity.getString(R.string.griver_h5_add_contact_update)}));
            AddPhoneContactView addPhoneContactDialog = rVCommonAbilityProxy.getAddPhoneContactDialog();
            addPhoneContactDialog.initView(activity, arrayList);
            addPhoneContactDialog.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    if (i == 0) {
                        AddPhoneContactBridgeExtension.a(activity, bridgeCallback, jSONObject);
                    } else if (i == 1) {
                        AddPhoneContactBridgeExtension.b(activity, bridgeCallback, jSONObject);
                    }
                }
            });
            addPhoneContactDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(11, "fail cancel"));
                }
            });
            addPhoneContactDialog.show();
        }
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject) {
        if (activity != null) {
            Intent intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            try {
                activity.startActivity(a(activity, intent, jSONObject));
                bridgeCallback.sendBridgeResponse(new BridgeResponse.NamedValue("success", Boolean.TRUE));
            } catch (Exception e) {
                RVLogger.e(f9077a, (Throwable) e);
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        }
    }

    private static Intent a(Activity activity, Intent intent, JSONObject jSONObject) {
        Activity activity2 = activity;
        Intent intent2 = intent;
        JSONObject jSONObject2 = jSONObject;
        if (jSONObject2 == null) {
            return intent2;
        }
        ContentValues contentValues = new ContentValues(8);
        contentValues.put("mimetype", "vnd.android.cursor.item/name");
        contentValues.put("data3", jSONObject2.getString("lastName"));
        contentValues.put("data5", jSONObject2.getString("middleName"));
        contentValues.put("data2", jSONObject2.getString("firstName"));
        contentValues.put("data1", a(contentValues));
        ContentValues contentValues2 = new ContentValues(8);
        contentValues2.put("mimetype", "vnd.android.cursor.item/im");
        contentValues2.put("data2", 3);
        contentValues2.put("data1", jSONObject2.getString("alipayAccount"));
        contentValues2.put("data5", -1);
        contentValues2.put("data6", activity2.getString(activity.getApplicationInfo().labelRes));
        ContentValues contentValues3 = new ContentValues(8);
        contentValues3.put("mimetype", "vnd.android.cursor.item/im");
        contentValues3.put("data2", 3);
        contentValues3.put("data1", jSONObject2.getString("weChatNumber"));
        contentValues3.put("data5", -1);
        contentValues3.put("data6", activity2.getString(R.string.griver_h5_add_contact_wechat));
        ContentValues contentValues4 = new ContentValues(4);
        contentValues4.put("mimetype", "vnd.android.cursor.item/photo");
        contentValues4.put("data15", a(jSONObject2.getString("photoFilePath")));
        ContentValues contentValues5 = new ContentValues(4);
        contentValues5.put("mimetype", "vnd.android.cursor.item/nickname");
        contentValues5.put("data2", 1);
        contentValues5.put("data1", jSONObject2.getString("nickName"));
        ContentValues contentValues6 = new ContentValues(4);
        contentValues6.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues6.put("data2", 3);
        contentValues6.put("data1", jSONObject2.getString("workPhoneNumber"));
        ContentValues contentValues7 = new ContentValues(4);
        contentValues7.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues7.put("data2", 4);
        contentValues7.put("data1", jSONObject2.getString("workFaxNumber"));
        ContentValues contentValues8 = new ContentValues(4);
        contentValues8.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues8.put("data2", 1);
        contentValues8.put("data1", jSONObject2.getString("homePhoneNumber"));
        ContentValues contentValues9 = new ContentValues(4);
        contentValues9.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues9.put("data2", 5);
        contentValues9.put("data1", jSONObject2.getString("homeFaxNumber"));
        ContentValues contentValues10 = new ContentValues(4);
        contentValues10.put("mimetype", "vnd.android.cursor.item/phone_v2");
        contentValues10.put("data2", 7);
        contentValues10.put("data1", jSONObject2.getString("hostNumber"));
        ContentValues contentValues11 = new ContentValues(4);
        contentValues11.put("mimetype", "vnd.android.cursor.item/website");
        contentValues11.put("data2", 7);
        contentValues11.put("data1", jSONObject2.getString("url"));
        ContentValues contentValues12 = contentValues11;
        ContentValues contentValues13 = new ContentValues(8);
        contentValues13.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        ContentValues contentValues14 = contentValues10;
        contentValues13.put("data2", 3);
        contentValues13.put("data10", jSONObject2.getString("addressCountry"));
        contentValues13.put("data8", jSONObject2.getString("addressState"));
        contentValues13.put("data7", jSONObject2.getString("addressCity"));
        contentValues13.put("data4", jSONObject2.getString("addressStreet"));
        contentValues13.put("data9", jSONObject2.getString("addressPostalCode"));
        contentValues13.put("data1", getDisplayPostal(contentValues13));
        ContentValues contentValues15 = contentValues13;
        ContentValues contentValues16 = new ContentValues(8);
        contentValues16.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues16.put("data2", 2);
        contentValues16.put("data10", jSONObject2.getString("workAddressCountry"));
        contentValues16.put("data8", jSONObject2.getString("workAddressState"));
        contentValues16.put("data7", jSONObject2.getString("workAddressCity"));
        contentValues16.put("data4", jSONObject2.getString("workAddressStreet"));
        contentValues16.put("data9", jSONObject2.getString("workAddressPostalCode"));
        contentValues16.put("data1", getDisplayPostal(contentValues16));
        ContentValues contentValues17 = new ContentValues(8);
        contentValues17.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        contentValues17.put("data2", 1);
        contentValues17.put("data10", jSONObject2.getString("homeAddressCountry"));
        contentValues17.put("data8", jSONObject2.getString("homeAddressState"));
        contentValues17.put("data7", jSONObject2.getString("homeAddressCity"));
        contentValues17.put("data4", jSONObject2.getString("homeAddressStreet"));
        contentValues17.put("data9", jSONObject2.getString("homeAddressPostalCode"));
        contentValues17.put("data1", getDisplayPostal(contentValues17));
        ContentValues contentValues18 = new ContentValues(4);
        contentValues18.put("mimetype", "vnd.android.cursor.item/note");
        contentValues18.put("data1", jSONObject2.getString("remark"));
        ContentValues[] contentValuesArr = {contentValues, contentValues2, contentValues3, contentValues4, contentValues5, contentValues6, contentValues7, contentValues8, contentValues9, contentValues14, contentValues12, contentValues15, contentValues16, contentValues17, contentValues18};
        Intent intent3 = intent;
        intent3.putParcelableArrayListExtra("data", new ArrayList(Arrays.asList(contentValuesArr)));
        intent3.putExtra("name", contentValues.getAsString("data1"));
        intent3.putExtra("phone", jSONObject2.getString("mobilePhoneNumber"));
        intent3.putExtra("company", jSONObject2.getString("organization"));
        intent3.putExtra("job_title", jSONObject2.getString("title"));
        intent3.putExtra("email", jSONObject2.getString("email"));
        return intent3;
    }

    static String getDisplayPostal(ContentValues contentValues) {
        String[] strArr = {contentValues.getAsString("data4"), contentValues.getAsString("data7"), contentValues.getAsString("data8"), contentValues.getAsString("data9"), contentValues.getAsString("data10")};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
                if (i != 4) {
                    sb.append(10);
                }
            }
        }
        return sb.toString();
    }

    private static String a(ContentValues contentValues) {
        String asString = contentValues.getAsString("data2");
        String asString2 = contentValues.getAsString("data5");
        String asString3 = contentValues.getAsString("data3");
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(asString)) {
            sb.append(asString);
        }
        if (!TextUtils.isEmpty(asString2)) {
            sb.append(' ');
            sb.append(asString2);
        }
        if (!TextUtils.isEmpty(asString3)) {
            sb.append(' ');
            sb.append(asString3);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0058 A[SYNTHETIC, Splitter:B:28:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060 A[SYNTHETIC, Splitter:B:35:0x0060] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] a(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            r0.<init>(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004d }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x004b }
            r5.<init>()     // Catch:{ IOException -> 0x004b }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x004b }
        L_0x0016:
            int r3 = r0.read(r2)     // Catch:{ IOException -> 0x004b }
            if (r3 < 0) goto L_0x0021
            r4 = 0
            r5.write(r2, r4, r3)     // Catch:{ IOException -> 0x004b }
            goto L_0x0016
        L_0x0021:
            byte[] r5 = r5.toByteArray()     // Catch:{ IOException -> 0x004b }
            int r2 = r5.length     // Catch:{ IOException -> 0x004b }
            r3 = 262144(0x40000, float:3.67342E-40)
            if (r2 <= r3) goto L_0x0047
            java.lang.String r2 = f9077a     // Catch:{ IOException -> 0x004b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x004b }
            java.lang.String r4 = "Photo file too large for an IPC transaction, ignoring. file size = "
            r3.<init>(r4)     // Catch:{ IOException -> 0x004b }
            int r5 = r5.length     // Catch:{ IOException -> 0x004b }
            r3.append(r5)     // Catch:{ IOException -> 0x004b }
            java.lang.String r5 = ", max allowed = 262144"
            r3.append(r5)     // Catch:{ IOException -> 0x004b }
            java.lang.String r5 = r3.toString()     // Catch:{ IOException -> 0x004b }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.String) r5)     // Catch:{ IOException -> 0x004b }
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r1
        L_0x0047:
            r0.close()     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            return r5
        L_0x004b:
            r5 = move-exception
            goto L_0x0051
        L_0x004d:
            r5 = move-exception
            goto L_0x005e
        L_0x004f:
            r5 = move-exception
            r0 = r1
        L_0x0051:
            java.lang.String r2 = f9077a     // Catch:{ all -> 0x005c }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.Throwable) r5)     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x005b
            r0.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            return r1
        L_0x005c:
            r5 = move-exception
            r1 = r0
        L_0x005e:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            goto L_0x0065
        L_0x0064:
            throw r5
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.device.jsapi.contact.AddPhoneContactBridgeExtension.a(java.lang.String):byte[]");
    }

    /* access modifiers changed from: private */
    public static void b(Activity activity, BridgeCallback bridgeCallback, JSONObject jSONObject) {
        if (activity != null) {
            Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
            try {
                activity.startActivity(a(activity, intent, jSONObject));
                bridgeCallback.sendBridgeResponse(new BridgeResponse.NamedValue("success", Boolean.TRUE));
            } catch (Exception e) {
                RVLogger.e(f9077a, (Throwable) e);
                bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        }
    }
}
