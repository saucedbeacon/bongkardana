package com.alibaba.griver.base.common.account;

import com.alibaba.griver.api.common.account.GriverAccountExtension;

public class DefaultAccoutExtension implements GriverAccountExtension {
    public String getUserId() {
        return "default-user-id";
    }
}
