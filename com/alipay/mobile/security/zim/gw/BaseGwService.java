package com.alipay.mobile.security.zim.gw;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;

public abstract class BaseGwService {
    GwListener mGwListener;
    Handler mHandler;
    HandlerThread mHandlerThread;
    Handler mMainHandler = new Handler(Looper.getMainLooper());

    public abstract ZimInitGwResponse convert(String str);

    public abstract void init(ZimInitGwRequest zimInitGwRequest);

    BaseGwService(GwListener gwListener, String str) {
        this.mHandlerThread = new HandlerThread(str);
        this.mGwListener = gwListener;
    }

    public void destroy() {
        HandlerThread handlerThread = this.mHandlerThread;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.mHandlerThread.quit();
        }
        this.mHandlerThread = null;
        this.mHandler = null;
        this.mGwListener = null;
        this.mMainHandler = null;
    }
}
