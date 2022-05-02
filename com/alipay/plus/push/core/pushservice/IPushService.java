package com.alipay.plus.push.core.pushservice;

import android.content.Context;
import com.alipay.plus.push.core.ICallback;
import com.alipay.plus.push.core.PushMessageReceiver;

public interface IPushService {
    void autoReport(boolean z);

    void bind(String str, ICallback iCallback);

    void dispatchMessage(Object obj);

    String getPushToken();

    void init(Context context);

    void registerGlobalMsgReceiver(PushMessageReceiver<String> pushMessageReceiver);

    void registerMsgReceiver(String str, PushMessageReceiver pushMessageReceiver);

    void report(String str, ICallback iCallback);

    void unBind(String str, ICallback iCallback);

    void unregisterMsgReceiver(PushMessageReceiver pushMessageReceiver);
}
