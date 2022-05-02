package com.ap.zoloz.hummer.common;

import com.alipay.mobile.security.bio.service.local.web.BioWebService;
import java.util.HashMap;

public class WebPageManager {
    private static WebPageManager sInstance;
    private BioWebService mBioWebService;

    public static WebPageManager getInstance() {
        if (sInstance == null) {
            synchronized (WebPageManager.class) {
                if (sInstance == null) {
                    sInstance = new WebPageManager();
                }
            }
        }
        return sInstance;
    }

    public void init(BioWebService bioWebService) {
        this.mBioWebService = bioWebService;
    }

    public void openUrl(HashMap<String, Object> hashMap) {
        BioWebService bioWebService = this.mBioWebService;
        if (bioWebService != null) {
            bioWebService.openPage(hashMap);
        }
    }

    public boolean isPageAlreadyExit(String str) {
        BioWebService bioWebService = this.mBioWebService;
        return bioWebService != null && bioWebService.isPageAlreadyExisted(str);
    }

    public void exitPage(String str) {
        BioWebService bioWebService = this.mBioWebService;
        if (bioWebService != null) {
            bioWebService.exitPage(str);
        }
    }

    public void exitSession() {
        BioWebService bioWebService = this.mBioWebService;
        if (bioWebService != null) {
            bioWebService.exitSession();
        }
    }

    public void release() {
        sInstance = null;
        BioWebService bioWebService = this.mBioWebService;
        if (bioWebService != null) {
            bioWebService.destroy();
        }
    }
}
