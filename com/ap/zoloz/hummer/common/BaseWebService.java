package com.ap.zoloz.hummer.common;

import java.util.HashMap;

public abstract class BaseWebService {
    public abstract void exitPage(String str);

    public abstract void exitSession();

    public abstract boolean isPageAlreadyExisted(String str);

    public abstract void openPage(HashMap<String, Object> hashMap);
}
