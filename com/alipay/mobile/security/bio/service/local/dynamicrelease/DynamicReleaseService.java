package com.alipay.mobile.security.bio.service.local.dynamicrelease;

import android.content.Context;
import com.alipay.mobile.security.bio.service.local.LocalService;

public abstract class DynamicReleaseService extends LocalService {
    public void monitorCoverage(String str, String str2) {
    }

    public abstract void trigDynamicRelease(Context context, String str);
}
