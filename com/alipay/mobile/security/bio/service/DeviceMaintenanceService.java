package com.alipay.mobile.security.bio.service;

import android.content.Context;
import android.view.View;

public abstract class DeviceMaintenanceService extends BioService {
    public abstract void registerQREvent(Context context, View view);
}
