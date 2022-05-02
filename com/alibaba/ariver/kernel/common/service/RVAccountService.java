package com.alibaba.ariver.kernel.common.service;

import com.alibaba.ariver.kernel.common.Proxiable;

public interface RVAccountService extends Proxiable {
    String getNick();

    String getUserAvatar();

    String getUserId();

    boolean isLogin();
}
