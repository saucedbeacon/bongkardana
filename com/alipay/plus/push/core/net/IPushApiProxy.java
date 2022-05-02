package com.alipay.plus.push.core.net;

import com.alipay.plus.push.core.ICallback;

public interface IPushApiProxy {
    void bind(String str, String str2, ICallback iCallback);

    void report(String str, ICallback iCallback);

    void unbind(String str, String str2, ICallback iCallback);
}
