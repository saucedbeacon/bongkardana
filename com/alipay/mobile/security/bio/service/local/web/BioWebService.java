package com.alipay.mobile.security.bio.service.local.web;

import com.alipay.mobile.security.bio.service.local.LocalService;
import java.util.HashMap;

public abstract class BioWebService extends LocalService {
    public abstract void exitPage(String str);

    public abstract void exitSession();

    public abstract boolean isPageAlreadyExisted(String str);

    public abstract void openPage(HashMap<String, Object> hashMap);
}
