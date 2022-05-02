package com.alipay.plus.android.push.fcm;

import com.alipay.plus.push.core.ICallback;
import com.alipay.plus.push.core.PushServiceInstance;
import com.alipay.plus.push.core.pushservice.IPushService;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class CommonFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String TAG = CommonFirebaseInstanceIdService.class.getSimpleName();
    private IPushService iPushService;

    public void onTokenRefresh() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-364105118, oncanceled);
            onCancelLoad.getMin(-364105118, oncanceled);
        }
        String token = FirebaseInstanceId.getInstance().getToken();
        IPushService pushService = PushServiceInstance.getPushService();
        this.iPushService = pushService;
        pushService.report(token, (ICallback) null);
    }
}
