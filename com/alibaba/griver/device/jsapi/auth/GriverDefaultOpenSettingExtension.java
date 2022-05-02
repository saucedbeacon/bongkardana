package com.alibaba.griver.device.jsapi.auth;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.device.model.SerializableMap;
import com.alibaba.griver.device.proxy.GriverOpenSettingExtension;
import com.alibaba.griver.device.ui.GriverOpenSettingActivity;
import java.util.HashMap;
import java.util.Map;

public class GriverDefaultOpenSettingExtension implements GriverOpenSettingExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public SettingChangeReceiver f10424a;

    public void showOpenSettingView(Activity activity, Map<String, Boolean> map, AppModel appModel, GriverOpenSettingExtension.SettingChangeCallback settingChangeCallback) {
        if (activity != null) {
            Intent intent = new Intent();
            intent.setClass(activity, GriverOpenSettingActivity.class);
            intent.putExtra("data", new SerializableMap(map));
            intent.putExtra("appInfo", appModel);
            activity.startActivity(intent);
            this.f10424a = new SettingChangeReceiver(settingChangeCallback);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("griver_setting_changes");
            GriverEnv.getApplicationContext().registerReceiver(this.f10424a, intentFilter);
        }
    }

    class SettingChangeReceiver extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private GriverOpenSettingExtension.SettingChangeCallback f10425a;

        public SettingChangeReceiver(GriverOpenSettingExtension.SettingChangeCallback settingChangeCallback) {
            this.f10425a = settingChangeCallback;
        }

        public void onReceive(Context context, Intent intent) {
            SerializableMap serializableMap = (SerializableMap) intent.getSerializableExtra("data");
            Map hashMap = new HashMap();
            if (serializableMap != null) {
                hashMap = serializableMap.getMap();
            }
            GriverOpenSettingExtension.SettingChangeCallback settingChangeCallback = this.f10425a;
            if (settingChangeCallback != null) {
                settingChangeCallback.onSettingChange(hashMap);
            }
            GriverEnv.getApplicationContext().unregisterReceiver(GriverDefaultOpenSettingExtension.this.f10424a);
            SettingChangeReceiver unused = GriverDefaultOpenSettingExtension.this.f10424a = null;
        }
    }
}
