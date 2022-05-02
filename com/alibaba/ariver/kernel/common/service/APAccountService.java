package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface APAccountService extends Proxiable {
    String getNick();

    String getUserAvatar();

    String getUserId();

    boolean isLogin();
}
