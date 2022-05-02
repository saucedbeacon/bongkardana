package com.alibaba.griver.device.jsapi.nfc.service;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.griver.device.jsapi.nfc.TinyAppConstants;
import com.alipay.mobile.verifyidentity.uitools.POPUIType;
import java.util.ArrayList;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

@TargetApi(19)
public class TinyAppHostApduService extends HostApduService {

    /* renamed from: a  reason: collision with root package name */
    private String f9079a = null;
    private ResultReceiver b;

    public void onCreate() {
        super.onCreate();
        RVLogger.d("TinyApp_HostApduService", "service onCreate");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(2083547854, oncanceled);
            onCancelLoad.getMin(2083547854, oncanceled);
        }
        RVLogger.d("TinyApp_HostApduService", "service onStartCommand");
        if (intent == null) {
            return super.onStartCommand((Intent) null, i, i2);
        }
        ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra(TinyAppConstants.KEY_RESULT_RECEIVER);
        this.b = resultReceiver;
        if (resultReceiver != null) {
            AnonymousClass1 r2 = new ResultReceiver(new Handler(Looper.getMainLooper())) {
                /* access modifiers changed from: protected */
                public void onReceiveResult(int i, Bundle bundle) {
                    RVLogger.d("TinyApp_HostApduService", "onReceive apduCommand");
                    try {
                        TinyAppHostApduService.this.sendResponseApdu(bundle.getByteArray(TinyAppConstants.KEY_APDU_COMMAND));
                    } catch (Exception e) {
                        RVLogger.d("TinyApp_HostApduService", "onReceive has exception".concat(String.valueOf(e)));
                    }
                }
            };
            Bundle bundle = new Bundle();
            bundle.putParcelable(TinyAppConstants.KEY_RESULT_RECEIVER, r2);
            this.b.send(10019, bundle);
            RVLogger.d("TinyApp_HostApduService", "service onStartCommand, get receiveReceiver success");
        }
        this.f9079a = intent.getStringExtra(TinyAppConstants.KEY_APP_ID);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra(TinyAppConstants.KEY_AID_LIST);
        int i3 = 1500;
        int intExtra = intent.getIntExtra("key_time_limit", 1500);
        if (intExtra >= 1500) {
            i3 = intExtra;
        }
        if (i3 > 60000) {
            i3 = 60000;
        }
        StringBuilder sb = new StringBuilder("aid_list = ");
        sb.append(JSON.toJSONString(stringArrayListExtra));
        sb.append(" appId = ");
        sb.append(this.f9079a);
        sb.append(" timeLimit = ");
        sb.append(i3);
        RVLogger.d("TinyApp_HostApduService", sb.toString());
        return super.onStartCommand(intent, i, i2);
    }

    public void onDestroy() {
        super.onDestroy();
        RVLogger.d("TinyApp_HostApduService", "service onDestroy");
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver != null) {
            resultReceiver.send(10020, (Bundle) null);
        }
    }

    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        if (this.b == null) {
            RVLogger.e("TinyApp_HostApduService", "processCommandApdu... resultReceiver is null");
            return null;
        } else if (bArr == null) {
            RVLogger.e("TinyApp_HostApduService", "processCommandApdu... commandApdu is null");
            this.b.send(13005, bundle);
            return null;
        } else {
            RVLogger.e("TinyApp_HostApduService", "processCommandApdu...");
            Bundle bundle2 = new Bundle();
            bundle2.putByteArray(TinyAppConstants.KEY_APDU_COMMAND, bArr);
            this.b.send(10000, bundle2);
            return null;
        }
    }

    public void onDeactivated(int i) {
        int length;
        int min;
        int length2;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -2028314950 == (max = dispatchOnCancelled.getMax(applicationContext, -2028314950)))) {
            onCanceled oncanceled = new onCanceled(-2028314950, max, 512);
            onCancelLoad.setMax(-2028314950, oncanceled);
            onCancelLoad.getMin(-2028314950, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || i == (length2 = dispatchOnCancelled.length(applicationContext2, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, length2, 4);
            onCancelLoad.setMax(-2028314950, oncanceled2);
            onCancelLoad.getMin(-2028314950, oncanceled2);
        }
        int max2 = dispatchOnCancelled.getMax(0);
        if (max2 != 0) {
            onCanceled oncanceled3 = new onCanceled(0, max2, 16);
            onCancelLoad.setMax(-2028314950, oncanceled3);
            onCancelLoad.getMin(-2028314950, oncanceled3);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-2028314950, oncanceled4);
            onCancelLoad.getMin(-2028314950, oncanceled4);
        }
        RVLogger.debug("TinyApp_HostApduService", "onDeactivated, reason = ".concat(i == 0 ? "DEACTIVATION_LINK_LOSS" : i == 1 ? "DEACTIVATION_DESELECTED" : "DEACTIVATION_UNKNOWN"));
        if (this.b != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TinyAppConstants.KEY_APP_ID, this.f9079a);
            bundle.putInt(TinyAppConstants.KEY_EVENT_TYPE, 41);
            bundle.putInt(TinyAppConstants.KEY_DEACTIVATED_REASON, i);
            this.b.send(POPUIType.TOAST_NET_ERROR, bundle);
        }
    }
}
