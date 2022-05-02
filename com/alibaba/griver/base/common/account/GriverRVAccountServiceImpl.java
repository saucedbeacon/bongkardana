package com.alibaba.griver.base.common.account;

import com.alibaba.ariver.kernel.common.service.RVAccountService;

public class GriverRVAccountServiceImpl implements RVAccountService {
    public String getNick() {
        return null;
    }

    public String getUserAvatar() {
        return null;
    }

    public boolean isLogin() {
        return false;
    }

    public String getUserId() {
        return GriverAccount.getUserId();
    }
}
