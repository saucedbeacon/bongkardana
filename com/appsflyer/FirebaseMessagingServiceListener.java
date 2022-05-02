package com.appsflyer;

import com.appsflyer.internal.d;
import com.appsflyer.internal.r;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            d.b.e r2 = d.b.e.m1268(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            d.b.e eVar = new d.b.e(currentTimeMillis, str);
            if (r2.m1270(eVar.f8739, eVar.f8738)) {
                r.AnonymousClass3.m1282(getApplicationContext(), eVar.f8738);
            }
        }
    }
}
