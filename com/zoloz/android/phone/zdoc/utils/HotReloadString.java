package com.zoloz.android.phone.zdoc.utils;

import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.ap.zoloz.hot.reload.ViewLoadService;

class HotReloadString {
    HotReloadString() {
    }

    public static String getString(String str, int i) {
        return ((ViewLoadService) BioServiceManager.getCurrentInstance().getBioService(ViewLoadService.class)).getString(str, i);
    }
}
