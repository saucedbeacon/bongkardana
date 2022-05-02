package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import java.util.List;

public interface ExtensionCallback<T> extends ExtensionInvoker.InvokeCallback<T> {
    void onException(Extension extension, Throwable th);

    void onInterrupt(Extension extension);

    void onProgress(Extension extension, T t);

    void onStart(List<Extension> list);
}
