package com.alibaba.griver.base.api;

import android.os.Handler;
import com.alibaba.griver.base.nebula.APWebMessage;

public abstract class APWebMessagePort {

    public static abstract class APWebMessageCallback {
        public void onMessage(APWebMessagePort aPWebMessagePort, APWebMessage aPWebMessage) {
        }
    }

    public abstract void close();

    public abstract void postMessage(APWebMessage aPWebMessage);

    public abstract void setWebMessageCallback(APWebMessageCallback aPWebMessageCallback);

    public abstract void setWebMessageCallback(APWebMessageCallback aPWebMessageCallback, Handler handler);
}
