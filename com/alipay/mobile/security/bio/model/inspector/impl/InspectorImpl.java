package com.alipay.mobile.security.bio.model.inspector.impl;

import android.content.Context;
import com.alipay.mobile.security.bio.exception.BioObjectNotInitialException;
import com.alipay.mobile.security.bio.model.inspector.Inspector;

public class InspectorImpl implements Inspector {
    Context mContext;

    public int checkEnvironment() {
        return 0;
    }

    public InspectorImpl(Context context) {
        if (context == null) {
            this.mContext = context;
            return;
        }
        throw new BioObjectNotInitialException("Context");
    }
}
