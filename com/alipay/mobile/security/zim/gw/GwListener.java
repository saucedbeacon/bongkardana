package com.alipay.mobile.security.zim.gw;

import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;

public interface GwListener {
    void onInit(ZimInitGwResponse zimInitGwResponse);
}
