package com.alibaba.griver.device.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.service.LocalAuthPermissionManager;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.api.constants.GriverLaunchParams;
import com.alibaba.griver.api.ui.auth.GriverOpenAuthExtension;
import com.alibaba.griver.base.common.account.GriverAccount;
import com.alibaba.griver.base.common.utils.APIContextUtils;
import com.alibaba.griver.device.R;
import com.alibaba.griver.device.adapter.GriverOpenSettingListAdapter;
import com.alibaba.griver.device.model.OpenSettingItem;
import com.alibaba.griver.device.model.SerializableMap;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;
import com.alibaba.griver.ui.ant.AUTitleBar;
import com.google.common.base.Ascii;
import id.dana.tracker.mixpanel.RegistrationEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchMenuItemSelected;
import o.dispatchOnCancelled;
import o.findItemsWithShortcutForKey;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverOpenSettingActivity extends Activity {
    public static final byte[] getMin = {34, -75, Byte.MIN_VALUE, -125, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};

    /* renamed from: o  reason: collision with root package name */
    private static final ConcurrentHashMap<String, String> f10432o;
    public static final int setMax = 107;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Boolean> f10433a = new HashMap();
    /* access modifiers changed from: private */
    public Map<String, Boolean> b = new HashMap();
    /* access modifiers changed from: private */
    public AppModel c;
    /* access modifiers changed from: private */
    public String d;
    private String e = "Mini Program";
    private GriverOpenSettingListAdapter f;
    /* access modifiers changed from: private */
    public List<OpenSettingItem> g = new ArrayList();
    private LinearLayout h;
    private RelativeLayout i;
    private RecyclerView j;
    private TextView k;
    private AUTitleBar l;
    private LinearLayout m;
    private TextView n;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(short r7, short r8, byte r9) {
        /*
            int r7 = r7 * 175
            int r7 = r7 + 4
            int r9 = r9 * 45
            int r9 = 101 - r9
            int r8 = r8 * 165
            int r8 = 176 - r8
            byte[] r0 = getMin
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r9 = r8
            r3 = r9
            r4 = 0
            r8 = r7
            goto L_0x002f
        L_0x0018:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x001d:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L_0x002a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x002a:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x002f:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + -2
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.device.ui.GriverOpenSettingActivity.getMax(short, short, byte):java.lang.String");
    }

    static {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        f10432o = concurrentHashMap;
        concurrentHashMap.put("getLocation", "Location");
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERLOCATION, "Location");
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_RECORD, "Microphone");
        f10432o.put("scope.scan", RegistrationEvent.ProfilePhotoSource.CAMERA);
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA, RegistrationEvent.ProfilePhotoSource.CAMERA);
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM, "Album");
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_BLUETOOTH, "Bluetooth");
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CONTACT, "Contact");
        f10432o.put("scope.saveImage", "Album");
        f10432o.put("scope.stopAudioRecord", "Microphone");
        f10432o.put("scope.cancelAudioRecord", "Microphone");
        f10432o.put("scope.saveVideoToPhotosAlbum", "Album");
        f10432o.put("scope.shareTokenImageSilent", "Album");
        f10432o.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERINFO, "UserInfo");
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        int length3;
        byte b2 = (byte) getMin[8];
        byte b3 = (byte) b2;
        String max = getMax(b2, b3, (byte) b3);
        byte b4 = (byte) getMin[96];
        byte b5 = (byte) b4;
        String max2 = getMax(b4, b5, (byte) b5);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(-1025333088, oncanceled);
            onCancelLoad.getMin(-1025333088, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(-1025333088, oncanceled2);
            onCancelLoad.getMin(-1025333088, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
            onCanceled oncanceled3 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1025333088, oncanceled3);
            onCancelLoad.getMin(-1025333088, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1025333088, oncanceled4);
            onCancelLoad.getMin(-1025333088, oncanceled4);
        }
        super.onCreate(bundle);
        setContentView(R.layout.griver_device_activity_open_setting);
        SerializableMap serializableMap = (SerializableMap) getIntent().getSerializableExtra("data");
        if (serializableMap != null) {
            this.f10433a = serializableMap.getMap();
        }
        setStatusBar();
        AppModel appModel = (AppModel) getIntent().getSerializableExtra("appInfo");
        this.c = appModel;
        if (appModel != null) {
            this.d = appModel.getAppId();
            this.e = this.c.getAppInfoModel().getName();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERLOCATION)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERLOCATION, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_USERLOCATION));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CAMERA));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_BLUETOOTH)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_BLUETOOTH, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_BLUETOOTH));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CONTACT)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CONTACT, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_CONTACT));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_RECORD)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_RECORD, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_RECORD));
        }
        if (this.f10433a.containsKey(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_ADDRESS)) {
            linkedHashMap.put(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_ADDRESS, this.f10433a.get(LocalAuthPermissionManager.SCOPE.CONST_SCOPE_ADDRESS));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            OpenSettingItem openSettingItem = new OpenSettingItem();
            openSettingItem.enabled = ((Boolean) entry.getValue()).booleanValue();
            openSettingItem.scope = (String) entry.getKey();
            openSettingItem.appId = this.d;
            openSettingItem.displayName = f10432o.get(entry.getKey());
            this.g.add(openSettingItem);
        }
        c();
        b();
        a();
    }

    /* access modifiers changed from: protected */
    public void setStatusBar() {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(APEncodeOptions.DEFAULT_MAX_LEN);
            getWindow().setStatusBarColor(GriverLaunchParams.DEFAULT_STATUS_BAR_COLOR);
        } else if (Build.VERSION.SDK_INT >= 19) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags = 67108864 | attributes.flags;
        }
    }

    private void a() {
        this.f.setOnSettingChangeListener(new GriverOpenSettingListAdapter.OnSettingChangeListener() {
            public void onChange(int i, boolean z) {
                ((OpenSettingItem) GriverOpenSettingActivity.this.g.get(i)).enabled = z;
                String str = ((OpenSettingItem) GriverOpenSettingActivity.this.g.get(i)).scope;
                GriverOpenSettingActivity.this.b.put(str, Boolean.valueOf(z));
                ((AuthenticationProxy) RVProxy.get(AuthenticationProxy.class)).setPermissionState(GriverAccount.getUserId(), GriverOpenSettingActivity.this.d, str, (String) null, z);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                GriverOpenSettingActivity griverOpenSettingActivity = GriverOpenSettingActivity.this;
                ((GriverOpenAuthExtension) RVProxy.get(GriverOpenAuthExtension.class)).revokeOpenAuthItemClicked(griverOpenSettingActivity, griverOpenSettingActivity.d, APIContextUtils.createApiContext(GriverOpenSettingActivity.this.c), new GriverOpenAuthExtension.RevokeCallback() {
                    public void onComplete() {
                        GriverOpenSettingActivity.this.b();
                    }
                });
            }
        });
    }

    /* access modifiers changed from: private */
    public void b() {
        GriverOpenSettingListAdapter griverOpenSettingListAdapter = new GriverOpenSettingListAdapter(this, this.g);
        this.f = griverOpenSettingListAdapter;
        this.j.setAdapter(griverOpenSettingListAdapter);
        this.k.setText(getString(R.string.griver_open_setting_intro, new Object[]{this.e}));
        if (!d()) {
            this.m.setVisibility(0);
            this.h.setVisibility(8);
            this.n.setText(getString(R.string.griver_no_permission_used, new Object[]{this.e}));
            return;
        }
        this.h.setVisibility(0);
        this.m.setVisibility(8);
        e();
    }

    private void c() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(538165718, oncanceled);
            onCancelLoad.getMin(538165718, oncanceled);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_griver_open_setting);
        this.j = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.j.setItemAnimator(new dispatchMenuItemSelected());
        findItemsWithShortcutForKey finditemswithshortcutforkey = new findItemsWithShortcutForKey(this, 1);
        Drawable drawable = getResources().getDrawable(R.drawable.griver_device_settings_divider);
        if (drawable != null) {
            finditemswithshortcutforkey.length = drawable;
            this.j.addItemDecoration(finditemswithshortcutforkey);
            this.k = (TextView) findViewById(R.id.tv_griver_open_settings);
            AUTitleBar aUTitleBar = (AUTitleBar) findViewById(R.id.griver_tool_bar);
            this.l = aUTitleBar;
            aUTitleBar.setTitleText(getString(R.string.griver_open_settings));
            this.l.setRightButtonEnabled(false);
            this.m = (LinearLayout) findViewById(R.id.layout_empty);
            this.n = (TextView) findViewById(R.id.tv_empty_text);
            this.h = (LinearLayout) findViewById(R.id.layout_content);
            this.i = (RelativeLayout) findViewById(R.id.layout_user);
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    private boolean d() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-52152895, oncanceled);
            onCancelLoad.getMin(-52152895, oncanceled);
        }
        if (this.g.size() > 0 || ((GriverOpenAuthExtension) RVProxy.get(GriverOpenAuthExtension.class)).shouldShowRevokeOpenAuthItem(this.d, APIContextUtils.createApiContext(this.c))) {
            return true;
        }
        return false;
    }

    private void e() {
        if (((GriverOpenAuthExtension) RVProxy.get(GriverOpenAuthExtension.class)).shouldShowRevokeOpenAuthItem(this.d, APIContextUtils.createApiContext(this.c))) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent();
        intent.setAction("griver_setting_changes");
        intent.putExtra("data", new SerializableMap(this.b));
        sendBroadcast(intent);
    }
}
