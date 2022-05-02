package com.alibaba.ariver.kernel.api.extension;

import java.util.List;

public interface Action {

    public interface Complete<T> extends Action {
        void onComplete(T t);
    }

    public interface Exception extends Action {
        void onException(Extension extension, Throwable th);
    }

    public interface Interrupt extends Action {
        void onInterrupt(Extension extension);
    }

    public interface Progress<T> extends Action {
        void onProgress(Extension extension, T t);
    }

    public interface Start extends Action {
        void onStart(List<Extension> list);
    }
}
