package com.alipay.mobile.verifyidentity.adapter;

import com.alipay.mobile.verifyidentity.adapterapi.IConfig;
import com.alipay.mobile.verifyidentity.adapterapi.log.ILog;
import com.alipay.mobile.verifyidentity.adapterapi.log.NormalLog;

public class Config implements IConfig {
    public ILog getLog() {
        return new NormalLog();
    }
}
