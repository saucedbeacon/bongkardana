package com.alibaba.ariver.kernel.api.security;

import androidx.annotation.Nullable;
import java.util.List;

public interface AccessController {

    public interface ApplyCallback {
        void onFailure(List<? extends Permission> list);

        void onSuccess();
    }

    boolean check(Accessor accessor, List<? extends Guard> list, @Nullable ApplyCallback applyCallback);

    void setAccessControlManagement(AccessControlManagement accessControlManagement);
}
