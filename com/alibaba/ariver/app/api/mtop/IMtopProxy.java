package com.alibaba.ariver.app.api.mtop;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.DefaultImpl;
import com.alibaba.ariver.kernel.common.Proxiable;

@DefaultImpl("com.alibaba.ariver.mtop.SendMtopProxyImpl")
public interface IMtopProxy extends Proxiable {

    public interface Callback {
        void onResult(SendMtopResponse sendMtopResponse);
    }

    void requestAsync(Page page, SendMtopParams sendMtopParams, Callback callback);

    void requestInnerAsync(SendMtopParams sendMtopParams, Callback callback);

    SendMtopResponse requestInnerSync(SendMtopParams sendMtopParams);

    SendMtopResponse requestSync(Page page, SendMtopParams sendMtopParams);
}
