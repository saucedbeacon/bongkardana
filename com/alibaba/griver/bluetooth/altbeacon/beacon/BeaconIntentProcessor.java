package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.content.Context;
import android.content.Intent;

public class BeaconIntentProcessor {
    public void handleIntent(Context context, Intent intent) {
        new IntentHandler().convertIntentsToCallbacks(context, intent);
    }
}
